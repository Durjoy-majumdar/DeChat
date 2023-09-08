package ha0;

import com.tencent.maas.instamovie.MJMovieSession;
import com.tencent.maas.instamovie.base.MJError;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: ha0.g */
public final class C108201g extends C87413o implements C32226l<MJError, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ MJMovieSession.OnComplete f323996d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108201g(MJMovieSession.OnComplete onComplete) {
        super(1);
        this.f323996d = onComplete;
    }

    public Object invoke(Object obj) {
        this.f323996d.onComplete((MJError) obj);
        return C13598b0.f38549a;
    }
}
