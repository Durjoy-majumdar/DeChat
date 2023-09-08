package ha0;

import com.tencent.maas.instamovie.MJAsyncTaskInfo;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import ja0.C108679b;
import rx3.C13598b0;

/* renamed from: ha0.d */
public final class C108192d extends C87413o implements C32226l<Throwable, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f323965d;

    /* renamed from: e */
    public final /* synthetic */ long f323966e;

    /* renamed from: f */
    public final /* synthetic */ C32226l<MJAsyncTaskInfo, C13598b0> f323967f;

    /* renamed from: g */
    public final /* synthetic */ MJAsyncTaskInfo f323968g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108192d(String str, long j, C32226l<? super MJAsyncTaskInfo, C13598b0> lVar, MJAsyncTaskInfo mJAsyncTaskInfo) {
        super(1);
        this.f323965d = str;
        this.f323966e = j;
        this.f323967f = lVar;
        this.f323968g = mJAsyncTaskInfo;
    }

    public Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        C108679b bVar = C108679b.f325464a;
        String str = this.f323965d;
        C87412m.m108594g(str, "funName");
        bVar.mo159696c(100, str, "cancel", System.currentTimeMillis() - this.f323966e);
        C32226l<MJAsyncTaskInfo, C13598b0> lVar = this.f323967f;
        if (lVar != null) {
            lVar.invoke(this.f323968g);
        }
        return C13598b0.f38549a;
    }
}
