package l22;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import java.util.Map;
import t83.C13851h1;
import t83.C13853i;
import t83.C13855j;
import w83.C15053a;
import z93.C16131d;

/* renamed from: l22.f */
public class C10458f implements C13853i {

    /* renamed from: b */
    public static final HashMap<String, C15053a> f31692b;

    /* renamed from: c */
    public static C10458f f31693c = null;

    static {
        HashMap<String, C15053a> hashMap = new HashMap<>();
        f31692b = hashMap;
        C16131d dVar = C16131d.f43319d;
        dVar.getClass();
        hashMap.put(C16131d.f43321f, dVar);
    }

    /* renamed from: a */
    public boolean mo8735a(C13855j jVar, C13851h1 h1Var) {
        HashMap<String, C15053a> hashMap = f31692b;
        if (!hashMap.containsKey(h1Var.f38996i)) {
            return false;
        }
        C15053a aVar = hashMap.get(h1Var.f38996i);
        if (aVar == null || !jVar.mo13185e(aVar.mo7287b())) {
            Log.m105921e("LiteAppWebViewJsApiPool", "handleMsg access denied func: %s", h1Var.f38996i);
            jVar.f39001d.mo10774a(h1Var.f38990c, "system:access_denied", (Map<String, Object>) null);
        } else {
            aVar.mo7286a(jVar, h1Var);
        }
        return true;
    }

    /* renamed from: b */
    public boolean mo8736b(C13855j jVar, C13851h1 h1Var) {
        return !f31692b.isEmpty() && jVar.f39001d.mo13177c() == this;
    }
}
