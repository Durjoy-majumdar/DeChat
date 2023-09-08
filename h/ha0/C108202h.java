package ha0;

import com.tencent.maas.instamovie.MJMovieSession;
import com.tencent.maas.instamovie.base.MJError;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: ha0.h */
public final class C108202h extends C87413o implements C32226l<MJMovieSession.OnComplete, MJError> {

    /* renamed from: d */
    public final /* synthetic */ C32226l<C32226l<? super MJError, C13598b0>, MJError> f323997d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108202h(C32226l<? super C32226l<? super MJError, C13598b0>, ? extends MJError> lVar) {
        super(1);
        this.f323997d = lVar;
    }

    public Object invoke(Object obj) {
        MJMovieSession.OnComplete onComplete = (MJMovieSession.OnComplete) obj;
        C87412m.m108594g(onComplete, "onComplete");
        return this.f323997d.invoke(new C108201g(onComplete));
    }
}
