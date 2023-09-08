package com.tencent.p014mm.plugin.finder.extension.reddot;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import eb0.C31543z5;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87413o;
import ht1.C60152b4;
import o40.C61926c;
import rx3.C13598b0;
import te3.C51978xi1;
import te3.C64586nn1;
import up1.C37521f;
import zc1.C66785b;

/* renamed from: com.tencent.mm.plugin.finder.extension.reddot.e */
public final class C2462e extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ int f12919d;

    /* renamed from: e */
    public final /* synthetic */ int f12920e;

    /* renamed from: f */
    public final /* synthetic */ C2469j f12921f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2462e(int i, int i2, C2469j jVar) {
        super(0);
        this.f12919d = i;
        this.f12920e = i2;
        this.f12921f = jVar;
    }

    public Object invoke() {
        C37521f.f99374d.getClass();
        boolean z = C37521f.f99428j.mo60266n().intValue() == 1;
        Log.m105924i("Finder.MsgRedDotHandler", "[addWxMessageRedDot] isEnablePass=" + z);
        int i = z ? this.f12919d + this.f12920e : this.f12919d;
        if (i > 0) {
            C51978xi1 xi12 = new C51978xi1();
            C66785b bVar = C66785b.f191882e;
            xi12.f144679q = bVar.mo90662O5();
            xi12.f144673h = String.valueOf(C31543z5.m39453c());
            xi12.f144669d = 400000;
            xi12.f144670e = 1008;
            if (z) {
                C64586nn1 nn12 = new C64586nn1();
                nn12.f184502d = 2;
                nn12.f184503e = i;
                nn12.f184506h = 2;
                nn12.f184507i = "finder_wx_private_msg_entrance";
                nn12.f184508j = "TLPersonalCenter";
                xi12.f144672g.add(nn12);
                C64586nn1 nn13 = new C64586nn1();
                nn13.f184502d = 2;
                nn13.f184503e = i;
                nn13.f184506h = 2;
                nn13.f184507i = "TLPersonalCenter";
                nn13.f184508j = "FinderMentionEntrance";
                xi12.f144672g.add(nn13);
                C64586nn1 nn14 = new C64586nn1();
                nn14.f184502d = 2;
                nn14.f184506h = 1;
                nn14.f184507i = "FinderWXMessageConversation";
                nn14.f184508j = "finder_wx_private_msg_entrance";
                xi12.f144672g.add(nn14);
                C2469j.m2349c(this.f12921f, bVar.mo90662O5(), nn13, xi12);
                FinderRedDotManager.m63316C(this.f12921f.f12929a, xi12, 1008, "addWxMessageRedDot", false, true, 8, (Object) null);
                C2469j jVar = this.f12921f;
                jVar.getClass();
                C61926c.m72668M(new C2467i(jVar));
                jVar.f12930b = "";
            } else {
                C64586nn1 nn15 = new C64586nn1();
                nn15.f184502d = 3;
                nn15.f184504f = MMApplicationContext.getContext().getString(C0966R.string.f360714ec2);
                nn15.f184506h = 1;
                nn15.f184507i = "FinderEntrance";
                xi12.f144672g.add(nn15);
                C64586nn1 nn16 = new C64586nn1();
                nn16.f184502d = 5;
                nn16.f184505g = this.f12921f.f12930b;
                nn16.f184506h = 1;
                nn16.f184507i = "TLWxPrivateMsgBubble";
                xi12.f144672g.add(nn16);
                this.f12921f.f12929a.mo77230I(xi12, "addFinderWxMessageRedDot", (C32226l<? super C55718s0, C13598b0>) null);
            }
        } else {
            C60152b4.C8759a.m8562b(this.f12921f.f12929a, 1008, (String) null, 2, (Object) null);
        }
        return C13598b0.f38549a;
    }
}
