package b23;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import org.json.JSONObject;
import rx3.C13598b0;

/* renamed from: b23.b */
public final class C92167b extends C87413o implements C32226l<JSONObject, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ int f263794d;

    /* renamed from: e */
    public final /* synthetic */ C8479f0<JSONObject> f263795e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92167b(int i, C8479f0<JSONObject> f0Var) {
        super(1);
        this.f263794d = i;
        this.f263795e = f0Var;
    }

    public Object invoke(Object obj) {
        T t = (JSONObject) obj;
        C87412m.m108594g(t, LocaleUtil.ITALIAN);
        C92168c cVar = C92168c.f263796a;
        if (t.optInt("key", -1) == this.f263794d) {
            this.f263795e.f27484d = t;
        }
        return C13598b0.f38549a;
    }
}
