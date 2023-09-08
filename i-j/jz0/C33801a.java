package jz0;

import android.text.TextUtils;
import com.tencent.p014mm.autogen.events.GetCardCountEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import hz0.C33164x;
import hz0.C46153l0;
import wz0.C22945n;

/* renamed from: jz0.a */
public class C33801a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ GetCardCountEvent f91390d;

    public C33801a(C33802b bVar, GetCardCountEvent getCardCountEvent) {
        this.f91390d = getCardCountEvent;
    }

    public void run() {
        Long l;
        if (C86709a0.m107522a()) {
            boolean z = this.f91390d.f78812d.f78813a;
            Log.m105924i("MicroMsg.SubCoreCard.cardGetCountListener", "GetCardCountEvent isForceGet is " + z);
            boolean t = C22945n.m27020t();
            boolean A = C22945n.m26988A();
            if (!t || !A) {
                if (z) {
                    C86709a0.m107529k().f251779b.mo123460f(new C33164x());
                } else {
                    Integer num = (Integer) C86709a0.m107535s().mo121142i().mo119684e(282882, (Object) null);
                    int i = 0;
                    if (num != null) {
                        i = num.intValue();
                    }
                    if (((int) (System.currentTimeMillis() / 1000)) - i >= 7200) {
                        C86709a0.m107529k().f251779b.mo123460f(new C33164x());
                    }
                }
                if (A && (l = (Long) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_CARD_REQUENCE_LONG_SYNC, 0L)) != null && l.longValue() == 0) {
                    C46153l0.Kx0().mo60216a();
                }
                if (t && TextUtils.isEmpty((String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_CARD_LAYOUT_BUF_DATA_STRING_SYNC, (Object) null))) {
                    C46153l0.vx0().mo58722a(1);
                    return;
                }
                return;
            }
            Log.m105924i("MicroMsg.SubCoreCard.cardGetCountListener", "card entrance and share card entrance is open");
        }
    }
}
