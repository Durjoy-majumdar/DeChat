package mn3;

import ck3.C67391b;
import com.tencent.p014mm.p136ui.MultiTalkRoomPopupNav;
import com.tencent.p014mm.p136ui.tipsbar.ChatTipsBarGroup;
import com.tencent.p014mm.plugin.multitalk.model.C69856h;
import di3.C86312j;
import gy3.C87412m;
import java.util.LinkedList;
import java.util.List;
import kn3.C61118a;
import kn3.C76607f;
import ln3.C76709a;
import ln3.C76713g;
import zj3.C79346d0;

/* renamed from: mn3.g */
public final class C76792g extends C76787a<C76713g> implements C69856h.C69857a {

    /* renamed from: f */
    public MultiTalkRoomPopupNav f224610f;

    /* renamed from: mn3.g$a */
    public static final class C76793a {

        /* renamed from: a */
        public boolean f224611a;

        /* renamed from: b */
        public List<String> f224612b = new LinkedList();
    }

    /* renamed from: F4 */
    public void mo26186F4() {
        C69856h hVar = (C69856h) C86312j.m106911c(C69856h.class);
        if (hVar != null) {
            hVar.mo96134FA(this);
        }
    }

    /* renamed from: G4 */
    public void mo26160G4() {
        C69856h hVar = (C69856h) C86312j.m106911c(C69856h.class);
        if (hVar != null) {
            hVar.mo96148qQ(this);
        }
    }

