add_library(
        videoedit
        SHARED
        VideoEdit.cpp
)
target_link_libraries(videoedit
        PUBLIC

        ${FFMPEG_LIBRARY}
        Mlt7::mlt
        Mlt7::mlt++
        )