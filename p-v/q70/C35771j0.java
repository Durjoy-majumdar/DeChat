package q70;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import org.json.JSONObject;
import p723vf.C118672d;
import rx3.C13598b0;

/* renamed from: q70.j0 */
public final class C35771j0 extends C87413o implements C32226l<Object, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ JSONObject f95540d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C35771j0(JSONObject jSONObject) {
        super(1);
        this.f95540d = jSONObject;
    }

    public Object invoke(Object obj) {
        C87412m.m108594g(obj, LocaleUtil.ITALIAN);
        try {
            this.f95540d.put("hprof", (String) obj);
        } catch (Throwable th) {
            C118672d.m167354d("MicroMsg.monitor.ProcBackgroundMemory", th, "", new Object[0]);
        }
        return C13598b0.f38549a;
    }
}
