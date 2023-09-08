package st1;

import com.tencent.p014mm.plugin.fingerprint.FingerPrintAuth;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import p156gj.C87203t;
import st1.C77759g0;

/* renamed from: st1.f0 */
public class C77758f0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C77759g0 f226586d;

    public C77758f0(C77759g0 g0Var) {
        this.f226586d = g0Var;
    }

    public void run() {
        String str;
        if (C77770n.m93841c()) {
            Log.m105924i("MicroMsg.SyncGenRsaKey", "device is support FingerPrintAuth");
            str = FingerPrintAuth.genRsaKey(C77770n.m93839a(MMApplicationContext.getContext()), C77770n.m93840b(), C87203t.m108273i());
        } else {
            Log.m105920e("MicroMsg.SyncGenRsaKey", "device is not support FingerPrintAuth");
            str = "";
        }
        C77759g0.C77760a aVar = this.f226586d.f226587a;
        if (aVar != null) {
            aVar.mo107895a(str);
        }
    }
}
