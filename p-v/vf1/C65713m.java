package vf1;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.plugin.finder.feed.FinderCommentDrawerPresenter;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderCommentUI;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import di3.C86312j;
import er1.C58684b;
import j20.C117292a;
import java.util.ArrayList;
import rs1.C13442s8;
import ur1.C65468g;

/* renamed from: vf1.m */
public final class C65713m extends C65468g {

    /* renamed from: A */
    public final /* synthetic */ int f189059A;

    /* renamed from: B */
    public final /* synthetic */ int f189060B;

    /* renamed from: C */
    public final /* synthetic */ FinderCommentUI f189061C;

    /* renamed from: x */
    public final /* synthetic */ boolean f189062x;

    /* renamed from: y */
    public final /* synthetic */ FinderItem f189063y;

    /* renamed from: z */
    public final /* synthetic */ long f189064z;

    /* renamed from: vf1.m$a */
    public static final class C65714a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderItem f189065d;

        /* renamed from: e */
        public final /* synthetic */ long f189066e;

        /* renamed from: f */
        public final /* synthetic */ int f189067f;

        /* renamed from: g */
        public final /* synthetic */ int f189068g;

        /* renamed from: h */
        public final /* synthetic */ Context f189069h;

        /* renamed from: i */
        public final /* synthetic */ FinderCommentUI f189070i;

