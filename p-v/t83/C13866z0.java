package t83;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Iterator;

/* renamed from: t83.z0 */
public class C13866z0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C13851h1 f39028d;

    /* renamed from: e */
    public final /* synthetic */ C48590l f39029e;

    public C13866z0(C48590l lVar, C13851h1 h1Var) {
        this.f39029e = lVar;
        this.f39028d = h1Var;
    }

    public void run() {
        C48590l lVar = this.f39029e;
        C13851h1 h1Var = this.f39028d;
        lVar.getClass();
        if (h1Var != null) {
            if (Util.isEqual("log", h1Var.f38996i)) {
                lVar.f130000e.add(h1Var);
                return;
            }
            Iterator<C13851h1> it = lVar.f130000e.iterator();
            while (it.hasNext()) {
                C13851h1 next = it.next();
                if (next != null && Util.isEqual(next.f38996i, h1Var.f38996i)) {
                    Log.m105925i("MicroMsg.JsApiHandler", "addToMsgQueue fail, already has this function %s", h1Var.f38996i);
                    return;
                }
            }
            lVar.f130000e.add(h1Var);
        }
    }
}
