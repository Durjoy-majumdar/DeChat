package m70;

import android.view.View;
import android.widget.FrameLayout;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import d42.C7168a;
import d42.C86174d;
import d42.C86177e;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Map;
import n70.C47167a;
import org.json.JSONObject;

/* renamed from: m70.i */
public final class C88713i implements C86177e<View, C88710f> {

    /* renamed from: a */
    public final HashMap<Integer, Integer> f256067a = new HashMap<>();

    /* renamed from: b */
    public final /* synthetic */ FrameLayout f256068b;

    public C88713i(FrameLayout frameLayout) {
        this.f256068b = frameLayout;
    }

    /* renamed from: a */
    public void mo120575a(Object obj, Object obj2, C86174d dVar) {
        View view = (View) obj;
        C88710f fVar = (C88710f) obj2;
        C87412m.m108594g(view, "view");
        C87412m.m108594g(fVar, "viewAttribute");
        C87412m.m108594g(dVar, "callback");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(fVar.f256064c, fVar.f256065d);
        layoutParams.leftMargin = fVar.f256062a;
        layoutParams.topMargin = fVar.f256063b;
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: b */
    public void mo120576b(Object obj, C86174d dVar) {
        View view = (View) obj;
        C87412m.m108594g(view, "view");
        C87412m.m108594g(dVar, "callback");
        this.f256068b.removeView(view);
        this.f256067a.remove(Integer.valueOf(view.getId()));
    }

    /* renamed from: c */
    public void mo120577c(Object obj, Object obj2, C86174d dVar) {
        View view = (View) obj;
        C88710f fVar = (C88710f) obj2;
        C87412m.m108594g(view, "view");
        C87412m.m108594g(fVar, "viewAttribute");
        C87412m.m108594g(dVar, "callback");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(fVar.f256064c, fVar.f256065d);
        layoutParams.leftMargin = fVar.f256062a;
        layoutParams.topMargin = fVar.f256063b;
        int i = fVar.f256066e;
        int i2 = 0;
        for (Map.Entry<Integer, Integer> value : this.f256067a.entrySet()) {
            if (i >= ((Number) value.getValue()).intValue()) {
                i2++;
            }
        }
        if (i2 > this.f256068b.getChildCount()) {
            i2 = this.f256068b.getChildCount();
        }
        this.f256068b.addView(view, i2, layoutParams);
        this.f256067a.put(Integer.valueOf(view.getId()), Integer.valueOf(fVar.f256066e));
    }

    /* renamed from: d */
    public C86177e.C86178a mo120578d(Object obj) {
        C87412m.m108594g((View) obj, "view");
        return new C7168a();
    }

    /* renamed from: e */
    public Object mo120579e(JSONObject jSONObject) {
        C87412m.m108594g(jSONObject, "data");
        JSONObject optJSONObject = jSONObject.optJSONObject("position");
        boolean z = BuildInfo.DEBUG;
        C87412m.m108591d(optJSONObject);
        return new C88710f(C47167a.m52445b(Integer.valueOf(optJSONObject.optInt("x"))), C47167a.m52445b(Integer.valueOf(optJSONObject.optInt("y"))), C47167a.m52445b(Integer.valueOf(optJSONObject.optInt("width"))), C47167a.m52445b(Integer.valueOf(optJSONObject.optInt("height"))), optJSONObject.optInt("zIndex"));
    }
}
