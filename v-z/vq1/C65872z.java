package vq1;

import com.tencent.p014mm.autogen.events.FeedUpdateEvent;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: vq1.z */
public final class C65872z extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C52981a0 f189420d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65872z(C52981a0 a0Var) {
        super(0);
        this.f189420d = a0Var;
    }

    public Object invoke() {
        C65866w.f189407h.mo89911j(this.f189420d);
        FeedUpdateEvent feedUpdateEvent = new FeedUpdateEvent();
        feedUpdateEvent.f9173d.f9174a = this.f189420d.f147871c;
        feedUpdateEvent.publish();
        return C13598b0.f38549a;
    }
}
