package xn1;

import android.view.View;
import gy3.C87412m;
import iy3.C60641c;
import org.json.JSONObject;
import xn1.C66375g;

/* renamed from: xn1.c */
public final class C118892c implements View.OnAttachStateChangeListener {

    /* renamed from: d */
    public final /* synthetic */ View f356168d;

    /* renamed from: e */
    public final /* synthetic */ C118894e f356169e;

    public C118892c(View view, C118894e eVar) {
        this.f356168d = view;
        this.f356169e = eVar;
    }

    public void onViewAttachedToWindow(View view) {
        C87412m.m108594g(view, "view");
    }

    public void onViewDetachedFromWindow(View view) {
        C87412m.m108594g(view, "view");
        this.f356168d.removeOnAttachStateChangeListener(this);
        JSONObject jSONObject = new JSONObject();
        C118894e eVar = this.f356169e;
        int i = eVar.f356179n;
        if (i > 0) {
            jSONObject.put("avgScrollCostMs", C60641c.m70922c((double) ((((float) eVar.f356178j) * 1.0f) / ((float) i))));
            ((C66375g.C66377b) C66375g.f191088a).mo90471a(this.f356169e.f356172d, jSONObject);
        }
        C118888a.f356146a.mo183586a(C66375g.f191088a);
    }
}
