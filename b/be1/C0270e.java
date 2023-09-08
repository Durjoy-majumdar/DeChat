package be1;

import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.plugin.finder.view.card.FinderProfileCardView;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import od1.C11407i;
import te3.C51270sn1;

/* renamed from: be1.e */
public final class C0270e extends C11407i<C51270sn1> {

    /* renamed from: g */
    public TextView f826g;

    /* renamed from: h */
    public TextView f827h;

    /* renamed from: i */
    public FinderProfileCardView f828i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0270e(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* JADX WARNING: type inference failed for: r0v13, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo314f3() {
        /*
            r6 = this;
            super.mo314f3()
            android.widget.FrameLayout r0 = r6.f33565e
            r1 = 0
            if (r0 == 0) goto L_0x0012
            r2 = 2131315558(0x7f094b66, float:1.8249573E38)
            android.view.View r0 = r0.findViewById(r2)
            android.widget.TextView r0 = (android.widget.TextView) r0
            goto L_0x0013
        L_0x0012:
            r0 = r1
        L_0x0013:
            r6.f826g = r0
            android.widget.FrameLayout r0 = r6.f33565e
            if (r0 == 0) goto L_0x0023
            r2 = 2131315542(0x7f094b56, float:1.824954E38)
            android.view.View r0 = r0.findViewById(r2)
            android.widget.TextView r0 = (android.widget.TextView) r0
            goto L_0x0024
        L_0x0023:
            r0 = r1
        L_0x0024:
            r6.f827h = r0
            android.widget.FrameLayout r0 = r6.f33565e
            if (r0 == 0) goto L_0x0034
            r1 = 2131315553(0x7f094b61, float:1.8249563E38)
            android.view.View r0 = r0.findViewById(r1)
            r1 = r0
            com.tencent.mm.plugin.finder.view.card.FinderProfileCardView r1 = (com.tencent.p014mm.plugin.finder.view.card.FinderProfileCardView) r1
        L_0x0034:
            r6.f828i = r1
            android.content.Intent r0 = r6.getIntent()
            java.lang.String r1 = "key_topic_title"
            java.lang.String r0 = r0.getStringExtra(r1)
            if (r0 != 0) goto L_0x0044
            java.lang.String r0 = ""
        L_0x0044:
            android.widget.TextView r1 = r6.f826g
            if (r1 != 0) goto L_0x0049
            goto L_0x005d
        L_0x0049:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 35
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.setText(r0)
        L_0x005d:
            android.widget.TextView r0 = r6.f826g
            if (r0 == 0) goto L_0x006b
            android.text.TextPaint r0 = r0.getPaint()
            r1 = 1061997773(0x3f4ccccd, float:0.8)
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r0, r1)
        L_0x006b:
            android.widget.TextView r0 = r6.f827h
            if (r0 != 0) goto L_0x0070
            goto L_0x008a
        L_0x0070:
            android.app.Activity r1 = r6.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131830038(0x7f112516, float:1.9293062E38)
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            java.lang.String r5 = "0"
            r3[r4] = r5
            java.lang.String r1 = r1.getString(r2, r3)
            r0.setText(r1)
        L_0x008a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: be1.C0270e.mo314f3():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* renamed from: j3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo315j3() {
        /*
            r14 = this;
            od1.C11405h.C11406a.m11254b(r14)
            T r0 = r14.f33564d
            te3.sn1 r0 = (te3.C51270sn1) r0
            r1 = 0
            if (r0 == 0) goto L_0x000d
            int r0 = r0.f141619f
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            long r2 = (long) r0
            java.lang.String r0 = er1.C7878t0.m8035d(r2)
            android.widget.TextView r2 = r14.f827h
            r3 = 1
            if (r2 != 0) goto L_0x0019
            goto L_0x002f
        L_0x0019:
            android.app.Activity r4 = r14.getContext()
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2131830038(0x7f112516, float:1.9293062E38)
            java.lang.Object[] r6 = new java.lang.Object[r3]
            r6[r1] = r0
            java.lang.String r0 = r4.getString(r5, r6)
            r2.setText(r0)
        L_0x002f:
            android.widget.TextView r0 = r14.f826g
            r2 = 0
            if (r0 != 0) goto L_0x0035
            goto L_0x0053
        L_0x0035:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r5 = 35
            r4.append(r5)
            T r5 = r14.f33564d
            te3.sn1 r5 = (te3.C51270sn1) r5
            if (r5 == 0) goto L_0x0048
            java.lang.String r5 = r5.f141617d
            goto L_0x0049
        L_0x0048:
            r5 = r2
        L_0x0049:
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r0.setText(r4)
        L_0x0053:
            T r0 = r14.f33564d
            te3.sn1 r0 = (te3.C51270sn1) r0
            if (r0 == 0) goto L_0x0188
            te3.gp1 r0 = r0.f141616C
            if (r0 == 0) goto L_0x0188
            int r4 = r0.f134187d
            if (r4 != r3) goto L_0x0071
            java.util.LinkedList<te3.hp1> r4 = r0.f134188e
            java.lang.String r5 = "it.relation_singers"
            gy3.C87412m.m108593f(r4, r5)
            boolean r4 = r4.isEmpty()
            r4 = r4 ^ r3
            if (r4 == 0) goto L_0x0071
            r4 = 1
            goto L_0x0072
        L_0x0071:
            r4 = 0
        L_0x0072:
            if (r4 != 0) goto L_0x0076
            goto L_0x0188
        L_0x0076:
            com.tencent.mm.plugin.finder.view.card.FinderProfileCardView r4 = r14.f828i
            if (r4 == 0) goto L_0x0188
            r5 = 40
            java.lang.Class<l31.e> r6 = l31.C61212e.class
            di3.d r7 = di3.C86312j.m106911c(r6)
            l31.e r7 = (l31.C61212e) r7
            java.lang.String r8 = "singer_profile_entrance"
            r7.o30(r4, r8)
            di3.d r7 = di3.C86312j.m106911c(r6)
            l31.e r7 = (l31.C61212e) r7
            r8 = 25496(0x6398, float:3.5728E-41)
            r7.mo86175pO(r4, r5, r8)
            di3.d r5 = di3.C86312j.m106911c(r6)
            l31.e r5 = (l31.C61212e) r5
            r7 = 3
            rx3.l[] r7 = new rx3.C13604l[r7]
            T r8 = r14.f33564d
            te3.sn1 r8 = (te3.C51270sn1) r8
            if (r8 == 0) goto L_0x00a7
            long r8 = r8.f141618e
            goto L_0x00a9
        L_0x00a7:
            r8 = 0
        L_0x00a9:
            java.lang.String r8 = o40.C61926c.m72691p(r8)
            rx3.l r9 = new rx3.l
            java.lang.String r10 = "topic_id"
            r9.<init>(r10, r8)
            r7[r1] = r9
            T r8 = r14.f33564d
            te3.sn1 r8 = (te3.C51270sn1) r8
            if (r8 == 0) goto L_0x00c0
            java.lang.String r9 = r8.f141617d
            goto L_0x00c1
        L_0x00c0:
            r9 = r2
        L_0x00c1:
            rx3.l r10 = new rx3.l
            java.lang.String r11 = "topic_name"
            r10.<init>(r11, r9)
            r7[r3] = r10
            if (r8 == 0) goto L_0x00e4
            te3.gp1 r8 = r8.f141616C
            if (r8 == 0) goto L_0x00e4
            java.util.LinkedList<te3.hp1> r8 = r8.f134188e
            if (r8 == 0) goto L_0x00e4
            java.lang.Object r8 = r8.getFirst()
            te3.hp1 r8 = (te3.C49736hp1) r8
            if (r8 == 0) goto L_0x00e4
            com.tencent.mm.protocal.protobuf.FinderContact r8 = r8.f134805d
            if (r8 == 0) goto L_0x00e4
            java.lang.String r8 = r8.username
            goto L_0x00e5
        L_0x00e4:
            r8 = r2
        L_0x00e5:
            rx3.l r9 = new rx3.l
            java.lang.String r10 = "finder_username"
            r9.<init>(r10, r8)
            r8 = 2
            r7[r8] = r9
            java.util.Map r7 = sx3.C90364q0.m113147f(r7)
            r5.mo86149PM(r4, r7)
            di3.d r5 = di3.C86312j.m106911c(r6)
            l31.e r5 = (l31.C61212e) r5
            be1.c r6 = new be1.c
            r6.<init>(r14)
            r5.E60(r4, r6)
            r4.setVisibility(r1)
            java.util.LinkedList<te3.hp1> r0 = r0.f134188e
            java.lang.Object r0 = r0.getFirst()
            te3.hp1 r0 = (te3.C49736hp1) r0
            com.tencent.mm.protocal.protobuf.FinderContact r5 = r0.f134805d
            if (r5 == 0) goto L_0x0188
            java.lang.String r6 = r5.headUrl
            java.lang.String r7 = ""
            if (r6 != 0) goto L_0x011a
            r6 = r7
        L_0x011a:
            java.lang.Class<pl1.s0> r9 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r10 = ht1.C60200t1.class
            bl3.r r11 = bl3.C39818r.f106831a
            bl3.r$a r12 = r11.mo62446e(r10)
            bl3.c r12 = r12.mo62447c(r9)
            pl1.s0 r12 = (pl1.C11990s0) r12
            k60.d r12 = r12.mo11872i2()
            pl1.f r13 = new pl1.f
            r13.<init>(r6, r2, r8, r2)
            android.widget.ImageView r2 = r4.f18099d
            pl1.e0$a r6 = pl1.C11978e0.C11979a.AVATAR
            bl3.r$a r8 = r11.mo62446e(r10)
            bl3.c r8 = r8.mo62447c(r9)
            pl1.s0 r8 = (pl1.C11990s0) r8
            n60.f r6 = r8.mo11867O2(r6)
            r12.mo85957c(r13, r2, r6)
            java.lang.String r2 = r5.nickname
            if (r2 != 0) goto L_0x014d
            goto L_0x014e
        L_0x014d:
            r7 = r2
        L_0x014e:
            r4.setName(r7)
            com.tencent.mm.protocal.protobuf.FinderAuthInfo r2 = r5.authInfo
            r4.setAuth(r2)
            int r2 = r0.f134806e
            if (r2 <= 0) goto L_0x017b
            android.content.Context r2 = r4.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r6 = 2131826694(0x7f111806, float:1.928628E38)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            int r0 = r0.f134806e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3[r1] = r0
            java.lang.String r0 = r2.getString(r6, r3)
            java.lang.String r2 = "context.resources.getStr…                        )"
            gy3.C87412m.m108593f(r0, r2)
            r4.setRightText(r0)
        L_0x017b:
            android.widget.ImageView r0 = r4.f18105j
            r0.setVisibility(r1)
            be1.d r0 = new be1.d
            r0.<init>(r5, r4)
            r4.setOnClick(r0)
        L_0x0188:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: be1.C0270e.mo315j3():void");
    }
}
