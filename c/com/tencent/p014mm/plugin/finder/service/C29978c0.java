package com.tencent.p014mm.plugin.finder.service;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C33042b2;
import ht1.C60179k4;
import ht1.C60187m5;
import ht1.C60208v1;
import java.util.LinkedList;
import je1.C46516e2;
import o40.C61926c;
import rx3.C13598b0;
import te3.C50405mi0;

@C86522b
/* renamed from: com.tencent.mm.plugin.finder.service.c0 */
public final class C29978c0 extends C86301e implements C33042b2 {

    /* renamed from: com.tencent.mm.plugin.finder.service.c0$a */
    public static final class C29979a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f81157d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29979a(String str) {
            super(0);
            this.f81157d = str;
        }

        public Object invoke() {
            String n = ((C60179k4) C86312j.m106911c(C60179k4.class)).mo78770n(this.f81157d);
            Log.m105924i("Finder.EnterPersonalMsgService", "[checkUpdatePersonalMsg] sessionId=" + this.f81157d + " talker=" + n);
            C60187m5 Ff = ((C60208v1) C86312j.m106911c(C60208v1.class)).mo78700Ff(n);
            if (Ff != null) {
                String str = this.f81157d;
                if (System.currentTimeMillis() - Ff.mo84170d2() >= ((long) C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_ENTER_PERSONAL_MSG_REFRESH_INTERVAL_INT_SYNC, 3600)) * 1000) {
                    LinkedList linkedList = new LinkedList();
                    C50405mi0 mi02 = new C50405mi0();
                    mi02.f138041d = n;
                    mi02.f138042e = str;
                    linkedList.add(mi02);
                    new C46516e2(linkedList).mo9225i();
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: wh */
    public void mo57043wh(String str) {
        C87412m.m108594g(str, "sessionId");
        C61926c.m72656A((String) null, new C29979a(str));
    }
}
