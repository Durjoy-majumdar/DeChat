package androidx.camera.core.internal.utils;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import androidx.camera.core.Logger;

public final class VideoUtil {
    private static final String TAG = "VideoUtil";

    private VideoUtil() {
    }

    public static String getAbsolutePathFromUri(ContentResolver contentResolver, Uri uri) {
        Cursor cursor = null;
        try {
            Cursor query = contentResolver.query(uri, new String[]{"_data"}, (String) null, (String[]) null, (String) null);
            query.getClass();
            int columnIndexOrThrow = query.getColumnIndexOrThrow("_data");
            query.moveToFirst();
            String string = query.getString(columnIndexOrThrow);
            query.close();
            return string;
        } catch (RuntimeException e) {
            Logger.m15473e(TAG, String.format("Failed in getting absolute path for Uri %s with Exception %s", new Object[]{uri.toString(), e.toString()}));
            if (cursor != null) {
                cursor.close();
            }
            return "";
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }
}
