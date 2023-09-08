package e93;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Map;
import t83.C13851h1;
import t83.C13853i;
import t83.C13855j;
import w83.C15053a;

/* renamed from: e93.i */
public final class C7605i implements C13853i {

    /* renamed from: b */
    public static final C7605i f25872b = new C7605i();

    /* renamed from: c */
    public static Map<String, C15053a> f25873c = new HashMap();

    /* renamed from: a */
    public boolean mo8735a(C13855j jVar, C13851h1 h1Var) {
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        if (((HashMap) f25873c).containsKey(h1Var.f38996i)) {
            Object obj = ((HashMap) f25873c).get(h1Var.f38996i);
            C87412m.m108591d(obj);
            C15053a aVar = (C15053a) obj;
            if (jVar.mo13185e(aVar.mo7287b())) {
                aVar.mo7286a(jVar, h1Var);
                return true;
            }
            Log.m105920e("MicroMsg.WebPrefetcherJsApiPool", "handleMsg access denied func: " + h1Var.f38996i);
            if (C87412m.m108589b(h1Var.f38996i, "log")) {
                return true;
            }
            jVar.f39001d.mo10774a(h1Var.f38990c, "system:access_denied", (Map<String, Object>) null);
            return true;
        }
        jVar.f39001d.mo10774a(h1Var.f38990c, "system:function_not_exist", (Map<String, Object>) null);
        return false;
    }

    /* renamed from: b */
    public boolean mo8736b(C13855j jVar, C13851h1 h1Var) {
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        return (((HashMap) f25873c).isEmpty() ^ true) && C87412m.m108589b(jVar.f39001d.mo13177c(), this);
    }
}
