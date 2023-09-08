package kb1;

import com.tencent.p014mm.plugin.facedetect.views.FaceDetectView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: kb1.e */
public class C108991e implements C108993h {

    /* renamed from: a */
    public final /* synthetic */ C108993h f326461a;

    /* renamed from: b */
    public final /* synthetic */ FaceDetectView f326462b;

    public C108991e(FaceDetectView faceDetectView, C108993h hVar) {
        this.f326462b = faceDetectView;
        this.f326461a = hVar;
    }

    /* renamed from: a */
    public void mo160112a(int i) {
        Log.m105925i("MicroMsg.FaceDetectView", "hy: camera preview init done : %d", Integer.valueOf(i));
        if (i == 0) {
            FaceDetectView faceDetectView = this.f326462b;
            int i2 = FaceDetectView.f346021w;
            faceDetectView.getClass();
            this.f326462b.mo175329d();
        }
        C108993h hVar = this.f326461a;
        if (hVar != null) {
            hVar.mo160112a(i);
        }
    }
}
