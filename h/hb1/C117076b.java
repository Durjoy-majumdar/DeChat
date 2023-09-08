package hb1;

import com.tencent.p014mm.plugin.facedetect.FaceProNative;
import com.tencent.p014mm.plugin.facedetect.model.C115426w;
import com.tencent.p014mm.plugin.facedetect.service.FaceDetectProcessService;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;

/* renamed from: hb1.b */
public class C117076b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C115426w f350824d;

    /* renamed from: e */
    public final /* synthetic */ FaceDetectProcessService f350825e;

    /* renamed from: hb1.b$a */
    public class C117077a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FaceProNative.FaceResult f350826d;

        public C117077a(FaceProNative.FaceResult faceResult) {
            this.f350826d = faceResult;
        }

        public void run() {
            ((C117074a) C117076b.this.f350824d).mo181031a(this.f350826d);
        }
    }

    public C117076b(FaceDetectProcessService faceDetectProcessService, C115426w wVar) {
        this.f350825e = faceDetectProcessService;
        this.f350824d = wVar;
    }

    public void run() {
        Log.m105924i("MicroMsg.FaceDetectProcessService", "alvinluo service do release out");
        MMHandlerThread.postToMainThread(new C117077a(this.f350825e.mo175314l()));
    }
}
