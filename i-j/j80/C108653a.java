package j80;

import com.tencent.p014mm.media.camera.view.control.CameraFocusAndMeteringView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: j80.a */
public final class C108653a implements C60780c {

    /* renamed from: a */
    public final /* synthetic */ CameraFocusAndMeteringView f325391a;

    /* renamed from: b */
    public final /* synthetic */ Integer f325392b;

    /* renamed from: c */
    public final /* synthetic */ int f325393c;

    public C108653a(CameraFocusAndMeteringView cameraFocusAndMeteringView, Integer num, int i) {
        this.f325391a = cameraFocusAndMeteringView;
        this.f325392b = num;
        this.f325393c = i;
    }

    /* renamed from: a */
    public void mo85715a(boolean z) {
        Log.m105924i("MicroMsg.Camera.CameraFocusAndMeteringView", "onMoveFinish >> " + this.f325391a.f310732t + ", " + this.f325392b + ' ' + z);
        if (z) {
            Integer num = this.f325392b;
            C87412m.m108593f(num, "toDur");
            int intValue = num.intValue();
            CameraFocusAndMeteringView cameraFocusAndMeteringView = this.f325391a;
            if (intValue < cameraFocusAndMeteringView.f310732t) {
                CameraFocusAndMeteringView.C104642b bVar = cameraFocusAndMeteringView.f310719d;
                if (bVar != null) {
                    bVar.mo148272h(this.f325393c);
                }
            } else {
                CameraFocusAndMeteringView.C104642b bVar2 = cameraFocusAndMeteringView.f310719d;
                if (bVar2 != null) {
                    bVar2.mo148274j(this.f325393c);
                }
            }
            CameraFocusAndMeteringView cameraFocusAndMeteringView2 = this.f325391a;
            Integer num2 = this.f325392b;
            C87412m.m108593f(num2, "toDur");
            cameraFocusAndMeteringView2.f310732t = num2.intValue();
        }
        this.f325391a.f310733u = false;
    }
}
