package r80;

import android.media.MediaFormat;
import android.os.HandlerThread;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import m80.C109537f;
import rx3.C13598b0;

/* renamed from: r80.l */
public final class C110531l extends C87413o implements C32226l<MediaFormat, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C110536p f330527d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110531l(C110536p pVar) {
        super(1);
        this.f330527d = pVar;
    }

    public Object invoke(Object obj) {
        MediaFormat mediaFormat = (MediaFormat) obj;
        C87412m.m108594g(mediaFormat, "mediaFormat");
        String str = this.f330527d.f330546g;
        Log.m105924i(str, "onFormatChanged, format:" + mediaFormat);
        C110536p pVar = this.f330527d;
        synchronized (pVar.f330544e) {
            if (!pVar.f330543d) {
                Log.m105924i(pVar.f330546g, "stopDecoder");
                C109537f fVar = pVar.f330541b;
                if (fVar != null) {
                    fVar.mo145767c();
                }
                HandlerThread handlerThread = pVar.f330547h;
                if (handlerThread != null) {
                    handlerThread.quitSafely();
                }
                pVar.f330545f.post(new C110530k(pVar, mediaFormat));
                pVar.f330543d = true;
            }
        }
        return C13598b0.f38549a;
    }
}
