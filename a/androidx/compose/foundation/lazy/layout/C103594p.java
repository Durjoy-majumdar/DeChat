package androidx.compose.foundation.lazy.layout;

import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import androidx.compose.foundation.lazy.layout.C103591o;
import gy3.C8480h;
import gy3.C87412m;
import p175j0.C108494d2;
import p175j0.C24725u1;
import p410k0.C108793e;
import p631o1.C109888w0;

/* renamed from: androidx.compose.foundation.lazy.layout.p */
public final class C103594p implements C24725u1, C103591o.C103593b, Runnable, Choreographer.FrameCallback {

    /* renamed from: q */
    public static long f305926q;

    /* renamed from: d */
    public final C103591o f305927d;

    /* renamed from: e */
    public final C109888w0 f305928e;

    /* renamed from: f */
    public final C103581i f305929f;

    /* renamed from: g */
    public final View f305930g;

    /* renamed from: h */
    public final C108793e<C103595a> f305931h = new C108793e<>(new C103595a[16], 0);

    /* renamed from: i */
    public long f305932i;

    /* renamed from: j */
    public long f305933j;

    /* renamed from: n */
    public boolean f305934n;

    /* renamed from: o */
    public final Choreographer f305935o = Choreographer.getInstance();

    /* renamed from: p */
    public boolean f305936p;

    /* renamed from: androidx.compose.foundation.lazy.layout.p$a */
    public static final class C103595a implements C103591o.C103592a {

        /* renamed from: a */
        public final int f305937a;

        /* renamed from: b */
        public final long f305938b;

        /* renamed from: c */
        public C109888w0.C109889a f305939c;

        /* renamed from: d */
        public boolean f305940d;

        public C103595a(int i, long j, C8480h hVar) {
            this.f305937a = i;
            this.f305938b = j;
        }

        public void cancel() {
            if (!this.f305940d) {
                this.f305940d = true;
                C109888w0.C109889a aVar = this.f305939c;
                if (aVar != null) {
                    aVar.dispose();
                }
                this.f305939c = null;
            }
        }
    }

    public C103594p(C103591o oVar, C109888w0 w0Var, C103581i iVar, View view) {
        C87412m.m108594g(oVar, "prefetchState");
        C87412m.m108594g(w0Var, "subcomposeLayoutState");
        C87412m.m108594g(iVar, "itemContentFactory");
        C87412m.m108594g(view, "view");
        this.f305927d = oVar;
        this.f305928e = w0Var;
        this.f305929f = iVar;
        this.f305930g = view;
        if (f305926q == 0) {
            Display display = view.getDisplay();
            float f = 60.0f;
            if (!view.isInEditMode() && display != null) {
                float refreshRate = display.getRefreshRate();
                if (refreshRate >= 30.0f) {
                    f = refreshRate;
                }
            }
            f305926q = (long) (((float) 1000000000) / f);
        }
    }

    /* renamed from: a */
    public C103591o.C103592a mo144574a(int i, long j) {
        C103595a aVar = new C103595a(i, j, (C8480h) null);
        this.f305931h.mo159860b(aVar);
        if (!this.f305934n) {
            this.f305934n = true;
            this.f305930g.post(this);
        }
        return aVar;
    }

    /* renamed from: b */
    public void mo51625b() {
    }

    /* renamed from: c */
    public void mo51626c() {
        ((C108494d2) this.f305927d.f305925a).setValue(this);
        this.f305936p = true;
    }

    /* renamed from: d */
    public void mo51627d() {
        this.f305936p = false;
        ((C108494d2) this.f305927d.f305925a).setValue(null);
        this.f305930g.removeCallbacks(this);
        this.f305935o.removeFrameCallback(this);
    }

