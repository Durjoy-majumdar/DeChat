package p953d8;

import android.os.ConditionVariable;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.NavigableSet;
import java.util.TreeSet;
import p333e8.C20528a;
import p953d8.C86199a;

/* renamed from: d8.l */
public final class C86215l implements C86199a {

    /* renamed from: a */
    public final File f250775a;

    /* renamed from: b */
    public final C86208f f250776b;

    /* renamed from: c */
    public final HashMap<String, C86209g> f250777c;

    /* renamed from: d */
    public final C86213j f250778d;

    /* renamed from: e */
    public final HashMap<String, ArrayList<C86199a.C86201b>> f250779e;

    /* renamed from: f */
    public long f250780f;

    /* renamed from: g */
    public C86199a.C86200a f250781g;

    /* renamed from: d8.l$a */
    public class C86216a extends Thread {

        /* renamed from: d */
        public final /* synthetic */ ConditionVariable f250782d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C86216a(String str, ConditionVariable conditionVariable) {
            super(str);
            this.f250782d = conditionVariable;
        }

        public void run() {
            synchronized (C86215l.this) {
                this.f250782d.open();
                try {
                    C86215l.m106795a(C86215l.this);
                } catch (C86199a.C86200a e) {
                    C86215l.this.f250781g = e;
                }
                C86215l.this.f250776b.mo120631b();
            }
        }
    }

