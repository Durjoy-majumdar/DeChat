package y11;

import android.util.SparseArray;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentLinkedDeque;

/* renamed from: y11.a */
public final class C112358a implements Closeable {

    /* renamed from: d */
    public final SparseArray<ConcurrentLinkedDeque<WeakReference<byte[]>>> f336385d = new SparseArray<>();

    /* renamed from: e */
    public final SparseArray<ConcurrentLinkedDeque<WeakReference<ByteBuffer>>> f336386e = new SparseArray<>();

    /* renamed from: f */
    public int f336387f;

    /* renamed from: y11.a$a */
    public final class C112359a {

        /* renamed from: a */
        public final byte[] f336388a;

        /* renamed from: b */
        public final ByteBuffer f336389b;

        /* renamed from: c */
        public final long f336390c;

        /* renamed from: d */
        public volatile boolean f336391d;

        /* renamed from: e */
        public volatile boolean f336392e;

        /* renamed from: f */
        public final /* synthetic */ C112358a f336393f;

        public C112359a(C112358a aVar, byte[] bArr, ByteBuffer byteBuffer, int i, C8480h hVar) {
            bArr = (i & 1) != 0 ? null : bArr;
            byteBuffer = (i & 2) != 0 ? null : byteBuffer;
            this.f336393f = aVar;
            this.f336388a = bArr;
            this.f336389b = byteBuffer;
            this.f336390c = System.currentTimeMillis();
            this.f336391d = true;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
            return;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized void mo164081a() {
            /*
                r2 = this;
                monitor-enter(r2)
                boolean r0 = r2.f336392e     // Catch:{ all -> 0x0029 }
                if (r0 == 0) goto L_0x000e
                java.lang.String r0 = "MicroMsg.MTR.BufferManager"
                java.lang.String r1 = "already recyclered"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)     // Catch:{ all -> 0x0029 }
                monitor-exit(r2)
                return
            L_0x000e:
                r0 = 1
                r2.f336392e = r0     // Catch:{ all -> 0x0029 }
                r0 = 0
                r2.f336391d = r0     // Catch:{ all -> 0x0029 }
                byte[] r0 = r2.f336388a     // Catch:{ all -> 0x0029 }
                if (r0 == 0) goto L_0x001e
                y11.a r1 = r2.f336393f     // Catch:{ all -> 0x0029 }
                r1.mo164078a(r0)     // Catch:{ all -> 0x0029 }
                goto L_0x0027
            L_0x001e:
                java.nio.ByteBuffer r0 = r2.f336389b     // Catch:{ all -> 0x0029 }
                if (r0 == 0) goto L_0x0027
                y11.a r1 = r2.f336393f     // Catch:{ all -> 0x0029 }
                r1.mo164079b(r0)     // Catch:{ all -> 0x0029 }
            L_0x0027:
                monitor-exit(r2)
                return
            L_0x0029:
                r0 = move-exception
                monitor-exit(r2)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: y11.C112358a.C112359a.mo164081a():void");
        }
    }

    /* renamed from: a */
    public final void mo164078a(byte[] bArr) {
        C87412m.m108594g(bArr, "buffer");
        if (this.f336385d.indexOfKey(bArr.length) < 0) {
            this.f336385d.put(bArr.length, new ConcurrentLinkedDeque());
        }
        ConcurrentLinkedDeque concurrentLinkedDeque = this.f336385d.get(bArr.length);
        if (concurrentLinkedDeque != null) {
            concurrentLinkedDeque.add(new WeakReference(bArr));
        }
    }

    /* renamed from: b */
    public final void mo164079b(ByteBuffer byteBuffer) {
        C87412m.m108594g(byteBuffer, "buffer");
        if (this.f336386e.indexOfKey(byteBuffer.capacity()) < 0) {
            this.f336386e.put(byteBuffer.capacity(), new ConcurrentLinkedDeque());
        }
        ConcurrentLinkedDeque concurrentLinkedDeque = this.f336386e.get(byteBuffer.capacity());
        if (concurrentLinkedDeque != null) {
            concurrentLinkedDeque.add(new WeakReference(byteBuffer));
        }
    }

    public void close() {
        Log.m105924i("MicroMsg.MTR.BufferManager", "close");
        this.f336385d.clear();
    }
}