    public void doFrame(long j) {
        if (this.f305936p) {
            this.f305930g.post(this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x007f A[Catch:{ all -> 0x00b4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ac A[Catch:{ all -> 0x00b4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d3 A[Catch:{ all -> 0x0110 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0108 A[Catch:{ all -> 0x0110 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r17 = this;
            r1 = r17
            k0.e<androidx.compose.foundation.lazy.layout.p$a> r0 = r1.f305931h
            boolean r0 = r0.mo159867i()
            r2 = 0
            if (r0 != 0) goto L_0x012c
            boolean r0 = r1.f305934n
            if (r0 == 0) goto L_0x012c
            boolean r0 = r1.f305936p
            if (r0 == 0) goto L_0x012c
            android.view.View r0 = r1.f305930g
            int r0 = r0.getWindowVisibility()
            if (r0 == 0) goto L_0x001d
            goto L_0x012c
        L_0x001d:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            android.view.View r3 = r1.f305930g
            long r3 = r3.getDrawingTime()
            long r3 = r0.toNanos(r3)
            long r5 = f305926q
            long r3 = r3 + r5
            r0 = 0
        L_0x002d:
            k0.e<androidx.compose.foundation.lazy.layout.p$a> r5 = r1.f305931h
            boolean r5 = r5.mo159868j()
            if (r5 == 0) goto L_0x0120
            if (r0 != 0) goto L_0x0120
            k0.e<androidx.compose.foundation.lazy.layout.p$a> r5 = r1.f305931h
            T[] r5 = r5.f325784d
            r5 = r5[r2]
            androidx.compose.foundation.lazy.layout.p$a r5 = (androidx.compose.foundation.lazy.layout.C103594p.C103595a) r5
            androidx.compose.foundation.lazy.layout.i r6 = r1.f305929f
            fy3.a<androidx.compose.foundation.lazy.layout.j> r6 = r6.f305902b
            java.lang.Object r6 = r6.invoke()
            androidx.compose.foundation.lazy.layout.j r6 = (androidx.compose.foundation.lazy.layout.C103583j) r6
            boolean r7 = r5.f305940d
            if (r7 != 0) goto L_0x0115
            int r7 = r6.getItemCount()
            int r8 = r5.f305937a
            if (r8 < 0) goto L_0x0059
            if (r8 >= r7) goto L_0x0059
            r7 = 1
            goto L_0x005a
        L_0x0059:
            r7 = 0
        L_0x005a:
            if (r7 != 0) goto L_0x005e
            goto L_0x0115
        L_0x005e:
            o1.w0$a r7 = r5.f305939c
            r10 = 4
            r11 = 0
            if (r7 != 0) goto L_0x00b9
            java.lang.String r7 = "compose:lazylist:prefetch:compose"
            android.os.Trace.beginSection(r7)
            long r13 = java.lang.System.nanoTime()     // Catch:{ all -> 0x00b4 }
            long r8 = r1.f305932i     // Catch:{ all -> 0x00b4 }
            int r15 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r15 > 0) goto L_0x007c
            long r8 = r8 + r13
            int r15 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r15 >= 0) goto L_0x007a
            goto L_0x007c
        L_0x007a:
            r8 = 0
            goto L_0x007d
        L_0x007c:
            r8 = 1
        L_0x007d:
            if (r8 == 0) goto L_0x00ac
            int r7 = r5.f305937a     // Catch:{ all -> 0x00b4 }
            java.lang.Object r6 = r6.mo75150f(r7)     // Catch:{ all -> 0x00b4 }
            androidx.compose.foundation.lazy.layout.i r7 = r1.f305929f     // Catch:{ all -> 0x00b4 }
            int r8 = r5.f305937a     // Catch:{ all -> 0x00b4 }
            fy3.p r7 = r7.mo144567a(r8, r6)     // Catch:{ all -> 0x00b4 }
            o1.w0 r8 = r1.f305928e     // Catch:{ all -> 0x00b4 }
            o1.w0$a r6 = r8.mo161197b(r6, r7)     // Catch:{ all -> 0x00b4 }
            r5.f305939c = r6     // Catch:{ all -> 0x00b4 }
            long r5 = java.lang.System.nanoTime()     // Catch:{ all -> 0x00b4 }
            long r5 = r5 - r13
            long r7 = r1.f305932i     // Catch:{ all -> 0x00b4 }
            int r9 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r9 != 0) goto L_0x00a1
            goto L_0x00a9
        L_0x00a1:
            long r9 = (long) r10     // Catch:{ all -> 0x00b4 }
            long r7 = r7 / r9
            r11 = 3
            long r11 = (long) r11     // Catch:{ all -> 0x00b4 }
            long r7 = r7 * r11
            long r5 = r5 / r9
            long r5 = r5 + r7
        L_0x00a9:
            r1.f305932i = r5     // Catch:{ all -> 0x00b4 }
            goto L_0x00ad
        L_0x00ac:
            r0 = 1
        L_0x00ad:
            rx3.b0 r5 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x00b4 }
            android.os.Trace.endSection()
            goto L_0x002d
        L_0x00b4:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
        L_0x00b9:
            java.lang.String r6 = "compose:lazylist:prefetch:measure"
            android.os.Trace.beginSection(r6)
            long r8 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0110 }
            long r13 = r1.f305933j     // Catch:{ all -> 0x0110 }
            int r6 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r6 > 0) goto L_0x00d0
            long r13 = r13 + r8
            int r6 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r6 >= 0) goto L_0x00ce
            goto L_0x00d0
        L_0x00ce:
            r6 = 0
            goto L_0x00d1
        L_0x00d0:
            r6 = 1
        L_0x00d1:
            if (r6 == 0) goto L_0x0108
            o1.w0$a r6 = r5.f305939c     // Catch:{ all -> 0x0110 }
            gy3.C87412m.m108591d(r6)     // Catch:{ all -> 0x0110 }
            int r7 = r6.mo161194b()     // Catch:{ all -> 0x0110 }
            r13 = 0
        L_0x00dd:
            if (r13 >= r7) goto L_0x00ea
            r15 = r3
            long r2 = r5.f305938b     // Catch:{ all -> 0x0110 }
            r6.mo161193a(r13, r2)     // Catch:{ all -> 0x0110 }
            int r13 = r13 + 1
            r3 = r15
            r2 = 0
            goto L_0x00dd
        L_0x00ea:
            r15 = r3
            long r2 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0110 }
            long r2 = r2 - r8
            long r4 = r1.f305933j     // Catch:{ all -> 0x0110 }
            int r6 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r6 != 0) goto L_0x00f7
            goto L_0x00ff
        L_0x00f7:
            long r6 = (long) r10     // Catch:{ all -> 0x0110 }
            long r4 = r4 / r6
            r8 = 3
            long r8 = (long) r8     // Catch:{ all -> 0x0110 }
            long r4 = r4 * r8
            long r2 = r2 / r6
            long r2 = r2 + r4
        L_0x00ff:
            r1.f305933j = r2     // Catch:{ all -> 0x0110 }
            k0.e<androidx.compose.foundation.lazy.layout.p$a> r2 = r1.f305931h     // Catch:{ all -> 0x0110 }
            r3 = 0
            r2.mo159871m(r3)     // Catch:{ all -> 0x0110 }
            goto L_0x010c
        L_0x0108:
            r15 = r3
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0110 }
            r0 = 1
        L_0x010c:
            android.os.Trace.endSection()
            goto L_0x011c
        L_0x0110:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
        L_0x0115:
            r15 = r3
            k0.e<androidx.compose.foundation.lazy.layout.p$a> r2 = r1.f305931h
            r3 = 0
            r2.mo159871m(r3)
        L_0x011c:
            r3 = r15
            r2 = 0
            goto L_0x002d
        L_0x0120:
            r3 = 0
            if (r0 == 0) goto L_0x0129
            android.view.Choreographer r0 = r1.f305935o
            r0.postFrameCallback(r1)
            goto L_0x012b
        L_0x0129:
            r1.f305934n = r3
        L_0x012b:
            return
        L_0x012c:
            r3 = 0
            r1.f305934n = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.C103594p.run():void");
    }
}
