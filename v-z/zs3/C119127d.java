package zs3;

import android.util.SparseArray;
import at3.C113069b;
import at3.C113071d;
import at3.C113072e;
import at3.C113077g;
import at3.C79631i;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import ft3.C116896h;
import java.util.ArrayList;
import java.util.List;

/* renamed from: zs3.d */
public class C119127d {

    /* renamed from: h */
    public static final C116896h<C119127d> f356773h = new C119128a();

    /* renamed from: a */
    public boolean f356774a = false;

    /* renamed from: b */
    public C113072e f356775b;

    /* renamed from: c */
    public final MMHandler f356776c = new MMHandler("TuringMMCore");

    /* renamed from: d */
    public final List<C79631i> f356777d = new ArrayList();

    /* renamed from: e */
    public C119124c f356778e;

    /* renamed from: f */
    public final Runnable f356779f = new C119129b();

    /* renamed from: g */
    public final C119131d f356780g = new C119131d((C119128a) null);

    /* renamed from: zs3.d$a */
    public class C119128a extends C116896h<C119127d> {
        /* renamed from: a */
        public Object mo165606a() {
            return new C119127d();
        }
    }

    /* renamed from: zs3.d$b */
    public class C119129b extends C113069b {
        public C119129b() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x005e, code lost:
            return;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo165593a() {
            /*
                r9 = this;
                zs3.d r0 = zs3.C119127d.this
                monitor-enter(r0)
                zs3.d r1 = zs3.C119127d.this     // Catch:{ all -> 0x005f }
                boolean r2 = r1.f356774a     // Catch:{ all -> 0x005f }
                if (r2 != 0) goto L_0x000b
                monitor-exit(r0)     // Catch:{ all -> 0x005f }
                return
            L_0x000b:
                at3.e r2 = r1.f356775b     // Catch:{ all -> 0x005f }
                if (r2 != 0) goto L_0x0011
                monitor-exit(r0)     // Catch:{ all -> 0x005f }
                return
            L_0x0011:
                zs3.c r1 = r1.f356778e     // Catch:{ all -> 0x005f }
                long r3 = r1.f356767c     // Catch:{ all -> 0x005f }
                boolean r1 = r2.mo165598c(r3)     // Catch:{ all -> 0x005f }
                if (r1 == 0) goto L_0x005d
                zs3.d r1 = zs3.C119127d.this     // Catch:{ all -> 0x005f }
                at3.e r1 = r1.f356775b     // Catch:{ all -> 0x005f }
                at3.e$a r1 = r1.f338464d     // Catch:{ all -> 0x005f }
                java.util.concurrent.atomic.AtomicBoolean r2 = r1.f338465d     // Catch:{ all -> 0x005f }
                monitor-enter(r2)     // Catch:{ all -> 0x005f }
                long r3 = r1.f338466e     // Catch:{ all -> 0x005a }
                monitor-exit(r2)     // Catch:{ all -> 0x005a }
                zs3.d r1 = zs3.C119127d.this     // Catch:{ all -> 0x005f }
                zs3.d$d r2 = r1.f356780g     // Catch:{ all -> 0x005f }
                zs3.c r1 = r1.f356778e     // Catch:{ all -> 0x005f }
                long r5 = r1.f356767c     // Catch:{ all -> 0x005f }
                long r7 = at3.C113071d.f338456a     // Catch:{ all -> 0x005f }
                long r5 = r5 / r7
                int r1 = (int) r5     // Catch:{ all -> 0x005f }
                r5 = 1
                r2.f356787d = r5     // Catch:{ all -> 0x005f }
                r2.f356788e = r1     // Catch:{ all -> 0x005f }
                r2.f356789f = r3     // Catch:{ all -> 0x005f }
                long r3 = r3 + r7
                long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x005f }
                long r3 = r3 - r1
                r1 = 0
                int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r5 <= 0) goto L_0x0050
                zs3.d r1 = zs3.C119127d.this     // Catch:{ all -> 0x005f }
                com.tencent.mm.sdk.platformtools.MMHandler r2 = r1.f356776c     // Catch:{ all -> 0x005f }
                zs3.d$d r1 = r1.f356780g     // Catch:{ all -> 0x005f }
                r2.postDelayed(r1, r3)     // Catch:{ all -> 0x005f }
                goto L_0x005d
            L_0x0050:
                zs3.d r1 = zs3.C119127d.this     // Catch:{ all -> 0x005f }
                com.tencent.mm.sdk.platformtools.MMHandler r2 = r1.f356776c     // Catch:{ all -> 0x005f }
                zs3.d$d r1 = r1.f356780g     // Catch:{ all -> 0x005f }
                r2.post(r1)     // Catch:{ all -> 0x005f }
                goto L_0x005d
            L_0x005a:
                r1 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x005a }
                throw r1     // Catch:{ all -> 0x005f }
            L_0x005d:
                monitor-exit(r0)     // Catch:{ all -> 0x005f }
                return
            L_0x005f:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x005f }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: zs3.C119127d.C119129b.mo165593a():void");
        }

        /* renamed from: b */
        public void mo165594b(Throwable th) {
            C119127d.this.getClass();
        }
    }

