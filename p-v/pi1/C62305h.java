package pi1;

import al1.C54130j;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.RoundCornerConstraintLayout;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.ArrayList;
import kg3.C76577a;
import nh1.C61743m;
import rx3.C13598b0;
import te3.C49765hx0;

/* renamed from: pi1.h */
public final class C62305h extends C62307j {

    /* renamed from: v */
    public final C61743m f177115v;

    /* renamed from: w */
    public Boolean f177116w;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C62305h(android.content.Context r20, qj1.C62660c r21, ni1.C61753b r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            java.lang.String r4 = "context"
            gy3.C87412m.m108594g(r1, r4)
            java.lang.String r4 = "basePlugin"
            gy3.C87412m.m108594g(r2, r4)
            java.lang.String r4 = "service"
            gy3.C87412m.m108594g(r3, r4)
            r4 = 3
            r0.<init>(r1, r2, r3, r4)
            android.view.LayoutInflater r2 = com.tencent.p014mm.p136ui.C85868k2.m106137b(r20)
            r3 = 2131495068(0x7f0c089c, float:1.8613662E38)
            r4 = 0
            android.view.View r2 = r2.inflate(r3, r0, r4)
            r3 = 2131303808(0x7f091d80, float:1.822574E38)
            android.view.View r4 = p192l4.C10462b.m10395a(r2, r3)
            if (r4 == 0) goto L_0x00f6
            nh1.c r7 = nh1.C61734c.m72427a(r4)
            r3 = 2131303830(0x7f091d96, float:1.8225785E38)
            android.view.View r4 = p192l4.C10462b.m10395a(r2, r3)
            if (r4 == 0) goto L_0x00f6
            nh1.f r8 = nh1.C61737f.m72430a(r4)
            r3 = 2131303935(0x7f091dff, float:1.8225998E38)
            android.view.View r4 = p192l4.C10462b.m10395a(r2, r3)
            if (r4 == 0) goto L_0x00f6
            nh1.o r9 = nh1.C61745o.m72431a(r4)
            r3 = r2
            com.tencent.mm.ui.widget.RoundCornerConstraintLayout r3 = (com.tencent.p014mm.p136ui.widget.RoundCornerConstraintLayout) r3
            r4 = 2131304291(0x7f091f63, float:1.822672E38)
            android.view.View r5 = p192l4.C10462b.m10395a(r2, r4)
            r11 = r5
            androidx.constraintlayout.widget.ConstraintLayout r11 = (androidx.constraintlayout.widget.ConstraintLayout) r11
            if (r11 == 0) goto L_0x00f3
            r4 = 2131304425(0x7f091fe9, float:1.8226992E38)
            android.view.View r5 = p192l4.C10462b.m10395a(r2, r4)
            if (r5 == 0) goto L_0x00ef
            nh1.t r12 = nh1.C61750t.m72433a(r5)
            r4 = 2131309208(0x7f093298, float:1.8236693E38)
            android.view.View r5 = p192l4.C10462b.m10395a(r2, r4)
            r13 = r5
            com.tencent.mm.plugin.finder.live.mic.view.PotholingImageView r13 = (com.tencent.p014mm.plugin.finder.live.mic.view.PotholingImageView) r13
            if (r13 == 0) goto L_0x00eb
            r4 = 2131309224(0x7f0932a8, float:1.8236726E38)
            android.view.View r5 = p192l4.C10462b.m10395a(r2, r4)
            r14 = r5
            android.widget.TextView r14 = (android.widget.TextView) r14
            if (r14 == 0) goto L_0x00e7
            r4 = 2131309226(0x7f0932aa, float:1.823673E38)
            android.view.View r15 = p192l4.C10462b.m10395a(r2, r4)
            if (r15 == 0) goto L_0x00e3
            r4 = 2131310270(0x7f0936be, float:1.8238847E38)
            android.view.View r5 = p192l4.C10462b.m10395a(r2, r4)
            r16 = r5
            androidx.constraintlayout.widget.ConstraintLayout r16 = (androidx.constraintlayout.widget.ConstraintLayout) r16
            if (r16 == 0) goto L_0x00df
            r4 = 2131313711(0x7f09442f, float:1.8245826E38)
            android.view.View r5 = p192l4.C10462b.m10395a(r2, r4)
            r17 = r5
            androidx.constraintlayout.widget.ConstraintLayout r17 = (androidx.constraintlayout.widget.ConstraintLayout) r17
            if (r17 == 0) goto L_0x00db
            r4 = 2131316873(0x7f095089, float:1.825224E38)
            android.view.View r5 = p192l4.C10462b.m10395a(r2, r4)
            r10 = r5
            org.libpag.PAGView r10 = (org.libpag.PAGView) r10
            if (r10 == 0) goto L_0x00d7
            nh1.m r2 = new nh1.m
            r5 = r2
            r6 = r3
            r4 = r10
            r10 = r3
            r18 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r0.f177115v = r2
            r0.addView(r3)
            r3.setOnClickListener(r0)
            android.content.res.AssetManager r1 = r20.getAssets()
            java.lang.String r2 = "finder_live_link_mic_wave.pag"
            org.libpag.PAGFile r1 = org.libpag.PAGFile.Load(r1, r2)
            r4.setComposition(r1)
            r1 = -1
            r4.setRepeatCount(r1)
            return
        L_0x00d7:
            r3 = 2131316873(0x7f095089, float:1.825224E38)
            goto L_0x00f6
        L_0x00db:
            r3 = 2131313711(0x7f09442f, float:1.8245826E38)
            goto L_0x00f6
        L_0x00df:
            r3 = 2131310270(0x7f0936be, float:1.8238847E38)
            goto L_0x00f6
        L_0x00e3:
            r3 = 2131309226(0x7f0932aa, float:1.823673E38)
            goto L_0x00f6
        L_0x00e7:
            r3 = 2131309224(0x7f0932a8, float:1.8236726E38)
            goto L_0x00f6
        L_0x00eb:
            r3 = 2131309208(0x7f093298, float:1.8236693E38)
            goto L_0x00f6
        L_0x00ef:
            r3 = 2131304425(0x7f091fe9, float:1.8226992E38)
            goto L_0x00f6
        L_0x00f3:
            r3 = 2131304291(0x7f091f63, float:1.822672E38)
        L_0x00f6:
            android.content.res.Resources r1 = r2.getResources()
            java.lang.String r1 = r1.getResourceName(r3)
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "Missing required view with ID: "
            java.lang.String r1 = r3.concat(r1)
            r2.<init>(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: pi1.C62305h.<init>(android.content.Context, qj1.c, ni1.b):void");
    }

    /* renamed from: a */
    public void mo86901a() {
        Log.m105924i(getTAG(), "onGiftAnimationStart");
        this.f177115v.f175490i.setVisibility(8);
    }

    /* renamed from: b */
    public void mo86902b() {
        Log.m105924i(getTAG(), "onGiftAnimationEnd");
        this.f177115v.f175490i.setVisibility(0);
    }

    public ViewGroup getGiftRootView() {
        RelativeLayout relativeLayout = this.f177115v.f175485d.f175511a;
        C87412m.m108593f(relativeLayout, "viewBinding.finderLiveMicNewMicGiftItemLayout.root");
        return relativeLayout;
    }

    public ViewGroup getLotteryBubbleRootView() {
        return this.f177115v.f175483b.f175448a;
    }

    public ViewGroup getLuckyMoneyRootView() {
        RelativeLayout relativeLayout = this.f177115v.f175484c.f175451a;
        C87412m.m108593f(relativeLayout, "viewBinding.finderLiveLuckyMoneyBubbleUiRoot.root");
        return relativeLayout;
    }

    public RoundCornerConstraintLayout getRoundCornerConstraintLayout() {
        RoundCornerConstraintLayout roundCornerConstraintLayout = this.f177115v.f175482a;
        C87412m.m108593f(roundCornerConstraintLayout, "viewBinding.root");
        return roundCornerConstraintLayout;
    }

    public String getTagString() {
        return "FocusAnchorCoverWidget";
    }

    public ViewGroup getVoteBubbleRootView() {
        return this.f177115v.f175486e.f175537a;
    }

    public void onClick(View view) {
        Class cls = C54991o.class;
        FinderContact finderContact = null;
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        int id = this.f177115v.f175482a.getId();
        if (valueOf != null && valueOf.intValue() == id) {
            C54130j bindLinkMicUser = getBindLinkMicUser();
            if (C87412m.m108589b(bindLinkMicUser != null ? bindLinkMicUser.f151997a : null, ((C54991o) getBasePlugin().mo87696x0(cls)).mo76015n4())) {
                return;
            }
            if (this.f177123u) {
                mo87388v();
                return;
            }
            C54130j bindLinkMicUser2 = getBindLinkMicUser();
            C49765hx0 hx02 = bindLinkMicUser2 != null ? bindLinkMicUser2.f152014r : null;
            if (hx02 != null) {
                FinderObject finderObject = ((C54991o) getBasePlugin().mo87696x0(cls)).f154341n;
                if (finderObject != null) {
                    finderContact = finderObject.contact;
                }
                hx02.f134919d = finderContact;
            }
            mo88684s();
        }
    }

    /* renamed from: w */
    public void mo87376w(boolean z) {
        float b = (float) C76577a.m92151b(getContext(), 4);
        if (mo87387t()) {
            b = 0.0f;
        }
        Drawable background = this.f177115v.f175489h.getBackground();
        C13598b0 b0Var = null;
        GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        if (gradientDrawable != null) {
            gradientDrawable.setCornerRadius(b);
        }
        if (z) {
            ArrayList<RectF> potholingRectList = getPotholingRectList();
            if (potholingRectList != null) {
                this.f177115v.f175487f.mo77599q(b, potholingRectList);
                b0Var = C13598b0.f38549a;
            }
            if (b0Var == null) {
                this.f177115v.f175487f.mo77598p();
            }
            this.f177115v.f175482a.setRadius(0.0f);
            this.f177115v.f175491j.setVisibility(8);
            this.f177115v.f175488g.setText("");
        } else {
            this.f177115v.f175487f.mo77598p();
            this.f177115v.f175491j.setVisibility(0);
            this.f177115v.f175488g.setText(getContext().getResources().getString(C0966R.string.dg_));
            this.f177115v.f175482a.setRadius(b);
        }
        mo87377x(this.f177119q, this.f177120r);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x003f, code lost:
        r3 = (r3 = r3.objectDesc).liveDesc;
     */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87377x(boolean r6, boolean r7) {
        /*
            r5 = this;
            java.lang.Class<cl1.o> r0 = cl1.C54991o.class
            java.lang.String r1 = r5.getTAG()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "checkAudioMode isAudioMode:"
            r2.append(r3)
            r2.append(r6)
            java.lang.String r3 = " business(LiveCommonSlice::class.java).audioModeHolderBm:"
            r2.append(r3)
            qj1.c r3 = r5.getBasePlugin()
            androidx.lifecycle.i0 r3 = r3.mo87696x0(r0)
            cl1.o r3 = (cl1.C54991o) r3
            android.graphics.Bitmap r3 = r3.f154254S2
            r2.append(r3)
            java.lang.String r3 = " liveDesc.cover:"
            r2.append(r3)
            qj1.c r3 = r5.getBasePlugin()
            androidx.lifecycle.i0 r3 = r3.mo87696x0(r0)
            cl1.o r3 = (cl1.C54991o) r3
            com.tencent.mm.protocal.protobuf.FinderObject r3 = r3.f154341n
            r4 = 0
            if (r3 == 0) goto L_0x0046
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r3 = r3.objectDesc
            if (r3 == 0) goto L_0x0046
            te3.px0 r3 = r3.liveDesc
            if (r3 == 0) goto L_0x0046
            java.lang.String r3 = r3.f184911d
            goto L_0x0047
        L_0x0046:
            r3 = r4
        L_0x0047:
            r2.append(r3)
            java.lang.String r3 = " media.url:"
            r2.append(r3)
            qj1.c r3 = r5.getBasePlugin()
            androidx.lifecycle.i0 r3 = r3.mo87696x0(r0)
            cl1.o r3 = (cl1.C54991o) r3
            com.tencent.mm.protocal.protobuf.FinderObject r3 = r3.f154341n
            if (r3 == 0) goto L_0x0070
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r3 = r3.objectDesc
            if (r3 == 0) goto L_0x0070
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r3 = r3.media
            if (r3 == 0) goto L_0x0070
            java.lang.Object r3 = sx3.C110818d0.m150916N(r3)
            com.tencent.mm.protocal.protobuf.FinderMedia r3 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) r3
            if (r3 == 0) goto L_0x0070
            java.lang.String r3 = r3.url
            goto L_0x0071
        L_0x0070:
            r3 = r4
        L_0x0071:
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            r1 = 4
            if (r7 == 0) goto L_0x0086
            nh1.m r6 = r5.f177115v
            com.tencent.mm.plugin.finder.live.mic.view.PotholingImageView r6 = r6.f175487f
            r6.setVisibility(r1)
            return
        L_0x0086:
            ok1.e r7 = ok1.C62042e.f176370a
            boolean r7 = r7.mo87030O0()
            if (r7 == 0) goto L_0x00db
            if (r6 == 0) goto L_0x00d2
            qj1.c r6 = r5.getBasePlugin()
            androidx.lifecycle.i0 r6 = r6.mo87696x0(r0)
            cl1.o r6 = (cl1.C54991o) r6
            qj1.c r7 = r5.getBasePlugin()
            androidx.lifecycle.i0 r7 = r7.mo87696x0(r0)
            cl1.o r7 = (cl1.C54991o) r7
            al1.e r7 = r7.f154249R2
            java.lang.String r7 = r7.f151970a
            java.lang.String r6 = r6.mo76010l3(r7)
            qj1.c r7 = r5.getBasePlugin()
            androidx.lifecycle.i0 r7 = r7.mo87696x0(r0)
            cl1.o r7 = (cl1.C54991o) r7
            al1.e r7 = r7.f154249R2
            java.lang.String r7 = r7.f151971b
            qj1.c r1 = r5.getBasePlugin()
            androidx.lifecycle.i0 r0 = r1.mo87696x0(r0)
            cl1.o r0 = (cl1.C54991o) r0
            al1.e r0 = r0.f154249R2
            java.lang.String r0 = r0.f151972c
            pi1.e r1 = new pi1.e
            r1.<init>(r5, r6, r7, r0)
            o40.C61926c.m72668M(r1)
            goto L_0x0146
        L_0x00d2:
            nh1.m r6 = r5.f177115v
            com.tencent.mm.plugin.finder.live.mic.view.PotholingImageView r6 = r6.f175487f
            r6.setVisibility(r1)
            goto L_0x0146
        L_0x00db:
            if (r6 == 0) goto L_0x013f
            qj1.c r6 = r5.getBasePlugin()
            androidx.lifecycle.i0 r6 = r6.mo87696x0(r0)
            cl1.o r6 = (cl1.C54991o) r6
            com.tencent.mm.protocal.protobuf.FinderObject r6 = r6.f154341n
            if (r6 == 0) goto L_0x00f5
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r6 = r6.objectDesc
            if (r6 == 0) goto L_0x00f5
            te3.px0 r6 = r6.liveDesc
            if (r6 == 0) goto L_0x00f5
            java.lang.String r4 = r6.f184911d
        L_0x00f5:
            if (r4 == 0) goto L_0x0100
            int r6 = r4.length()
            if (r6 != 0) goto L_0x00fe
            goto L_0x0100
        L_0x00fe:
            r6 = 0
            goto L_0x0101
        L_0x0100:
            r6 = 1
        L_0x0101:
            java.lang.String r7 = ""
            if (r6 == 0) goto L_0x0128
            qj1.c r6 = r5.getBasePlugin()
            androidx.lifecycle.i0 r6 = r6.mo87696x0(r0)
            cl1.o r6 = (cl1.C54991o) r6
            com.tencent.mm.protocal.protobuf.FinderObject r6 = r6.f154341n
            if (r6 == 0) goto L_0x0127
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r6 = r6.objectDesc
            if (r6 == 0) goto L_0x0127
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r6 = r6.media
            if (r6 == 0) goto L_0x0127
            java.lang.Object r6 = sx3.C110818d0.m150916N(r6)
            com.tencent.mm.protocal.protobuf.FinderMedia r6 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) r6
            if (r6 == 0) goto L_0x0127
            java.lang.String r4 = r6.url
            if (r4 != 0) goto L_0x0128
        L_0x0127:
            r4 = r7
        L_0x0128:
            qj1.c r6 = r5.getBasePlugin()
            androidx.lifecycle.i0 r6 = r6.mo87696x0(r0)
            cl1.o r6 = (cl1.C54991o) r6
            java.lang.String r6 = r6.mo76010l3(r4)
            pi1.e r0 = new pi1.e
            r0.<init>(r5, r6, r7, r7)
            o40.C61926c.m72668M(r0)
            goto L_0x0146
        L_0x013f:
            nh1.m r6 = r5.f177115v
            com.tencent.mm.plugin.finder.live.mic.view.PotholingImageView r6 = r6.f175487f
            r6.setVisibility(r1)
        L_0x0146:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pi1.C62305h.mo87377x(boolean, boolean):void");
    }
}
