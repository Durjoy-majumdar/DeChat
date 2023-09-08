package mi2;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Map;
import t83.C13851h1;
import t83.C13853i;
import t83.C13855j;
import w83.C15053a;

/* renamed from: mi2.e */
public final class C10897e implements C13853i {

    /* renamed from: b */
    public static final C10897e f32521b = new C10897e();

    /* renamed from: c */
    public static Map<String, C15053a> f32522c = new HashMap();

    /* renamed from: a */
    public boolean mo8735a(C13855j jVar, C13851h1 h1Var) {
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        if (((HashMap) f32522c).containsKey(h1Var.f38996i)) {
            Object obj = ((HashMap) f32522c).get(h1Var.f38996i);
            C87412m.m108591d(obj);
            C15053a aVar = (C15053a) obj;
            Log.m105919d("MicroMsg.SelectTextJsApiPool", "handleMsg :%s", Integer.valueOf(aVar.mo7287b()));
            if (aVar.mo7287b() == 10004) {
                aVar.mo7286a(jVar, h1Var);
            } else {
                Log.m105920e("MicroMsg.SelectTextJsApiPool", "handleMsg access denied func: " + h1Var.f38996i);
                jVar.f39001d.mo10774a(h1Var.f38990c, "system:access_denied", (Map<String, Object>) null);
            }
        }
        return true;
    }

    /* renamed from: b */
    public boolean mo8736b(C13855j jVar, C13851h1 h1Var) {
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        return (((HashMap) f32522c).isEmpty() ^ true) && C87412m.m108589b(jVar.f39001d.mo13177c(), this);
    }
}
