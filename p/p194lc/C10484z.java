package p194lc;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedList;
import org.json.JSONObject;
import rx3.C13598b0;
import z04.C112551y;

/* renamed from: lc.z */
public final class C10484z extends C87413o implements C32226l<Object, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ LinkedList<JSONObject> f31725d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10484z(LinkedList<JSONObject> linkedList) {
        super(1);
        this.f31725d = linkedList;
    }

    public Object invoke(Object obj) {
        C87412m.m108594g(obj, LocaleUtil.ITALIAN);
        if (obj instanceof JSONObject) {
            String optString = ((JSONObject) obj).optString("param_name");
            C87412m.m108593f(optString, "it.optString(\"param_name\")");
            if (C112551y.m153819s(optString, "wx_wxapp_expt_skyline", false)) {
                this.f31725d.add(obj);
            }
        }
        return C13598b0.f38549a;
    }
}
