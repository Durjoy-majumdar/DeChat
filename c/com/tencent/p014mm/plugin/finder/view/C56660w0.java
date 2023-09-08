package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.content.DialogInterface;
import android.widget.Button;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.plugin.finder.p056ui.FinderHomeUI;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C7335d;
import di3.C86312j;
import dp1.C58417y0;
import eb0.C31543z5;
import gy3.C8480h;
import gy3.C87412m;
import p185kq.C76622f;
import qo3.C77398g;
import rs1.C13442s8;
import rx3.C13604l;
import te3.C49712hj1;
import wd3.C65953v0;
import wr1.C66184f;
import wr1.C66189h;

/* renamed from: com.tencent.mm.plugin.finder.view.w0 */
public final class C56660w0 {

    /* renamed from: d */
    public static final C30033a f162410d = new C30033a((C8480h) null);

    /* renamed from: e */
    public static C13604l<Boolean, Long> f162411e = new C13604l<>(Boolean.FALSE, 0L);

    /* renamed from: f */
    public static int f162412f;

    /* renamed from: a */
    public final Context f162413a;

    /* renamed from: b */
    public final String f162414b;

    /* renamed from: c */
    public C66184f.C66185a f162415c;

    /* renamed from: com.tencent.mm.plugin.finder.view.w0$a */
    public static final class C30033a {
        public C30033a(C8480h hVar) {
        }

