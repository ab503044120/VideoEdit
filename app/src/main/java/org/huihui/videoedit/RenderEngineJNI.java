package org.huihui.videoedit;

import android.view.Surface;

/*
 * @Description:
 * @version 1.0
 * @author huihui
 * @date 2023/10/3 0:13
 */
public class RenderEngineJNI {
    static native void start();

    static native void stop();

    static native void setSurface(Surface surface);

    static native void updateSurfaceSize(int width, int height);
}
