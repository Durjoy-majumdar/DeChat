package com.tencent.p014mm.pluginsdk.p133ui.tools;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.RelativeLayout;
import com.tencent.p014mm.p136ui.base.MMTextureView;
import com.tencent.p014mm.pluginsdk.p133ui.C96814a;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96875r0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import s62.C110762b;
import s62.C110763c;
import s62.C110768l;
import s62.C110770m;
import zt3.C119157j;

@Deprecated
/* renamed from: com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView */
public class VideoPlayerTextureView extends MMTextureView implements C96875r0 {

    /* renamed from: A */
    public C110762b f318474A;

    /* renamed from: B */
    public boolean f318475B;

    /* renamed from: C */
    public boolean f318476C;

    /* renamed from: D */
    public boolean f318477D;

    /* renamed from: E */
    public boolean f318478E;

    /* renamed from: F */
    public SurfaceTexture f318479F;

    /* renamed from: G */
    public boolean f318480G;

    /* renamed from: H */
    public C110763c f318481H;

    /* renamed from: I */
    public TextureView.SurfaceTextureListener f318482I;

    /* renamed from: J */
    public C106595z1 f318483J;

    /* renamed from: h */
    public String f318484h;

    /* renamed from: i */
    public String f318485i;

    /* renamed from: j */
    public C110768l f318486j;

    /* renamed from: n */
    public int f318487n;

    /* renamed from: o */
    public int f318488o;

    /* renamed from: p */
    public int f318489p;

    /* renamed from: q */
    public boolean f318490q;

    /* renamed from: r */
    public boolean f318491r;

    /* renamed from: s */
    public boolean f318492s;

    /* renamed from: t */
    public Surface f318493t;

    /* renamed from: u */
    public long f318494u;

    /* renamed from: v */
    public boolean f318495v;

    /* renamed from: w */
    public C96875r0.C96876a f318496w;

    /* renamed from: x */
    public C96875r0.C96879e f318497x;

    /* renamed from: y */
    public C96875r0.C96877c f318498y;

    /* renamed from: z */
    public C96875r0.C96878d f318499z;

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView$a */
    public class C106587a implements C110763c {
        public C106587a() {
        }

