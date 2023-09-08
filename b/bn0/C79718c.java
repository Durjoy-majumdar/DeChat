package bn0;

import an0.C79592a;
import android.net.Uri;
import android.webkit.URLUtil;
import cn0.C80078d;
import cn0.C80079e;
import cn0.C80081g;
import cn0.C80083i;
import cn0.C80087k;
import cn0.C80107r;
import fn0.C86996a;
import fn0.C87002g;
import java.io.IOException;

/* renamed from: bn0.c */
public final class C79718c implements C80079e {

    /* renamed from: a */
    public long f233633a = 0;

    /* renamed from: b */
    public int f233634b;

    /* renamed from: c */
    public long f233635c;

    /* renamed from: d */
    public long f233636d;

    /* renamed from: e */
    public final C79714a f233637e;

    /* renamed from: f */
    public final C80079e f233638f;

    /* renamed from: g */
    public final C80079e f233639g;

    /* renamed from: h */
    public final C80079e f233640h;

    /* renamed from: i */
    public final C79719a f233641i;

    /* renamed from: j */
    public final boolean f233642j;

    /* renamed from: k */
    public final boolean f233643k;

    /* renamed from: l */
    public C80079e f233644l;

    /* renamed from: m */
    public Uri f233645m;

    /* renamed from: n */
    public int f233646n;

    /* renamed from: o */
    public String f233647o;

    /* renamed from: p */
    public String f233648p;

    /* renamed from: q */
    public long f233649q;

    /* renamed from: r */
    public long f233650r;

    /* renamed from: s */
    public int f233651s;

    /* renamed from: t */
    public C79722f f233652t;

    /* renamed from: u */
    public boolean f233653u;

    /* renamed from: v */
    public long f233654v;

    /* renamed from: w */
    public boolean f233655w;

    /* renamed from: x */
    public String f233656x = "";

    /* renamed from: bn0.c$a */
    public interface C79719a {
    }

