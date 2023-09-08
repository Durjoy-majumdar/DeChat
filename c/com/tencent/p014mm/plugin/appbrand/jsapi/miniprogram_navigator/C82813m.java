package com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator.C82807l;
import gt0.C87327c0;
import gt0.C87370k0;
import p210o.C11323a;
import p963fc.C86812g;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.m */
public class C82813m implements C11323a<Context, C87370k0.C87371a> {

    /* renamed from: a */
    public final /* synthetic */ C82807l.C82812d f242201a;

    public C82813m(C82807l.C82812d dVar) {
        this.f242201a = dVar;
    }

    public Object apply(Object obj) {
        Context context = (Context) obj;
        C82807l.C82812d dVar = this.f242201a;
        C82807l lVar = C82807l.this;
        C86812g gVar = dVar.f242195b;
        lVar.getClass();
        Context R = gVar.mo113026R();
        if (R == null) {
            R = gVar.f238141d;
        }
        C87327c0 c0Var = R == null ? null : new C87327c0(R);
        c0Var.setTitle("");
        c0Var.setMessage(context.getString(C0966R.string.f7587kf));
        return c0Var;
    }
}
