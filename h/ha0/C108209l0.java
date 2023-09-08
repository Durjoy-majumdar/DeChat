package ha0;

import com.tencent.maas.instamovie.MJAsyncTaskInfo;
import com.tencent.maas.instamovie.MJMovieOutroInfo;
import com.tencent.maas.instamovie.MJMovieSession;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C36570n;

/* renamed from: ha0.l0 */
public final class C108209l0 extends C87413o implements C32227p<MJMovieSession.OnTaskProgress, MJMovieSession.OnComplete, MJAsyncTaskInfo> {

    /* renamed from: d */
    public final /* synthetic */ String f324009d;

    /* renamed from: e */
    public final /* synthetic */ C108183c0 f324010e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108209l0(String str, C108183c0 c0Var) {
        super(2);
        this.f324009d = str;
        this.f324010e = c0Var;
    }

    public Object invoke(Object obj, Object obj2) {
        MJMovieSession.OnTaskProgress onTaskProgress = (MJMovieSession.OnTaskProgress) obj;
        MJMovieSession.OnComplete onComplete = (MJMovieSession.OnComplete) obj2;
        C87412m.m108594g(onTaskProgress, "onProgress");
        C87412m.m108594g(onComplete, "onComplete");
        Log.m105924i("MicroMsg.MaasMovieSessionManager", "recreateWithMusicID " + this.f324009d);
        C108183c0 c0Var = this.f324010e;
        MJAsyncTaskInfo recreateWithMusicID = c0Var.f323934a.recreateWithMusicID(this.f324009d, c0Var.f323936c, (MJMovieOutroInfo) ((C36570n) c0Var.f323937d).getValue(), onTaskProgress, onComplete);
        C87412m.m108593f(recreateWithMusicID, "movieSession.recreateWit…omplete\n                )");
        return recreateWithMusicID;
    }
}
