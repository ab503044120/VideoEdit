#----------------------------------------------------------------
# Generated CMake target import file for configuration "DEBUG".
#----------------------------------------------------------------

# Commands may need to know the format version.
set(CMAKE_IMPORT_FILE_VERSION 1)

# Import target "Mlt7::org.huihui.videoedit.mlt.mlt" for configuration "DEBUG"
set_property(TARGET Mlt7::mlt APPEND PROPERTY IMPORTED_CONFIGURATIONS DEBUG)
set_target_properties(Mlt7::mlt PROPERTIES
  IMPORTED_LOCATION_DEBUG "${_IMPORT_PREFIX}/lib/libmlt-7.so"
  IMPORTED_SONAME_DEBUG "libmlt-7.so"
  )

list(APPEND _cmake_import_check_targets Mlt7::mlt )
list(APPEND _cmake_import_check_files_for_Mlt7::mlt "${_IMPORT_PREFIX}/lib/libmlt-7.so" )

# Import target "Mlt7::org.huihui.videoedit.mlt.mlt++" for configuration "DEBUG"
set_property(TARGET Mlt7::mlt++ APPEND PROPERTY IMPORTED_CONFIGURATIONS DEBUG)
set_target_properties(Mlt7::mlt++ PROPERTIES
  IMPORTED_LOCATION_DEBUG "${_IMPORT_PREFIX}/lib/libmlt++-7.so"
  IMPORTED_SONAME_DEBUG "libmlt++-7.so"
  )

list(APPEND _cmake_import_check_targets Mlt7::mlt++ )
list(APPEND _cmake_import_check_files_for_Mlt7::mlt++ "${_IMPORT_PREFIX}/lib/libmlt++-7.so" )

# Commands beyond this point should not need to know the version.
set(CMAKE_IMPORT_FILE_VERSION)
