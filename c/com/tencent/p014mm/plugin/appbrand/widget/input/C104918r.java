package com.tencent.p014mm.plugin.appbrand.widget.input;

import android.view.KeyEvent;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.widget.input.C104863f1;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.ref.WeakReference;
import ll0.C109395k;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.input.r */
public class C104918r implements C104863f1.C104865b {

    /* renamed from: a */
    public final /* synthetic */ WeakReference f311532a;

    /* renamed from: b */
    public final /* synthetic */ C104849c f311533b;

    /* renamed from: c */
    public final /* synthetic */ String f311534c;

    public C104918r(C104924u uVar, WeakReference weakReference, C104849c cVar, String str) {
        this.f311532a = weakReference;
        this.f311533b = cVar;
        this.f311534c = str;
    }

    /* renamed from: a */
    public boolean mo148819a(int i, KeyEvent keyEvent) {
        if (i != 67) {
            return false;
        }
        C83780d1 d1Var = (C83780d1) this.f311532a.get();
        if (d1Var != null) {
            try {
                int i2 = this.f311533b.f311376f;
                C109395k.C109398d dVar = new C109395k.C109398d();
                JSONObject put = new JSONObject().put("value", this.f311533b.mo148742k().getText().toString()).put("data", this.f311534c).put("cursor", 0).put("inputId", i2).put("keyCode", 8);
                dVar.mo115195q(d1Var.getRuntime().mo113047b0(), d1Var.getComponentId());
                dVar.f242407f = put.toString();
                dVar.mo115158h();
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AppBrandInputJsApiHandler", "onKeyUpPostIme DEL, e = %s", e);
            }
        }
        return true;
    }
}
