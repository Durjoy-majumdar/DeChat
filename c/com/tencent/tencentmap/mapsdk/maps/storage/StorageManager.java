package com.tencent.tencentmap.mapsdk.maps.storage;

import android.content.Context;
import android.os.StatFs;
import android.text.TextUtils;
import com.tencent.mapsdk.internal.C113884kf;
import com.tencent.mapsdk.internal.C40002he;
import java.io.File;

public class StorageManager {
    private static final String ROOT_DIR = "/tencentmapsdk/";
    private static StorageManager mInstance;
    private String mAppRootDir;
    private Context mContext;
    private String mCustomCacheRootPath;

    private StorageManager(Context context, String str) {
        if (context != null) {
            this.mContext = context.getApplicationContext();
            this.mCustomCacheRootPath = str;
            updatePublicPath();
            return;
        }
        throw new Error("context can not be null");
    }

    public static void clearMapCache(Context context, String str) {
        C113884kf.m157508f(getInstance(context, str).getCacheDir());
    }

    private static long getAvailableStorageSize(String str) {
        try {
            StatFs statFs = new StatFs(str);
            return ((statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong()) / 1024) / 1024;
        } catch (Exception unused) {
            return 0;
        }
    }

    private static String getExternalStoragePath(Context context) {
        File externalFilesDir = context.getExternalFilesDir((String) null);
        return externalFilesDir != null ? externalFilesDir.getAbsolutePath() : context.getFilesDir().getPath();
    }

    public static StorageManager getInstance(Context context, String str) {
        if (mInstance == null) {
            mInstance = new StorageManager(context, str);
        }
        return mInstance;
    }

    private String getStorageRootPath() {
        if (!TextUtils.isEmpty(this.mCustomCacheRootPath)) {
            return this.mCustomCacheRootPath;
        }
        Context context = this.mContext;
        String externalStoragePath = getExternalStoragePath(context);
        if (getAvailableStorageSize(externalStoragePath) >= 5) {
            return externalStoragePath;
        }
        String path = context.getFilesDir().getPath();
        return getAvailableStorageSize(path) < 5 ? getExternalStoragePath(context) : path;
    }

    private void updatePublicPath() {
        String storageRootPath = getStorageRootPath();
        String a = C113884kf.m157486a(this.mContext);
        if (C40002he.m42805a(a)) {
            this.mAppRootDir = storageRootPath + ROOT_DIR;
            return;
        }
        this.mAppRootDir = storageRootPath + ROOT_DIR + a;
    }

    public File getCacheDir() {
        return new File(this.mAppRootDir);
    }
}