    public C86215l(File file, C86208f fVar) {
        this(file, fVar, new C86213j(file, (byte[]) null, false));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b8, code lost:
        r14 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b9, code lost:
        r1 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c1, code lost:
        p333e8.C20551y.m22315e(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c7, code lost:
        if (r5 != null) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00cc, code lost:
        if (r5 != null) goto L_0x00ce;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[ExcHandler: IOException (unused java.io.IOException), PHI: r5 
      PHI: (r5v18 java.io.DataInputStream) = (r5v16 java.io.DataInputStream), (r5v19 java.io.DataInputStream), (r5v16 java.io.DataInputStream), (r5v16 java.io.DataInputStream) binds: [B:6:0x002a, B:28:0x0070, B:16:0x004b, B:18:0x0053] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC, Splitter:B:6:0x002a] */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[ExcHandler: FileNotFoundException (unused java.io.FileNotFoundException), PHI: r5 
      PHI: (r5v17 java.io.DataInputStream) = (r5v16 java.io.DataInputStream), (r5v19 java.io.DataInputStream), (r5v16 java.io.DataInputStream), (r5v16 java.io.DataInputStream) binds: [B:6:0x002a, B:28:0x0070, B:16:0x004b, B:18:0x0053] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC, Splitter:B:6:0x002a] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m106795a(p953d8.C86215l r14) {
        /*
            java.io.File r0 = r14.f250775a
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x000f
            java.io.File r14 = r14.f250775a
            r14.mkdirs()
            goto L_0x012d
        L_0x000f:
            d8.j r0 = r14.f250778d
            boolean r1 = r0.f250770g
            r2 = 1
            r1 = r1 ^ r2
            p333e8.C20528a.m22240d(r1)
            r1 = 0
            r3 = 0
            java.io.BufferedInputStream r4 = new java.io.BufferedInputStream     // Catch:{ FileNotFoundException -> 0x00ca, IOException -> 0x00c5, all -> 0x00bd }
            e8.b r5 = r0.f250766c     // Catch:{ FileNotFoundException -> 0x00ca, IOException -> 0x00c5, all -> 0x00bd }
            java.io.InputStream r5 = r5.mo120880a()     // Catch:{ FileNotFoundException -> 0x00ca, IOException -> 0x00c5, all -> 0x00bd }
            r4.<init>(r5)     // Catch:{ FileNotFoundException -> 0x00ca, IOException -> 0x00c5, all -> 0x00bd }
            java.io.DataInputStream r5 = new java.io.DataInputStream     // Catch:{ FileNotFoundException -> 0x00ca, IOException -> 0x00c5, all -> 0x00bd }
            r5.<init>(r4)     // Catch:{ FileNotFoundException -> 0x00ca, IOException -> 0x00c5, all -> 0x00bd }
            int r6 = r5.readInt()     // Catch:{ FileNotFoundException -> 0x00ab, IOException -> 0x00a9, all -> 0x00bb }
            if (r6 == r2) goto L_0x0032
            goto L_0x00ce
        L_0x0032:
            int r6 = r5.readInt()     // Catch:{ FileNotFoundException -> 0x00ab, IOException -> 0x00a9, all -> 0x00bb }
            r6 = r6 & r2
            if (r6 == 0) goto L_0x006a
            javax.crypto.Cipher r6 = r0.f250767d     // Catch:{ FileNotFoundException -> 0x00ab, IOException -> 0x00a9, all -> 0x00bb }
            if (r6 != 0) goto L_0x003f
            goto L_0x00ce
        L_0x003f:
            r6 = 16
            byte[] r6 = new byte[r6]     // Catch:{ FileNotFoundException -> 0x00ab, IOException -> 0x00a9, all -> 0x00bb }
            r5.readFully(r6)     // Catch:{ FileNotFoundException -> 0x00ab, IOException -> 0x00a9, all -> 0x00bb }
            javax.crypto.spec.IvParameterSpec r7 = new javax.crypto.spec.IvParameterSpec     // Catch:{ FileNotFoundException -> 0x00ab, IOException -> 0x00a9, all -> 0x00bb }
            r7.<init>(r6)     // Catch:{ FileNotFoundException -> 0x00ab, IOException -> 0x00a9, all -> 0x00bb }
            javax.crypto.Cipher r6 = r0.f250767d     // Catch:{ InvalidKeyException -> 0x0063, InvalidAlgorithmParameterException -> 0x0061 }
            r8 = 2
            javax.crypto.spec.SecretKeySpec r9 = r0.f250768e     // Catch:{ InvalidKeyException -> 0x0063, InvalidAlgorithmParameterException -> 0x0061 }
            r6.init(r8, r9, r7)     // Catch:{ InvalidKeyException -> 0x0063, InvalidAlgorithmParameterException -> 0x0061 }
            java.io.DataInputStream r6 = new java.io.DataInputStream     // Catch:{ FileNotFoundException -> 0x00ab, IOException -> 0x00a9, all -> 0x00bb }
            javax.crypto.CipherInputStream r7 = new javax.crypto.CipherInputStream     // Catch:{ FileNotFoundException -> 0x00ab, IOException -> 0x00a9, all -> 0x00bb }
            javax.crypto.Cipher r8 = r0.f250767d     // Catch:{ FileNotFoundException -> 0x00ab, IOException -> 0x00a9, all -> 0x00bb }
            r7.<init>(r4, r8)     // Catch:{ FileNotFoundException -> 0x00ab, IOException -> 0x00a9, all -> 0x00bb }
            r6.<init>(r7)     // Catch:{ FileNotFoundException -> 0x00ab, IOException -> 0x00a9, all -> 0x00bb }
            r5 = r6
            goto L_0x0070
        L_0x0061:
            r2 = move-exception
            goto L_0x0064
        L_0x0063:
            r2 = move-exception
        L_0x0064:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ FileNotFoundException -> 0x00ab, IOException -> 0x00a9, all -> 0x00bb }
            r4.<init>(r2)     // Catch:{ FileNotFoundException -> 0x00ab, IOException -> 0x00a9, all -> 0x00bb }
            throw r4     // Catch:{ FileNotFoundException -> 0x00ab, IOException -> 0x00a9, all -> 0x00bb }
        L_0x006a:
            javax.crypto.Cipher r4 = r0.f250767d     // Catch:{ FileNotFoundException -> 0x00ab, IOException -> 0x00a9, all -> 0x00bb }
            if (r4 == 0) goto L_0x0070
            r0.f250770g = r2     // Catch:{ FileNotFoundException -> 0x00ab, IOException -> 0x00a9, all -> 0x00bb }
        L_0x0070:
            int r4 = r5.readInt()     // Catch:{ FileNotFoundException -> 0x00ab, IOException -> 0x00a9, all -> 0x00b8 }
            r6 = 0
            r7 = 0
        L_0x0076:
            if (r6 >= r4) goto L_0x00ad
            d8.i r8 = new d8.i     // Catch:{ FileNotFoundException -> 0x00ab, IOException -> 0x00a9, all -> 0x00b8 }
            int r9 = r5.readInt()     // Catch:{ FileNotFoundException -> 0x00ab, IOException -> 0x00a9, all -> 0x00b8 }
            java.lang.String r10 = r5.readUTF()     // Catch:{ FileNotFoundException -> 0x00ab, IOException -> 0x00a9, all -> 0x00b8 }
            long r11 = r5.readLong()     // Catch:{ FileNotFoundException -> 0x00ab, IOException -> 0x00a9, all -> 0x00b8 }
            r8.<init>(r9, r10, r11)     // Catch:{ FileNotFoundException -> 0x00ab, IOException -> 0x00a9, all -> 0x00b8 }
            java.util.HashMap<java.lang.String, d8.i> r11 = r0.f250764a     // Catch:{ FileNotFoundException -> 0x00ab, IOException -> 0x00a9, all -> 0x00b8 }
            r11.put(r10, r8)     // Catch:{ FileNotFoundException -> 0x00ab, IOException -> 0x00a9, all -> 0x00b8 }
            android.util.SparseArray<java.lang.String> r11 = r0.f250765b     // Catch:{ FileNotFoundException -> 0x00ab, IOException -> 0x00a9, all -> 0x00b8 }
            r11.put(r9, r10)     // Catch:{ FileNotFoundException -> 0x00ab, IOException -> 0x00a9, all -> 0x00b8 }
            int r9 = r9 * 31
            int r10 = r10.hashCode()     // Catch:{ FileNotFoundException -> 0x00ab, IOException -> 0x00a9, all -> 0x00b8 }
            int r9 = r9 + r10
            int r9 = r9 * 31
            long r10 = r8.f250763d     // Catch:{ FileNotFoundException -> 0x00ab, IOException -> 0x00a9, all -> 0x00b8 }
            r8 = 32
            long r12 = r10 >>> r8
            long r10 = r10 ^ r12
            int r8 = (int) r10     // Catch:{ FileNotFoundException -> 0x00ab, IOException -> 0x00a9, all -> 0x00b8 }
            int r9 = r9 + r8
            int r7 = r7 + r9
            int r6 = r6 + 1
            goto L_0x0076
        L_0x00a9:
            goto L_0x00c7
        L_0x00ab:
            goto L_0x00cc
        L_0x00ad:
            int r4 = r5.readInt()     // Catch:{ FileNotFoundException -> 0x00ab, IOException -> 0x00a9, all -> 0x00b8 }
            if (r4 == r7) goto L_0x00b4
            goto L_0x00ce
        L_0x00b4:
            p333e8.C20551y.m22315e(r5)
            goto L_0x00d2
        L_0x00b8:
            r14 = move-exception
            r1 = r5
            goto L_0x00be
        L_0x00bb:
            r14 = move-exception
            goto L_0x00bf
        L_0x00bd:
            r14 = move-exception
        L_0x00be:
            r5 = r1
        L_0x00bf:
            if (r5 == 0) goto L_0x00c4
            p333e8.C20551y.m22315e(r5)
        L_0x00c4:
            throw r14
        L_0x00c5:
            r5 = r1
        L_0x00c7:
            if (r5 == 0) goto L_0x00d1
            goto L_0x00ce
        L_0x00ca:
            r5 = r1
        L_0x00cc:
            if (r5 == 0) goto L_0x00d1
        L_0x00ce:
            p333e8.C20551y.m22315e(r5)
        L_0x00d1:
            r2 = 0
        L_0x00d2:
            if (r2 != 0) goto L_0x00ea
            e8.b r2 = r0.f250766c
            java.io.File r4 = r2.f251254a
            r4.delete()
            java.io.File r2 = r2.f251255b
            r2.delete()
            java.util.HashMap<java.lang.String, d8.i> r2 = r0.f250764a
            r2.clear()
            android.util.SparseArray<java.lang.String> r0 = r0.f250765b
            r0.clear()
        L_0x00ea:
            java.io.File r0 = r14.f250775a
            java.io.File[] r0 = r0.listFiles()
            if (r0 != 0) goto L_0x00f3
            goto L_0x012d
        L_0x00f3:
            int r2 = r0.length
        L_0x00f4:
            if (r3 >= r2) goto L_0x0123
            r4 = r0[r3]
            java.lang.String r5 = r4.getName()
            java.lang.String r6 = "cached_content_index.exi"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0105
            goto L_0x0120
        L_0x0105:
            long r5 = r4.length()
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x0116
            d8.j r5 = r14.f250778d
            d8.m r5 = p953d8.C86217m.m106813b(r4, r5)
            goto L_0x0117
        L_0x0116:
            r5 = r1
        L_0x0117:
            if (r5 == 0) goto L_0x011d
            r14.mo120644b(r5)
            goto L_0x0120
        L_0x011d:
            r4.delete()
        L_0x0120:
            int r3 = r3 + 1
            goto L_0x00f4
        L_0x0123:
            d8.j r0 = r14.f250778d
            r0.mo120640c()
            d8.j r14 = r14.f250778d
            r14.mo120641d()
        L_0x012d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p953d8.C86215l.m106795a(d8.l):void");
    }

    /* renamed from: D */
    public synchronized long mo120611D(String str, long j, long j2) {
        C86212i b;
        b = this.f250778d.mo120639b(str);
        return b != null ? b.mo120635a(j, j2) : -j2;
    }

    /* renamed from: E */
    public synchronized long mo120612E(String str) {
        C86212i b;
        b = this.f250778d.mo120639b(str);
        return b == null ? -1 : b.f250763d;
    }

    /* renamed from: F */
    public synchronized NavigableSet<C86209g> mo120613F(String str, C86199a.C86201b bVar) {
        ArrayList arrayList = this.f250779e.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f250779e.put(str, arrayList);
        }
        arrayList.add(bVar);
        return mo120622O(str);
    }

    /* renamed from: G */
    public synchronized File mo120614G(String str, long j, long j2) {
        File file;
        C86212i iVar;
        C20528a.m22240d(this.f250777c.containsKey(str));
        if (!this.f250775a.exists()) {
            mo120647e();
            this.f250775a.mkdirs();
        }
        this.f250776b.mo120632e(this, str, j, j2);
        file = this.f250775a;
        C86213j jVar = this.f250778d;
        iVar = jVar.f250764a.get(str);
        if (iVar == null) {
            iVar = jVar.mo120638a(str, -1);
        }
        return C86217m.m106814c(file, iVar.f250760a, j, System.currentTimeMillis());
    }

    /* renamed from: H */
    public synchronized long mo120615H() {
        return this.f250780f;
    }

    /* renamed from: I */
    public synchronized void mo120616I(C86209g gVar) {
        mo120646d(gVar, true);
    }

    /* renamed from: J */
    public synchronized void mo120617J(C86209g gVar) {
        C20528a.m22240d(gVar == this.f250777c.remove(gVar.f250753d));
        notifyAll();
    }

    /* renamed from: K */
    public C86209g mo120618K(String str, long j) {
        C86217m f;
        synchronized (this) {
            while (true) {
                f = mo120620M(str, j);
                if (f == null) {
                    wait();
                }
            }
        }
        return f;
    }

    /* renamed from: L */
    public synchronized void mo120619L(String str, long j) {
        C86213j jVar = this.f250778d;
        C86212i b = jVar.mo120639b(str);
        if (b == null) {
            jVar.mo120638a(str, j);
        } else if (b.f250763d != j) {
            b.f250763d = j;
            jVar.f250770g = true;
        }
        this.f250778d.mo120641d();
    }

    /* renamed from: N */
    public synchronized void mo120621N(File file) {
        C86217m b = C86217m.m106813b(file, this.f250778d);
        boolean z = true;
        C20528a.m22240d(b != null);
        C20528a.m22240d(this.f250777c.containsKey(b.f250753d));
        if (file.exists()) {
            if (file.length() == 0) {
                file.delete();
                return;
            }
            Long valueOf = Long.valueOf(mo120612E(b.f250753d));
            if (valueOf.longValue() != -1) {
                if (b.f250754e + b.f250755f > valueOf.longValue()) {
                    z = false;
                }
                C20528a.m22240d(z);
            }
            mo120644b(b);
            this.f250778d.mo120641d();
            notifyAll();
        }
    }

    /* renamed from: O */
    public synchronized NavigableSet<C86209g> mo120622O(String str) {
        TreeSet treeSet;
        C86212i b = this.f250778d.mo120639b(str);
        if (b != null) {
            if (!b.f250762c.isEmpty()) {
                treeSet = new TreeSet(b.f250762c);
            }
        }
        treeSet = null;
        return treeSet;
    }

    /* renamed from: b */
    public final void mo120644b(C86217m mVar) {
        C86213j jVar = this.f250778d;
        String str = mVar.f250753d;
        C86212i iVar = jVar.f250764a.get(str);
        if (iVar == null) {
            iVar = jVar.mo120638a(str, -1);
        }
        iVar.f250762c.add(mVar);
        this.f250780f += mVar.f250755f;
        ArrayList arrayList = this.f250779e.get(mVar.f250753d);
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                ((C86199a.C86201b) arrayList.get(size)).mo120623a(this, mVar);
            }
        }
        this.f250776b.mo120623a(this, mVar);
    }

