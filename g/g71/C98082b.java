package g71;

import com.tencent.p014mm.plugin.emojicapture.p841ui.capture.CaptureContainer;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;
import y61.C102811a;

/* renamed from: g71.b */
public final class C98082b extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ CaptureContainer f287551d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C98082b(CaptureContainer captureContainer) {
        super(0);
        this.f287551d = captureContainer;
    }

    public Object invoke() {
        this.f287551d.f269222g.mo138247c();
        C102811a presenter = this.f287551d.getPresenter();
        if (presenter != null) {
            presenter.stopRecord();
        }
        return C13598b0.f38549a;
    }
}
