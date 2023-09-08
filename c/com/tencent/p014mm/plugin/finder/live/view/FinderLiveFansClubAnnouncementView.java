package com.tencent.p014mm.plugin.finder.live.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveFansClubAnnouncementView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveFansClubAnnouncementView */
public final class FinderLiveFansClubAnnouncementView extends FrameLayout {

    /* renamed from: d */
    public Context f15224d;

    /* renamed from: e */
    public View f15225e;

    /* renamed from: f */
    public View f15226f;

    /* renamed from: g */
    public View f15227g;

    /* renamed from: h */
    public TextView f15228h;

    /* renamed from: i */
    public TextView f15229i;

    /* renamed from: j */
    public ImageView f15230j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveFansClubAnnouncementView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        mo3263a(context);
    }

    /* renamed from: a */
    public final void mo3263a(Context context) {
        this.f15224d = context;
        View inflate = View.inflate(context, C0966R.C0971layout.f359717cv3, this);
        C87412m.m108593f(inflate, "inflate(context, R.layou…ncement_content_ui, this)");
        this.f15225e = inflate;
        View findViewById = inflate.findViewById(C0966R.C0970id.mzw);
        C87412m.m108593f(findViewById, "root.findViewById(R.id.f…_announcement_empty_view)");
        this.f15226f = findViewById;
        View view = this.f15225e;
        if (view != null) {
            View findViewById2 = view.findViewById(C0966R.C0970id.mzs);
            C87412m.m108593f(findViewById2, "root.findViewById(R.id.f…nnouncement_content_view)");
            this.f15227g = findViewById2;
            View view2 = this.f15225e;
            if (view2 != null) {
                View findViewById3 = view2.findViewById(C0966R.C0970id.mzy);
                C87412m.m108593f(findViewById3, "root.findViewById(R.id.f…nouncement_title_tx_view)");
                this.f15228h = (TextView) findViewById3;
                View view3 = this.f15225e;
                if (view3 != null) {
                    View findViewById4 = view3.findViewById(C0966R.C0970id.mzx);
                    C87412m.m108593f(findViewById4, "root.findViewById(R.id.f…uncement_title_desc_view)");
                    this.f15229i = (TextView) findViewById4;
                    View view4 = this.f15225e;
                    if (view4 != null) {
                        View findViewById5 = view4.findViewById(C0966R.C0970id.mzu);
                        C87412m.m108593f(findViewById5, "root.findViewById(R.id.f…_announcement_cover_view)");
                        this.f15230j = (ImageView) findViewById5;
                        return;
                    }
                    C87412m.m108603p("root");
                    throw null;
                }
                C87412m.m108603p("root");
                throw null;
            }
            C87412m.m108603p("root");
            throw null;
        }
        C87412m.m108603p("root");
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:62:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3264b(te3.C50689oj r31) {
        /*
            r30 = this;
            r0 = r30
            r1 = r31
            java.lang.Class<pl1.s0> r2 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r3 = ht1.C60200t1.class
            r4 = 8
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r6 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            java.lang.String r9 = "contentView"
            java.lang.String r10 = "emptyView"
            if (r1 == 0) goto L_0x015d
            java.lang.String r11 = r1.f139210e
            r12 = 1
            if (r11 == 0) goto L_0x0020
            r11 = 1
            goto L_0x0021
        L_0x0020:
            r11 = 0
        L_0x0021:
            if (r11 == 0) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            r1 = 0
        L_0x0025:
            if (r1 == 0) goto L_0x015d
            android.view.View r11 = r0.f15226f
            if (r11 == 0) goto L_0x0158
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r13 = k20.C60958c.f173611a
            r15.mo10233c(r5)
            java.lang.Object[] r14 = r15.mo10232b()
            java.lang.String r16 = "com/tencent/mm/plugin/finder/live/view/FinderLiveFansClubAnnouncementView"
            java.lang.String r17 = "updateContent"
            java.lang.String r18 = "(Lcom/tencent/mm/protocal/protobuf/Bulletin;)V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            r13 = r11
            r8 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r19
            r19 = r20
            r20 = r21
            j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r8 = r8.mo10231a(r6)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r11.setVisibility(r8)
            java.lang.String r14 = "com/tencent/mm/plugin/finder/live/view/FinderLiveFansClubAnnouncementView"
            java.lang.String r15 = "updateContent"
            java.lang.String r16 = "(Lcom/tencent/mm/protocal/protobuf/Bulletin;)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
            android.view.View r8 = r0.f15227g
            if (r8 == 0) goto L_0x0153
            k20.a r11 = new k20.a
            r11.<init>()
            r11.mo10233c(r7)
            java.lang.Object[] r23 = r11.mo10232b()
            java.lang.String r24 = "com/tencent/mm/plugin/finder/live/view/FinderLiveFansClubAnnouncementView"
            java.lang.String r25 = "updateContent"
            java.lang.String r26 = "(Lcom/tencent/mm/protocal/protobuf/Bulletin;)V"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            r22 = r8
            j20.C117292a.m165358d(r22, r23, r24, r25, r26, r27, r28, r29)
            java.lang.Object r11 = r11.mo10231a(r6)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r8.setVisibility(r11)
            java.lang.String r23 = "com/tencent/mm/plugin/finder/live/view/FinderLiveFansClubAnnouncementView"
            java.lang.String r24 = "updateContent"
            java.lang.String r25 = "(Lcom/tencent/mm/protocal/protobuf/Bulletin;)V"
            java.lang.String r26 = "android/view/View_EXEC_"
            java.lang.String r27 = "setVisibility"
            java.lang.String r28 = "(I)V"
            j20.C117292a.m165359e(r22, r23, r24, r25, r26, r27, r28)
            android.widget.TextView r8 = r0.f15228h
            if (r8 == 0) goto L_0x014b
            java.lang.String r11 = r1.f139210e
            r8.setText(r11)
            android.widget.TextView r8 = r0.f15229i
            if (r8 == 0) goto L_0x0144
            android.content.Context r11 = r0.f15224d
            if (r11 == 0) goto L_0x013d
            r13 = 2131827320(0x7f111a78, float:1.928755E38)
            java.lang.Object[] r14 = new java.lang.Object[r12]
            int r15 = r1.f139209d
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r14[r6] = r15
            java.lang.String r11 = r11.getString(r13, r14)
            r8.setText(r11)
            java.lang.String r8 = r1.f139211f
            if (r8 == 0) goto L_0x00e8
            int r8 = r8.length()
            if (r8 != 0) goto L_0x00e7
            goto L_0x00e8
        L_0x00e7:
            r12 = 0
        L_0x00e8:
            java.lang.String r8 = "coverImgView"
            if (r12 == 0) goto L_0x00f9
            android.widget.ImageView r1 = r0.f15230j
            if (r1 == 0) goto L_0x00f4
            r1.setVisibility(r4)
            goto L_0x0130
        L_0x00f4:
            gy3.C87412m.m108603p(r8)
            r1 = 0
            throw r1
        L_0x00f9:
            android.widget.ImageView r4 = r0.f15230j
            if (r4 == 0) goto L_0x0138
            r4.setVisibility(r6)
            bl3.r r4 = bl3.C39818r.f106831a
            bl3.r$a r11 = r4.mo62446e(r3)
            bl3.c r11 = r11.mo62447c(r2)
            pl1.s0 r11 = (pl1.C11990s0) r11
            k60.d r11 = r11.mo11871f2()
            pl1.n0 r12 = new pl1.n0
            java.lang.String r1 = r1.f139211f
            up1.y r13 = up1.C27696y.THUMB_IMAGE
            r12.<init>(r1, r13)
            android.widget.ImageView r1 = r0.f15230j
            if (r1 == 0) goto L_0x0133
            pl1.e0$a r8 = pl1.C11978e0.C11979a.DEFAULT
            bl3.r$a r3 = r4.mo62446e(r3)
            bl3.c r2 = r3.mo62447c(r2)
            pl1.s0 r2 = (pl1.C11990s0) r2
            n60.f r2 = r2.mo11867O2(r8)
            r11.mo85957c(r12, r1, r2)
        L_0x0130:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x015e
        L_0x0133:
            gy3.C87412m.m108603p(r8)
            r1 = 0
            throw r1
        L_0x0138:
            r1 = 0
            gy3.C87412m.m108603p(r8)
            throw r1
        L_0x013d:
            r1 = 0
            java.lang.String r2 = "mContext"
            gy3.C87412m.m108603p(r2)
            throw r1
        L_0x0144:
            r1 = 0
            java.lang.String r2 = "descTxView"
            gy3.C87412m.m108603p(r2)
            throw r1
        L_0x014b:
            r1 = 0
            java.lang.String r2 = "titleTxView"
            gy3.C87412m.m108603p(r2)
            throw r1
        L_0x0153:
            r1 = 0
            gy3.C87412m.m108603p(r9)
            throw r1
        L_0x0158:
            r1 = 0
            gy3.C87412m.m108603p(r10)
            throw r1
        L_0x015d:
            r1 = 0
        L_0x015e:
            if (r1 != 0) goto L_0x01ee
            android.view.View r1 = r0.f15226f
            if (r1 == 0) goto L_0x01e9
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            r2.mo10233c(r7)
            java.lang.Object[] r12 = r2.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/finder/live/view/FinderLiveFansClubAnnouncementView"
            java.lang.String r14 = "updateContent"
            java.lang.String r15 = "(Lcom/tencent/mm/protocal/protobuf/Bulletin;)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r1
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r2 = r2.mo10231a(r6)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r12 = "com/tencent/mm/plugin/finder/live/view/FinderLiveFansClubAnnouncementView"
            java.lang.String r13 = "updateContent"
            java.lang.String r14 = "(Lcom/tencent/mm/protocal/protobuf/Bulletin;)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            android.view.View r1 = r0.f15227g
            if (r1 == 0) goto L_0x01e4
            k20.a r2 = new k20.a
            r2.<init>()
            r2.mo10233c(r5)
            java.lang.Object[] r23 = r2.mo10232b()
            java.lang.String r24 = "com/tencent/mm/plugin/finder/live/view/FinderLiveFansClubAnnouncementView"
            java.lang.String r25 = "updateContent"
            java.lang.String r26 = "(Lcom/tencent/mm/protocal/protobuf/Bulletin;)V"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            r22 = r1
            j20.C117292a.m165358d(r22, r23, r24, r25, r26, r27, r28, r29)
            java.lang.Object r2 = r2.mo10231a(r6)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r23 = "com/tencent/mm/plugin/finder/live/view/FinderLiveFansClubAnnouncementView"
            java.lang.String r24 = "updateContent"
            java.lang.String r25 = "(Lcom/tencent/mm/protocal/protobuf/Bulletin;)V"
            java.lang.String r26 = "android/view/View_EXEC_"
            java.lang.String r27 = "setVisibility"
            java.lang.String r28 = "(I)V"
            j20.C117292a.m165359e(r22, r23, r24, r25, r26, r27, r28)
            goto L_0x01ee
        L_0x01e4:
            gy3.C87412m.m108603p(r9)
            r1 = 0
            throw r1
        L_0x01e9:
            r1 = 0
            gy3.C87412m.m108603p(r10)
            throw r1
        L_0x01ee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.view.FinderLiveFansClubAnnouncementView.mo3264b(te3.oj):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveFansClubAnnouncementView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        mo3263a(context);
    }
}
