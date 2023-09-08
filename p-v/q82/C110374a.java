package q82;

import android.util.SparseArray;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentLinkedDeque;

/* renamed from: q82.a */
public final class C110374a implements Closeable {

    /* renamed from: d */
    public final SparseArray<ConcurrentLinkedDeque<WeakReference<byte[]>>> f330163d = new SparseArray<>();

    /* renamed from: e */
    public final SparseArray<ConcurrentLinkedDeque<WeakReference<ByteBuffer>>> f330164e = new SparseArray<>();

    /* renamed from: f */
    public int f330165f;

    /* renamed from: g */
    public int f330166g;

    /* renamed from: q82.a$a */
    public final class C110375a {

        /* renamed from: a */
        public final byte[] f330167a;

        /* renamed from: b */
        public final ByteBuffer f330168b;

        /* renamed from: c */
        public final int f330169c;

        /* renamed from: d */
        public final long f330170d;

        /* renamed from: e */
        public volatile boolean f330171e;

        /* renamed from: f */
        public volatile boolean f330172f;

        /* renamed from: g */
        public final /* synthetic */ C110374a f330173g;

        public C110375a(C110374a aVar, byte[] bArr, ByteBuffer byteBuffer, int i, C8480h hVar) {
            bArr = (i & 1) != 0 ? null : bArr;
            byteBuffer = (i & 2) != 0 ? null : byteBuffer;
            this.f330173g = aVar;
            this.f330167a = bArr;
            this.f330168b = byteBuffer;
            int i2 = byteBuffer != null ? 1 : 0;
            this.f330169c = i2;
            aVar.f330166g += i2;
            this.f330170d = System.currentTimeMillis();
            this.f330171e = true;
        }

        /* renamed from: a */
        public final byte[] mo161889a() {
            boolean z;
            if (System.currentTimeMillis() - this.f330170d <= 200) {
                z = this.f330171e;
            } else {
                mo161890b();
                z = false;
            }
            if (z) {
                return this.f330167a;
            }
            return null;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0031, code lost:
            return;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized void mo161890b() {
            /*
                r3 = this;
                monitor-enter(r3)
                boolean r0 = r3.f330172f     // Catch:{ all -> 0x0032 }
                if (r0 == 0) goto L_0x000e
                java.lang.String r0 = "MicroMsg.MTR.BufferManager"
                java.lang.String r1 = "already recyclered"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)     // Catch:{ all -> 0x0032 }
                monitor-exit(r3)
                return
            L_0x000e:
                q82.a r0 = r3.f330173g     // Catch:{ all -> 0x0032 }
                int r1 = r0.f330166g     // Catch:{ all -> 0x0032 }
                int r2 = r3.f330169c     // Catch:{ all -> 0x0032 }
                int r1 = r1 - r2
                r0.f330166g = r1     // Catch:{ all -> 0x0032 }
                r0 = 1
                r3.f330172f = r0     // Catch:{ all -> 0x0032 }
                r0 = 0
                r3.f330171e = r0     // Catch:{ all -> 0x0032 }
                byte[] r0 = r3.f330167a     // Catch:{ all -> 0x0032 }
                if (r0 == 0) goto L_0x0027
                q82.a r1 = r3.f330173g     // Catch:{ all -> 0x0032 }
                r1.mo161886c(r0)     // Catch:{ all -> 0x0032 }
                goto L_0x0030
            L_0x0027:
                java.nio.ByteBuffer r0 = r3.f330168b     // Catch:{ all -> 0x0032 }
                if (r0 == 0) goto L_0x0030
                q82.a r1 = r3.f330173g     // Catch:{ all -> 0x0032 }
                r1.mo161888d(r0)     // Catch:{ all -> 0x0032 }
            L_0x0030:
                monitor-exit(r3)
                return
            L_0x0032:
                r0 = move-exception
                monitor-exit(r3)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: q82.C110374a.C110375a.mo161890b():void");
        }
    }

    /* renamed from: a */
    public final void mo161884a(int i) {
        if (i == 0) {
            this.f330163d.clear();
        } else {
            this.f330163d.remove(i);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0026 A[EDGE_INSN: B:19:0x0026->B:11:0x0026 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final q82.C110374a.C110375a mo161885b(int r9) {
        /*
            r8 = this;
            android.util.SparseArray<java.util.concurrent.ConcurrentLinkedDeque<java.lang.ref.WeakReference<byte[]>>> r0 = r8.f330163d
            java.lang.Object r0 = r0.get(r9)
            java.util.concurrent.ConcurrentLinkedDeque r0 = (java.util.concurrent.ConcurrentLinkedDeque) r0
        L_0x0008:
            if (r0 == 0) goto L_0x0019
            java.lang.Object r1 = r0.poll()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            if (r1 == 0) goto L_0x0019
            java.lang.Object r1 = r1.get()
            byte[] r1 = (byte[]) r1
            goto L_0x001a
        L_0x0019:
            r1 = 0
        L_0x001a:
            if (r0 == 0) goto L_0x0021
            int r2 = r0.size()
            goto L_0x0022
        L_0x0021:
            r2 = 0
        L_0x0022:
            if (r2 <= 0) goto L_0x0026
            if (r1 == 0) goto L_0x0008
        L_0x0026:
            int r0 = r8.f330165f
            int r2 = r0 + 1
            r8.f330165f = r2
            int r0 = r0 % 200
            if (r0 != 0) goto L_0x003c
            java.lang.String r0 = "MicroMsg.MTR.BufferManager"
            java.lang.String r2 = "clear cache"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            android.util.SparseArray<java.util.concurrent.ConcurrentLinkedDeque<java.lang.ref.WeakReference<byte[]>>> r0 = r8.f330163d
            r0.clear()
        L_0x003c:
            q82.a$a r0 = new q82.a$a
            if (r1 != 0) goto L_0x0042
            byte[] r1 = new byte[r9]
        L_0x0042:
            r4 = r1
            r5 = 0
            r6 = 2
            r7 = 0
            r2 = r0
            r3 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q82.C110374a.mo161885b(int):q82.a$a");
    }

    /* renamed from: c */
    public final void mo161886c(byte[] bArr) {
        C87412m.m108594g(bArr, "buffer");
        if (this.f330163d.indexOfKey(bArr.length) < 0) {
            this.f330163d.put(bArr.length, new ConcurrentLinkedDeque());
        }
        ConcurrentLinkedDeque concurrentLinkedDeque = this.f330163d.get(bArr.length);
        if (concurrentLinkedDeque != null) {
            concurrentLinkedDeque.add(new WeakReference(bArr));
        }
    }

    public void close() {
        Log.m105924i("MicroMsg.MTR.BufferManager", "close");
        this.f330163d.clear();
    }

    /* renamed from: d */
    public final void mo161888d(ByteBuffer byteBuffer) {
        C87412m.m108594g(byteBuffer, "buffer");
        if (this.f330164e.indexOfKey(byteBuffer.capacity()) < 0) {
            this.f330164e.put(byteBuffer.capacity(), new ConcurrentLinkedDeque());
        }
        ConcurrentLinkedDeque concurrentLinkedDeque = this.f330164e.get(byteBuffer.capacity());
        if (concurrentLinkedDeque != null) {
            concurrentLinkedDeque.add(new WeakReference(byteBuffer));
        }
    }
}
