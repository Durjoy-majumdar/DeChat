package dt2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import fy3.C32226l;
import gy3.C87413o;
import nr3.C89059e;
import rx3.C13598b0;

/* renamed from: dt2.c */
public final class C45452c extends C87413o implements C32226l<Throwable, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C89059e<C13598b0> f123023d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45452c(C89059e<C13598b0> eVar) {
        super(1);
        this.f123023d = eVar;
    }

    public Object invoke(Object obj) {
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.cover.cgi.SnsCgi$await$2$1");
        Throwable th = (Throwable) obj;
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.cover.cgi.SnsCgi$await$2$1");
        this.f123023d.dead();
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.cover.cgi.SnsCgi$await$2$1");
        C13598b0 b0Var = C13598b0.f38549a;
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.cover.cgi.SnsCgi$await$2$1");
        return b0Var;
    }
}
