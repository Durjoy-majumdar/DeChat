package com.tencent.p014mm.plugin.appbrand.luggage.customize;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.ChannelUtil;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import js0.C46574u;
import js0.C9512b;
import p156gj.C87203t;
import qe3.C89625d;

/* renamed from: com.tencent.mm.plugin.appbrand.luggage.customize.e */
public class C40490e implements C46574u.C46575a {

    /* renamed from: d */
    public String f108786d = "";

    /* renamed from: e */
    public Context f108787e;

    public C40490e(Context context) {
        this.f108787e = context;
    }

    /* renamed from: a */
    public static String m43714a(String str) {
        if (!C85875k4.m106210y()) {
            return str;
        }
        String nullAsNil = Util.nullAsNil(str);
        if (nullAsNil.contains("Android Tablet")) {
            return nullAsNil;
        }
        return nullAsNil + " " + "Android Tablet";
    }

    /* renamed from: I4 */
    public String mo63272I4() {
        PackageInfo packageInfo;
        if (!TextUtils.isEmpty(this.f108786d)) {
            return this.f108786d;
        }
        try {
            packageInfo = C9512b.m9207a(this.f108787e, MMApplicationContext.getPackageName());
        } catch (Exception unused) {
            packageInfo = null;
        }
        if (packageInfo != null) {
            this.f108786d += ChannelUtil.formatVersion((Context) null, C89625d.f257841g);
            this.f108786d += "." + packageInfo.versionCode;
            this.f108786d += "(" + String.format("0x%08X", new Object[]{Integer.valueOf(C89625d.f257841g)}) + ")";
            StringBuilder sb = new StringBuilder();
            sb.append(this.f108786d);
            sb.append(" WeChat/");
            sb.append(C87203t.m108279o() ? "arm64" : "arm32");
            this.f108786d = sb.toString();
            this.f108786d += " " + WeChatBrands.AppInfo.current().getUserAgent();
            if (ChannelUtil.isGPVersion()) {
                this.f108786d += " GPVersion/1";
            }
        }
        String a = m43714a(this.f108786d);
        this.f108786d = a;
        return a;
    }

    public String identity() {
        return " MicroMessenger/";
    }
}
