package g71;

import android.view.View;
import com.tencent.p014mm.plugin.emojicapture.p841ui.capture.CaptureContainer;
import fy3.C32224a;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;

/* renamed from: g71.c */
public final class C8241c extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ boolean f27169d;

    /* renamed from: e */
    public final /* synthetic */ CaptureContainer f27170e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8241c(boolean z, CaptureContainer captureContainer) {
        super(0);
        this.f27169d = z;
        this.f27170e = captureContainer;
    }

    public Object invoke() {
        if (this.f27169d) {
            View view = this.f27170e.f269225j;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/emojicapture/ui/capture/CaptureContainer$toggleFlipCamera$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/emojicapture/ui/capture/CaptureContainer$toggleFlipCamera$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            View view3 = this.f27170e.f269225j;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/emojicapture/ui/capture/CaptureContainer$toggleFlipCamera$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/emojicapture/ui/capture/CaptureContainer$toggleFlipCamera$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return C13598b0.f38549a;
    }
}
