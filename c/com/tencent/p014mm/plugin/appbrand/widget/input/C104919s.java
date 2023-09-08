package com.tencent.p014mm.plugin.appbrand.widget.input;

import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.widget.input.C104891k1;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.lang.ref.WeakReference;
import ll0.C109395k;
import org.json.JSONObject;
import p518fb.C86780b;
import p518fb.C86781c;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.input.s */
public class C104919s implements C104891k1 {

    /* renamed from: a */
    public final /* synthetic */ WeakReference f311535a;

    /* renamed from: b */
    public final /* synthetic */ C104849c f311536b;

    /* renamed from: c */
    public final /* synthetic */ int f311537c;

    /* renamed from: d */
    public final /* synthetic */ String f311538d;

    public C104919s(C104924u uVar, WeakReference weakReference, C104849c cVar, int i, String str) {
        this.f311535a = weakReference;
        this.f311536b = cVar;
        this.f311537c = i;
        this.f311538d = str;
    }

    /* renamed from: a */
    public void mo148904a(String str, int i, C104891k1.C104892a aVar) {
        try {
            C83780d1 d1Var = (C83780d1) this.f311535a.get();
            if (d1Var != null) {
                JSONObject put = new JSONObject().put("value", str).put("keyCode", ((C104863f1) this.f311536b.mo148742k()).getLastKeyPressed()).put("inputId", this.f311537c).put("cursor", i);
                if (C104891k1.C104892a.CHANGED.equals(aVar)) {
                    C109395k.C109398d dVar = new C109395k.C109398d();
                    dVar.mo115195q(d1Var.getRuntime().mo113047b0(), d1Var.getComponentId());
                    dVar.mo115158h();
                    dVar.f242407f = put.put("data", this.f311538d).toString();
                    dVar.mo115158h();
                    return;
                }
                int ordinal = aVar.ordinal();
                String str2 = ordinal != 0 ? ordinal != 1 ? null : C86781c.NAME : C86780b.NAME;
                if (!Util.isNullOrNil(str2)) {
                    d1Var.mo109652f(str2, put.toString(), 0);
                }
            }
        } catch (Exception unused) {
        }
    }
}
