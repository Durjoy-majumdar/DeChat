package gf0;

import cf0.C80027f;
import cf0.C80028g;
import com.tencent.p014mm.mm7zip.IInStream;
import com.tencent.p014mm.mm7zip.IOutStream;
import com.tencent.p014mm.mm7zip.SevenZipException;
import com.tencent.stubs.logger.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: gf0.a */
public class C87178a implements IInStream, IOutStream {

    /* renamed from: d */
    public final List<byte[]> f252820d;

    /* renamed from: e */
    public final int f252821e;

    /* renamed from: f */
    public final int f252822f;

    /* renamed from: g */
    public int f252823g;

    /* renamed from: h */
    public int f252824h;

    /* renamed from: i */
    public int f252825i;

    /* renamed from: j */
    public int f252826j;

    /* renamed from: n */
    public int f252827n;

    /* renamed from: o */
    public String f252828o;

    /* renamed from: p */
    public C80028g f252829p;

    /* renamed from: q */
    public int f252830q;

    /* renamed from: r */
    public int f252831r;

    /* renamed from: s */
    public HashMap<String, Integer> f252832s;

    /* renamed from: t */
    public C87179a f252833t;

    /* renamed from: gf0.a$a */
    public interface C87179a {
    }

    public C87178a(String str, int i, int i2, C80028g gVar, C87179a aVar, int i3) {
        int i4 = 1024 > i2 ? i2 : 1024;
        ArrayList arrayList = new ArrayList();
        this.f252820d = arrayList;
        this.f252832s = new HashMap<>();
        this.f252821e = i4;
        if (i2 < 0) {
            throw new IllegalStateException("Maximal size of the byte array stream should be >0");
        } else if (i4 >= 0) {
            this.f252822f = i2;
            mo121619b();
            mo121619b();
            arrayList.add(new byte[0]);
            this.f252825i = 0;
            this.f252823g = 0;
            this.f252824h = 0;
            this.f252826j = i2;
            int i5 = C80027f.f234457a;
            this.f252830q = i;
            try {
                this.f252829p = gVar;
            } catch (Exception unused) {
            }
            this.f252833t = aVar;
            this.f252831r = i3;
        } else {
            throw new IllegalStateException("Initial size of the byte array stream should be >0");
        }
    }

    /* renamed from: a */
    public final void mo121618a(int i) {
        int i2 = this.f252825i;
        if (i2 == -1 || (i2 == ((ArrayList) this.f252820d).size() - 1 && this.f252826j == this.f252824h)) {
            this.f252824h = 0;
            this.f252825i++;
        }
        if (this.f252826j < this.f252822f) {
            int i3 = ((ArrayList) this.f252820d).size() + -1 == -1 ? this.f252821e : this.f252826j << 1;
            if (i3 < 0 || i3 > 10485760) {
                i3 = 10485760;
            }
            int i4 = this.f252826j;
            int i5 = i4 + i3;
            int i6 = this.f252822f;
            if (i5 > i6) {
                i3 = i6 - i4;
            }
            if (i == -1 || i3 >= i) {
                i = i3;
            } else if (i4 + i >= i6) {
                throw new RuntimeException("Maximal size of the byte array stream was reached. (Max size = " + this.f252822f + ")");
            }
            ((ArrayList) this.f252820d).add(new byte[i]);
            return;
        }
        throw new RuntimeException("Maximal size of the byte array stream was reached. (Max size = " + this.f252822f + ")");
    }

    /* renamed from: b */
    public final void mo121619b() {
        this.f252820d.clear();
        this.f252823g = 0;
        this.f252824h = 0;
        this.f252825i = -1;
        this.f252826j = 0;
        this.f252827n = -1;
        Log.m106505i("ByteArrayStreamTest", "init , fileName = " + this.f252828o);
    }

    /* renamed from: c */
    public final void mo121620c() {
        int i = this.f252827n;
        if (i != -1) {
            if (this.f252823g == i) {
                this.f252827n = -1;
            } else if (i > this.f252826j) {
                mo121623e((long) i, true);
                this.f252827n = -1;
            } else {
                int i2 = 0;
                for (int i3 = 0; i3 < ((ArrayList) this.f252820d).size(); i3++) {
                    int i4 = this.f252826j;
                    i2 += i4;
                    int i5 = this.f252827n;
                    if (i2 > i5) {
                        this.f252825i = i3;
                        this.f252824h = i4 - (i2 - i5);
                        this.f252823g = i5;
                        this.f252827n = -1;
                        return;
                    }
                }
                this.f252825i = ((ArrayList) this.f252820d).size() - 1;
                int i6 = this.f252826j;
                this.f252824h = i6;
                this.f252823g = i6;
                this.f252827n = -1;
            }
        }
    }

