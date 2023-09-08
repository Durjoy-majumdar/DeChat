package com.tencent.skyline.jni;

import android.content.Context;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;

public final class IOUtil {
    private static final String TAG = "IOUtil";

    private IOUtil() {
    }

    public static String convertStreamToString(InputStream inputStream) {
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        char[] cArr = new char[16384];
        StringWriter stringWriter = new StringWriter();
        while (true) {
            try {
                int read = inputStreamReader.read(cArr);
                if (-1 != read) {
                    stringWriter.write(cArr, 0, read);
                } else {
                    qualityClose(inputStreamReader);
                    qualityClose(inputStream);
                    return stringWriter.toString();
                }
            } catch (Exception e) {
                String.format("convertStreamToString: read, %s", new Object[]{e.getMessage()});
                qualityClose(inputStreamReader);
                qualityClose(inputStream);
                return "";
            } catch (Throwable th) {
                qualityClose(inputStreamReader);
                qualityClose(inputStream);
                throw th;
            }
        }
    }

    public static String getAssetAsString(Context context, String str) {
        InputStream inputStream;
        try {
            inputStream = context.getAssets().open(str);
        } catch (Exception e) {
            String.format("openRead file( %s ) failed, exp = %s", new Object[]{str, e});
            inputStream = null;
        }
        return inputStream == null ? "" : convertStreamToString(inputStream);
    }

    public static void qualityClose(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
