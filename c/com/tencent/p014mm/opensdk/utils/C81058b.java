package com.tencent.p014mm.opensdk.utils;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.tencent.mm.opensdk.utils.b */
public final class C81058b {

    /* renamed from: a */
    public static Context f238079a;

    /* renamed from: b */
    public static ThreadPoolExecutor f238080b = new ThreadPoolExecutor(5, 9, 1, TimeUnit.SECONDS, new LinkedBlockingDeque());

    /* renamed from: a */
    public static int m99048a(ContentResolver contentResolver, Uri uri) {
        Log.m99045i("MicroMsg.SDK.Util", "getFileSize with content url");
        if (contentResolver == null || uri == null) {
            Log.m99047w("MicroMsg.SDK.Util", "getFileSize fail, resolver or uri is null");
            return 0;
        }
        InputStream inputStream = null;
        try {
            inputStream = contentResolver.openInputStream(uri);
            if (inputStream == null) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e) {
                        Log.m99044e("MicroMsg.SDK.Util", "getFileSize exception: " + e.getMessage());
                    }
                }
                return 0;
            }
            int available = inputStream.available();
            try {
                inputStream.close();
            } catch (IOException e2) {
                Log.m99044e("MicroMsg.SDK.Util", "getFileSize exception: " + e2.getMessage());
            }
            return available;
        } catch (Exception e3) {
            Log.m99047w("MicroMsg.SDK.Util", "getFileSize fail, " + e3.getMessage());
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e4) {
                    Log.m99044e("MicroMsg.SDK.Util", "getFileSize exception: " + e4.getMessage());
                }
            }
            return 0;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e5) {
                    Log.m99044e("MicroMsg.SDK.Util", "getFileSize exception: " + e5.getMessage());
                }
            }
            throw th;
        }
    }

    /* renamed from: a */
    public static int m99049a(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        File file = new File(str);
        if (file.exists()) {
            return (int) file.length();
        }
        if (f238079a != null && str.startsWith("content")) {
            try {
                return m99048a(f238079a.getContentResolver(), Uri.parse(str));
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    /* renamed from: a */
    public static int m99050a(String str, int i) {
        if (str == null) {
            return i;
        }
        try {
            return str.length() <= 0 ? i : Integer.parseInt(str);
        } catch (Exception unused) {
            return i;
        }
    }

    /* renamed from: a */
    public static boolean m99051a(int i) {
        return i == 36 || i == 46;
    }

    /* renamed from: b */
    public static boolean m99052b(String str) {
        return str == null || str.length() <= 0;
    }
}
