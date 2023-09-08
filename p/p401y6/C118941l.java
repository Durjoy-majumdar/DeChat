package p401y6;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import p401y6.C23227d;

/* renamed from: y6.l */
public final class C118941l implements C23227d {

    /* renamed from: b */
    public int f356249b = -1;

    /* renamed from: c */
    public int f356250c = -1;

    /* renamed from: d */
    public int[] f356251d;

    /* renamed from: e */
    public boolean f356252e;

    /* renamed from: f */
    public int[] f356253f;

    /* renamed from: g */
    public ByteBuffer f356254g;

    /* renamed from: h */
    public ByteBuffer f356255h;

    /* renamed from: i */
    public boolean f356256i;

    public C118941l() {
        ByteBuffer byteBuffer = C23227d.f66676a;
        this.f356254g = byteBuffer;
        this.f356255h = byteBuffer;
    }

    /* renamed from: a */
    public boolean mo36678a() {
        return this.f356252e;
    }

    /* renamed from: b */
    public boolean mo36679b() {
        return this.f356256i && this.f356255h == C23227d.f66676a;
    }

    /* renamed from: c */
    public int mo36680c() {
        int[] iArr = this.f356253f;
        return iArr == null ? this.f356249b : iArr.length;
    }

    /* renamed from: d */
    public ByteBuffer mo36681d() {
        ByteBuffer byteBuffer = this.f356255h;
        this.f356255h = C23227d.f66676a;
        return byteBuffer;
    }

    /* renamed from: e */
    public boolean mo36682e(int i, int i2, int i3) {
        boolean z = !Arrays.equals(this.f356251d, this.f356253f);
        int[] iArr = this.f356251d;
        this.f356253f = iArr;
        if (iArr == null) {
            this.f356252e = false;
            return z;
        } else if (i3 != 2) {
            throw new C23227d.C23228a(i, i2, i3);
        } else if (!z && this.f356250c == i && this.f356249b == i2) {
            return false;
        } else {
            this.f356250c = i;
            this.f356249b = i2;
            this.f356252e = i2 != iArr.length;
            int i4 = 0;
            while (true) {
                int[] iArr2 = this.f356253f;
                if (i4 >= iArr2.length) {
                    return true;
                }
                int i5 = iArr2[i4];
                if (i5 < i2) {
                    this.f356252e = (i5 != i4) | this.f356252e;
                    i4++;
                } else {
                    throw new C23227d.C23228a(i, i2, i3);
                }
            }
        }
    }

    /* renamed from: f */
    public void mo36683f(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int length = ((limit - position) / (this.f356249b * 2)) * this.f356253f.length * 2;
        if (this.f356254g.capacity() < length) {
            this.f356254g = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
        } else {
            this.f356254g.clear();
        }
        while (position < limit) {
            for (int i : this.f356253f) {
                this.f356254g.putShort(byteBuffer.getShort((i * 2) + position));
            }
            position += this.f356249b * 2;
        }
        byteBuffer.position(limit);
        this.f356254g.flip();
        this.f356255h = this.f356254g;
    }

    public void flush() {
        this.f356255h = C23227d.f66676a;
        this.f356256i = false;
    }

    /* renamed from: g */
    public int mo36685g() {
        return 2;
    }

    /* renamed from: h */
    public void mo36686h() {
        this.f356256i = true;
    }

    public void reset() {
        flush();
        this.f356254g = C23227d.f66676a;
        this.f356249b = -1;
        this.f356250c = -1;
        this.f356253f = null;
        this.f356252e = false;
    }
}
