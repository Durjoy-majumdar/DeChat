package com.tencent.p014mm.plugin.appbrand.debugger;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.appcache.C81289m;
import com.tencent.p014mm.plugin.appbrand.launching.C29567d1;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di0.C86299o;
import di3.C86312j;
import kr0.C76630x0;

/* renamed from: com.tencent.mm.plugin.appbrand.debugger.g$$b */
public class g$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f239856d;

    /* renamed from: e */
    public final /* synthetic */ String f239857e;

    /* renamed from: f */
    public final /* synthetic */ String f239858f;

    /* renamed from: g */
    public final /* synthetic */ String f239859g;

    /* renamed from: h */
    public final /* synthetic */ String f239860h;

    /* renamed from: i */
    public final /* synthetic */ C86299o f239861i;

    /* renamed from: j */
    public final /* synthetic */ String f239862j;

    /* renamed from: n */
    public final /* synthetic */ String f239863n;

    /* renamed from: o */
    public final /* synthetic */ int f239864o;

    public g$$b(C81734g gVar, int i, String str, String str2, String str3, String str4, C86299o oVar, String str5, String str6, int i2) {
        this.f239856d = i;
        this.f239857e = str;
        this.f239858f = str2;
        this.f239859g = str3;
        this.f239860h = str4;
        this.f239861i = oVar;
        this.f239862j = str5;
        this.f239863n = str6;
        this.f239864o = i2;
    }

    public void run() {
        if (C81289m.C81290a.m99663a(this.f239856d) && !TextUtils.isEmpty(this.f239857e) && !TextUtils.isEmpty(this.f239858f)) {
            C81161g2.requireAccountInitializedOnDemand();
            C81161g2.f238471g.mo113526j(this.f239859g, this.f239856d, this.f239857e, this.f239858f, 0, 0);
        }
        if (C81289m.C81290a.m99663a(this.f239856d) && !TextUtils.isEmpty(this.f239860h)) {
            ((C29567d1) C81161g2.Bx0(C29567d1.class)).mo56814Lo(this.f239859g, this.f239856d, this.f239860h);
        }
        C86299o oVar = this.f239861i;
        oVar.f250930b = this.f239859g;
        oVar.f250929a = this.f239862j;
        oVar.f250931c = this.f239856d;
        oVar.f250934f = this.f239863n;
        oVar.f250932d = this.f239864o;
        oVar.f250939k = 1030;
        ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv(MMApplicationContext.getContext(), this.f239861i);
    }
}
