package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.g5 */
public class C1696g5 implements C1256g<Bundle> {

    /* renamed from: d */
    public final /* synthetic */ C82554k f11391d;

    /* renamed from: e */
    public final /* synthetic */ int f11392e;

    /* renamed from: f */
    public final /* synthetic */ C1700h5 f11393f;

    public C1696g5(C1700h5 h5Var, C82554k kVar, int i) {
        this.f11393f = h5Var;
        this.f11391d = kVar;
        this.f11392e = i;
    }

    /* renamed from: a */
    public void mo894a(Object obj) {
        Bundle bundle = (Bundle) obj;
        String string = bundle.getString("ret", "fail");
        string.equals("ok");
        this.f11391d.mo109647a(this.f11392e, this.f11393f.mo115109j(string));
        if (bundle.getInt("closeWindow", 0) == 1) {
            this.f11391d.getRuntime().mo113063k();
        }
    }
}
