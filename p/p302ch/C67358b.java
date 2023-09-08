package p302ch;

import android.os.Message;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import fy3.C32226l;
import gy3.C87412m;
import java.util.Iterator;
import ou0.C77040d;
import pu0.C110248b;
import rx3.C13598b0;

/* renamed from: ch.b */
public final class C67358b extends C77040d {

    /* renamed from: l */
    public C32226l<? super Boolean, C13598b0> f193219l;

    /* renamed from: m */
    public final MMHandler f193220m = new MMHandler((MMHandler.Callback) new C67359a(this));

    /* renamed from: n */
    public boolean f193221n;

    /* renamed from: ch.b$a */
    public static final class C67359a implements MMHandler.Callback {

        /* renamed from: d */
        public final /* synthetic */ C67358b f193222d;

        public C67359a(C67358b bVar) {
            this.f193222d = bVar;
        }

        public final boolean handleMessage(Message message) {
            C87412m.m108594g(message, LocaleUtil.ITALIAN);
            this.f193222d.f193219l.invoke(Boolean.FALSE);
            return false;
        }
    }

    public C67358b(C32226l<? super Boolean, C13598b0> lVar) {
        C87412m.m108594g(lVar, "onStartRecord");
        this.f193219l = lVar;
        mo157512y();
        C110248b.f329777h.mo161664i(this, "record");
    }

    /* renamed from: R */
    public void mo18021R(int i) {
        super.mo18021R(i);
        if (i == 2 || i == 3) {
            String str = null;
            this.f193220m.removeCallbacksAndMessages((Object) null);
            Iterator<String> it = this.f329353c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                if (C87412m.m108589b(next, "record")) {
                    str = next;
                    break;
                }
            }
            if (str != null) {
                Log.m105924i("MicroMsg.SceneVoiceRecorderAudioManager", "checkIfSomeRequestAvailable available");
                this.f193219l.invoke(Boolean.TRUE);
            }
        }
    }

    /* renamed from: d0 */
    public final void mo91494d0() {
        this.f193220m.removeCallbacksAndMessages((Object) null);
        if (this.f193221n) {
            mo161477T("record");
            this.f193221n = false;
        }
        C110248b.f329777h.mo161670o("record");
    }
}
