package p989jo;

import android.graphics.Color;
import com.tencent.p014mm.sdk.platformtools.Log;
import e42.C7596h;
import e42.C86430i;
import gy3.C87412m;
import l10.C24931h;
import p150eo.C86596j;
import p467co.C28631g;
import p467co.C80112c;

/* renamed from: jo.b */
public final class C87992b<T extends C86596j> extends C86430i<T> {
    /* renamed from: e */
    public String mo16e() {
        return "showPopupWindow";
    }

    /* renamed from: l */
    public boolean mo17l() {
        return true;
    }

    /* renamed from: q */
    public void mo18q(C7596h hVar) {
        int i;
        C87412m.m108594g(hVar, "data");
        boolean optBoolean = hVar.optBoolean("mask");
        try {
            i = Color.parseColor(hVar.optString("maskColor"));
        } catch (IllegalArgumentException unused) {
            Log.m105920e("MicroMsg.MBJsApiShowPopupWindow", hVar.optString("maskColor"));
            i = 0;
        }
        C86596j jVar = (C86596j) this.f251227a;
        if (jVar != null) {
            C80112c cVar = jVar.f251534n;
            cVar.getClass();
            C24931h.C24938c.C24940b a = C24931h.C24938c.f71072h.toBuilder();
            a.f71078d |= 1;
            a.f71079e = optBoolean;
            a.onChanged();
            a.f71078d |= 2;
            a.f71080f = i;
            a.onChanged();
            cVar.mo121193A("showPopupWindow", a.build().toByteArray(), C28631g.f78560d);
        }
    }
}
