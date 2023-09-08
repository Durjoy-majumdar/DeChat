package qj1;

import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: qj1.ng */
public final class C62896ng extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C62777fg f178493d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62896ng(C62777fg fgVar) {
        super(0);
        this.f178493d = fgVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0059  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke() {
        /*
            r10 = this;
            qj1.fg r0 = r10.f178493d
            rx3.g r0 = r0.f178201q
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            hi1.b r0 = (hi1.C59909b) r0
            android.view.TextureView r1 = r0.f170998b
            boolean r1 = r1.isShown()
            java.lang.String r2 = "FinderLiveMicCameraPreviewManager"
            r3 = 0
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L_0x0021
            java.lang.String r0 = "showCameraPreviewView has show"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            goto L_0x010e
        L_0x0021:
            r0.mo84835a()
            qj1.c r1 = r0.f170997a
            java.lang.Class<qj1.sh> r6 = qj1.C62983sh.class
            qj1.c r1 = r1.mo87687E0(r6)
            qj1.sh r1 = (qj1.C62983sh) r1
            if (r1 == 0) goto L_0x010e
            p50.e r6 = r1.mo87920a1()
            if (r6 == 0) goto L_0x0047
            y80.g r6 = r6.f173034t
            if (r6 == 0) goto L_0x0042
            boolean r6 = r6.mo164109B()
            if (r6 != r5) goto L_0x0042
            r6 = 1
            goto L_0x0043
        L_0x0042:
            r6 = 0
        L_0x0043:
            if (r6 != r5) goto L_0x0047
            r6 = 1
            goto L_0x0048
        L_0x0047:
            r6 = 0
        L_0x0048:
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r7 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r7.getClass()
            j50.a r7 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159378f
            if (r7 == 0) goto L_0x0059
            boolean r7 = r7.mo85682Z()
            if (r7 != r5) goto L_0x0059
            r7 = 1
            goto L_0x005a
        L_0x0059:
            r7 = 0
        L_0x005a:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "showCameraPreviewView isCameraPreviewing: "
            r8.append(r9)
            r8.append(r6)
            java.lang.String r9 = " isInLinkMic: "
            r8.append(r9)
            r8.append(r7)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r8)
            if (r6 == 0) goto L_0x00f6
            if (r7 == 0) goto L_0x00f6
            java.lang.String r6 = "showCameraPreviewView mic linking "
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r6)
            com.tencent.mm.live.core.view.LivePreviewView r1 = r1.f178711r
            android.view.TextureView r1 = r1.getCameraView()
            if (r1 == 0) goto L_0x010e
            android.view.TextureView$SurfaceTextureListener r2 = r1.getSurfaceTextureListener()
            r0.f171002f = r2
            android.graphics.SurfaceTexture r2 = r1.getSurfaceTexture()
            if (r2 == 0) goto L_0x010e
            ph1.l$a r6 = new ph1.l$a
            java.lang.String r7 = "CameraPreviewManager_Ori"
            r6.<init>(r7, r4)
            r1.setSurfaceTextureListener(r6)
            r0.f171003g = r2
            android.graphics.Bitmap r6 = r1.getBitmap()
            android.view.TextureView r7 = r0.f170998b
            r7.setSurfaceTexture(r2)
            android.view.ViewParent r2 = r1.getParent()
            boolean r7 = r2 instanceof android.view.ViewGroup
            if (r7 == 0) goto L_0x00b5
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            goto L_0x00b6
        L_0x00b5:
            r2 = r3
        L_0x00b6:
            if (r2 == 0) goto L_0x00e7
            r2.removeView(r1)
            r2.addView(r1)
            android.widget.ImageView r1 = r0.f171004h
            if (r1 == 0) goto L_0x00c5
            r2.removeView(r1)
        L_0x00c5:
            android.widget.ImageView r1 = r0.f171004h
            if (r1 != 0) goto L_0x00d7
            android.widget.ImageView r1 = new android.widget.ImageView
            android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r1.<init>(r7)
            android.widget.ImageView$ScaleType r7 = android.widget.ImageView.ScaleType.CENTER_CROP
            r1.setScaleType(r7)
        L_0x00d7:
            r0.f171004h = r1
            r1.setImageBitmap(r6)
            android.widget.ImageView r1 = r0.f171004h
            android.view.ViewGroup$LayoutParams r6 = new android.view.ViewGroup$LayoutParams
            r7 = -1
            r6.<init>(r7, r7)
            r2.addView(r1, r6)
        L_0x00e7:
            android.view.ViewGroup r1 = r0.f171001e
            android.view.TextureView r2 = r0.f170998b
            r1.removeView(r2)
            android.view.ViewGroup r1 = r0.f171001e
            android.view.TextureView r0 = r0.f170998b
            r1.addView(r0)
            goto L_0x010e
        L_0x00f6:
            com.tencent.mm.live.core.view.LivePreviewView r2 = r1.f178711r
            android.view.TextureView r6 = r0.f170998b
            r2.setCameraOptionPreviewView(r6)
            r1.mo87922c1()
            android.view.ViewGroup r1 = r0.f171001e
            android.view.TextureView r2 = r0.f170998b
            r1.removeView(r2)
            android.view.ViewGroup r1 = r0.f171001e
            android.view.TextureView r0 = r0.f170998b
            r1.addView(r0)
        L_0x010e:
            qj1.fg r0 = r10.f178493d
            qj1.C62777fg.m73850a1(r0, r5)
            qj1.fg r0 = r10.f178493d
            r0.f178198E = r5
            r0.mo10792g(r4)
            qj1.fg r0 = r10.f178493d
            android.widget.LinearLayout r0 = r0.f178203s
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r1 = 0
            android.view.ViewPropertyAnimator r0 = r0.translationY(r1)
            r1 = 200(0xc8, double:9.9E-322)
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r1)
            android.view.ViewPropertyAnimator r0 = r0.setListener(r3)
            r0.start()
            qj1.fg r0 = r10.f178493d
            android.widget.RelativeLayout r1 = r0.f178209y
            java.lang.String r2 = "menuBeauty"
            gy3.C87412m.m108593f(r1, r2)
            ak1.f0$n r2 = ak1.C54067f0.C0066n.BEAUTY
            qj1.C62777fg.m73849Z0(r0, r1, r2)
            qj1.fg r0 = r10.f178493d
            android.widget.RelativeLayout r1 = r0.f178208x
            java.lang.String r2 = "menuFilter"
            gy3.C87412m.m108593f(r1, r2)
            ak1.f0$n r2 = ak1.C54067f0.C0066n.FILTER
            qj1.C62777fg.m73849Z0(r0, r1, r2)
            qj1.fg r0 = r10.f178493d
            android.widget.RelativeLayout r1 = r0.f178205u
            java.lang.String r2 = "menuMirror"
            gy3.C87412m.m108593f(r1, r2)
            ak1.f0$n r2 = ak1.C54067f0.C0066n.IMAGE
            qj1.C62777fg.m73849Z0(r0, r1, r2)
            qj1.fg r0 = r10.f178493d
            android.widget.RelativeLayout r1 = r0.f178204t
            java.lang.String r2 = "menuSwitchCamera"
            gy3.C87412m.m108593f(r1, r2)
            ak1.f0$n r2 = ak1.C54067f0.C0066n.FLIP
            qj1.C62777fg.m73849Z0(r0, r1, r2)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C62896ng.invoke():java.lang.Object");
    }
}
