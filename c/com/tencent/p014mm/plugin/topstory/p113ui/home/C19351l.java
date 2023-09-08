package com.tencent.p014mm.plugin.topstory.p113ui.home;

import com.google.android.material.tabs.TabLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import eb0.C31543z5;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.Iterator;
import o03.C21723h;
import p03.C21912d;
import p03.C21914h;
import p03.C21915i;
import t03.C22426h;
import te3.rh4;
import u73.C22613h1;

/* renamed from: com.tencent.mm.plugin.topstory.ui.home.l */
public class C19351l implements TabLayout.C104470c {

    /* renamed from: a */
    public final /* synthetic */ TopStoryHomeUIComponentImpl f54571a;

    public C19351l(TopStoryHomeUIComponentImpl topStoryHomeUIComponentImpl) {
        this.f54571a = topStoryHomeUIComponentImpl;
    }

    /* renamed from: a */
    public void mo9213a(TabLayout.C55061f fVar) {
        for (C22426h.C22429c next : this.f54571a.f54516q) {
            if (next.f63552h.equals(fVar)) {
                this.f54571a.f54494C = next.f63546b;
                Log.m105924i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "tab unselected, " + next.f63545a);
                next.f63554j.setTextColor(this.f54571a.f54506d.getResources().getColor(C0966R.color.ah9));
                return;
            }
        }
    }

    /* renamed from: b */
    public void mo9214b(TabLayout.C55061f fVar) {
        Class cls = C21912d.class;
        for (int i = 0; i < ((ArrayList) this.f54571a.f54516q).size(); i++) {
            C22426h.C22429c cVar = (C22426h.C22429c) ((ArrayList) this.f54571a.f54516q).get(i);
            if (cVar.f63552h.equals(fVar)) {
                Log.m105924i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "tab selected, " + cVar.f63545a);
                cVar.f63554j.setTextColor(this.f54571a.f54506d.getResources().getColor(C0966R.color.ah8));
                this.f54571a.mo24894a(i, false);
                this.f54571a.f54523x.setCurrentItem(i);
                if (C21914h.m25163k(cVar.f63546b) && cVar.f63548d > 0) {
                    ((C21723h) ((C21912d) C86312j.m106911c(cls)).mo34966t4()).mo33998i();
                    cVar.mo35580a(0, "");
                }
                if (C21914h.m25164l(cVar.f63546b) && cVar.f63548d > 0) {
                    ((C21723h) ((C21912d) C86312j.m106911c(cls)).mo34966t4()).mo33999j();
                    cVar.mo35580a(0, "");
                }
                if (C21914h.m25162j(cVar.f63546b) && cVar.f63549e <= 0 && cVar.f63548d > 0) {
                    cVar.mo35580a(0, "");
                    C21723h hVar = (C21723h) ((C21912d) C86312j.m106911c(cls)).mo34966t4();
                    hVar.getClass();
                    rh4 rh4 = new rh4();
                    rh4 rh42 = hVar.f61498b;
                    if (rh42 != null) {
                        rh4.f64533d = rh42.f64533d;
                    }
                    C22613h1.m26484j(rh4, 106, 1, 0, 0, "");
                    hVar.mo33995f();
                }
                TopStoryHomeUIComponentImpl topStoryHomeUIComponentImpl = this.f54571a;
                int i2 = cVar.f63546b;
                topStoryHomeUIComponentImpl.getClass();
                Log.m105925i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "setLastCategory %s", Integer.valueOf(i2));
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_TOP_STORY_LAST_ENTER_TAB_REC_INT, Integer.valueOf(i2));
                this.f54571a.f54518s = cVar.f63546b;
                cVar.mo35582c(cVar);
                C21915i.m25174f(this.f54571a.f54508f, "onTabSelected", C31543z5.m39453c());
                return;
            }
        }
    }

    /* renamed from: c */
    public void mo9215c(TabLayout.C55061f fVar) {
        Class cls = C21912d.class;
        Iterator it = ((ArrayList) this.f54571a.f54516q).iterator();
        while (it.hasNext()) {
            C22426h.C22429c cVar = (C22426h.C22429c) it.next();
            if (cVar.f63552h.equals(fVar)) {
                Log.m105924i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "tab reselected, " + cVar.f63545a);
                cVar.f63554j.setTextColor(this.f54571a.f54506d.getResources().getColor(C0966R.color.ah8));
                this.f54571a.f54512j.mo25079t(cVar.f63547c, cVar.f63548d, cVar.f63549e, (!C21914h.m25163k(cVar.f63546b) || cVar.f63548d <= 0) ? "" : ((C21723h) ((C21912d) C86312j.m106911c(cls)).mo34966t4()).f61497a.f64533d, false);
                if (C21914h.m25163k(cVar.f63546b) && cVar.f63548d > 0) {
                    cVar.mo35580a(0, "");
                    ((C21723h) ((C21912d) C86312j.m106911c(cls)).mo34966t4()).mo33998i();
                }
                if (C21914h.m25164l(cVar.f63546b) && cVar.f63548d > 0) {
                    cVar.mo35580a(0, "");
                    ((C21723h) ((C21912d) C86312j.m106911c(cls)).mo34966t4()).mo33999j();
                }
                if (C21914h.m25162j(cVar.f63546b) && cVar.f63549e <= 0 && cVar.f63548d > 0) {
                    cVar.mo35580a(0, "");
                    C21723h hVar = (C21723h) ((C21912d) C86312j.m106911c(cls)).mo34966t4();
                    hVar.getClass();
                    rh4 rh4 = new rh4();
                    rh4 rh42 = hVar.f61498b;
                    if (rh42 != null) {
                        rh4.f64533d = rh42.f64533d;
                    }
                    C22613h1.m26484j(rh4, 106, 1, 0, 0, "");
                    hVar.mo33995f();
                }
                String str = Util.isNullOrNil(cVar.f63551g) ? cVar.f63550f : cVar.f63551g;
                int i = cVar.f63546b;
                TopStoryHomeUIComponentImpl topStoryHomeUIComponentImpl = this.f54571a;
                C22613h1.m26486l(i, topStoryHomeUIComponentImpl.f54518s, str, topStoryHomeUIComponentImpl.f54508f.f64029d, false);
                this.f54571a.f54518s = cVar.f63546b;
                return;
            }
        }
    }
}
