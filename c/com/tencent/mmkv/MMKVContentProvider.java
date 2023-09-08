package com.tencent.mmkv;

import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;

public class MMKVContentProvider extends ContentProvider {

    /* renamed from: d */
    public static Uri f349137d;

    /* renamed from: a */
    public static String m163962a(Context context) {
        ProviderInfo providerInfo;
        try {
            ComponentName componentName = new ComponentName(context, MMKVContentProvider.class.getName());
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (providerInfo = packageManager.getProviderInfo(componentName, 0)) == null) {
                return null;
            }
            return providerInfo.authority;
        } catch (Exception unused) {
            return null;
        }
    }

    public Bundle call(String str, String str2, Bundle bundle) {
        if (str.equals("mmkvFromAshmemID") && bundle != null) {
            try {
                MMKV mmkvWithAshmemID = MMKV.mmkvWithAshmemID(getContext(), str2, bundle.getInt("KEY_SIZE"), bundle.getInt("KEY_MODE"), bundle.getString("KEY_CRYPT"));
                ParcelableMMKV parcelableMMKV = new ParcelableMMKV(mmkvWithAshmemID);
                mmkvWithAshmemID.ashmemFD();
                mmkvWithAshmemID.ashmemMetaFD();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("KEY", parcelableMMKV);
                return bundle2;
            } catch (Exception e) {
                e.getMessage();
            }
        }
        return null;
    }

    public int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException("Not implement in MMKV");
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("Not implement in MMKV");
    }

    public boolean onCreate() {
        String a;
        Context context = getContext();
        if (context == null || (a = m163962a(context)) == null) {
            return false;
        }
        if (f349137d != null) {
            return true;
        }
        f349137d = Uri.parse("content://" + a);
        return true;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new UnsupportedOperationException("Not implement in MMKV");
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("Not implement in MMKV");
    }
}
