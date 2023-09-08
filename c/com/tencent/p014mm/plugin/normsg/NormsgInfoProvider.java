package com.tencent.p014mm.plugin.normsg;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatAuthorities;
import tc2.C118418g;

/* renamed from: com.tencent.mm.plugin.normsg.NormsgInfoProvider */
public final class NormsgInfoProvider extends ContentProvider {
    static {
        String AUTHORITIES_PLUGIN_NORMSG_NMINFO = WeChatAuthorities.AUTHORITIES_PLUGIN_NORMSG_NMINFO();
        Uri.parse("content://" + AUTHORITIES_PLUGIN_NORMSG_NMINFO);
    }

    public Bundle call(String str, String str2, Bundle bundle) {
        boolean z = false;
        Log.m105925i("MicroMsg.NormsgIP", "invoke: %s, with arg: %s", str, str2);
        if ("m0".equals(str)) {
            C118418g gVar = C118418g.INSTANCE;
            String Z10 = gVar.Z10(".!\"f=/%' (3n,-!51;.)");
            try {
                String callingPackage = getCallingPackage();
                Log.m105924i("MicroMsg.NormsgIP", "isReqFrom " + callingPackage + "; expectPkg " + Z10);
                if (callingPackage != null && callingPackage.equals(Z10)) {
                    z = true;
                }
            } catch (Exception e) {
                Log.m105920e("MicroMsg.NormsgIP", "isReqFrom error:" + e.toString());
            }
            if (!z) {
                return null;
            }
            try {
                String Gt0 = gVar.Gt0();
                if (Gt0 == null) {
                    Gt0 = "";
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("STR_RESULT", Gt0);
                return bundle2;
            } catch (Throwable unused) {
                return null;
            }
        } else {
            Log.m105929w("MicroMsg.NormsgIP", "unknown method: %s", str);
            return null;
        }
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public boolean onCreate() {
        return true;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
