#!/bin/bash
set -o errexit
ndk=~/Android-env/android_sdk/ndk/23.1.7779620
pwd=$PWD
prefix=$pwd/prebuild/mlt
abi=arm64-v8a
#export PKG_CONFIG_PATH=$pwd/prebuild/ffmpeg/arm64-v8a/lib/pkgconfig
export PKG_CONFIG_LIBDIR=$pwd/prebuild/ffmpeg/arm64-v8a/lib/pkgconfig
echo $PKG_CONFIG_LIBDIR
rm -rf $prefix/$abi
rm -rf $prefix/share

cd mlt

# 读取输入架构
p1=$1
api=21
rm -rf build
cmake -DANDROID_ABI=arm64-v8a \
  -DCMAKE_TOOLCHAIN_FILE=$ndk/build/cmake/android.toolchain.cmake \
  -DANDROID_PLATFORM=android-30 \
  -DCMAKE_BUILD_TYPE=DEBUG \
  -DANDROID=1 \
  -D__GLIBC__=1 \
  -DHAVE_LOCALE_H=ON \
  -DCMAKE_INSTALL_PREFIX=$prefix \
  -DCMAKE_INSTALL_LIBDIR=$abi/lib \
  -DCMAKE_INSTALL_BINDIR=$abi/bin \
  -DCMAKE_INSTALL_INCLUDEDIR=$abi/include \
  -DCMAKE_INSTALL_DATADIR=share \
  -DGPL=OFF \
  -DGPL3=OFF \
  -DBUILD_TESTING=OFF \
  -DBUILD_DOCS=OFF \
  -DBUILD_TESTS_WITH_QT6=OFF \
  -DMOD_AVFORMAT=ON \
  -DMOD_DECKLINK=OFF \
  -DMOD_FREI0R=OFF \
  -DMOD_GDK=OFF \
  -DMOD_GLAXNIMATE=OFF \
  -DMOD_GLAXNIMATE_QT6=OFF \
  -DMOD_JACKRACK=OFF \
  -DMOD_KDENLIVE=OFF \
  -DMOD_NDI=OFF \
  -DMOD_NORMALIZE=OFF \
  -DMOD_OLDFILM=OFF \
  -DMOD_OPENCV=OFF \
  -DMOD_MOVIT=OFF \
  -DMOD_PLUS=ON \
  -DMOD_PLUSGPL=OFF \
  -DMOD_QT=OFF \
  -DMOD_QT6=OFF \
  -DMOD_RESAMPLE=OFF \
  -DMOD_RTAUDIO=OFF \
  -DMOD_RUBBERBAND=OFF \
  -DMOD_SDL1=OFF \
  -DMOD_SDL2=OFF \
  -DMOD_SOX=OFF \
  -DMOD_VIDSTAB=OFF \
  -DMOD_VORBIS=OFF \
  -DMOD_XINE=OFF \
  -DMOD_XML=OFF \
  -DSWIG_CSHARP=OFF \
  -DSWIG_JAVA=ON \
  -DSWIG_LUA=OFF \
  -DSWIG_NODEJS=OFF \
  -DSWIG_PERL=OFF \
  -DSWIG_PHP=OFF \
  -DSWIG_PYTHON=OFF \
  -DSWIG_RUBY=OFF \
  -DSWIG_TCL=OFF \
  -GNinja \
  -B build
cd build
cmake --build .
cmake --install .
assetsDir=${pwd}/../../assets
rm -rf $assetsDir/share
mkdir -p $assetsDir/share

rm -rf $assetsDir/lib/mlt-7/$abi
mkdir -p $assetsDir/lib/mlt-7/$abi

cp -r ${prefix}/$abi/lib/mlt-7/* $assetsDir/lib/mlt-7/$abi
cp -r ${prefix}/share/mlt-7 $assetsDir/share/
exit 1
