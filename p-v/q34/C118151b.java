package q34;

import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import java.util.concurrent.atomic.AtomicLong;
import l34.C117454g;

/* renamed from: q34.b */
public final class C118151b extends AtomicLong implements C117454g {

    /* renamed from: d */
    public boolean f353174d;

    /* renamed from: e */
    public volatile boolean f353175e;

    /* renamed from: f */
    public Throwable f353176f;

    /* renamed from: g */
    public final C118152a f353177g;

    /* renamed from: q34.b$a */
    public interface C118152a {
    }

    public C118151b(C118152a aVar) {
        this.f353177g = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:107:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r5 = r14.f353177g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0014, code lost:
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0015, code lost:
        r9 = (r2 > 0 ? 1 : (r2 == 0 ? 0 : -1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0019, code lost:
        if (r9 > 0) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001b, code lost:
        if (r1 == false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001d, code lost:
        if (r1 == false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x001f, code lost:
        r10 = (o34.C117670o.C117671a) r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0028, code lost:
        if (r10.f351963h.peek() != null) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r1 = r14.f353176f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002c, code lost:
        if (r1 == null) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002e, code lost:
        r10.f351965j.onError(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0034, code lost:
        r10.f351965j.mo122780a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003b, code lost:
        r2 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003e, code lost:
        if (r9 != 0) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r9 = (o34.C117670o.C117671a) r5;
        r10 = r9.f351963h.poll();
        r11 = r9.f351964i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004c, code lost:
        if (r11 == null) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004e, code lost:
        if (r10 == null) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0050, code lost:
        r11.incrementAndGet();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0053, code lost:
        if (r10 != null) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0055, code lost:
        monitor-enter(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r1 = r14.f353175e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0061, code lost:
        if (((o34.C117670o.C117671a) r5).f351963h.peek() == null) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0063, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0065, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0071, code lost:
        if (get() != com.tencent.p014mm.sdk.platformtools.MAlarmHandler.NEXT_FIRE_INTERVAL) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0073, code lost:
        if (r2 != false) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0075, code lost:
        if (r1 != false) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r14.f353174d = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0079, code lost:
        monitor-exit(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x007a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x007b, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x007c, code lost:
        r2 = r14;
        r0 = r1;
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0080, code lost:
        r2 = Long.MAX_VALUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        r9 = addAndGet((long) (-r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x008a, code lost:
        if (r9 == 0) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x008c, code lost:
        if (r2 != false) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x008e, code lost:
        if (r1 == false) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0090, code lost:
        if (r2 == false) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0093, code lost:
        r2 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0094, code lost:
        monitor-exit(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        r14.f353174d = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0099, code lost:
        monitor-exit(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x009a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x009b, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x009c, code lost:
        r1 = false;
        r2 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00a0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00a1, code lost:
        r13 = r1;
        r1 = r0;
        r0 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00a5, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00af, code lost:
        if (r9.f351968p.mo182372a(r9.f351965j, r10) == false) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00b1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00b2, code lost:
        r2 = r2 - 1;
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x00b9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x00ba, code lost:
        r1 = r0;
        r2 = r14;
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x00bd, code lost:
        if (r0 == false) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x00bf, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        r2.f353174d = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000d, code lost:
        r2 = get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x00c7, code lost:
        throw r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00bf  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo182948a() {
        /*
            r14 = this;
            monitor-enter(r14)
            boolean r0 = r14.f353174d     // Catch:{ all -> 0x00c8 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r14)     // Catch:{ all -> 0x00c8 }
            return
        L_0x0007:
            r0 = 1
            r14.f353174d = r0     // Catch:{ all -> 0x00c8 }
            boolean r1 = r14.f353175e     // Catch:{ all -> 0x00c8 }
            monitor-exit(r14)     // Catch:{ all -> 0x00c8 }
            long r2 = r14.get()
            r4 = 0
            q34.b$a r5 = r14.f353177g     // Catch:{ all -> 0x00b9 }
        L_0x0014:
            r6 = 0
        L_0x0015:
            r7 = 0
            int r9 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r9 > 0) goto L_0x001d
            if (r1 == 0) goto L_0x0055
        L_0x001d:
            if (r1 == 0) goto L_0x0041
            r10 = r5
            o34.o$a r10 = (o34.C117670o.C117671a) r10     // Catch:{ all -> 0x00b9 }
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Object> r11 = r10.f351963h     // Catch:{ all -> 0x00b9 }
            java.lang.Object r11 = r11.peek()     // Catch:{ all -> 0x00b9 }
            if (r11 != 0) goto L_0x003e
            java.lang.Throwable r1 = r14.f353176f     // Catch:{ all -> 0x003a }
            if (r1 == 0) goto L_0x0034
            l34.j<? super T> r2 = r10.f351965j     // Catch:{ all -> 0x003a }
            r2.onError(r1)     // Catch:{ all -> 0x003a }
            goto L_0x0039
        L_0x0034:
            l34.j<? super T> r1 = r10.f351965j     // Catch:{ all -> 0x003a }
            r1.mo122780a()     // Catch:{ all -> 0x003a }
        L_0x0039:
            return
        L_0x003a:
            r1 = move-exception
            r2 = r14
            goto L_0x00bd
        L_0x003e:
            if (r9 != 0) goto L_0x0041
            goto L_0x0055
        L_0x0041:
            r9 = r5
            o34.o$a r9 = (o34.C117670o.C117671a) r9     // Catch:{ all -> 0x00b9 }
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Object> r10 = r9.f351963h     // Catch:{ all -> 0x00b9 }
            java.lang.Object r10 = r10.poll()     // Catch:{ all -> 0x00b9 }
            java.util.concurrent.atomic.AtomicLong r11 = r9.f351964i     // Catch:{ all -> 0x00b9 }
            if (r11 == 0) goto L_0x0053
            if (r10 == 0) goto L_0x0053
            r11.incrementAndGet()     // Catch:{ all -> 0x00b9 }
        L_0x0053:
            if (r10 != 0) goto L_0x00a7
        L_0x0055:
            monitor-enter(r14)     // Catch:{ all -> 0x00b9 }
            boolean r1 = r14.f353175e     // Catch:{ all -> 0x009b }
            r2 = r5
            o34.o$a r2 = (o34.C117670o.C117671a) r2     // Catch:{ all -> 0x009b }
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Object> r2 = r2.f351963h     // Catch:{ all -> 0x009b }
            java.lang.Object r2 = r2.peek()     // Catch:{ all -> 0x009b }
            if (r2 == 0) goto L_0x0065
            r2 = 1
            goto L_0x0066
        L_0x0065:
            r2 = 0
        L_0x0066:
            long r9 = r14.get()     // Catch:{ all -> 0x009b }
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 != 0) goto L_0x0082
            if (r2 != 0) goto L_0x0080
            if (r1 != 0) goto L_0x0080
            r14.f353174d = r4     // Catch:{ all -> 0x007b }
            monitor-exit(r14)     // Catch:{ all -> 0x007b }
            return
        L_0x007b:
            r1 = move-exception
            r2 = r14
            r0 = r1
            r1 = 1
            goto L_0x009e
        L_0x0080:
            r2 = r11
            goto L_0x0094
        L_0x0082:
            int r3 = -r6
            long r9 = (long) r3
            long r9 = r14.addAndGet(r9)     // Catch:{ all -> 0x009b }
            int r3 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x008e
            if (r2 != 0) goto L_0x0093
        L_0x008e:
            if (r1 == 0) goto L_0x0097
            if (r2 == 0) goto L_0x0093
            goto L_0x0097
        L_0x0093:
            r2 = r9
        L_0x0094:
            monitor-exit(r14)     // Catch:{ all -> 0x009b }
            goto L_0x0014
        L_0x0097:
            r14.f353174d = r4     // Catch:{ all -> 0x007b }
            monitor-exit(r14)     // Catch:{ all -> 0x007b }
            return
        L_0x009b:
            r0 = move-exception
            r1 = 0
            r2 = r14
        L_0x009e:
            monitor-exit(r2)     // Catch:{ all -> 0x00a5 }
            throw r0     // Catch:{ all -> 0x00a0 }
        L_0x00a0:
            r0 = move-exception
            r13 = r1
            r1 = r0
            r0 = r13
            goto L_0x00bd
        L_0x00a5:
            r0 = move-exception
            goto L_0x009e
        L_0x00a7:
            o34.d<T> r7 = r9.f351968p     // Catch:{ all -> 0x00b9 }
            l34.j<? super T> r8 = r9.f351965j     // Catch:{ all -> 0x00b9 }
            boolean r7 = r7.mo182372a(r8, r10)     // Catch:{ all -> 0x00b9 }
            if (r7 == 0) goto L_0x00b2
            return
        L_0x00b2:
            r7 = 1
            long r2 = r2 - r7
            int r6 = r6 + 1
            goto L_0x0015
        L_0x00b9:
            r0 = move-exception
            r1 = r0
            r2 = r14
            r0 = 0
        L_0x00bd:
            if (r0 != 0) goto L_0x00c7
            monitor-enter(r2)
            r2.f353174d = r4     // Catch:{ all -> 0x00c4 }
            monitor-exit(r2)     // Catch:{ all -> 0x00c4 }
            goto L_0x00c7
        L_0x00c4:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00c4 }
            throw r0
        L_0x00c7:
            throw r1
        L_0x00c8:
            r0 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x00c8 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q34.C118151b.mo182948a():void");
    }

    /* renamed from: b */
    public void mo182949b(Throwable th) {
        if (!this.f353175e) {
            this.f353176f = th;
            this.f353175e = true;
            mo182948a();
        }
    }

    /* renamed from: h */
    public void mo123768h(long j) {
        boolean z;
        if (j != 0) {
            while (true) {
                long j2 = get();
                boolean z2 = true;
                z = j2 == 0;
                long j3 = MAlarmHandler.NEXT_FIRE_INTERVAL;
                if (j2 == MAlarmHandler.NEXT_FIRE_INTERVAL) {
                    break;
                }
                if (j == MAlarmHandler.NEXT_FIRE_INTERVAL) {
                    j3 = j;
                } else {
                    if (j2 <= MAlarmHandler.NEXT_FIRE_INTERVAL - j) {
                        j3 = j2 + j;
                    }
                    z2 = z;
                }
                if (compareAndSet(j2, j3)) {
                    z = z2;
                    break;
                }
            }
            if (z) {
                mo182948a();
            }
        }
    }
}
