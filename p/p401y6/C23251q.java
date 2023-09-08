package p401y6;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.util.Arrays;
import p401y6.C23227d;

/* renamed from: y6.q */
public final class C23251q implements C23227d {

    /* renamed from: b */
    public int f66806b = -1;

    /* renamed from: c */
    public int f66807c = -1;

    /* renamed from: d */
    public C23250p f66808d;

    /* renamed from: e */
    public float f66809e = 1.0f;

    /* renamed from: f */
    public float f66810f = 1.0f;

    /* renamed from: g */
    public ByteBuffer f66811g;

    /* renamed from: h */
    public ShortBuffer f66812h;

    /* renamed from: i */
    public ByteBuffer f66813i;

    /* renamed from: j */
    public long f66814j;

    /* renamed from: k */
    public long f66815k;

    /* renamed from: l */
    public boolean f66816l;

    public C23251q() {
        ByteBuffer byteBuffer = C23227d.f66676a;
        this.f66811g = byteBuffer;
        this.f66812h = byteBuffer.asShortBuffer();
        this.f66813i = byteBuffer;
    }

    /* renamed from: a */
    public boolean mo36678a() {
        return Math.abs(this.f66809e - 1.0f) >= 0.01f || Math.abs(this.f66810f - 1.0f) >= 0.01f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f66808d;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo36679b() {
        /*
            r1 = this;
            boolean r0 = r1.f66816l
            if (r0 == 0) goto L_0x000e
            y6.p r0 = r1.f66808d
            if (r0 == 0) goto L_0x000c
            int r0 = r0.f66799r
            if (r0 != 0) goto L_0x000e
        L_0x000c:
            r0 = 1
            goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p401y6.C23251q.mo36679b():boolean");
    }

    /* renamed from: c */
    public int mo36680c() {
        return this.f66806b;
    }

    /* renamed from: d */
    public ByteBuffer mo36681d() {
        ByteBuffer byteBuffer = this.f66813i;
        this.f66813i = C23227d.f66676a;
        return byteBuffer;
    }

    /* renamed from: e */
    public boolean mo36682e(int i, int i2, int i3) {
        if (i3 != 2) {
            throw new C23227d.C23228a(i, i2, i3);
        } else if (this.f66807c == i && this.f66806b == i2) {
            return false;
        } else {
            this.f66807c = i;
            this.f66806b = i2;
            return true;
        }
    }

    /* renamed from: f */
    public void mo36683f(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f66814j += (long) remaining;
            C23250p pVar = this.f66808d;
            pVar.getClass();
            int remaining2 = asShortBuffer.remaining();
            int i = pVar.f66783b;
            int i2 = remaining2 / i;
            int i3 = i * i2 * 2;
            int i4 = pVar.f66798q + i2;
            int i5 = pVar.f66788g;
            if (i4 > i5) {
                int i6 = i5 + (i5 / 2) + i2;
                pVar.f66788g = i6;
                pVar.f66789h = Arrays.copyOf(pVar.f66789h, i6 * i);
            }
            asShortBuffer.get(pVar.f66789h, pVar.f66798q * pVar.f66783b, i3 / 2);
            pVar.f66798q += i2;
            pVar.mo36717e();
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        int i7 = this.f66808d.f66799r * this.f66806b * 2;
        if (i7 > 0) {
            if (this.f66811g.capacity() < i7) {
                ByteBuffer order = ByteBuffer.allocateDirect(i7).order(ByteOrder.nativeOrder());
                this.f66811g = order;
                this.f66812h = order.asShortBuffer();
            } else {
                this.f66811g.clear();
                this.f66812h.clear();
            }
            C23250p pVar2 = this.f66808d;
            ShortBuffer shortBuffer = this.f66812h;
            pVar2.getClass();
            int min = Math.min(shortBuffer.remaining() / pVar2.f66783b, pVar2.f66799r);
            shortBuffer.put(pVar2.f66791j, 0, pVar2.f66783b * min);
            int i8 = pVar2.f66799r - min;
            pVar2.f66799r = i8;
            short[] sArr = pVar2.f66791j;
            int i9 = pVar2.f66783b;
            System.arraycopy(sArr, min * i9, sArr, 0, i8 * i9);
            this.f66815k += (long) i7;
            this.f66811g.limit(i7);
            this.f66813i = this.f66811g;
        }
    }

    public void flush() {
        C23250p pVar = new C23250p(this.f66807c, this.f66806b);
        this.f66808d = pVar;
        pVar.f66796o = this.f66809e;
        pVar.f66797p = this.f66810f;
        this.f66813i = C23227d.f66676a;
        this.f66814j = 0;
        this.f66815k = 0;
        this.f66816l = false;
    }

    /* renamed from: g */
    public int mo36685g() {
        return 2;
    }

    /* renamed from: h */
    public void mo36686h() {
        int i;
        C23250p pVar = this.f66808d;
        int i2 = pVar.f66798q;
        float f = pVar.f66796o;
        float f2 = pVar.f66797p;
        int i3 = pVar.f66799r + ((int) ((((((float) i2) / (f / f2)) + ((float) pVar.f66800s)) / f2) + 0.5f));
        int i4 = (pVar.f66786e * 2) + i2;
        int i5 = i2 + i4;
        int i6 = pVar.f66788g;
        if (i5 > i6) {
            int i7 = i6 + (i6 / 2) + i4;
            pVar.f66788g = i7;
            pVar.f66789h = Arrays.copyOf(pVar.f66789h, i7 * pVar.f66783b);
        }
        int i8 = 0;
        while (true) {
            i = pVar.f66786e * 2;
            int i9 = pVar.f66783b;
            if (i8 >= i * i9) {
                break;
            }
            pVar.f66789h[(i9 * i2) + i8] = 0;
            i8++;
        }
        pVar.f66798q += i;
        pVar.mo36717e();
        if (pVar.f66799r > i3) {
            pVar.f66799r = i3;
        }
        pVar.f66798q = 0;
        pVar.f66801t = 0;
        pVar.f66800s = 0;
        this.f66816l = true;
    }

    public void reset() {
        this.f66808d = null;
        ByteBuffer byteBuffer = C23227d.f66676a;
        this.f66811g = byteBuffer;
        this.f66812h = byteBuffer.asShortBuffer();
        this.f66813i = byteBuffer;
        this.f66806b = -1;
        this.f66807c = -1;
        this.f66814j = 0;
        this.f66815k = 0;
        this.f66816l = false;
    }
}
