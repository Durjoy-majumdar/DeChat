package w33;

import com.tencent.p014mm.autogen.mmdata.rpt.video_background_eventStruct;
import e43.C107225c;
import gy3.C87412m;
import org.json.JSONArray;
import org.json.JSONObject;
import z04.C112551y;
import z04.C91602g0;

/* renamed from: w33.c0 */
public final class C111720c0 {

    /* renamed from: a */
    public static final C111720c0 f334432a = new C111720c0();

    /* renamed from: b */
    public static long f334433b;

    /* renamed from: c */
    public static long f334434c;

    /* renamed from: d */
    public static long f334435d;

    /* renamed from: e */
    public static long f334436e;

    /* renamed from: f */
    public static long f334437f;

    /* renamed from: g */
    public static long f334438g;

    /* renamed from: h */
    public static long f334439h;

    /* renamed from: i */
    public static JSONArray f334440i = new JSONArray();

    /* renamed from: a */
    public final void mo163399a() {
        JSONArray jSONArray;
        video_background_eventStruct video_background_eventstruct = new video_background_eventStruct();
        video_background_eventstruct.f310550d = f334433b;
        video_background_eventstruct.f310551e = f334434c;
        long j = f334435d;
        video_background_eventstruct.f310552f = j;
        video_background_eventstruct.f310553g = f334436e;
        video_background_eventstruct.f310554h = f334437f;
        video_background_eventstruct.f310555i = f334438g;
        video_background_eventstruct.f310556j = f334439h;
        if (j == 2) {
            jSONArray = f334440i;
        } else {
            C107225c cVar = C107225c.f320827a;
            jSONArray = C107225c.f320830d;
        }
        if (jSONArray.length() > 0 && f334437f > 0) {
            String jSONArray2 = jSONArray.toString();
            C87412m.m108593f(jSONArray2, "usageDetails.toString()");
            video_background_eventstruct.f310557k = video_background_eventstruct.mo86045b("Background_event", C91602g0.m114947o0(C112551y.m153814n(jSONArray2, ",", ";", false), 1024), true);
            video_background_eventstruct.mo86054n();
        }
        f334433b = 0;
        f334434c = 0;
        f334435d = 0;
        f334436e = 0;
        f334437f = 0;
        f334438g = 0;
        f334439h = 0;
        f334440i = new JSONArray();
    }

    /* renamed from: b */
    public final void mo163400b(int i, boolean z) {
        JSONArray jSONArray = f334440i;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("action", i);
        jSONObject.put("isFront", z ? 1 : 2);
        jSONObject.put("timeStamp", System.currentTimeMillis());
        jSONArray.put(jSONObject);
    }

    /* renamed from: c */
    public final void mo163401c(boolean z, boolean z2) {
        long j = 2;
        f334435d = z ? 2 : 1;
        if (z2) {
            j = 1;
        }
        f334436e = j;
        f334437f = System.currentTimeMillis();
    }
}
