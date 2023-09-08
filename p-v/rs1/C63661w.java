package rs1;

import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import yl1.C66663a;

/* renamed from: rs1.w */
public final class C63661w extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C63648v f180480d;

    /* renamed from: e */
    public final /* synthetic */ MultiTaskInfo f180481e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63661w(C63648v vVar, MultiTaskInfo multiTaskInfo) {
        super(0);
        this.f180480d = vVar;
        this.f180481e = multiTaskInfo;
    }

    public Object invoke() {
        C66663a aVar = this.f180480d.f180438d;
        if (aVar != null) {
            aVar.f326418a = this.f180481e;
            aVar.mo160072I();
            return C13598b0.f38549a;
        }
        C87412m.m108603p("multiTaskHelper");
        throw null;
    }
}