    /* renamed from: c */
    public final void mo120645c(C86209g gVar) {
        ArrayList arrayList = this.f250779e.get(gVar.f250753d);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((C86199a.C86201b) arrayList.get(size)).mo120624c(this, gVar);
            }
        }
        this.f250776b.mo120624c(this, gVar);
    }

    /* renamed from: d */
    public final void mo120646d(C86209g gVar, boolean z) {
        boolean z2;
        C86212i b = this.f250778d.mo120639b(gVar.f250753d);
        if (b != null) {
            if (b.f250762c.remove(gVar)) {
                gVar.f250757h.delete();
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                this.f250780f -= gVar.f250755f;
                if (z) {
                    try {
                        if (b.f250762c.isEmpty()) {
                            C86213j jVar = this.f250778d;
                            C86212i remove = jVar.f250764a.remove(b.f250761b);
                            if (remove != null) {
                                C20528a.m22240d(remove.f250762c.isEmpty());
                                jVar.f250765b.remove(remove.f250760a);
                                jVar.f250770g = true;
                            }
                            this.f250778d.mo120641d();
                        }
                    } catch (Throwable th) {
                        mo120645c(gVar);
                        throw th;
                    }
                }
                mo120645c(gVar);
            }
        }
    }

    /* renamed from: e */
    public final void mo120647e() {
        LinkedList linkedList = new LinkedList();
        for (C86212i iVar : this.f250778d.f250764a.values()) {
            Iterator<C86217m> it = iVar.f250762c.iterator();
            while (it.hasNext()) {
                C86209g next = it.next();
                if (!next.f250757h.exists()) {
                    linkedList.add(next);
                }
            }
        }
        Iterator it4 = linkedList.iterator();
        while (it4.hasNext()) {
            mo120646d((C86209g) it4.next(), false);
        }
        this.f250778d.mo120640c();
        this.f250778d.mo120641d();
    }

    /* renamed from: f */
    public synchronized C86217m mo120620M(String str, long j) {
        C86217m mVar;
        C86217m b;
        C86199a.C86200a aVar = this.f250781g;
        if (aVar == null) {
            C86212i b2 = this.f250778d.mo120639b(str);
            if (b2 == null) {
                mVar = new C86217m(str, j, -1, -9223372036854775807L, (File) null);
            } else {
                while (true) {
                    b = b2.mo120636b(j);
                    if (!b.f250756g || b.f250757h.exists()) {
                        mVar = b;
                    } else {
                        mo120647e();
                    }
                }
                mVar = b;
            }
            if (mVar.f250756g) {
                C86217m c = this.f250778d.mo120639b(str).mo120637c(mVar);
                ArrayList arrayList = this.f250779e.get(mVar.f250753d);
                if (arrayList != null) {
                    int size = arrayList.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        ((C86199a.C86201b) arrayList.get(size)).mo120625d(this, mVar, c);
                    }
                }
                this.f250776b.mo120625d(this, mVar, c);
                return c;
            } else if (this.f250777c.containsKey(str)) {
                return null;
            } else {
                this.f250777c.put(str, mVar);
                return mVar;
            }
        } else {
            throw aVar;
        }
    }

    public C86215l(File file, C86208f fVar, C86213j jVar) {
        this.f250780f = 0;
        this.f250775a = file;
        this.f250776b = fVar;
        this.f250777c = new HashMap<>();
        this.f250778d = jVar;
        this.f250779e = new HashMap<>();
        ConditionVariable conditionVariable = new ConditionVariable();
        new C86216a("SimpleCache.initialize()", conditionVariable).start();
        conditionVariable.block();
    }
}
