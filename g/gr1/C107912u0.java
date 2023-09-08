package gr1;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.HandlerThread;
import android.view.View;
import com.tencent.p014mm.plugin.finder.view.C105312o5;
import com.tencent.p014mm.plugin.finder.view.FinderVideoFrameView;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import rx3.C13598b0;
import te3.C64689rq2;

/* renamed from: gr1.u0 */
public final class C107912u0 implements C59664m2 {

    /* renamed from: a */
    public FinderVideoFrameView f323106a;

    /* renamed from: b */
    public C105312o5 f323107b;

    public C107912u0(Context context, C64689rq2 rq22) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(rq22, "media");
        FinderVideoFrameView finderVideoFrameView = new FinderVideoFrameView(context);
        this.f323106a = finderVideoFrameView;
        String str = rq22.f185266d;
        this.f323107b = new C105312o5(str == null ? "" : str, finderVideoFrameView.getTextureView());
    }

    /* renamed from: a */
    public void mo84652a(C32224a<C13598b0> aVar, C32224a<C13598b0> aVar2, C32226l<? super Long, C13598b0> lVar) {
        C87412m.m108594g(aVar, "onReady");
        C87412m.m108594g(aVar2, "onDestroy");
        C87412m.m108594g(lVar, "onSeekFrame");
        try {
            this.f323107b.mo149786d(aVar, aVar2, lVar);
        } catch (Exception e) {
            Log.printErrStackTrace("FinderNormalVideoCoverPreview", e, "", new Object[0]);
        }
    }

    public void destroy() {
        C105312o5 o5Var = this.f323107b;
        o5Var.mo149785c();
        o5Var.mo149783a().mo161388g();
        o5Var.mo149784b().mo161388g();
        HandlerThread handlerThread = o5Var.f312927j;
        if (handlerThread != null) {
            handlerThread.quit();
        } else {
            C87412m.m108603p("ht");
            throw null;
        }
    }

    public Bitmap getBitmap() {
        return this.f323106a.getTextureView().getBitmap();
    }

    public long getCurrentPositionMs() {
        return this.f323107b.f312929l;
    }

    public View getView() {
        return this.f323106a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0088  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void seekTo(long r13) {
        /*
            r12 = this;
            com.tencent.mm.plugin.finder.view.o5 r0 = r12.f323107b
            java.lang.Object r1 = r0.f312921d
            monitor-enter(r1)
            r0.f312929l = r13     // Catch:{ all -> 0x009b }
            oj.b r2 = r0.mo149784b()     // Catch:{ all -> 0x009b }
            long r3 = r0.f312929l     // Catch:{ all -> 0x009b }
            r5 = 1000(0x3e8, float:1.401E-42)
            long r5 = (long) r5     // Catch:{ all -> 0x009b }
            long r3 = r3 * r5
            r7 = 0
            r2.mo161389h(r3, r7)     // Catch:{ all -> 0x009b }
            oj.b r2 = r0.mo149784b()     // Catch:{ all -> 0x009b }
            long r2 = r2.mo161383b()     // Catch:{ all -> 0x009b }
            long r8 = r0.f312930m     // Catch:{ all -> 0x009b }
            int r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x003a
            long r8 = r0.f312931n     // Catch:{ all -> 0x009b }
            r10 = 0
            int r4 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r4 < 0) goto L_0x003a
            long r10 = r13 * r5
            int r4 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r4 >= 0) goto L_0x003a
            java.lang.String r13 = r0.f312920c     // Catch:{ all -> 0x009b }
            java.lang.String r14 = "lxl same taget~"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r14)     // Catch:{ all -> 0x009b }
            goto L_0x0084
        L_0x003a:
            r0.f312930m = r2     // Catch:{ all -> 0x009b }
            oj.b r2 = r0.mo149783a()     // Catch:{ all -> 0x009b }
            long r3 = r0.f312929l     // Catch:{ all -> 0x009b }
            long r3 = r3 * r5
            r2.mo161389h(r3, r7)     // Catch:{ all -> 0x009b }
            boolean r2 = r0.f312933p     // Catch:{ all -> 0x009b }
            if (r2 == 0) goto L_0x0059
            android.media.MediaCodec r2 = r0.f312924g     // Catch:{ all -> 0x009b }
            if (r2 == 0) goto L_0x0052
            r2.flush()     // Catch:{ all -> 0x009b }
        L_0x0052:
            android.media.MediaCodec r2 = r0.f312924g     // Catch:{ all -> 0x009b }
            if (r2 == 0) goto L_0x0059
            r2.start()     // Catch:{ all -> 0x009b }
        L_0x0059:
            java.lang.String r2 = r0.f312920c     // Catch:{ all -> 0x009b }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x009b }
            r3.<init>()     // Catch:{ all -> 0x009b }
            java.lang.String r4 = "lxl change taget, start sync time:"
            r3.append(r4)     // Catch:{ all -> 0x009b }
            long r7 = r0.f312930m     // Catch:{ all -> 0x009b }
            long r7 = r7 / r5
            r3.append(r7)     // Catch:{ all -> 0x009b }
            java.lang.String r4 = ", target time:"
            r3.append(r4)     // Catch:{ all -> 0x009b }
            r3.append(r13)     // Catch:{ all -> 0x009b }
            java.lang.String r13 = ", flush:"
            r3.append(r13)     // Catch:{ all -> 0x009b }
            boolean r13 = r0.f312933p     // Catch:{ all -> 0x009b }
            r3.append(r13)     // Catch:{ all -> 0x009b }
            java.lang.String r13 = r3.toString()     // Catch:{ all -> 0x009b }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r13)     // Catch:{ all -> 0x009b }
        L_0x0084:
            boolean r13 = r0.f312933p     // Catch:{ all -> 0x009b }
            if (r13 != 0) goto L_0x0092
            android.media.MediaCodec r13 = r0.f312924g     // Catch:{ all -> 0x009b }
            if (r13 == 0) goto L_0x008f
            r13.start()     // Catch:{ all -> 0x009b }
        L_0x008f:
            r13 = 1
            r0.f312933p = r13     // Catch:{ all -> 0x009b }
        L_0x0092:
            java.lang.Object r13 = r0.f312921d     // Catch:{ all -> 0x009b }
            r13.notify()     // Catch:{ all -> 0x009b }
            rx3.b0 r13 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x009b }
            monitor-exit(r1)
            return
        L_0x009b:
            r13 = move-exception
            monitor-exit(r1)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: gr1.C107912u0.seekTo(long):void");
    }
}
