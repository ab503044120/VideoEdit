
add_library(RenderEngine SHARED
        chain/Node.cpp
        chain/RenderChain.cpp
        render/GLSurface.cpp
        render/GLContext.cpp
        effect/Effect.cpp
        utils/FileUtils.cpp
        log/Log.cpp
        RenderEngine.cpp
        RenderEngineJNI.cpp

        )
target_include_directories(RenderEngine PUBLIC ${CMAKE_CURRENT_SOURCE_DIR})

target_link_libraries(RenderEngine PUBLIC EGL GLESv3 android -llog)