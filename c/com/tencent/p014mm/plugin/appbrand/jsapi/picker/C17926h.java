package com.tencent.p014mm.plugin.appbrand.jsapi.picker;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import com.tencent.p014mm.plugin.appbrand.utils.C84722b1;
import com.tencent.p014mm.plugin.appbrand.utils.C84747i;
import com.tencent.p014mm.plugin.appbrand.widget.picker.AppBrandEmptyPickerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;
import vt0.C22780b;
import vt0.C22784g;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.picker.h */
public abstract class C17926h extends C22780b {

    /* renamed from: j */
    public static C84722b1.C84723a f49439j = C84747i.f247160b;

    /* renamed from: e */
    public C82870p f49440e;

    /* renamed from: f */
    public WeakReference<C82520h> f49441f;

    /* renamed from: g */
    public int f49442g;

    /* renamed from: h */
    public boolean f49443h;

    /* renamed from: i */
    public String f49444i;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.picker.h$a */
    public class C17927a implements C22784g.C22787c {
        public C17927a() {
        }

        /* renamed from: a */
        public void mo22193a(boolean z, Object obj) {
            C17926h.this.f65507d.mo35924d(true);
        }
    }

    /* renamed from: c */
    public final void mo22194c(String str, Map<String, Object> map) {
        WeakReference<C82520h> weakReference = this.f49441f;
        if (weakReference != null && weakReference.get() != null && this.f49440e != null) {
            this.f49441f.get().mo109647a(this.f49442g, this.f49440e.mo115112m(str, map));
        }
    }

    /* renamed from: d */
    public void mo22187d(JSONObject jSONObject) {
        if (this.f49443h) {
            this.f49444i = jSONObject.optString("headerText");
            mo22189f(jSONObject);
            return;
        }
        mo22188e(jSONObject);
    }

    /* renamed from: e */
    public abstract void mo22188e(JSONObject jSONObject);

    /* renamed from: f */
    public abstract void mo22189f(JSONObject jSONObject);

    /* renamed from: g */
    public final void mo22195g(C82870p pVar, C82520h hVar, JSONObject jSONObject, int i, boolean z) {
        this.f49440e = pVar;
        this.f49441f = new WeakReference<>(hVar);
        this.f49442g = i;
        this.f49443h = z;
        mo22187d(jSONObject);
    }

    /* renamed from: h */
    public final void mo22196h(Runnable runnable) {
        if (runnable != null) {
            WeakReference<C82520h> weakReference = this.f49441f;
            C82520h hVar = weakReference == null ? null : weakReference.get();
            if (hVar != null) {
                hVar.mo109673t(runnable);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo22197i() {
        if (((AppBrandEmptyPickerView) mo35917b(AppBrandEmptyPickerView.class)) == null) {
            Log.m105920e("MicroMsg.AppBrand.JsApiPickerHandler", "showEmptyView settlePicker returns NULL");
            return;
        }
        this.f65507d.setOnResultListener(new C17927a());
        this.f65507d.mo35911i();
    }
}
