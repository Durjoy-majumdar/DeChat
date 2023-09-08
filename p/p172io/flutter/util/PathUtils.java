package p172io.flutter.util;

import android.content.Context;
import android.os.Build;
import com.tencent.xweb.xwalk.plugin.XWalkPlugin;
import java.io.File;

/* renamed from: io.flutter.util.PathUtils */
public final class PathUtils {
    public static String getCacheDirectory(Context context) {
        File codeCacheDir = context.getCodeCacheDir();
        if (codeCacheDir == null) {
            codeCacheDir = context.getCacheDir();
        }
        if (codeCacheDir == null) {
            codeCacheDir = new File(getDataDirPath(context), XWalkPlugin.PRIVATE_CACHE_DIR_NAME);
        }
        return codeCacheDir.getPath();
    }

    private static String getDataDirPath(Context context) {
        return Build.VERSION.SDK_INT >= 24 ? context.getDataDir().getPath() : context.getApplicationInfo().dataDir;
    }

    public static String getDataDirectory(Context context) {
        File dir = context.getDir("flutter", 0);
        if (dir == null) {
            dir = new File(getDataDirPath(context), "app_flutter");
        }
        return dir.getPath();
    }

    public static String getFilesDir(Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir == null) {
            filesDir = new File(getDataDirPath(context), "files");
        }
        return filesDir.getPath();
    }
}
