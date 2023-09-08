package pm1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.nearby.live.play.NearbyLivePreviewView;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: pm1.e */
public final class C62391e extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ View f177334d;

    /* renamed from: e */
    public final /* synthetic */ NearbyLivePreviewView f177335e;

    /* renamed from: f */
    public final /* synthetic */ C62381d f177336f;

    /* renamed from: g */
    public final /* synthetic */ int f177337g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62391e(View view, NearbyLivePreviewView nearbyLivePreviewView, C62381d dVar, int i) {
        super(0);
        this.f177334d = view;
        this.f177335e = nearbyLivePreviewView;
        this.f177336f = dVar;
        this.f177337g = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:74:0x03e9  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0423  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x042b  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x04f3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke() {
        /*
            r17 = this;
            r0 = r17
            android.view.View r1 = r0.f177334d
            com.tencent.mm.plugin.finder.nearby.live.play.NearbyLivePreviewView r2 = r0.f177335e
            boolean r2 = r2.f160231o
            r3 = 1
            r2 = r2 ^ r3
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r4 = 2131310055(0x7f0935e7, float:1.8238411E38)
            r1.setTag(r4, r2)
            android.view.View r1 = r0.f177334d
            long r4 = android.os.SystemClock.elapsedRealtime()
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            r4 = 2131310051(0x7f0935e3, float:1.8238403E38)
            r1.setTag(r4, r2)
            pm1.d r1 = r0.f177336f
            int r2 = r0.f177337g
            android.view.View r4 = r0.f177334d
            com.tencent.mm.plugin.finder.nearby.live.play.NearbyLivePreviewView r5 = r0.f177335e
            boolean r6 = r1.f177295k
            java.lang.String r7 = "checkIfShowAnimation pos:"
            if (r6 != 0) goto L_0x004f
            java.lang.String r1 = r1.mo87439r()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r2)
            java.lang.String r2 = " return for enableRedDotFeedAnimation"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            goto L_0x053c
        L_0x004f:
            te3.yi1 r6 = r1.f177308x
            if (r6 != 0) goto L_0x0070
            java.lang.String r1 = r1.mo87439r()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r2)
            java.lang.String r2 = " return for enterTabTipExtInfo"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            goto L_0x053c
        L_0x0070:
            long r8 = r6.f186549g
            int r10 = r6.f186558s
            gy3.C87412m.m108591d(r6)
            int r6 = r6.f186559t
            if (r6 != r3) goto L_0x009b
            java.lang.String r1 = r1.mo87439r()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r2)
            java.lang.String r2 = " return for enterLiveAction:"
            r3.append(r2)
            r3.append(r6)
            java.lang.String r2 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            goto L_0x053c
        L_0x009b:
            cm1.i2 r6 = r1.mo87437p(r2)
            r11 = 0
            if (r6 == 0) goto L_0x00a8
            long r13 = r6.getItemId()
            goto L_0x00a9
        L_0x00a8:
            r13 = r11
        L_0x00a9:
            int r6 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r6 != 0) goto L_0x050e
            int r6 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r6 == 0) goto L_0x050e
            int r6 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r6 != 0) goto L_0x00b7
            goto L_0x050e
        L_0x00b7:
            boolean r6 = r1.f177290f
            if (r6 != 0) goto L_0x011c
            java.lang.String r6 = " redDotTabId:"
            if (r10 == 0) goto L_0x00eb
            int r8 = r1.f177289e
            if (r8 == r10) goto L_0x00eb
            java.lang.String r3 = r1.mo87439r()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r7)
            r4.append(r2)
            java.lang.String r2 = " return for tabId:"
            r4.append(r2)
            int r1 = r1.f177289e
            r4.append(r1)
            r4.append(r6)
            r4.append(r10)
            java.lang.String r1 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
            goto L_0x053c
        L_0x00eb:
            if (r10 != 0) goto L_0x011c
            int r8 = r1.f177289e
            r9 = 88890(0x15b3a, float:1.24561E-40)
            if (r8 == r9) goto L_0x011c
            java.lang.String r3 = r1.mo87439r()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r7)
            r4.append(r2)
            java.lang.String r2 = " return for default tabId:"
            r4.append(r2)
            int r1 = r1.f177289e
            r4.append(r1)
            r4.append(r6)
            r4.append(r10)
            java.lang.String r1 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
            goto L_0x053c
        L_0x011c:
            boolean r6 = r1.f177291g
            if (r6 == 0) goto L_0x0143
            boolean r6 = r1.mo87444w(r2)
            if (r6 != 0) goto L_0x0143
            java.lang.String r1 = r1.mo87439r()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r2)
            java.lang.String r2 = " return for isLeftPos"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            goto L_0x053c
        L_0x0143:
            boolean r6 = r1.f177292h
            if (r6 == 0) goto L_0x0163
            java.lang.String r2 = r1.mo87439r()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "checkIfShowAnimation isIgnoreRedDotShowAnimation:"
            r3.append(r4)
            boolean r1 = r1.f177292h
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            goto L_0x053c
        L_0x0163:
            java.lang.String r6 = r1.mo87439r()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            r8.append(r2)
            java.lang.String r2 = " feedId:"
            r8.append(r2)
            java.lang.String r2 = o40.C61926c.m72691p(r13)
            r8.append(r2)
            java.lang.String r2 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r2)
            r2 = 0
            r5.setVolume(r2)
            r5.setMute(r2)
            km1.j r5 = r1.f177300p
            if (r5 == 0) goto L_0x04fc
            java.lang.String r7 = "targetView"
            gy3.C87412m.m108594g(r4, r7)
            r5.f173993c = r4
            int[] r7 = r5.f173994d
            r8 = 2
            int[] r9 = new int[r8]
            r4.getLocationOnScreen(r9)
            int[] r10 = new int[r8]
            androidx.recyclerview.widget.RecyclerView r11 = r5.f173992b
            r11.getLocationOnScreen(r10)
            r11 = r9[r3]
            r12 = r10[r3]
            r13 = 120(0x78, float:1.68E-43)
            java.lang.String r14 = "FinderLiveCardPreViewAnimationHelper"
            if (r11 >= r12) goto L_0x01f5
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "getLocationOnScreen use recyclerView Y:"
            r11.append(r12)
            r12 = r10[r3]
            r11.append(r12)
            java.lang.String r12 = " targetViewPos["
            r11.append(r12)
            r12 = r9[r2]
            r11.append(r12)
            r11.append(r13)
            r12 = r9[r3]
            r11.append(r12)
            java.lang.String r12 = "] recyclerViewPos["
            r11.append(r12)
            r12 = r10[r2]
            r11.append(r12)
            r11.append(r13)
            r12 = r10[r3]
            r11.append(r12)
            r12 = 93
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r14, r11)
            r10 = r10[r3]
            r7[r3] = r10
            goto L_0x01f7
        L_0x01f5:
            r7[r3] = r11
        L_0x01f7:
            r9 = r9[r2]
            r7[r2] = r9
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r9 = "setTargetView pos["
            r7.append(r9)
            int[] r9 = r5.f173994d
            r9 = r9[r2]
            r7.append(r9)
            java.lang.String r9 = ", "
            r7.append(r9)
            int[] r10 = r5.f173994d
            r10 = r10[r3]
            r7.append(r10)
            java.lang.String r10 = "] scale["
            r7.append(r10)
            float r10 = r5.f174001k
            r7.append(r10)
            r7.append(r9)
            float r9 = r5.f174001k
            r7.append(r9)
            java.lang.String r9 = "] targetView:"
            r7.append(r9)
            r7.append(r4)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r7)
            android.view.View r7 = r5.f173993c
            gy3.C87412m.m108591d(r7)
            android.widget.RelativeLayout r9 = new android.widget.RelativeLayout
            android.content.Context r10 = r7.getContext()
            r9.<init>(r10)
            r5.f173998h = r9
            r9.setTag(r14)
            android.widget.RelativeLayout r9 = r5.f173998h
            if (r9 != 0) goto L_0x0252
            goto L_0x026c
        L_0x0252:
            android.content.Context r12 = r7.getContext()
            android.content.res.Resources r12 = r12.getResources()
            boolean r15 = r5.f174008r
            if (r15 == 0) goto L_0x0262
            r15 = 2131099919(0x7f06010f, float:1.7812205E38)
            goto L_0x0265
        L_0x0262:
            r15 = 2131099697(0x7f060031, float:1.7811755E38)
        L_0x0265:
            android.graphics.drawable.Drawable r12 = r12.getDrawable(r15)
            r9.setBackground(r12)
        L_0x026c:
            android.widget.RelativeLayout r9 = r5.f173998h
            if (r9 == 0) goto L_0x0278
            km1.a r12 = new km1.a
            r12.<init>(r5)
            r9.setOnTouchListener(r12)
        L_0x0278:
            android.view.TextureView r9 = new android.view.TextureView
            android.content.Context r12 = r7.getContext()
            r9.<init>(r12)
            r5.f173996f = r9
            r9.setOpaque(r2)
            java.lang.String r9 = "nearby-live-preview-view-tag"
            android.view.View r7 = r7.findViewWithTag(r9)
            com.tencent.mm.plugin.finder.nearby.live.play.NearbyLivePreviewView r7 = (com.tencent.p014mm.plugin.finder.nearby.live.play.NearbyLivePreviewView) r7
            if (r7 != 0) goto L_0x0297
            java.lang.String r2 = "liveView error for null."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r2)
            goto L_0x04fc
        L_0x0297:
            gr1.o0 r12 = r7.getRenderView()
            android.view.TextureView r12 = r12.getVideoView()
            android.view.TextureView$SurfaceTextureListener r15 = r12.getSurfaceTextureListener()
            r5.f174005o = r15
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r10 = "attachFloatView floatViewContainer:"
            r15.append(r10)
            android.widget.RelativeLayout r10 = r5.f173998h
            r15.append(r10)
            java.lang.String r10 = " surfaceTexture:"
            r15.append(r10)
            gr1.o0 r10 = r7.getRenderView()
            android.view.TextureView r10 = r10.getVideoView()
            android.graphics.SurfaceTexture r10 = r10.getSurfaceTexture()
            r15.append(r10)
            java.lang.String r10 = " videoViewSurfaceTextureListener:"
            r15.append(r10)
            android.view.TextureView$SurfaceTextureListener r10 = r5.f174005o
            r15.append(r10)
            java.lang.String r10 = r15.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r10)
            gr1.o0 r10 = r7.getRenderView()
            android.view.TextureView r10 = r10.getVideoView()
            android.graphics.SurfaceTexture r10 = r10.getSurfaceTexture()
            if (r10 != 0) goto L_0x02ee
            java.lang.String r2 = "attachFloatView error for null."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r14, r2)
            goto L_0x04fc
        L_0x02ee:
            gr1.o0 r10 = r7.getRenderView()
            android.view.TextureView r10 = r10.getVideoView()
            km1.b r15 = new km1.b
            r15.<init>()
            r10.setSurfaceTextureListener(r15)
            gr1.o0 r10 = r7.getRenderView()
            android.view.TextureView r10 = r10.getVideoView()
            java.lang.String r15 = "liveView.renderView.videoView"
            gy3.C87412m.m108593f(r10, r15)
            android.view.TextureView r15 = r5.f173996f
            gy3.C87412m.m108591d(r15)
            android.graphics.SurfaceTexture r11 = r10.getSurfaceTexture()
            gy3.C87412m.m108591d(r11)
            r15.setSurfaceTexture(r11)
            com.tencent.mm.ui.widget.RoundedCornerFrameLayout r11 = new com.tencent.mm.ui.widget.RoundedCornerFrameLayout
            android.view.View r15 = r5.f173993c
            gy3.C87412m.m108591d(r15)
            android.content.Context r15 = r15.getContext()
            r11.<init>(r15)
            r5.f173997g = r11
            android.content.Context r15 = r5.f173991a
            android.content.res.Resources r15 = r15.getResources()
            r6 = 2131165371(0x7f0700bb, float:1.7944957E38)
            float r6 = r15.getDimension(r6)
            r11.setRadius(r6)
            android.widget.RelativeLayout$LayoutParams r6 = new android.widget.RelativeLayout$LayoutParams
            android.view.View r11 = r5.f173993c
            gy3.C87412m.m108591d(r11)
            int r11 = r11.getWidth()
            android.view.View r15 = r5.f173993c
            gy3.C87412m.m108591d(r15)
            int r15 = r15.getHeight()
            r6.<init>(r11, r15)
            int[] r11 = r5.f173994d
            r15 = r11[r2]
            r6.leftMargin = r15
            r11 = r11[r3]
            r6.topMargin = r11
            android.widget.RelativeLayout r11 = r5.f173998h
            if (r11 == 0) goto L_0x0364
            com.tencent.mm.ui.widget.RoundedCornerFrameLayout r15 = r5.f173997g
            r11.addView(r15, r6)
        L_0x0364:
            android.view.View r6 = r5.f173993c
            gy3.C87412m.m108591d(r6)
            android.view.View r6 = r6.findViewWithTag(r9)
            com.tencent.mm.plugin.finder.nearby.live.play.NearbyLivePreviewView r6 = (com.tencent.p014mm.plugin.finder.nearby.live.play.NearbyLivePreviewView) r6
            android.view.View r11 = r5.f173993c
            gy3.C87412m.m108591d(r11)
            int r11 = r11.getHeight()
            if (r6 == 0) goto L_0x0392
            float r15 = r6.getVideoRatioWH()
            r16 = 0
            int r15 = (r15 > r16 ? 1 : (r15 == r16 ? 0 : -1))
            if (r15 != 0) goto L_0x0386
            r15 = 1
            goto L_0x0387
        L_0x0386:
            r15 = 0
        L_0x0387:
            if (r15 != 0) goto L_0x0392
            float r15 = (float) r11
            float r6 = r6.getVideoRatioWH()
            float r15 = r15 * r6
            int r6 = (int) r15
            goto L_0x039b
        L_0x0392:
            android.view.View r6 = r5.f173993c
            gy3.C87412m.m108591d(r6)
            int r6 = r6.getWidth()
        L_0x039b:
            android.widget.FrameLayout$LayoutParams r15 = new android.widget.FrameLayout$LayoutParams
            r3 = -1
            r15.<init>(r3, r3)
            r15.width = r6
            r15.height = r11
            r8 = 17
            r15.gravity = r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r2 = "attachMaskView maskView["
            r8.append(r2)
            r8.append(r6)
            r8.append(r13)
            r8.append(r11)
            java.lang.String r2 = "] videoView:["
            r8.append(r2)
            int r2 = r10.getWidth()
            r8.append(r2)
            r8.append(r13)
            int r2 = r10.getHeight()
            r8.append(r2)
            java.lang.String r2 = "] surfaceTexture:"
            r8.append(r2)
            android.graphics.SurfaceTexture r2 = r10.getSurfaceTexture()
            r8.append(r2)
            java.lang.String r2 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r2)
            com.tencent.mm.ui.widget.RoundedCornerFrameLayout r2 = r5.f173997g
            if (r2 == 0) goto L_0x03ee
            android.view.TextureView r6 = r5.f173996f
            r2.addView(r6, r15)
        L_0x03ee:
            android.view.View r2 = r5.f173993c
            gy3.C87412m.m108591d(r2)
            android.view.View r2 = r2.getRootView()
            android.widget.FrameLayout$LayoutParams r6 = new android.widget.FrameLayout$LayoutParams
            r6.<init>(r3, r3)
            java.lang.String r3 = "null cannot be cast to non-null type android.view.ViewGroup"
            gy3.C87412m.m108592e(r2, r3)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            android.widget.RelativeLayout r3 = r5.f173998h
            r2.addView(r3, r6)
            gr1.o0 r2 = r7.getRenderView()
            r2.removeVideoView()
            gr1.o0 r2 = r7.getRenderView()
            r2.addVideoView(r12)
            java.lang.String r2 = "start"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r2)
            r2 = 0
            r5.f174009s = r2
            com.tencent.mm.ui.widget.RoundedCornerFrameLayout r3 = r5.f173997g
            if (r3 != 0) goto L_0x042b
            java.lang.String r2 = "createAnimationSet return for null."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r14, r2)
            r6 = 0
            goto L_0x04ef
        L_0x042b:
            r6 = 2
            float[] r7 = new float[r6]
            r8 = 1065353216(0x3f800000, float:1.0)
            r7[r2] = r8
            float r10 = r5.f174001k
            r11 = 1
            r7[r11] = r10
            java.lang.String r10 = "scaleX"
            android.animation.ObjectAnimator r3 = android.animation.ObjectAnimator.ofFloat(r3, r10, r7)
            com.tencent.mm.ui.widget.RoundedCornerFrameLayout r7 = r5.f173997g
            gy3.C87412m.m108591d(r7)
            float[] r10 = new float[r6]
            r10[r2] = r8
            float r2 = r5.f174001k
            r10[r11] = r2
            java.lang.String r2 = "scaleY"
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r7, r2, r10)
            android.content.Context r6 = r5.f173991a
            android.content.res.Resources r6 = r6.getResources()
            r7 = 2131101687(0x7f0607f7, float:1.781579E38)
            int r6 = r6.getColor(r7)
            android.content.Context r7 = r5.f173991a
            android.content.res.Resources r7 = r7.getResources()
            boolean r8 = r5.f174008r
            if (r8 == 0) goto L_0x046b
            r10 = 2131099919(0x7f06010f, float:1.7812205E38)
            goto L_0x046e
        L_0x046b:
            r10 = 2131099697(0x7f060031, float:1.7811755E38)
        L_0x046e:
            int r7 = r7.getColor(r10)
            android.animation.ArgbEvaluator r8 = new android.animation.ArgbEvaluator
            r8.<init>()
            r10 = 2
            java.lang.Object[] r11 = new java.lang.Object[r10]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r10 = 0
            r11[r10] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            r7 = 1
            r11[r7] = r6
            android.animation.ValueAnimator r6 = android.animation.ValueAnimator.ofObject(r8, r11)
            r5.f173999i = r6
            if (r6 == 0) goto L_0x0498
            km1.c r7 = new km1.c
            r7.<init>(r5)
            r6.addUpdateListener(r7)
        L_0x0498:
            android.view.View r6 = r5.f173993c
            gy3.C87412m.m108591d(r6)
            android.view.View r6 = r6.findViewWithTag(r9)
            com.tencent.mm.plugin.finder.nearby.live.play.NearbyLivePreviewView r6 = (com.tencent.p014mm.plugin.finder.nearby.live.play.NearbyLivePreviewView) r6
            android.animation.IntEvaluator r7 = new android.animation.IntEvaluator
            r7.<init>()
            r8 = 2
            java.lang.Object[] r9 = new java.lang.Object[r8]
            r8 = 0
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            r9[r8] = r10
            r8 = 100
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r10 = 1
            r9[r10] = r8
            android.animation.ValueAnimator r7 = android.animation.ValueAnimator.ofObject(r7, r9)
            if (r7 == 0) goto L_0x04c9
            km1.d r8 = new km1.d
            r8.<init>(r6)
            r7.addUpdateListener(r8)
        L_0x04c9:
            android.animation.AnimatorSet r6 = new android.animation.AnimatorSet
            r6.<init>()
            long r8 = r5.f174002l
            r6.setDuration(r8)
            r8 = 4
            android.animation.Animator[] r8 = new android.animation.Animator[r8]
            android.animation.ValueAnimator r9 = r5.f173999i
            r10 = 0
            r8[r10] = r9
            r9 = 1
            r8[r9] = r3
            r3 = 2
            r8[r3] = r2
            r2 = 3
            r8[r2] = r7
            r6.playTogether(r8)
            km1.e r2 = new km1.e
            r2.<init>(r5)
            r6.addListener(r2)
        L_0x04ef:
            r5.f173995e = r6
            if (r6 == 0) goto L_0x04f6
            r6.start()
        L_0x04f6:
            long r2 = java.lang.System.currentTimeMillis()
            r5.f174004n = r2
        L_0x04fc:
            r2 = 2131310054(0x7f0935e6, float:1.823841E38)
            java.lang.String r3 = "1"
            r4.setTag(r2, r3)
            r2 = 2131310053(0x7f0935e5, float:1.8238407E38)
            r4.setTag(r2, r3)
            r2 = 0
            r1.f177308x = r2
            goto L_0x053c
        L_0x050e:
            java.lang.String r1 = r1.mo87439r()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r2)
            java.lang.String r2 = " return for feedId:"
            r3.append(r2)
            java.lang.String r2 = o40.C61926c.m72691p(r13)
            r3.append(r2)
            java.lang.String r2 = " redDotObjectId:"
            r3.append(r2)
            java.lang.String r2 = o40.C61926c.m72691p(r8)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
        L_0x053c:
            pm1.d r1 = r0.f177336f
            java.lang.String r1 = r1.mo87439r()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "checkAutoPlay onFirstFrameRendStartCallback tabId:"
            r2.append(r3)
            pm1.d r3 = r0.f177336f
            int r3 = r3.f177289e
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: pm1.C62391e.invoke():java.lang.Object");
    }
}