        public C65714a(FinderItem finderItem, long j, int i, int i2, Context context, FinderCommentUI finderCommentUI) {
            this.f189065d = finderItem;
            this.f189066e = j;
            this.f189067f = i;
            this.f189068g = i2;
            this.f189069h = context;
            this.f189070i = finderCommentUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderCommentUI$initBuilder$1$onBuildDrawerHeader$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent();
            intent.putExtra("feed_object_id", this.f189065d.getId());
            intent.putExtra("mention_id", this.f189066e);
            intent.putExtra("mention_create_time", this.f189067f);
            intent.putExtra("from_scene", this.f189068g);
            intent.putExtra("from_comment_ui", true);
            C13442s8.f38060Q0.mo12871c(this.f189069h, intent);
            ((C58684b) C86312j.m106911c(C58684b.class)).Sx0(this.f189070i, intent);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderCommentUI$initBuilder$1$onBuildDrawerHeader$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65713m(boolean z, FinderItem finderItem, long j, int i, int i2, FinderCommentUI finderCommentUI, FinderCommentDrawerPresenter finderCommentDrawerPresenter) {
        super(finderCommentDrawerPresenter);
        this.f189062x = z;
        this.f189063y = finderItem;
        this.f189064z = j;
        this.f189059A = i;
        this.f189060B = i2;
        this.f189061C = finderCommentUI;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0195  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo79737a(android.content.Context r25, android.widget.FrameLayout r26, boolean r27) {
        /*
            r24 = this;
            r0 = r24
            r9 = r25
            r10 = r26
            pl1.e0$a r11 = pl1.C11978e0.C11979a.TIMELINE
            up1.y r12 = up1.C27696y.THUMB_IMAGE
            java.lang.Class<ny.h> r13 = p629ny.C76979h.class
            java.lang.Class<pl1.s0> r14 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r15 = ht1.C60200t1.class
            java.lang.String r1 = "context"
            gy3.C87412m.m108594g(r9, r1)
            java.lang.String r1 = "headerLayout"
            gy3.C87412m.m108594g(r10, r1)
            super.mo79737a(r25, r26, r27)
            boolean r1 = r0.f189062x
            r2 = 2131305294(0x7f09234e, float:1.8228755E38)
            r7 = 0
            if (r1 == 0) goto L_0x01a4
            android.view.View r6 = r10.findViewById(r2)
            if (r6 != 0) goto L_0x002c
            return
        L_0x002c:
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            r1.mo10233c(r2)
            java.lang.Object[] r17 = r1.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/finder/feed/ui/FinderCommentUI$initBuilder$1"
            java.lang.String r19 = "onBuildDrawerHeader"
            java.lang.String r20 = "(Landroid/content/Context;Landroid/widget/FrameLayout;Z)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r6
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r1 = r1.mo10231a(r7)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r6.setVisibility(r1)
            java.lang.String r17 = "com/tencent/mm/plugin/finder/feed/ui/FinderCommentUI$initBuilder$1"
            java.lang.String r18 = "onBuildDrawerHeader"
            java.lang.String r19 = "(Landroid/content/Context;Landroid/widget/FrameLayout;Z)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            vf1.m$a r5 = new vf1.m$a
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r0.f189063y
            long r3 = r0.f189064z
            int r1 = r0.f189059A
            int r7 = r0.f189060B
            com.tencent.mm.plugin.finder.feed.ui.FinderCommentUI r8 = r0.f189061C
            r17 = r1
            r1 = r5
            r9 = r5
            r5 = r17
            r17 = r13
            r13 = r6
            r6 = r7
            r7 = r25
            r1.<init>(r2, r3, r5, r6, r7, r8)
            r13.setOnClickListener(r9)
            r1 = 2131305296(0x7f092350, float:1.8228759E38)
            android.view.View r1 = r10.findViewById(r1)
            r8 = r1
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r0.f189063y
            java.util.LinkedList r1 = r1.getMediaList()
            java.lang.Object r1 = sx3.C110818d0.m150916N(r1)
            r2 = r1
            te3.rq2 r2 = (te3.C64689rq2) r2
            if (r2 == 0) goto L_0x011f
            int r1 = r2.f185268f
            r3 = 4
            java.lang.String r9 = "thumbIv"
            if (r1 != r3) goto L_0x00e3
            pl1.b0 r7 = new pl1.b0
            r4 = 0
            r5 = 0
            r6 = 12
            r16 = 0
            r1 = r7
            r3 = r12
            r12 = r7
            r7 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7)
            bl3.r r1 = bl3.C39818r.f106831a
            bl3.r$a r1 = r1.mo62446e(r15)
            bl3.c r1 = r1.mo62447c(r14)
            pl1.s0 r1 = (pl1.C11990s0) r1
            k60.d r1 = r1.mo11871f2()
            gy3.C87412m.m108593f(r8, r9)
            bl3.r r2 = bl3.C39818r.f106831a
            bl3.r$a r2 = r2.mo62446e(r15)
            bl3.c r2 = r2.mo62447c(r14)
            pl1.s0 r2 = (pl1.C11990s0) r2
            n60.f r2 = r2.mo11867O2(r11)
            r1.mo85957c(r12, r8, r2)
            goto L_0x011f
        L_0x00e3:
            bl3.r r1 = bl3.C39818r.f106831a
            bl3.r$a r1 = r1.mo62446e(r15)
            bl3.c r1 = r1.mo62447c(r14)
            pl1.s0 r1 = (pl1.C11990s0) r1
            k60.d r7 = r1.mo11871f2()
            pl1.b0 r6 = new pl1.b0
            r4 = 0
            r5 = 0
            r16 = 12
            r18 = 0
            r1 = r6
            r3 = r12
            r12 = r6
            r6 = r16
            r16 = r13
            r13 = r7
            r7 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7)
            gy3.C87412m.m108593f(r8, r9)
            bl3.r r1 = bl3.C39818r.f106831a
            bl3.r$a r1 = r1.mo62446e(r15)
            bl3.c r1 = r1.mo62447c(r14)
            pl1.s0 r1 = (pl1.C11990s0) r1
            n60.f r1 = r1.mo11867O2(r11)
            r13.mo85957c(r12, r8, r1)
            goto L_0x0121
        L_0x011f:
            r16 = r13
        L_0x0121:
            r1 = 2131305297(0x7f092351, float:1.822876E38)
            android.view.View r1 = r10.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            android.text.TextPaint r2 = r1.getPaint()
            r3 = 1061997773(0x3f4ccccd, float:0.8)
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r2, r3)
            di3.d r2 = di3.C86312j.m106911c(r17)
            ny.h r2 = (p629ny.C76979h) r2
            r3 = 2131826618(0x7f1117ba, float:1.9286125E38)
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r0.f189063y
            java.lang.String r5 = r5.getNickName()
            r6 = 0
            r4[r6] = r5
            r5 = r25
            java.lang.String r3 = r5.getString(r3, r4)
            android.text.SpannableString r2 = r2.mo107057T1(r5, r3)
            r1.setText(r2)
            r1 = 2131305295(0x7f09234f, float:1.8228757E38)
            android.view.View r1 = r10.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r0.f189063y
            java.lang.String r2 = r2.getDescription()
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x0195
            r1.setVisibility(r6)
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r0.f189063y
            java.lang.String r2 = r2.getDescription()
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 == 0) goto L_0x017d
            java.lang.String r2 = ""
            goto L_0x0191
        L_0x017d:
            di3.d r2 = di3.C86312j.m106911c(r17)
            ny.h r2 = (p629ny.C76979h) r2
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r0.f189063y
            java.lang.String r4 = r4.getDescription()
            android.text.SpannableString r2 = r2.mo107057T1(r3, r4)
        L_0x0191:
            r1.setText(r2)
            goto L_0x019a
        L_0x0195:
            r3 = 8
            r1.setVisibility(r3)
        L_0x019a:
            com.tencent.mm.plugin.finder.view.FinderCommentDrawer r1 = r24.mo89585j()
            r2 = r16
            r1.mo82528c(r2)
            goto L_0x01ef
        L_0x01a4:
            r3 = 8
            r6 = 0
            android.view.View r1 = r10.findViewById(r2)
            if (r1 != 0) goto L_0x01ae
            goto L_0x01ef
        L_0x01ae:
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.mo10233c(r3)
            java.lang.Object[] r8 = r2.mo10232b()
            java.lang.String r9 = "com/tencent/mm/plugin/finder/feed/ui/FinderCommentUI$initBuilder$1"
            java.lang.String r10 = "onBuildDrawerHeader"
            java.lang.String r11 = "(Landroid/content/Context;Landroid/widget/FrameLayout;Z)V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            r7 = r1
            j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.Object r2 = r2.mo10231a(r6)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r4 = "com/tencent/mm/plugin/finder/feed/ui/FinderCommentUI$initBuilder$1"
            java.lang.String r5 = "onBuildDrawerHeader"
            java.lang.String r6 = "(Landroid/content/Context;Landroid/widget/FrameLayout;Z)V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            r3 = r1
            j20.C117292a.m165359e(r3, r4, r5, r6, r7, r8, r9)
        L_0x01ef:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vf1.C65713m.mo79737a(android.content.Context, android.widget.FrameLayout, boolean):void");
    }
}
