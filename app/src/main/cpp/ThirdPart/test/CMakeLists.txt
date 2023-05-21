cmake_minimum_required(VERSION 3.26.0)
project(test1 VERSION 0.1.0)

include(CTest)
enable_testing()

find_package(PkgConfig REQUIRED)
pkg_check_modules(ffmpeg IMPORTED_TARGET libavformat libswscale libavutil)

get_target_property(VAR PkgConfig::ffmpeg INTERFACE_INCLUDE_DIRECTORIES)
message(STATUS "INTERFACE_INCLUDE_DIRECTORIES: ${VAR}")
get_target_property(VAR PkgConfig::ffmpeg INTERFACE_LINK_LIBRARIES)
message(STATUS "INTERFACE_LINK_LIBRARIES: ${VAR}")
get_target_property(VAR PkgConfig::ffmpeg INTERFACE_LINK_DIRECTORIES)
message(STATUS "INTERFACE_LINK_DIRECTORIES: ${VAR}")



add_library(test1 SHARED test.cpp)
target_link_libraries(test1 PUBLIC PkgConfig::ffmpeg )#-L${ffmpeg_LIBRARY_DIRS}
set(CPACK_PROJECT_NAME ${PROJECT_NAME})
set(CPACK_PROJECT_VERSION ${PROJECT_VERSION})
include(CPack)
