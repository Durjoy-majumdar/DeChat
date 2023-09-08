package com.tencent.p014mm.plugin.webview.p128ui.tools;

import ad0.C0033t;
import android.os.Bundle;
import android.os.RemoteException;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.webview.model.C43704h2;
import com.tencent.p014mm.plugin.webview.stub.C43791l;
import com.tencent.p014mm.sdk.platformtools.ConnectivityCompat;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.p1 */
public class C44130p1 {

    /* renamed from: i */
    public static C44130p1 f119545i = new C44130p1();

    /* renamed from: a */
    public String f119546a;

    /* renamed from: b */
    public int f119547b;

    /* renamed from: c */
    public String f119548c;

    /* renamed from: d */
    public String f119549d;

    /* renamed from: e */
    public String f119550e;

    /* renamed from: f */
    public String f119551f;

    /* renamed from: g */
    public boolean f119552g = false;

    /* renamed from: h */
    public C43791l f119553h = null;

    /* renamed from: a */
    public void mo68770a() {
        Log.m105927v("MicroMsg.WebViewReportUtil", "close traceid %s", this.f119546a);
        this.f119552g = true;
        if (!Util.isNullOrNil(this.f119546a)) {
            mo68774e(4, "", 0);
            this.f119546a = null;
        }
    }

    /* renamed from: b */
    public String mo68771b() {
        return this.f119546a;
    }

    /* renamed from: c */
    public void mo68772c(String str) {
        Log.m105927v("MicroMsg.WebViewReportUtil", "onPageStarted url %s, currUrl %s, traceid %s", str, this.f119551f, this.f119546a);
        String str2 = this.f119551f;
        this.f119551f = str;
        if (!Util.isNullOrNil(this.f119546a)) {
            mo68774e(1, str2, 0);
        }
    }

    /* renamed from: d */
    public void mo68773d(int i) {
        Log.m105927v("MicroMsg.WebViewReportUtil", "onReceivedError traceid %s", this.f119546a);
        if (!Util.isNullOrNil(this.f119546a)) {
            mo68774e(3, "", i);
        }
    }

    /* renamed from: e */
    public final void mo68774e(int i, String str, int i2) {
        C0033t tVar = new C0033t();
        tVar.mo32a("20adInfo", this.f119546a + ",");
        tVar.mo32a("21optype", i + ",");
        tVar.mo32a("22sessionId", this.f119548c + ",");
        tVar.mo32a("23currURL", this.f119551f + ",");
        tVar.mo32a("24referURL", str + ",");
        tVar.mo32a("25errCode", i2 + ",");
        tVar.mo32a("26networkType", this.f119547b + ",");
        tVar.mo32a("27timeStamp", Util.nowMilliSecond() + ",");
        tVar.mo32a("28ssid", this.f119549d + ",");
        tVar.mo32a("29bssid", this.f119550e + ",");
        Log.m105925i("MicroMsg.WebViewReportUtil", "report logbuffer adPageOp(13791): optype:%d, sessionId:%s, currUrl:%s, referUrl:%s, errCode:%d, networkType:%d", Integer.valueOf(i), this.f119548c, this.f119551f, str, Integer.valueOf(i2), Integer.valueOf(this.f119547b));
        C115669n.INSTANCE.mo160131h(13791, tVar);
        if (this.f119553h == null) {
            Log.m105920e("MicroMsg.WebViewReportUtil", "report invoker null");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("ad_report_data_str", tVar.toString());
        try {
            this.f119553h.mo68108RV(1295, bundle);
        } catch (RemoteException e) {
            Log.m105921e("MicroMsg.WebViewReportUtil", "report: exp:%s", e);
        }
    }

    /* renamed from: f */
    public void mo68775f(String str, String str2) {
        Log.m105924i("MicroMsg.WebViewReportUtil", "setting traceid " + str + ",usename " + str2);
        this.f119546a = str;
        this.f119547b = C43704h2.m47539g();
        this.f119548c = MD5Util.getMD5String(str2 + "" + Util.nowMilliSecond());
        ConnectivityCompat.Companion companion = ConnectivityCompat.Companion;
        this.f119549d = companion.getFormattedWiFiSsid();
        this.f119550e = companion.getFormattedWiFiBssid();
        this.f119552g = false;
    }
}
