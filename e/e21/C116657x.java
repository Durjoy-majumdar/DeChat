package e21;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import java.util.Map;
import ob0.C11385n;
import ob0.C117747y;
import te3.C118466sp;

/* renamed from: e21.x */
public class C116657x implements C11385n {

    /* renamed from: e */
    public static C116657x f349796e;

    /* renamed from: d */
    public Map<C116641h0, C116658a> f349797d = new HashMap();

    /* renamed from: e21.x$a */
    public interface C116658a {
        /* renamed from: a */
        void mo175118a(boolean z, C118466sp spVar);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar instanceof C116641h0) {
            C116641h0 h0Var = (C116641h0) yVar;
            C116658a aVar = (C116658a) ((HashMap) this.f349797d).get(yVar);
            if (aVar == null) {
                Log.m105928w("MicroMsg.F2fGetPayUrlManager", "no match callback");
                return;
            }
            if (i == 0 && i2 == 0) {
                aVar.mo175118a(true, h0Var.f349748e);
            } else {
                Log.m105921e("MicroMsg.F2fGetPayUrlManager", "net error: %s", h0Var);
                aVar.mo175118a(false, h0Var.f349748e);
            }
            ((HashMap) this.f349797d).remove(yVar);
        }
    }
}
