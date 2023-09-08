package rj0;

import android.util.SparseArray;
import android.view.View;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.jsapi.webrtc.C83077f;
import gy3.C87412m;
import org.json.JSONObject;
import p1044ub.C90630c;
import p169ib.C87685a;
import p547hb.C87464c;

/* renamed from: rj0.e */
public final class C89979e extends C83077f {

    /* renamed from: g */
    public final SparseArray<C87685a> f258539g;

    public C89979e(SparseArray<C87685a> sparseArray) {
        C87412m.m108594g(sparseArray, "captureDelegateContainer");
        this.f258539g = sparseArray;
    }

    /* renamed from: D */
    public /* bridge */ /* synthetic */ boolean mo110323D(C82520h hVar, int i, View view, JSONObject jSONObject) {
        mo115327E((C90630c) hVar, i, view, jSONObject);
        return true;
    }

    /* renamed from: E */
    public boolean mo115327E(C90630c cVar, int i, View view, JSONObject jSONObject) {
        C87464c cVar2;
        C87685a aVar = this.f258539g.get(i);
        if (aVar != null) {
            if (!(cVar == null || (cVar2 = (C87464c) cVar.mo116150E0(C87464c.class)) == null)) {
                cVar2.mo111242H(aVar);
            }
            this.f258539g.remove(i);
        }
        super.mo110323D(cVar, i, view, jSONObject);
        return true;
    }
}
