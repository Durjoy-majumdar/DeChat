package com.tencent.wework.api.util;

import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;

public class OpenDataUtils {
    /* renamed from: a */
    public static long m125363a(Context context, String str, String str2, Bundle bundle) {
        try {
            Uri.Builder scheme = new Uri.Builder().scheme("content");
            Uri build = scheme.authority(str2 + ".wwapi").appendPath("bundle").appendQueryParameter("pakage", str).build();
            build.toString();
            ContentValues contentValues = new ContentValues();
            Parcel obtain = Parcel.obtain();
            bundle.writeToParcel(obtain, 0);
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            contentValues.put("data", marshall);
            return ContentUris.parseId(context.getContentResolver().insert(build, contentValues));
        } catch (Throwable th) {
            th.toString();
            return -1;
        }
    }
}
