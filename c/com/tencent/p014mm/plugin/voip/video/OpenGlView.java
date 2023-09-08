package com.tencent.p014mm.plugin.voip.video;

import a43.C103307f;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.voip.video.GLTextureView;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.ref.WeakReference;

/* renamed from: com.tencent.mm.plugin.voip.video.OpenGlView */
public class OpenGlView extends GLTextureView {

    /* renamed from: s */
    public int f318154s;

    /* renamed from: t */
    public WeakReference<OpenGlRender> f318155t;

    public OpenGlView(Context context) {
        super(context);
        this.f318154s = 1;
        this.f318154s = OpenGlRender.m143736e();
        mo153113g(false, 0, 0);
    }

    /* renamed from: c */
    public void mo153057c(SurfaceTexture surfaceTexture, int i, int i2, int i3) {
        super.mo153057c(surfaceTexture, i, i2, i3);
    }

    /* renamed from: d */
    public void mo153058d(SurfaceTexture surfaceTexture) {
        Log.m105924i("OpenGlView", "surfaceCreated");
        super.mo153058d(surfaceTexture);
        OpenGlRender openGlRender = this.f318155t.get();
        Log.m105925i("OpenGlRender", "%s surfaceCreated", Integer.valueOf(openGlRender.hashCode()));
        OpenGlRender.m143736e();
        openGlRender.f318124a = true;
    }

    /* renamed from: e */
    public void mo153059e(SurfaceTexture surfaceTexture) {
        OpenGlView openGlView;
        Log.m105924i("OpenGlView", "surfaceDestroyed");
        OpenGlRender openGlRender = this.f318155t.get();
        Log.m105925i("OpenGlRender", "onSurfaceDestroyed,mRenderMode:%d", Integer.valueOf(openGlRender.f318129f));
        if (openGlRender.f318136m != null) {
            openGlRender.f318123A = true;
            Log.m105924i("OpenGlRender", "surfaceDestroy call detachGLContext");
            openGlRender.mo153102b(false);
        }
        openGlRender.f318124a = false;
        Log.m105924i("OpenGlRender", "steve: after Uninit in onSurfaceDestroyed");
        openGlRender.f318126c = 0;
        openGlRender.f318127d = 0;
        WeakReference<OpenGlView> weakReference = openGlRender.f318128e;
        if (!(weakReference == null || (openGlView = weakReference.get()) == null)) {
            Log.m105924i("OpenGlRender", "onSurfaceDestroyed queue release renderer event");
            openGlView.mo153056b(new C103307f(openGlRender));
        }
        super.mo153059e(surfaceTexture);
    }

    /* renamed from: f */
    public void mo67520f(int i, int i2) {
        RelativeLayout.LayoutParams layoutParams;
        if (C85875k4.m106207v()) {
            layoutParams = new RelativeLayout.LayoutParams((i2 * 9) / 16, i2);
            layoutParams.addRule(13);
        } else {
            layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        }
        setLayoutParams(layoutParams);
    }

    /* renamed from: g */
    public final void mo153113g(boolean z, int i, int i2) {
        if (this.f318154s == 2) {
            setEGLContextFactory(new C106503b());
            setEGLConfigChooser((GLTextureView.C106489f) new C106502a(5, 6, 5, 0, 0, 0));
        }
    }

    public void setRenderer(OpenGlRender openGlRender) {
        this.f318155t = new WeakReference<>(openGlRender);
        super.setRenderer(openGlRender);
        setRenderMode(0);
    }

    public OpenGlView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f318154s = 1;
        this.f318154s = OpenGlRender.m143736e();
        mo153113g(false, 0, 0);
    }
}
