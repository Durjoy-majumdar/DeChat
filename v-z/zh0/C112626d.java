package zh0;

import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.sdk.platformtools.Log;
import g72.C107757b;
import i72.C108388k;
import j72.C108607f;
import j72.C108620n;
import j72.C108633r;

/* renamed from: zh0.d */
public class C112626d extends C107757b {

    /* renamed from: b */
    public C108607f f337278b;

    /* renamed from: c */
    public VideoTransPara f337279c;

    /* renamed from: zh0.d$a */
    public static class C112627a implements C107757b.C107758a {
        public C107757b get() {
            return new C112626d();
        }
    }

    /* renamed from: a */
    public C108607f mo158188a() {
        C108607f fVar;
        C108607f fVar2;
        VideoTransPara videoTransPara = this.f337279c;
        if (videoTransPara != null) {
            int i = C108388k.f324540d.f324551a;
            if (i == 1) {
                fVar2 = new C108620n(videoTransPara);
            } else if (i != 2) {
                fVar = null;
                this.f337278b = fVar;
            } else {
                fVar2 = new C108633r(videoTransPara);
            }
            fVar = fVar2;
            this.f337278b = fVar;
        }
        C108607f fVar3 = this.f337278b;
        if (fVar3 instanceof C108620n) {
            C108620n nVar = (C108620n) fVar3;
            nVar.getClass();
            Log.m105925i("MicroMsg.MMSightFFMpegRecorder", "setStopOnCameraDataThread: %s", Boolean.TRUE);
            nVar.f325234J = true;
        }
        return this.f337278b;
    }
}