    public void close() {
    }

    /* renamed from: d */
    public synchronized void mo121622d(byte[] bArr, boolean z) {
        mo121619b();
        int length = bArr.length;
        if (z) {
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            bArr = bArr2;
        }
        ((ArrayList) this.f252820d).add(bArr);
        this.f252825i = 0;
        this.f252823g = 0;
        this.f252824h = 0;
        this.f252826j = length;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: e */
    public final synchronized void mo121623e(long r6, boolean r8) {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x0011
            monitor-enter(r5)     // Catch:{ all -> 0x00dd }
            r5.mo121619b()     // Catch:{ all -> 0x000e }
            monitor-exit(r5)     // Catch:{ all -> 0x00dd }
            monitor-exit(r5)
            return
        L_0x000e:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00dd }
            throw r6     // Catch:{ all -> 0x00dd }
        L_0x0011:
            int r0 = r5.f252822f     // Catch:{ all -> 0x00dd }
            long r0 = (long) r0     // Catch:{ all -> 0x00dd }
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x00b7
            int r0 = r5.f252826j     // Catch:{ all -> 0x00dd }
            long r1 = (long) r0     // Catch:{ all -> 0x00dd }
            r3 = 0
            int r4 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r4 <= 0) goto L_0x005f
            if (r0 != 0) goto L_0x0030
            java.util.List<byte[]> r0 = r5.f252820d     // Catch:{ all -> 0x00dd }
            int r1 = (int) r6     // Catch:{ all -> 0x00dd }
            byte[] r2 = new byte[r1]     // Catch:{ all -> 0x00dd }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ all -> 0x00dd }
            r0.add(r2)     // Catch:{ all -> 0x00dd }
            r5.f252825i = r3     // Catch:{ all -> 0x00dd }
            r5.f252826j = r1     // Catch:{ all -> 0x00dd }
        L_0x0030:
            int r0 = r5.f252826j     // Catch:{ all -> 0x00dd }
            long r1 = (long) r0     // Catch:{ all -> 0x00dd }
            long r1 = r6 - r1
            int r2 = (int) r1     // Catch:{ all -> 0x00dd }
            if (r0 >= r2) goto L_0x0045
            int r1 = r0 + r0
            r5.f252826j = r1     // Catch:{ all -> 0x00dd }
            int r2 = r2 - r0
            r5.mo121618a(r2)     // Catch:{ all -> 0x00dd }
            if (r8 == 0) goto L_0x004b
            r5.f252824h = r2     // Catch:{ all -> 0x00dd }
            goto L_0x004b
        L_0x0045:
            if (r8 == 0) goto L_0x004b
            int r0 = r0 - r0
            int r0 = r0 + r2
            r5.f252824h = r0     // Catch:{ all -> 0x00dd }
        L_0x004b:
            if (r8 == 0) goto L_0x005c
            java.util.List<byte[]> r8 = r5.f252820d     // Catch:{ all -> 0x00dd }
            java.util.ArrayList r8 = (java.util.ArrayList) r8     // Catch:{ all -> 0x00dd }
            int r8 = r8.size()     // Catch:{ all -> 0x00dd }
            int r8 = r8 + -1
            r5.f252825i = r8     // Catch:{ all -> 0x00dd }
            int r8 = (int) r6     // Catch:{ all -> 0x00dd }
            r5.f252823g = r8     // Catch:{ all -> 0x00dd }
        L_0x005c:
            int r8 = (int) r6     // Catch:{ all -> 0x00dd }
            r5.f252826j = r8     // Catch:{ all -> 0x00dd }
        L_0x005f:
            int r8 = r5.f252826j     // Catch:{ all -> 0x00dd }
            long r0 = (long) r8     // Catch:{ all -> 0x00dd }
            int r8 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r8 >= 0) goto L_0x00b5
            r8 = 0
        L_0x0067:
            java.util.List<byte[]> r0 = r5.f252820d     // Catch:{ all -> 0x00dd }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ all -> 0x00dd }
            int r0 = r0.size()     // Catch:{ all -> 0x00dd }
            if (r3 >= r0) goto L_0x00b5
            int r0 = r5.f252826j     // Catch:{ all -> 0x00dd }
            int r8 = r8 + r0
            long r0 = (long) r8     // Catch:{ all -> 0x00dd }
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 < 0) goto L_0x00b2
            java.util.List<byte[]> r0 = r5.f252820d     // Catch:{ all -> 0x00dd }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ all -> 0x00dd }
            int r0 = r0.size()     // Catch:{ all -> 0x00dd }
            int r0 = r0 + -1
        L_0x0083:
            if (r0 <= r3) goto L_0x008f
            java.util.List<byte[]> r1 = r5.f252820d     // Catch:{ all -> 0x00dd }
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ all -> 0x00dd }
            r1.remove(r0)     // Catch:{ all -> 0x00dd }
            int r0 = r0 + -1
            goto L_0x0083
        L_0x008f:
            int r0 = r5.f252827n     // Catch:{ all -> 0x00dd }
            r1 = -1
            if (r0 == r1) goto L_0x009d
            long r0 = (long) r0     // Catch:{ all -> 0x00dd }
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x009d
            int r0 = (int) r6     // Catch:{ all -> 0x00dd }
            r5.f252827n = r0     // Catch:{ all -> 0x00dd }
            goto L_0x00af
        L_0x009d:
            int r0 = r5.f252823g     // Catch:{ all -> 0x00dd }
            long r0 = (long) r0     // Catch:{ all -> 0x00dd }
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x00af
            int r0 = (int) r6     // Catch:{ all -> 0x00dd }
            r5.f252823g = r0     // Catch:{ all -> 0x00dd }
            int r0 = r0 - r8
            int r1 = r5.f252826j     // Catch:{ all -> 0x00dd }
            int r0 = r0 + r1
            r5.f252824h = r0     // Catch:{ all -> 0x00dd }
            r5.f252825i = r3     // Catch:{ all -> 0x00dd }
        L_0x00af:
            int r0 = (int) r6     // Catch:{ all -> 0x00dd }
            r5.f252826j = r0     // Catch:{ all -> 0x00dd }
        L_0x00b2:
            int r3 = r3 + 1
            goto L_0x0067
        L_0x00b5:
            monitor-exit(r5)
            return
        L_0x00b7:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException     // Catch:{ all -> 0x00dd }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00dd }
            r0.<init>()     // Catch:{ all -> 0x00dd }
            java.lang.String r1 = "Maximal size of the byte array stream was reached by setSize("
            r0.append(r1)     // Catch:{ all -> 0x00dd }
            r0.append(r6)     // Catch:{ all -> 0x00dd }
            java.lang.String r6 = "). Maximal size is "
            r0.append(r6)     // Catch:{ all -> 0x00dd }
            int r6 = r5.f252822f     // Catch:{ all -> 0x00dd }
            r0.append(r6)     // Catch:{ all -> 0x00dd }
            java.lang.String r6 = " bytes"
            r0.append(r6)     // Catch:{ all -> 0x00dd }
            java.lang.String r6 = r0.toString()     // Catch:{ all -> 0x00dd }
            r8.<init>(r6)     // Catch:{ all -> 0x00dd }
            throw r8     // Catch:{ all -> 0x00dd }
        L_0x00dd:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: gf0.C87178a.mo121623e(long, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int read(byte[] r10) {
        /*
            r9 = this;
            int r0 = r10.length
            monitor-enter(r9)
            r1 = 0
            if (r0 < 0) goto L_0x00f3
            int r2 = r10.length     // Catch:{ all -> 0x0117 }
            int r3 = r1 + r0
            if (r2 < r3) goto L_0x00f3
            int r2 = r9.f252827n     // Catch:{ all -> 0x0117 }
            int r3 = r9.f252826j     // Catch:{ all -> 0x0117 }
            if (r2 <= r3) goto L_0x0013
            monitor-exit(r9)
            goto L_0x00f2
        L_0x0013:
            r9.mo121620c()     // Catch:{ all -> 0x0117 }
            int r2 = r9.f252823g     // Catch:{ all -> 0x0117 }
            int r3 = r2 + r0
            int r4 = r9.f252826j     // Catch:{ all -> 0x0117 }
            if (r3 <= r4) goto L_0x0020
            int r0 = r4 - r2
        L_0x0020:
            r3 = 1
            cf0.g r4 = r9.f252829p     // Catch:{ Exception -> 0x008c }
            int r5 = r9.f252830q     // Catch:{ Exception -> 0x008c }
            int r5 = r5 + r2
            long r5 = (long) r5     // Catch:{ Exception -> 0x008c }
            long r7 = (long) r0     // Catch:{ Exception -> 0x008c }
            r4.mo110269a(r5, r7)     // Catch:{ Exception -> 0x008c }
            if (r0 <= 0) goto L_0x00a4
            int r2 = r9.f252826j     // Catch:{ Exception -> 0x008c }
            int r4 = r9.f252824h     // Catch:{ Exception -> 0x008c }
            int r4 = r2 - r4
            if (r0 <= r4) goto L_0x0036
            goto L_0x0037
        L_0x0036:
            r4 = r0
        L_0x0037:
            cf0.g r5 = r9.f252829p     // Catch:{ IOException -> 0x0059, Exception -> 0x0041 }
            r5.getClass()     // Catch:{ IOException -> 0x0059, Exception -> 0x0041 }
            int r6 = r10.length     // Catch:{ IOException -> 0x0059, Exception -> 0x0041 }
            r5.read(r10, r1, r6)     // Catch:{ IOException -> 0x0059, Exception -> 0x0041 }
            goto L_0x0070
        L_0x0041:
            r10 = move-exception
            java.lang.String r5 = "ByteArrayStreamTestDiff"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x008c }
            r6.<init>()     // Catch:{ Exception -> 0x008c }
            java.lang.String r7 = "Exception， read1 = "
            r6.append(r7)     // Catch:{ Exception -> 0x008c }
            r6.append(r10)     // Catch:{ Exception -> 0x008c }
            java.lang.String r10 = r6.toString()     // Catch:{ Exception -> 0x008c }
            com.tencent.stubs.logger.Log.m106497e(r5, r10)     // Catch:{ Exception -> 0x008c }
            goto L_0x0070
        L_0x0059:
            r10 = move-exception
            java.lang.String r5 = "ByteArrayStreamTestDiff"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x008c }
            r6.<init>()     // Catch:{ Exception -> 0x008c }
            java.lang.String r7 = "IOException， read1 = "
            r6.append(r7)     // Catch:{ Exception -> 0x008c }
            r6.append(r10)     // Catch:{ Exception -> 0x008c }
            java.lang.String r10 = r6.toString()     // Catch:{ Exception -> 0x008c }
            com.tencent.stubs.logger.Log.m106497e(r5, r10)     // Catch:{ Exception -> 0x008c }
        L_0x0070:
            int r10 = r9.f252824h     // Catch:{ Exception -> 0x008c }
            int r10 = r10 + r4
            r9.f252824h = r10     // Catch:{ Exception -> 0x008c }
            if (r10 < r2) goto L_0x00a4
            int r10 = r9.f252825i     // Catch:{ Exception -> 0x008c }
            java.util.List<byte[]> r2 = r9.f252820d     // Catch:{ Exception -> 0x008c }
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ Exception -> 0x008c }
            int r2 = r2.size()     // Catch:{ Exception -> 0x008c }
            int r2 = r2 - r3
            if (r10 >= r2) goto L_0x00a4
            int r10 = r9.f252825i     // Catch:{ Exception -> 0x008c }
            int r10 = r10 + r3
            r9.f252825i = r10     // Catch:{ Exception -> 0x008c }
            r9.f252824h = r1     // Catch:{ Exception -> 0x008c }
            goto L_0x00a4
        L_0x008c:
            r10 = move-exception
            java.lang.String r2 = "ByteArrayStreamTestDiff"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0117 }
            r4.<init>()     // Catch:{ all -> 0x0117 }
            java.lang.String r5 = "read = "
            r4.append(r5)     // Catch:{ all -> 0x0117 }
            r4.append(r10)     // Catch:{ all -> 0x0117 }
            java.lang.String r10 = r4.toString()     // Catch:{ all -> 0x0117 }
            com.tencent.stubs.logger.Log.m106497e(r2, r10)     // Catch:{ all -> 0x0117 }
        L_0x00a4:
            int r10 = r9.f252823g     // Catch:{ all -> 0x0117 }
            int r10 = r10 + r0
            r9.f252823g = r10     // Catch:{ all -> 0x0117 }
            java.util.HashMap<java.lang.String, java.lang.Integer> r10 = r9.f252832s     // Catch:{ all -> 0x0117 }
            java.lang.String r2 = r9.f252828o     // Catch:{ all -> 0x0117 }
            java.lang.Object r10 = r10.get(r2)     // Catch:{ all -> 0x0117 }
            if (r10 == 0) goto L_0x00ca
            java.util.HashMap<java.lang.String, java.lang.Integer> r10 = r9.f252832s     // Catch:{ all -> 0x0117 }
            java.lang.String r2 = r9.f252828o     // Catch:{ all -> 0x0117 }
            java.lang.Object r4 = r10.get(r2)     // Catch:{ all -> 0x0117 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x0117 }
            int r4 = r4.intValue()     // Catch:{ all -> 0x0117 }
            int r4 = r4 + r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0117 }
            r10.put(r2, r3)     // Catch:{ all -> 0x0117 }
            goto L_0x00d5
        L_0x00ca:
            java.util.HashMap<java.lang.String, java.lang.Integer> r10 = r9.f252832s     // Catch:{ all -> 0x0117 }
            java.lang.String r2 = r9.f252828o     // Catch:{ all -> 0x0117 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0117 }
            r10.put(r2, r3)     // Catch:{ all -> 0x0117 }
        L_0x00d5:
            if (r0 != 0) goto L_0x00f0
            byte[] r10 = new byte[r1]     // Catch:{ all -> 0x0117 }
            r9.mo121622d(r10, r1)     // Catch:{ all -> 0x0117 }
            java.util.HashMap<java.lang.String, java.lang.Integer> r10 = r9.f252832s     // Catch:{ all -> 0x0117 }
            java.lang.String r1 = r9.f252828o     // Catch:{ all -> 0x0117 }
            r10.remove(r1)     // Catch:{ all -> 0x0117 }
            gf0.a$a r10 = r9.f252833t     // Catch:{ all -> 0x0117 }
            if (r10 == 0) goto L_0x00f0
            int r1 = r9.f252831r     // Catch:{ all -> 0x0117 }
            java.lang.String r2 = r9.f252828o     // Catch:{ all -> 0x0117 }
            gf0.f r10 = (gf0.C87184f) r10     // Catch:{ all -> 0x0117 }
            r10.mo121628b(r1, r2)     // Catch:{ all -> 0x0117 }
        L_0x00f0:
            monitor-exit(r9)
            r1 = r0
        L_0x00f2:
            return r1
        L_0x00f3:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0117 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0117 }
            r2.<init>()     // Catch:{ all -> 0x0117 }
            java.lang.String r3 = "Invalid start position ("
            r2.append(r3)     // Catch:{ all -> 0x0117 }
            r2.append(r1)     // Catch:{ all -> 0x0117 }
            java.lang.String r1 = ") and length ("
            r2.append(r1)     // Catch:{ all -> 0x0117 }
            r2.append(r0)     // Catch:{ all -> 0x0117 }
            java.lang.String r0 = ")"
            r2.append(r0)     // Catch:{ all -> 0x0117 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0117 }
            r10.<init>(r0)     // Catch:{ all -> 0x0117 }
            throw r10     // Catch:{ all -> 0x0117 }
        L_0x0117:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: gf0.C87178a.read(byte[]):int");
    }

    public synchronized long seek(long j, int i) {
        int i2;
        if (i != 0) {
            if (i == 1) {
                i2 = this.f252827n;
                if (i2 == -1) {
                    i2 = this.f252823g;
                }
            } else if (i == 2) {
                try {
                    i2 = this.f252826j;
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                throw new SevenZipException("Seek: unknown origin: " + i);
            }
            j += (long) i2;
        }
        if (j <= ((long) this.f252822f)) {
            this.f252827n = (int) j;
        } else {
            throw new RuntimeException("Maximal size of the byte array stream was reached by seek to " + j + ", maximal size is " + this.f252822f + " bytes");
        }
        return j;
    }

    public synchronized void setSize(long j) {
        mo121623e(j, false);
    }

    public int write(byte[] bArr) {
        return bArr.length;
    }
}
