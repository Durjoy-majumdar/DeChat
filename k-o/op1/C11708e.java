package op1;

import ak1.C54108o;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import di3.C86312j;
import gy3.C87412m;
import o40.C61926c;
import org.json.JSONObject;
import qo3.C77407n;
import z04.C112551y;

/* renamed from: op1.e */
public final class C11708e implements C77407n.C12924o {

    /* renamed from: a */
    public final /* synthetic */ String f34274a;

    /* renamed from: b */
    public final /* synthetic */ long f34275b;

    public C11708e(String str, long j) {
        this.f34274a = str;
        this.f34275b = j;
    }

    /* renamed from: a */
    public final void mo2362a() {
        Class cls = C54108o.class;
        if (this.f34274a.length() == 0) {
            JSONObject jSONObject = new JSONObject();
            long j = this.f34275b;
            jSONObject.put("type", "3");
            jSONObject.put("product", C61926c.m72691p(j));
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "this.toString()");
            ((C54108o) C86312j.m106911c(cls)).Yx0(C112551y.m153814n(jSONObject2, ",", ";", false));
            return;
        }
        JSONObject jSONObject3 = new JSONObject();
        long j2 = this.f34275b;
        String str = this.f34274a;
        jSONObject3.put("type", "7");
        jSONObject3.put("product", C61926c.m72691p(j2));
        jSONObject3.put(FFmpegMetadataRetriever.METADATA_KEY_COMMENT, str);
        String jSONObject4 = jSONObject3.toString();
        C87412m.m108593f(jSONObject4, "this.toString()");
        ((C54108o) C86312j.m106911c(cls)).Yx0(C112551y.m153814n(jSONObject4, ",", ";", false));
    }
}
