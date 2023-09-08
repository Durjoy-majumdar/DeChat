package mn3;

import ck3.C39969i;
import ck3.C67391b;
import com.tencent.p014mm.p136ui.base.TalkRoomPopupNav;
import com.tencent.p014mm.p136ui.tipsbar.ChatTipsBarGroup;
import ed0.C75607a;
import ed0.C75609c;
import ed0.C75610d;
import gy3.C87412m;
import java.util.LinkedList;
import java.util.List;
import kn3.C61118a;
import kn3.C76613j;
import ln3.C76709a;
import ln3.C76715i;
import t22.C77833z;
import zj3.C79346d0;

/* renamed from: mn3.i */
public final class C76795i extends C76787a<C76715i> implements C75609c {

    /* renamed from: f */
    public TalkRoomPopupNav f224614f;

    /* renamed from: F4 */
    public void mo26186F4() {
        C75607a a = C75610d.m90859a();
        if (a != null) {
            C77833z zVar = (C77833z) a;
            synchronized (zVar) {
                ((LinkedList) zVar.f226793d).add(this);
            }
        }
    }

    /* renamed from: G4 */
    public void mo26160G4() {
        C75607a a = C75610d.m90859a();
        if (a != null) {
            C77833z zVar = (C77833z) a;
            synchronized (zVar) {
                ((LinkedList) zVar.f226793d).remove(this);
            }
        }
    }

    /* renamed from: Y5 */
    public void mo86475Y5() {
        TalkRoomPopupNav talkRoomPopupNav = this.f224614f;
        if (talkRoomPopupNav != null) {
            talkRoomPopupNav.setVisibility(8);
            talkRoomPopupNav.mo101878a();
            talkRoomPopupNav.mo101880c(-1, 0);
            talkRoomPopupNav.mo101889i();
            ((C79346d0) this.f215752d.f193278b.mo102812a(C79346d0.class)).mo102651b3(-1);
        }
    }

    /* renamed from: Z */
    public List<C76715i> mo86472Z(C67391b bVar, C39969i iVar) {
        C87412m.m108594g(bVar, "context");
        C87412m.m108594g(iVar, "talkerInfo");
        String str = iVar.f107141a;
        if (C75610d.m90859a() == null || !((C77833z) C75610d.m90859a()).mo107954g(str)) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        LinkedList<String> c = ((C77833z) C75610d.m90859a()).mo107950c(str);
        C87412m.m108593f(c, "getTraceRoomMgr()\n      …kRoomInfo(talkerUserName)");
        linkedList.add(new C76715i(c));
        return linkedList;
    }

    /* renamed from: c */
    public int mo86473c() {
        int i = C76709a.f224424g;
        return C76709a.f224431q;
    }

    /* renamed from: d3 */
    public void mo102271d3(String str, String str2, String str3) {
        C67391b bVar = this.f215752d;
        if (bVar != null && C87412m.m108589b(str, bVar.mo91577r())) {
            mo107034Z5();
        }
    }

    /* renamed from: l2 */
    public void mo70047l2() {
        super.mo70047l2();
        TalkRoomPopupNav talkRoomPopupNav = this.f224614f;
        if (talkRoomPopupNav != null) {
            talkRoomPopupNav.mo101889i();
        }
    }

    /* renamed from: y */
    public C61118a<C76715i> mo86474y(int i, C67391b bVar, ChatTipsBarGroup.C74825d dVar) {
        C87412m.m108594g(bVar, "ui");
        C87412m.m108594g(dVar, "tipsBarContext");
        return new C76613j(bVar, dVar, this);
    }
}
