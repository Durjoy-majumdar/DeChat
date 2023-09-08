package dp1;

import android.content.Context;
import bl3.C39818r;
import com.tencent.p014mm.autogen.mmdata.rpt.finder_page_exposeStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import eb0.C31543z5;
import gy3.C87412m;
import h81.C59774i;
import org.json.JSONObject;
import rs1.C13442s8;
import te3.C49712hj1;
import z04.C112551y;

/* renamed from: dp1.w0 */
public final class C58414w0 {

    /* renamed from: a */
    public static final C58414w0 f167348a = new C58414w0();

    /* renamed from: a */
    public final void mo83274a(Context context, JSONObject jSONObject, boolean z, long j, long j2, C49712hj1 hj12) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(jSONObject, "udfKv");
        if (hj12 == null) {
            hj12 = ((C13442s8) C39818r.f106831a.mo62443b(context).mo75002a(C13442s8.class)).mo12861q3();
        }
        finder_page_exposeStruct finder_page_exposestruct = new finder_page_exposeStruct();
        String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
        String str = "";
        if (Wb == null) {
            Wb = str;
        }
        finder_page_exposestruct.f156965d = finder_page_exposestruct.mo86045b("sessionid", Wb, true);
        String str2 = hj12.f134671e;
        if (str2 == null) {
            str2 = str;
        }
        finder_page_exposestruct.f156966e = finder_page_exposestruct.mo86045b("findercontextid", str2, true);
        String str3 = hj12.f134672f;
        if (str3 != null) {
            str = str3;
        }
        finder_page_exposestruct.f156972k = finder_page_exposestruct.mo86045b("clicktabcontextid", str, true);
        finder_page_exposestruct.f156973l = finder_page_exposestruct.mo86045b("ref_commentscene", String.valueOf(hj12.f134677n), true);
        finder_page_exposestruct.f156967f = finder_page_exposestruct.mo86045b("commentscene", "59", true);
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "udfKv.toString()");
        finder_page_exposestruct.f156971j = finder_page_exposestruct.mo86045b("udf_kv", C112551y.m153814n(jSONObject2, ",", ";", false), true);
        finder_page_exposestruct.f156968g = z ^ true ? 1 : 0;
        if (j2 != -1) {
            finder_page_exposestruct.f156969h = finder_page_exposestruct.mo86045b("event_time", String.valueOf(j2), true);
        } else {
            finder_page_exposestruct.f156969h = finder_page_exposestruct.mo86045b("event_time", String.valueOf(C31543z5.m39453c()), true);
        }
        finder_page_exposestruct.f156974m = j;
        finder_page_exposestruct.mo86054n();
        Log.m105924i("report21874", "下面是我本次做的上报");
        ((C58417y0) C86312j.m106911c(C58417y0.class)).Ec0(finder_page_exposestruct);
    }
}