        /* renamed from: a */
        public final boolean mo57084a(MMFragmentActivity mMFragmentActivity) {
            C87412m.m108594g(mMFragmentActivity, "context");
            int i = C56660w0.f162412f;
            boolean z = true;
            if (i < 5) {
                C56660w0.f162412f = i + 1;
            }
            int i2 = mMFragmentActivity instanceof FinderHomeUI ? 3 : 1;
            if (!((Boolean) C56660w0.f162411e.f38555d).booleanValue() || ((Number) C56660w0.f162411e.f38556e).longValue() == 0 || C31543z5.m39453c() - ((Number) C56660w0.f162411e.f38556e).longValue() >= 200 || C56660w0.f162412f > i2) {
                z = false;
            }
            Log.m105924i("Finder.TimelineShareDialog", "isInShareStatus time interval:" + (C31543z5.m39453c() - ((Number) C56660w0.f162411e.f38556e).longValue()) + " blockResult:" + z);
            return z;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.w0$b */
    public static final class C56661b implements C65953v0 {

        /* renamed from: a */
        public final /* synthetic */ C66189h f162416a;

        public C56661b(C66189h hVar) {
            this.f162416a = hVar;
        }

        /* renamed from: a */
        public final void mo23a(boolean z, String str, int i) {
            if (z) {
                this.f162416a.mo85992a(z, str, i);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.w0$c */
    public static final class C56662c implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C66184f.C66185a f162417d;

        /* renamed from: e */
        public final /* synthetic */ C56660w0 f162418e;

        /* renamed from: f */
        public final /* synthetic */ long f162419f;

        public C56662c(C66184f.C66185a aVar, C56660w0 w0Var, long j) {
            this.f162417d = aVar;
            this.f162418e = w0Var;
            this.f162419f = j;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C66184f.C66185a aVar = this.f162417d;
            C56660w0 w0Var = this.f162418e;
            long j = this.f162419f;
            aVar.f190207c.dismiss();
            C13442s8 f = C13442s8.f38060Q0.mo12873f(w0Var.f162413a);
            C49712hj1 q3 = f != null ? f.mo12861q3() : null;
            C7335d c = C86312j.m106911c(C58417y0.class);
            C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
            C58417y0.ky0((C58417y0) c, j, 6, 3, "", q3, 0, (FinderItem) null, 96, (Object) null);
        }
    }

    /* JADX WARNING: type inference failed for: r2v48, types: [boolean] */
    /* JADX WARNING: type inference failed for: r2v55 */
    /* JADX WARNING: type inference failed for: r2v57 */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0707  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C56660w0(android.content.Context r39, java.lang.String r40, int r41, ht1.C60166f r42, ht1.C60151b r43, int r44, gy3.C8480h r45) {
        /*
            r38 = this;
            r0 = r38
            r1 = r39
            r2 = r40
            r3 = r41
            r4 = r44 & 8
            r5 = 0
            if (r4 == 0) goto L_0x000f
            r4 = r5
            goto L_0x0011
        L_0x000f:
            r4 = r42
        L_0x0011:
            r6 = r44 & 16
            if (r6 == 0) goto L_0x0017
            r6 = r5
            goto L_0x0019
        L_0x0017:
            r6 = r43
        L_0x0019:
            java.lang.String r7 = "context"
            gy3.C87412m.m108594g(r1, r7)
            java.lang.String r7 = "username"
            gy3.C87412m.m108594g(r2, r7)
            r38.<init>()
            r0.f162413a = r1
            r0.f162414b = r2
            wr1.f$a r7 = new wr1.f$a
            r7.<init>(r1)
            r7.mo90282c(r2)
            java.lang.Class<ny.h> r8 = p629ny.C76979h.class
            java.lang.Class<ht1.t1> r9 = ht1.C60200t1.class
            java.lang.String r10 = "getService(IFinderCommon…atureService::class.java)"
            r11 = 2131302821(0x7f0919a5, float:1.8223739E38)
            java.lang.String r12 = ""
            r13 = 18
            r15 = 1
            if (r3 == r13) goto L_0x0475
            r4 = 23
            if (r3 == r4) goto L_0x0052
            r4 = 31
            if (r3 == r4) goto L_0x0052
            r0 = r7
            r17 = r12
            r7 = r1
            r1 = 1
            goto L_0x06f1
        L_0x0052:
            if (r6 == 0) goto L_0x0465
            java.lang.Class<ir.n> r4 = p565ir.C60606n.class
            n60.f$a r13 = new n60.f$a
            r13.<init>()
            r13.f293176b = r15
            r13.f293175a = r15
            r13.f293186l = r15
            n60.f r13 = r13.mo139398a()
            r14 = 2131497487(0x7f0c120f, float:1.8618568E38)
            android.view.View r14 = android.view.View.inflate(r1, r14, r5)
            android.view.View r11 = r14.findViewById(r11)
            java.lang.String r5 = "view.findViewById(R.id.finder_feed_container)"
            gy3.C87412m.m108593f(r11, r5)
            r5 = 2131302682(0x7f09191a, float:1.8223457E38)
            android.view.View r5 = r11.findViewById(r5)
            java.lang.String r15 = "content.findViewById(R.id.finder_avatar)"
            gy3.C87412m.m108593f(r5, r15)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r15 = 2131302758(0x7f091966, float:1.8223611E38)
            android.view.View r15 = r11.findViewById(r15)
            java.lang.String r0 = "content.findViewById(com….finder_detail_auth_icon)"
            gy3.C87412m.m108593f(r15, r0)
            android.widget.ImageView r15 = (android.widget.ImageView) r15
            k60.a r0 = k60.C99101e.f290571b
            te3.p81 r3 = r6.f171698b
            java.lang.String r3 = r3.f184789r
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r3)
            java.lang.String r2 = "nullAsNil(finderObject.shareObject.headUrl)"
            gy3.C87412m.m108593f(r3, r2)
            r0.mo85957c(r3, r5, r13)
            r0 = 2131302761(0x7f091969, float:1.8223617E38)
            android.view.View r0 = r11.findViewById(r0)
            java.lang.String r2 = "content.findViewById(com…d.finder_detail_nickname)"
            gy3.C87412m.m108593f(r0, r2)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2 = 2131302762(0x7f09196a, float:1.822362E38)
            android.view.View r2 = r11.findViewById(r2)
            java.lang.String r3 = "content.findViewById(com…der_detail_tail_tag_icon)"
            gy3.C87412m.m108593f(r2, r3)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            di3.d r3 = di3.C86312j.m106911c(r8)
            ny.h r3 = (p629ny.C76979h) r3
            te3.p81 r5 = r6.f171698b
            java.lang.String r5 = r5.f184781g
            android.text.SpannableString r3 = r3.mo107057T1(r1, r5)
            r0.setText(r3)
            r3 = 2131304822(0x7f092176, float:1.8227797E38)
            android.view.View r3 = r11.findViewById(r3)
            java.lang.String r5 = "content.findViewById(R.id.finder_thumb)"
            gy3.C87412m.m108593f(r3, r5)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r5 = 2131302686(0x7f09191e, float:1.8223465E38)
            android.view.View r5 = r11.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r13 = 2131302755(0x7f091963, float:1.8223605E38)
            android.view.View r13 = r11.findViewById(r13)
            r27 = r7
            java.lang.String r7 = "content.findViewById(R.id.finder_desc)"
            gy3.C87412m.m108593f(r13, r7)
            android.widget.TextView r13 = (android.widget.TextView) r13
            r7 = 2131302756(0x7f091964, float:1.8223607E38)
            android.view.View r7 = r11.findViewById(r7)
            r18 = r13
            java.lang.String r13 = "content.findViewById(com….finder_desc_bottom_mask)"
            gy3.C87412m.m108593f(r7, r13)
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            r13 = 2131304550(0x7f092066, float:1.8227246E38)
            android.view.View r13 = r11.findViewById(r13)
            java.lang.String r1 = "content.findViewById(R.i…nder_olympic_invite_view)"
            gy3.C87412m.m108593f(r13, r1)
            r1 = 2131302734(0x7f09194e, float:1.8223562E38)
            android.view.View r1 = r11.findViewById(r1)
            r36 = r8
            r8 = 2131302759(0x7f091967, float:1.8223613E38)
            android.view.View r8 = r11.findViewById(r8)
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            up1.f r16 = up1.C37521f.f99374d
            r16.getClass()
            pe1.c<java.lang.Integer> r16 = up1.C37521f.f99478o8
            java.lang.Object r16 = r16.mo60266n()
            java.lang.Number r16 = (java.lang.Number) r16
            r17 = r7
            int r7 = r16.intValue()
            r16 = r8
            r8 = 1
            if (r7 != r8) goto L_0x0141
            r7 = 8
            goto L_0x0142
        L_0x0141:
            r7 = 0
        L_0x0142:
            k20.a r8 = new k20.a
            r8.<init>()
            java.lang.ThreadLocal<k20.a> r19 = k20.C60958c.f173611a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8.mo10233c(r7)
            java.lang.Object[] r29 = r8.mo10232b()
            java.lang.String r30 = "com/tencent/mm/plugin/finder/view/FinderChatTimelineShareDialog"
            java.lang.String r31 = "initFinderLiveObjectDialog"
            java.lang.String r32 = "(Lcom/tencent/mm/plugin/findersdk/api/AppMSgContentFinderLiveObject;)Landroid/view/View;"
            java.lang.String r33 = "android/view/View_EXEC_"
            java.lang.String r34 = "setVisibility"
            java.lang.String r35 = "(I)V"
            r28 = r1
            j20.C117292a.m165358d(r28, r29, r30, r31, r32, r33, r34, r35)
            r7 = 0
            java.lang.Object r8 = r8.mo10231a(r7)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r7 = r8.intValue()
            r1.setVisibility(r7)
            java.lang.String r29 = "com/tencent/mm/plugin/finder/view/FinderChatTimelineShareDialog"
            java.lang.String r30 = "initFinderLiveObjectDialog"
            java.lang.String r31 = "(Lcom/tencent/mm/plugin/findersdk/api/AppMSgContentFinderLiveObject;)Landroid/view/View;"
            java.lang.String r32 = "android/view/View_EXEC_"
            java.lang.String r33 = "setVisibility"
            java.lang.String r34 = "(I)V"
            j20.C117292a.m165359e(r28, r29, r30, r31, r32, r33, r34)
            te3.p81 r1 = r6.f171698b
            int r1 = r1.f184772Q
            r7 = 1
            if (r1 != r7) goto L_0x01b5
            di3.d r1 = di3.C86312j.m106911c(r9)
            gy3.C87412m.m108593f(r1, r10)
            r21 = r1
            ht1.t1 r21 = (ht1.C60200t1) r21
            te3.p81 r1 = r6.f171698b
            java.lang.String r1 = r1.f184783i
            java.lang.String r22 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r1, (java.lang.String) r12)
            r24 = 0
            r25 = 4
            r26 = 0
            r23 = r3
            ht1.C60200t1.C60201a.m70367e(r21, r22, r23, r24, r25, r26)
            te3.p81 r1 = r6.f171698b
            java.lang.String r1 = r1.f184773R
            r5.setText(r1)
            r1 = 0
            r5.setVisibility(r1)
            goto L_0x01d8
        L_0x01b5:
            di3.d r1 = di3.C86312j.m106911c(r9)
            gy3.C87412m.m108593f(r1, r10)
            r21 = r1
            ht1.t1 r21 = (ht1.C60200t1) r21
            te3.p81 r1 = r6.f171698b
            java.lang.String r1 = r1.f184783i
            java.lang.String r22 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r1, (java.lang.String) r12)
            r24 = 0
            r25 = 4
            r26 = 0
            r23 = r3
            ht1.C60200t1.C60201a.m70370h(r21, r22, r23, r24, r25, r26)
            r1 = 8
            r5.setVisibility(r1)
        L_0x01d8:
            android.content.res.Resources r1 = r39.getResources()
            r5 = 2131165304(0x7f070078, float:1.7944821E38)
            float r1 = r1.getDimension(r5)
            int r1 = (int) r1
            r5 = 1068149419(0x3faaaaab, float:1.3333334)
            android.widget.FrameLayout$LayoutParams r7 = new android.widget.FrameLayout$LayoutParams
            float r8 = (float) r1
            float r8 = r8 * r5
            int r5 = (int) r8
            r7.<init>(r1, r5)
            r3.setLayoutParams(r7)
            android.widget.FrameLayout$LayoutParams r7 = new android.widget.FrameLayout$LayoutParams
            r7.<init>(r1, r5)
            r13.setLayoutParams(r7)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r7 = -2
            r5.<init>(r7, r7)
            r11.setLayoutParams(r5)
            di3.d r5 = di3.C86312j.m106911c(r4)
            ir.n r5 = (p565ir.C60606n) r5
            r7 = 0
            r5.mo85037Tb(r0, r15, r6, r7)
            di3.d r0 = di3.C86312j.m106911c(r4)
            java.lang.String r5 = "getService(IFinderLiveFeatureService::class.java)"
            gy3.C87412m.m108593f(r0, r5)
            ir.n r0 = (p565ir.C60606n) r0
            te3.p81 r5 = r6.f171698b
            java.lang.String r5 = r5.f184777V
            r7 = 1065353216(0x3f800000, float:1.0)
            r8 = 0
            r0.mo84986Aw(r2, r5, r7, r8)
            di3.d r0 = di3.C86312j.m106911c(r4)
            ir.n r0 = (p565ir.C60606n) r0
            r2 = 2131303693(0x7f091d0d, float:1.8225508E38)
            android.view.View r2 = r14.findViewById(r2)
            te3.p81 r5 = r6.f171698b
            int r5 = r5.f184759C
            r7 = 0
            r0.Ej0(r2, r7, r5)
            android.content.Context r0 = r16.getContext()
            android.content.Context r2 = r16.getContext()
            r5 = 2131099865(0x7f0600d9, float:1.7812095E38)
            int r2 = kg3.C76577a.m92153d(r2, r5)
            r5 = 2131755978(0x7f1003ca, float:1.914285E38)
            android.graphics.drawable.Drawable r0 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r0, r5, r2)
            r8 = r16
            r8.setImageDrawable(r0)
            di3.d r0 = di3.C86312j.m106911c(r9)
            ht1.t1 r0 = (ht1.C60200t1) r0
            ht1.z4 r0 = r0.mo76861l7()
            r7 = r17
            r2 = 2131233042(0x7f080912, float:1.808221E38)
            r5 = 2131233043(0x7f080913, float:1.8082212E38)
            r0.mo83777X5(r7, r5, r2)
            te3.p81 r0 = r6.f171698b
            if (r0 == 0) goto L_0x026f
            java.lang.String r8 = r0.f184765I
            goto L_0x0270
        L_0x026f:
            r8 = 0
        L_0x0270:
            if (r8 == 0) goto L_0x027b
            int r0 = r8.length()
            if (r0 != 0) goto L_0x0279
            goto L_0x027b
        L_0x0279:
            r0 = 0
            goto L_0x027c
        L_0x027b:
            r0 = 1
        L_0x027c:
            if (r0 != 0) goto L_0x0405
            te3.p81 r0 = r6.f171698b
            if (r0 == 0) goto L_0x0285
            java.lang.String r8 = r0.f184768L
            goto L_0x0286
        L_0x0285:
            r8 = 0
        L_0x0286:
            if (r8 == 0) goto L_0x0291
            int r0 = r8.length()
            if (r0 != 0) goto L_0x028f
            goto L_0x0291
        L_0x028f:
            r0 = 0
            goto L_0x0292
        L_0x0291:
            r0 = 1
        L_0x0292:
            if (r0 != 0) goto L_0x0405
            te3.p81 r0 = r6.f171698b
            if (r0 == 0) goto L_0x029b
            java.lang.String r8 = r0.f184768L
            goto L_0x029c
        L_0x029b:
            r8 = 0
        L_0x029c:
            java.lang.String r0 = "1"
            boolean r0 = gy3.C87412m.m108589b(r8, r0)
            if (r0 == 0) goto L_0x0405
            r0 = 2131304546(0x7f092062, float:1.8227238E38)
            android.view.View r0 = r13.findViewById(r0)
            java.lang.String r2 = "finderOlympicView.findVi…finder_olympic_invite_bg)"
            gy3.C87412m.m108593f(r0, r2)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r2 = 2131304547(0x7f092063, float:1.822724E38)
            android.view.View r2 = r13.findViewById(r2)
            java.lang.String r5 = "finderOlympicView.findVi…nder_olympic_invite_icon)"
            gy3.C87412m.m108593f(r2, r5)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            di3.d r5 = di3.C86312j.m106911c(r4)
            ir.n r5 = (p565ir.C60606n) r5
            ks3.t r7 = ks3.C61165t.SHARE_BG
            r8 = 2131232945(0x7f0808b1, float:1.8082014E38)
            r5.x30(r0, r7, r8)
            di3.d r0 = di3.C86312j.m106911c(r4)
            ir.n r0 = (p565ir.C60606n) r0
            ks3.t r4 = ks3.C61165t.SHARE_ICON
            r5 = 2131232946(0x7f0808b2, float:1.8082016E38)
            r0.x30(r2, r4, r5)
            r0 = 2131304549(0x7f092065, float:1.8227244E38)
            android.view.View r0 = r13.findViewById(r0)
            java.lang.String r2 = "finderOlympicView.findVi…nder_olympic_invite_text)"
            gy3.C87412m.m108593f(r0, r2)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2 = 1096810496(0x41600000, float:14.0)
            r4 = 1
            r0.setTextSize(r4, r2)
            r5 = 2131304548(0x7f092064, float:1.8227242E38)
            android.view.View r5 = r13.findViewById(r5)
            java.lang.String r7 = "finderOlympicView.findVi…nder_olympic_invite_name)"
            gy3.C87412m.m108593f(r5, r7)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r5.setTextSize(r4, r2)
            r2 = 2131304551(0x7f092067, float:1.8227248E38)
            android.view.View r2 = r13.findViewById(r2)
            java.lang.String r7 = "finderOlympicView.findVi…inder_olympic_invite_you)"
            gy3.C87412m.m108593f(r2, r7)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r7 = 1095761920(0x41500000, float:13.0)
            r2.setTextSize(r4, r7)
            er1.C7919x.m8091a(r0)
            er1.C7919x.m8091a(r5)
            er1.C7919x.m8091a(r2)
            te3.p81 r2 = r6.f171698b
            java.lang.String r2 = r2.f184766J
            if (r2 == 0) goto L_0x032c
            int r2 = r2.length()
            if (r2 != 0) goto L_0x032a
            goto L_0x032c
        L_0x032a:
            r2 = 0
            goto L_0x032d
        L_0x032c:
            r2 = 1
        L_0x032d:
            if (r2 == 0) goto L_0x0338
            r2 = 8
            r5.setVisibility(r2)
            r7 = r39
            r2 = 0
            goto L_0x034f
        L_0x0338:
            di3.d r2 = di3.C86312j.m106911c(r36)
            ny.h r2 = (p629ny.C76979h) r2
            te3.p81 r4 = r6.f171698b
            java.lang.String r4 = r4.f184766J
            r7 = r39
            android.text.SpannableString r2 = r2.mo107057T1(r7, r4)
            r5.setText(r2)
            r2 = 0
            r5.setVisibility(r2)
        L_0x034f:
            android.content.res.Resources r4 = r39.getResources()
            r5 = 2131829356(0x7f11226c, float:1.9291679E38)
            r8 = 1
            java.lang.Object[] r9 = new java.lang.Object[r8]
            te3.p81 r8 = r6.f171698b
            java.lang.String r8 = r8.f184765I
            r9[r2] = r8
            java.lang.String r4 = r4.getString(r5, r9)
            java.lang.String r5 = "context.resources.getStr…t.shareObject.relayIndex)"
            gy3.C87412m.m108593f(r4, r5)
            r5 = 12
            int r5 = kg3.C76577a.m92151b(r7, r5)
            r8 = 2
            int r5 = r5 * 2
            int r33 = r1 - r5
            java.lang.String r1 = "\n"
            java.lang.String r1 = z04.C112551y.m153814n(r4, r1, r12, r2)
            android.text.StaticLayout r2 = new android.text.StaticLayout
            r30 = 0
            int r31 = r1.length()
            android.text.TextPaint r32 = r0.getPaint()
            android.text.Layout$Alignment r34 = android.text.Layout.Alignment.ALIGN_NORMAL
            r35 = 1065353216(0x3f800000, float:1.0)
            r36 = 0
            r37 = 1
            r28 = r2
            r29 = r1
            r28.<init>(r29, r30, r31, r32, r33, r34, r35, r36, r37)
            int r2 = r2.getLineCount()
            r5 = 1
            if (r2 > r5) goto L_0x039c
            r4 = r1
        L_0x039c:
            r0.setText(r4)
            android.content.res.Resources r1 = r39.getResources()
            r2 = 2131829354(0x7f11226a, float:1.9291675E38)
            java.lang.Object[] r4 = new java.lang.Object[r5]
            te3.p81 r5 = r6.f171698b
            if (r5 == 0) goto L_0x03af
            java.lang.String r5 = r5.f184765I
            goto L_0x03b0
        L_0x03af:
            r5 = 0
        L_0x03b0:
            r8 = 0
            r4[r8] = r5
            java.lang.String r1 = r1.getString(r2, r4)
            r0.setText(r1)
            k20.a r0 = new k20.a
            r0.<init>()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r0.mo10233c(r1)
            java.lang.Object[] r29 = r0.mo10232b()
            java.lang.String r30 = "com/tencent/mm/plugin/finder/view/FinderChatTimelineShareDialog"
            java.lang.String r31 = "initFinderLiveObjectDialog"
            java.lang.String r32 = "(Lcom/tencent/mm/plugin/findersdk/api/AppMSgContentFinderLiveObject;)Landroid/view/View;"
            java.lang.String r33 = "android/view/View_EXEC_"
            java.lang.String r34 = "setVisibility"
            java.lang.String r35 = "(I)V"
            r28 = r13
            j20.C117292a.m165358d(r28, r29, r30, r31, r32, r33, r34, r35)
            r1 = 0
            java.lang.Object r0 = r0.mo10231a(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r13.setVisibility(r0)
            java.lang.String r29 = "com/tencent/mm/plugin/finder/view/FinderChatTimelineShareDialog"
            java.lang.String r30 = "initFinderLiveObjectDialog"
            java.lang.String r31 = "(Lcom/tencent/mm/plugin/findersdk/api/AppMSgContentFinderLiveObject;)Landroid/view/View;"
            java.lang.String r32 = "android/view/View_EXEC_"
            java.lang.String r33 = "setVisibility"
            java.lang.String r34 = "(I)V"
            j20.C117292a.m165359e(r28, r29, r30, r31, r32, r33, r34)
            r0 = 8
            r3.setVisibility(r0)
            r1 = r18
            r1.setVisibility(r0)
            goto L_0x0452
        L_0x0405:
            r7 = r39
            r1 = r18
            r0 = 8
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r2.mo10233c(r4)
            java.lang.Object[] r29 = r2.mo10232b()
            java.lang.String r30 = "com/tencent/mm/plugin/finder/view/FinderChatTimelineShareDialog"
            java.lang.String r31 = "initFinderLiveObjectDialog"
            java.lang.String r32 = "(Lcom/tencent/mm/plugin/findersdk/api/AppMSgContentFinderLiveObject;)Landroid/view/View;"
            java.lang.String r33 = "android/view/View_EXEC_"
            java.lang.String r34 = "setVisibility"
            java.lang.String r35 = "(I)V"
            r28 = r13
            j20.C117292a.m165358d(r28, r29, r30, r31, r32, r33, r34, r35)
            r0 = 0
            java.lang.Object r2 = r2.mo10231a(r0)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r0 = r2.intValue()
            r13.setVisibility(r0)
            java.lang.String r29 = "com/tencent/mm/plugin/finder/view/FinderChatTimelineShareDialog"
            java.lang.String r30 = "initFinderLiveObjectDialog"
            java.lang.String r31 = "(Lcom/tencent/mm/plugin/findersdk/api/AppMSgContentFinderLiveObject;)Landroid/view/View;"
            java.lang.String r32 = "android/view/View_EXEC_"
            java.lang.String r33 = "setVisibility"
            java.lang.String r34 = "(I)V"
            j20.C117292a.m165359e(r28, r29, r30, r31, r32, r33, r34)
            r0 = 0
            r3.setVisibility(r0)
            r1.setVisibility(r0)
        L_0x0452:
            r0 = r27
            qo3.g$i r1 = r0.f190206b
            qo3.a r1 = r1.f225714b
            r1.f225627J = r14
            int r1 = r6.f195429a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            goto L_0x0468
        L_0x0465:
            r0 = r7
            r7 = r1
            r1 = r12
        L_0x0468:
            qo3.g$i r2 = r0.f190206b
            qo3.a r2 = r2.f225714b
            r3 = 0
            r2.f225618A = r3
            r17 = r12
            r15 = 8
            goto L_0x06f3
        L_0x0475:
            r0 = r7
            r36 = r8
            r7 = r1
            if (r4 == 0) goto L_0x06e4
            n60.f$a r1 = new n60.f$a
            r1.<init>()
            r2 = 1
            r1.f293176b = r2
            r1.f293175a = r2
            r1.f293186l = r2
            n60.f r1 = r1.mo139398a()
            r2 = 2131494716(0x7f0c073c, float:1.8612948E38)
            r3 = 0
            android.view.View r2 = android.view.View.inflate(r7, r2, r3)
            android.view.View r5 = r2.findViewById(r11)
            r6 = 2131302682(0x7f09191a, float:1.8223457E38)
            android.view.View r6 = r5.findViewById(r6)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            k60.a r8 = k60.C99101e.f290571b
            java.lang.String r11 = r4.mo85178f()
            java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r11)
            java.lang.String r13 = "nullAsNil(finderObject.getAvatar())"
            gy3.C87412m.m108593f(r11, r13)
            java.lang.String r13 = "finderAvatar"
            gy3.C87412m.m108593f(r6, r13)
            r8.mo85957c(r11, r6, r1)
            r1 = 2131302761(0x7f091969, float:1.8223617E38)
            android.view.View r1 = r5.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            di3.d r6 = di3.C86312j.m106911c(r36)
            ny.h r6 = (p629ny.C76979h) r6
            er1.w3 r8 = er1.C58784w3.f168295a
            java.lang.String r11 = r4.mo85179g()
            java.lang.String r11 = r8.mo83905V(r11)
            android.text.SpannableString r6 = r6.mo107057T1(r7, r11)
            r1.setText(r6)
            r6 = 2131304822(0x7f092176, float:1.8227797E38)
            android.view.View r6 = r5.findViewById(r6)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r11 = 2131304481(0x7f092021, float:1.8227106E38)
            android.view.View r11 = r5.findViewById(r11)
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            r13 = 2131302759(0x7f091967, float:1.8223613E38)
            android.view.View r13 = r5.findViewById(r13)
            android.widget.ImageView r13 = (android.widget.ImageView) r13
            r14 = 2131299300(0x7f090be4, float:1.8216598E38)
            android.view.View r14 = r5.findViewById(r14)
            com.tencent.mm.plugin.sns.ui.view.ImageIndicatorView r14 = (com.tencent.p014mm.plugin.sns.p106ui.view.ImageIndicatorView) r14
            r15 = 2131302755(0x7f091963, float:1.8223605E38)
            android.view.View r15 = r5.findViewById(r15)
            android.widget.TextView r15 = (android.widget.TextView) r15
            r3 = 2131302758(0x7f091966, float:1.8223611E38)
            android.view.View r3 = r5.findViewById(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r17 = r12
            r12 = 2131302734(0x7f09194e, float:1.8223562E38)
            android.view.View r12 = r5.findViewById(r12)
            r16 = r2
            r2 = 2131302757(0x7f091965, float:1.822361E38)
            android.view.View r2 = r5.findViewById(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r18 = r0
            te3.rk1 r0 = r4.f171710b
            r19 = r13
            int r13 = r0.f185188i
            r20 = r1
            r1 = 1
            if (r13 != r1) goto L_0x0555
            r1 = 8
            r6.setVisibility(r1)
            r0 = 2131304821(0x7f092175, float:1.8227795E38)
            android.view.View r0 = r5.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            di3.d r10 = di3.C86312j.m106911c(r36)
            ny.h r10 = (p629ny.C76979h) r10
            te3.rk1 r13 = r4.f171710b
            java.lang.String r13 = r13.f185187h
            android.text.SpannableString r10 = r10.mo107057T1(r7, r13)
            r0.setText(r10)
            r13 = 0
            r0.setVisibility(r13)
            r15.setVisibility(r1)
            goto L_0x0587
        L_0x0555:
            r13 = 0
            java.util.LinkedList<te3.pk1> r0 = r0.f185190n
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0582
            di3.d r0 = di3.C86312j.m106911c(r9)
            gy3.C87412m.m108593f(r0, r10)
            r21 = r0
            ht1.t1 r21 = (ht1.C60200t1) r21
            te3.rk1 r0 = r4.f171710b
            java.util.LinkedList<te3.pk1> r0 = r0.f185190n
            java.lang.Object r0 = r0.get(r13)
            te3.pk1 r0 = (te3.C64628pk1) r0
            java.lang.String r0 = r0.f184828f
            r24 = 0
            r25 = 4
            r26 = 0
            r22 = r0
            r23 = r6
            ht1.C60200t1.C60201a.m70370h(r21, r22, r23, r24, r25, r26)
        L_0x0582:
            r0 = 8
            r15.setVisibility(r0)
        L_0x0587:
            up1.f r0 = up1.C37521f.f99374d
            r0.getClass()
            pe1.c<java.lang.Integer> r0 = up1.C37521f.f99478o8
            java.lang.Object r0 = r0.mo60266n()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r1 = 1
            if (r0 != r1) goto L_0x05aa
            if (r14 == 0) goto L_0x05a7
            r0 = 2131099940(0x7f060124, float:1.7812247E38)
            r10 = 2131099697(0x7f060031, float:1.7811755E38)
            r14.f21262i = r10
            r14.f21261h = r0
        L_0x05a7:
            r0 = 8
            goto L_0x05ab
        L_0x05aa:
            r0 = 0
        L_0x05ab:
            k20.a r10 = new k20.a
            r10.<init>()
            java.lang.ThreadLocal<k20.a> r13 = k20.C60958c.f173611a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r10.mo10233c(r0)
            java.lang.Object[] r22 = r10.mo10232b()
            java.lang.String r23 = "com/tencent/mm/plugin/finder/view/FinderChatTimelineShareDialog"
            java.lang.String r24 = "initFinderObjectDialog"
            java.lang.String r25 = "(Lcom/tencent/mm/plugin/findersdk/api/AppMsgContentFinderObject;)Landroid/view/View;"
            java.lang.String r26 = "android/view/View_EXEC_"
            java.lang.String r27 = "setVisibility"
            java.lang.String r28 = "(I)V"
            r21 = r12
            j20.C117292a.m165358d(r21, r22, r23, r24, r25, r26, r27, r28)
            r0 = 0
            java.lang.Object r10 = r10.mo10231a(r0)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r0 = r10.intValue()
            r12.setVisibility(r0)
            java.lang.String r22 = "com/tencent/mm/plugin/finder/view/FinderChatTimelineShareDialog"
            java.lang.String r23 = "initFinderObjectDialog"
            java.lang.String r24 = "(Lcom/tencent/mm/plugin/findersdk/api/AppMsgContentFinderObject;)Landroid/view/View;"
            java.lang.String r25 = "android/view/View_EXEC_"
            java.lang.String r26 = "setVisibility"
            java.lang.String r27 = "(I)V"
            j20.C117292a.m165359e(r21, r22, r23, r24, r25, r26, r27)
            te3.rk1 r0 = r4.f171710b
            int r0 = r0.f185188i
            r10 = 4
            if (r0 == r10) goto L_0x0618
            r10 = 6
            if (r0 != r10) goto L_0x05f8
            goto L_0x0618
        L_0x05f8:
            r10 = 2
            if (r0 != r10) goto L_0x060d
            r0 = 8
            r11.setVisibility(r0)
            if (r14 == 0) goto L_0x0623
            r0 = 0
            r14.setVisibility(r0)
            te3.rk1 r0 = r4.f171710b
            int r0 = r0.f185189j
            r14.f21258e = r0
            goto L_0x0623
        L_0x060d:
            r0 = 8
            r11.setVisibility(r0)
            if (r14 == 0) goto L_0x0623
            r14.setVisibility(r0)
            goto L_0x0623
        L_0x0618:
            r0 = 8
            r10 = 0
            r11.setVisibility(r10)
            if (r14 == 0) goto L_0x0623
            r14.setVisibility(r0)
        L_0x0623:
            android.content.res.Resources r0 = r39.getResources()
            r10 = 2131165304(0x7f070078, float:1.7944821E38)
            float r0 = r0.getDimension(r10)
            int r0 = (int) r0
            float r10 = (float) r0
            r11 = 1082130432(0x40800000, float:4.0)
            float r11 = r11 * r10
            r12 = 3
            float r13 = (float) r12
            float r11 = r11 / r13
            int r11 = (int) r11
            te3.rk1 r12 = r4.f171710b
            java.util.LinkedList<te3.pk1> r12 = r12.f185190n
            java.lang.Object r12 = r12.getFirst()
            te3.pk1 r12 = (te3.C64628pk1) r12
            float r13 = r12.f184830h
            float r13 = r13 * r10
            float r12 = r12.f184829g
            float r13 = r13 / r12
            int r10 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r10 <= 0) goto L_0x0666
            android.widget.FrameLayout$LayoutParams r10 = new android.widget.FrameLayout$LayoutParams
            r10.<init>(r11, r0)
            r6.setLayoutParams(r10)
            if (r2 != 0) goto L_0x0658
            goto L_0x067e
        L_0x0658:
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            if (r0 == 0) goto L_0x0661
            r0.width = r11
            goto L_0x0662
        L_0x0661:
            r0 = 0
        L_0x0662:
            r2.setLayoutParams(r0)
            goto L_0x067e
        L_0x0666:
            android.widget.FrameLayout$LayoutParams r10 = new android.widget.FrameLayout$LayoutParams
            r10.<init>(r0, r11)
            r6.setLayoutParams(r10)
            if (r2 != 0) goto L_0x0671
            goto L_0x067e
        L_0x0671:
            android.view.ViewGroup$LayoutParams r6 = r2.getLayoutParams()
            if (r6 == 0) goto L_0x067a
            r6.width = r0
            goto L_0x067b
        L_0x067a:
            r6 = 0
        L_0x067b:
            r2.setLayoutParams(r6)
        L_0x067e:
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r6 = -2
            r0.<init>(r6, r6)
            r5.setLayoutParams(r0)
            java.lang.String r0 = "authImageView"
            gy3.C87412m.m108593f(r3, r0)
            te3.rk1 r0 = r4.f171710b
            android.content.res.Resources r5 = r39.getResources()
            r6 = 2131165324(0x7f07008c, float:1.7944862E38)
            float r5 = r5.getDimension(r6)
            int r5 = (int) r5
            r6 = r20
            r8.mo83870G1(r3, r6, r0, r5)
            if (r2 == 0) goto L_0x06b4
            di3.d r0 = di3.C86312j.m106911c(r9)
            ht1.t1 r0 = (ht1.C60200t1) r0
            ht1.z4 r0 = r0.mo76861l7()
            r3 = 2131233042(0x7f080912, float:1.808221E38)
            r5 = 2131233043(0x7f080913, float:1.8082212E38)
            r0.mo83777X5(r2, r5, r3)
        L_0x06b4:
            android.content.Context r0 = r19.getContext()
            android.content.Context r2 = r19.getContext()
            r3 = 2131099865(0x7f0600d9, float:1.7812095E38)
            int r2 = kg3.C76577a.m92153d(r2, r3)
            r3 = 2131755978(0x7f1003ca, float:1.914285E38)
            android.graphics.drawable.Drawable r0 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r0, r3, r2)
            r13 = r19
            r13.setImageDrawable(r0)
            r0 = r18
            qo3.g$i r2 = r0.f190206b
            qo3.a r2 = r2.f225714b
            r3 = r16
            r2.f225627J = r3
            int r2 = r4.f195429a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            goto L_0x06e9
        L_0x06e4:
            r17 = r12
            r1 = 1
            r2 = r17
        L_0x06e9:
            qo3.g$i r3 = r0.f190206b
            qo3.a r3 = r3.f225714b
            r4 = 0
            r3.f225618A = r4
            r12 = r2
        L_0x06f1:
            r1 = r12
            r15 = 1
        L_0x06f3:
            java.lang.Class<ox.b> r2 = p640ox.C77049b.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            ox.b r2 = (p640ox.C77049b) r2
            r3 = 14
            java.lang.Class<te3.co3> r4 = te3.C64291co3.class
            pe3.a r2 = r2.mo72351Ok(r7, r3, r4)
            te3.co3 r2 = (te3.C64291co3) r2
            if (r2 == 0) goto L_0x072f
            r2.f182544i = r15
            r3 = 3
            r2.f182539d = r3
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r5 = r2.f182550r
            long r3 = r3 - r5
            int r4 = (int) r3
            r2.f182547o = r4
            r3 = r17
            r2.f182545j = r3
            r2.f182546n = r1
            r1 = r40
            r2.f182549q = r1
            r1 = r41
            r3 = 18
            if (r1 != r3) goto L_0x072f
            er1.v2$a r1 = er1.C7888v2.f26513a
            r1.getClass()
            int r1 = er1.C7888v2.C7889a.f26516c
            r2.f182543h = r1
        L_0x072f:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.mo90281b(r1)
            r0.mo90281b(r1)
            r1 = r38
            r1.f162415c = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.view.C56660w0.<init>(android.content.Context, java.lang.String, int, ht1.f, ht1.b, int, gy3.h):void");
    }

    /* renamed from: a */
    public final void mo80010a(long j, C66189h hVar) {
        Button button;
        C87412m.m108594g(hVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        C66184f.C66185a aVar = this.f162415c;
        if (aVar != null) {
            aVar.f190208d = aVar.f190205a.getResources().getString(C0966R.string.a2s);
            aVar.mo90280a(new C56661b(hVar));
            aVar.f190207c.mo107534s(C0966R.string.f360521de0, new C56662c(aVar, this, j));
            C77398g gVar = aVar.f190207c;
            if (gVar != null && (button = gVar.f225693g) != null) {
                ((C76622f) C86312j.m106911c(C76622f.class)).mo106874nK(button, this.f162414b, true);
            }
        }
    }
}