    /* renamed from: Y5 */
    public void mo86475Y5() {
        MultiTalkRoomPopupNav multiTalkRoomPopupNav = this.f224610f;
        if (multiTalkRoomPopupNav != null) {
            if (!((C69856h) C86312j.m106911c(C69856h.class)).mo96150sV(this.f215752d.mo91577r())) {
                multiTalkRoomPopupNav.mo101470d();
            }
            multiTalkRoomPopupNav.setVisibility(8);
            ((C79346d0) this.f215752d.f193278b.mo102812a(C79346d0.class)).mo102651b3(-1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008f, code lost:
        if (((com.tencent.p014mm.plugin.multitalk.model.C69856h) di3.C86312j.m106911c(r0)).mo96149qn() == false) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x009e, code lost:
        if (((com.tencent.p014mm.plugin.multitalk.model.C69856h) di3.C86312j.m106911c(r0)).wd0(r3) != false) goto L_0x00d7;
     */
    /* renamed from: Z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<ln3.C76713g> mo86472Z(ck3.C67391b r10, ck3.C39969i r11) {
        /*
            r9 = this;
            java.lang.Class<com.tencent.mm.plugin.multitalk.model.h> r0 = com.tencent.p014mm.plugin.multitalk.model.C69856h.class
            java.lang.String r1 = "context"
            gy3.C87412m.m108594g(r10, r1)
            java.lang.String r10 = "talkerInfo"
            gy3.C87412m.m108594g(r11, r10)
            java.lang.String r10 = r11.f107141a
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85820U5(r10)
            if (r1 == 0) goto L_0x00e7
            di3.d r1 = di3.C86312j.m106911c(r0)
            com.tencent.mm.plugin.multitalk.model.h r1 = (com.tencent.p014mm.plugin.multitalk.model.C69856h) r1
            xh.k6 r1 = r1.W30(r10)
            if (r1 == 0) goto L_0x00e7
            java.lang.String r2 = r1.field_wxGroupId
            if (r2 == 0) goto L_0x00e7
            boolean r10 = r2.equals(r10)
            if (r10 == 0) goto L_0x00e7
            mn3.g$a r10 = new mn3.g$a
            r10.<init>()
            com.tencent.mm.ui.MultiTalkRoomPopupNav$g r2 = com.tencent.p014mm.p136ui.MultiTalkRoomPopupNav.C73117g.NotInTalking
            java.lang.String r3 = r11.f107141a
            di3.d r4 = di3.C86312j.m106911c(r0)
            com.tencent.mm.plugin.multitalk.model.h r4 = (com.tencent.p014mm.plugin.multitalk.model.C69856h) r4
            boolean r4 = r4.mo96150sV(r3)
            r5 = 1
            r6 = 0
            if (r4 != 0) goto L_0x0044
            goto L_0x00d7
        L_0x0044:
            di3.d r4 = di3.C86312j.m106911c(r0)
            com.tencent.mm.plugin.multitalk.model.h r4 = (com.tencent.p014mm.plugin.multitalk.model.C69856h) r4
            java.util.List r4 = r4.G10(r3)
            int r7 = r4.size()
            if (r7 != 0) goto L_0x005f
            di3.d r11 = di3.C86312j.m106911c(r0)
            com.tencent.mm.plugin.multitalk.model.h r11 = (com.tencent.p014mm.plugin.multitalk.model.C69856h) r11
            r11.mo96142c(r3)
            goto L_0x00d7
        L_0x005f:
            r10.f224612b = r4
            di3.d r7 = di3.C86312j.m106911c(r0)
            com.tencent.mm.plugin.multitalk.model.h r7 = (com.tencent.p014mm.plugin.multitalk.model.C69856h) r7
            java.lang.String r11 = r11.f107141a
            java.lang.String r8 = su0.C13781a.m13082a()
            int r11 = r7.Vq0(r11, r8)
            if (r11 == r5) goto L_0x0092
            r7 = 10
            if (r11 == r7) goto L_0x0078
            goto L_0x00a1
        L_0x0078:
            di3.d r11 = di3.C86312j.m106911c(r0)
            com.tencent.mm.plugin.multitalk.model.h r11 = (com.tencent.p014mm.plugin.multitalk.model.C69856h) r11
            boolean r11 = r11.wd0(r3)
            if (r11 == 0) goto L_0x0085
            goto L_0x00d7
        L_0x0085:
            di3.d r11 = di3.C86312j.m106911c(r0)
            com.tencent.mm.plugin.multitalk.model.h r11 = (com.tencent.p014mm.plugin.multitalk.model.C69856h) r11
            boolean r11 = r11.mo96149qn()
            if (r11 == 0) goto L_0x00a1
            goto L_0x00d7
        L_0x0092:
            com.tencent.mm.ui.MultiTalkRoomPopupNav$g r2 = com.tencent.p014mm.p136ui.MultiTalkRoomPopupNav.C73117g.Inviting
            di3.d r11 = di3.C86312j.m106911c(r0)
            com.tencent.mm.plugin.multitalk.model.h r11 = (com.tencent.p014mm.plugin.multitalk.model.C69856h) r11
            boolean r11 = r11.wd0(r3)
            if (r11 == 0) goto L_0x00a1
            goto L_0x00d7
        L_0x00a1:
            int r11 = r2.ordinal()
            if (r11 == 0) goto L_0x00c4
            if (r11 == r5) goto L_0x00d6
            di3.d r11 = di3.C86312j.m106911c(r0)
            com.tencent.mm.plugin.multitalk.model.h r11 = (com.tencent.p014mm.plugin.multitalk.model.C69856h) r11
            boolean r11 = r11.mo96133ED()
            if (r11 == 0) goto L_0x00b6
            goto L_0x00c0
        L_0x00b6:
            int r11 = r4.size()
            int r0 = c92.C104331h.m139313e()
            if (r11 < r0) goto L_0x00c1
        L_0x00c0:
            r5 = 0
        L_0x00c1:
            r10.f224611a = r5
            goto L_0x00d6
        L_0x00c4:
            di3.d r11 = di3.C86312j.m106911c(r0)
            com.tencent.mm.plugin.multitalk.model.h r11 = (com.tencent.p014mm.plugin.multitalk.model.C69856h) r11
            java.lang.String r0 = su0.C13781a.m13082a()
            java.lang.String r11 = r11.mo96152xC(r3, r0)
            if (r11 == 0) goto L_0x00d6
            r10.f224611a = r5
        L_0x00d6:
            r5 = 0
        L_0x00d7:
            if (r5 != 0) goto L_0x00e7
            java.util.LinkedList r11 = new java.util.LinkedList
            r11.<init>()
            ln3.g r0 = new ln3.g
            r0.<init>(r1, r10)
            r11.add(r0)
            return r11
        L_0x00e7:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: mn3.C76792g.mo86472Z(ck3.b, ck3.i):java.util.List");
    }

    /* renamed from: a3 */
    public void mo96154a3(String str) {
        this.f215752d.mo91558S();
        C67391b bVar = this.f215752d;
        if (bVar != null && C87412m.m108589b(str, bVar.mo91577r())) {
            mo107034Z5();
        }
    }

    /* renamed from: c */
    public int mo86473c() {
        int i = C76709a.f224424g;
        return C76709a.f224432r;
    }

    /* renamed from: y */
    public C61118a<C76713g> mo86474y(int i, C67391b bVar, ChatTipsBarGroup.C74825d dVar) {
        C87412m.m108594g(bVar, "ui");
        C87412m.m108594g(dVar, "tipsBarContext");
        return new C76607f(bVar, dVar, this);
    }
}
