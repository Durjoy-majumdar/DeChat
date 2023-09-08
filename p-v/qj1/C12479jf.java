package qj1;

import android.os.Message;
import cj1.C0548h5;
import cl1.C55001u;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import gy3.C87412m;

/* renamed from: qj1.jf */
public final class C12479jf implements MMHandler.Callback {

    /* renamed from: d */
    public final /* synthetic */ C12399ff f35901d;

    public C12479jf(C12399ff ffVar) {
        this.f35901d = ffVar;
    }

    public final boolean handleMessage(Message message) {
        C87412m.m108594g(message, LocaleUtil.ITALIAN);
        int i = message.what;
        C12399ff ffVar = this.f35901d;
        boolean z = false;
        if (i == ffVar.f35732Q) {
            ffVar.mo12088o1(8);
            this.f35901d.mo12078a1(false);
            this.f35901d.mo12079c1();
        } else if (i == ffVar.f35731P) {
            boolean h1 = ffVar.mo12083h1();
            Log.m105924i("FinderLiveTitlePlugin", "has been look for one min ,isFollow" + h1);
            this.f35901d.mo12087m1(h1, "#3", Boolean.FALSE, Boolean.TRUE);
        } else if (i == ffVar.f35733R) {
            Long valueOf = Long.valueOf(((C55001u) ffVar.mo87696x0(C55001u.class)).f154420q.f182392d);
            if (valueOf.longValue() != 0) {
                z = true;
            }
            if (!z) {
                valueOf = null;
            }
            if (valueOf != null) {
                C12399ff ffVar2 = this.f35901d;
                C0548h5.f1327a.mo592a(ffVar2.f35741p, valueOf.longValue(), C0548h5.C0550b.WatchTimeOver, true);
            }
        }
        return true;
    }
}
