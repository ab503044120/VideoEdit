package org.huihui.videoedit

import android.os.Build
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.huihui.videoedit.databinding.ActivityMainBinding
import org.huihui.videoedit.mlt.mltJNI.MLT_LOG_VERBOSE

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        // Example of a call to a native method
        val tv = binding.sampleText

        val fileList = assets.list("")?.filter { it.equals("lib") || it.equals("share") }
        fileList?.forEach {
            AssetUtils.copyAssetFolder(this, it, filesDir.absolutePath + "/" + it)
        }
        VideoEditJNI.nInitLog(MLT_LOG_VERBOSE);
        VideoEditJNI.init(
            filesDir.absolutePath + "/lib/mlt-7/" + Build.CPU_ABI,
            filesDir.absolutePath + "/share/mlt-7"
        );
    }

}