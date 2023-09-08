package com.tencent.p014mm.plugin.appbrand.jsapi.share;

import android.app.Activity;
import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.plugin.appbrand.report.C84240s;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import kr0.C88267e;
import nj3.C76879j;
import p225rc.g$$f;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.m */
public class C82977m implements g$$f {

    /* renamed from: a */
    public final /* synthetic */ Activity f242617a;

    /* renamed from: b */
    public final /* synthetic */ String f242618b;

    /* renamed from: c */
    public final /* synthetic */ String f242619c;

    /* renamed from: d */
    public final /* synthetic */ C88267e f242620d;

    /* renamed from: e */
    public final /* synthetic */ int f242621e;

    /* renamed from: f */
    public final /* synthetic */ AppBrandInitConfigWC f242622f;

    /* renamed from: g */
    public final /* synthetic */ String f242623g;

    /* renamed from: h */
    public final /* synthetic */ C82970i0 f242624h;

    /* renamed from: i */
    public final /* synthetic */ String f242625i;

    /* renamed from: j */
    public final /* synthetic */ String f242626j;

    /* renamed from: k */
    public final /* synthetic */ int f242627k;

    /* renamed from: l */
    public final /* synthetic */ String f242628l;

    /* renamed from: m */
    public final /* synthetic */ C82980n f242629m;

    public C82977m(C82980n nVar, Activity activity, String str, String str2, C88267e eVar, int i, AppBrandInitConfigWC appBrandInitConfigWC, String str3, C82970i0 i0Var, String str4, String str5, int i2, String str6) {
        this.f242629m = nVar;
        this.f242617a = activity;
        this.f242618b = str;
        this.f242619c = str2;
        this.f242620d = eVar;
        this.f242621e = i;
        this.f242622f = appBrandInitConfigWC;
        this.f242623g = str3;
        this.f242624h = i0Var;
        this.f242625i = str4;
        this.f242626j = str5;
        this.f242627k = i2;
        this.f242628l = str6;
    }

    /* renamed from: b */
    public boolean mo1596b(int i, int i2, Intent intent) {
        if (i != this.f242629m.f242636g) {
            return false;
        }
        if (i2 == -1) {
            Activity activity = this.f242617a;
            C76879j.m92726T(activity, activity.getResources().getString(C0966R.string.f360099a34));
            C82980n nVar = this.f242629m;
            String str = this.f242618b;
            String str2 = this.f242619c;
            nVar.getClass();
            C84240s.m103840f(str, str2, 3, "", Util.nowSecond(), 1, i2);
            Log.m105924i("MicroMsg.JsApiShareTimeline", "result is success");
            this.f242620d.mo109647a(this.f242621e, this.f242629m.mo115109j("ok"));
            String R0 = this.f242620d.mo114341l0().mo116163R0();
            String K0 = this.f242620d.mo114341l0().mo116156K0();
            int i3 = this.f242622f.f234841u;
            C82972j0.m101772b(this.f242623g, this.f242624h);
            String str3 = this.f242618b;
            AppBrandInitConfigWC appBrandInitConfigWC = this.f242622f;
            AppBrandStatObject appBrandStatObject = appBrandInitConfigWC.f234834c1;
            C82967h0.m101765d(str3, appBrandStatObject.f245533f, appBrandStatObject.f245534g, appBrandInitConfigWC.f234837q, (String) null, this.f242625i, this.f242619c, R0, K0, 0, this.f242623g, (String) null, i3, this.f242626j, this.f242627k, 3, this.f242628l);
            return true;
        }
        Log.m105924i("MicroMsg.JsApiShareTimeline", "result is cancel");
        this.f242620d.mo109647a(this.f242621e, this.f242629m.mo115109j("cancel"));
        C82980n nVar2 = this.f242629m;
        String str4 = this.f242618b;
        String str5 = this.f242619c;
        nVar2.getClass();
        C84240s.m103840f(str4, str5, 3, "", Util.nowSecond(), 3, i2);
        return true;
    }
}