        /* renamed from: a */
        public void mo128007a(int i, int i2, int i3) {
            Log.m105925i(VideoPlayerTextureView.this.f318484h, "video size changed size[%d, %d] degrees[%d]", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
            VideoPlayerTextureView.this.f318483J.mo153323c();
            VideoPlayerTextureView videoPlayerTextureView = VideoPlayerTextureView.this;
            videoPlayerTextureView.f318489p = i3;
            videoPlayerTextureView.f318488o = i;
            videoPlayerTextureView.f318487n = i2;
            videoPlayerTextureView.mo128672L();
            VideoPlayerTextureView videoPlayerTextureView2 = VideoPlayerTextureView.this;
            C96875r0.C96876a aVar = videoPlayerTextureView2.f318496w;
            if (aVar != null) {
                aVar.mo76226p3(videoPlayerTextureView2.f318488o, videoPlayerTextureView2.f318487n);
            }
        }

        public void onCompletion() {
            C96875r0.C96876a aVar = VideoPlayerTextureView.this.f318496w;
            if (aVar != null) {
                aVar.onCompletion();
            }
        }

        public void onError(int i, int i2) {
            C96875r0.C96876a aVar = VideoPlayerTextureView.this.f318496w;
            if (aVar != null) {
                aVar.onError(i, i2);
            }
        }

        public void onPrepared() {
            Log.m105925i(VideoPlayerTextureView.this.f318484h, "%s onPrepared, path:%s", Integer.valueOf(hashCode()), VideoPlayerTextureView.this.getVideoPath());
            VideoPlayerTextureView videoPlayerTextureView = VideoPlayerTextureView.this;
            videoPlayerTextureView.f318490q = true;
            videoPlayerTextureView.setMute(videoPlayerTextureView.f318491r);
            C96875r0.C96876a aVar = VideoPlayerTextureView.this.f318496w;
            if (aVar != null) {
                aVar.onPrepared();
            }
            VideoPlayerTextureView.this.requestLayout();
        }

        public void onSeekComplete() {
            VideoPlayerTextureView videoPlayerTextureView = VideoPlayerTextureView.this;
            C96875r0.C96877c cVar = videoPlayerTextureView.f318498y;
            if (cVar != null) {
                cVar.mo86881z(videoPlayerTextureView.f318492s);
            }
            VideoPlayerTextureView videoPlayerTextureView2 = VideoPlayerTextureView.this;
            if (!videoPlayerTextureView2.f318492s) {
                Log.m105924i(videoPlayerTextureView2.f318484h, "player seek done, but don't play now.");
                VideoPlayerTextureView.this.f318492s = true;
                return;
            }
            C110768l lVar = videoPlayerTextureView2.f318486j;
            if (lVar != null) {
                Log.m105919d(videoPlayerTextureView2.f318484h, "%s player seek done", lVar.mo162309d());
                VideoPlayerTextureView.this.f318486j.mo162319n();
            }
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView$b */
    public class C106588b implements TextureView.SurfaceTextureListener {
        public C106588b() {
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            VideoPlayerTextureView.this.mo152010F(surfaceTexture, i, i2);
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            VideoPlayerTextureView videoPlayerTextureView = VideoPlayerTextureView.this;
            Log.m105925i(videoPlayerTextureView.f318484h, "onSurfaceTextureDestroyed %d surface[%d] destroyed ", Integer.valueOf(videoPlayerTextureView.hashCode()), Integer.valueOf(surfaceTexture.hashCode()));
            VideoPlayerTextureView videoPlayerTextureView2 = VideoPlayerTextureView.this;
            videoPlayerTextureView2.mo153303J(videoPlayerTextureView2.f318493t);
            VideoPlayerTextureView videoPlayerTextureView3 = VideoPlayerTextureView.this;
            videoPlayerTextureView3.f318493t = null;
            videoPlayerTextureView3.f318477D = false;
            videoPlayerTextureView3.f318478E = false;
            if (videoPlayerTextureView3.f318486j == null) {
                videoPlayerTextureView3.f318477D = false;
            } else if (videoPlayerTextureView3.isPlaying()) {
                VideoPlayerTextureView videoPlayerTextureView4 = VideoPlayerTextureView.this;
                videoPlayerTextureView4.f318477D = true;
                videoPlayerTextureView4.f318486j.mo162311f();
            }
            return false;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            Log.m105919d(VideoPlayerTextureView.this.f318484h, "surface[%d] size changed [%d, %d]", Integer.valueOf(surfaceTexture.hashCode()), Integer.valueOf(i), Integer.valueOf(i2));
            VideoPlayerTextureView.this.mo128672L();
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            VideoPlayerTextureView.this.mo150035G(surfaceTexture);
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView$c */
    public class C106589c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Surface f318502d;

        public C106589c(Surface surface) {
            this.f318502d = surface;
        }

        public void run() {
            try {
                Surface surface = this.f318502d;
                if (surface != null && surface.isValid()) {
                    VideoPlayerTextureView videoPlayerTextureView = VideoPlayerTextureView.this;
                    Log.m105925i(videoPlayerTextureView.f318484h, "%d release surface [%d]", Integer.valueOf(videoPlayerTextureView.hashCode()), Integer.valueOf(this.f318502d.hashCode()));
                    this.f318502d.release();
                }
            } catch (Exception e) {
                Log.printErrStackTrace(VideoPlayerTextureView.this.f318484h, e, "release Surface error", new Object[0]);
            }
        }
    }

    public VideoPlayerTextureView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: E */
    public void mo153302E() {
        if (this.f318486j != null && this.f318490q && this.f318493t != null) {
            Log.m105925i(this.f318484h, "%d flush surface start ", Integer.valueOf(hashCode()));
            C110770m mVar = this.f318486j.f331337f;
            if (mVar != null && mVar.f331352l != null) {
                Log.m105925i("MicroMsg.VideoPlayerImpl", "%s player flush surface", mVar.mo162322a());
                mVar.f331352l.mo162306t(10);
                mVar.mo162323b(mVar.f331342b, SystemClock.elapsedRealtime(), 0);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00cd A[Catch:{ Exception -> 0x00d1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo152010F(android.graphics.SurfaceTexture r6, int r7, int r8) {
        /*
            r5 = this;
            java.lang.String r0 = r5.f318484h
            r1 = 5
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int r2 = r5.hashCode()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 0
            r1[r3] = r2
            int r2 = r6.hashCode()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4 = 1
            r1[r4] = r2
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r2 = 2
            r1[r2] = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            r8 = 3
            r1[r8] = r7
            boolean r7 = r5.f318477D
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r8 = 4
            r1[r8] = r7
            java.lang.String r7 = "handleOnSurfaceTextureAvailable %d surface[%d] available [%d, %d] pauseByDestroyed[%b]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r7, r1)
            r5.mo82024B()     // Catch:{ Exception -> 0x00d1 }
            android.view.Surface r7 = r5.f318493t     // Catch:{ Exception -> 0x00d1 }
            r5.mo153303J(r7)     // Catch:{ Exception -> 0x00d1 }
            boolean r7 = r5.f318480G     // Catch:{ all -> 0x0060 }
            if (r7 != 0) goto L_0x0044
            goto L_0x006a
        L_0x0044:
            android.graphics.SurfaceTexture r7 = r5.f318479F     // Catch:{ all -> 0x0060 }
            if (r7 != 0) goto L_0x0052
            java.lang.String r7 = r5.f318484h     // Catch:{ all -> 0x0060 }
            java.lang.String r8 = "first time to onSurfaceTextureAvailable"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r8)     // Catch:{ all -> 0x0060 }
            r5.f318479F = r6     // Catch:{ all -> 0x0060 }
            goto L_0x006a
        L_0x0052:
            java.lang.String r7 = r5.f318484h     // Catch:{ all -> 0x0060 }
            java.lang.String r8 = "video view onSurfaceTextureAvailable from detach to attach"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r8)     // Catch:{ all -> 0x0060 }
            android.graphics.SurfaceTexture r7 = r5.f318479F     // Catch:{ all -> 0x0060 }
            r5.setSurfaceTexture(r7)     // Catch:{ all -> 0x0060 }
            goto L_0x006a
        L_0x0060:
            r7 = move-exception
            java.lang.String r8 = r5.f318484h     // Catch:{ Exception -> 0x00d1 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x00d1 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r7)     // Catch:{ Exception -> 0x00d1 }
        L_0x006a:
            boolean r7 = r5.f318480G     // Catch:{ Exception -> 0x00d1 }
            if (r7 == 0) goto L_0x007c
            android.graphics.SurfaceTexture r7 = r5.f318479F     // Catch:{ Exception -> 0x00d1 }
            if (r7 == 0) goto L_0x007c
            android.view.Surface r6 = new android.view.Surface     // Catch:{ Exception -> 0x00d1 }
            android.graphics.SurfaceTexture r7 = r5.f318479F     // Catch:{ Exception -> 0x00d1 }
            r6.<init>(r7)     // Catch:{ Exception -> 0x00d1 }
            r5.f318493t = r6     // Catch:{ Exception -> 0x00d1 }
            goto L_0x0083
        L_0x007c:
            android.view.Surface r7 = new android.view.Surface     // Catch:{ Exception -> 0x00d1 }
            r7.<init>(r6)     // Catch:{ Exception -> 0x00d1 }
            r5.f318493t = r7     // Catch:{ Exception -> 0x00d1 }
        L_0x0083:
            java.lang.String r6 = r5.f318484h     // Catch:{ Exception -> 0x00d1 }
            java.lang.String r7 = "handleOnSurfaceTextureAvailable newSurface:%s"
            java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x00d1 }
            android.view.Surface r0 = r5.f318493t     // Catch:{ Exception -> 0x00d1 }
            int r0 = r0.hashCode()     // Catch:{ Exception -> 0x00d1 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x00d1 }
            r8[r3] = r0     // Catch:{ Exception -> 0x00d1 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r7, r8)     // Catch:{ Exception -> 0x00d1 }
            s62.l r6 = r5.f318486j     // Catch:{ Exception -> 0x00d1 }
            if (r6 == 0) goto L_0x00c3
            boolean r7 = r5.f318490q     // Catch:{ Exception -> 0x00d1 }
            if (r7 != 0) goto L_0x00a1
            goto L_0x00c3
        L_0x00a1:
            android.view.Surface r7 = r5.f318493t     // Catch:{ Exception -> 0x00d1 }
            r6.mo162307b(r7)     // Catch:{ Exception -> 0x00d1 }
            boolean r6 = r5.f318477D     // Catch:{ Exception -> 0x00d1 }
            if (r6 == 0) goto L_0x00b0
            s62.l r6 = r5.f318486j     // Catch:{ Exception -> 0x00d1 }
            r6.mo162319n()     // Catch:{ Exception -> 0x00d1 }
            goto L_0x00c0
        L_0x00b0:
            r5.f318478E = r4     // Catch:{ Exception -> 0x00d1 }
            r6 = 0
            r5.f318494u = r6     // Catch:{ Exception -> 0x00d1 }
            s62.l r6 = r5.f318486j     // Catch:{ Exception -> 0x00d1 }
            r6.mo162316k(r4)     // Catch:{ Exception -> 0x00d1 }
            s62.l r6 = r5.f318486j     // Catch:{ Exception -> 0x00d1 }
            r6.mo162319n()     // Catch:{ Exception -> 0x00d1 }
        L_0x00c0:
            r5.f318477D = r3     // Catch:{ Exception -> 0x00d1 }
            goto L_0x00c6
        L_0x00c3:
            r5.mo152011H()     // Catch:{ Exception -> 0x00d1 }
        L_0x00c6:
            r5.mo128672L()     // Catch:{ Exception -> 0x00d1 }
            com.tencent.mm.pluginsdk.ui.tools.r0$d r6 = r5.f318499z     // Catch:{ Exception -> 0x00d1 }
            if (r6 == 0) goto L_0x00dc
            r6.mo127239k()     // Catch:{ Exception -> 0x00d1 }
            goto L_0x00dc
        L_0x00d1:
            r6 = move-exception
            java.lang.String r7 = r5.f318484h
            java.lang.Object[] r8 = new java.lang.Object[r3]
            java.lang.String r0 = "onSurfaceTextureAvailable failed"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r6, r0, r8)
        L_0x00dc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.p133ui.tools.VideoPlayerTextureView.mo152010F(android.graphics.SurfaceTexture, int, int):void");
    }

    /* renamed from: G */
    public void mo150035G(SurfaceTexture surfaceTexture) {
        C110768l lVar;
        if (this.f318478E && this.f318494u > 0 && (lVar = this.f318486j) != null) {
            lVar.mo162311f();
            this.f318486j.mo162316k(this.f318491r);
            this.f318478E = false;
        }
        if (this.f318494u > 0 && this.f318497x != null) {
            Log.m105925i(this.f318484h, "%d notify surface update", Integer.valueOf(hashCode()));
            this.f318497x.mo79636r();
            this.f318497x = null;
        }
        this.f318494u = System.currentTimeMillis();
    }

    /* renamed from: H */
    public void mo152011H() {
        Log.m105925i(this.f318484h, "%d open video [%s] [%s]", Integer.valueOf(hashCode()), this.f318485i, this.f318493t);
        C110768l lVar = this.f318486j;
        if (lVar != null) {
            lVar.f331338g = null;
            lVar.mo162320o();
            this.f318486j.mo162313h();
            this.f318486j = null;
        }
        if (!Util.isNullOrNil(this.f318485i) && this.f318493t != null) {
            try {
                this.f318490q = false;
                this.f318486j = new C110768l(Looper.getMainLooper(), false, 0);
                if (!Util.isNullOrNil(this.f318485i)) {
                    this.f318486j.mo162318m(this.f318485i);
                }
                C110768l lVar2 = this.f318486j;
                C110762b bVar = this.f318474A;
                if (bVar != null) {
                    C110770m mVar = lVar2.f331337f;
                    if (mVar != null) {
                        mVar.f331352l.f331317g = bVar;
                    }
                } else {
                    lVar2.getClass();
                }
                this.f318486j.mo162317l(this.f318475B);
                this.f318486j.mo162315j(this.f318476C);
                C110768l lVar3 = this.f318486j;
                lVar3.f331338g = this.f318481H;
                Surface surface = this.f318493t;
                if (surface != null) {
                    C110770m mVar2 = lVar3.f331337f;
                    Log.m105925i("MicroMsg.VideoPlayerImpl", "%s set surface[%d] ", mVar2.mo162322a(), Integer.valueOf(surface.hashCode()));
                    mVar2.f331352l.f331370w = surface;
                }
                this.f318486j.f331337f.f331352l.getClass();
                if (this.f318493t != null) {
                    this.f318486j.mo162312g();
                } else if (this.f318495v) {
                    this.f318486j.mo162312g();
                }
            } catch (Exception e) {
                Log.printErrStackTrace(this.f318484h, e, "prepare async error %s", e.getMessage());
                C96875r0.C96876a aVar = this.f318496w;
                if (aVar != null) {
                    aVar.onError(-1, -1);
                }
            }
        } else {
            Log.m105929w(this.f318484h, "%d open video but path is null or mSurface is null", Integer.valueOf(hashCode()));
        }
    }

    /* renamed from: J */
    public void mo153303J(Surface surface) {
        String str = this.f318484h;
        StringBuilder sb = new StringBuilder();
        sb.append("releaseSurface() called with: needRelease = [");
        sb.append(surface);
        sb.append("]x@");
        sb.append(surface != null ? surface.hashCode() : 0);
        Log.m105918d(str, sb.toString());
        ((C119157j) C119157j.f356862d).mo183875f(new C106589c(surface));
    }

    /* renamed from: K */
    public void mo153304K() {
        SurfaceTexture surfaceTexture;
        Log.m105918d(this.f318484h, "releaseSurfaceTexture() called");
        try {
            if (!this.f318480G || (surfaceTexture = this.f318479F) == null) {
                return;
            }
            if (Build.VERSION.SDK_INT < 26) {
                surfaceTexture.release();
                this.f318479F = null;
            } else if (!surfaceTexture.isReleased()) {
                this.f318479F.release();
                this.f318479F = null;
            }
        } catch (Throwable th) {
            Log.m105920e(this.f318484h, th.toString());
        }
    }

    /* renamed from: L */
    public void mo128672L() {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 23 || layoutParams.getRule(13) != -1) {
            layoutParams.addRule(13);
            setLayoutParams(layoutParams);
        }
    }

    /* renamed from: a */
    public void mo24787a(double d, boolean z) {
        String str = this.f318484h;
        Object[] objArr = new Object[3];
        boolean z2 = false;
        objArr[0] = Integer.valueOf(hashCode());
        objArr[1] = Double.valueOf(d);
        if (this.f318486j == null) {
            z2 = true;
        }
        objArr[2] = Boolean.valueOf(z2);
        Log.m105925i(str, "%d seekTo:%f  play is null?[%b", objArr);
        this.f318492s = z;
        C110768l lVar = this.f318486j;
        if (lVar != null) {
            lVar.mo162314i((int) d, true);
        }
    }

    /* renamed from: d */
    public void mo24788d(double d) {
        mo24787a(d, true);
    }

    /* renamed from: e */
    public boolean mo24789e(Context context, boolean z) {
        return start();
    }

    public void finalize() {
        Surface surface = this.f318493t;
        if (surface != null && surface.isValid()) {
            this.f318493t.release();
        }
    }

    public int getCurrentPosition() {
        C110768l lVar = this.f318486j;
        if (lVar != null) {
            return lVar.mo162308c();
        }
        return 0;
    }

    public int getDuration() {
        C110768l lVar = this.f318486j;
        if (lVar != null) {
            return (int) lVar.f331337f.f331346f;
        }
        return 0;
    }

    public double getLastProgresstime() {
        return 0.0d;
    }

    public long getLastSurfaceUpdateTime() {
        return this.f318494u;
    }

    public String getVideoPath() {
        return this.f318485i;
    }

    public boolean isPlaying() {
        C110768l lVar = this.f318486j;
        if (lVar != null) {
            return lVar.mo162310e();
        }
        return false;
    }

    public void onDetach() {
    }

    public void onMeasure(int i, int i2) {
        Log.m105919d(this.f318484h, "onMeasure video size[%d, %d] spec[%d, %d]", Integer.valueOf(this.f318488o), Integer.valueOf(this.f318487n), Integer.valueOf(View.getDefaultSize(1, i)), Integer.valueOf(View.getDefaultSize(1, i2)));
        if (this.f318488o == 0 || this.f318487n == 0) {
            setMeasuredDimension(1, 1);
            return;
        }
        this.f318483J.mo153321a(View.getDefaultSize(1, i), View.getDefaultSize(1, i2), this.f318488o, this.f318487n);
        C106595z1 z1Var = this.f318483J;
        int i3 = z1Var.f318524g;
        int i4 = z1Var.f318525h;
        int i5 = this.f318489p;
        if (i5 == 90 || i5 == 270) {
            Matrix matrix = new Matrix();
            matrix.set(getMatrix());
            float f = (float) i3;
            float f2 = f / 2.0f;
            float f3 = (float) i4;
            float f4 = f3 / 2.0f;
            float f5 = f3 / f;
            if (!(getScaleX() == 1.0f && getScaleY() == 1.0f)) {
                matrix.setScale(getScaleX(), getScaleY(), f2, f4);
            }
            matrix.postRotate((float) this.f318489p, f2, f4);
            matrix.postScale(1.0f / f5, f5, f2, f4);
            setTransform(matrix);
        }
        setMeasuredDimension(i3, i4);
    }

    public void pause() {
        C110768l lVar = this.f318486j;
        if (lVar != null && lVar.mo162310e()) {
            this.f318486j.mo162311f();
        }
        this.f318477D = false;
        this.f318492s = false;
    }

    public void setForceScaleFullScreen(boolean z) {
        this.f318483J.f318518a = z;
    }

    public void setIOnlineCache(C110762b bVar) {
        this.f318474A = bVar;
    }

    public void setIsOnlineVideoType(boolean z) {
        this.f318476C = z;
        C110768l lVar = this.f318486j;
        if (lVar != null) {
            lVar.mo162315j(z);
        }
    }

    public void setLoop(boolean z) {
    }

    public void setMute(boolean z) {
        this.f318491r = z;
        try {
            if (this.f318486j != null) {
                Log.m105925i(this.f318484h, "%d set mute [%b]", Integer.valueOf(hashCode()), Boolean.valueOf(z));
                this.f318486j.mo162316k(z);
            }
        } catch (Exception unused) {
        }
    }

    public void setNeedOperateSurfaceTexture(boolean z) {
        this.f318480G = z;
    }

    public void setNeedResetExtractor(boolean z) {
        this.f318475B = z;
        C110768l lVar = this.f318486j;
        if (lVar != null) {
            lVar.mo162317l(z);
        }
    }

    public void setOnInfoCallback(C96875r0.C19571b bVar) {
    }

    public void setOnSeekCompleteCallback(C96875r0.C96877c cVar) {
        this.f318498y = cVar;
    }

    public void setOnSurfaceCallback(C96875r0.C96878d dVar) {
        this.f318499z = dVar;
    }

    public void setOneTimeVideoTextureUpdateCallback(C96875r0.C96879e eVar) {
        this.f318497x = eVar;
    }

    public void setOpenWithNoneSurface(boolean z) {
        this.f318495v = z;
    }

    public void setPlayProgressCallback(boolean z) {
    }

    public void setScaleType(C96814a.C96817e eVar) {
        if (this.f318483J.mo153324d(eVar)) {
            requestLayout();
        }
    }

    public void setThumb(Bitmap bitmap) {
    }

    public void setUseMp4Extrator(boolean z) {
    }

    public void setVideoCallback(C96875r0.C96876a aVar) {
        this.f318496w = aVar;
    }

    public void setVideoPath(String str) {
        Log.m105925i(this.f318484h, "%d set video path [%s]", Integer.valueOf(hashCode()), str);
        this.f318485i = str;
        mo152011H();
        requestLayout();
    }

    public boolean start() {
        if (this.f318486j == null || !this.f318490q) {
            String str = this.f318484h;
            Object[] objArr = new Object[3];
            objArr[0] = Integer.valueOf(hashCode());
            objArr[1] = Boolean.valueOf(this.f318486j == null);
            objArr[2] = Boolean.valueOf(this.f318490q);
            Log.m105929w(str, "%d player is null[%b] or it prepared [%b]", objArr);
            return false;
        }
        String str2 = this.f318484h;
        Object[] objArr2 = new Object[4];
        objArr2[0] = Integer.valueOf(hashCode());
        objArr2[1] = Boolean.valueOf(this.f318478E);
        objArr2[2] = Boolean.valueOf(this.f318477D);
        objArr2[3] = Boolean.valueOf(this.f318493t != null);
        Log.m105925i(str2, "%d player start pauseWhenUpdated[%b] pauseByDestroyed[%b] surface[%b]", objArr2);
        if (this.f318493t == null) {
            this.f318477D = true;
            return true;
        } else if (this.f318478E) {
            this.f318477D = true;
            this.f318478E = false;
            setMute(this.f318491r);
            return true;
        } else {
            this.f318486j.mo162319n();
            return true;
        }
    }

    public void stop() {
        Log.m105925i(this.f318484h, "%d player stop [%s]", Integer.valueOf(hashCode()), Util.getStack());
        C110768l lVar = this.f318486j;
        if (lVar != null) {
            lVar.f331338g = null;
            lVar.mo162320o();
            this.f318486j.mo162313h();
            this.f318486j = null;
        }
        this.f318489p = 0;
        this.f318487n = 0;
        this.f318488o = 0;
        this.f318483J.mo153323c();
        this.f318490q = false;
        this.f318485i = null;
        this.f318494u = 0;
    }

    public VideoPlayerTextureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f318484h = "MicroMsg.VideoPlayerTextureView@" + hashCode();
        this.f318489p = 0;
        this.f318490q = false;
        this.f318492s = true;
        this.f318494u = 0;
        this.f318495v = false;
        this.f318475B = false;
        this.f318476C = false;
        this.f318477D = false;
        this.f318478E = false;
        this.f318480G = false;
        this.f318481H = new C106587a();
        C106588b bVar = new C106588b();
        this.f318482I = bVar;
        this.f318483J = new C106595z1();
        this.f318488o = 0;
        this.f318487n = 0;
        setSurfaceTextureListener(bVar);
        setFocusable(true);
        setFocusableInTouchMode(true);
    }
}
