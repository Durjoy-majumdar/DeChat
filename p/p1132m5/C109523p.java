package p1132m5;

import android.graphics.Bitmap;
import coil.memory.MemoryCache$Key;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import p1132m5.C109518n;
import p864t5.C110908h;
import sx3.C110818d0;

/* renamed from: m5.p */
public final class C109523p implements C109530u {

    /* renamed from: a */
    public final HashMap<MemoryCache$Key, ArrayList<C109525b>> f327797a = new HashMap<>();

    /* renamed from: b */
    public int f327798b;

    /* renamed from: m5.p$a */
    public static final class C109524a implements C109518n.C109519a {

        /* renamed from: a */
        public final Bitmap f327799a;

        /* renamed from: b */
        public final boolean f327800b;

        public C109524a(Bitmap bitmap, boolean z) {
            C87412m.m108594g(bitmap, "bitmap");
            this.f327799a = bitmap;
            this.f327800b = z;
        }

        /* renamed from: a */
        public boolean mo160745a() {
            return this.f327800b;
        }

        public Bitmap getBitmap() {
            return this.f327799a;
        }
    }

    /* renamed from: m5.p$b */
    public static final class C109525b {

        /* renamed from: a */
        public final int f327801a;

        /* renamed from: b */
        public final WeakReference<Bitmap> f327802b;

        /* renamed from: c */
        public final boolean f327803c;

        /* renamed from: d */
        public final int f327804d;

        public C109525b(int i, WeakReference<Bitmap> weakReference, boolean z, int i2) {
            C87412m.m108594g(weakReference, "bitmap");
            this.f327801a = i;
            this.f327802b = weakReference;
            this.f327803c = z;
            this.f327804d = i2;
        }
    }

    public C109523p(C110908h hVar) {
    }

