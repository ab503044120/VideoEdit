package org.huihui.videoedit;

import org.huihui.videoedit.mlt.Repository;
import org.huihui.videoedit.mlt.mltJNI;

/*
 * @Description:
 * @version 1.0
 * @author 陈松辉
 * @date 2023/5/25 23:43
 */
public class VideoEditJNI {

    private static final String TAG = "VideoEditJNI";
    private static Repository sInit = null;

    static {
        System.loadLibrary("mlt-7");
        System.loadLibrary("mlt++-7");
        System.loadLibrary("videoeditJNI");
    }

    public static void init(String pluginPath, String metaPath) {
        nInit(pluginPath, metaPath);
    }

    public static native void nInitLog(@mltJNI.LogLevel int logLevel);

    public static native void nInit(String PluginPath, String metaPath);

    public static native void nRelease(String path);
}
