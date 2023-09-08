package i23;

import com.tencent.p014mm.autogen.mmdata.rpt.FinderPageExposeStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import eb0.C75592q0;
import gy3.C87412m;
import h81.C59774i;
import org.json.JSONObject;
import te3.C49712hj1;
import z04.C112551y;

/* renamed from: i23.a */
public final class C8847a {

    /* renamed from: a */
    public static final C8847a f28097a = new C8847a();

    /* renamed from: a */
    public static void m8677a(C8847a aVar, int i, int i2, long j, int i3, JSONObject jSONObject, String str, C49712hj1 hj12, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            j = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = -1;
        }
        if ((i4 & 16) != 0) {
            jSONObject = null;
        }
        if ((i4 & 32) != 0) {
            str = null;
        }
        if ((i4 & 64) != 0) {
            hj12 = null;
        }
        aVar.getClass();
        FinderPageExposeStruct finderPageExposeStruct = new FinderPageExposeStruct();
        finderPageExposeStruct.mo1036z(((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb());
        finderPageExposeStruct.mo1030t(String.valueOf(i));
        finderPageExposeStruct.f9879g = i2;
        finderPageExposeStruct.mo1031u(String.valueOf(System.currentTimeMillis()));
        finderPageExposeStruct.mo1033w(C75592q0.m90778h());
        finderPageExposeStruct.f9885m = j;
        finderPageExposeStruct.mo1034x(str != null ? C112551y.m153814n(str, ",", ";", false) : "");
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (i3 != -1 && i2 == 1) {
            jSONObject.put("nextstep", i3);
        }
        if (hj12 != null) {
            finderPageExposeStruct.mo1032v(hj12.f134671e);
            finderPageExposeStruct.mo1029s(hj12.f134672f);
            finderPageExposeStruct.mo1035y(String.valueOf(hj12.f134677n));
        }
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "udfJson.toString()");
        finderPageExposeStruct.mo1028A(C112551y.m153814n(jSONObject2, ",", ";", false));
        finderPageExposeStruct.mo86054n();
        Log.m105924i("MicroMsg.FinderReport21874", "FinderReport21874 report scene:" + i + " eventCode:" + i2);
    }
}
