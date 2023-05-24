# For more information about using CMake with Android Studio, read the
# documentation: https://d.android.com/studio/projects/add-native-code.html

# Sets the minimum version of CMake required to build the native library.

cmake_minimum_required(VERSION 3.22.1)

# Declares and names the project.

project("videoedit")
# 3.22.1不支持 find_package(Mlt7 REQUIRED GLOBAL) 3.24才支持
include(${CMAKE_CURRENT_SOURCE_DIR}/ThirdPart/CMakeLists.txt)
# Creates and names a library, sets it as either STATIC
# or SHARED, and provides the relative paths to its source code.
# You can define multiple libraries, and CMake builds them for you.
# Gradle automatically packages shared libraries with your APK.
add_subdirectory(utils)

add_library( # Sets the name of the library.
        videoedit

        # Sets the library as a shared library.
        SHARED

        # Provides a relative path to your source file(s).
        native-lib.cpp
        mltJAVA_wrap.cpp
        )

message(WARNING hahha${Mlt7_FOUND})

target_link_libraries( # Specifies the target library.
        videoedit
        PUBLIC
        ${FFMPEG_LIBRARY}
        Mlt7::mlt
        Mlt7::mlt++
            utils
        )