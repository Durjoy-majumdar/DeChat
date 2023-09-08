package ha0;

import com.tencent.maas.camerafun.MJCamFunSession;
import com.tencent.maas.instamovie.MJAsyncTaskInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: ha0.s */
public final class C108219s extends C87413o implements C32227p<MJCamFunSession.OnProgress, MJCamFunSession.OnOptionsComplete, MJAsyncTaskInfo> {

    /* renamed from: d */
    public final /* synthetic */ C108210m f324027d;

    /* renamed from: e */
    public final /* synthetic */ String f324028e;

    /* renamed from: f */
    public final /* synthetic */ MJCamFunSession.OnProgress f324029f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108219s(C108210m mVar, String str, MJCamFunSession.OnProgress onProgress) {
        super(2);
        this.f324027d = mVar;
        this.f324028e = str;
        this.f324029f = onProgress;
    }

    public Object invoke(Object obj, Object obj2) {
        MJCamFunSession.OnProgress onProgress = (MJCamFunSession.OnProgress) obj;
        MJCamFunSession.OnOptionsComplete onOptionsComplete = (MJCamFunSession.OnOptionsComplete) obj2;
        C87412m.m108594g(onProgress, "originOnProgress");
        C87412m.m108594g(onOptionsComplete, "onOptionsComplete");
        Log.m105924i("MicroMsg.CamFunSessionManager", "switchToTemplate");
        MJCamFunSession mJCamFunSession = this.f324027d.f324011a;
        String str = this.f324028e;
        MJCamFunSession.OnProgress onProgress2 = this.f324029f;
        if (onProgress2 != null) {
            onProgress = onProgress2;
        }
        MJAsyncTaskInfo switchToTemplate = mJCamFunSession.switchToTemplate(str, onProgress, onOptionsComplete);
        C87412m.m108593f(switchToTemplate, "camFunSession.switchToTe…gress, onOptionsComplete)");
        return switchToTemplate;
    }
}
