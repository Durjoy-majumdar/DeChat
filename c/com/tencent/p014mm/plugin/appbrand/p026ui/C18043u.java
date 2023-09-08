package com.tencent.p014mm.plugin.appbrand.p026ui;

import com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import pj3.C47511g;
import te3.C51793w7;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.u */
public class C18043u implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f49856d;

    /* renamed from: e */
    public final /* synthetic */ Preference f49857e;

    /* renamed from: f */
    public final /* synthetic */ boolean f49858f;

    /* renamed from: g */
    public final /* synthetic */ C51793w7 f49859g;

    /* renamed from: h */
    public final /* synthetic */ C47511g f49860h;

    public C18043u(AppBrandAuthorizeUI appBrandAuthorizeUI, boolean z, Preference preference, boolean z2, C51793w7 w7Var, C47511g gVar) {
        this.f49856d = z;
        this.f49857e = preference;
        this.f49858f = z2;
        this.f49859g = w7Var;
        this.f49860h = gVar;
    }

    public void run() {
        int i = 2;
        if (this.f49856d) {
            ((CheckBoxPreference) this.f49857e).mo6805K(this.f49858f);
            C51793w7 w7Var = this.f49859g;
            if (this.f49858f) {
                i = 1;
            }
            w7Var.f143898f = i;
            this.f49860h.notifyDataSetChanged();
            return;
        }
        ((CheckBoxPreference) this.f49857e).mo6805K(!this.f49858f);
        C51793w7 w7Var2 = this.f49859g;
        if (!this.f49858f) {
            i = 1;
        }
        w7Var2.f143898f = i;
        this.f49860h.notifyDataSetChanged();
    }
}
