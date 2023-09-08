package kn3;

import androidx.recyclerview.widget.RecyclerView;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MultiTalkRoomPopupNav;
import com.tencent.p014mm.p136ui.tipsbar.ChatTipsBarGroup;
import gy3.C87412m;
import jq3.C60905o;
import ln3.C76713g;
import mn3.C76792g;

/* renamed from: kn3.f */
public final class C76607f extends C61118a<C76713g> {

    /* renamed from: e */
    public final C67391b f224217e;

    /* renamed from: f */
    public final ChatTipsBarGroup.C74825d f224218f;

    /* renamed from: g */
    public final C76792g f224219g;

    /* renamed from: kn3.f$a */
    public static final class C76608a implements MultiTalkRoomPopupNav.C73115e {

        /* renamed from: a */
        public final /* synthetic */ C76607f f224220a;

        public C76608a(C76607f fVar) {
            this.f224220a = fVar;
        }

        /* renamed from: a */
        public final void mo101495a(boolean z) {
            this.f224220a.f224219g.mo107033O0();
        }
    }

    public C76607f(C67391b bVar, ChatTipsBarGroup.C74825d dVar, C76792g gVar) {
        C87412m.m108594g(bVar, "mChattingContext");
        C87412m.m108594g(dVar, "tipsBarContext");
        C87412m.m108594g(gVar, "processor");
        this.f224217e = bVar;
        this.f224218f = dVar;
        this.f224219g = gVar;
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.cw5;
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00de  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo44e(jq3.C60905o r8, ln3.C76713g r9, int r10, int r11, boolean r12, java.util.List<java.lang.Object> r13) {
        /*
            r7 = this;
            java.lang.String r0 = "holder"
            gy3.C87412m.m108594g(r8, r0)
            java.lang.String r0 = "item"
            gy3.C87412m.m108594g(r9, r0)
            super.mo86076k(r8, r9, r10, r11, r12, r13)
            com.tencent.mm.ui.tipsbar.ChatTipsBarGroup$d r10 = r7.f224218f
            com.tencent.mm.ui.tipsbar.ChatTipsBarGroup$e r10 = r10.f219974b
            com.tencent.mm.ui.tipsbar.ChatTipsBarGroup$e r11 = com.tencent.p014mm.p136ui.tipsbar.ChatTipsBarGroup.C74826e.ON_RESUME
            r12 = 0
            r13 = 1
            if (r10 != r11) goto L_0x0019
            r10 = 1
            goto L_0x001a
        L_0x0019:
            r10 = 0
        L_0x001a:
            ck3.b r11 = r7.f224217e
            java.lang.Class<zj3.g> r0 = zj3.C79357g.class
            com.tencent.mm.ui.chatting.manager.a r11 = r11.f193278b
            xi.d r11 = r11.mo102812a(r0)
            zj3.g r11 = (zj3.C79357g) r11
            boolean r11 = r11.mo102150S1()
            if (r11 != 0) goto L_0x0041
            ck3.b r11 = r7.f224217e
            java.lang.Class<zj3.e> r0 = zj3.C79348e.class
            com.tencent.mm.ui.chatting.manager.a r11 = r11.f193278b
            xi.d r11 = r11.mo102812a(r0)
            zj3.e r11 = (zj3.C79348e) r11
            boolean r11 = r11.mo70079x5()
            if (r11 == 0) goto L_0x003f
            goto L_0x0041
        L_0x003f:
            r11 = 0
            goto L_0x0042
        L_0x0041:
            r11 = 1
        L_0x0042:
            r0 = 2131309728(0x7f0934a0, float:1.8237748E38)
            android.view.View r8 = r8.mo85812D(r0)
            com.tencent.mm.ui.MultiTalkRoomPopupNav r8 = (com.tencent.p014mm.p136ui.MultiTalkRoomPopupNav) r8
            ck3.b r0 = r7.f224217e
            r8.setChattingContext(r0)
            ck3.b r0 = r7.f224217e
            java.lang.String r0 = r0.mo91577r()
            r8.setGroupUserName(r0)
            ck3.b r0 = r7.f224217e
            java.lang.String r0 = r0.mo91573n()
            r8.setCurrentSenderUserName(r0)
            r8.setInChatRoom(r11)
            r8.mo101475h(r10)
            xh.k6 r10 = r9.f224440u
            r8.setMultiTalkInfo(r10)
            com.tencent.mm.ui.tipsbar.ChatTipsBarGroup$d r10 = r7.f224218f
            com.tencent.mm.ui.tipsbar.ChatTipsBarGroup$c r10 = r10.f219973a
            com.tencent.mm.ui.tipsbar.ChatTipsBarGroup$c r11 = com.tencent.p014mm.p136ui.tipsbar.ChatTipsBarGroup.C74824c.MODE_FOLD
            if (r10 != r11) goto L_0x0077
            r10 = 1
            goto L_0x0078
        L_0x0077:
            r10 = 0
        L_0x0078:
            if (r10 == 0) goto L_0x007e
            r8.mo101469c()
            goto L_0x00b1
        L_0x007e:
            mn3.g$a r10 = r9.f224441v
            boolean r11 = r10.f224611a
            if (r11 == 0) goto L_0x00ae
            java.util.List<java.lang.String> r10 = r10.f224612b
            boolean r10 = r10.isEmpty()
            r10 = r10 ^ r13
            if (r10 == 0) goto L_0x00ae
            mn3.g$a r10 = r9.f224441v
            java.util.List<java.lang.String> r10 = r10.f224612b
            java.lang.String r11 = ""
            java.util.List r2 = r8.mo101468b(r10, r11)
            ck3.b r10 = r7.f224217e
            java.lang.String r3 = r10.mo91577r()
            mn3.g$a r9 = r9.f224441v
            java.util.List<java.lang.String> r9 = r9.f224612b
            int r4 = r9.size()
            r5 = 0
            java.lang.String r1 = ""
            r0 = r8
            r0.mo101473g(r1, r2, r3, r4, r5)
            goto L_0x00b1
        L_0x00ae:
            r8.mo101469c()
        L_0x00b1:
            com.tencent.mm.ui.widget.imageview.WeImageView r9 = r8.f214532e
            r10 = 8
            if (r9 != 0) goto L_0x00b8
            goto L_0x00c5
        L_0x00b8:
            com.tencent.mm.ui.tipsbar.ChatTipsBarGroup$d r11 = r7.f224218f
            boolean r11 = r11.mo104003a()
            if (r11 == 0) goto L_0x00c2
            r12 = 8
        L_0x00c2:
            r9.setVisibility(r12)
        L_0x00c5:
            kn3.f$a r9 = new kn3.f$a
            r9.<init>(r7)
            r8.setEnterMultiTalkListener(r9)
            r9 = 2131309681(0x7f093471, float:1.8237653E38)
            android.view.View r9 = r8.findViewById(r9)
            boolean r11 = r9 instanceof android.widget.Button
            if (r11 == 0) goto L_0x00db
            android.widget.Button r9 = (android.widget.Button) r9
            goto L_0x00dc
        L_0x00db:
            r9 = 0
        L_0x00dc:
            if (r9 == 0) goto L_0x00f0
            java.lang.Class<l31.e> r11 = l31.C61212e.class
            di3.d r11 = di3.C86312j.m106911c(r11)
            l31.e r11 = (l31.C61212e) r11
            java.lang.String r12 = "group_msg_set_top_bar_join_btn"
            r11.o30(r9, r12)
            r12 = 26356(0x66f4, float:3.6933E-41)
            r11.mo86175pO(r9, r10, r12)
        L_0x00f0:
            mn3.g r9 = r7.f224219g
            r9.f224610f = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kn3.C76607f.mo44e(jq3.o, ln3.g, int, int, boolean, java.util.List):void");
    }
}
