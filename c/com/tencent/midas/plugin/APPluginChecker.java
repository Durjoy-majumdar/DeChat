package com.tencent.midas.plugin;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.midas.comm.APLog;
import java.io.File;
import java.util.HashMap;

public class APPluginChecker {
    private static final String TAG = "APPluginChecker";

    private static boolean isAllPluginValid(File file) {
        if (file == null) {
            APLog.m161212e(TAG, "Cannot check all plugin valid, pluginPath is null!");
            return false;
        }
        APLog.m161210d(TAG, "Check all plugin valid, parameter ok!");
        try {
            File file2 = new File(file.getCanonicalPath() + File.separator + APPluginConfig.SIGN_FILE_NAME);
            if (!file2.exists()) {
                APLog.m161212e(TAG, "Check all plugin valid, sign file is not found");
                return false;
            }
            APLog.m161210d(TAG, "Check all plugin valid, sign file exist!");
            HashMap hashMap = new HashMap();
            APPluginUtils.readSingInfo(hashMap, file2);
            File[] listFiles = file.listFiles();
            int i = 0;
            for (File file3 : listFiles) {
                String name = file3.getName();
                APLog.m161210d(TAG, "Check all plugin valid, current check file = " + name);
                if (!name.startsWith("MidasSign")) {
                    if (name.startsWith("Midas")) {
                        String str = (String) hashMap.get(name.split("\\_")[0]);
                        if (!TextUtils.isEmpty(str)) {
                            if (!APPluginUtils.checkFileMD5(file3.getCanonicalPath(), str)) {
                                APLog.m161210d(TAG, "Check all plugin valid, current check file = " + name + ", MD5 not OK");
                                file3.delete();
                            } else {
                                i++;
                                APLog.m161210d(TAG, "Check all plugin valid, current check file = " + name + ", MD5 OK");
                            }
                        }
                    }
                }
                APLog.m161210d(TAG, "Check all plugin valid, ignore = " + name);
            }
            if (i != hashMap.size() || i < 2) {
                APLog.m161212e(TAG, "Check all plugin valid, all valid file num = " + i + ", but sign file size = " + hashMap.size() + ", check fail!");
                return false;
            }
            APLog.m161210d(TAG, "Check all plugin valid, all valid file num = " + i + ", sign file size = " + hashMap.size() + ", check success!");
            return true;
        } catch (Exception unused) {
        }
    }

    public static boolean isPluginValid(Context context) {
        APLog.m161210d(TAG, "Calling into isPluginValid " + Thread.currentThread().getStackTrace()[3].toString());
        return isAllPluginValid(APPluginConfig.getPluginPath(context));
    }

    public static boolean isPluginValid(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            APLog.m161212e(TAG, "Cannot check plugin valid, pluginPath is null!");
            return false;
        }
        APLog.m161210d(TAG, "Check plugin valid, parameter ok!");
        try {
            File file = new File(str.substring(0, str.lastIndexOf("/")));
            File file2 = new File(file.getCanonicalPath() + File.separator + APPluginConfig.SIGN_FILE_NAME);
            if (!file2.exists()) {
                APLog.m161212e(TAG, "Check plugin valid, sign file is not found");
                return false;
            }
            APLog.m161210d(TAG, "Check plugin valid, sign file exist!");
            HashMap hashMap = new HashMap();
            APPluginUtils.readSingInfo(hashMap, file2);
            String name = new File(str).getName();
            APLog.m161210d(TAG, "Check plugin valid, current check file = " + name);
            if (str2.equals((String) hashMap.get(name.split("\\_")[0]))) {
                APLog.m161210d(TAG, "Check plugin valid, current check file = " + name + ", MD5 OK");
                return true;
            }
            APLog.m161210d(TAG, "Check plugin valid, current check file = " + name + ", MD5 not OK");
            return false;
        } catch (Exception unused) {
        }
    }
}
