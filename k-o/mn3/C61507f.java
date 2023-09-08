package mn3;

import b60.C54426a;
import b60.C54427b;
import ck3.C39969i;
import ck3.C67391b;
import com.tencent.p014mm.p136ui.C57833e1;
import com.tencent.p014mm.p136ui.tipsbar.ChatTipsBarGroup;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import kn3.C61118a;
import kn3.C61124e;
import ln3.C61317f;
import ln3.C76709a;
import p744wt.C66190c;

/* renamed from: mn3.f */
public final class C61507f extends C76787a<C61317f> {

    /* renamed from: f */
    public List<? extends C54426a> f174858f;

    /* renamed from: g */
    public final C57833e1 f174859g = new C57833e1();

    /* renamed from: h */
    public final C57833e1.C57835b f174860h = new C61508a(this);

    /* renamed from: mn3.f$a */
    public static final class C61508a implements C57833e1.C57835b {

        /* renamed from: d */
        public final /* synthetic */ C61507f f174861d;

        public C61508a(C61507f fVar) {
            this.f174861d = fVar;
        }

        /* renamed from: t3 */
        public final void mo82260t3(String str) {
            String r = this.f174861d.f215752d.mo91577r();
            if (r != null && C87412m.m108589b(r, str)) {
                Log.m105925i("LiveTipsBarProcessor", "liveTipsBarStorage notify, hostRoomId:%s", r);
                this.f174861d.mo107034Z5();
            }
        }
    }

    /* renamed from: F4 */
    public void mo26186F4() {
        this.f174859g.f165459a = this.f215752d.mo91577r();
        C57833e1.C57835b bVar = this.f174860h;
        HashSet<C57833e1.C57835b> hashSet = C57833e1.f165458d;
        if (hashSet != null) {
            hashSet.add(bVar);
        }
        C57833e1 e1Var = this.f174859g;
        e1Var.getClass();
        ((C66190c) C86312j.m106911c(C66190c.class)).o40().mo55886O4(e1Var.f165461c);
    }

    /* renamed from: G4 */
    public void mo26160G4() {
        C57833e1.C57835b bVar = this.f174860h;
        HashSet<C57833e1.C57835b> hashSet = C57833e1.f165458d;
        if (hashSet != null) {
            hashSet.remove(bVar);
        }
        this.f174859g.getClass();
        ((C66190c) C86312j.m106911c(C66190c.class)).o40().mo55886O4((C54427b.C28258a) null);
    }

    /* renamed from: Y5 */
    public void mo86475Y5() {
    }

    /* renamed from: Z */
    public List<C61317f> mo86472Z(C67391b bVar, C39969i iVar) {
        C87412m.m108594g(bVar, "context");
        C87412m.m108594g(iVar, "talkerInfo");
        String str = iVar.f107141a;
        HashSet<C57833e1.C57835b> hashSet = C57833e1.f165458d;
        LinkedList<C54426a> Q = ((C66190c) C86312j.m106911c(C66190c.class)).o40().mo55887Q(str);
        if (Q == null || Q.size() <= 0) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (C54426a aVar : Q) {
            C87412m.m108593f(aVar, LocaleUtil.ITALIAN);
            linkedList.add(new C61317f(aVar));
        }
        this.f174858f = Q;
        return linkedList;
    }

    /* renamed from: c */
    public int mo86473c() {
        int i = C76709a.f224424g;
        return C76709a.f224430p;
    }

    /* renamed from: y */
    public C61118a<C61317f> mo86474y(int i, C67391b bVar, ChatTipsBarGroup.C74825d dVar) {
        C87412m.m108594g(bVar, "ui");
        C87412m.m108594g(dVar, "tipsBarContext");
        return new C61124e(bVar, dVar, this);
    }
}
