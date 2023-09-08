package com.tencent.liteav.videoconsumer.renderer;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.tencent.liteav.base.util.C104507p;
import com.tencent.liteav.base.util.C17111b;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.videobase.DisplayTarget;

/* renamed from: com.tencent.liteav.videoconsumer.renderer.a */
public final class C17370a {

    /* renamed from: a */
    public final C17373a f47092a;

    /* renamed from: b */
    public Surface f47093b = null;

    /* renamed from: c */
    public SurfaceTexture f47094c = null;

    /* renamed from: d */
    public final C104507p f47095d = new C104507p();

    /* renamed from: e */
    public DisplayTarget f47096e;

    /* renamed from: f */
    private int f47097f = 0;

    /* renamed from: g */
    private int f47098g = 0;

    /* renamed from: h */
    private GLConstants.GLScaleType f47099h = null;

    /* renamed from: i */
    private final C17111b f47100i = new C17111b(Looper.getMainLooper());

    /* renamed from: j */
    private final SurfaceHolder.Callback f47101j = new SurfaceHolder.Callback() {
        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            if (surfaceHolder != null) {
                LiteavLog.m16901i("VideoRenderer.DisplayViewWrapper", "surfaceChanged " + i2 + " " + i3);
                C17370a.this.f47093b = surfaceHolder.getSurface();
                C17370a.this.mo20445a(i2, i3);
            }
        }

        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (surfaceHolder != null) {
                LiteavLog.m16901i("VideoRenderer.DisplayViewWrapper", "surfaceCreated");
                C17370a.this.mo20446a(surfaceHolder.getSurface());
            }
        }

        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            LiteavLog.m16901i("VideoRenderer.DisplayViewWrapper", "surfaceDestroyed");
            C17370a aVar = C17370a.this;
            aVar.f47093b = null;
            C104507p pVar = aVar.f47095d;
            pVar.f309736a = 0;
            pVar.f309737b = 0;
            aVar.mo20457e();
        }
    };

    /* renamed from: k */
    private final TextureView.SurfaceTextureListener f47102k = new TextureView.SurfaceTextureListener() {
        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            TextureView d;
            SurfaceTexture surfaceTexture2;
            LiteavLog.m16902i("VideoRenderer.DisplayViewWrapper", "onSurfaceTextureAvailable, size: %dx%d", Integer.valueOf(i), Integer.valueOf(i2));
            C17370a aVar = C17370a.this;
            if (!(aVar.f47094c == null || aVar.f47096e == null || (d = aVar.mo20456d()) == null || surfaceTexture == (surfaceTexture2 = aVar.f47094c))) {
                d.setSurfaceTexture(surfaceTexture2);
                surfaceTexture = aVar.f47094c;
                aVar.f47094c = null;
            }
            C17370a.m17336a(C17370a.this, surfaceTexture, i, i2);
            C17370a aVar2 = C17370a.this;
            aVar2.mo20449a(aVar2.mo20456d());
        }

        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            LiteavLog.m16901i("VideoRenderer.DisplayViewWrapper", "onSurfaceTextureDestroyed");
            C17370a.this.mo20457e();
            C17370a aVar = C17370a.this;
            aVar.f47093b = null;
            C104507p pVar = aVar.f47095d;
            pVar.f309736a = 0;
            pVar.f309737b = 0;
            if (aVar.mo20456d() == null) {
                return true;
            }
            C17370a.this.f47094c = surfaceTexture;
            return false;
        }

        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            Bitmap bitmap;
            LiteavLog.m16902i("VideoRenderer.DisplayViewWrapper", "onSurfaceTextureSizeChanged, size: %dx%d", Integer.valueOf(i), Integer.valueOf(i2));
            C17370a.m17336a(C17370a.this, surfaceTexture, i, i2);
            C17370a aVar = C17370a.this;
            aVar.mo20449a(aVar.mo20456d());
            TextureView d = C17370a.this.mo20456d();
            if (C17370a.this.f47092a != null && d != null && (bitmap = d.getBitmap()) != null) {
                C17370a.this.f47092a.mo20466a(bitmap);
            }
        }

        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    };

    /* renamed from: com.tencent.liteav.videoconsumer.renderer.a$a */
    public interface C17373a {
        /* renamed from: a */
        void mo20465a();

        /* renamed from: a */
        void mo20466a(Bitmap bitmap);

        /* renamed from: a */
        void mo20467a(Surface surface, int i, int i2, boolean z, boolean z2);
    }

    public C17370a(C17373a aVar) {
        this.f47092a = aVar;
    }

    /* renamed from: a */
    public final boolean mo20452a() {
        return this.f47096e != null;
    }

    /* renamed from: b */
    public final void mo20453b() {
        DisplayTarget displayTarget = this.f47096e;
        if (displayTarget != null) {
            SurfaceView surfaceView = displayTarget.getSurfaceView();
            TextureView textureView = this.f47096e.getTextureView();
            if (surfaceView != null) {
                surfaceView.getHolder().removeCallback(this.f47101j);
            }
            if (textureView != null && textureView.getSurfaceTextureListener() == this.f47102k) {
                textureView.setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
            }
        }
    }

    /* renamed from: c */
    public final void mo20455c() {
        SurfaceTexture surfaceTexture = this.f47094c;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.f47094c = null;
        }
    }

    /* renamed from: d */
    public final TextureView mo20456d() {
        DisplayTarget displayTarget = this.f47096e;
        if (displayTarget == null) {
            return null;
        }
        if (displayTarget.getType() == DisplayTarget.C17252a.TXCLOUDVIEW && this.f47096e.getTXCloudVideoView() != null) {
            return this.f47096e.getTXCloudVideoView().getVideoView();
        }
        if (this.f47096e.getType() == DisplayTarget.C17252a.TEXTUREVIEW) {
            return this.f47096e.getTextureView();
        }
        return null;
    }

    /* renamed from: e */
    public final void mo20457e() {
        C17373a aVar = this.f47092a;
        if (aVar != null) {
            aVar.mo20465a();
        }
    }

    /* renamed from: a */
    public final void mo20451a(DisplayTarget displayTarget) {
        this.f47100i.post(C17374b.m17353a(this, displayTarget));
    }

    /* renamed from: a */
    public final synchronized void mo20450a(GLConstants.GLScaleType gLScaleType, int i, int i2) {
        if (!(i == this.f47097f && i2 == this.f47098g && this.f47099h == gLScaleType)) {
            this.f47099h = gLScaleType;
            this.f47097f = i;
            this.f47098g = i2;
            this.f47100i.post(C17375c.m17354a(this));
        }
    }

    /* renamed from: b */
    public final void mo20454b(TextureView textureView) {
        LiteavLog.m16901i("VideoRenderer.DisplayViewWrapper", "setDisplayTextureView textureView: ".concat(String.valueOf(textureView)));
        DisplayTarget displayTarget = this.f47096e;
        if (displayTarget != null && textureView == displayTarget.getTextureView() && this.f47096e.getType() == DisplayTarget.C17252a.TEXTUREVIEW) {
            LiteavLog.m16901i("VideoRenderer.DisplayViewWrapper", "setDisplayView set same textureview!" + this.f47096e);
            return;
        }
        if (mo20452a()) {
            if (textureView == null) {
                mo20457e();
            }
            mo20453b();
            mo20455c();
        }
        if (textureView != null) {
            this.f47095d.f309737b = textureView.getHeight();
            this.f47095d.f309736a = textureView.getWidth();
            if (textureView.isAvailable()) {
                LiteavLog.m16901i("VideoRenderer.DisplayViewWrapper", "setDisplayView TextureView " + textureView + " " + textureView.getWidth() + " " + textureView.getHeight());
                Surface surface = new Surface(textureView.getSurfaceTexture());
                this.f47093b = surface;
                mo20447a(surface, textureView.getWidth(), textureView.getHeight(), true, true);
            } else {
                LiteavLog.m16901i("VideoRenderer.DisplayViewWrapper", "setDisplayView, TextureView not Available");
            }
            textureView.setSurfaceTextureListener(this.f47102k);
            mo20449a(textureView);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c2, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo20449a(android.view.TextureView r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            if (r9 != 0) goto L_0x0005
            monitor-exit(r8)
            return
        L_0x0005:
            int r0 = r9.getWidth()     // Catch:{ all -> 0x00c3 }
            int r1 = r9.getHeight()     // Catch:{ all -> 0x00c3 }
            int r2 = r8.f47097f     // Catch:{ all -> 0x00c3 }
            if (r2 == 0) goto L_0x00c1
            int r3 = r8.f47098g     // Catch:{ all -> 0x00c3 }
            if (r3 == 0) goto L_0x00c1
            if (r0 == 0) goto L_0x00c1
            if (r1 != 0) goto L_0x001b
            goto L_0x00c1
        L_0x001b:
            float r4 = (float) r3     // Catch:{ all -> 0x00c3 }
            r5 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 * r5
            float r6 = (float) r2     // Catch:{ all -> 0x00c3 }
            float r4 = r4 / r6
            float r1 = (float) r1     // Catch:{ all -> 0x00c3 }
            float r6 = r1 * r5
            float r0 = (float) r0     // Catch:{ all -> 0x00c3 }
            float r7 = r6 / r0
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 <= 0) goto L_0x004a
            com.tencent.liteav.videobase.base.GLConstants$GLScaleType r4 = r8.f47099h     // Catch:{ all -> 0x00c3 }
            com.tencent.liteav.videobase.base.GLConstants$GLScaleType r6 = com.tencent.liteav.videobase.base.GLConstants.GLScaleType.FIT_CENTER     // Catch:{ all -> 0x00c3 }
            if (r4 != r6) goto L_0x003c
            float r2 = (float) r2     // Catch:{ all -> 0x00c3 }
            float r2 = r2 * r5
            float r2 = r2 / r0
            float r2 = r2 * r1
            float r3 = (float) r3     // Catch:{ all -> 0x00c3 }
            float r2 = r2 / r3
            r5 = r2
            goto L_0x0064
        L_0x003c:
            com.tencent.liteav.videobase.base.GLConstants$GLScaleType r6 = com.tencent.liteav.videobase.base.GLConstants.GLScaleType.CENTER_CROP     // Catch:{ all -> 0x00c3 }
            if (r4 != r6) goto L_0x0064
            float r4 = r0 * r5
            float r3 = (float) r3     // Catch:{ all -> 0x00c3 }
            float r4 = r4 * r3
            float r2 = (float) r2     // Catch:{ all -> 0x00c3 }
            float r4 = r4 / r2
            float r4 = r4 / r1
            r3 = r4
            goto L_0x0066
        L_0x004a:
            com.tencent.liteav.videobase.base.GLConstants$GLScaleType r4 = r8.f47099h     // Catch:{ all -> 0x00c3 }
            com.tencent.liteav.videobase.base.GLConstants$GLScaleType r7 = com.tencent.liteav.videobase.base.GLConstants.GLScaleType.FIT_CENTER     // Catch:{ all -> 0x00c3 }
            if (r4 != r7) goto L_0x0059
            float r3 = (float) r3     // Catch:{ all -> 0x00c3 }
            float r3 = r3 * r5
            float r3 = r3 * r0
            float r2 = (float) r2     // Catch:{ all -> 0x00c3 }
            float r3 = r3 / r2
            float r3 = r3 / r1
            goto L_0x0066
        L_0x0059:
            com.tencent.liteav.videobase.base.GLConstants$GLScaleType r7 = com.tencent.liteav.videobase.base.GLConstants.GLScaleType.CENTER_CROP     // Catch:{ all -> 0x00c3 }
            if (r4 != r7) goto L_0x0064
            float r2 = (float) r2     // Catch:{ all -> 0x00c3 }
            float r6 = r6 * r2
            float r2 = (float) r3     // Catch:{ all -> 0x00c3 }
            float r6 = r6 / r2
            float r6 = r6 / r0
            r5 = r6
        L_0x0064:
            r3 = 1065353216(0x3f800000, float:1.0)
        L_0x0066:
            android.graphics.Matrix r2 = new android.graphics.Matrix     // Catch:{ all -> 0x00c3 }
            r2.<init>()     // Catch:{ all -> 0x00c3 }
            r4 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r4
            float r1 = r1 / r4
            r2.setScale(r5, r3, r0, r1)     // Catch:{ all -> 0x00c3 }
            r9.setTransform(r2)     // Catch:{ all -> 0x00c3 }
            r9.requestLayout()     // Catch:{ all -> 0x00c3 }
            r9.invalidate()     // Catch:{ all -> 0x00c3 }
            java.lang.String r0 = "VideoRenderer.DisplayViewWrapper"
            java.lang.String r1 = "view: %s, scaleX: %.2f, scaleY: %.2f, video: %dx%d, view: %dx%d"
            r2 = 7
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x00c3 }
            r4 = 0
            r2[r4] = r9     // Catch:{ all -> 0x00c3 }
            r4 = 1
            java.lang.Float r5 = java.lang.Float.valueOf(r5)     // Catch:{ all -> 0x00c3 }
            r2[r4] = r5     // Catch:{ all -> 0x00c3 }
            r4 = 2
            java.lang.Float r3 = java.lang.Float.valueOf(r3)     // Catch:{ all -> 0x00c3 }
            r2[r4] = r3     // Catch:{ all -> 0x00c3 }
            r3 = 3
            int r4 = r8.f47097f     // Catch:{ all -> 0x00c3 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x00c3 }
            r2[r3] = r4     // Catch:{ all -> 0x00c3 }
            r3 = 4
            int r4 = r8.f47098g     // Catch:{ all -> 0x00c3 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x00c3 }
            r2[r3] = r4     // Catch:{ all -> 0x00c3 }
            r3 = 5
            int r4 = r9.getWidth()     // Catch:{ all -> 0x00c3 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x00c3 }
            r2[r3] = r4     // Catch:{ all -> 0x00c3 }
            r3 = 6
            int r9 = r9.getHeight()     // Catch:{ all -> 0x00c3 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x00c3 }
            r2[r3] = r9     // Catch:{ all -> 0x00c3 }
            com.tencent.liteav.base.util.LiteavLog.m16902i(r0, r1, r2)     // Catch:{ all -> 0x00c3 }
            monitor-exit(r8)
            return
        L_0x00c1:
            monitor-exit(r8)
            return
        L_0x00c3:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.videoconsumer.renderer.C17370a.mo20449a(android.view.TextureView):void");
    }

    /* renamed from: a */
    public final void mo20448a(SurfaceView surfaceView) {
        DisplayTarget displayTarget = this.f47096e;
        if (displayTarget != null && surfaceView == displayTarget.getSurfaceView() && this.f47096e.getType() == DisplayTarget.C17252a.SURFACEVIEW) {
            LiteavLog.m16901i("VideoRenderer.DisplayViewWrapper", "setDisplayView set same surfaceview!" + this.f47096e);
            return;
        }
        if (mo20452a()) {
            if (surfaceView == null) {
                mo20457e();
            }
            mo20453b();
            mo20455c();
        }
        if (surfaceView != null) {
            SurfaceHolder holder = surfaceView.getHolder();
            this.f47095d.f309737b = surfaceView.getHeight();
            this.f47095d.f309736a = surfaceView.getWidth();
            if (holder.getSurface().isValid()) {
                Surface surface = surfaceView.getHolder().getSurface();
                Rect surfaceFrame = surfaceView.getHolder().getSurfaceFrame();
                Object[] objArr = new Object[3];
                objArr[0] = Integer.valueOf(surface != null ? surface.hashCode() : 0);
                objArr[1] = Integer.valueOf(surfaceFrame.width());
                objArr[2] = Integer.valueOf(surfaceFrame.height());
                LiteavLog.m16902i("VideoRenderer.DisplayViewWrapper", "setDisplayView %d %d*%d when construct", objArr);
                this.f47093b = surface;
                mo20447a(surface, surfaceFrame.width(), surfaceFrame.height(), false, false);
            } else {
                LiteavLog.m16901i("VideoRenderer.DisplayViewWrapper", "setDisplayView, SurfaceView not valid");
            }
            surfaceView.getHolder().addCallback(this.f47101j);
        }
    }

    /* renamed from: a */
    public final void mo20446a(Surface surface) {
        this.f47100i.post(C17376d.m17355a(this, surface));
    }

    /* renamed from: a */
    public final void mo20445a(int i, int i2) {
        this.f47100i.post(C17377e.m17356a(this, i, i2));
    }

    /* renamed from: a */
    public final void mo20447a(Surface surface, int i, int i2, boolean z, boolean z2) {
        C17373a aVar = this.f47092a;
        if (aVar != null) {
            aVar.mo20467a(surface, i, i2, z, z2);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m17336a(C17370a aVar, SurfaceTexture surfaceTexture, int i, int i2) {
        Surface surface = new Surface(surfaceTexture);
        aVar.f47093b = surface;
        C104507p pVar = aVar.f47095d;
        pVar.f309736a = i;
        pVar.f309737b = i2;
        aVar.mo20447a(surface, i, i2, true, true);
    }
}
