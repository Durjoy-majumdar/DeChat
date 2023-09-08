package f24;

import com.google.android.gms.common.server.response.FastJsonResponse;
import e24.C20509c;
import gy3.C87412m;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Flushable;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import k24.C117371a;
import l24.C117443g;
import o24.C21754b0;
import o24.C21760d0;
import o24.C21762e0;
import o24.C21767i;
import o24.C21777r;
import o24.C21778s;
import o24.C21779t;

/* renamed from: f24.e */
public final class C20650e implements Closeable, Flushable {

    /* renamed from: A */
    public static final Pattern f58130A = Pattern.compile("[a-z0-9_-]{1,120}");

    /* renamed from: d */
    public final C117371a f58131d;

    /* renamed from: e */
    public final File f58132e;

    /* renamed from: f */
    public final File f58133f;

    /* renamed from: g */
    public final File f58134g;

    /* renamed from: h */
    public final File f58135h;

    /* renamed from: i */
    public final int f58136i;

    /* renamed from: j */
    public long f58137j;

    /* renamed from: n */
    public final int f58138n;

    /* renamed from: o */
    public long f58139o = 0;

    /* renamed from: p */
    public C21767i f58140p;

    /* renamed from: q */
    public final LinkedHashMap<String, C20655d> f58141q = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: r */
    public int f58142r;

    /* renamed from: s */
    public boolean f58143s;

    /* renamed from: t */
    public boolean f58144t;

    /* renamed from: u */
    public boolean f58145u;

    /* renamed from: v */
    public boolean f58146v;

    /* renamed from: w */
    public boolean f58147w;

    /* renamed from: x */
    public long f58148x = 0;

    /* renamed from: y */
    public final Executor f58149y;

    /* renamed from: z */
    public final Runnable f58150z = new C20651a();