    /* renamed from: zs3.d$c */
    public class C119130c extends C113069b {

        /* renamed from: d */
        public final /* synthetic */ int f356782d;

        /* renamed from: e */
        public final /* synthetic */ int f356783e;

        /* renamed from: f */
        public final /* synthetic */ SparseArray f356784f;

        /* renamed from: g */
        public final /* synthetic */ List f356785g;

        public C119130c(int i, int i2, int i3, SparseArray sparseArray, List list) {
            this.f356782d = i;
            this.f356783e = i2;
            this.f356784f = sparseArray;
            this.f356785g = list;
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x00a1 A[Catch:{ all -> 0x009e, all -> 0x00a4 }] */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00d3  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x00ee  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x0158  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo165593a() {
            /*
                r12 = this;
                zs3.d r0 = zs3.C119127d.this     // Catch:{ IllegalArgumentException -> 0x0169 }
                monitor-enter(r0)     // Catch:{ IllegalArgumentException -> 0x0169 }
                int r1 = r12.f356782d     // Catch:{ all -> 0x0166 }
                int r2 = r12.f356783e     // Catch:{ all -> 0x0166 }
                zs3.d r3 = zs3.C119127d.this     // Catch:{ all -> 0x0166 }
                zs3.c r3 = r3.f356778e     // Catch:{ all -> 0x0166 }
                android.content.Context r3 = r3.f356768d     // Catch:{ all -> 0x0166 }
                r4 = 0
                android.util.SparseArray r5 = r12.f356784f     // Catch:{ all -> 0x0166 }
                java.util.List r6 = r12.f356785g     // Catch:{ all -> 0x0166 }
                bt3.a r1 = at3.C113068a.m154742a(r1, r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0166 }
                monitor-exit(r0)     // Catch:{ all -> 0x0166 }
                ft3.h<at3.f> r0 = at3.C113074f.f338470c
                java.lang.Object r0 = r0.mo180860b()
                at3.f r0 = (at3.C113074f) r0
                int r2 = r12.f356782d
                int r3 = r12.f356783e
                r0.getClass()
                byte[] r1 = r1.toByteArray()
                byte[] r1 = ft3.C87080a.m108102a(r1)
                byte[] r4 = ft3.C116891b.m164880d()
                byte[] r1 = ft3.C116891b.m164878b(r1, r4)
                if (r1 != 0) goto L_0x003a
                goto L_0x0160
            L_0x003a:
                android.content.Context r4 = r0.f338471a
                java.lang.String r5 = "turingmm"
                r6 = 0
                java.io.File r4 = r4.getDir(r5, r6)
                java.lang.String r7 = ""
                java.lang.String r8 = "_"
                if (r4 != 0) goto L_0x004b
                r4 = r7
                goto L_0x0081
            L_0x004b:
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r4 = r4.getAbsolutePath()
                r9.append(r4)
                java.lang.String r4 = java.io.File.separator
                r9.append(r4)
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r2)
                java.lang.String r10 = "00"
                r4.append(r10)
                r4.append(r3)
                java.lang.String r4 = r4.toString()
                r9.append(r4)
                r9.append(r8)
                long r10 = java.lang.System.currentTimeMillis()
                r9.append(r10)
                java.lang.String r4 = r9.toString()
            L_0x0081:
                boolean r9 = android.text.TextUtils.isEmpty(r4)
                if (r9 == 0) goto L_0x0089
                goto L_0x0160
            L_0x0089:
                r9 = 0
                java.io.BufferedOutputStream r10 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x009f }
                java.io.FileOutputStream r11 = new java.io.FileOutputStream     // Catch:{ all -> 0x009f }
                r11.<init>(r4)     // Catch:{ all -> 0x009f }
                r10.<init>(r11)     // Catch:{ all -> 0x009f }
                r10.write(r1)     // Catch:{ all -> 0x009e }
                r10.flush()     // Catch:{ all -> 0x009e }
                r10.close()     // Catch:{ all -> 0x00a4 }
                goto L_0x00a4
            L_0x009e:
                r9 = r10
            L_0x009f:
                if (r9 == 0) goto L_0x00a4
                r9.close()     // Catch:{ all -> 0x00a4 }
            L_0x00a4:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r2)
                java.lang.String r2 = "00"
                r1.append(r2)
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                android.content.Context r0 = r0.f338471a
                java.io.File r0 = r0.getDir(r5, r6)
                if (r0 != 0) goto L_0x00c2
                goto L_0x0152
            L_0x00c2:
                java.io.File[] r2 = r0.listFiles()
                if (r2 != 0) goto L_0x00ca
                goto L_0x0152
            L_0x00ca:
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                int r4 = r2.length
                r5 = 0
            L_0x00d1:
                if (r5 >= r4) goto L_0x00e6
                r9 = r2[r5]
                java.lang.String r10 = r9.getName()
                boolean r10 = r10.startsWith(r1)
                if (r10 != 0) goto L_0x00e0
                goto L_0x00e3
            L_0x00e0:
                r3.add(r9)
            L_0x00e3:
                int r5 = r5 + 1
                goto L_0x00d1
            L_0x00e6:
                int r2 = r3.size()
                r4 = 2
                if (r2 > r4) goto L_0x00ee
                goto L_0x0152
            L_0x00ee:
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.util.Iterator r3 = r3.iterator()
            L_0x00f7:
                boolean r5 = r3.hasNext()
                if (r5 == 0) goto L_0x0126
                java.lang.Object r5 = r3.next()
                java.io.File r5 = (java.io.File) r5
                java.lang.String r5 = r5.getName()
                java.lang.String[] r5 = r5.split(r8)
                int r9 = r5.length
                if (r9 == r4) goto L_0x010f
                goto L_0x00f7
            L_0x010f:
                r9 = r5[r6]
                boolean r9 = r9.equals(r1)
                if (r9 == 0) goto L_0x00f7
                r9 = 1
                r5 = r5[r9]
                long r9 = java.lang.Long.parseLong(r5)
                java.lang.Long r5 = java.lang.Long.valueOf(r9)
                r2.add(r5)
                goto L_0x00f7
            L_0x0126:
                int r3 = r2.size()
                if (r3 > r4) goto L_0x012d
                goto L_0x0152
            L_0x012d:
                java.util.Collections.sort(r2)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r0 = r0.getAbsolutePath()
                r3.append(r0)
                java.lang.String r0 = java.io.File.separator
                r3.append(r0)
                r3.append(r1)
                r3.append(r8)
                java.lang.Object r0 = r2.get(r6)
                r3.append(r0)
                java.lang.String r7 = r3.toString()
            L_0x0152:
                boolean r0 = android.text.TextUtils.isEmpty(r7)
                if (r0 != 0) goto L_0x0160
                java.io.File r0 = new java.io.File
                r0.<init>(r7)
                r0.delete()
            L_0x0160:
                zs3.d r0 = zs3.C119127d.this
                r0.getClass()
                return
            L_0x0166:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0166 }
                throw r1     // Catch:{ IllegalArgumentException -> 0x0169 }
            L_0x0169:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: zs3.C119127d.C119130c.mo165593a():void");
        }

        /* renamed from: b */
        public void mo165594b(Throwable th) {
            C119127d.this.getClass();
        }
    }

    /* renamed from: zs3.d$d */
    public class C119131d extends C113069b {

        /* renamed from: d */
        public int f356787d = 1;

        /* renamed from: e */
        public int f356788e = 3;

        /* renamed from: f */
        public long f356789f = 0;

        public C119131d(C119128a aVar) {
        }

        /* renamed from: a */
        public void mo165593a() {
            C79631i iVar = new C79631i();
            synchronized (C119127d.this) {
                iVar.mo109770a(C119127d.this.f356778e.f356768d);
            }
            synchronized (C119127d.this.f356777d) {
                ((ArrayList) C119127d.this.f356777d).add(iVar);
            }
            int i = this.f356787d;
            if (i >= this.f356788e) {
                synchronized (C119127d.this) {
                    C119127d dVar = C119127d.this;
                    if (dVar.f356774a) {
                        dVar.mo183835b();
                        return;
                    }
                    return;
                }
            }
            int i2 = i + 1;
            this.f356787d = i2;
            long currentTimeMillis = (this.f356789f + (C113071d.f338456a * ((long) i2))) - System.currentTimeMillis();
            if (currentTimeMillis > 0) {
                C119127d dVar2 = C119127d.this;
                dVar2.f356776c.postDelayed(dVar2.f356780g, currentTimeMillis);
                return;
            }
            C119127d dVar3 = C119127d.this;
            dVar3.f356776c.post(dVar3.f356780g);
        }

        /* renamed from: b */
        public void mo165594b(Throwable th) {
            C119127d.this.getClass();
        }
    }

    /* renamed from: a */
    public final void mo183834a() {
        C113072e eVar = this.f356775b;
        if (eVar != null) {
            synchronized (eVar.f338463c) {
                eVar.f338463c.clear();
            }
        }
        synchronized (this.f356777d) {
            ((ArrayList) this.f356777d).clear();
        }
    }

    /* renamed from: b */
    public synchronized boolean mo183835b() {
        long j;
        ArrayList arrayList;
        if (!this.f356774a) {
            return true;
        }
        this.f356774a = false;
        if (this.f356778e == null) {
            return false;
        }
        this.f356776c.removeCallbacks(this.f356779f);
        this.f356776c.removeCallbacks(this.f356780g);
        C113072e eVar = this.f356775b;
        if (eVar == null) {
            return true;
        }
        eVar.mo165599d();
        C113072e.C113073a aVar = this.f356775b.f338464d;
        synchronized (aVar.f338465d) {
            j = aVar.f338468g;
        }
        if (((int) (j / C113071d.f338456a)) < 3) {
            return false;
        }
        SparseArray<C113077g> a = this.f356775b.mo165597a();
        if (a.size() == 0) {
            return false;
        }
        synchronized (this.f356777d) {
            arrayList = new ArrayList(this.f356777d);
        }
        if (arrayList.size() < 3) {
            return false;
        }
        C119124c cVar = this.f356778e;
        int i = cVar.f356765a;
        int i2 = cVar.f356766b;
        cVar.getClass();
        this.f356776c.post(new C119130c(i, i2, 0, a, arrayList));
        return true;
    }
}