    public C79718c(C79714a aVar, C80079e eVar, C80079e eVar2, C80078d dVar, boolean z, boolean z2, C79719a aVar2) {
        this.f233637e = aVar;
        this.f233638f = eVar2;
        this.f233642j = z;
        this.f233643k = z2;
        this.f233640h = eVar;
        if (dVar != null) {
            this.f233639g = new C80107r(eVar, dVar);
        } else {
            this.f233639g = null;
        }
        this.f233641i = aVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return -1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo109835a() {
        /*
            r8 = this;
            cn0.e r0 = r8.f233644l
            r1 = -1
            if (r0 != 0) goto L_0x0007
            return r1
        L_0x0007:
            cn0.e r3 = r8.f233638f
            if (r0 != r3) goto L_0x0032
            bn0.a r3 = r8.f233637e
            if (r3 == 0) goto L_0x0032
            java.lang.String r0 = r8.f233648p
            bn0.i r3 = (bn0.C79725i) r3
            monitor-enter(r3)
            java.util.NavigableSet r0 = r3.mo109852c(r0)     // Catch:{ all -> 0x002f }
            if (r0 == 0) goto L_0x002d
            java.lang.Object r0 = r0.first()     // Catch:{ all -> 0x002f }
            bn0.f r0 = (bn0.C79722f) r0     // Catch:{ all -> 0x002f }
            if (r0 == 0) goto L_0x002d
            long r4 = r0.f233661g     // Catch:{ all -> 0x002f }
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x002d
            monitor-exit(r3)
            r1 = r4
            goto L_0x002e
        L_0x002d:
            monitor-exit(r3)
        L_0x002e:
            return r1
        L_0x002f:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0032:
            long r0 = r0.mo109835a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bn0.C79718c.mo109835a():long");
    }

    public long available() {
        C80079e eVar = this.f233644l;
        if (eVar == null) {
            return 0;
        }
        return eVar.available();
    }

    /* renamed from: b */
    public long mo109837b(C80081g gVar) {
        try {
            this.f233645m = gVar.f234519a;
            this.f233646n = gVar.f234524f;
            this.f233647o = gVar.f234525g;
            this.f233648p = gVar.f234523e;
            this.f233649q = gVar.f234521c;
            this.f233650r = gVar.f234522d;
            this.f233651s = gVar.f234526h;
            long currentTimeMillis = System.currentTimeMillis();
            long k = mo109846k();
            this.f233636d = mo109835a();
            this.f233633a = System.currentTimeMillis() - currentTimeMillis;
            return k;
        } catch (IOException e) {
            if (this.f233644l instanceof C80087k) {
                String g = mo109841g();
                C87002g.m108023q(6, g, "open cache error " + e.toString(), (Throwable) null);
            } else {
                String g2 = mo109841g();
                C87002g.m108023q(6, g2, "open error " + e.toString(), (Throwable) null);
            }
            mo109844i(e);
            if (this.f233653u) {
                try {
                    mo109840f();
                } catch (Exception e2) {
                    C87002g.m108023q(5, mo109841g(), "open, failed on closeCurrentSource, shouldn't be a problem", e2);
                }
                C87002g.m108023q(6, mo109841g(), "open cache error, try reopen without cache", (Throwable) null);
                long currentTimeMillis2 = System.currentTimeMillis();
                long k2 = mo109846k();
                this.f233636d = mo109835a();
                this.f233633a = System.currentTimeMillis() - currentTimeMillis2;
                return k2;
            }
            throw e;
        }
    }

    /* renamed from: c */
    public int mo109838c(byte[] bArr, int i, int i2) {
        C79719a aVar;
        try {
            if (!this.f233655w && (this.f233644l instanceof C80087k) && C79592a.m96648a().f233399b) {
                C87002g.m108023q(4, mo109841g(), "read from cache " + ((C80087k) this.f233644l).getUri() + ", fileSize=" + this.f233644l.available(), (Throwable) null);
            }
            long currentTimeMillis = System.currentTimeMillis();
            int c = this.f233644l.mo109838c(bArr, i, i2);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            if (!this.f233655w) {
                if (!(this.f233644l == this.f233638f || C79592a.m96648a().f233411n == null || this.f233651s != 90 || !URLUtil.isNetworkUrl(this.f233645m.toString()) || (aVar = this.f233641i) == null)) {
                    String str = this.f233647o;
                    long j = this.f233633a;
                    ((C80083i.C80084a) aVar).mo110333a(str, j, j, currentTimeMillis2);
                }
                this.f233655w = true;
            }
            if (c >= 0) {
                if (this.f233644l == this.f233638f) {
                    this.f233654v += (long) c;
                } else {
                    this.f233634b += c;
                    this.f233635c += currentTimeMillis2;
                }
                long j2 = (long) c;
                this.f233649q += j2;
                long j3 = this.f233650r;
                if (j3 == -1) {
                    return c;
                }
                this.f233650r = j3 - j2;
                return c;
            }
            mo109845j();
            mo109840f();
            if (this.f233650r <= 0) {
                return c;
            }
            mo109846k();
            return mo109838c(bArr, i, i2);
        } catch (IOException e) {
            if (this.f233644l instanceof C80087k) {
                C87002g.m108023q(6, mo109841g(), "read cache error " + e.toString(), (Throwable) null);
            } else {
                C87002g.m108023q(6, mo109841g(), "read error " + e.toString(), (Throwable) null);
            }
            mo109844i(e);
            throw e;
        }
    }

    public void close() {
        try {
            mo109840f();
        } catch (IOException e) {
            if (this.f233644l instanceof C80087k) {
                String g = mo109841g();
                C87002g.m108023q(6, g, "close cache error " + e.toString(), (Throwable) null);
            } else {
                String g2 = mo109841g();
                C87002g.m108023q(6, g2, "close error " + e.toString(), (Throwable) null);
            }
            mo109844i(e);
            throw e;
        }
    }

    /* renamed from: f */
    public final void mo109840f() {
        C80079e eVar = this.f233644l;
        if (eVar != null) {
            boolean z = true;
            try {
                eVar.close();
                this.f233644l = null;
                C79722f fVar = this.f233652t;
                if (fVar != null) {
                    C79725i iVar = (C79725i) this.f233637e;
                    synchronized (iVar) {
                        if (fVar != iVar.f233672d.remove(fVar.f233658d)) {
                            z = false;
                        }
                        C86996a.m107998a(z);
                        iVar.notifyAll();
                    }
                    this.f233652t = null;
                }
            } catch (Throwable th) {
                C79722f fVar2 = this.f233652t;
                if (fVar2 != null) {
                    C79725i iVar2 = (C79725i) this.f233637e;
                    synchronized (iVar2) {
                        if (fVar2 != iVar2.f233672d.remove(fVar2.f233658d)) {
                            z = false;
                        }
                        C86996a.m107998a(z);
                        iVar2.notifyAll();
                        this.f233652t = null;
                    }
                }
                throw th;
            }
        }
    }

    /* renamed from: g */
    public String mo109841g() {
        return this.f233656x + "CacheDataSource";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001a, code lost:
        r0 = r0.first();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public dn0.C86358b getFileType() {
        /*
            r7 = this;
            cn0.e r0 = r7.f233644l
            if (r0 != 0) goto L_0x0007
            dn0.b r0 = dn0.C86358b.f251077c
            return r0
        L_0x0007:
            cn0.e r1 = r7.f233638f
            if (r0 != r1) goto L_0x0035
            bn0.a r1 = r7.f233637e
            if (r1 == 0) goto L_0x0035
            java.lang.String r0 = r7.f233648p
            bn0.i r1 = (bn0.C79725i) r1
            monitor-enter(r1)
            java.util.NavigableSet r0 = r1.mo109852c(r0)     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x002e
            java.lang.Object r0 = r0.first()     // Catch:{ all -> 0x0032 }
            bn0.f r0 = (bn0.C79722f) r0     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x002e
            long r2 = r0.f233661g     // Catch:{ all -> 0x0032 }
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x002e
            dn0.b r0 = r0.f233662h     // Catch:{ all -> 0x0032 }
            monitor-exit(r1)
            goto L_0x0031
        L_0x002e:
            dn0.b r0 = dn0.C86358b.f251077c     // Catch:{ all -> 0x0032 }
            monitor-exit(r1)
        L_0x0031:
            return r0
        L_0x0032:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0035:
            dn0.b r0 = r0.getFileType()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bn0.C79718c.getFileType():dn0.b");
    }

    /* renamed from: h */
    public C80079e mo109843h() {
        return this.f233640h;
    }

    /* renamed from: i */
    public final void mo109844i(IOException iOException) {
        String g = mo109841g();
        C87002g.m108023q(3, g, "handleBeforeThrow " + iOException + ", ignoreCacheOnError=" + this.f233643k + ", currentDataSource=" + this.f233644l, (Throwable) null);
        if (this.f233643k && this.f233644l == this.f233638f) {
            String g2 = mo109841g();
            C87002g.m108023q(4, g2, "handleBeforeThrow currentDataSource=" + this.f233644l + ", exception=" + iOException, (Throwable) null);
            this.f233653u = true;
        }
    }

    /* renamed from: j */
    public final void mo109845j() {
        long j;
        C79719a aVar = this.f233641i;
        if (aVar != null) {
            if (this.f233651s == 90) {
                String str = this.f233647o;
                int i = this.f233634b;
                long j2 = this.f233635c;
                long j3 = this.f233636d;
                long j4 = this.f233654v;
                ((C80083i.C80084a) aVar).getClass();
                C87002g.m108023q(3, "DataSourceBuilder", String.format("downloadSizeAndDuration, uuid:%s, totalUpstreamBytesRead:%s, totalUpstreamReadCost:%s, totalLength:%s, totalCachedBytesRead:%s", new Object[]{str, Integer.valueOf(i), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4)}), (Throwable) null);
                if (C79592a.m96648a().f233411n != null) {
                    C79592a.m96648a().f233411n.getClass();
                }
            }
            this.f233634b = 0;
            this.f233635c = 0;
            if (this.f233644l == this.f233638f && this.f233654v > 0) {
                C79719a aVar2 = this.f233641i;
                C79725i iVar = (C79725i) this.f233637e;
                synchronized (iVar) {
                    j = iVar.f233669a;
                }
                long j5 = this.f233654v;
                ((C80083i.C80084a) aVar2).getClass();
                C87002g.m108023q(3, "DataSourceBuilder", String.format("onCachedBytesRead, cacheSizeBytes:%s, cachedBytesRead:%s", new Object[]{Long.valueOf(j), Long.valueOf(j5)}), (Throwable) null);
                this.f233654v = 0;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01dc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01e2, code lost:
        throw new java.lang.RuntimeException(r0);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo109846k() {
        /*
            r29 = this;
            r1 = r29
            boolean r0 = r1.f233653u     // Catch:{ InterruptedException -> 0x01dc }
            if (r0 == 0) goto L_0x0008
            r0 = 0
            goto L_0x005c
        L_0x0008:
            boolean r0 = r1.f233642j     // Catch:{ InterruptedException -> 0x01dc }
            if (r0 == 0) goto L_0x003d
            bn0.a r0 = r1.f233637e     // Catch:{ InterruptedException -> 0x01dc }
            java.lang.String r4 = r1.f233648p     // Catch:{ InterruptedException -> 0x01dc }
            long r5 = r1.f233649q     // Catch:{ InterruptedException -> 0x01dc }
            r15 = r0
            bn0.i r15 = (bn0.C79725i) r15     // Catch:{ InterruptedException -> 0x01dc }
            monitor-enter(r15)     // Catch:{ InterruptedException -> 0x01dc }
            bn0.f r0 = new bn0.f     // Catch:{ all -> 0x0039 }
            dn0.b r11 = dn0.C86358b.f251077c     // Catch:{ all -> 0x0039 }
            r7 = -1
            r9 = -1
            r12 = 0
            r13 = -1
            r16 = 0
            r3 = r0
            r2 = r15
            r15 = r16
            r3.<init>(r4, r5, r7, r9, r11, r12, r13, r15)     // Catch:{ all -> 0x0037 }
        L_0x002a:
            bn0.f r3 = r2.mo109857h(r0)     // Catch:{ all -> 0x0037 }
            if (r3 == 0) goto L_0x0033
            monitor-exit(r2)     // Catch:{ InterruptedException -> 0x01dc }
            r0 = r3
            goto L_0x005c
        L_0x0033:
            r2.wait()     // Catch:{ all -> 0x0037 }
            goto L_0x002a
        L_0x0037:
            r0 = move-exception
            goto L_0x003b
        L_0x0039:
            r0 = move-exception
            r2 = r15
        L_0x003b:
            monitor-exit(r2)     // Catch:{ InterruptedException -> 0x01dc }
            throw r0     // Catch:{ InterruptedException -> 0x01dc }
        L_0x003d:
            bn0.a r0 = r1.f233637e     // Catch:{ InterruptedException -> 0x01dc }
            java.lang.String r3 = r1.f233648p     // Catch:{ InterruptedException -> 0x01dc }
            long r4 = r1.f233649q     // Catch:{ InterruptedException -> 0x01dc }
            r15 = r0
            bn0.i r15 = (bn0.C79725i) r15     // Catch:{ InterruptedException -> 0x01dc }
            monitor-enter(r15)     // Catch:{ InterruptedException -> 0x01dc }
            bn0.f r0 = new bn0.f     // Catch:{ all -> 0x01d9 }
            dn0.b r10 = dn0.C86358b.f251077c     // Catch:{ all -> 0x01d9 }
            r6 = -1
            r8 = -1
            r11 = 0
            r12 = -1
            r14 = 0
            r2 = r0
            r2.<init>(r3, r4, r6, r8, r10, r11, r12, r14)     // Catch:{ all -> 0x01d9 }
            bn0.f r0 = r15.mo109857h(r0)     // Catch:{ all -> 0x01d9 }
            monitor-exit(r15)     // Catch:{ InterruptedException -> 0x01dc }
        L_0x005c:
            r2 = -1
            r4 = 0
            if (r0 != 0) goto L_0x007e
            cn0.e r0 = r1.f233640h     // Catch:{ InterruptedException -> 0x01dc }
            r1.f233644l = r0     // Catch:{ InterruptedException -> 0x01dc }
            cn0.g r0 = new cn0.g     // Catch:{ InterruptedException -> 0x01dc }
            android.net.Uri r6 = r1.f233645m     // Catch:{ InterruptedException -> 0x01dc }
            long r9 = r1.f233649q     // Catch:{ InterruptedException -> 0x01dc }
            long r11 = r1.f233650r     // Catch:{ InterruptedException -> 0x01dc }
            java.lang.String r13 = r1.f233648p     // Catch:{ InterruptedException -> 0x01dc }
            int r14 = r1.f233646n     // Catch:{ InterruptedException -> 0x01dc }
            java.lang.String r15 = r1.f233647o     // Catch:{ InterruptedException -> 0x01dc }
            int r7 = r1.f233651s     // Catch:{ InterruptedException -> 0x01dc }
            r5 = r0
            r16 = r7
            r7 = r9
            r5.<init>(r6, r7, r9, r11, r13, r14, r15, r16)     // Catch:{ InterruptedException -> 0x01dc }
            goto L_0x0146
        L_0x007e:
            boolean r5 = r0.f233663i     // Catch:{ InterruptedException -> 0x01dc }
            if (r5 == 0) goto L_0x00ff
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ InterruptedException -> 0x01dc }
            com.tencent.mm.vfs.m1 r6 = r0.f233664j     // Catch:{ InterruptedException -> 0x01dc }
            android.net.Uri r18 = com.tencent.p014mm.sdk.platformtools.FileProviderHelper.getUriForFile(r5, r6)     // Catch:{ InterruptedException -> 0x01dc }
            long r5 = r1.f233649q     // Catch:{ InterruptedException -> 0x01dc }
            long r7 = r0.f233659e     // Catch:{ InterruptedException -> 0x01dc }
            long r21 = r5 - r7
            long r7 = r1.f233650r     // Catch:{ InterruptedException -> 0x01dc }
            int r9 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r9 != 0) goto L_0x009e
            long r7 = r0.f233661g     // Catch:{ InterruptedException -> 0x01dc }
            long r7 = r7 - r5
            r1.f233650r = r7     // Catch:{ InterruptedException -> 0x01dc }
            goto L_0x00d5
        L_0x009e:
            long r9 = r0.f233661g     // Catch:{ InterruptedException -> 0x01dc }
            long r9 = r9 - r5
            int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r5 <= 0) goto L_0x00d5
            r5 = 5
            java.lang.String r6 = r29.mo109841g()     // Catch:{ InterruptedException -> 0x01dc }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ InterruptedException -> 0x01dc }
            r7.<init>()     // Catch:{ InterruptedException -> 0x01dc }
            java.lang.String r8 = "fix bytesRemaining, max="
            r7.append(r8)     // Catch:{ InterruptedException -> 0x01dc }
            long r8 = r0.f233661g     // Catch:{ InterruptedException -> 0x01dc }
            long r10 = r1.f233649q     // Catch:{ InterruptedException -> 0x01dc }
            long r8 = r8 - r10
            r7.append(r8)     // Catch:{ InterruptedException -> 0x01dc }
            java.lang.String r8 = " current="
            r7.append(r8)     // Catch:{ InterruptedException -> 0x01dc }
            long r8 = r1.f233650r     // Catch:{ InterruptedException -> 0x01dc }
            r7.append(r8)     // Catch:{ InterruptedException -> 0x01dc }
            java.lang.String r7 = r7.toString()     // Catch:{ InterruptedException -> 0x01dc }
            r8 = 0
            fn0.C87002g.m108023q(r5, r6, r7, r8)     // Catch:{ InterruptedException -> 0x01dc }
            long r5 = r0.f233661g     // Catch:{ InterruptedException -> 0x01dc }
            long r7 = r1.f233649q     // Catch:{ InterruptedException -> 0x01dc }
            long r5 = r5 - r7
            r1.f233650r = r5     // Catch:{ InterruptedException -> 0x01dc }
        L_0x00d5:
            long r5 = r0.f233660f     // Catch:{ InterruptedException -> 0x01dc }
            long r5 = r5 - r21
            long r7 = r1.f233650r     // Catch:{ InterruptedException -> 0x01dc }
            long r23 = java.lang.Math.min(r5, r7)     // Catch:{ InterruptedException -> 0x01dc }
            cn0.g r0 = new cn0.g     // Catch:{ InterruptedException -> 0x01dc }
            long r5 = r1.f233649q     // Catch:{ InterruptedException -> 0x01dc }
            java.lang.String r7 = r1.f233648p     // Catch:{ InterruptedException -> 0x01dc }
            int r8 = r1.f233646n     // Catch:{ InterruptedException -> 0x01dc }
            java.lang.String r9 = r1.f233647o     // Catch:{ InterruptedException -> 0x01dc }
            int r10 = r1.f233651s     // Catch:{ InterruptedException -> 0x01dc }
            r17 = r0
            r19 = r5
            r25 = r7
            r26 = r8
            r27 = r9
            r28 = r10
            r17.<init>(r18, r19, r21, r23, r25, r26, r27, r28)     // Catch:{ InterruptedException -> 0x01dc }
            cn0.e r5 = r1.f233638f     // Catch:{ InterruptedException -> 0x01dc }
            r1.f233644l = r5     // Catch:{ InterruptedException -> 0x01dc }
            goto L_0x0146
        L_0x00ff:
            r1.f233652t = r0     // Catch:{ InterruptedException -> 0x01dc }
            long r5 = r0.f233660f     // Catch:{ InterruptedException -> 0x01dc }
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0109
            r0 = 1
            goto L_0x010a
        L_0x0109:
            r0 = 0
        L_0x010a:
            if (r0 == 0) goto L_0x0111
            long r5 = r1.f233650r     // Catch:{ InterruptedException -> 0x01dc }
        L_0x010e:
            r23 = r5
            goto L_0x011c
        L_0x0111:
            long r7 = r1.f233650r     // Catch:{ InterruptedException -> 0x01dc }
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x010e
            long r5 = java.lang.Math.min(r5, r7)     // Catch:{ InterruptedException -> 0x01dc }
            goto L_0x010e
        L_0x011c:
            cn0.g r0 = new cn0.g     // Catch:{ InterruptedException -> 0x01dc }
            android.net.Uri r5 = r1.f233645m     // Catch:{ InterruptedException -> 0x01dc }
            long r6 = r1.f233649q     // Catch:{ InterruptedException -> 0x01dc }
            java.lang.String r8 = r1.f233648p     // Catch:{ InterruptedException -> 0x01dc }
            int r9 = r1.f233646n     // Catch:{ InterruptedException -> 0x01dc }
            java.lang.String r10 = r1.f233647o     // Catch:{ InterruptedException -> 0x01dc }
            int r11 = r1.f233651s     // Catch:{ InterruptedException -> 0x01dc }
            r17 = r0
            r18 = r5
            r19 = r6
            r21 = r6
            r25 = r8
            r26 = r9
            r27 = r10
            r28 = r11
            r17.<init>(r18, r19, r21, r23, r25, r26, r27, r28)     // Catch:{ InterruptedException -> 0x01dc }
            cn0.e r5 = r1.f233639g     // Catch:{ InterruptedException -> 0x01dc }
            if (r5 == 0) goto L_0x0142
            goto L_0x0144
        L_0x0142:
            cn0.e r5 = r1.f233640h     // Catch:{ InterruptedException -> 0x01dc }
        L_0x0144:
            r1.f233644l = r5     // Catch:{ InterruptedException -> 0x01dc }
        L_0x0146:
            cn0.e r5 = r1.f233644l     // Catch:{ InterruptedException -> 0x01dc }
            long r5 = r5.mo109837b(r0)     // Catch:{ InterruptedException -> 0x01dc }
            cn0.e r7 = r1.f233644l     // Catch:{ InterruptedException -> 0x01dc }
            boolean r8 = r7 instanceof cn0.C80089l     // Catch:{ InterruptedException -> 0x01dc }
            if (r8 == 0) goto L_0x0175
            long r7 = r7.mo109835a()     // Catch:{ InterruptedException -> 0x01dc }
            int r9 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r9 == 0) goto L_0x0175
            long r7 = r0.f234521c     // Catch:{ InterruptedException -> 0x01dc }
            cn0.e r0 = r1.f233644l     // Catch:{ InterruptedException -> 0x01dc }
            long r9 = r0.mo109835a()     // Catch:{ InterruptedException -> 0x01dc }
            r11 = 1
            long r9 = r9 - r11
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x0175
            r0 = 6
            java.lang.String r7 = r29.mo109841g()     // Catch:{ InterruptedException -> 0x01dc }
            java.lang.String r8 = "read position out of bound"
            r9 = 0
            fn0.C87002g.m108023q(r0, r7, r8, r9)     // Catch:{ InterruptedException -> 0x01dc }
        L_0x0175:
            long r7 = r1.f233650r     // Catch:{ InterruptedException -> 0x01dc }
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x01c4
            cn0.e r0 = r1.f233644l     // Catch:{ InterruptedException -> 0x01dc }
            long r7 = r0.mo109835a()     // Catch:{ InterruptedException -> 0x01dc }
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x01c4
            cn0.e r0 = r1.f233644l     // Catch:{ InterruptedException -> 0x01dc }
            long r2 = r0.mo109835a()     // Catch:{ InterruptedException -> 0x01dc }
            long r7 = r1.f233649q     // Catch:{ InterruptedException -> 0x01dc }
            long r2 = r2 - r7
            r1.f233650r = r2     // Catch:{ InterruptedException -> 0x01dc }
            r0 = 4
            java.lang.String r2 = r29.mo109841g()     // Catch:{ InterruptedException -> 0x01dc }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ InterruptedException -> 0x01dc }
            r3.<init>()     // Catch:{ InterruptedException -> 0x01dc }
            java.lang.String r7 = "init bytesRemaining "
            r3.append(r7)     // Catch:{ InterruptedException -> 0x01dc }
            long r7 = r1.f233650r     // Catch:{ InterruptedException -> 0x01dc }
            r3.append(r7)     // Catch:{ InterruptedException -> 0x01dc }
            java.lang.String r7 = ", readPosition="
            r3.append(r7)     // Catch:{ InterruptedException -> 0x01dc }
            long r7 = r1.f233649q     // Catch:{ InterruptedException -> 0x01dc }
            r3.append(r7)     // Catch:{ InterruptedException -> 0x01dc }
            java.lang.String r7 = ", totalLength="
            r3.append(r7)     // Catch:{ InterruptedException -> 0x01dc }
            cn0.e r7 = r1.f233644l     // Catch:{ InterruptedException -> 0x01dc }
            long r7 = r7.mo109835a()     // Catch:{ InterruptedException -> 0x01dc }
            r3.append(r7)     // Catch:{ InterruptedException -> 0x01dc }
            java.lang.String r3 = r3.toString()     // Catch:{ InterruptedException -> 0x01dc }
            r7 = 0
            fn0.C87002g.m108023q(r0, r2, r3, r7)     // Catch:{ InterruptedException -> 0x01dc }
        L_0x01c4:
            r2 = 0
            long r7 = r1.f233650r     // Catch:{ InterruptedException -> 0x01dc }
            long r9 = r29.mo109835a()     // Catch:{ InterruptedException -> 0x01dc }
            long r7 = java.lang.Math.min(r7, r9)     // Catch:{ InterruptedException -> 0x01dc }
            long r2 = java.lang.Math.max(r2, r7)     // Catch:{ InterruptedException -> 0x01dc }
            r1.f233650r = r2     // Catch:{ InterruptedException -> 0x01dc }
            r1.f233655w = r4     // Catch:{ InterruptedException -> 0x01dc }
            return r5
        L_0x01d9:
            r0 = move-exception
            monitor-exit(r15)     // Catch:{ InterruptedException -> 0x01dc }
            throw r0     // Catch:{ InterruptedException -> 0x01dc }
        L_0x01dc:
            r0 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: bn0.C79718c.mo109846k():long");
    }
}
