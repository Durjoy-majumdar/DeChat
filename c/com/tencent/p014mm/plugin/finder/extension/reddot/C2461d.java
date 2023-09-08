package com.tencent.p014mm.plugin.finder.extension.reddot;

import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import eb0.C31543z5;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import te3.C51978xi1;
import te3.C64586nn1;
import up1.C37521f;

/* renamed from: com.tencent.mm.plugin.finder.extension.reddot.d */
public final class C2461d extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ int f12915d;

    /* renamed from: e */
    public final /* synthetic */ int f12916e;

    /* renamed from: f */
    public final /* synthetic */ String f12917f;

    /* renamed from: g */
    public final /* synthetic */ C2469j f12918g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2461d(int i, int i2, String str, C2469j jVar) {
        super(0);
        this.f12915d = i;
        this.f12916e = i2;
        this.f12917f = str;
        this.f12918g = jVar;
    }

    public Object invoke() {
        C64586nn1 o2;
        Class cls = FinderCommonFeatureService.class;
        Log.m105924i("Finder.MsgRedDotHandler", "[addFinderMessageRedDot] unReadCount=" + this.f12915d);
        if (this.f12915d + this.f12916e > 0) {
            C51978xi1 xi12 = new C51978xi1();
            xi12.f144673h = String.valueOf(C31543z5.m39453c());
            xi12.f144669d = 400000;
            xi12.f144670e = 1006;
            xi12.f144679q = this.f12917f;
            C64586nn1 y = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77285y("AuthorProfileNotify", this.f12917f);
            boolean z = false;
            int i = y != null ? y.f184503e : 0;
            FinderRedDotManager Nx0 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0();
            int i2 = this.f12915d + i + this.f12916e;
            String str = this.f12917f;
            C87412m.m108594g(str, "username");
            if (i2 <= 0) {
                Log.m105924i("Finder.RedDotManager", "[updateFinderEntryCount] server error.");
            } else {
                Log.m105924i("Finder.RedDotManager", "[updateFinderEntryCount] count = " + i2);
                C55718s0 i3 = Nx0.mo77269i("FinderEntrance", str);
                if (i3 != null && (o2 = i3.mo77308o2("FinderEntrance")) != null && o2.f184502d == 2 && o2.f184503e > 0) {
                    o2.f184503e = i2;
                    Log.m105924i("Finder.RedDotManager", "[notifyFinderEntryCount] count = " + i2);
                    C2479n0.m2356f(C2479n0.f12955a, true, "FinderEntrance", o2, i3, (String) null, 16, (Object) null);
                }
            }
            C37521f.f99374d.getClass();
            int intValue = C37521f.f99196I4.mo60266n().intValue();
            if (C37521f.f99413h3.mo60266n().intValue() > 0 || i > 0) {
                z = true;
            }
            Log.m105924i("Finder.MsgRedDotHandler", "addFinderMessageRedDot showType " + intValue);
            C64586nn1 nn12 = new C64586nn1();
            String str2 = this.f12917f;
            int i4 = this.f12915d;
            int i5 = this.f12916e;
            nn12.f184521z = str2;
            if (z) {
                nn12.f184502d = 2;
                nn12.f184503e = i + i4 + i5;
                nn12.f184506h = 2;
                nn12.f184508j = "FinderMentionEntrance";
                nn12.f184507i = "TLPersonalCenter";
            } else {
                nn12.f184502d = intValue;
                nn12.f184503e = i;
                nn12.f184506h = 1;
                nn12.f184507i = "TLPersonalCenter";
            }
            xi12.f144672g.add(nn12);
            if (z && y != null) {
                if (!C87412m.m108589b(y.f184508j, "TLPersonalCenter")) {
                    y.f184508j = "TLPersonalCenter";
                    Log.m105928w("Finder.MsgRedDotHandler", "parent path:" + y.f184508j + " loss!");
                }
                xi12.f144672g.add(y);
                Log.m105924i("Finder.MsgRedDotHandler", "messageShowInfo :" + y.f184507i);
            }
            C64586nn1 nn13 = new C64586nn1();
            nn13.f184502d = 2;
            nn13.f184506h = 2;
            nn13.f184507i = "finder_private_msg_entrance";
            nn13.f184521z = this.f12917f;
            nn13.f184506h = z ? 2 : 1;
            if (z) {
                nn13.f184508j = "TLPersonalCenter";
            }
            nn13.f184503e = this.f12915d + this.f12916e;
            xi12.f144672g.add(nn13);
            C64586nn1 nn14 = new C64586nn1();
            nn14.f184502d = 2;
            nn14.f184506h = 1;
            nn14.f184507i = "FinderMessageConversation";
            nn14.f184508j = "finder_private_msg_entrance";
            nn14.f184521z = this.f12917f;
            xi12.f144672g.add(nn14);
            C2469j.m2349c(this.f12918g, this.f12917f, nn12, xi12);
            FinderRedDotManager.m63316C(this.f12918g.f12929a, xi12, 1006, "addFinderMessageRedDot", false, true, 8, (Object) null);
        } else {
            this.f12918g.f12929a.mo77241N5(1006, this.f12917f);
        }
        return C13598b0.f38549a;
    }
}
