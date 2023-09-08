package com.tencent.p014mm.pluginsdk.p133ui.tools;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.Surface;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96875r0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import p206nj.C11171e;
import s62.C110762b;
import s62.C110768l;
import s62.C110770m;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.SynchronizedVideoPlayTextureView */
public class SynchronizedVideoPlayTextureView extends VideoPlayerTextureView {

    /* renamed from: K */
    public final Object f318473K = new Object();

    public SynchronizedVideoPlayTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x009e A[Catch:{ Exception -> 0x00a2 }] */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo152010F(android.graphics.SurfaceTexture r8, int r9, int r10) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f318473K
            monitor-enter(r0)
            java.lang.String r1 = "MicroMsg.SynchronizedVideoPlayTextureView"
            java.lang.String r2 = "%d surface[%d] available [%d, %d] pauseByDestroyed[%b]"
            r3 = 5
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x00af }
            int r4 = r7.hashCode()     // Catch:{ all -> 0x00af }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x00af }
            r5 = 0
            r3[r5] = r4     // Catch:{ all -> 0x00af }
            int r4 = r8.hashCode()     // Catch:{ all -> 0x00af }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x00af }
            r6 = 1
            r3[r6] = r4     // Catch:{ all -> 0x00af }
            r4 = 2
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x00af }
            r3[r4] = r9     // Catch:{ all -> 0x00af }
            r9 = 3
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x00af }
            r3[r9] = r10     // Catch:{ all -> 0x00af }
            r9 = 4
            boolean r10 = r7.f318477D     // Catch:{ all -> 0x00af }
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)     // Catch:{ all -> 0x00af }
            r3[r9] = r10     // Catch:{ all -> 0x00af }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r3)     // Catch:{ all -> 0x00af }
            r7.mo82024B()     // Catch:{ Exception -> 0x00a2 }
            android.view.Surface r9 = r7.f318493t     // Catch:{ Exception -> 0x00a2 }
            r7.mo153303J(r9)     // Catch:{ Exception -> 0x00a2 }
            android.view.Surface r9 = new android.view.Surface     // Catch:{ Exception -> 0x00a2 }
            r9.<init>(r8)     // Catch:{ Exception -> 0x00a2 }
            r7.f318493t = r9     // Catch:{ Exception -> 0x00a2 }
            s62.l r8 = r7.f318486j     // Catch:{ Exception -> 0x00a2 }
            if (r8 == 0) goto L_0x0094
            boolean r10 = r7.f318490q     // Catch:{ Exception -> 0x00a2 }
            if (r10 != 0) goto L_0x0052
            goto L_0x0094
        L_0x0052:
            r8.mo162307b(r9)     // Catch:{ Exception -> 0x00a2 }
            r8 = 23
            boolean r8 = p206nj.C11171e.m11046c(r8)     // Catch:{ Exception -> 0x00a2 }
            if (r8 == 0) goto L_0x0078
            boolean r8 = r7.f318477D     // Catch:{ Exception -> 0x00a2 }
            if (r8 == 0) goto L_0x0067
            s62.l r8 = r7.f318486j     // Catch:{ Exception -> 0x00a2 }
            r8.mo162319n()     // Catch:{ Exception -> 0x00a2 }
            goto L_0x0091
        L_0x0067:
            r7.f318478E = r6     // Catch:{ Exception -> 0x00a2 }
            r8 = 0
            r7.f318494u = r8     // Catch:{ Exception -> 0x00a2 }
            s62.l r8 = r7.f318486j     // Catch:{ Exception -> 0x00a2 }
            r8.mo162316k(r6)     // Catch:{ Exception -> 0x00a2 }
            s62.l r8 = r7.f318486j     // Catch:{ Exception -> 0x00a2 }
            r8.mo162319n()     // Catch:{ Exception -> 0x00a2 }
            goto L_0x0091
        L_0x0078:
            boolean r8 = r7.f318477D     // Catch:{ Exception -> 0x00a2 }
            if (r8 == 0) goto L_0x0087
            s62.l r8 = r7.f318486j     // Catch:{ Exception -> 0x00a2 }
            int r8 = r8.mo162308c()     // Catch:{ Exception -> 0x00a2 }
            double r8 = (double) r8     // Catch:{ Exception -> 0x00a2 }
            r7.mo24787a(r8, r6)     // Catch:{ Exception -> 0x00a2 }
            goto L_0x0091
        L_0x0087:
            s62.l r8 = r7.f318486j     // Catch:{ Exception -> 0x00a2 }
            int r8 = r8.mo162308c()     // Catch:{ Exception -> 0x00a2 }
            double r8 = (double) r8     // Catch:{ Exception -> 0x00a2 }
            r7.mo24787a(r8, r5)     // Catch:{ Exception -> 0x00a2 }
        L_0x0091:
            r7.f318477D = r5     // Catch:{ Exception -> 0x00a2 }
            goto L_0x0097
        L_0x0094:
            r7.mo152011H()     // Catch:{ Exception -> 0x00a2 }
        L_0x0097:
            r7.mo128672L()     // Catch:{ Exception -> 0x00a2 }
            com.tencent.mm.pluginsdk.ui.tools.r0$d r8 = r7.f318499z     // Catch:{ Exception -> 0x00a2 }
            if (r8 == 0) goto L_0x00ad
            r8.mo127239k()     // Catch:{ Exception -> 0x00a2 }
            goto L_0x00ad
        L_0x00a2:
            r8 = move-exception
            java.lang.String r9 = "MicroMsg.SynchronizedVideoPlayTextureView"
            java.lang.String r10 = "onSurfaceTextureAvailable failed"
            java.lang.Object[] r1 = new java.lang.Object[r5]     // Catch:{ all -> 0x00af }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r9, r8, r10, r1)     // Catch:{ all -> 0x00af }
        L_0x00ad:
            monitor-exit(r0)     // Catch:{ all -> 0x00af }
            return
        L_0x00af:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00af }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.p133ui.tools.SynchronizedVideoPlayTextureView.mo152010F(android.graphics.SurfaceTexture, int, int):void");
    }

    /* renamed from: G */
    public void mo150035G(SurfaceTexture surfaceTexture) {
        synchronized (this.f318473K) {
            if (C11171e.m11046c(23) && this.f318478E && this.f318494u > 0) {
                C110768l lVar = this.f318486j;
                if (lVar != null) {
                    lVar.mo162311f();
                    this.f318486j.mo162316k(this.f318491r);
                }
                this.f318478E = false;
            }
            if (this.f318494u > 0 && this.f318497x != null) {
                Log.m105925i("MicroMsg.SynchronizedVideoPlayTextureView", "%d notify surface update", Integer.valueOf(hashCode()));
                this.f318497x.mo79636r();
                this.f318497x = null;
            }
            this.f318494u = System.currentTimeMillis();
        }
    }

    /* renamed from: H */
    public void mo152011H() {
        Log.m105925i("MicroMsg.SynchronizedVideoPlayTextureView", "%d open video [%s]", Integer.valueOf(hashCode()), this.f318485i);
        synchronized (this.f318473K) {
            C110768l lVar = this.f318486j;
            if (lVar != null) {
                lVar.f331338g = null;
                lVar.mo162320o();
                this.f318486j.mo162313h();
                this.f318486j = null;
            }
            if (Util.isNullOrNil(this.f318485i)) {
                Log.m105929w("MicroMsg.SynchronizedVideoPlayTextureView", "%d open video but path is null.", Integer.valueOf(hashCode()));
                return;
            }
            try {
                this.f318490q = false;
                C110768l lVar2 = new C110768l(Looper.getMainLooper(), false, getBusinessType());
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
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.SynchronizedVideoPlayTextureView", e, "prepare async error %s", e.getMessage());
                C96875r0.C96876a aVar = this.f318496w;
                if (aVar != null) {
                    aVar.onError(-1, -1);
                }
            }
        }
    }

    /* renamed from: d */
    public void mo24788d(double d) {
        synchronized (this.f318473K) {
            mo24787a(d, true);
        }
    }

    public int getBusinessType() {
        return 0;
    }

    public void pause() {
        synchronized (this.f318473K) {
            super.pause();
            this.f318492s = false;
        }
    }

    public void setMute(boolean z) {
        synchronized (this.f318473K) {
            super.setMute(z);
        }
    }

    public void setVideoPath(String str) {
        synchronized (this.f318473K) {
            super.setVideoPath(str);
        }
    }

    public boolean start() {
        boolean start;
        synchronized (this.f318473K) {
            this.f318492s = true;
            start = super.start();
        }
        return start;
    }

    public void stop() {
        synchronized (this.f318473K) {
            super.stop();
        }
    }

    public SynchronizedVideoPlayTextureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public SynchronizedVideoPlayTextureView(Context context) {
        super(context, (AttributeSet) null);
    }
}
