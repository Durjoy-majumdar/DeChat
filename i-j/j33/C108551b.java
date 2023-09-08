package j33;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import ou0.C77040d;
import p206nj.C100115c;
import pu0.C110248b;
import rx3.C13598b0;

/* renamed from: j33.b */
public final class C108551b extends C77040d {

    /* renamed from: l */
    public C32226l<? super Boolean, C13598b0> f324935l;

    /* renamed from: m */
    public C100115c f324936m;

    /* renamed from: n */
    public boolean f324937n;

    public C108551b(C32226l<? super Boolean, C13598b0> lVar) {
        C87412m.m108594g(lVar, "onStartRecord");
        this.f324935l = lVar;
        mo157512y();
        C110248b.f329777h.mo161664i(this, "record");
    }

    /* renamed from: R */
    public void mo18021R(int i) {
        super.mo18021R(i);
        Log.m105918d("MicroMsg.VoicePrintRecorderAudioManager", " Recorder onAudioDeviceStateChange :" + i);
        if (!this.f324937n) {
            this.f324937n = true;
            mo161477T("record");
            C110248b.f329777h.mo161670o("record");
            this.f324935l.invoke(Boolean.TRUE);
        }
    }

    /* renamed from: d0 */
    public final void mo159435d0(boolean z) {
        if (!z) {
            mo161477T("record");
            C110248b.f329777h.mo161670o("record");
        }
        C100115c cVar = this.f324936m;
        if (cVar != null) {
            cVar.mo139414a();
        }
    }
}
