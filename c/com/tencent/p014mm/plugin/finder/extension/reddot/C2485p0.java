package com.tencent.p014mm.plugin.finder.extension.reddot;

import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import di3.C86312j;
import eb0.C31543z5;
import f40.C86709a0;
import fy3.C32226l;
import gy3.C87412m;
import ht1.C20998d4;
import ht1.C60152b4;
import rx3.C13598b0;
import te3.C51978xi1;
import te3.C64586nn1;
import up1.C37521f;
import zc1.C66785b;

/* renamed from: com.tencent.mm.plugin.finder.extension.reddot.p0 */
public final class C2485p0 implements C20998d4 {

    /* renamed from: a */
    public final FinderRedDotManager f12996a;

    public C2485p0(FinderRedDotManager finderRedDotManager) {
        C87412m.m108594g(finderRedDotManager, "manager");
        this.f12996a = finderRedDotManager;
    }

    /* renamed from: a */
    public void mo2464a(int i) {
        C51978xi1 xi12 = new C51978xi1();
        xi12.f144673h = String.valueOf(C31543z5.m39453c());
        xi12.f144669d = 10021000;
        xi12.f144670e = 1013;
        boolean H5 = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Nt0().mo77229H5();
        String str = "NearbyEntrance";
        if (H5) {
            C64586nn1 nn12 = new C64586nn1();
            nn12.f184502d = 2;
            nn12.f184506h = 2;
            nn12.f184503e = i;
            nn12.f184507i = str;
            xi12.f144672g.add(nn12);
        }
        C64586nn1 nn13 = new C64586nn1();
        nn13.f184502d = 2;
        nn13.f184506h = H5 ? 2 : 1;
        nn13.f184503e = i;
        nn13.f184507i = "NearbyPeopleTab";
        if (!H5) {
            str = "";
        }
        nn13.f184508j = str;
        xi12.f144672g.add(nn13);
        C64586nn1 nn14 = new C64586nn1();
        nn14.f184502d = 2;
        nn14.f184506h = 1;
        nn13.f184503e = i;
        nn14.f184508j = "NearbyPeopleTab";
        nn14.f184507i = "NearbyPeopleBubble";
        xi12.f144672g.add(nn14);
        this.f12996a.mo77230I(xi12, "addNearByUnreadRedDot", (C32226l<? super C55718s0, C13598b0>) null);
    }

    /* renamed from: b */
    public void mo2465b() {
        C51978xi1 xi12 = new C51978xi1();
        xi12.f144673h = String.valueOf(C31543z5.m39453c());
        xi12.f144669d = 100000;
        xi12.f144670e = 1011;
        C64586nn1 nn12 = new C64586nn1();
        nn12.f184502d = 6;
        nn12.f184506h = 1;
        nn12.f184507i = "NearbyEntrance";
        xi12.f144672g.add(nn12);
        this.f12996a.mo77230I(xi12, "addNearbyNewRedDot", (C32226l<? super C55718s0, C13598b0>) null);
    }

    /* renamed from: c */
    public void mo2466c() {
        if (this.f12996a.mo77227G5("NearbyPeopleFooterprintClear") != null) {
            Log.m105924i("Finder.RedDotTransform", "addNearbyFootRedDot: duplicate red dot");
            return;
        }
        C51978xi1 xi12 = new C51978xi1();
        xi12.f144673h = String.valueOf(C31543z5.m39453c());
        xi12.f144669d = 300000;
        xi12.f144670e = 1014;
        C64586nn1 nn12 = new C64586nn1();
        nn12.f184502d = 101;
        nn12.f184506h = 2;
        nn12.f184507i = "NearbyEntrance";
        xi12.f144672g.add(nn12);
        C64586nn1 nn13 = new C64586nn1();
        nn13.f184502d = 101;
        nn13.f184506h = 2;
        nn13.f184508j = "NearbyEntrance";
        nn13.f184507i = "NearbyPeopleTab";
        xi12.f144672g.add(nn13);
        C64586nn1 nn14 = new C64586nn1();
        nn14.f184502d = 101;
        nn14.f184506h = 1;
        nn14.f184508j = "NearbyPeopleTab";
        nn14.f184507i = "NearbyPeopleFooterprintClear";
        xi12.f144672g.add(nn14);
        this.f12996a.mo77230I(xi12, "addNearByFootRedDot", (C32226l<? super C55718s0, C13598b0>) null);
    }

    /* renamed from: d */
    public final void mo2467d() {
        boolean z = !Util.isNullOrNil(C66785b.f191882e.mo90662O5());
        C85801v1 i = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_FINDER_LOCAL_RED_DOT_INT_SYNC;
        int j = i.mo119689j(aVar, mo2468e());
        boolean tO = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).mo76879tO();
        boolean z2 = false;
        if (tO) {
            if (((j & 2) > 0) && !z) {
                z2 = true;
            }
        }
        Log.m105924i("Finder.RedDotTransform", "[isShowLocalRedDot] ret=" + z2 + " hasPostEntry=" + tO + " local=" + j + " hasCreatedIdentity=" + z);
        if (z2) {
            int j2 = C86709a0.m107535s().mo121142i().mo119689j(aVar, mo2468e());
            int i2 = -3 & j2;
            if (i2 != j2) {
                C86709a0.m107535s().mo121142i().mo119677K(aVar, Integer.valueOf(i2));
            }
            Log.m105924i("Finder.RedDotTransform", "[setLocalRedDot] flag=" + 2 + " unset=" + true + " newLocal=" + i2 + " local=" + j2);
            Log.m105924i("Finder.RedDotTransform", "[transformPostRedDot] done");
        }
        C37521f.f99374d.getClass();
        if (C37521f.f99446l2.mo60266n().intValue() != 0) {
            C60152b4.C8759a.m8562b(this.f12996a, -1, (String) null, 2, (Object) null);
            Log.m105924i("Finder.RedDotTransform", "[checkPostRedDot] clear TIMELINE_CAMERA");
        }
    }

    /* renamed from: e */
    public final int mo2468e() {
        int j = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_LOCAL_RED_DOT_INT_SYNC, -1);
        if (j != -1) {
            return j;
        }
        return (!((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).mo76879tO() || (Util.isNullOrNil(C66785b.f191882e.mo90662O5()) ^ true)) ? 0 : 2;
    }
}
