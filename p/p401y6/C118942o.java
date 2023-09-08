package p401y6;

import java.nio.ByteBuffer;
import p401y6.C23227d;

/* renamed from: y6.o */
public final class C118942o implements C23227d {

    /* renamed from: b */
    public int f356257b = -1;

    /* renamed from: c */
    public int f356258c = -1;

    /* renamed from: d */
    public int f356259d = 0;

    /* renamed from: e */
    public ByteBuffer f356260e;

    /* renamed from: f */
    public ByteBuffer f356261f;

    /* renamed from: g */
    public boolean f356262g;

    public C118942o() {
        ByteBuffer byteBuffer = C23227d.f66676a;
        this.f356260e = byteBuffer;
        this.f356261f = byteBuffer;
    }

    /* renamed from: a */
    public boolean mo36678a() {
        int i = this.f356259d;
        return (i == 0 || i == 2) ? false : true;
    }

    /* renamed from: b */
    public boolean mo36679b() {
        return this.f356262g && this.f356261f == C23227d.f66676a;
    }

    /* renamed from: c */
    public int mo36680c() {
        return this.f356258c;
    }

    /* renamed from: d */
    public ByteBuffer mo36681d() {
        ByteBuffer byteBuffer = this.f356261f;
        this.f356261f = C23227d.f66676a;
        return byteBuffer;
    }

    /* renamed from: e */
    public boolean mo36682e(int i, int i2, int i3) {
        if (i3 != 3 && i3 != 2 && i3 != Integer.MIN_VALUE && i3 != 1073741824) {
            throw new C23227d.C23228a(i, i2, i3);
        } else if (this.f356257b == i && this.f356258c == i2 && this.f356259d == i3) {
            return false;
        } else {
            this.f356257b = i;
            this.f356258c = i2;
            this.f356259d = i3;
            if (i3 != 2) {
                return true;
            }
            this.f356260e = C23227d.f66676a;
            return true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0081 A[LOOP:2: B:23:0x0081->B:24:0x0083, LOOP_START, PHI: r0 
      PHI: (r0v2 int) = (r0v0 int), (r0v3 int) binds: [B:14:0x0041, B:24:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo36683f(java.nio.ByteBuffer r8) {
        /*
            r7 = this;
            int r0 = r8.position()
            int r1 = r8.limit()
            int r2 = r1 - r0
            int r3 = r7.f356259d
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 3
            if (r3 == r5) goto L_0x0020
            if (r3 == r6) goto L_0x0021
            if (r3 != r4) goto L_0x001a
            int r2 = r2 / 2
            goto L_0x0023
        L_0x001a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L_0x0020:
            int r2 = r2 / r6
        L_0x0021:
            int r2 = r2 * 2
        L_0x0023:
            java.nio.ByteBuffer r3 = r7.f356260e
            int r3 = r3.capacity()
            if (r3 >= r2) goto L_0x003a
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocateDirect(r2)
            java.nio.ByteOrder r3 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r2 = r2.order(r3)
            r7.f356260e = r2
            goto L_0x003f
        L_0x003a:
            java.nio.ByteBuffer r2 = r7.f356260e
            r2.clear()
        L_0x003f:
            int r2 = r7.f356259d
            if (r2 == r5) goto L_0x0081
            if (r2 == r6) goto L_0x0068
            if (r2 != r4) goto L_0x0062
        L_0x0047:
            if (r0 >= r1) goto L_0x009c
            java.nio.ByteBuffer r2 = r7.f356260e
            int r3 = r0 + 2
            byte r3 = r8.get(r3)
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f356260e
            int r3 = r0 + 3
            byte r3 = r8.get(r3)
            r2.put(r3)
            int r0 = r0 + 4
            goto L_0x0047
        L_0x0062:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L_0x0068:
            if (r0 >= r1) goto L_0x009c
            java.nio.ByteBuffer r2 = r7.f356260e
            r3 = 0
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f356260e
            byte r3 = r8.get(r0)
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 + -128
            byte r3 = (byte) r3
            r2.put(r3)
            int r0 = r0 + 1
            goto L_0x0068
        L_0x0081:
            if (r0 >= r1) goto L_0x009c
            java.nio.ByteBuffer r2 = r7.f356260e
            int r3 = r0 + 1
            byte r3 = r8.get(r3)
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f356260e
            int r3 = r0 + 2
            byte r3 = r8.get(r3)
            r2.put(r3)
            int r0 = r0 + 3
            goto L_0x0081
        L_0x009c:
            int r0 = r8.limit()
            r8.position(r0)
            java.nio.ByteBuffer r8 = r7.f356260e
            r8.flip()
            java.nio.ByteBuffer r8 = r7.f356260e
            r7.f356261f = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p401y6.C118942o.mo36683f(java.nio.ByteBuffer):void");
    }

    public void flush() {
        this.f356261f = C23227d.f66676a;
        this.f356262g = false;
    }

    /* renamed from: g */
    public int mo36685g() {
        return 2;
    }

    /* renamed from: h */
    public void mo36686h() {
        this.f356262g = true;
    }

    public void reset() {
        flush();
        this.f356260e = C23227d.f66676a;
        this.f356257b = -1;
        this.f356258c = -1;
        this.f356259d = 0;
    }
}
