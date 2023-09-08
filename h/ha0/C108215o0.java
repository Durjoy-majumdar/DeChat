package ha0;

import com.tencent.maas.instamovie.MJAsyncTaskInfo;
import com.tencent.maas.instamovie.MJMovieOptions;
import com.tencent.maas.instamovie.MJMovieOutroInfo;
import com.tencent.maas.instamovie.MJMovieSession;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import la0.C61242a;
import rx3.C36570n;

/* renamed from: ha0.o0 */
public final class C108215o0 extends C87413o implements C32227p<MJMovieSession.OnTaskProgress, MJMovieSession.OnComplete, MJAsyncTaskInfo> {

    /* renamed from: d */
    public final /* synthetic */ String f324021d;

    /* renamed from: e */
    public final /* synthetic */ C108183c0 f324022e;

    /* renamed from: f */
    public final /* synthetic */ String f324023f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108215o0(String str, C108183c0 c0Var, String str2) {
        super(2);
        this.f324021d = str;
        this.f324022e = c0Var;
        this.f324023f = str2;
    }

    public Object invoke(Object obj, Object obj2) {
        MJMovieSession.OnTaskProgress onTaskProgress = (MJMovieSession.OnTaskProgress) obj;
        MJMovieSession.OnComplete onComplete = (MJMovieSession.OnComplete) obj2;
        C87412m.m108594g(onTaskProgress, "onProgress");
        C87412m.m108594g(onComplete, "onComplete");
        Log.m105924i("MicroMsg.MaasMovieSessionManager", "recreateWithTemplateID " + this.f324021d);
        C108183c0 c0Var = this.f324022e;
        C61242a.C61245c cVar = c0Var.f323935b;
        if (cVar.f174321h) {
            MJMovieOptions mJMovieOptions = c0Var.f323936c;
            List<String> list = cVar.f174322i;
            boolean z = true;
            if (list == null || !list.contains(this.f324021d)) {
                z = false;
            }
            mJMovieOptions.setShouldAutoRecommendBGM(z);
        }
        C108183c0 c0Var2 = this.f324022e;
        MJAsyncTaskInfo recreateWithTemplate = c0Var2.f323934a.recreateWithTemplate(this.f324021d, this.f324023f, c0Var2.f323936c, (MJMovieOutroInfo) ((C36570n) c0Var2.f323937d).getValue(), onTaskProgress, onComplete);
        C87412m.m108593f(recreateWithTemplate, "movieSession.recreateWit…omplete\n                )");
        return recreateWithTemplate;
    }
}
