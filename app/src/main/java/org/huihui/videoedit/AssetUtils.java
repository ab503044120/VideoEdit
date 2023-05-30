package org.huihui.videoedit;

import android.content.Context;
import android.content.res.AssetManager;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class AssetUtils {

    public static void copyAssetFolder(Context context, String sourceFolder, String destinationFolder) throws IOException {
        AssetManager assetManager = context.getAssets();
        String[] files = assetManager.list(sourceFolder);

        if (files == null || files.length == 0) {
            // 如果要拷贝的文件夹为空，则在目标文件夹中创建一个空的同名文件夹
            new File(destinationFolder, sourceFolder).mkdirs();
            return;
        }

        // 如果要拷贝的文件夹不为空，则依次递归拷贝每个子文件或子文件夹
        for (String file : files) {
            String sourcePath = sourceFolder + File.separator + file;
            String destinationPath = destinationFolder + File.separator + file;

            if (isAssetDirectory(assetManager, sourcePath)) {
                // 如果是子文件夹，则递归拷贝该文件夹
                new File(destinationPath).mkdirs();
                copyAssetFolder(context, sourcePath, destinationPath);
            } else {
                // 如果是子文件，则拷贝该文件
                copyAssetFile(context, sourcePath, destinationPath);
            }
        }
    }

    private static void copyAssetFile(Context context, String sourcePath, String destinationPath) throws IOException {
        InputStream inputStream = context.getAssets().open(sourcePath);
        FileOutputStream outputStream = new FileOutputStream(destinationPath);
        byte[] buffer = new byte[1024];
        int length;
        while ((length = inputStream.read(buffer)) > 0) {
            outputStream.write(buffer, 0, length);
        }
        outputStream.flush();
        outputStream.close();
        inputStream.close();
    }

    public static boolean isAssetDirectory(AssetManager assetManager, String path) {
        try {
            // 试图打开这个路径，如果这是一个文件夹则会抛出 IOException
            InputStream inputStream = assetManager.open(path);
            inputStream.close();
            return false; // 这是一个文件
        } catch (IOException e) {
            return true; // 这是一个文件夹
        }
    }
}