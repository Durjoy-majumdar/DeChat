package p595ll;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87413o;
import h81.C32735h;
import p490dl.C97491p;
import rx3.C13598b0;

/* renamed from: ll.h */
public final class C34299h extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public static final C34299h f92434d = new C34299h();

    public C34299h() {
        super(0);
    }

    public Object invoke() {
        C97491p pVar = C97491p.f286143a;
        pVar.mo136773a(false);
        long secondsToNow = Util.secondsToNow((long) pVar.mo136774c().getInt("designer_sync_time", 0));
        int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_emoji_designer_sync_interval, 168);
        Log.m105924i("MicroMsg.EmojiPackSyncManager", "checkStart: " + (secondsToNow / 3600) + ", " + Qe);
        if (Qe > 0 && secondsToNow > ((long) Qe) * 3600 && C99497i.f291713e == null) {
            C99497i iVar = new C99497i();
            C99497i.f291713e = iVar;
            iVar.mo138910a();
        }
        return C13598b0.f38549a;
    }
}
