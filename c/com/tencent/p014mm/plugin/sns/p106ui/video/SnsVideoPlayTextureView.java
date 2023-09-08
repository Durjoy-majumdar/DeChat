package com.tencent.p014mm.plugin.sns.p106ui.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.Surface;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96875r0;
import com.tencent.p014mm.pluginsdk.p133ui.tools.VideoPlayerTextureView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.IXWebBroadcastListener;
import p206nj.C11171e;
import s62.C110762b;
import s62.C110768l;
import s62.C110770m;

/* renamed from: com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView */
public class SnsVideoPlayTextureView extends VideoPlayerTextureView {

    /* renamed from: K */
    public Object f316323K = new Object();

    public SnsVideoPlayTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x009d A[Catch:{ Exception -> 0x00a1 }] */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo152010F(android.graphics.SurfaceTexture r7, int r8, int r9) {
        /*
            r6 = this;
            java.lang.String r0 = "handleOnSurfaceTextureAvailable"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            r2 = 5
            java.lang.Object[] r2 = new java.lang.Object[r2]
            int r3 = r6.hashCode()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 0
            r2[r4] = r3
            int r3 = r7.hashCode()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5 = 1
            r2[r5] = r3
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r3 = 2
            r2[r3] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)
            r9 = 3
            r2[r9] = r8
            boolean r8 = r6.f318477D
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r9 = 4
            r2[r9] = r8
            java.lang.String r8 = "MicroMsg.Sns.SnsVideoPlayTextureView"
            java.lang.String r9 = "%d surface[%d] available [%d, %d] pauseByDestroyed[%b]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r9, r2)
            r6.mo82024B()     // Catch:{ Exception -> 0x00a1 }
            android.view.Surface r9 = new android.view.Surface     // Catch:{ Exception -> 0x00a1 }
            r9.<init>(r7)     // Catch:{ Exception -> 0x00a1 }
            r6.f318493t = r9     // Catch:{ Exception -> 0x00a1 }
            s62.l r7 = r6.f318486j     // Catch:{ Exception -> 0x00a1 }
            if (r7 == 0) goto L_0x0093
            boolean r2 = r6.f318490q     // Catch:{ Exception -> 0x00a1 }
            if (r2 != 0) goto L_0x0051
            goto L_0x0093
        L_0x0051:
            r7.mo162307b(r9)     // Catch:{ Exception -> 0x00a1 }
            r7 = 23
            boolean r7 = p206nj.C11171e.m11046c(r7)     // Catch:{ Exception -> 0x00a1 }
            if (r7 == 0) goto L_0x0077
            boolean r7 = r6.f318477D     // Catch:{ Exception -> 0x00a1 }
            if (r7 == 0) goto L_0x0066
            s62.l r7 = r6.f318486j     // Catch:{ Exception -> 0x00a1 }
            r7.mo162319n()     // Catch:{ Exception -> 0x00a1 }
            goto L_0x0090
        L_0x0066:
            r6.f318478E = r5     // Catch:{ Exception -> 0x00a1 }
            r2 = 0
            r6.f318494u = r2     // Catch:{ Exception -> 0x00a1 }
            s62.l r7 = r6.f318486j     // Catch:{ Exception -> 0x00a1 }
            r7.mo162316k(r5)     // Catch:{ Exception -> 0x00a1 }
            s62.l r7 = r6.f318486j     // Catch:{ Exception -> 0x00a1 }
            r7.mo162319n()     // Catch:{ Exception -> 0x00a1 }
            goto L_0x0090
        L_0x0077:
            boolean r7 = r6.f318477D     // Catch:{ Exception -> 0x00a1 }
            if (r7 == 0) goto L_0x0086
            s62.l r7 = r6.f318486j     // Catch:{ Exception -> 0x00a1 }
            int r7 = r7.mo162308c()     // Catch:{ Exception -> 0x00a1 }
            double r2 = (double) r7     // Catch:{ Exception -> 0x00a1 }
            r6.mo24787a(r2, r5)     // Catch:{ Exception -> 0x00a1 }
            goto L_0x0090
        L_0x0086:
            s62.l r7 = r6.f318486j     // Catch:{ Exception -> 0x00a1 }
            int r7 = r7.mo162308c()     // Catch:{ Exception -> 0x00a1 }
            double r2 = (double) r7     // Catch:{ Exception -> 0x00a1 }
            r6.mo24787a(r2, r4)     // Catch:{ Exception -> 0x00a1 }
        L_0x0090:
            r6.f318477D = r4     // Catch:{ Exception -> 0x00a1 }
            goto L_0x0096
        L_0x0093:
            r6.mo152011H()     // Catch:{ Exception -> 0x00a1 }
        L_0x0096:
            r6.mo128672L()     // Catch:{ Exception -> 0x00a1 }
            com.tencent.mm.pluginsdk.ui.tools.r0$d r7 = r6.f318499z     // Catch:{ Exception -> 0x00a1 }
            if (r7 == 0) goto L_0x00aa
            r7.mo127239k()     // Catch:{ Exception -> 0x00a1 }
            goto L_0x00aa
        L_0x00a1:
            r7 = move-exception
            java.lang.Object[] r9 = new java.lang.Object[r4]
            java.lang.String r2 = "onSurfaceTextureAvailable failed"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r7, r2, r9)
        L_0x00aa:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.video.SnsVideoPlayTextureView.mo152010F(android.graphics.SurfaceTexture, int, int):void");
    }

    /* renamed from: G */
    public void mo150035G(SurfaceTexture surfaceTexture) {
        SnsMethodCalculate.markStartTimeMs("handleOnSurfaceTextureUpdated", "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
        if (C11171e.m11046c(23) && this.f318478E && this.f318494u > 0) {
            C110768l lVar = this.f318486j;
            if (lVar != null) {
                lVar.mo162311f();
                this.f318486j.mo162316k(this.f318491r);
            }
            this.f318478E = false;
        }
        if (this.f318494u > 0 && this.f318497x != null) {
            Log.m105925i("MicroMsg.Sns.SnsVideoPlayTextureView", "%d notify surface update", Integer.valueOf(hashCode()));
            this.f318497x.mo79636r();
            this.f318497x = null;
        }
        this.f318494u = System.currentTimeMillis();
        SnsMethodCalculate.markEndTimeMs("handleOnSurfaceTextureUpdated", "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
    }

    /* renamed from: H */
    public void mo152011H() {
        SnsMethodCalculate.markStartTimeMs("openVideo", "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
        Log.m105925i("MicroMsg.Sns.SnsVideoPlayTextureView", "%d open video [%s]", Integer.valueOf(hashCode()), this.f318485i);
        synchronized (this.f316323K) {
            try {
                C110768l lVar = this.f318486j;
                if (lVar != null) {
                    lVar.f331338g = null;
                    lVar.mo162320o();
                    this.f318486j.mo162313h();
                    this.f318486j = null;
                }
                if (Util.isNullOrNil(this.f318485i)) {
                    Log.m105929w("MicroMsg.Sns.SnsVideoPlayTextureView", "%d open video but path is null.", Integer.valueOf(hashCode()));
                    SnsMethodCalculate.markEndTimeMs("openVideo", "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
                    return;
                }
                this.f318490q = false;
                C110768l lVar2 = new C110768l(Looper.getMainLooper(), false, 0);
                this.f318486j = lVar2;
                lVar2.mo162318m(this.f318485i);
                C110768l lVar3 = this.f318486j;
                C110762b bVar = this.f318474A;
                if (bVar != null) {
                    C110770m mVar = lVar3.f331337f;
                    if (mVar != null) {
                        mVar.f331352l.f331317g = bVar;
                    }
                } else {
                    lVar3.getClass();
                }
                this.f318486j.mo162317l(this.f318475B);
                this.f318486j.mo162315j(this.f318476C);
                C110768l lVar4 = this.f318486j;
                lVar4.f331338g = this.f318481H;
                Surface surface = this.f318493t;
                if (surface != null) {
                    C110770m mVar2 = lVar4.f331337f;
                    Log.m105925i("MicroMsg.VideoPlayerImpl", "%s set surface[%d] ", mVar2.mo162322a(), Integer.valueOf(surface.hashCode()));
                    mVar2.f331352l.f331370w = surface;
                }
                this.f318486j.f331337f.f331352l.getClass();
                if (this.f318493t != null) {
                    this.f318486j.mo162312g();
                } else if (this.f318495v) {
                    this.f318486j.mo162312g();
                }
                SnsMethodCalculate.markEndTimeMs("openVideo", "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.Sns.SnsVideoPlayTextureView", e, "prepare async error %s", e.getMessage());
                C96875r0.C96876a aVar = this.f318496w;
                if (aVar != null) {
                    aVar.onError(-1, -1);
                }
                SnsMethodCalculate.markEndTimeMs("openVideo", "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
            } catch (Throwable th) {
                while (true) {
                    SnsMethodCalculate.markEndTimeMs("openVideo", "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
                    throw th;
                }
            }
        }
    }

    /* renamed from: d */
    public void mo24788d(double d) {
        SnsMethodCalculate.markStartTimeMs("seekTo", "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
        synchronized (this.f316323K) {
            try {
                mo24787a(d, true);
            } catch (Throwable th) {
                while (true) {
                    SnsMethodCalculate.markEndTimeMs("seekTo", "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
                    throw th;
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("seekTo", "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
    }

    public void pause() {
        SnsMethodCalculate.markStartTimeMs("pause", "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
        synchronized (this.f316323K) {
            try {
                super.pause();
            } catch (Throwable th) {
                while (true) {
                    SnsMethodCalculate.markEndTimeMs("pause", "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
                    throw th;
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("pause", "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
    }

    public void setMute(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setMute", "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
        synchronized (this.f316323K) {
            try {
                super.setMute(z);
            } catch (Throwable th) {
                while (true) {
                    SnsMethodCalculate.markEndTimeMs("setMute", "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
                    throw th;
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("setMute", "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
    }

    public void setVideoPath(String str) {
        SnsMethodCalculate.markStartTimeMs("setVideoPath", "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
        super.setVideoPath(str);
        SnsMethodCalculate.markEndTimeMs("setVideoPath", "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
    }

    public boolean start() {
        boolean start;
        SnsMethodCalculate.markStartTimeMs(IXWebBroadcastListener.STAGE_START, "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
        synchronized (this.f316323K) {
            try {
                start = super.start();
            } catch (Throwable th) {
                while (true) {
                    SnsMethodCalculate.markEndTimeMs(IXWebBroadcastListener.STAGE_START, "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
                    throw th;
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs(IXWebBroadcastListener.STAGE_START, "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
        return start;
    }

    public void stop() {
        SnsMethodCalculate.markStartTimeMs("stop", "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
        synchronized (this.f316323K) {
            try {
                SnsMethodCalculate.markStartTimeMs("access$001", "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
                super.stop();
                SnsMethodCalculate.markEndTimeMs("access$001", "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
            } catch (Throwable th) {
                while (true) {
                    SnsMethodCalculate.markEndTimeMs("stop", "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
                    throw th;
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("stop", "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
    }

    public SnsVideoPlayTextureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
