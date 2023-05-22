#cmake_minimum_required(VERSION 3.22.1)

set(FFMPEG_LIBRARY avcodec avdevice avfilter avformat avutil swresample swscale)

foreach (component ${FFMPEG_LIBRARY})
    add_library(${component}
            SHARED IMPORTED GLOBAL)
    set_target_properties(${component} PROPERTIES IMPORTED_LOCATION
            ${CMAKE_CURRENT_LIST_DIR}/ffmpeg/${ANDROID_ABI}/lib/lib${component}.so)
    target_include_directories(${component} INTERFACE ${CMAKE_CURRENT_LIST_DIR}/ffmpeg/${ANDROID_ABI}/include)
endforeach ()

set(Mlt7_DIR ${CMAKE_CURRENT_LIST_DIR}/mlt/${ANDROID_ABI}/lib/cmake/Mlt7)
find_package(Mlt7 REQUIRED)#GLOBAL
