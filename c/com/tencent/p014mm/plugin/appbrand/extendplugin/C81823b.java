package com.tencent.p014mm.plugin.appbrand.extendplugin;

import android.content.Context;
import androidx.lifecycle.C0125s;
import co0.C80130d;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82016a0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82531i;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import fl0.C86918c;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;
import p830xc.C91165a;

/* renamed from: com.tencent.mm.plugin.appbrand.extendplugin.b */
public class C81823b implements C91165a {

    /* renamed from: a */
    public final int f240070a;

    /* renamed from: b */
    public final JSONObject f240071b;

    /* renamed from: c */
    public final C82870p f240072c;

    /* renamed from: d */
    public final WeakReference<C82381f> f240073d;

    /* renamed from: e */
    public final String f240074e;

    /* renamed from: f */
    public C82531i.C82535d f240075f;

    /* renamed from: g */
    public C82531i.C82533b f240076g;

    /* renamed from: h */
    public C82531i.C82534c f240077h;

    public C81823b(int i, JSONObject jSONObject, C82381f fVar, C82870p pVar) {
        this.f240070a = i;
        this.f240071b = jSONObject;
        this.f240073d = new WeakReference<>(fVar);
        this.f240072c = pVar;
        this.f240074e = fVar.getAppId();
    }

    /* renamed from: a */
    public void mo62538a(C91165a.C53318a aVar) {
        C82381f fVar = this.f240073d.get();
        if (fVar instanceof C82520h) {
            Log.m105924i("MicroMsg.AppBrand.AppBrandInvokeContext", "addLifecycleListener");
            C82520h hVar = (C82520h) fVar;
            b$$b b__b = new b$$b(this, aVar);
            this.f240075f = b__b;
            this.f240076g = new b$$c(this, aVar, fVar);
            this.f240077h = new b$$d(this, aVar);
            hVar.mo114868y(b__b);
            hVar.mo114864j(this.f240076g);
            hVar.mo114865m(this.f240077h);
            return;
        }
        C0125s lifecycleOwner = fVar.getLifecycleOwner();
        if (lifecycleOwner != null) {
            b$$a b__a = new b$$a(this, lifecycleOwner, aVar, fVar);
            if (MMHandlerThread.isMainThread()) {
                b__a.run();
            } else {
                MMHandlerThread.postToMainThread(b__a);
            }
        }
    }

    /* renamed from: b */
    public JSONObject mo62539b() {
        JSONObject jSONObject = this.f240071b;
        return jSONObject != null ? jSONObject : new JSONObject();
    }

    /* renamed from: c */
    public void mo62540c(C91165a.C53318a aVar) {
    }

    /* renamed from: d */
    public boolean mo62541d() {
        return this.f240072c instanceof C82016a0;
    }

    /* renamed from: e */
    public boolean mo62542e() {
        return this.f240072c instanceof C80130d;
    }

    /* renamed from: f */
    public String mo62543f() {
        C82870p pVar = this.f240072c;
        if (pVar != null) {
            return pVar.mo114779e();
        }
        return null;
    }

    /* renamed from: g */
    public C82381f mo62544g() {
        return this.f240073d.get();
    }

    public String getAppId() {
        return this.f240074e;
    }

    public Context getContext() {
        C82381f fVar = this.f240073d.get();
        if (fVar != null) {
            return fVar.getContext();
        }
        return null;
    }

    /* renamed from: h */
    public String mo62547h(C86918c cVar, Map<String, ?> map) {
        C82870p pVar;
        C82381f fVar = this.f240073d.get();
        if (!(fVar == null || (pVar = this.f240072c) == null)) {
            fVar.mo109647a(this.f240070a, pVar.mo115110k((String) null, cVar, map));
        }
        return null;
    }

    /* renamed from: i */
    public void mo62548i() {
        C82381f fVar = this.f240073d.get();
        if (fVar instanceof C82520h) {
            Log.m105924i("MicroMsg.AppBrand.AppBrandInvokeContext", "removeLifecycleListener");
            C82520h hVar = (C82520h) fVar;
            C82531i.C82535d dVar = this.f240075f;
            if (dVar != null) {
                hVar.mo114866q(dVar);
                this.f240075f = null;
            }
            C82531i.C82533b bVar = this.f240076g;
            if (bVar != null) {
                hVar.mo114863i(bVar);
                this.f240076g = null;
            }
            C82531i.C82534c cVar = this.f240077h;
            if (cVar != null) {
                hVar.mo114867r(cVar);
                this.f240077h = null;
            }
        }
    }

    /* renamed from: j */
    public String mo62549j(String str) {
        C82870p pVar;
        C82381f fVar = this.f240073d.get();
        if (fVar == null || (pVar = this.f240072c) == null) {
            return null;
        }
        fVar.mo109647a(this.f240070a, pVar.mo115109j(str));
        return null;
    }

    /* renamed from: k */
    public String mo62550k(String str, Map<String, ? extends Object> map) {
        C82870p pVar;
        C82381f fVar = this.f240073d.get();
        if (fVar == null || (pVar = this.f240072c) == null) {
            return null;
        }
        fVar.mo109647a(this.f240070a, pVar.mo115112m(str, map));
        return null;
    }

    /* renamed from: l */
    public String mo62551l(C86918c cVar) {
        C82870p pVar;
        C82381f fVar = this.f240073d.get();
        if (!(fVar == null || (pVar = this.f240072c) == null)) {
            fVar.mo109647a(this.f240070a, pVar.mo115111l((String) null, cVar, (JSONObject) null));
        }
        return null;
    }

    /* renamed from: m */
    public String mo62552m(String str, C86918c cVar) {
        C82870p pVar;
        C82381f fVar = this.f240073d.get();
        if (!(fVar == null || (pVar = this.f240072c) == null)) {
            fVar.mo109647a(this.f240070a, pVar.mo115111l(str, cVar, (JSONObject) null));
        }
        return null;
    }
}