    /* renamed from: f24.e$a */
    public class C20651a implements Runnable {
        public C20651a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
            r1 = r6.f58151d;
            r1.f58147w = true;
            r1.f58140p = o24.C21777r.m24934a(new o24.C21764f());
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x002f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r6 = this;
                f24.e r0 = f24.C20650e.this
                monitor-enter(r0)
                f24.e r1 = f24.C20650e.this     // Catch:{ all -> 0x0040 }
                boolean r2 = r1.f58144t     // Catch:{ all -> 0x0040 }
                r3 = 0
                r4 = 1
                if (r2 != 0) goto L_0x000d
                r2 = 1
                goto L_0x000e
            L_0x000d:
                r2 = 0
            L_0x000e:
                boolean r5 = r1.f58145u     // Catch:{ all -> 0x0040 }
                r2 = r2 | r5
                if (r2 == 0) goto L_0x0015
                monitor-exit(r0)     // Catch:{ all -> 0x0040 }
                return
            L_0x0015:
                r1.mo32343r()     // Catch:{ IOException -> 0x0019 }
                goto L_0x001d
            L_0x0019:
                f24.e r1 = f24.C20650e.this     // Catch:{ all -> 0x0040 }
                r1.f58146v = r4     // Catch:{ all -> 0x0040 }
            L_0x001d:
                f24.e r1 = f24.C20650e.this     // Catch:{ IOException -> 0x002f }
                boolean r1 = r1.mo32336g()     // Catch:{ IOException -> 0x002f }
                if (r1 == 0) goto L_0x003e
                f24.e r1 = f24.C20650e.this     // Catch:{ IOException -> 0x002f }
                r1.mo32341n()     // Catch:{ IOException -> 0x002f }
                f24.e r1 = f24.C20650e.this     // Catch:{ IOException -> 0x002f }
                r1.f58142r = r3     // Catch:{ IOException -> 0x002f }
                goto L_0x003e
            L_0x002f:
                f24.e r1 = f24.C20650e.this     // Catch:{ all -> 0x0040 }
                r1.f58147w = r4     // Catch:{ all -> 0x0040 }
                o24.f r2 = new o24.f     // Catch:{ all -> 0x0040 }
                r2.<init>()     // Catch:{ all -> 0x0040 }
                o24.i r2 = o24.C21777r.m24934a(r2)     // Catch:{ all -> 0x0040 }
                r1.f58140p = r2     // Catch:{ all -> 0x0040 }
            L_0x003e:
                monitor-exit(r0)     // Catch:{ all -> 0x0040 }
                return
            L_0x0040:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0040 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: f24.C20650e.C20651a.run():void");
        }
    }

    /* renamed from: f24.e$b */
    public class C20652b extends C20657f {
        static {
            Class<C20650e> cls = C20650e.class;
        }

        public C20652b(C21754b0 b0Var) {
            super(b0Var);
        }

        /* renamed from: a */
        public void mo32346a(IOException iOException) {
            C20650e.this.f58143s = true;
        }
    }

    /* renamed from: f24.e$c */
    public final class C20653c {

        /* renamed from: a */
        public final C20655d f58153a;

        /* renamed from: b */
        public final boolean[] f58154b;

        /* renamed from: c */
        public boolean f58155c;

        /* renamed from: f24.e$c$a */
        public class C20654a extends C20657f {
            public C20654a(C21754b0 b0Var) {
                super(b0Var);
            }

            /* renamed from: a */
            public void mo32346a(IOException iOException) {
                synchronized (C20650e.this) {
                    C20653c.this.mo32349c();
                }
            }
        }

        public C20653c(C20655d dVar) {
            this.f58153a = dVar;
            this.f58154b = dVar.f58162e ? null : new boolean[C20650e.this.f58138n];
        }

        /* renamed from: a */
        public void mo32347a() {
            synchronized (C20650e.this) {
                if (!this.f58155c) {
                    if (this.f58153a.f58163f == this) {
                        C20650e.this.mo32330b(this, false);
                    }
                    this.f58155c = true;
                } else {
                    throw new IllegalStateException();
                }
            }
        }

        /* renamed from: b */
        public void mo32348b() {
            synchronized (C20650e.this) {
                if (!this.f58155c) {
                    if (this.f58153a.f58163f == this) {
                        C20650e.this.mo32330b(this, true);
                    }
                    this.f58155c = true;
                } else {
                    throw new IllegalStateException();
                }
            }
        }

        /* renamed from: c */
        public void mo32349c() {
            if (this.f58153a.f58163f == this) {
                int i = 0;
                while (true) {
                    C20650e eVar = C20650e.this;
                    if (i < eVar.f58138n) {
                        try {
                            ((C117371a.C117372a) eVar.f58131d).mo182049a(this.f58153a.f58161d[i]);
                        } catch (IOException unused) {
                        }
                        i++;
                    } else {
                        this.f58153a.f58163f = null;
                        return;
                    }
                }
            }
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(11:14|15|16|17|18|19|20|21|22|23|24) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0042 */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public o24.C21754b0 mo32350d(int r6) {
            /*
                r5 = this;
                f24.e r0 = f24.C20650e.this
                monitor-enter(r0)
                boolean r1 = r5.f58155c     // Catch:{ all -> 0x006e }
                if (r1 != 0) goto L_0x0068
                f24.e$d r1 = r5.f58153a     // Catch:{ all -> 0x006e }
                f24.e$c r2 = r1.f58163f     // Catch:{ all -> 0x006e }
                if (r2 == r5) goto L_0x0014
                o24.f r6 = new o24.f     // Catch:{ all -> 0x006e }
                r6.<init>()     // Catch:{ all -> 0x006e }
                monitor-exit(r0)     // Catch:{ all -> 0x006e }
                return r6
            L_0x0014:
                boolean r2 = r1.f58162e     // Catch:{ all -> 0x006e }
                if (r2 != 0) goto L_0x001d
                boolean[] r2 = r5.f58154b     // Catch:{ all -> 0x006e }
                r3 = 1
                r2[r6] = r3     // Catch:{ all -> 0x006e }
            L_0x001d:
                java.io.File[] r1 = r1.f58161d     // Catch:{ all -> 0x006e }
                r6 = r1[r6]     // Catch:{ all -> 0x006e }
                f24.e r1 = f24.C20650e.this     // Catch:{ FileNotFoundException -> 0x0061 }
                k24.a r1 = r1.f58131d     // Catch:{ FileNotFoundException -> 0x0061 }
                k24.a$a r1 = (k24.C117371a.C117372a) r1     // Catch:{ FileNotFoundException -> 0x0061 }
                r1.getClass()     // Catch:{ FileNotFoundException -> 0x0061 }
                r1 = 0
                java.util.logging.Logger r2 = o24.C21778s.f61715a     // Catch:{ FileNotFoundException -> 0x0042 }
                java.lang.String r2 = "$this$sink"
                gy3.C87412m.m108594g(r6, r2)     // Catch:{ FileNotFoundException -> 0x0042 }
                java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0042 }
                r2.<init>(r6, r1)     // Catch:{ FileNotFoundException -> 0x0042 }
                o24.t r3 = new o24.t     // Catch:{ FileNotFoundException -> 0x0042 }
                o24.e0 r4 = new o24.e0     // Catch:{ FileNotFoundException -> 0x0042 }
                r4.<init>()     // Catch:{ FileNotFoundException -> 0x0042 }
                r3.<init>(r2, r4)     // Catch:{ FileNotFoundException -> 0x0042 }
                goto L_0x005a
            L_0x0042:
                java.io.File r2 = r6.getParentFile()     // Catch:{ FileNotFoundException -> 0x0061 }
                r2.mkdirs()     // Catch:{ FileNotFoundException -> 0x0061 }
                java.util.logging.Logger r2 = o24.C21778s.f61715a     // Catch:{ FileNotFoundException -> 0x0061 }
                java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0061 }
                r2.<init>(r6, r1)     // Catch:{ FileNotFoundException -> 0x0061 }
                o24.t r3 = new o24.t     // Catch:{ FileNotFoundException -> 0x0061 }
                o24.e0 r6 = new o24.e0     // Catch:{ FileNotFoundException -> 0x0061 }
                r6.<init>()     // Catch:{ FileNotFoundException -> 0x0061 }
                r3.<init>(r2, r6)     // Catch:{ FileNotFoundException -> 0x0061 }
            L_0x005a:
                f24.e$c$a r6 = new f24.e$c$a     // Catch:{ all -> 0x006e }
                r6.<init>(r3)     // Catch:{ all -> 0x006e }
                monitor-exit(r0)     // Catch:{ all -> 0x006e }
                return r6
            L_0x0061:
                o24.f r6 = new o24.f     // Catch:{ all -> 0x006e }
                r6.<init>()     // Catch:{ all -> 0x006e }
                monitor-exit(r0)     // Catch:{ all -> 0x006e }
                return r6
            L_0x0068:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch:{ all -> 0x006e }
                r6.<init>()     // Catch:{ all -> 0x006e }
                throw r6     // Catch:{ all -> 0x006e }
            L_0x006e:
                r6 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x006e }
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: f24.C20650e.C20653c.mo32350d(int):o24.b0");
        }
    }

    /* renamed from: f24.e$d */
    public final class C20655d {

        /* renamed from: a */
        public final String f58158a;

        /* renamed from: b */
        public final long[] f58159b;

        /* renamed from: c */
        public final File[] f58160c;

        /* renamed from: d */
        public final File[] f58161d;

        /* renamed from: e */
        public boolean f58162e;

        /* renamed from: f */
        public C20653c f58163f;

        /* renamed from: g */
        public long f58164g;

        public C20655d(String str) {
            this.f58158a = str;
            int i = C20650e.this.f58138n;
            this.f58159b = new long[i];
            this.f58160c = new File[i];
            this.f58161d = new File[i];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i2 = 0; i2 < C20650e.this.f58138n; i2++) {
                sb.append(i2);
                this.f58160c[i2] = new File(C20650e.this.f58132e, sb.toString());
                sb.append(".tmp");
                this.f58161d[i2] = new File(C20650e.this.f58132e, sb.toString());
                sb.setLength(length);
            }
        }

        /* renamed from: a */
        public C20656e mo32351a() {
            C21760d0 d0Var;
            if (Thread.holdsLock(C20650e.this)) {
                C21760d0[] d0VarArr = new C21760d0[C20650e.this.f58138n];
                long[] jArr = (long[]) this.f58159b.clone();
                int i = 0;
                int i2 = 0;
                while (true) {
                    try {
                        C20650e eVar = C20650e.this;
                        if (i2 >= eVar.f58138n) {
                            return new C20656e(this.f58158a, this.f58164g, d0VarArr, jArr);
                        }
                        C117371a aVar = eVar.f58131d;
                        File file = this.f58160c[i2];
                        ((C117371a.C117372a) aVar).getClass();
                        d0VarArr[i2] = C21777r.m24938e(file);
                        i2++;
                    } catch (FileNotFoundException unused) {
                        while (true) {
                            C20650e eVar2 = C20650e.this;
                            if (i >= eVar2.f58138n || (d0Var = d0VarArr[i]) == null) {
                                try {
                                    eVar2.mo32342q(this);
                                    return null;
                                } catch (IOException unused2) {
                                    return null;
                                }
                            } else {
                                C20509c.m22197c(d0Var);
                                i++;
                            }
                        }
                    }
                }
            } else {
                throw new AssertionError();
            }
        }
    }

    /* renamed from: f24.e$e */
    public final class C20656e implements Closeable {

        /* renamed from: d */
        public final String f58166d;

        /* renamed from: e */
        public final long f58167e;

        /* renamed from: f */
        public final C21760d0[] f58168f;

        public C20656e(String str, long j, C21760d0[] d0VarArr, long[] jArr) {
            this.f58166d = str;
            this.f58167e = j;
            this.f58168f = d0VarArr;
        }

        public void close() {
            for (C21760d0 c : this.f58168f) {
                C20509c.m22197c(c);
            }
        }
    }

    static {
        Class<C20650e> cls = C20650e.class;
    }

    public C20650e(C117371a aVar, File file, int i, int i2, long j, Executor executor) {
        this.f58131d = aVar;
        this.f58132e = file;
        this.f58136i = i;
        this.f58133f = new File(file, "journal");
        this.f58134g = new File(file, "journal.tmp");
        this.f58135h = new File(file, "journal.bkp");
        this.f58138n = i2;
        this.f58137j = j;
        this.f58149y = executor;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: a */
    public final synchronized void mo32329a() {
        /*
            r2 = this;
            monitor-enter(r2)
            monitor-enter(r2)     // Catch:{ all -> 0x0011 }
            boolean r0 = r2.f58145u     // Catch:{ all -> 0x0013 }
            monitor-exit(r2)     // Catch:{ all -> 0x0011 }
            if (r0 != 0) goto L_0x0009
            monitor-exit(r2)
            return
        L_0x0009:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0011 }
            java.lang.String r1 = "cache is closed"
            r0.<init>(r1)     // Catch:{ all -> 0x0011 }
            throw r0     // Catch:{ all -> 0x0011 }
        L_0x0011:
            r0 = move-exception
            goto L_0x0016
        L_0x0013:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0011 }
            throw r0     // Catch:{ all -> 0x0011 }
        L_0x0016:
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f24.C20650e.mo32329a():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0124, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo32330b(f24.C20650e.C20653c r10, boolean r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            f24.e$d r0 = r10.f58153a     // Catch:{ all -> 0x012b }
            f24.e$c r1 = r0.f58163f     // Catch:{ all -> 0x012b }
            if (r1 != r10) goto L_0x0125
            r1 = 0
            if (r11 == 0) goto L_0x004c
            boolean r2 = r0.f58162e     // Catch:{ all -> 0x012b }
            if (r2 != 0) goto L_0x004c
            r2 = 0
        L_0x000f:
            int r3 = r9.f58138n     // Catch:{ all -> 0x012b }
            if (r2 >= r3) goto L_0x004c
            boolean[] r3 = r10.f58154b     // Catch:{ all -> 0x012b }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x012b }
            if (r3 == 0) goto L_0x0032
            k24.a r3 = r9.f58131d     // Catch:{ all -> 0x012b }
            java.io.File[] r4 = r0.f58161d     // Catch:{ all -> 0x012b }
            r4 = r4[r2]     // Catch:{ all -> 0x012b }
            k24.a$a r3 = (k24.C117371a.C117372a) r3     // Catch:{ all -> 0x012b }
            r3.getClass()     // Catch:{ all -> 0x012b }
            boolean r3 = r4.exists()     // Catch:{ all -> 0x012b }
            if (r3 != 0) goto L_0x002f
            r10.mo32347a()     // Catch:{ all -> 0x012b }
            monitor-exit(r9)
            return
        L_0x002f:
            int r2 = r2 + 1
            goto L_0x000f
        L_0x0032:
            r10.mo32347a()     // Catch:{ all -> 0x012b }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x012b }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x012b }
            r11.<init>()     // Catch:{ all -> 0x012b }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.append(r0)     // Catch:{ all -> 0x012b }
            r11.append(r2)     // Catch:{ all -> 0x012b }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x012b }
            r10.<init>(r11)     // Catch:{ all -> 0x012b }
            throw r10     // Catch:{ all -> 0x012b }
        L_0x004c:
            r10 = 0
        L_0x004d:
            int r2 = r9.f58138n     // Catch:{ all -> 0x012b }
            if (r10 >= r2) goto L_0x0093
            java.io.File[] r2 = r0.f58161d     // Catch:{ all -> 0x012b }
            r2 = r2[r10]     // Catch:{ all -> 0x012b }
            if (r11 == 0) goto L_0x0089
            k24.a r3 = r9.f58131d     // Catch:{ all -> 0x012b }
            k24.a$a r3 = (k24.C117371a.C117372a) r3     // Catch:{ all -> 0x012b }
            r3.getClass()     // Catch:{ all -> 0x012b }
            boolean r3 = r2.exists()     // Catch:{ all -> 0x012b }
            if (r3 == 0) goto L_0x0090
            java.io.File[] r3 = r0.f58160c     // Catch:{ all -> 0x012b }
            r3 = r3[r10]     // Catch:{ all -> 0x012b }
            k24.a r4 = r9.f58131d     // Catch:{ all -> 0x012b }
            k24.a$a r4 = (k24.C117371a.C117372a) r4     // Catch:{ all -> 0x012b }
            r4.mo182051c(r2, r3)     // Catch:{ all -> 0x012b }
            long[] r2 = r0.f58159b     // Catch:{ all -> 0x012b }
            r4 = r2[r10]     // Catch:{ all -> 0x012b }
            k24.a r2 = r9.f58131d     // Catch:{ all -> 0x012b }
            k24.a$a r2 = (k24.C117371a.C117372a) r2     // Catch:{ all -> 0x012b }
            r2.getClass()     // Catch:{ all -> 0x012b }
            long r2 = r3.length()     // Catch:{ all -> 0x012b }
            long[] r6 = r0.f58159b     // Catch:{ all -> 0x012b }
            r6[r10] = r2     // Catch:{ all -> 0x012b }
            long r6 = r9.f58139o     // Catch:{ all -> 0x012b }
            long r6 = r6 - r4
            long r6 = r6 + r2
            r9.f58139o = r6     // Catch:{ all -> 0x012b }
            goto L_0x0090
        L_0x0089:
            k24.a r3 = r9.f58131d     // Catch:{ all -> 0x012b }
            k24.a$a r3 = (k24.C117371a.C117372a) r3     // Catch:{ all -> 0x012b }
            r3.mo182049a(r2)     // Catch:{ all -> 0x012b }
        L_0x0090:
            int r10 = r10 + 1
            goto L_0x004d
        L_0x0093:
            int r10 = r9.f58142r     // Catch:{ all -> 0x012b }
            r2 = 1
            int r10 = r10 + r2
            r9.f58142r = r10     // Catch:{ all -> 0x012b }
            r10 = 0
            r0.f58163f = r10     // Catch:{ all -> 0x012b }
            boolean r10 = r0.f58162e     // Catch:{ all -> 0x012b }
            r10 = r10 | r11
            r3 = 10
            r4 = 32
            if (r10 == 0) goto L_0x00e4
            r0.f58162e = r2     // Catch:{ all -> 0x012b }
            o24.i r10 = r9.f58140p     // Catch:{ all -> 0x012b }
            java.lang.String r2 = "CLEAN"
            o24.v r10 = (o24.C21781v) r10     // Catch:{ all -> 0x012b }
            r10.mo34126W(r2)     // Catch:{ all -> 0x012b }
            r10.mo34146o(r4)     // Catch:{ all -> 0x012b }
            o24.i r10 = r9.f58140p     // Catch:{ all -> 0x012b }
            java.lang.String r2 = r0.f58158a     // Catch:{ all -> 0x012b }
            o24.v r10 = (o24.C21781v) r10     // Catch:{ all -> 0x012b }
            r10.mo34126W(r2)     // Catch:{ all -> 0x012b }
            o24.i r10 = r9.f58140p     // Catch:{ all -> 0x012b }
            long[] r2 = r0.f58159b     // Catch:{ all -> 0x012b }
            int r5 = r2.length     // Catch:{ all -> 0x012b }
        L_0x00c1:
            if (r1 >= r5) goto L_0x00d1
            r6 = r2[r1]     // Catch:{ all -> 0x012b }
            r8 = r10
            o24.v r8 = (o24.C21781v) r8     // Catch:{ all -> 0x012b }
            r8.mo34146o(r4)     // Catch:{ all -> 0x012b }
            r8.mo34119F(r6)     // Catch:{ all -> 0x012b }
            int r1 = r1 + 1
            goto L_0x00c1
        L_0x00d1:
            o24.i r10 = r9.f58140p     // Catch:{ all -> 0x012b }
            o24.v r10 = (o24.C21781v) r10     // Catch:{ all -> 0x012b }
            r10.mo34146o(r3)     // Catch:{ all -> 0x012b }
            if (r11 == 0) goto L_0x0107
            long r10 = r9.f58148x     // Catch:{ all -> 0x012b }
            r1 = 1
            long r1 = r1 + r10
            r9.f58148x = r1     // Catch:{ all -> 0x012b }
            r0.f58164g = r10     // Catch:{ all -> 0x012b }
            goto L_0x0107
        L_0x00e4:
            java.util.LinkedHashMap<java.lang.String, f24.e$d> r10 = r9.f58141q     // Catch:{ all -> 0x012b }
            java.lang.String r11 = r0.f58158a     // Catch:{ all -> 0x012b }
            r10.remove(r11)     // Catch:{ all -> 0x012b }
            o24.i r10 = r9.f58140p     // Catch:{ all -> 0x012b }
            java.lang.String r11 = "REMOVE"
            o24.v r10 = (o24.C21781v) r10     // Catch:{ all -> 0x012b }
            r10.mo34126W(r11)     // Catch:{ all -> 0x012b }
            r10.mo34146o(r4)     // Catch:{ all -> 0x012b }
            o24.i r10 = r9.f58140p     // Catch:{ all -> 0x012b }
            java.lang.String r11 = r0.f58158a     // Catch:{ all -> 0x012b }
            o24.v r10 = (o24.C21781v) r10     // Catch:{ all -> 0x012b }
            r10.mo34126W(r11)     // Catch:{ all -> 0x012b }
            o24.i r10 = r9.f58140p     // Catch:{ all -> 0x012b }
            o24.v r10 = (o24.C21781v) r10     // Catch:{ all -> 0x012b }
            r10.mo34146o(r3)     // Catch:{ all -> 0x012b }
        L_0x0107:
            o24.i r10 = r9.f58140p     // Catch:{ all -> 0x012b }
            o24.v r10 = (o24.C21781v) r10     // Catch:{ all -> 0x012b }
            r10.flush()     // Catch:{ all -> 0x012b }
            long r10 = r9.f58139o     // Catch:{ all -> 0x012b }
            long r0 = r9.f58137j     // Catch:{ all -> 0x012b }
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x011c
            boolean r10 = r9.mo32336g()     // Catch:{ all -> 0x012b }
            if (r10 == 0) goto L_0x0123
        L_0x011c:
            java.util.concurrent.Executor r10 = r9.f58149y     // Catch:{ all -> 0x012b }
            java.lang.Runnable r11 = r9.f58150z     // Catch:{ all -> 0x012b }
            r10.execute(r11)     // Catch:{ all -> 0x012b }
        L_0x0123:
            monitor-exit(r9)
            return
        L_0x0125:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x012b }
            r10.<init>()     // Catch:{ all -> 0x012b }
            throw r10     // Catch:{ all -> 0x012b }
        L_0x012b:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: f24.C20650e.mo32330b(f24.e$c, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        return null;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized f24.C20650e.C20653c mo32331c(java.lang.String r6, long r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            r5.mo32334e()     // Catch:{ all -> 0x0074 }
            r5.mo32329a()     // Catch:{ all -> 0x0074 }
            r5.mo32344s(r6)     // Catch:{ all -> 0x0074 }
            java.util.LinkedHashMap<java.lang.String, f24.e$d> r0 = r5.f58141q     // Catch:{ all -> 0x0074 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x0074 }
            f24.e$d r0 = (f24.C20650e.C20655d) r0     // Catch:{ all -> 0x0074 }
            r1 = -1
            r3 = 0
            int r4 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r4 == 0) goto L_0x0023
            if (r0 == 0) goto L_0x0021
            long r1 = r0.f58164g     // Catch:{ all -> 0x0074 }
            int r4 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x0023
        L_0x0021:
            monitor-exit(r5)
            return r3
        L_0x0023:
            if (r0 == 0) goto L_0x002b
            f24.e$c r7 = r0.f58163f     // Catch:{ all -> 0x0074 }
            if (r7 == 0) goto L_0x002b
            monitor-exit(r5)
            return r3
        L_0x002b:
            boolean r7 = r5.f58146v     // Catch:{ all -> 0x0074 }
            if (r7 != 0) goto L_0x006b
            boolean r7 = r5.f58147w     // Catch:{ all -> 0x0074 }
            if (r7 == 0) goto L_0x0034
            goto L_0x006b
        L_0x0034:
            o24.i r7 = r5.f58140p     // Catch:{ all -> 0x0074 }
            java.lang.String r8 = "DIRTY"
            o24.i r7 = r7.mo34126W(r8)     // Catch:{ all -> 0x0074 }
            r8 = 32
            o24.i r7 = r7.mo34146o(r8)     // Catch:{ all -> 0x0074 }
            o24.i r7 = r7.mo34126W(r6)     // Catch:{ all -> 0x0074 }
            r8 = 10
            r7.mo34146o(r8)     // Catch:{ all -> 0x0074 }
            o24.i r7 = r5.f58140p     // Catch:{ all -> 0x0074 }
            r7.flush()     // Catch:{ all -> 0x0074 }
            boolean r7 = r5.f58143s     // Catch:{ all -> 0x0074 }
            if (r7 == 0) goto L_0x0056
            monitor-exit(r5)
            return r3
        L_0x0056:
            if (r0 != 0) goto L_0x0062
            f24.e$d r0 = new f24.e$d     // Catch:{ all -> 0x0074 }
            r0.<init>(r6)     // Catch:{ all -> 0x0074 }
            java.util.LinkedHashMap<java.lang.String, f24.e$d> r7 = r5.f58141q     // Catch:{ all -> 0x0074 }
            r7.put(r6, r0)     // Catch:{ all -> 0x0074 }
        L_0x0062:
            f24.e$c r6 = new f24.e$c     // Catch:{ all -> 0x0074 }
            r6.<init>(r0)     // Catch:{ all -> 0x0074 }
            r0.f58163f = r6     // Catch:{ all -> 0x0074 }
            monitor-exit(r5)
            return r6
        L_0x006b:
            java.util.concurrent.Executor r6 = r5.f58149y     // Catch:{ all -> 0x0074 }
            java.lang.Runnable r7 = r5.f58150z     // Catch:{ all -> 0x0074 }
            r6.execute(r7)     // Catch:{ all -> 0x0074 }
            monitor-exit(r5)
            return r3
        L_0x0074:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: f24.C20650e.mo32331c(java.lang.String, long):f24.e$c");
    }

    public synchronized void close() {
        if (this.f58144t) {
            if (!this.f58145u) {
                for (C20655d dVar : (C20655d[]) this.f58141q.values().toArray(new C20655d[this.f58141q.size()])) {
                    C20653c cVar = dVar.f58163f;
                    if (cVar != null) {
                        cVar.mo32347a();
                    }
                }
                mo32343r();
                this.f58140p.close();
                this.f58140p = null;
                this.f58145u = true;
                return;
            }
        }
        this.f58145u = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004f, code lost:
        return null;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized f24.C20650e.C20656e mo32333d(java.lang.String r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            r3.mo32334e()     // Catch:{ all -> 0x0050 }
            r3.mo32329a()     // Catch:{ all -> 0x0050 }
            r3.mo32344s(r4)     // Catch:{ all -> 0x0050 }
            java.util.LinkedHashMap<java.lang.String, f24.e$d> r0 = r3.f58141q     // Catch:{ all -> 0x0050 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0050 }
            f24.e$d r0 = (f24.C20650e.C20655d) r0     // Catch:{ all -> 0x0050 }
            r1 = 0
            if (r0 == 0) goto L_0x004e
            boolean r2 = r0.f58162e     // Catch:{ all -> 0x0050 }
            if (r2 != 0) goto L_0x001a
            goto L_0x004e
        L_0x001a:
            f24.e$e r0 = r0.mo32351a()     // Catch:{ all -> 0x0050 }
            if (r0 != 0) goto L_0x0022
            monitor-exit(r3)
            return r1
        L_0x0022:
            int r1 = r3.f58142r     // Catch:{ all -> 0x0050 }
            int r1 = r1 + 1
            r3.f58142r = r1     // Catch:{ all -> 0x0050 }
            o24.i r1 = r3.f58140p     // Catch:{ all -> 0x0050 }
            java.lang.String r2 = "READ"
            o24.i r1 = r1.mo34126W(r2)     // Catch:{ all -> 0x0050 }
            r2 = 32
            o24.i r1 = r1.mo34146o(r2)     // Catch:{ all -> 0x0050 }
            o24.i r4 = r1.mo34126W(r4)     // Catch:{ all -> 0x0050 }
            r1 = 10
            r4.mo34146o(r1)     // Catch:{ all -> 0x0050 }
            boolean r4 = r3.mo32336g()     // Catch:{ all -> 0x0050 }
            if (r4 == 0) goto L_0x004c
            java.util.concurrent.Executor r4 = r3.f58149y     // Catch:{ all -> 0x0050 }
            java.lang.Runnable r1 = r3.f58150z     // Catch:{ all -> 0x0050 }
            r4.execute(r1)     // Catch:{ all -> 0x0050 }
        L_0x004c:
            monitor-exit(r3)
            return r0
        L_0x004e:
            monitor-exit(r3)
            return r1
        L_0x0050:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: f24.C20650e.mo32333d(java.lang.String):f24.e$e");
    }

    /* renamed from: e */
    public synchronized void mo32334e() {
        if (!this.f58144t) {
            C117371a aVar = this.f58131d;
            File file = this.f58135h;
            ((C117371a.C117372a) aVar).getClass();
            if (file.exists()) {
                C117371a aVar2 = this.f58131d;
                File file2 = this.f58133f;
                ((C117371a.C117372a) aVar2).getClass();
                if (file2.exists()) {
                    ((C117371a.C117372a) this.f58131d).mo182049a(this.f58135h);
                } else {
                    ((C117371a.C117372a) this.f58131d).mo182051c(this.f58135h, this.f58133f);
                }
            }
            C117371a aVar3 = this.f58131d;
            File file3 = this.f58133f;
            ((C117371a.C117372a) aVar3).getClass();
            if (file3.exists()) {
                try {
                    mo32339k();
                    mo32338j();
                    this.f58144t = true;
                    return;
                } catch (IOException e) {
                    C117443g gVar = C117443g.f351507a;
                    gVar.mo182134l(5, "DiskLruCache " + this.f58132e + " is corrupt: " + e.getMessage() + ", removing", e);
                    close();
                    ((C117371a.C117372a) this.f58131d).mo182050b(this.f58132e);
                    this.f58145u = false;
                } catch (Throwable th) {
                    this.f58145u = false;
                    throw th;
                }
            }
            mo32341n();
            this.f58144t = true;
        }
    }

    public synchronized void flush() {
        if (this.f58144t) {
            mo32329a();
            mo32343r();
            this.f58140p.flush();
        }
    }

    /* renamed from: g */
    public boolean mo32336g() {
        int i = this.f58142r;
        return i >= 2000 && i >= this.f58141q.size();
    }

    /* renamed from: i */
    public final C21767i mo32337i() {
        C21779t tVar;
        C117371a aVar = this.f58131d;
        File file = this.f58133f;
        ((C117371a.C117372a) aVar).getClass();
        try {
            Logger logger = C21778s.f61715a;
            C87412m.m108594g(file, "$this$appendingSink");
            tVar = new C21779t(new FileOutputStream(file, true), new C21762e0());
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            Logger logger2 = C21778s.f61715a;
            tVar = new C21779t(new FileOutputStream(file, true), new C21762e0());
        }
        return C21777r.m24934a(new C20652b(tVar));
    }

    /* renamed from: j */
    public final void mo32338j() {
        ((C117371a.C117372a) this.f58131d).mo182049a(this.f58134g);
        Iterator<C20655d> it = this.f58141q.values().iterator();
        while (it.hasNext()) {
            C20655d next = it.next();
            int i = 0;
            if (next.f58163f == null) {
                while (i < this.f58138n) {
                    this.f58139o += next.f58159b[i];
                    i++;
                }
            } else {
                next.f58163f = null;
                while (i < this.f58138n) {
                    ((C117371a.C117372a) this.f58131d).mo182049a(next.f58160c[i]);
                    ((C117371a.C117372a) this.f58131d).mo182049a(next.f58161d[i]);
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:16|17|(1:19)(1:20)|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r9.f58142r = r0 - r9.f58141q.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0072, code lost:
        if (r2.mo34134e0() == false) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0074, code lost:
        mo32341n();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0078, code lost:
        r9.f58140p = mo32337i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0081, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0065 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x0082=Splitter:B:23:0x0082, B:16:0x0065=Splitter:B:16:0x0065} */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo32339k() {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            k24.a r1 = r9.f58131d
            java.io.File r2 = r9.f58133f
            k24.a$a r1 = (k24.C117371a.C117372a) r1
            r1.getClass()
            o24.d0 r1 = o24.C21777r.m24938e(r2)
            o24.j r1 = o24.C21777r.m24935b(r1)
            r2 = r1
            o24.x r2 = (o24.C21783x) r2     // Catch:{ all -> 0x00b1 }
            java.lang.String r3 = r2.mo34127Y()     // Catch:{ all -> 0x00b1 }
            java.lang.String r4 = r2.mo34127Y()     // Catch:{ all -> 0x00b1 }
            java.lang.String r5 = r2.mo34127Y()     // Catch:{ all -> 0x00b1 }
            java.lang.String r6 = r2.mo34127Y()     // Catch:{ all -> 0x00b1 }
            java.lang.String r7 = r2.mo34127Y()     // Catch:{ all -> 0x00b1 }
            java.lang.String r8 = "libcore.io.DiskLruCache"
            boolean r8 = r8.equals(r3)     // Catch:{ all -> 0x00b1 }
            if (r8 == 0) goto L_0x0082
            java.lang.String r8 = "1"
            boolean r8 = r8.equals(r4)     // Catch:{ all -> 0x00b1 }
            if (r8 == 0) goto L_0x0082
            int r8 = r9.f58136i     // Catch:{ all -> 0x00b1 }
            java.lang.String r8 = java.lang.Integer.toString(r8)     // Catch:{ all -> 0x00b1 }
            boolean r5 = r8.equals(r5)     // Catch:{ all -> 0x00b1 }
            if (r5 == 0) goto L_0x0082
            int r5 = r9.f58138n     // Catch:{ all -> 0x00b1 }
            java.lang.String r5 = java.lang.Integer.toString(r5)     // Catch:{ all -> 0x00b1 }
            boolean r5 = r5.equals(r6)     // Catch:{ all -> 0x00b1 }
            if (r5 == 0) goto L_0x0082
            java.lang.String r5 = ""
            boolean r5 = r5.equals(r7)     // Catch:{ all -> 0x00b1 }
            if (r5 == 0) goto L_0x0082
            r0 = 0
        L_0x005b:
            java.lang.String r3 = r2.mo34127Y()     // Catch:{ EOFException -> 0x0065 }
            r9.mo32340l(r3)     // Catch:{ EOFException -> 0x0065 }
            int r0 = r0 + 1
            goto L_0x005b
        L_0x0065:
            java.util.LinkedHashMap<java.lang.String, f24.e$d> r3 = r9.f58141q     // Catch:{ all -> 0x00b1 }
            int r3 = r3.size()     // Catch:{ all -> 0x00b1 }
            int r0 = r0 - r3
            r9.f58142r = r0     // Catch:{ all -> 0x00b1 }
            boolean r0 = r2.mo34134e0()     // Catch:{ all -> 0x00b1 }
            if (r0 != 0) goto L_0x0078
            r9.mo32341n()     // Catch:{ all -> 0x00b1 }
            goto L_0x007e
        L_0x0078:
            o24.i r0 = r9.mo32337i()     // Catch:{ all -> 0x00b1 }
            r9.f58140p = r0     // Catch:{ all -> 0x00b1 }
        L_0x007e:
            e24.C20509c.m22197c(r1)
            return
        L_0x0082:
            java.io.IOException r2 = new java.io.IOException     // Catch:{ all -> 0x00b1 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b1 }
            r5.<init>()     // Catch:{ all -> 0x00b1 }
            java.lang.String r8 = "unexpected journal header: ["
            r5.append(r8)     // Catch:{ all -> 0x00b1 }
            r5.append(r3)     // Catch:{ all -> 0x00b1 }
            r5.append(r0)     // Catch:{ all -> 0x00b1 }
            r5.append(r4)     // Catch:{ all -> 0x00b1 }
            r5.append(r0)     // Catch:{ all -> 0x00b1 }
            r5.append(r6)     // Catch:{ all -> 0x00b1 }
            r5.append(r0)     // Catch:{ all -> 0x00b1 }
            r5.append(r7)     // Catch:{ all -> 0x00b1 }
            java.lang.String r0 = "]"
            r5.append(r0)     // Catch:{ all -> 0x00b1 }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x00b1 }
            r2.<init>(r0)     // Catch:{ all -> 0x00b1 }
            throw r2     // Catch:{ all -> 0x00b1 }
        L_0x00b1:
            r0 = move-exception
            e24.C20509c.m22197c(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f24.C20650e.mo32339k():void");
    }

    /* renamed from: l */
    public final void mo32340l(String str) {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                str2 = str.substring(i);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f58141q.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i, indexOf2);
            }
            C20655d dVar = this.f58141q.get(str2);
            if (dVar == null) {
                dVar = new C20655d(str2);
                this.f58141q.put(str2, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                dVar.f58162e = true;
                dVar.f58163f = null;
                if (split.length == C20650e.this.f58138n) {
                    int i2 = 0;
                    while (i2 < split.length) {
                        try {
                            dVar.f58159b[i2] = Long.parseLong(split[i2]);
                            i2++;
                        } catch (NumberFormatException unused) {
                            throw new IOException("unexpected journal line: " + Arrays.toString(split));
                        }
                    }
                    return;
                }
                throw new IOException("unexpected journal line: " + Arrays.toString(split));
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                dVar.f58163f = new C20653c(dVar);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException("unexpected journal line: " + str);
            }
        } else {
            throw new IOException("unexpected journal line: " + str);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(12:1|2|(1:4)|5|6|7|8|9|10|11|12|(8:13|14|(4:17|(2:19|40)(5:20|(1:22)|42|25|41)|39|15)|26|27|(1:29)|30|31)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo32341n() {
        /*
            r12 = this;
            monitor-enter(r12)
            o24.i r0 = r12.f58140p     // Catch:{ all -> 0x010b }
            if (r0 == 0) goto L_0x000a
            o24.v r0 = (o24.C21781v) r0     // Catch:{ all -> 0x010b }
            r0.close()     // Catch:{ all -> 0x010b }
        L_0x000a:
            k24.a r0 = r12.f58131d     // Catch:{ all -> 0x010b }
            java.io.File r1 = r12.f58134g     // Catch:{ all -> 0x010b }
            k24.a$a r0 = (k24.C117371a.C117372a) r0     // Catch:{ all -> 0x010b }
            r0.getClass()     // Catch:{ all -> 0x010b }
            r0 = 0
            java.util.logging.Logger r2 = o24.C21778s.f61715a     // Catch:{ FileNotFoundException -> 0x002b }
            java.lang.String r2 = "$this$sink"
            gy3.C87412m.m108594g(r1, r2)     // Catch:{ FileNotFoundException -> 0x002b }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x002b }
            r2.<init>(r1, r0)     // Catch:{ FileNotFoundException -> 0x002b }
            o24.t r3 = new o24.t     // Catch:{ FileNotFoundException -> 0x002b }
            o24.e0 r4 = new o24.e0     // Catch:{ FileNotFoundException -> 0x002b }
            r4.<init>()     // Catch:{ FileNotFoundException -> 0x002b }
            r3.<init>(r2, r4)     // Catch:{ FileNotFoundException -> 0x002b }
            goto L_0x0043
        L_0x002b:
            java.io.File r2 = r1.getParentFile()     // Catch:{ all -> 0x010b }
            r2.mkdirs()     // Catch:{ all -> 0x010b }
            java.util.logging.Logger r2 = o24.C21778s.f61715a     // Catch:{ all -> 0x010b }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ all -> 0x010b }
            r2.<init>(r1, r0)     // Catch:{ all -> 0x010b }
            o24.t r3 = new o24.t     // Catch:{ all -> 0x010b }
            o24.e0 r1 = new o24.e0     // Catch:{ all -> 0x010b }
            r1.<init>()     // Catch:{ all -> 0x010b }
            r3.<init>(r2, r1)     // Catch:{ all -> 0x010b }
        L_0x0043:
            o24.i r1 = o24.C21777r.m24934a(r3)     // Catch:{ all -> 0x010b }
            java.lang.String r2 = "libcore.io.DiskLruCache"
            r3 = r1
            o24.v r3 = (o24.C21781v) r3     // Catch:{ all -> 0x00c2 }
            r3.mo34126W(r2)     // Catch:{ all -> 0x00c2 }
            r2 = 10
            r3.mo34146o(r2)     // Catch:{ all -> 0x00c2 }
            java.lang.String r3 = "1"
            r4 = r1
            o24.v r4 = (o24.C21781v) r4     // Catch:{ all -> 0x00c2 }
            r4.mo34126W(r3)     // Catch:{ all -> 0x00c2 }
            r4.mo34146o(r2)     // Catch:{ all -> 0x00c2 }
            int r3 = r12.f58136i     // Catch:{ all -> 0x00c2 }
            long r5 = (long) r3     // Catch:{ all -> 0x00c2 }
            r4.mo34119F(r5)     // Catch:{ all -> 0x00c2 }
            r4.mo34146o(r2)     // Catch:{ all -> 0x00c2 }
            int r3 = r12.f58138n     // Catch:{ all -> 0x00c2 }
            long r5 = (long) r3     // Catch:{ all -> 0x00c2 }
            r4.mo34119F(r5)     // Catch:{ all -> 0x00c2 }
            r4.mo34146o(r2)     // Catch:{ all -> 0x00c2 }
            r4.mo34146o(r2)     // Catch:{ all -> 0x00c2 }
            java.util.LinkedHashMap<java.lang.String, f24.e$d> r3 = r12.f58141q     // Catch:{ all -> 0x00c2 }
            java.util.Collection r3 = r3.values()     // Catch:{ all -> 0x00c2 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x00c2 }
        L_0x007e:
            boolean r5 = r3.hasNext()     // Catch:{ all -> 0x00c2 }
            if (r5 == 0) goto L_0x00c8
            java.lang.Object r5 = r3.next()     // Catch:{ all -> 0x00c2 }
            f24.e$d r5 = (f24.C20650e.C20655d) r5     // Catch:{ all -> 0x00c2 }
            f24.e$c r6 = r5.f58163f     // Catch:{ all -> 0x00c2 }
            r7 = 32
            if (r6 == 0) goto L_0x00a1
            java.lang.String r6 = "DIRTY"
            r4.mo34126W(r6)     // Catch:{ all -> 0x00c2 }
            r4.mo34146o(r7)     // Catch:{ all -> 0x00c2 }
            java.lang.String r5 = r5.f58158a     // Catch:{ all -> 0x00c2 }
            r4.mo34126W(r5)     // Catch:{ all -> 0x00c2 }
            r4.mo34146o(r2)     // Catch:{ all -> 0x00c2 }
            goto L_0x007e
        L_0x00a1:
            java.lang.String r6 = "CLEAN"
            r4.mo34126W(r6)     // Catch:{ all -> 0x00c2 }
            r4.mo34146o(r7)     // Catch:{ all -> 0x00c2 }
            java.lang.String r6 = r5.f58158a     // Catch:{ all -> 0x00c2 }
            r4.mo34126W(r6)     // Catch:{ all -> 0x00c2 }
            long[] r5 = r5.f58159b     // Catch:{ all -> 0x00c2 }
            int r6 = r5.length     // Catch:{ all -> 0x00c2 }
            r8 = 0
        L_0x00b2:
            if (r8 >= r6) goto L_0x00c4
            r9 = r5[r8]     // Catch:{ all -> 0x00c2 }
            r11 = r1
            o24.v r11 = (o24.C21781v) r11     // Catch:{ all -> 0x00c2 }
            r11.mo34146o(r7)     // Catch:{ all -> 0x00c2 }
            r11.mo34119F(r9)     // Catch:{ all -> 0x00c2 }
            int r8 = r8 + 1
            goto L_0x00b2
        L_0x00c2:
            r0 = move-exception
            goto L_0x0105
        L_0x00c4:
            r4.mo34146o(r2)     // Catch:{ all -> 0x00c2 }
            goto L_0x007e
        L_0x00c8:
            r4.close()     // Catch:{ all -> 0x010b }
            k24.a r1 = r12.f58131d     // Catch:{ all -> 0x010b }
            java.io.File r2 = r12.f58133f     // Catch:{ all -> 0x010b }
            k24.a$a r1 = (k24.C117371a.C117372a) r1     // Catch:{ all -> 0x010b }
            r1.getClass()     // Catch:{ all -> 0x010b }
            boolean r1 = r2.exists()     // Catch:{ all -> 0x010b }
            if (r1 == 0) goto L_0x00e5
            k24.a r1 = r12.f58131d     // Catch:{ all -> 0x010b }
            java.io.File r2 = r12.f58133f     // Catch:{ all -> 0x010b }
            java.io.File r3 = r12.f58135h     // Catch:{ all -> 0x010b }
            k24.a$a r1 = (k24.C117371a.C117372a) r1     // Catch:{ all -> 0x010b }
            r1.mo182051c(r2, r3)     // Catch:{ all -> 0x010b }
        L_0x00e5:
            k24.a r1 = r12.f58131d     // Catch:{ all -> 0x010b }
            java.io.File r2 = r12.f58134g     // Catch:{ all -> 0x010b }
            java.io.File r3 = r12.f58133f     // Catch:{ all -> 0x010b }
            k24.a$a r1 = (k24.C117371a.C117372a) r1     // Catch:{ all -> 0x010b }
            r1.mo182051c(r2, r3)     // Catch:{ all -> 0x010b }
            k24.a r1 = r12.f58131d     // Catch:{ all -> 0x010b }
            java.io.File r2 = r12.f58135h     // Catch:{ all -> 0x010b }
            k24.a$a r1 = (k24.C117371a.C117372a) r1     // Catch:{ all -> 0x010b }
            r1.mo182049a(r2)     // Catch:{ all -> 0x010b }
            o24.i r1 = r12.mo32337i()     // Catch:{ all -> 0x010b }
            r12.f58140p = r1     // Catch:{ all -> 0x010b }
            r12.f58143s = r0     // Catch:{ all -> 0x010b }
            r12.f58147w = r0     // Catch:{ all -> 0x010b }
            monitor-exit(r12)
            return
        L_0x0105:
            o24.v r1 = (o24.C21781v) r1     // Catch:{ all -> 0x010b }
            r1.close()     // Catch:{ all -> 0x010b }
            throw r0     // Catch:{ all -> 0x010b }
        L_0x010b:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f24.C20650e.mo32341n():void");
    }

    /* renamed from: q */
    public boolean mo32342q(C20655d dVar) {
        C20653c cVar = dVar.f58163f;
        if (cVar != null) {
            cVar.mo32349c();
        }
        for (int i = 0; i < this.f58138n; i++) {
            ((C117371a.C117372a) this.f58131d).mo182049a(dVar.f58160c[i]);
            long j = this.f58139o;
            long[] jArr = dVar.f58159b;
            this.f58139o = j - jArr[i];
            jArr[i] = 0;
        }
        this.f58142r++;
        this.f58140p.mo34126W("REMOVE").mo34146o(32).mo34126W(dVar.f58158a).mo34146o(10);
        this.f58141q.remove(dVar.f58158a);
        if (mo32336g()) {
            this.f58149y.execute(this.f58150z);
        }
        return true;
    }

    /* renamed from: r */
    public void mo32343r() {
        while (this.f58139o > this.f58137j) {
            mo32342q(this.f58141q.values().iterator().next());
        }
        this.f58146v = false;
    }

    /* renamed from: s */
    public final void mo32344s(String str) {
        if (!f58130A.matcher(str).matches()) {
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + FastJsonResponse.QUOTE);
        }
    }
}