    /* renamed from: a */
    public synchronized void mo160734a(int i) {
        if (i >= 10 && i != 20) {
            mo160747e();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004d, code lost:
        return r0;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized p1132m5.C109518n.C109519a mo160735b(coil.memory.MemoryCache$Key r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.lang.String r0 = "key"
            gy3.C87412m.m108594g(r7, r0)     // Catch:{ all -> 0x004e }
            java.util.HashMap<coil.memory.MemoryCache$Key, java.util.ArrayList<m5.p$b>> r0 = r6.f327797a     // Catch:{ all -> 0x004e }
            java.lang.Object r7 = r0.get(r7)     // Catch:{ all -> 0x004e }
            java.util.ArrayList r7 = (java.util.ArrayList) r7     // Catch:{ all -> 0x004e }
            r0 = 0
            if (r7 != 0) goto L_0x0013
            monitor-exit(r6)
            return r0
        L_0x0013:
            r1 = 0
            int r2 = r7.size()     // Catch:{ all -> 0x004e }
            int r2 = r2 + -1
            if (r2 < 0) goto L_0x003f
        L_0x001c:
            int r3 = r1 + 1
            java.lang.Object r1 = r7.get(r1)     // Catch:{ all -> 0x004e }
            m5.p$b r1 = (p1132m5.C109523p.C109525b) r1     // Catch:{ all -> 0x004e }
            java.lang.ref.WeakReference<android.graphics.Bitmap> r4 = r1.f327802b     // Catch:{ all -> 0x004e }
            java.lang.Object r4 = r4.get()     // Catch:{ all -> 0x004e }
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4     // Catch:{ all -> 0x004e }
            if (r4 != 0) goto L_0x0030
            r5 = r0
            goto L_0x0037
        L_0x0030:
            m5.p$a r5 = new m5.p$a     // Catch:{ all -> 0x004e }
            boolean r1 = r1.f327803c     // Catch:{ all -> 0x004e }
            r5.<init>(r4, r1)     // Catch:{ all -> 0x004e }
        L_0x0037:
            if (r5 != 0) goto L_0x003e
            if (r3 <= r2) goto L_0x003c
            goto L_0x003f
        L_0x003c:
            r1 = r3
            goto L_0x001c
        L_0x003e:
            r0 = r5
        L_0x003f:
            int r7 = r6.f327798b     // Catch:{ all -> 0x004e }
            int r1 = r7 + 1
            r6.f327798b = r1     // Catch:{ all -> 0x004e }
            r1 = 10
            if (r7 < r1) goto L_0x004c
            r6.mo160747e()     // Catch:{ all -> 0x004e }
        L_0x004c:
            monitor-exit(r6)
            return r0
        L_0x004e:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p1132m5.C109523p.mo160735b(coil.memory.MemoryCache$Key):m5.n$a");
    }

    /* renamed from: c */
    public synchronized void mo160736c(MemoryCache$Key memoryCache$Key, Bitmap bitmap, boolean z, int i) {
        C87412m.m108594g(memoryCache$Key, "key");
        C87412m.m108594g(bitmap, "bitmap");
        HashMap<MemoryCache$Key, ArrayList<C109525b>> hashMap = this.f327797a;
        ArrayList<C109525b> arrayList = hashMap.get(memoryCache$Key);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            hashMap.put(memoryCache$Key, arrayList);
        }
        ArrayList arrayList2 = arrayList;
        int identityHashCode = System.identityHashCode(bitmap);
        C109525b bVar = new C109525b(identityHashCode, new WeakReference(bitmap), z, i);
        int i2 = 0;
        int size = arrayList2.size() - 1;
        if (size >= 0) {
            while (true) {
                int i3 = i2 + 1;
                Object obj = arrayList2.get(i2);
                C87412m.m108593f(obj, "values[index]");
                C109525b bVar2 = (C109525b) obj;
                if (i >= bVar2.f327804d) {
                    if (bVar2.f327801a == identityHashCode && bVar2.f327802b.get() == bitmap) {
                        arrayList2.set(i2, bVar);
                    } else {
                        arrayList2.add(i2, bVar);
                    }
                } else if (i3 > size) {
                    break;
                } else {
                    i2 = i3;
                }
            }
        }
        arrayList2.add(bVar);
        int i4 = this.f327798b;
        this.f327798b = i4 + 1;
        if (i4 >= 10) {
            mo160747e();
        }
    }

    /* renamed from: d */
    public synchronized boolean mo160737d(Bitmap bitmap) {
        boolean z;
        C87412m.m108594g(bitmap, "bitmap");
        int identityHashCode = System.identityHashCode(bitmap);
        Collection<ArrayList<C109525b>> values = this.f327797a.values();
        C87412m.m108593f(values, "cache.values");
        Iterator<T> it = values.iterator();
        loop0:
        while (true) {
            z = false;
            if (!it.hasNext()) {
                break;
            }
            ArrayList arrayList = (ArrayList) it.next();
            int size = arrayList.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i = (z ? 1 : 0) + true;
                    if (((C109525b) arrayList.get(z)).f327801a == identityHashCode) {
                        arrayList.remove(z);
                        z = true;
                        break loop0;
                    } else if (i > size) {
                        break;
                    } else {
                        z = i;
                    }
                }
            }
        }
        int i2 = this.f327798b;
        this.f327798b = i2 + 1;
        if (i2 >= 10) {
            mo160747e();
        }
        return z;
    }

    /* renamed from: e */
    public final void mo160747e() {
        this.f327798b = 0;
        Iterator<ArrayList<C109525b>> it = this.f327797a.values().iterator();
        while (it.hasNext()) {
            ArrayList<C109525b> next = it.next();
            C87412m.m108593f(next, "iterator.next()");
            ArrayList arrayList = next;
            if (arrayList.size() <= 1) {
                C109525b bVar = (C109525b) C110818d0.m150916N(arrayList);
                if ((bVar == null ? null : bVar.f327802b.get()) == null) {
                    it.remove();
                }
            } else {
                int size = arrayList.size() - 1;
                if (size >= 0) {
                    int i = 0;
                    int i2 = 0;
                    while (true) {
                        int i3 = i + 1;
                        int i4 = i - i2;
                        if (((C109525b) arrayList.get(i4)).f327802b.get() == null) {
                            arrayList.remove(i4);
                            i2++;
                        }
                        if (i3 > size) {
                            break;
                        }
                        i = i3;
                    }
                }
                if (arrayList.isEmpty()) {
                    it.remove();
                }
            }
        }
    }
}
