package pi1;

import al1.C54130j;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import cl1.C54991o;
import com.tencent.p014mm.p136ui.widget.RoundCornerConstraintLayout;
import com.tencent.p014mm.plugin.finder.live.mic.view.PotholingImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.ArrayList;
import kg3.C76577a;
import nh1.C61744n;
import rx3.C13598b0;
import wk1.C15484y;

/* renamed from: pi1.i */
public final class C62306i extends C62307j {

    /* renamed from: v */
    public final C61744n f177117v;

    /* renamed from: w */
    public boolean f177118w;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C62306i(android.content.Context r30, qj1.C62660c r31, ni1.C61753b r32) {
        /*
            r29 = this;
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r32
            java.lang.String r4 = "context"
            gy3.C87412m.m108594g(r1, r4)
            java.lang.String r4 = "basePlugin"
            gy3.C87412m.m108594g(r2, r4)
            java.lang.String r4 = "service"
            gy3.C87412m.m108594g(r3, r4)
            r4 = 1
            r0.<init>(r1, r2, r3, r4)
            android.view.LayoutInflater r2 = com.tencent.p014mm.p136ui.C85868k2.m106137b(r30)
            r3 = 2131495069(0x7f0c089d, float:1.8613664E38)
            r4 = 0
            android.view.View r2 = r2.inflate(r3, r0, r4)
            r3 = 2131303830(0x7f091d96, float:1.8225785E38)
            android.view.View r4 = p192l4.C10462b.m10395a(r2, r3)
            if (r4 == 0) goto L_0x019b
            nh1.f r7 = nh1.C61737f.m72430a(r4)
            r3 = 2131303916(0x7f091dec, float:1.822596E38)
            android.view.View r4 = p192l4.C10462b.m10395a(r2, r3)
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            if (r4 == 0) goto L_0x019b
            r3 = 2131303925(0x7f091df5, float:1.8225978E38)
            android.view.View r5 = p192l4.C10462b.m10395a(r2, r3)
            r9 = r5
            android.widget.TextView r9 = (android.widget.TextView) r9
            if (r9 == 0) goto L_0x019b
            r3 = 2131303932(0x7f091dfc, float:1.8225992E38)
            android.view.View r5 = p192l4.C10462b.m10395a(r2, r3)
            r15 = r5
            android.widget.FrameLayout r15 = (android.widget.FrameLayout) r15
            if (r15 == 0) goto L_0x019b
            r3 = r2
            com.tencent.mm.ui.widget.RoundCornerConstraintLayout r3 = (com.tencent.p014mm.p136ui.widget.RoundCornerConstraintLayout) r3
            r5 = 2131303935(0x7f091dff, float:1.8225998E38)
            android.view.View r6 = p192l4.C10462b.m10395a(r2, r5)
            if (r6 == 0) goto L_0x0198
            nh1.o r12 = nh1.C61745o.m72431a(r6)
            r5 = 2131305045(0x7f092255, float:1.822825E38)
            android.view.View r6 = p192l4.C10462b.m10395a(r2, r5)
            r13 = r6
            androidx.constraintlayout.widget.ConstraintLayout r13 = (androidx.constraintlayout.widget.ConstraintLayout) r13
            if (r13 == 0) goto L_0x0194
            r5 = 2131305046(0x7f092256, float:1.8228252E38)
            android.view.View r6 = p192l4.C10462b.m10395a(r2, r5)
            r14 = r6
            android.widget.ImageView r14 = (android.widget.ImageView) r14
            if (r14 == 0) goto L_0x0190
            r5 = 2131305047(0x7f092257, float:1.8228254E38)
            android.view.View r6 = p192l4.C10462b.m10395a(r2, r5)
            r11 = r6
            android.widget.TextView r11 = (android.widget.TextView) r11
            if (r11 == 0) goto L_0x018c
            r5 = 2131305048(0x7f092258, float:1.8228256E38)
            android.view.View r6 = p192l4.C10462b.m10395a(r2, r5)
            r10 = r6
            android.widget.TextView r10 = (android.widget.TextView) r10
            if (r10 == 0) goto L_0x0188
            r5 = 2131305050(0x7f09225a, float:1.822826E38)
            android.view.View r6 = p192l4.C10462b.m10395a(r2, r5)
            r8 = r6
            org.libpag.PAGView r8 = (org.libpag.PAGView) r8
            if (r8 == 0) goto L_0x0184
            r5 = 2131305880(0x7f092598, float:1.8229943E38)
            android.view.View r6 = p192l4.C10462b.m10395a(r2, r5)
            r18 = r6
            androidx.constraintlayout.widget.Guideline r18 = (androidx.constraintlayout.widget.Guideline) r18
            if (r18 == 0) goto L_0x0180
            r5 = 2131309208(0x7f093298, float:1.8236693E38)
            android.view.View r6 = p192l4.C10462b.m10395a(r2, r5)
            r19 = r6
            com.tencent.mm.plugin.finder.live.mic.view.PotholingImageView r19 = (com.tencent.p014mm.plugin.finder.live.mic.view.PotholingImageView) r19
            if (r19 == 0) goto L_0x017c
            r5 = 2131309218(0x7f0932a2, float:1.8236714E38)
            android.view.View r6 = p192l4.C10462b.m10395a(r2, r5)
            r20 = r6
            android.widget.ImageView r20 = (android.widget.ImageView) r20
            if (r20 == 0) goto L_0x0178
            r5 = 2131309224(0x7f0932a8, float:1.8236726E38)
            android.view.View r6 = p192l4.C10462b.m10395a(r2, r5)
            r21 = r6
            android.widget.TextView r21 = (android.widget.TextView) r21
            if (r21 == 0) goto L_0x0174
            r5 = 2131309226(0x7f0932aa, float:1.823673E38)
            android.view.View r22 = p192l4.C10462b.m10395a(r2, r5)
            if (r22 == 0) goto L_0x0170
            r5 = 2131312504(0x7f093f78, float:1.8243378E38)
            android.view.View r6 = p192l4.C10462b.m10395a(r2, r5)
            r23 = r6
            android.widget.FrameLayout r23 = (android.widget.FrameLayout) r23
            if (r23 == 0) goto L_0x016c
            r5 = 2131313711(0x7f09442f, float:1.8245826E38)
            android.view.View r6 = p192l4.C10462b.m10395a(r2, r5)
            r24 = r6
            androidx.constraintlayout.widget.ConstraintLayout r24 = (androidx.constraintlayout.widget.ConstraintLayout) r24
            if (r24 == 0) goto L_0x0168
            r5 = 2131316873(0x7f095089, float:1.825224E38)
            android.view.View r6 = p192l4.C10462b.m10395a(r2, r5)
            org.libpag.PAGView r6 = (org.libpag.PAGView) r6
            if (r6 == 0) goto L_0x0164
            nh1.n r2 = new nh1.n
            r5 = r2
            r31 = r6
            r6 = r3
            r32 = r8
            r8 = r4
            r26 = r10
            r10 = r15
            r27 = r11
            r11 = r3
            r28 = r14
            r1 = r15
            r15 = r27
            r16 = r26
            r17 = r32
            r25 = r31
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r0.f177117v = r2
            r0.addView(r3)
            r3.setOnClickListener(r0)
            r6 = r28
            r6.setOnClickListener(r0)
            r6 = r27
            r6.setOnClickListener(r0)
            r6 = r26
            r6.setOnClickListener(r0)
            android.content.res.AssetManager r2 = r30.getAssets()
            java.lang.String r3 = "finder_live_link_mic_wave.pag"
            org.libpag.PAGFile r2 = org.libpag.PAGFile.Load(r2, r3)
            r6 = r32
            r6.setComposition(r2)
            r2 = -1
            r6.setRepeatCount(r2)
            android.content.res.AssetManager r5 = r30.getAssets()
            org.libpag.PAGFile r3 = org.libpag.PAGFile.Load(r5, r3)
            r6 = r31
            r6.setComposition(r3)
            r6.setRepeatCount(r2)
            r4.setOnClickListener(r0)
            r1.setOnClickListener(r0)
            return
        L_0x0164:
            r3 = 2131316873(0x7f095089, float:1.825224E38)
            goto L_0x019b
        L_0x0168:
            r3 = 2131313711(0x7f09442f, float:1.8245826E38)
            goto L_0x019b
        L_0x016c:
            r3 = 2131312504(0x7f093f78, float:1.8243378E38)
            goto L_0x019b
        L_0x0170:
            r3 = 2131309226(0x7f0932aa, float:1.823673E38)
            goto L_0x019b
        L_0x0174:
            r3 = 2131309224(0x7f0932a8, float:1.8236726E38)
            goto L_0x019b
        L_0x0178:
            r3 = 2131309218(0x7f0932a2, float:1.8236714E38)
            goto L_0x019b
        L_0x017c:
            r3 = 2131309208(0x7f093298, float:1.8236693E38)
            goto L_0x019b
        L_0x0180:
            r3 = 2131305880(0x7f092598, float:1.8229943E38)
            goto L_0x019b
        L_0x0184:
            r3 = 2131305050(0x7f09225a, float:1.822826E38)
            goto L_0x019b
        L_0x0188:
            r3 = 2131305048(0x7f092258, float:1.8228256E38)
            goto L_0x019b
        L_0x018c:
            r3 = 2131305047(0x7f092257, float:1.8228254E38)
            goto L_0x019b
        L_0x0190:
            r3 = 2131305046(0x7f092256, float:1.8228252E38)
            goto L_0x019b
        L_0x0194:
            r3 = 2131305045(0x7f092255, float:1.822825E38)
            goto L_0x019b
        L_0x0198:
            r3 = 2131303935(0x7f091dff, float:1.8225998E38)
        L_0x019b:
            android.content.res.Resources r1 = r2.getResources()
            java.lang.String r1 = r1.getResourceName(r3)
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "Missing required view with ID: "
            java.lang.String r1 = r3.concat(r1)
            r2.<init>(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: pi1.C62306i.<init>(android.content.Context, qj1.c, ni1.b):void");
    }

    /* renamed from: a */
    public void mo86901a() {
        Log.m105924i(getTAG(), "onGiftAnimationStart");
    }

    /* renamed from: b */
    public void mo86902b() {
        Log.m105924i(getTAG(), "onGiftAnimationEnd");
    }

    public ViewGroup getGiftRootView() {
        RelativeLayout relativeLayout = this.f177117v.f175498f.f175511a;
        C87412m.m108593f(relativeLayout, "viewBinding.finderLiveMicNewMicGiftItemLayout.root");
        return relativeLayout;
    }

    public ViewGroup getLuckyMoneyRootView() {
        RelativeLayout relativeLayout = this.f177117v.f175494b.f175451a;
        C87412m.m108593f(relativeLayout, "viewBinding.finderLiveLuckyMoneyBubbleUiRoot.root");
        return relativeLayout;
    }

    public RoundCornerConstraintLayout getRoundCornerConstraintLayout() {
        RoundCornerConstraintLayout roundCornerConstraintLayout = this.f177117v.f175493a;
        C87412m.m108593f(roundCornerConstraintLayout, "viewBinding.root");
        return roundCornerConstraintLayout;
    }

    public String getTagString() {
        return "FocusAudioCoverWidget";
    }

    /* renamed from: l */
    public void mo86941l(boolean z, int i, boolean z2) {
        super.mo86941l(z, i, z2);
        if (mo88678i() || (mo88679k() && ((C54991o) getBasePlugin().mo87696x0(C54991o.class)).f154274W2)) {
            if (this.f177117v.f175499g.getVisibility() == 0) {
                this.f177117v.f175495c.setVisibility(0);
            } else {
                this.f177117v.f175497e.setVisibility(0);
            }
            mo87379x();
            return;
        }
        this.f177117v.f175497e.setVisibility(8);
        this.f177117v.f175495c.setVisibility(8);
        if (this.f177118w != z) {
            String tag = getTAG();
            Log.m105924i(tag, "notifyMicUserTalkingState notTalking:" + z + " lastNotTalking: " + this.f177118w);
            this.f177118w = z;
            if (z) {
                mo87379x();
            } else if (this.f177117v.f175499g.getVisibility() == 0) {
                this.f177117v.f175503k.setVisibility(0);
                this.f177117v.f175503k.play();
            } else {
                this.f177117v.f175510r.setVisibility(0);
                this.f177117v.f175510r.play();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b7, code lost:
        if (r9.intValue() != r0) goto L_0x00ba;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00bc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r9) {
        /*
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r9)
            java.lang.Object[] r6 = r0.toArray()
            r0.clear()
            java.lang.String r1 = "com/tencent/mm/plugin/finder/live/mic/widget/focus/FinderLiveMicFocusAudioCoverWidget"
            java.lang.String r2 = "android/view/View$OnClickListener"
            java.lang.String r3 = "onClick"
            java.lang.String r4 = "(Landroid/view/View;)V"
            r5 = r8
            j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
            if (r9 == 0) goto L_0x0026
            int r9 = r9.getId()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            goto L_0x0027
        L_0x0026:
            r9 = 0
        L_0x0027:
            nh1.n r0 = r8.f177117v
            com.tencent.mm.ui.widget.RoundCornerConstraintLayout r0 = r0.f175493a
            int r0 = r0.getId()
            java.lang.String r1 = "(Landroid/view/View;)V"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "android/view/View$OnClickListener"
            java.lang.String r4 = "com/tencent/mm/plugin/finder/live/mic/widget/focus/FinderLiveMicFocusAudioCoverWidget"
            if (r9 != 0) goto L_0x003a
            goto L_0x0050
        L_0x003a:
            int r5 = r9.intValue()
            if (r5 != r0) goto L_0x0050
            boolean r9 = r8.f177123u
            if (r9 == 0) goto L_0x004b
            r8.mo87388v()
            j20.C117292a.m165361g(r8, r4, r3, r2, r1)
            return
        L_0x004b:
            r8.mo88680m()
            goto L_0x00bf
        L_0x0050:
            nh1.n r0 = r8.f177117v
            android.widget.ImageView r0 = r0.f175500h
            int r0 = r0.getId()
            r5 = 0
            r6 = 1
            if (r9 != 0) goto L_0x005d
            goto L_0x0065
        L_0x005d:
            int r7 = r9.intValue()
            if (r7 != r0) goto L_0x0065
        L_0x0063:
            r0 = 1
            goto L_0x0078
        L_0x0065:
            nh1.n r0 = r8.f177117v
            android.widget.TextView r0 = r0.f175501i
            int r0 = r0.getId()
            if (r9 != 0) goto L_0x0070
            goto L_0x0077
        L_0x0070:
            int r7 = r9.intValue()
            if (r7 != r0) goto L_0x0077
            goto L_0x0063
        L_0x0077:
            r0 = 0
        L_0x0078:
            if (r0 == 0) goto L_0x007c
        L_0x007a:
            r0 = 1
            goto L_0x008f
        L_0x007c:
            nh1.n r0 = r8.f177117v
            android.widget.TextView r0 = r0.f175502j
            int r0 = r0.getId()
            if (r9 != 0) goto L_0x0087
            goto L_0x008e
        L_0x0087:
            int r7 = r9.intValue()
            if (r7 != r0) goto L_0x008e
            goto L_0x007a
        L_0x008e:
            r0 = 0
        L_0x008f:
            if (r0 == 0) goto L_0x0095
            r8.mo88680m()
            goto L_0x00bf
        L_0x0095:
            nh1.n r0 = r8.f177117v
            android.widget.FrameLayout r0 = r0.f175497e
            int r0 = r0.getId()
            if (r9 != 0) goto L_0x00a0
            goto L_0x00a8
        L_0x00a0:
            int r7 = r9.intValue()
            if (r7 != r0) goto L_0x00a8
        L_0x00a6:
            r5 = 1
            goto L_0x00ba
        L_0x00a8:
            nh1.n r0 = r8.f177117v
            android.widget.FrameLayout r0 = r0.f175495c
            int r0 = r0.getId()
            if (r9 != 0) goto L_0x00b3
            goto L_0x00ba
        L_0x00b3:
            int r9 = r9.intValue()
            if (r9 != r0) goto L_0x00ba
            goto L_0x00a6
        L_0x00ba:
            if (r5 == 0) goto L_0x00bf
            r8.mo88680m()
        L_0x00bf:
            j20.C117292a.m165361g(r8, r4, r3, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pi1.C62306i.onClick(android.view.View):void");
    }

    /* renamed from: w */
    public void mo87376w(boolean z) {
        float b = (float) C76577a.m92151b(getContext(), 4);
        if (mo87387t()) {
            b = 0.0f;
        }
        Drawable background = this.f177117v.f175508p.getBackground();
        C13598b0 b0Var = null;
        GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        if (gradientDrawable != null) {
            gradientDrawable.setCornerRadius(b);
        }
        ViewGroup.LayoutParams layoutParams = this.f177117v.f175504l.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ((ConstraintLayout.LayoutParams) layoutParams).f44437b = z ? getRightOffestSize() : 0;
        if (z) {
            this.f177117v.f175499g.setVisibility(0);
            this.f177117v.f175509q.setVisibility(8);
            this.f177117v.f175493a.setRadius(0.0f);
        } else {
            this.f177117v.f175493a.setRadius(b);
            this.f177117v.f175499g.setVisibility(8);
            this.f177117v.f175509q.setVisibility(0);
        }
        C54130j bindLinkMicUser = getBindLinkMicUser();
        if (bindLinkMicUser != null) {
            PotholingImageView potholingImageView = this.f177117v.f175505m;
            C87412m.m108593f(potholingImageView, "viewBinding.micBg");
            mo86638d(potholingImageView);
            if (z) {
                ArrayList<RectF> potholingRectList = getPotholingRectList();
                if (potholingRectList != null) {
                    this.f177117v.f175505m.mo77599q(b, potholingRectList);
                    b0Var = C13598b0.f38549a;
                }
                if (b0Var == null) {
                    this.f177117v.f175505m.mo77598p();
                }
                ImageView imageView = this.f177117v.f175500h;
                C87412m.m108593f(imageView, "viewBinding.focusMicHead");
                mo86639e(imageView);
                TextView textView = this.f177117v.f175501i;
                C87412m.m108593f(textView, "viewBinding.focusMicNickName");
                mo86641g(textView);
                TextView textView2 = this.f177117v.f175502j;
                C87412m.m108593f(textView2, "viewBinding.focusMicUserLevel");
                mo86640f(textView2, C15484y.SIZE_LARGE);
            } else {
                this.f177117v.f175505m.mo77598p();
                ImageView imageView2 = this.f177117v.f175506n;
                C87412m.m108593f(imageView2, "viewBinding.micHead");
                mo86639e(imageView2);
                TextView textView3 = this.f177117v.f175507o;
                C87412m.m108593f(textView3, "viewBinding.micNickName");
                mo86641g(textView3);
                mo86941l(bindLinkMicUser.f152010n, bindLinkMicUser.f152018v, false);
            }
        }
        C87412m.m108593f(this.f177117v.f175496d, "viewBinding.finderLiveMicHeartText");
    }

    /* renamed from: x */
    public final void mo87379x() {
        this.f177117v.f175503k.stop();
        this.f177117v.f175503k.setVisibility(8);
        this.f177117v.f175510r.stop();
        this.f177117v.f175510r.setVisibility(8);
    }
}
