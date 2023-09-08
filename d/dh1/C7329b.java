package dh1;

import ak1.C0073g0;
import ak1.C54067f0;
import ak1.C54108o;
import ak1.C54116w;
import cl1.C54991o;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C7335d;
import di3.C86312j;
import fj1.C45795b;
import gy3.C87412m;
import ht1.C8777j5;
import ok1.C62042e;
import org.json.JSONObject;

/* renamed from: dh1.b */
public final class C7329b {

    /* renamed from: a */
    public static final C7329b f25441a = new C7329b();

    /* renamed from: b */
    public static /* synthetic */ void m7473b(C7329b bVar, C45795b bVar2, int i, int i2, String str, int i3, int i4, Object obj) {
        int i5 = (i4 & 4) != 0 ? -1 : i2;
        if ((i4 & 8) != 0) {
            str = "";
        }
        bVar.mo8500a(bVar2, i, i5, str, (i4 & 16) != 0 ? -1 : i3);
    }

    /* renamed from: c */
    public static void m7474c(C7329b bVar, C45795b bVar2, int i, int i2, String str, int i3, String str2, int i4, int i5, Object obj) {
        int i6 = i;
        int i7 = -1;
        int i8 = (i5 & 4) != 0 ? -1 : i2;
        String str3 = (i5 & 8) != 0 ? "" : str;
        int i9 = (i5 & 16) != 0 ? -1 : i3;
        String str4 = (i5 & 32) != 0 ? null : str2;
        if ((i5 & 64) == 0) {
            i7 = i4;
        }
        bVar.getClass();
        C87412m.m108594g(bVar2, "liveData");
        C87412m.m108594g(str3, "extra");
        Log.m105924i("FinderLivePromoteReportHelper", "#reportVisitorAction result=" + i6 + " type=" + i8 + " extra=" + str3 + " adType=" + i9 + " coupon_id=" + str4 + " source_type=" + i7);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("result", i6);
        if (i8 > 0) {
            jSONObject.put("type", i8);
        }
        boolean z = false;
        if (str3.length() > 0) {
            jSONObject.put("extra", str3);
        }
        if (i9 > 0) {
            jSONObject.put("advertisement_type", i9);
        }
        if (str4 != null) {
            if (str4.length() > 0) {
                z = true;
            }
        }
        if (z) {
            jSONObject.put("coupon_id", str4);
        }
        if (i8 >= 0) {
            jSONObject.put("source_type", i7);
        }
        if (C62042e.f176370a.mo87027N0()) {
            C7335d c = C86312j.m106911c(C54108o.class);
            C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
            C8777j5.C8778a.m8605f((C8777j5) c, C0073g0.PROMOTE_ANCHOR, jSONObject.toString(), (String) null, 4, (Object) null);
            return;
        }
        C54116w wVar = (C54116w) C86312j.m106911c(C54116w.class);
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "js.toString()");
        wVar.getClass();
        C54116w.Ex0(wVar, C54067f0.C54076o0.PROMOTE_VISITOR, jSONObject2, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
    }

    /* renamed from: a */
    public final void mo8500a(C45795b bVar, int i, int i2, String str, int i3) {
        Class cls = C54108o.class;
        C87412m.m108594g(bVar, "liveData");
        C87412m.m108594g(str, "extra");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("result", i);
        if (i2 > 0) {
            jSONObject.put("type", i2);
        }
        if (str.length() > 0) {
            jSONObject.put("extra", str);
        }
        if (i3 > 0) {
            jSONObject.put("advertisement_type", i3);
        }
        if (!((C54991o) bVar.mo71262a(C54991o.class)).f154186C) {
            C7335d c = C86312j.m106911c(cls);
            C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
            C8777j5.C8778a.m8600a((C8777j5) c, 29, jSONObject.toString(), (String) null, 4, (Object) null);
            return;
        }
        C7335d c2 = C86312j.m106911c(cls);
        C87412m.m108593f(c2, "getService(HellLiveReport::class.java)");
        C8777j5.C8778a.m8605f((C8777j5) c2, C0073g0.PROMOTE_ANCHOR, jSONObject.toString(), (String) null, 4, (Object) null);
    }
}
