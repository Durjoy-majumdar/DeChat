package p517fa;

import android.content.Context;
import com.tencent.kinda.debug.api.IKindaReloadFeatureService;
import com.tencent.kinda.framework.WxCrossServices;
import com.tencent.kinda.framework.app.SubCoreKinda;
import com.tencent.kinda.framework.boot.KindaApp;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import ei3.C86522b;
import f40.C86709a0;
import zt3.C119157j;

@C86522b(dependencies = {IKindaReloadFeatureService.class, SubCoreKinda.class}, onProcess = {C80625v0.MATCH_MM})
/* renamed from: fa.k */
public class C31977k extends C86301e {

    /* renamed from: fa.k$a */
    public class C31978a implements Runnable {
        public C31978a(C31977k kVar) {
        }

        public void run() {
            try {
                if (C86709a0.m107531m().mo58407a().mo71804b() && WxCrossServices.isKindaEnabled()) {
                    KindaApp.appKinda().applicationRestart();
                }
            } catch (Exception | UnsatisfiedLinkError e) {
                Log.printErrStackTrace("MicroMsg.WxKindaApiFeatureService", e, "", new Object[0]);
            }
        }
    }

    public void onAccountInitialized(Context context) {
        WxCrossServices.judgeReprot();
        ((C119157j) C119157j.f356862d).mo183875f(new C31978a(this));
    }
}
