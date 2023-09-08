package com.tencent.p014mm.network;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.concurrent.atomic.AtomicInteger;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C36568h;
import zt3.C119157j;

/* renamed from: com.tencent.mm.network.j0 */
public final class C40380j0 {

    /* renamed from: a */
    public static AtomicInteger f108507a = new AtomicInteger(0);

    /* renamed from: b */
    public static final C13601g<C40380j0> f108508b = C36568h.m40986b(C13602i.SYNCHRONIZED, C40381a.f108509d);

    /* renamed from: com.tencent.mm.network.j0$a */
    public static final class C40381a extends C87413o implements C32224a<C40380j0> {

        /* renamed from: d */
        public static final C40381a f108509d = new C40381a();

        public C40381a() {
            super(0);
        }

        public Object invoke() {
            return new C40380j0();
        }
    }

    /* renamed from: a */
    public final void mo63091a(String str) {
        C87412m.m108594g(str, TPReportKeys.PlayerStep.PLAYER_REASON);
        Log.m105924i("MMNetCheck", "reason:" + str + ", url:" + "https://weixin.qq.com/netcheck" + ", timeout:" + 10);
        if (f108507a.get() >= 5) {
            Log.m105928w("MMNetCheck", "too many http check is running, count:" + f108507a.get());
            return;
        }
        ((C119157j) C119157j.f356862d).mo183875f(new C40382k0("https://weixin.qq.com/netcheck", 10, str));
    }
}
