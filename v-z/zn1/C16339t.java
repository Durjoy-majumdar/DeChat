package zn1;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import jq3.C60896i;
import jq3.C60905o;

/* renamed from: zn1.t */
public final class C16339t extends C60896i<C16340u> {
    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.d2e;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x023f  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo44e(jq3.C60905o r20, jq3.C9493c r21, int r22, int r23, boolean r24, java.util.List r25) {
        /*
            r19 = this;
            r0 = r20
            r1 = r21
            zn1.u r1 = (zn1.C16340u) r1
            java.lang.String r2 = "holder"
            gy3.C87412m.m108594g(r0, r2)
            java.lang.String r2 = "item"
            gy3.C87412m.m108594g(r1, r2)
            up1.y r5 = up1.C27696y.THUMB_IMAGE
            pl1.e0$a r2 = pl1.C11978e0.C11979a.COMMON
            java.lang.Class<pl1.s0> r10 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r11 = ht1.C60200t1.class
            r3 = 2131304555(0x7f09206b, float:1.8227256E38)
            android.view.View r3 = r0.mo85812D(r3)
            r12 = r3
            android.widget.ImageView r12 = (android.widget.ImageView) r12
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r1.mo3513o()
            java.util.LinkedList r3 = r3.getMediaList()
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x003a
            r2 = 2131099659(0x7f06000b, float:1.7811677E38)
            r12.setImageResource(r2)
        L_0x0036:
            r21 = r1
            goto L_0x00f9
        L_0x003a:
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r1.mo3513o()
            java.util.LinkedList r3 = r3.getMediaList()
            java.lang.Object r3 = sx3.C110818d0.m150914L(r3)
            r14 = r3
            te3.rq2 r14 = (te3.C64689rq2) r14
            int r3 = r14.f185268f
            r4 = 4
            java.lang.String r15 = "playListCover"
            if (r3 != r4) goto L_0x00bf
            java.lang.String r3 = r14.f185283w
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 == 0) goto L_0x0089
            pl1.b0 r13 = new pl1.b0
            r6 = 0
            r7 = 0
            r8 = 12
            r9 = 0
            r3 = r13
            r4 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9)
            bl3.r r3 = bl3.C39818r.f106831a
            bl3.r$a r4 = r3.mo62446e(r11)
            bl3.c r4 = r4.mo62447c(r10)
            pl1.s0 r4 = (pl1.C11990s0) r4
            k60.d r4 = r4.mo11871f2()
            gy3.C87412m.m108593f(r12, r15)
            bl3.r$a r3 = r3.mo62446e(r11)
            bl3.c r3 = r3.mo62447c(r10)
            pl1.s0 r3 = (pl1.C11990s0) r3
            n60.f r2 = r3.mo11867O2(r2)
            r4.mo85957c(r13, r12, r2)
            goto L_0x0036
        L_0x0089:
            pl1.o0 r3 = new pl1.o0
            up1.y r4 = up1.C27696y.RAW_IMAGE
            r16 = 0
            r17 = 4
            r18 = 0
            r13 = r3
            r9 = r15
            r15 = r4
            r13.<init>(r14, r15, r16, r17, r18)
            bl3.r r4 = bl3.C39818r.f106831a
            bl3.r$a r5 = r4.mo62446e(r11)
            bl3.c r5 = r5.mo62447c(r10)
            pl1.s0 r5 = (pl1.C11990s0) r5
            k60.d r5 = r5.mo11871f2()
            gy3.C87412m.m108593f(r12, r9)
            bl3.r$a r4 = r4.mo62446e(r11)
            bl3.c r4 = r4.mo62447c(r10)
            pl1.s0 r4 = (pl1.C11990s0) r4
            n60.f r2 = r4.mo11867O2(r2)
            r5.mo85957c(r3, r12, r2)
            goto L_0x0036
        L_0x00bf:
            r9 = r15
            bl3.r r13 = bl3.C39818r.f106831a
            bl3.r$a r3 = r13.mo62446e(r11)
            bl3.c r3 = r3.mo62447c(r10)
            pl1.s0 r3 = (pl1.C11990s0) r3
            k60.d r15 = r3.mo11871f2()
            pl1.b0 r8 = new pl1.b0
            r6 = 0
            r7 = 0
            r16 = 12
            r17 = 0
            r3 = r8
            r4 = r14
            r14 = r8
            r8 = r16
            r21 = r1
            r1 = r9
            r9 = r17
            r3.<init>(r4, r5, r6, r7, r8, r9)
            gy3.C87412m.m108593f(r12, r1)
            bl3.r$a r1 = r13.mo62446e(r11)
            bl3.c r1 = r1.mo62447c(r10)
            pl1.s0 r1 = (pl1.C11990s0) r1
            n60.f r1 = r1.mo11867O2(r2)
            r15.mo85957c(r14, r12, r1)
        L_0x00f9:
            r1 = 2131304557(0x7f09206d, float:1.822726E38)
            android.view.View r1 = r0.mo85812D(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            android.text.TextPaint r2 = r1.getPaint()
            com.tencent.p014mm.p136ui.C85875k4.m106191k0(r2)
            r2 = 2131304558(0x7f09206e, float:1.8227262E38)
            android.view.View r2 = r0.mo85812D(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r21.mo3513o()
            java.lang.String r3 = r3.getDescription()
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 == 0) goto L_0x0123
            java.lang.String r3 = ""
            goto L_0x012b
        L_0x0123:
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r21.mo3513o()
            android.text.SpannableString r3 = r3.getDescriptionSpan()
        L_0x012b:
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.CharSequence) r3)
            r5 = 0
            r6 = 0
            r7 = 8
            if (r4 != 0) goto L_0x0193
            r1.setVisibility(r6)
            android.text.SpannableStringBuilder r4 = new android.text.SpannableStringBuilder
            r4.<init>()
            android.content.Context r8 = r0.f173499A
            java.lang.String r9 = "holder.context"
            gy3.C87412m.m108593f(r8, r9)
            com.tencent.mm.plugin.finder.storage.FinderItem r9 = r21.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r9 = r9.getFeedObject()
            te3.kf1 r9 = r9.object_extend
            if (r9 == 0) goto L_0x0186
            te3.rh0 r9 = r9.f136745d
            if (r9 == 0) goto L_0x0186
            de3.u r10 = new de3.u
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            int r9 = r9.f140923j
            r11.append(r9)
            java.lang.String r9 = "  "
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            r10.<init>((java.lang.String) r9)
            android.text.style.ForegroundColorSpan r9 = new android.text.style.ForegroundColorSpan
            android.content.res.Resources r8 = r8.getResources()
            r11 = 2131099804(0x7f06009c, float:1.7811972E38)
            int r8 = r8.getColor(r11)
            r9.<init>(r8)
            int r8 = r10.length()
            r11 = 17
            r10.mo105705b(r9, r6, r8, r11)
            goto L_0x0187
        L_0x0186:
            r10 = r5
        L_0x0187:
            if (r10 == 0) goto L_0x018c
            r4.append(r10)
        L_0x018c:
            r4.append(r3)
            r1.setText(r4)
            goto L_0x0196
        L_0x0193:
            r1.setVisibility(r7)
        L_0x0196:
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r21.mo3513o()
            int r1 = r1.getLikeCount()
            if (r1 <= 0) goto L_0x01ae
            r1 = 2
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r21.mo3513o()
            int r3 = r3.getLikeCount()
            java.lang.String r1 = er1.C7878t0.m8034c(r1, r3)
            goto L_0x01b0
        L_0x01ae:
            java.lang.String r1 = "0"
        L_0x01b0:
            r2.setText(r1)
            java.lang.Object r1 = r0.f173503E
            zn1.u r1 = (zn1.C16340u) r1
            boolean r2 = r1.f43691d
            r3 = 2131101688(0x7f0607f8, float:1.7815793E38)
            r4 = 2131304559(0x7f09206f, float:1.8227264E38)
            r8 = 2131304554(0x7f09206a, float:1.8227254E38)
            if (r2 == 0) goto L_0x023f
            android.view.View r2 = r0.mo85812D(r4)
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r4.mo10233c(r7)
            java.lang.Object[] r10 = r4.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/finder/playlist/FinderPlayListFeedConvert"
            java.lang.String r12 = "refreshSelectedItem"
            java.lang.String r13 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r9 = r2
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r4 = r4.mo10231a(r6)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r2.setVisibility(r4)
            java.lang.String r10 = "com/tencent/mm/plugin/finder/playlist/FinderPlayListFeedConvert"
            java.lang.String r11 = "refreshSelectedItem"
            java.lang.String r12 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
            boolean r2 = r1.f43692e
            if (r2 == 0) goto L_0x0215
            android.view.View r0 = r0.mo85812D(r8)
            r0.setBackgroundResource(r3)
            goto L_0x028a
        L_0x0215:
            r2 = 1
            r1.f43692e = r2
            android.view.View r1 = r0.mo85812D(r8)
            r2 = 2131100588(0x7f0603ac, float:1.7813562E38)
            r1.setBackgroundResource(r2)
            a14.n0 r1 = r0.f29679z
            if (r1 == 0) goto L_0x028a
            r2 = 0
            r3 = 0
            zn1.s r4 = new zn1.s
            r4.<init>(r0, r5)
            r0 = 3
            r5 = 0
            r20 = r1
            r21 = r2
            r22 = r3
            r23 = r4
            r24 = r0
            r25 = r5
            a14.C53895h.m60466d(r20, r21, r22, r23, r24, r25)
            goto L_0x028a
        L_0x023f:
            android.view.View r1 = r0.mo85812D(r4)
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r2.mo10233c(r4)
            java.lang.Object[] r10 = r2.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/finder/playlist/FinderPlayListFeedConvert"
            java.lang.String r12 = "refreshSelectedItem"
            java.lang.String r13 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r9 = r1
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r2 = r2.mo10231a(r6)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r10 = "com/tencent/mm/plugin/finder/playlist/FinderPlayListFeedConvert"
            java.lang.String r11 = "refreshSelectedItem"
            java.lang.String r12 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
            android.view.View r0 = r0.mo85812D(r8)
            r0.setBackgroundResource(r3)
        L_0x028a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zn1.C16339t.mo44e(jq3.o, jq3.c, int, int, boolean, java.util.List):void");
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
