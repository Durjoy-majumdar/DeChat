package com.tencent.p014mm.sandbox.monitor;

import android.content.SharedPreferences;
import com.tencent.p014mm.app.C80594h0;
import com.tencent.p014mm.pointers.PByteArray;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import lu3.C88656g;
import oa1.C117731d;
import p156gj.C87200o;
import qe3.C89625d;

/* renamed from: com.tencent.mm.sandbox.monitor.d */
public class C85700d implements C88656g {

    /* renamed from: d */
    public final /* synthetic */ int f249712d;

    /* renamed from: e */
    public final /* synthetic */ String f249713e;

    /* renamed from: f */
    public final /* synthetic */ String f249714f;

    /* renamed from: g */
    public final /* synthetic */ String f249715g;

    /* renamed from: h */
    public final /* synthetic */ PByteArray f249716h;

    public C85700d(int i, String str, String str2, String str3, PByteArray pByteArray) {
        this.f249712d = i;
        this.f249713e = str;
        this.f249714f = str2;
        this.f249715g = str3;
        this.f249716h = pByteArray;
    }

    public String getKey() {
        return "CrashUpload_upload";
    }

    public void run() {
        C80594h0.m98212a(32);
        boolean z = false;
        SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("system_config_prefs", 0);
        StringBuilder sb = new StringBuilder();
        sb.append(HttpWrapperBase.PROTOCAL_HTTPS + sharedPreferences.getString("support.weixin.qq.com", "support.weixin.qq.com"));
        sb.append("/cgi-bin/mmsupport-bin/stackreport?version=");
        sb.append(Integer.toHexString(C89625d.f257841g));
        sb.append("&devicetype=");
        sb.append(C87200o.f252868a);
        sb.append("&filelength=");
        sb.append(this.f249712d);
        sb.append("&sum=");
        sb.append(this.f249713e);
        sb.append("&reporttype=1");
        sb.append("&NewReportType=");
        sb.append(Util.nullAsNil(C85701f.f249717a.get(this.f249714f)));
        String str = this.f249715g;
        if (str != null && !str.equals("")) {
            sb.append("&username=");
            sb.append(this.f249715g);
        }
        Log.m105918d("MicroMsg.CrashUpload", "dkcrash sb:" + sb.toString());
        try {
            if (Util.getInt(C117731d.m166007c().mo182444f("clicfg_crash_upload_retry_open", "0", false, true), 0) == 1) {
                z = true;
            }
        } catch (Exception e) {
            Log.m105920e("MicroMsg.CrashUpload", "get retry x error" + sb.toString());
            Log.printErrStackTrace("MicroMsg.CrashUpload", e, "", new Object[0]);
        }
        String sb4 = sb.toString();
        boolean a = C85701f.m105852a(sb4, this.f249716h.value);
        if (!a && z && !(a = C85701f.m105852a(sb4, this.f249716h.value))) {
            a = C85701f.m105852a(sb4.replace(HttpWrapperBase.PROTOCAL_HTTPS, HttpWrapperBase.PROTOCAL_HTTP), this.f249716h.value);
        }
        if (a) {
            C80594h0.m98212a(33);
        } else {
            C80594h0.m98212a(34);
        }
    }
}
