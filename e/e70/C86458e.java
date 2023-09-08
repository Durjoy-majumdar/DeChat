package e70;

import e42.C86428f;
import f70.C86770d;
import fy3.C32226l;
import gy3.C87412m;
import i70.C87667c;
import java.lang.ref.WeakReference;
import l10.C24931h;
import m70.C88702b;
import org.json.JSONObject;
import rx3.C13598b0;

/* renamed from: e70.e */
public final class C86458e<T extends C86428f<C86457d>> extends C88702b<C86457d, T> {
    /* renamed from: e */
    public String mo16e() {
        return "insertFrameSet";
    }

    /* renamed from: w */
    public void mo120879w(JSONObject jSONObject, C32226l<? super C86457d, C13598b0> lVar) {
        C87412m.m108594g(jSONObject, "data");
        C87412m.m108594g(lVar, "callback");
        C24931h.C24932a.C24934b f = C24931h.C24932a.f71047n.toBuilder();
        int s = mo123142s(jSONObject);
        boolean z = true;
        f.f71056d |= 1;
        f.f71057e = s;
        f.onChanged();
        String optString = jSONObject.optString("frameSetName");
        optString.getClass();
        f.f71056d |= 2;
        f.f71058f = optString;
        f.onChanged();
        String optString2 = jSONObject.optString("containerTag");
        C87412m.m108593f(optString2, "data.optString(\"containerTag\")");
        f.f71056d |= 4;
        f.f71059g = optString2;
        f.onChanged();
        if (jSONObject.optInt("hide") <= 1) {
            z = false;
        }
        f.f71056d |= 16;
        f.f71062j = z;
        f.onChanged();
        lVar.invoke(new C86457d(f, (WeakReference<? extends C86770d<? extends C86428f<C86457d>, ? extends C87667c<C86457d, ? extends C86428f<C86457d>>>>) null));
    }
}
