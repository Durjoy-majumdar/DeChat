package androidx.recyclerview.widget;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
import p834a3.C103302h;

/* renamed from: androidx.recyclerview.widget.o */
public final class C16661o implements Runnable {

    /* renamed from: h */
    public static final ThreadLocal<C16661o> f45001h = new ThreadLocal<>();

    /* renamed from: i */
    public static Comparator<C16664c> f45002i = new C16662a();

    /* renamed from: d */
    public ArrayList<RecyclerView> f45003d = new ArrayList<>();

    /* renamed from: e */
    public long f45004e;

    /* renamed from: f */
    public long f45005f;

    /* renamed from: g */
    public ArrayList<C16664c> f45006g = new ArrayList<>();

    /* renamed from: androidx.recyclerview.widget.o$a */
    public static class C16662a implements Comparator<C16664c> {
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
            if (r0 == null) goto L_0x0023;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
            if (r0 != false) goto L_0x0022;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int compare(java.lang.Object r7, java.lang.Object r8) {
            /*
                r6 = this;
                androidx.recyclerview.widget.o$c r7 = (androidx.recyclerview.widget.C16661o.C16664c) r7
                androidx.recyclerview.widget.o$c r8 = (androidx.recyclerview.widget.C16661o.C16664c) r8
                androidx.recyclerview.widget.RecyclerView r0 = r7.f45014d
                r1 = 1
                r2 = 0
                if (r0 != 0) goto L_0x000c
                r3 = 1
                goto L_0x000d
            L_0x000c:
                r3 = 0
            L_0x000d:
                androidx.recyclerview.widget.RecyclerView r4 = r8.f45014d
                if (r4 != 0) goto L_0x0013
                r4 = 1
                goto L_0x0014
            L_0x0013:
                r4 = 0
            L_0x0014:
                r5 = -1
                if (r3 == r4) goto L_0x001a
                if (r0 != 0) goto L_0x0022
                goto L_0x0023
            L_0x001a:
                boolean r0 = r7.f45011a
                boolean r3 = r8.f45011a
                if (r0 == r3) goto L_0x0025
                if (r0 == 0) goto L_0x0023
            L_0x0022:
                r1 = -1
            L_0x0023:
                r2 = r1
                goto L_0x0036
            L_0x0025:
                int r0 = r8.f45012b
                int r1 = r7.f45012b
                int r0 = r0 - r1
                if (r0 == 0) goto L_0x002e
                r2 = r0
                goto L_0x0036
            L_0x002e:
                int r7 = r7.f45013c
                int r8 = r8.f45013c
                int r7 = r7 - r8
                if (r7 == 0) goto L_0x0036
                r2 = r7
            L_0x0036:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C16661o.C16662a.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    /* renamed from: androidx.recyclerview.widget.o$b */
    public static class C16663b implements RecyclerView.LayoutManager.C16609c {

        /* renamed from: a */
        public int f45007a;

        /* renamed from: b */
        public int f45008b;

        /* renamed from: c */
        public int[] f45009c;

        /* renamed from: d */
        public int f45010d;

        /* renamed from: a */
        public void mo17525a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (i2 >= 0) {
                int i3 = this.f45010d * 2;
                int[] iArr = this.f45009c;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.f45009c = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i3 >= iArr.length) {
                    int[] iArr3 = new int[(i3 * 2)];
                    this.f45009c = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.f45009c;
                iArr4[i3] = i;
                iArr4[i3 + 1] = i2;
                this.f45010d++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }

        /* renamed from: b */
        public void mo17526b(RecyclerView recyclerView, boolean z) {
            boolean z2 = false;
            this.f45010d = 0;
            int[] iArr = this.f45009c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.LayoutManager layoutManager = recyclerView.f44782s;
            if (recyclerView.f44781r != null && layoutManager != null && layoutManager.isItemPrefetchEnabled()) {
                if (!z) {
                    if (!recyclerView.f44791z || recyclerView.f44728I || recyclerView.f44761g.mo17470g()) {
                        z2 = true;
                    }
                    if (!z2) {
                        layoutManager.collectAdjacentPrefetchPositions(this.f45007a, this.f45008b, recyclerView.f44752a1, this);
                    }
                } else if (!recyclerView.f44761g.mo17470g()) {
                    layoutManager.collectInitialPrefetchPositions(recyclerView.f44781r.getItemCount(), this);
                }
                int i = this.f45010d;
                if (i > layoutManager.mPrefetchMaxCountObserved) {
                    layoutManager.mPrefetchMaxCountObserved = i;
                    layoutManager.mPrefetchMaxObservedInInitialPrefetch = z;
                    recyclerView.f44757e.mo17350n();
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.o$c */
    public static class C16664c {

        /* renamed from: a */
        public boolean f45011a;

        /* renamed from: b */
        public int f45012b;

        /* renamed from: c */
        public int f45013c;

        /* renamed from: d */
        public RecyclerView f45014d;

        /* renamed from: e */
        public int f45015e;
    }

    /* renamed from: a */
    public void mo17520a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.f45004e == 0) {
            this.f45004e = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        C16663b bVar = recyclerView.f44751Z0;
        bVar.f45007a = i;
        bVar.f45008b = i2;
    }

    /* renamed from: b */
    public void mo17521b(long j) {
        C16664c cVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C16664c cVar2;
        int size = this.f45003d.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = this.f45003d.get(i2);
            if (recyclerView3.getWindowVisibility() == 0) {
                recyclerView3.f44751Z0.mo17526b(recyclerView3, false);
                i += recyclerView3.f44751Z0.f45010d;
            }
        }
        this.f45006g.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = this.f45003d.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                C16663b bVar = recyclerView4.f44751Z0;
                int abs = Math.abs(bVar.f45007a) + Math.abs(bVar.f45008b);
                for (int i5 = 0; i5 < bVar.f45010d * 2; i5 += 2) {
                    if (i3 >= this.f45006g.size()) {
                        cVar2 = new C16664c();
                        this.f45006g.add(cVar2);
                    } else {
                        cVar2 = this.f45006g.get(i3);
                    }
                    int[] iArr = bVar.f45009c;
                    int i6 = iArr[i5 + 1];
                    cVar2.f45011a = i6 <= abs;
                    cVar2.f45012b = abs;
                    cVar2.f45013c = i6;
                    cVar2.f45014d = recyclerView4;
                    cVar2.f45015e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(this.f45006g, f45002i);
        for (int i7 = 0; i7 < this.f45006g.size() && (recyclerView = cVar.f45014d) != null; i7++) {
            RecyclerView.C16631z c = mo17522c(recyclerView, (cVar = this.f45006g.get(i7)).f45015e, cVar.f45011a ? MAlarmHandler.NEXT_FIRE_INTERVAL : j);
            if (!(c == null || c.f44855e == null || !c.mo17368o() || c.mo17369p() || (recyclerView2 = c.f44855e.get()) == null)) {
                if (recyclerView2.f44728I && recyclerView2.f44763h.mo17493h() != 0) {
                    recyclerView2.mo17089i1();
                }
                C16663b bVar2 = recyclerView2.f44751Z0;
                bVar2.mo17526b(recyclerView2, true);
                if (bVar2.f45010d != 0) {
                    try {
                        int i8 = C103302h.f304582a;
                        Trace.beginSection("RV Nested Prefetch");
                        RecyclerView.C16628w wVar = recyclerView2.f44752a1;
                        RecyclerView.C16613e eVar = recyclerView2.f44781r;
                        wVar.f44835d = 1;
                        wVar.f44836e = eVar.getItemCount();
                        wVar.f44838g = false;
                        wVar.f44839h = false;
                        wVar.f44840i = false;
                        for (int i9 = 0; i9 < bVar2.f45010d * 2; i9 += 2) {
                            mo17522c(recyclerView2, bVar2.f45009c[i9], j);
                        }
                        Trace.endSection();
                    } catch (Throwable th) {
                        int i15 = C103302h.f304582a;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            cVar.f45011a = false;
            cVar.f45012b = 0;
            cVar.f45013c = 0;
            cVar.f45014d = null;
            cVar.f45015e = 0;
        }
    }

    /* renamed from: c */
    public final RecyclerView.C16631z mo17522c(RecyclerView recyclerView, int i, long j) {
        boolean z;
        int h = recyclerView.f44763h.mo17493h();
        int i2 = 0;
        while (true) {
            if (i2 >= h) {
                z = false;
                break;
            }
            RecyclerView.C16631z Q0 = RecyclerView.m15803Q0(recyclerView.f44763h.mo17492g(i2));
            if (Q0.f44856f == i && !Q0.mo17369p()) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            return null;
        }
        RecyclerView.C16625r rVar = recyclerView.f44757e;
        try {
            recyclerView.mo17040a1();
            RecyclerView.C16631z l = rVar.mo17348l(i, false, j);
            if (l != null) {
                if (!l.mo17368o() || l.mo17369p()) {
                    rVar.mo17337a(l, false);
                } else {
                    rVar.mo17344h(l.f44854d);
                }
            }
            return l;
        } finally {
            recyclerView.mo17042b1(false);
        }
    }

    public void run() {
        try {
            int i = C103302h.f304582a;
            Trace.beginSection("RV Prefetch");
            if (this.f45003d.isEmpty()) {
                this.f45004e = 0;
                Trace.endSection();
                return;
            }
            int size = this.f45003d.size();
            long j = 0;
            for (int i2 = 0; i2 < size; i2++) {
                RecyclerView recyclerView = this.f45003d.get(i2);
                if (recyclerView.getWindowVisibility() == 0) {
                    j = Math.max(recyclerView.getDrawingTime(), j);
                }
            }
            if (j == 0) {
                this.f45004e = 0;
                Trace.endSection();
                return;
            }
            mo17521b(TimeUnit.MILLISECONDS.toNanos(j) + this.f45005f);
            this.f45004e = 0;
            Trace.endSection();
        } catch (Throwable th) {
            this.f45004e = 0;
            int i3 = C103302h.f304582a;
            Trace.endSection();
            throw th;
        }
    }
}
