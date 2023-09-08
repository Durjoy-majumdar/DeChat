package ns1;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.ChannelUtil;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87413o;
import ht1.C60200t1;
import java.util.List;
import ke3.C88144b;
import qe3.C89625d;
import rx3.C36568h;

/* renamed from: ns1.a */
public final class C76960a {

    /* renamed from: a */
    public static final /* synthetic */ int f224888a = 0;

    /* renamed from: ns1.a$a */
    public static final class C76961a extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C76961a f224889d = new C76961a();

        public C76961a() {
            super(0);
        }

        public Object invoke() {
            int i = C76960a.f224888a;
            boolean g = C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_FINDER_WHATS_NEW_SHOWN_BOOLEAN_SYNC, false);
            if (1 == ChannelUtil.channelId) {
                Log.m105928w("Finder.WhatNewsController", "[GET] This is GP Version, just ignore.");
            } else if (C89625d.f257845k) {
                Log.m105928w("Finder.WhatNewsController", "[GET] This is alpha Version, just ignore.");
            } else {
                List<C88144b.C9613e> list = C88144b.f254911a;
                synchronized (C88144b.class) {
                }
                if (!LocaleUtil.isSimplifiedChineseAppLang()) {
                    Log.m105928w("Finder.WhatNewsController", "[GET] This is not Chinese Language , just ignore.");
                    C115669n.INSTANCE.mo175913w(1305, 20, 1);
                } else {
                    boolean sF = ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76873sF();
                    Log.m105924i("Finder.WhatNewsController", "[GET] showFinderEntry=" + sF + " isShown=" + g + " style=" + 0 + " isAvailableBoot=" + false);
                }
            }
            return Boolean.FALSE;
        }
    }

    static {
        C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_FINDER_WHATS_NEW_SHOWN_BOOLEAN_SYNC, false);
        C36568h.m40985a(C76961a.f224889d);
    }
}
