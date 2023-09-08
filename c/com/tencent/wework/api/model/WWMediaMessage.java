package com.tencent.wework.api.model;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import sw3.C36882a;

public class WWMediaMessage extends WWBaseMessage {

    /* renamed from: c */
    public String f285818c;

    /* renamed from: d */
    public String f285819d;

    /* renamed from: e */
    public byte[] f285820e;

    public static abstract class WWMediaObject extends WWMediaMessage {
    }

    /* renamed from: b */
    public boolean mo136616b() {
        byte[] bArr = this.f285820e;
        if (bArr != null && bArr.length > 32768) {
            return false;
        }
        String str = this.f285818c;
        if (str != null && str.length() > 512) {
            return false;
        }
        String str2 = this.f285819d;
        return str2 == null || str2.length() <= 1024;
    }

    /* renamed from: f */
    public void mo136619f(Bundle bundle) {
        bundle.putString("_wwapi_basereq_transaction", String.valueOf(SystemClock.uptimeMillis()));
        bundle.putString("_wwapi_basereq_openid", (String) null);
        bundle.putString("_wwapi_basereq_agentid", (String) null);
        bundle.putString("_schema", (String) null);
        try {
            bundle.putString("_wwapi_basereq_appbundle", this.f285800a.getPackageName());
            Context context = this.f285800a;
            bundle.putString("_wwapi_basereq_appname", context.getString(context.getApplicationInfo().labelRes));
        } catch (Throwable unused) {
        }
        bundle.putInt("_wwobject_sdkVer", C36882a.f97891a.intValue());
        bundle.putString("_wwobject_sdkVername", "2.0.12.35");
        bundle.putBoolean("needUpdateSession", false);
        bundle.putString("_wwobject_title", this.f285818c);
        bundle.putString("_wwobject_description", this.f285819d);
        bundle.putByteArray("_wwobject_thumbdata", this.f285820e);
    }
}
