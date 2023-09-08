package t83;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Map;
import rx3.C13601g;
import rx3.C36570n;
import w83.C15053a;
import xk2.C15803a;

/* renamed from: t83.j1 */
public final class C13856j1 implements C13853i {

    /* renamed from: b */
    public static final C13856j1 f39003b = new C13856j1();

    /* renamed from: c */
    public static Map<String, C15053a> f39004c = new HashMap();

    static {
        C13601g gVar = C15803a.f42576a;
        Map map = (Map) ((C36570n) C15803a.f42576a).getValue();
        C87412m.m108594g(map, "jsApiList");
        f39004c.clear();
        f39004c.putAll(map);
    }

    /* renamed from: a */
    public boolean mo8735a(C13855j jVar, C13851h1 h1Var) {
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        if (((HashMap) f39004c).containsKey(h1Var.f38996i)) {
            Object obj = ((HashMap) f39004c).get(h1Var.f38996i);
            C87412m.m108591d(obj);
            C15053a aVar = (C15053a) obj;
            if (aVar.mo7287b() == 10007) {
                aVar.mo7286a(jVar, h1Var);
            } else {
                Log.m105920e("MicroMsg.ScanWebViewJsApiPool", "handleMsg access denied func: " + h1Var.f38996i);
                jVar.f39001d.mo10774a(h1Var.f38990c, "system:access_denied", (Map<String, Object>) null);
            }
        }
        return true;
    }

    /* renamed from: b */
    public boolean mo8736b(C13855j jVar, C13851h1 h1Var) {
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        return (((HashMap) f39004c).isEmpty() ^ true) && C87412m.m108589b(jVar.f39001d.mo13177c(), this);
    }
}
