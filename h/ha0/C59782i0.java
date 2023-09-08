package ha0;

import com.tencent.maas.instamovie.MJAsyncTaskInfo;
import com.tencent.maas.instamovie.MJMovieSession;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: ha0.i0 */
public final class C59782i0 extends C87413o implements C32227p<MJMovieSession.OnTaskProgress, MJMovieSession.OnComplete, MJAsyncTaskInfo> {

    /* renamed from: d */
    public final /* synthetic */ C108183c0 f170674d;

    /* renamed from: e */
    public final /* synthetic */ String f170675e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59782i0(C108183c0 c0Var, String str) {
        super(2);
        this.f170674d = c0Var;
        this.f170675e = str;
    }

    public Object invoke(Object obj, Object obj2) {
        MJMovieSession.OnTaskProgress onTaskProgress = (MJMovieSession.OnTaskProgress) obj;
        MJMovieSession.OnComplete onComplete = (MJMovieSession.OnComplete) obj2;
        C87412m.m108594g(onTaskProgress, "onProgress");
        C87412m.m108594g(onComplete, "onComplete");
        Log.m105924i("MicroMsg.MaasMovieSessionManager", "recreateWithBlankTemplate");
        C108183c0 c0Var = this.f170674d;
        MJAsyncTaskInfo recreateUsingBlankTemplate = c0Var.f323934a.recreateUsingBlankTemplate(this.f170675e, c0Var.f323936c, onTaskProgress, onComplete);
        C87412m.m108593f(recreateUsingBlankTemplate, "movieSession.recreateUsi…omplete\n                )");
        return recreateUsingBlankTemplate;
    }
}
