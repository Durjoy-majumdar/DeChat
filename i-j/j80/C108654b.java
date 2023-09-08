package j80;

import a14.C53973z1;
import android.view.View;
import com.tencent.p014mm.media.camera.view.control.CameraFocusAndMeteringView;
import fy3.C32224a;
import gy3.C87413o;
import j20.C117292a;
import java.util.concurrent.CancellationException;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;

/* renamed from: j80.b */
public final class C108654b extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ CameraFocusAndMeteringView f325394d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108654b(CameraFocusAndMeteringView cameraFocusAndMeteringView) {
        super(0);
        this.f325394d = cameraFocusAndMeteringView;
    }

    public Object invoke() {
        C108655d dVar = this.f325394d.f310723h;
        View view = dVar instanceof View ? (View) dVar : null;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/media/camera/view/control/CameraFocusAndMeteringView$resetFocusView$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/media/camera/view/control/CameraFocusAndMeteringView$resetFocusView$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        C108655d dVar2 = this.f325394d.f310723h;
        if (dVar2 != null) {
            dVar2.reset();
        }
        C53973z1 z1Var = this.f325394d.f310737y;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        CameraFocusAndMeteringView cameraFocusAndMeteringView = this.f325394d;
        cameraFocusAndMeteringView.f310737y = null;
        cameraFocusAndMeteringView.f310733u = false;
        cameraFocusAndMeteringView.f310732t = cameraFocusAndMeteringView.f310731s;
        cameraFocusAndMeteringView.f310729q = 0.0f;
        cameraFocusAndMeteringView.f310728p = 0.0f;
        cameraFocusAndMeteringView.f310734v = true;
        return C13598b0.f38549a;
    }
}
