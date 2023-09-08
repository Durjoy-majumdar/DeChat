package rs1;

import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import fy3.C32224a;
import gy3.C87413o;
import o40.C61926c;
import rx3.C13598b0;

/* renamed from: rs1.x */
public final class C63666x extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C63648v f180486d;

    /* renamed from: e */
    public final /* synthetic */ long f180487e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63666x(C63648v vVar, long j) {
        super(0);
        this.f180486d = vVar;
        this.f180487e = j;
    }

    public Object invoke() {
        MultiTaskInfo remove = this.f180486d.f180442h.remove(Long.valueOf(this.f180487e));
        if (remove != null) {
            C61926c.m72668M(new C63661w(this.f180486d, remove));
        }
        return C13598b0.f38549a;
    }
}
