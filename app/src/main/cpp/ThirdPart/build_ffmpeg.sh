#!/bin/bash
set -o errexit
# 读取输入架构
p1=$1
ndk=~/Android/ndk_r21

toolchains=$ndk/toolchains/llvm/prebuilt/linux-x86_64
api=21
arch=
host=
abi=
sysroot=$toolchains/sysroot
libdir=$toolchains/sysroot/usr/lib
includedir=$toolchains/sysroot/usr/lib/inlude
outputDir=$PWD/prebuild/ffmpeg
echo $outputDir
setupToolchainsVariable(){
  # cpu架构
   case $p1 in
        armv7a)
        arch=armv7a
        host=arm-linux-androideabi
        abi=armeabi-v7a
        ;;
        arm64)
        if [ $api -lt 21 ]
        then
            api=21
        fi
        arch=aarch64
        host=${arch}-linux-android
        abi=arm64-v8a
        ;;
        x86)
        arch=i686
        host=${arch}-linux-android
        abi=x86
        ;;
        x86-64)
        if [ $api -lt 21 ]
        then
            api=21
        fi
        arch=x86_64
        host=${arch}-linux-android
        abi=x86-64
        ;;
        *)
        echo "only allow armv7a arm64 x86 x86-64"
        exit 0
        ;;
    esac
    libDir=$libdir/$host/$api
    outputDir=$outputDir/$abi
    echo $api
    echo $arch
    echo $host
    echo $abi
}
buildFFmpeg(){
    cd FFmpeg
    CFLAG="-D__ANDROID_API__=$api -g -fPIC -DANDROID -I$includedir -I$includedir/$host"
    LDFLAGS="-L=$libDir -L$libDir/$host"
    ./configure \
    --prefix="$outputDir" \
    --cc="$toolchains/bin/clang --target=$host$api" \
	--ld="$toolchains/bin/clang --target=$host$api" \
	--as="$toolchains/bin/clang --target=$host$api" \
	--ar=$toolchains/bin/llvm-ar \
	--nm=$toolchains/bin/llvm-nm \
	--ranlib=$toolchains/bin/llvm-ranlib \
	--strip=$toolchains/bin/llvm-strip \
    --target-os=android \
    --arch=$arch \
	--enable-shared \
	--disable-static \
    --enable-debug --disable-stripping --disable-optimizations \
    --enable-cross-compile \
    --disable-doc \
    --disable-runtime-cpudetect \
    --disable-ffmpeg \
    --disable-ffplay \
    --disable-ffprobe \
    --disable-devices \
    --extra-cflags="$CFLAG" \
    --extra-ldflags="$LDFLAGS" \
	--disable-vulkan \
	--pkg-config=/usr/pkg-config
#   --enable-static \
#    --disable-asm \
#	--disable-x86asm 

    make clean
    make -j8
    make install
    cd ..
}

#compile_shared(){
#    $toolchains/bin/$host-ld  --whole-archive -L$libDir -L$toolchains/lib/gcc/$host/4.9.x -L$outputDir/lib \
#                           -shared -soname libffmpeg.so --no-undefined -nostdlib -z noexecstack \
#                           -Bdynamic -lc -lm -lz -ldl -llog -lgcc\
#                           -Bstatic \
#                           -lavcodec \
#                           -lswresample \
#                           -lavformat \
#                           -lavutil \
#                           -lswscale \
#                           -lavdevice \
#                           -lavfilter \
#                           -o $outputDir/lib/libffmpeg.so
#
#      echo libffmpeg.so compile complete                     
#}

setupToolchainsVariable

buildFFmpeg

#compile_shared

exit 1