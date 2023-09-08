package com.tencent.p014mm.plugin.appbrand.appcache;

import android.content.ContentValues;
import android.net.Uri;
import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import p736wc.C38051a;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.f3 */
public class C29215f3 {

    /* renamed from: a */
    public static final C29215f3 f79864a = new C29215f3();

    /* renamed from: b */
    public static final Uri f79865b = Uri.parse("content://" + C38051a.f100592a + "/" + "AppBrandWxaPkgManifestRecord");

    /* renamed from: a */
    public boolean mo56523a(String str, int i, int i2) {
        Log.m105925i("Luggage.DevPkgLaunchExtInfoContentResolver", "deleteModuleList appId:%s, pkgType:%d, pkgVersion:%d", str, Integer.valueOf(i), Integer.valueOf(i2));
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("CONTENT_KEY_ACTION", "ACTION_DELETE_MODULE_LIST");
            contentValues.put("CONTENT_KEY_APPID", str);
            contentValues.put("CONTENT_KEY_PKG_TYPE", Integer.valueOf(i));
            contentValues.put("CONTENT_KEY_PKG_VERSION", Integer.valueOf(i2));
            MMApplicationContext.getContext().getContentResolver().update(f79865b, contentValues, (String) null, (String[]) null);
        } catch (Exception e) {
            Log.m105921e("Luggage.DevPkgLaunchExtInfoContentResolver", "deleteModuleList failed, appId:%s, pkgType:%d, pkgVersion:%d, exception:%s", str, Integer.valueOf(i), Integer.valueOf(i2), e);
        }
        return true;
    }

    /* renamed from: b */
    public boolean mo56524b(String str, int i, int i2, String str2) {
        Log.m105925i("Luggage.DevPkgLaunchExtInfoContentResolver", "updateModuleList appId:%s, pkgType:%d, pkgVersion:%d", str, Integer.valueOf(i), Integer.valueOf(i2));
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("CONTENT_KEY_ACTION", "ACTION_UPDATE_MODULE_LIST");
            contentValues.put("CONTENT_KEY_APPID", str);
            contentValues.put("CONTENT_KEY_PKG_TYPE", Integer.valueOf(i));
            contentValues.put("CONTENT_KEY_PKG_VERSION", Integer.valueOf(i2));
            contentValues.put("CONTENT_KEY_MODULE_LIST_JSON", str2);
            MMApplicationContext.getContext().getContentResolver().insert(f79865b, contentValues);
            return true;
        } catch (Exception e) {
            Log.m105921e("Luggage.DevPkgLaunchExtInfoContentResolver", "updateModuleList failed appId:%s, pkgType:%d, pkgVersion:%d, exception:%s", str, Integer.valueOf(i), Integer.valueOf(i2), e);
            return false;
        }
    }

    /* renamed from: c */
    public void mo56525c(String str, String str2, int i, int i2, String str3) {
        if (!TextUtils.isEmpty(str3)) {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("CONTENT_KEY_ACTION", "ACTION_UPDATE_PKG_INFO");
                contentValues.put("CONTENT_KEY_APPID", str);
                contentValues.put("CONTENT_KEY_MODULE_NAME", str2);
                contentValues.put("CONTENT_KEY_PKG_VERSION", Integer.valueOf(i));
                contentValues.put("CONTENT_KEY_CODE_TYPE", Integer.valueOf(i2));
                contentValues.put("CONTENT_KEY_PKGINFO_LIST", str3);
                MMApplicationContext.getContext().getContentResolver().insert(f79865b, contentValues);
            } catch (Exception e) {
                Log.printErrStackTrace("Luggage.DevPkgLaunchExtInfoContentResolver", e, "updatePkgInfoList", new Object[0]);
            }
        }
    }

    /* renamed from: d */
    public void mo56526d(String str, String str2, int i, int i2, String str3, int i3) {
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("CONTENT_KEY_ACTION", "ACIION_UPDATE_WITHOUT_PLUGINCODE_INFO");
            contentValues.put("CONTENT_KEY_APPID", str);
            contentValues.put("CONTENT_KEY_MODULE_NAME", str2);
            contentValues.put("CONTENT_KEY_PKG_VERSION", Integer.valueOf(i));
            contentValues.put("CONTENT_KEY_CODE_TYPE", Integer.valueOf(i2));
            contentValues.put("CONTENT_KEY_PKG_VERSION_MD5", str3);
            contentValues.put("CONTENT_KEY_PKG_TYPE", Integer.valueOf(i3));
            MMApplicationContext.getContext().getContentResolver().insert(f79865b, contentValues);
        } catch (Exception e) {
            Log.printErrStackTrace("Luggage.DevPkgLaunchExtInfoContentResolver", e, "updateWithoutPluginCodeInfo, appId[%s] module[%s], version[%d], codeType[%d], md5[%s], pkgType[%d]", str, str2, Integer.valueOf(i), Integer.valueOf(i2), str3, Integer.valueOf(i3));
        }
    }
}
