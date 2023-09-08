package com.google.protobuf;

import androidx.exifinterface.media.ExifInterface;
import com.google.protobuf.C16994k;
import com.google.protobuf.C23845j1;
import com.google.protobuf.C24079y2;
import com.tencent.wxmm.v2encoder;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.protobuf.l */
public abstract class C23856l {

    /* renamed from: a */
    public int f68359a;

    /* renamed from: b */
    public int f68360b = 100;

    /* renamed from: c */
    public int f68361c = Integer.MAX_VALUE;

    /* renamed from: d */
    public C23871m f68362d;

    /* renamed from: com.google.protobuf.l$b */
    public static final class C23858b extends C23856l {

        /* renamed from: e */
        public final byte[] f68363e;

        /* renamed from: f */
        public final boolean f68364f;

        /* renamed from: g */
        public int f68365g;

        /* renamed from: h */
        public int f68366h;

        /* renamed from: i */
        public int f68367i;

        /* renamed from: j */
        public int f68368j;

        /* renamed from: k */
        public int f68369k;

        /* renamed from: l */
        public int f68370l = Integer.MAX_VALUE;

        public C23858b(byte[] bArr, int i, int i2, boolean z, C23857a aVar) {
            this.f68363e = bArr;
            this.f68365g = i2 + i;
            this.f68367i = i;
            this.f68368j = i;
            this.f68364f = z;
        }

        /* renamed from: A */
        public long mo37752A() {
            return mo37782K();
        }

        /* renamed from: B */
        public int mo37753B() {
            return C23856l.m28955b(mo37779x());
        }

        /* renamed from: C */
        public long mo37754C() {
            return C23856l.m28956c(mo37783L());
        }

        /* renamed from: D */
        public String mo37755D() {
            int x = mo37779x();
            if (x > 0) {
                int i = this.f68365g;
                int i2 = this.f68367i;
                if (x <= i - i2) {
                    String str = new String(this.f68363e, i2, x, C23908o0.f68505a);
                    this.f68367i += x;
                    return str;
                }
            }
            if (x == 0) {
                return "";
            }
            if (x < 0) {
                throw C23922p0.m29481f();
            }
            throw C23922p0.m29484i();
        }

        /* renamed from: E */
        public String mo37756E() {
            int x = mo37779x();
            if (x > 0) {
                int i = this.f68365g;
                int i2 = this.f68367i;
                if (x <= i - i2) {
                    String a = C24079y2.f69220a.mo38431a(this.f68363e, i2, x);
                    this.f68367i += x;
                    return a;
                }
            }
            if (x == 0) {
                return "";
            }
            if (x <= 0) {
                throw C23922p0.m29481f();
            }
            throw C23922p0.m29484i();
        }

        /* renamed from: F */
        public int mo37757F() {
            if (mo37764f()) {
                this.f68369k = 0;
                return 0;
            }
            int x = mo37779x();
            this.f68369k = x;
            if ((x >>> 3) != 0) {
                return x;
            }
            throw C23922p0.m29477b();
        }

        /* renamed from: G */
        public int mo37758G() {
            return mo37779x();
        }

        /* renamed from: H */
        public long mo37759H() {
            return mo37783L();
        }

        /* renamed from: I */
        public boolean mo37760I(int i) {
            int F;
            int i2 = i & 7;
            int i3 = 0;
            if (i2 == 0) {
                if (this.f68365g - this.f68367i >= 10) {
                    while (i3 < 10) {
                        byte[] bArr = this.f68363e;
                        int i4 = this.f68367i;
                        this.f68367i = i4 + 1;
                        if (bArr[i4] < 0) {
                            i3++;
                        }
                    }
                    throw C23922p0.m29480e();
                }
                while (i3 < 10) {
                    int i5 = this.f68367i;
                    if (i5 != this.f68365g) {
                        byte[] bArr2 = this.f68363e;
                        this.f68367i = i5 + 1;
                        if (bArr2[i5] < 0) {
                            i3++;
                        }
                    } else {
                        throw C23922p0.m29484i();
                    }
                }
                throw C23922p0.m29480e();
                return true;
            } else if (i2 == 1) {
                mo37785N(8);
                return true;
            } else if (i2 == 2) {
                mo37785N(mo37779x());
                return true;
            } else if (i2 == 3) {
                do {
                    F = mo37757F();
                    if (F == 0 || !mo37760I(F)) {
                        mo37761a(((i >>> 3) << 3) | 4);
                    }
                    F = mo37757F();
                    break;
                } while (!mo37760I(F));
                mo37761a(((i >>> 3) << 3) | 4);
                return true;
            } else if (i2 == 4) {
                return false;
            } else {
                if (i2 == 5) {
                    mo37785N(4);
                    return true;
                }
                throw C23922p0.m29479d();
            }
        }

        /* renamed from: J */
        public int mo37781J() {
            int i = this.f68367i;
            if (this.f68365g - i >= 4) {
                byte[] bArr = this.f68363e;
                this.f68367i = i + 4;
                return ((bArr[i + 3] & ExifInterface.MARKER) << 24) | (bArr[i] & ExifInterface.MARKER) | ((bArr[i + 1] & ExifInterface.MARKER) << 8) | ((bArr[i + 2] & ExifInterface.MARKER) << v2encoder.enumCODEC_vcodec2);
            }
            throw C23922p0.m29484i();
        }

        /* renamed from: K */
        public long mo37782K() {
            int i = this.f68367i;
            if (this.f68365g - i >= 8) {
                byte[] bArr = this.f68363e;
                this.f68367i = i + 8;
                return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
            }
            throw C23922p0.m29484i();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b4, code lost:
            if (((long) r2[r0]) < 0) goto L_0x00b6;
         */
        /* renamed from: L */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long mo37783L() {
            /*
                r11 = this;
                int r0 = r11.f68367i
                int r1 = r11.f68365g
                if (r1 != r0) goto L_0x0008
                goto L_0x00b6
            L_0x0008:
                byte[] r2 = r11.f68363e
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0014
                r11.f68367i = r3
                long r0 = (long) r0
                return r0
            L_0x0014:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x001b
                goto L_0x00b6
            L_0x001b:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0029
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            L_0x0026:
                long r2 = (long) r0
                goto L_0x00bd
            L_0x0029:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x003a
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
                long r0 = (long) r0
                r9 = r0
                r1 = r3
                r2 = r9
                goto L_0x00bd
            L_0x003a:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0048
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0026
            L_0x0048:
                long r3 = (long) r0
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r5 = (long) r1
                r1 = 28
                long r5 = r5 << r1
                long r3 = r3 ^ r5
                r5 = 0
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x005f
                r1 = 266354560(0xfe03f80, double:1.315966377E-315)
            L_0x005b:
                long r2 = r3 ^ r1
                r1 = r0
                goto L_0x00bd
            L_0x005f:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 35
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x0074
                r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
            L_0x0071:
                long r2 = r3 ^ r5
                goto L_0x00bd
            L_0x0074:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 42
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x0087
                r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
                goto L_0x005b
            L_0x0087:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 49
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x009a
                r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
                goto L_0x0071
            L_0x009a:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 56
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 >= 0) goto L_0x00bb
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x00bc
            L_0x00b6:
                long r0 = r11.mo37784M()
                return r0
            L_0x00bb:
                r1 = r0
            L_0x00bc:
                r2 = r3
            L_0x00bd:
                r11.f68367i = r1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C23856l.C23858b.mo37783L():long");
        }

        /* renamed from: M */
        public long mo37784M() {
            long j = 0;
            int i = 0;
            while (i < 64) {
                int i2 = this.f68367i;
                if (i2 != this.f68365g) {
                    byte[] bArr = this.f68363e;
                    this.f68367i = i2 + 1;
                    byte b = bArr[i2];
                    j |= ((long) (b & Byte.MAX_VALUE)) << i;
                    if ((b & 128) == 0) {
                        return j;
                    }
                    i += 7;
                } else {
                    throw C23922p0.m29484i();
                }
            }
            throw C23922p0.m29480e();
        }

        /* renamed from: N */
        public void mo37785N(int i) {
            if (i >= 0) {
                int i2 = this.f68365g;
                int i3 = this.f68367i;
                if (i <= i2 - i3) {
                    this.f68367i = i3 + i;
                    return;
                }
            }
            if (i < 0) {
                throw C23922p0.m29481f();
            }
            throw C23922p0.m29484i();
        }

        /* renamed from: a */
        public void mo37761a(int i) {
            if (this.f68369k != i) {
                throw C23922p0.m29476a();
            }
        }

        /* renamed from: d */
        public int mo37762d() {
            int i = this.f68370l;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - (this.f68367i - this.f68368j);
        }

        /* renamed from: e */
        public int mo37763e() {
            return this.f68367i - this.f68368j;
        }

        /* renamed from: f */
        public boolean mo37764f() {
            return this.f68367i == this.f68365g;
        }

        /* renamed from: j */
        public void mo37765j(int i) {
            this.f68370l = i;
            int i2 = this.f68365g + this.f68366h;
            this.f68365g = i2;
            int i3 = i2 - this.f68368j;
            if (i3 > i) {
                int i4 = i3 - i;
                this.f68366h = i4;
                this.f68365g = i2 - i4;
                return;
            }
            this.f68366h = 0;
        }

        /* renamed from: k */
        public int mo37766k(int i) {
            if (i >= 0) {
                int i2 = this.f68367i;
                int i3 = this.f68368j;
                int i4 = i + (i2 - i3);
                int i5 = this.f68370l;
                if (i4 <= i5) {
                    this.f68370l = i4;
                    int i6 = this.f68365g + this.f68366h;
                    this.f68365g = i6;
                    int i7 = i6 - i3;
                    if (i7 > i4) {
                        int i8 = i7 - i4;
                        this.f68366h = i8;
                        this.f68365g = i6 - i8;
                    } else {
                        this.f68366h = 0;
                    }
                    return i5;
                }
                throw C23922p0.m29484i();
            }
            throw C23922p0.m29481f();
        }

        /* renamed from: l */
        public boolean mo37767l() {
            return mo37783L() != 0;
        }

        /* renamed from: m */
        public C16994k mo37768m() {
            byte[] bArr;
            int x = mo37779x();
            if (x > 0) {
                int i = this.f68365g;
                int i2 = this.f68367i;
                if (x <= i - i2) {
                    boolean z = this.f68364f;
                    C16994k i3 = C16994k.m16790i(this.f68363e, i2, x);
                    this.f68367i += x;
                    return i3;
                }
            }
            if (x == 0) {
                return C16994k.f46000e;
            }
            if (x > 0) {
                int i4 = this.f68365g;
                int i5 = this.f68367i;
                if (x <= i4 - i5) {
                    int i6 = x + i5;
                    this.f68367i = i6;
                    bArr = Arrays.copyOfRange(this.f68363e, i5, i6);
                    C16994k kVar = C16994k.f46000e;
                    return new C16994k.C17000f(bArr);
                }
            }
            if (x > 0) {
                throw C23922p0.m29484i();
            } else if (x == 0) {
                bArr = C23908o0.f68507c;
                C16994k kVar2 = C16994k.f46000e;
                return new C16994k.C17000f(bArr);
            } else {
                throw C23922p0.m29481f();
            }
        }

        /* renamed from: n */
        public double mo37769n() {
            return Double.longBitsToDouble(mo37782K());
        }

        /* renamed from: o */
        public int mo37770o() {
            return mo37779x();
        }

        /* renamed from: p */
        public int mo37771p() {
            return mo37781J();
        }

        /* renamed from: q */
        public long mo37772q() {
            return mo37782K();
        }

        /* renamed from: r */
        public float mo37773r() {
            return Float.intBitsToFloat(mo37781J());
        }

        /* renamed from: s */
        public void mo37774s(int i, C23845j1.C23846a aVar, C23806a0 a0Var) {
            int i2 = this.f68359a;
            if (i2 < this.f68360b) {
                this.f68359a = i2 + 1;
                aVar.mergeFrom(this, a0Var);
                mo37761a((i << 3) | 4);
                this.f68359a--;
                return;
            }
            throw C23922p0.m29483h();
        }

        /* renamed from: t */
        public int mo37775t() {
            return mo37779x();
        }

        /* renamed from: u */
        public long mo37776u() {
            return mo37783L();
        }

        /* renamed from: v */
        public <T extends C23845j1> T mo37777v(C24062w1<T> w1Var, C23806a0 a0Var) {
            int x = mo37779x();
            if (this.f68359a < this.f68360b) {
                int k = mo37766k(x);
                this.f68359a++;
                T t = (C23845j1) w1Var.parsePartialFrom(this, a0Var);
                mo37761a(0);
                this.f68359a--;
                mo37765j(k);
                return t;
            }
            throw C23922p0.m29483h();
        }

        /* renamed from: w */
        public void mo37778w(C23845j1.C23846a aVar, C23806a0 a0Var) {
            int x = mo37779x();
            if (this.f68359a < this.f68360b) {
                int k = mo37766k(x);
                this.f68359a++;
                aVar.mergeFrom(this, a0Var);
                mo37761a(0);
                this.f68359a--;
                mo37765j(k);
                return;
            }
            throw C23922p0.m29483h();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
            if (r2[r3] < 0) goto L_0x006a;
         */
        /* renamed from: x */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo37779x() {
            /*
                r5 = this;
                int r0 = r5.f68367i
                int r1 = r5.f68365g
                if (r1 != r0) goto L_0x0007
                goto L_0x006a
            L_0x0007:
                byte[] r2 = r5.f68363e
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0012
                r5.f68367i = r3
                return r0
            L_0x0012:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x0018
                goto L_0x006a
            L_0x0018:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0024
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x0070
            L_0x0024:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x0031
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x002f:
                r1 = r3
                goto L_0x0070
            L_0x0031:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x003f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0070
            L_0x003f:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r2 = r2[r3]
                if (r2 >= 0) goto L_0x0070
            L_0x006a:
                long r0 = r5.mo37784M()
                int r1 = (int) r0
                return r1
            L_0x0070:
                r5.f68367i = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C23856l.C23858b.mo37779x():int");
        }

        /* renamed from: z */
        public int mo37780z() {
            return mo37781J();
        }
    }

    /* renamed from: com.google.protobuf.l$c */
    public static final class C23859c extends C23856l {

        /* renamed from: e */
        public final InputStream f68371e;

        /* renamed from: f */
        public final byte[] f68372f;

        /* renamed from: g */
        public int f68373g;

        /* renamed from: h */
        public int f68374h;

        /* renamed from: i */
        public int f68375i;

        /* renamed from: j */
        public int f68376j;

        /* renamed from: k */
        public int f68377k;

        /* renamed from: l */
        public int f68378l = Integer.MAX_VALUE;

        public C23859c(InputStream inputStream, int i, C23857a aVar) {
            Charset charset = C23908o0.f68505a;
            if (inputStream != null) {
                this.f68371e = inputStream;
                this.f68372f = new byte[i];
                this.f68373g = 0;
                this.f68375i = 0;
                this.f68377k = 0;
                return;
            }
            throw new NullPointerException("input");
        }

        /* renamed from: A */
        public long mo37752A() {
            return mo37790N();
        }

        /* renamed from: B */
        public int mo37753B() {
            return C23856l.m28955b(mo37779x());
        }

        /* renamed from: C */
        public long mo37754C() {
            return C23856l.m28956c(mo37791O());
        }

        /* renamed from: D */
        public String mo37755D() {
            int x = mo37779x();
            if (x > 0) {
                int i = this.f68373g;
                int i2 = this.f68375i;
                if (x <= i - i2) {
                    String str = new String(this.f68372f, i2, x, C23908o0.f68505a);
                    this.f68375i += x;
                    return str;
                }
            }
            if (x == 0) {
                return "";
            }
            if (x > this.f68373g) {
                return new String(mo37786J(x, false), C23908o0.f68505a);
            }
            mo37794R(x);
            String str2 = new String(this.f68372f, this.f68375i, x, C23908o0.f68505a);
            this.f68375i += x;
            return str2;
        }

        /* renamed from: E */
        public String mo37756E() {
            byte[] bArr;
            byte[] bArr2;
            int x = mo37779x();
            int i = this.f68375i;
            int i2 = this.f68373g;
            if (x <= i2 - i && x > 0) {
                bArr = this.f68372f;
                this.f68375i = i + x;
            } else if (x == 0) {
                return "";
            } else {
                if (x <= i2) {
                    mo37794R(x);
                    bArr2 = this.f68372f;
                    this.f68375i = x + 0;
                } else {
                    bArr2 = mo37786J(x, false);
                }
                bArr = bArr2;
                i = 0;
            }
            return C24079y2.f69220a.mo38431a(bArr, i, x);
        }

        /* renamed from: F */
        public int mo37757F() {
            if (mo37764f()) {
                this.f68376j = 0;
                return 0;
            }
            int x = mo37779x();
            this.f68376j = x;
            if ((x >>> 3) != 0) {
                return x;
            }
            throw C23922p0.m29477b();
        }

        /* renamed from: G */
        public int mo37758G() {
            return mo37779x();
        }

        /* renamed from: H */
        public long mo37759H() {
            return mo37791O();
        }

        /* renamed from: I */
        public boolean mo37760I(int i) {
            int F;
            int i2 = i & 7;
            int i3 = 0;
            if (i2 == 0) {
                if (this.f68373g - this.f68375i >= 10) {
                    while (i3 < 10) {
                        byte[] bArr = this.f68372f;
                        int i4 = this.f68375i;
                        this.f68375i = i4 + 1;
                        if (bArr[i4] < 0) {
                            i3++;
                        }
                    }
                    throw C23922p0.m29480e();
                }
                while (i3 < 10) {
                    if (this.f68375i == this.f68373g) {
                        mo37794R(1);
                    }
                    byte[] bArr2 = this.f68372f;
                    int i5 = this.f68375i;
                    this.f68375i = i5 + 1;
                    if (bArr2[i5] < 0) {
                        i3++;
                    }
                }
                throw C23922p0.m29480e();
                return true;
            } else if (i2 == 1) {
                mo37795S(8);
                return true;
            } else if (i2 == 2) {
                mo37795S(mo37779x());
                return true;
            } else if (i2 == 3) {
                do {
                    F = mo37757F();
                    if (F == 0 || !mo37760I(F)) {
                        mo37761a(((i >>> 3) << 3) | 4);
                    }
                    F = mo37757F();
                    break;
                } while (!mo37760I(F));
                mo37761a(((i >>> 3) << 3) | 4);
                return true;
            } else if (i2 == 4) {
                return false;
            } else {
                if (i2 == 5) {
                    mo37795S(4);
                    return true;
                }
                throw C23922p0.m29479d();
            }
        }

        /* renamed from: J */
        public final byte[] mo37786J(int i, boolean z) {
            byte[] K = mo37787K(i);
            if (K != null) {
                return z ? (byte[]) K.clone() : K;
            }
            int i2 = this.f68375i;
            int i3 = this.f68373g;
            int i4 = i3 - i2;
            this.f68377k += i3;
            this.f68375i = 0;
            this.f68373g = 0;
            List<byte[]> L = mo37788L(i - i4);
            byte[] bArr = new byte[i];
            System.arraycopy(this.f68372f, i2, bArr, 0, i4);
            Iterator it = ((ArrayList) L).iterator();
            while (it.hasNext()) {
                byte[] bArr2 = (byte[]) it.next();
                System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
                i4 += bArr2.length;
            }
            return bArr;
        }

        /* renamed from: K */
        public final byte[] mo37787K(int i) {
            if (i == 0) {
                return C23908o0.f68507c;
            }
            if (i >= 0) {
                int i2 = this.f68377k;
                int i3 = this.f68375i;
                int i4 = i2 + i3 + i;
                if (i4 - this.f68361c <= 0) {
                    int i5 = this.f68378l;
                    if (i4 <= i5) {
                        int i6 = this.f68373g - i3;
                        int i7 = i - i6;
                        if (i7 >= 4096 && i7 > this.f68371e.available()) {
                            return null;
                        }
                        byte[] bArr = new byte[i];
                        System.arraycopy(this.f68372f, this.f68375i, bArr, 0, i6);
                        this.f68377k += this.f68373g;
                        this.f68375i = 0;
                        this.f68373g = 0;
                        while (i6 < i) {
                            int read = this.f68371e.read(bArr, i6, i - i6);
                            if (read != -1) {
                                this.f68377k += read;
                                i6 += read;
                            } else {
                                throw C23922p0.m29484i();
                            }
                        }
                        return bArr;
                    }
                    mo37795S((i5 - i2) - i3);
                    throw C23922p0.m29484i();
                }
                throw new C23922p0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            throw C23922p0.m29481f();
        }

        /* renamed from: L */
        public final List<byte[]> mo37788L(int i) {
            ArrayList arrayList = new ArrayList();
            while (i > 0) {
                int min = Math.min(i, 4096);
                byte[] bArr = new byte[min];
                int i2 = 0;
                while (i2 < min) {
                    int read = this.f68371e.read(bArr, i2, min - i2);
                    if (read != -1) {
                        this.f68377k += read;
                        i2 += read;
                    } else {
                        throw C23922p0.m29484i();
                    }
                }
                i -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        /* renamed from: M */
        public int mo37789M() {
            int i = this.f68375i;
            if (this.f68373g - i < 4) {
                mo37794R(4);
                i = this.f68375i;
            }
            byte[] bArr = this.f68372f;
            this.f68375i = i + 4;
            return ((bArr[i + 3] & ExifInterface.MARKER) << 24) | (bArr[i] & ExifInterface.MARKER) | ((bArr[i + 1] & ExifInterface.MARKER) << 8) | ((bArr[i + 2] & ExifInterface.MARKER) << v2encoder.enumCODEC_vcodec2);
        }

        /* renamed from: N */
        public long mo37790N() {
            int i = this.f68375i;
            if (this.f68373g - i < 8) {
                mo37794R(8);
                i = this.f68375i;
            }
            byte[] bArr = this.f68372f;
            this.f68375i = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b4, code lost:
            if (((long) r2[r0]) < 0) goto L_0x00b6;
         */
        /* renamed from: O */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long mo37791O() {
            /*
                r11 = this;
                int r0 = r11.f68375i
                int r1 = r11.f68373g
                if (r1 != r0) goto L_0x0008
                goto L_0x00b6
            L_0x0008:
                byte[] r2 = r11.f68372f
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0014
                r11.f68375i = r3
                long r0 = (long) r0
                return r0
            L_0x0014:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x001b
                goto L_0x00b6
            L_0x001b:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0029
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            L_0x0026:
                long r2 = (long) r0
                goto L_0x00bd
            L_0x0029:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x003a
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
                long r0 = (long) r0
                r9 = r0
                r1 = r3
                r2 = r9
                goto L_0x00bd
            L_0x003a:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0048
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0026
            L_0x0048:
                long r3 = (long) r0
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r5 = (long) r1
                r1 = 28
                long r5 = r5 << r1
                long r3 = r3 ^ r5
                r5 = 0
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x005f
                r1 = 266354560(0xfe03f80, double:1.315966377E-315)
            L_0x005b:
                long r2 = r3 ^ r1
                r1 = r0
                goto L_0x00bd
            L_0x005f:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 35
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x0074
                r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
            L_0x0071:
                long r2 = r3 ^ r5
                goto L_0x00bd
            L_0x0074:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 42
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x0087
                r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
                goto L_0x005b
            L_0x0087:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 49
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x009a
                r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
                goto L_0x0071
            L_0x009a:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 56
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 >= 0) goto L_0x00bb
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x00bc
            L_0x00b6:
                long r0 = r11.mo37792P()
                return r0
            L_0x00bb:
                r1 = r0
            L_0x00bc:
                r2 = r3
            L_0x00bd:
                r11.f68375i = r1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C23856l.C23859c.mo37791O():long");
        }

        /* renamed from: P */
        public long mo37792P() {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                if (this.f68375i == this.f68373g) {
                    mo37794R(1);
                }
                byte[] bArr = this.f68372f;
                int i2 = this.f68375i;
                this.f68375i = i2 + 1;
                byte b = bArr[i2];
                j |= ((long) (b & Byte.MAX_VALUE)) << i;
                if ((b & 128) == 0) {
                    return j;
                }
            }
            throw C23922p0.m29480e();
        }

        /* renamed from: Q */
        public final void mo37793Q() {
            int i = this.f68373g + this.f68374h;
            this.f68373g = i;
            int i2 = this.f68377k + i;
            int i3 = this.f68378l;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.f68374h = i4;
                this.f68373g = i - i4;
                return;
            }
            this.f68374h = 0;
        }

        /* renamed from: R */
        public final void mo37794R(int i) {
            if (mo37796T(i)) {
                return;
            }
            if (i > (this.f68361c - this.f68377k) - this.f68375i) {
                throw new C23922p0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            throw C23922p0.m29484i();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x006c, code lost:
            throw new java.lang.IllegalStateException(r5.toString());
         */
        /* renamed from: S */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo37795S(int r9) {
            /*
                r8 = this;
                int r0 = r8.f68373g
                int r1 = r8.f68375i
                int r2 = r0 - r1
                if (r9 > r2) goto L_0x000f
                if (r9 < 0) goto L_0x000f
                int r1 = r1 + r9
                r8.f68375i = r1
                goto L_0x009c
            L_0x000f:
                if (r9 < 0) goto L_0x00a7
                int r2 = r8.f68377k
                int r3 = r2 + r1
                int r4 = r3 + r9
                int r5 = r8.f68378l
                if (r4 > r5) goto L_0x009d
                r8.f68377k = r3
                int r0 = r0 - r1
                r1 = 0
                r8.f68373g = r1
                r8.f68375i = r1
            L_0x0023:
                if (r0 >= r9) goto L_0x0077
                int r1 = r9 - r0
                java.io.InputStream r2 = r8.f68371e     // Catch:{ all -> 0x006d }
                long r3 = (long) r1     // Catch:{ all -> 0x006d }
                long r1 = r2.skip(r3)     // Catch:{ all -> 0x006d }
                r5 = 0
                int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r7 < 0) goto L_0x003e
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 > 0) goto L_0x003e
                if (r7 != 0) goto L_0x003b
                goto L_0x0077
            L_0x003b:
                int r2 = (int) r1     // Catch:{ all -> 0x006d }
                int r0 = r0 + r2
                goto L_0x0023
            L_0x003e:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x006d }
                java.io.InputStream r3 = r8.f68371e     // Catch:{ all -> 0x006d }
                java.lang.Class r3 = r3.getClass()     // Catch:{ all -> 0x006d }
                java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x006d }
                int r4 = r3.length()     // Catch:{ all -> 0x006d }
                int r4 = r4 + 92
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x006d }
                r5.<init>(r4)     // Catch:{ all -> 0x006d }
                r5.append(r3)     // Catch:{ all -> 0x006d }
                java.lang.String r3 = "#skip returned invalid result: "
                r5.append(r3)     // Catch:{ all -> 0x006d }
                r5.append(r1)     // Catch:{ all -> 0x006d }
                java.lang.String r1 = "\nThe InputStream implementation is buggy."
                r5.append(r1)     // Catch:{ all -> 0x006d }
                java.lang.String r1 = r5.toString()     // Catch:{ all -> 0x006d }
                r9.<init>(r1)     // Catch:{ all -> 0x006d }
                throw r9     // Catch:{ all -> 0x006d }
            L_0x006d:
                r9 = move-exception
                int r1 = r8.f68377k
                int r1 = r1 + r0
                r8.f68377k = r1
                r8.mo37793Q()
                throw r9
            L_0x0077:
                int r1 = r8.f68377k
                int r1 = r1 + r0
                r8.f68377k = r1
                r8.mo37793Q()
                if (r0 >= r9) goto L_0x009c
                int r0 = r8.f68373g
                int r1 = r8.f68375i
                int r1 = r0 - r1
                r8.f68375i = r0
                r0 = 1
                r8.mo37794R(r0)
            L_0x008d:
                int r2 = r9 - r1
                int r3 = r8.f68373g
                if (r2 <= r3) goto L_0x009a
                int r1 = r1 + r3
                r8.f68375i = r3
                r8.mo37794R(r0)
                goto L_0x008d
            L_0x009a:
                r8.f68375i = r2
            L_0x009c:
                return
            L_0x009d:
                int r5 = r5 - r2
                int r5 = r5 - r1
                r8.mo37795S(r5)
                com.google.protobuf.p0 r9 = com.google.protobuf.C23922p0.m29484i()
                throw r9
            L_0x00a7:
                com.google.protobuf.p0 r9 = com.google.protobuf.C23922p0.m29481f()
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C23856l.C23859c.mo37795S(int):void");
        }

        /* renamed from: T */
        public final boolean mo37796T(int i) {
            int i2 = this.f68375i;
            int i3 = i2 + i;
            int i4 = this.f68373g;
            if (i3 > i4) {
                int i5 = this.f68361c;
                int i6 = this.f68377k;
                if (i > (i5 - i6) - i2 || i6 + i2 + i > this.f68378l) {
                    return false;
                }
                if (i2 > 0) {
                    if (i4 > i2) {
                        byte[] bArr = this.f68372f;
                        System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                    }
                    this.f68377k += i2;
                    this.f68373g -= i2;
                    this.f68375i = 0;
                }
                InputStream inputStream = this.f68371e;
                byte[] bArr2 = this.f68372f;
                int i7 = this.f68373g;
                int read = inputStream.read(bArr2, i7, Math.min(bArr2.length - i7, (this.f68361c - this.f68377k) - i7));
                if (read == 0 || read < -1 || read > this.f68372f.length) {
                    String valueOf = String.valueOf(this.f68371e.getClass());
                    StringBuilder sb = new StringBuilder(valueOf.length() + 91);
                    sb.append(valueOf);
                    sb.append("#read(byte[]) returned invalid result: ");
                    sb.append(read);
                    sb.append("\nThe InputStream implementation is buggy.");
                    throw new IllegalStateException(sb.toString());
                } else if (read <= 0) {
                    return false;
                } else {
                    this.f68373g += read;
                    mo37793Q();
                    if (this.f68373g >= i) {
                        return true;
                    }
                    return mo37796T(i);
                }
            } else {
                StringBuilder sb4 = new StringBuilder(77);
                sb4.append("refillBuffer() called when ");
                sb4.append(i);
                sb4.append(" bytes were already available in buffer");
                throw new IllegalStateException(sb4.toString());
            }
        }

        /* renamed from: a */
        public void mo37761a(int i) {
            if (this.f68376j != i) {
                throw C23922p0.m29476a();
            }
        }

        /* renamed from: d */
        public int mo37762d() {
            int i = this.f68378l;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - (this.f68377k + this.f68375i);
        }

        /* renamed from: e */
        public int mo37763e() {
            return this.f68377k + this.f68375i;
        }

        /* renamed from: f */
        public boolean mo37764f() {
            return this.f68375i == this.f68373g && !mo37796T(1);
        }

        /* renamed from: j */
        public void mo37765j(int i) {
            this.f68378l = i;
            mo37793Q();
        }

        /* renamed from: k */
        public int mo37766k(int i) {
            if (i >= 0) {
                int i2 = i + this.f68377k + this.f68375i;
                int i3 = this.f68378l;
                if (i2 <= i3) {
                    this.f68378l = i2;
                    mo37793Q();
                    return i3;
                }
                throw C23922p0.m29484i();
            }
            throw C23922p0.m29481f();
        }

        /* renamed from: l */
        public boolean mo37767l() {
            return mo37791O() != 0;
        }

        /* renamed from: m */
        public C16994k mo37768m() {
            int x = mo37779x();
            int i = this.f68373g;
            int i2 = this.f68375i;
            if (x <= i - i2 && x > 0) {
                C16994k i3 = C16994k.m16790i(this.f68372f, i2, x);
                this.f68375i += x;
                return i3;
            } else if (x == 0) {
                return C16994k.f46000e;
            } else {
                byte[] K = mo37787K(x);
                if (K != null) {
                    return C16994k.m16790i(K, 0, K.length);
                }
                int i4 = this.f68375i;
                int i5 = this.f68373g;
                int i6 = i5 - i4;
                this.f68377k += i5;
                this.f68375i = 0;
                this.f68373g = 0;
                List<byte[]> L = mo37788L(x - i6);
                byte[] bArr = new byte[x];
                System.arraycopy(this.f68372f, i4, bArr, 0, i6);
                Iterator it = ((ArrayList) L).iterator();
                while (it.hasNext()) {
                    byte[] bArr2 = (byte[]) it.next();
                    System.arraycopy(bArr2, 0, bArr, i6, bArr2.length);
                    i6 += bArr2.length;
                }
                C16994k kVar = C16994k.f46000e;
                return new C16994k.C17000f(bArr);
            }
        }

        /* renamed from: n */
        public double mo37769n() {
            return Double.longBitsToDouble(mo37790N());
        }

        /* renamed from: o */
        public int mo37770o() {
            return mo37779x();
        }

        /* renamed from: p */
        public int mo37771p() {
            return mo37789M();
        }

        /* renamed from: q */
        public long mo37772q() {
            return mo37790N();
        }

        /* renamed from: r */
        public float mo37773r() {
            return Float.intBitsToFloat(mo37789M());
        }

        /* renamed from: s */
        public void mo37774s(int i, C23845j1.C23846a aVar, C23806a0 a0Var) {
            int i2 = this.f68359a;
            if (i2 < this.f68360b) {
                this.f68359a = i2 + 1;
                aVar.mergeFrom(this, a0Var);
                mo37761a((i << 3) | 4);
                this.f68359a--;
                return;
            }
            throw C23922p0.m29483h();
        }

        /* renamed from: t */
        public int mo37775t() {
            return mo37779x();
        }

        /* renamed from: u */
        public long mo37776u() {
            return mo37791O();
        }

        /* renamed from: v */
        public <T extends C23845j1> T mo37777v(C24062w1<T> w1Var, C23806a0 a0Var) {
            int x = mo37779x();
            if (this.f68359a < this.f68360b) {
                int k = mo37766k(x);
                this.f68359a++;
                T t = (C23845j1) w1Var.parsePartialFrom(this, a0Var);
                mo37761a(0);
                this.f68359a--;
                mo37765j(k);
                return t;
            }
            throw C23922p0.m29483h();
        }

        /* renamed from: w */
        public void mo37778w(C23845j1.C23846a aVar, C23806a0 a0Var) {
            int x = mo37779x();
            if (this.f68359a < this.f68360b) {
                int k = mo37766k(x);
                this.f68359a++;
                aVar.mergeFrom(this, a0Var);
                mo37761a(0);
                this.f68359a--;
                mo37765j(k);
                return;
            }
            throw C23922p0.m29483h();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
            if (r2[r3] < 0) goto L_0x006a;
         */
        /* renamed from: x */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo37779x() {
            /*
                r5 = this;
                int r0 = r5.f68375i
                int r1 = r5.f68373g
                if (r1 != r0) goto L_0x0007
                goto L_0x006a
            L_0x0007:
                byte[] r2 = r5.f68372f
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0012
                r5.f68375i = r3
                return r0
            L_0x0012:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x0018
                goto L_0x006a
            L_0x0018:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0024
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x0070
            L_0x0024:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x0031
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x002f:
                r1 = r3
                goto L_0x0070
            L_0x0031:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x003f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0070
            L_0x003f:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r2 = r2[r3]
                if (r2 >= 0) goto L_0x0070
            L_0x006a:
                long r0 = r5.mo37792P()
                int r1 = (int) r0
                return r1
            L_0x0070:
                r5.f68375i = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C23856l.C23859c.mo37779x():int");
        }

        /* renamed from: z */
        public int mo37780z() {
            return mo37789M();
        }
    }

    /* renamed from: com.google.protobuf.l$d */
    public static final class C23860d extends C23856l {

        /* renamed from: e */
        public final ByteBuffer f68379e;

        /* renamed from: f */
        public final long f68380f;

        /* renamed from: g */
        public long f68381g;

        /* renamed from: h */
        public long f68382h;

        /* renamed from: i */
        public long f68383i;

        /* renamed from: j */
        public int f68384j;

        /* renamed from: k */
        public int f68385k;

        /* renamed from: l */
        public int f68386l = Integer.MAX_VALUE;

        public C23860d(ByteBuffer byteBuffer, boolean z, C23857a aVar) {
            this.f68379e = byteBuffer;
            long j = C24065x2.f69191d.mo38416j(byteBuffer, C24065x2.f69195h);
            this.f68380f = j;
            this.f68381g = ((long) byteBuffer.limit()) + j;
            long position = j + ((long) byteBuffer.position());
            this.f68382h = position;
            this.f68383i = position;
        }

        /* renamed from: A */
        public long mo37752A() {
            return mo37798K();
        }

        /* renamed from: B */
        public int mo37753B() {
            return C23856l.m28955b(mo37779x());
        }

        /* renamed from: C */
        public long mo37754C() {
            return C23856l.m28956c(mo37799L());
        }

        /* renamed from: D */
        public String mo37755D() {
            int x = mo37779x();
            if (x > 0) {
                long j = this.f68381g;
                long j2 = this.f68382h;
                if (x <= ((int) (j - j2))) {
                    byte[] bArr = new byte[x];
                    long j3 = (long) x;
                    C24065x2.f69191d.mo38402c(j2, bArr, 0, j3);
                    String str = new String(bArr, C23908o0.f68505a);
                    this.f68382h += j3;
                    return str;
                }
            }
            if (x == 0) {
                return "";
            }
            if (x < 0) {
                throw C23922p0.m29481f();
            }
            throw C23922p0.m29484i();
        }

        /* renamed from: E */
        public String mo37756E() {
            int x = mo37779x();
            if (x > 0) {
                long j = this.f68381g;
                long j2 = this.f68382h;
                if (x <= ((int) (j - j2))) {
                    int i = (int) (j2 - this.f68380f);
                    ByteBuffer byteBuffer = this.f68379e;
                    C24079y2.C24081b bVar = C24079y2.f69220a;
                    bVar.getClass();
                    String a = byteBuffer.hasArray() ? bVar.mo38431a(byteBuffer.array(), byteBuffer.arrayOffset() + i, x) : byteBuffer.isDirect() ? bVar.mo38433c(byteBuffer, i, x) : bVar.mo38432b(byteBuffer, i, x);
                    this.f68382h += (long) x;
                    return a;
                }
            }
            if (x == 0) {
                return "";
            }
            if (x <= 0) {
                throw C23922p0.m29481f();
            }
            throw C23922p0.m29484i();
        }

        /* renamed from: F */
        public int mo37757F() {
            if (mo37764f()) {
                this.f68385k = 0;
                return 0;
            }
            int x = mo37779x();
            this.f68385k = x;
            if ((x >>> 3) != 0) {
                return x;
            }
            throw C23922p0.m29477b();
        }

        /* renamed from: G */
        public int mo37758G() {
            return mo37779x();
        }

        /* renamed from: H */
        public long mo37759H() {
            return mo37799L();
        }

        /* renamed from: I */
        public boolean mo37760I(int i) {
            int F;
            int i2 = i & 7;
            int i3 = 0;
            if (i2 == 0) {
                if (((int) (this.f68381g - this.f68382h)) >= 10) {
                    while (i3 < 10) {
                        long j = this.f68382h;
                        this.f68382h = j + 1;
                        if (C24065x2.m29980g(j) < 0) {
                            i3++;
                        }
                    }
                    throw C23922p0.m29480e();
                }
                while (i3 < 10) {
                    long j2 = this.f68382h;
                    if (j2 != this.f68381g) {
                        this.f68382h = j2 + 1;
                        if (C24065x2.m29980g(j2) < 0) {
                            i3++;
                        }
                    } else {
                        throw C23922p0.m29484i();
                    }
                }
                throw C23922p0.m29480e();
                return true;
            } else if (i2 == 1) {
                mo37802O(8);
                return true;
            } else if (i2 == 2) {
                mo37802O(mo37779x());
                return true;
            } else if (i2 == 3) {
                do {
                    F = mo37757F();
                    if (F == 0 || !mo37760I(F)) {
                        mo37761a(((i >>> 3) << 3) | 4);
                    }
                    F = mo37757F();
                    break;
                } while (!mo37760I(F));
                mo37761a(((i >>> 3) << 3) | 4);
                return true;
            } else if (i2 == 4) {
                return false;
            } else {
                if (i2 == 5) {
                    mo37802O(4);
                    return true;
                }
                throw C23922p0.m29479d();
            }
        }

        /* renamed from: J */
        public int mo37797J() {
            long j = this.f68382h;
            if (this.f68381g - j >= 4) {
                this.f68382h = 4 + j;
                return ((C24065x2.m29980g(j + 3) & ExifInterface.MARKER) << 24) | (C24065x2.m29980g(j) & ExifInterface.MARKER) | ((C24065x2.m29980g(1 + j) & ExifInterface.MARKER) << 8) | ((C24065x2.m29980g(2 + j) & ExifInterface.MARKER) << v2encoder.enumCODEC_vcodec2);
            }
            throw C23922p0.m29484i();
        }

        /* renamed from: K */
        public long mo37798K() {
            long j = this.f68382h;
            if (this.f68381g - j >= 8) {
                this.f68382h = 8 + j;
                return ((((long) C24065x2.m29980g(j + 7)) & 255) << 56) | (((long) C24065x2.m29980g(j)) & 255) | ((((long) C24065x2.m29980g(1 + j)) & 255) << 8) | ((((long) C24065x2.m29980g(2 + j)) & 255) << 16) | ((((long) C24065x2.m29980g(3 + j)) & 255) << 24) | ((((long) C24065x2.m29980g(4 + j)) & 255) << 32) | ((((long) C24065x2.m29980g(5 + j)) & 255) << 40) | ((((long) C24065x2.m29980g(6 + j)) & 255) << 48);
            }
            throw C23922p0.m29484i();
        }

        /* renamed from: L */
        public long mo37799L() {
            long j;
            long j2;
            long j3;
            byte b;
            long j4 = this.f68382h;
            if (this.f68381g != j4) {
                long j5 = j4 + 1;
                byte g = C24065x2.m29980g(j4);
                if (g >= 0) {
                    this.f68382h = j5;
                    return (long) g;
                } else if (this.f68381g - j5 >= 9) {
                    long j6 = j5 + 1;
                    byte g2 = g ^ (C24065x2.m29980g(j5) << 7);
                    if (g2 < 0) {
                        b = g2 ^ Byte.MIN_VALUE;
                    } else {
                        long j7 = j6 + 1;
                        byte g3 = g2 ^ (C24065x2.m29980g(j6) << 14);
                        if (g3 >= 0) {
                            j = (long) (g3 ^ 16256);
                        } else {
                            j6 = j7 + 1;
                            byte g4 = g3 ^ (C24065x2.m29980g(j7) << 21);
                            if (g4 < 0) {
                                b = g4 ^ -2080896;
                            } else {
                                j7 = j6 + 1;
                                long g5 = ((long) g4) ^ (((long) C24065x2.m29980g(j6)) << 28);
                                if (g5 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    long j8 = j7 + 1;
                                    long g6 = g5 ^ (((long) C24065x2.m29980g(j7)) << 35);
                                    if (g6 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        j7 = j8 + 1;
                                        g5 = g6 ^ (((long) C24065x2.m29980g(j8)) << 42);
                                        if (g5 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            j8 = j7 + 1;
                                            g6 = g5 ^ (((long) C24065x2.m29980g(j7)) << 49);
                                            if (g6 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                j7 = j8 + 1;
                                                j = (g6 ^ (((long) C24065x2.m29980g(j8)) << 56)) ^ 71499008037633920L;
                                                if (j < 0) {
                                                    long j9 = 1 + j7;
                                                    if (((long) C24065x2.m29980g(j7)) >= 0) {
                                                        j6 = j9;
                                                        this.f68382h = j6;
                                                        return j;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    j = g6 ^ j2;
                                    j6 = j8;
                                    this.f68382h = j6;
                                    return j;
                                }
                                j = g5 ^ j3;
                            }
                        }
                        j6 = j7;
                        this.f68382h = j6;
                        return j;
                    }
                    j = (long) b;
                    this.f68382h = j6;
                    return j;
                }
            }
            return mo37800M();
        }

        /* renamed from: M */
        public long mo37800M() {
            long j = 0;
            int i = 0;
            while (i < 64) {
                long j2 = this.f68382h;
                if (j2 != this.f68381g) {
                    this.f68382h = 1 + j2;
                    byte g = C24065x2.m29980g(j2);
                    j |= ((long) (g & Byte.MAX_VALUE)) << i;
                    if ((g & 128) == 0) {
                        return j;
                    }
                    i += 7;
                } else {
                    throw C23922p0.m29484i();
                }
            }
            throw C23922p0.m29480e();
        }

        /* renamed from: N */
        public final void mo37801N() {
            long j = this.f68381g + ((long) this.f68384j);
            this.f68381g = j;
            int i = (int) (j - this.f68383i);
            int i2 = this.f68386l;
            if (i > i2) {
                int i3 = i - i2;
                this.f68384j = i3;
                this.f68381g = j - ((long) i3);
                return;
            }
            this.f68384j = 0;
        }

        /* renamed from: O */
        public void mo37802O(int i) {
            if (i >= 0) {
                long j = this.f68381g;
                long j2 = this.f68382h;
                if (i <= ((int) (j - j2))) {
                    this.f68382h = j2 + ((long) i);
                    return;
                }
            }
            if (i < 0) {
                throw C23922p0.m29481f();
            }
            throw C23922p0.m29484i();
        }

        /* renamed from: a */
        public void mo37761a(int i) {
            if (this.f68385k != i) {
                throw C23922p0.m29476a();
            }
        }

        /* renamed from: d */
        public int mo37762d() {
            int i = this.f68386l;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - mo37763e();
        }

        /* renamed from: e */
        public int mo37763e() {
            return (int) (this.f68382h - this.f68383i);
        }

        /* renamed from: f */
        public boolean mo37764f() {
            return this.f68382h == this.f68381g;
        }

        /* renamed from: j */
        public void mo37765j(int i) {
            this.f68386l = i;
            mo37801N();
        }

        /* renamed from: k */
        public int mo37766k(int i) {
            if (i >= 0) {
                int e = i + mo37763e();
                int i2 = this.f68386l;
                if (e <= i2) {
                    this.f68386l = e;
                    mo37801N();
                    return i2;
                }
                throw C23922p0.m29484i();
            }
            throw C23922p0.m29481f();
        }

        /* renamed from: l */
        public boolean mo37767l() {
            return mo37799L() != 0;
        }

        /* renamed from: m */
        public C16994k mo37768m() {
            int x = mo37779x();
            if (x > 0) {
                long j = this.f68381g;
                long j2 = this.f68382h;
                if (x <= ((int) (j - j2))) {
                    byte[] bArr = new byte[x];
                    long j3 = (long) x;
                    C24065x2.f69191d.mo38402c(j2, bArr, 0, j3);
                    this.f68382h += j3;
                    C16994k kVar = C16994k.f46000e;
                    return new C16994k.C17000f(bArr);
                }
            }
            if (x == 0) {
                return C16994k.f46000e;
            }
            if (x < 0) {
                throw C23922p0.m29481f();
            }
            throw C23922p0.m29484i();
        }

        /* renamed from: n */
        public double mo37769n() {
            return Double.longBitsToDouble(mo37798K());
        }

        /* renamed from: o */
        public int mo37770o() {
            return mo37779x();
        }

        /* renamed from: p */
        public int mo37771p() {
            return mo37797J();
        }

        /* renamed from: q */
        public long mo37772q() {
            return mo37798K();
        }

        /* renamed from: r */
        public float mo37773r() {
            return Float.intBitsToFloat(mo37797J());
        }

        /* renamed from: s */
        public void mo37774s(int i, C23845j1.C23846a aVar, C23806a0 a0Var) {
            int i2 = this.f68359a;
            if (i2 < this.f68360b) {
                this.f68359a = i2 + 1;
                aVar.mergeFrom(this, a0Var);
                mo37761a((i << 3) | 4);
                this.f68359a--;
                return;
            }
            throw C23922p0.m29483h();
        }

        /* renamed from: t */
        public int mo37775t() {
            return mo37779x();
        }

        /* renamed from: u */
        public long mo37776u() {
            return mo37799L();
        }

        /* renamed from: v */
        public <T extends C23845j1> T mo37777v(C24062w1<T> w1Var, C23806a0 a0Var) {
            int x = mo37779x();
            if (this.f68359a < this.f68360b) {
                int k = mo37766k(x);
                this.f68359a++;
                T t = (C23845j1) w1Var.parsePartialFrom(this, a0Var);
                mo37761a(0);
                this.f68359a--;
                mo37765j(k);
                return t;
            }
            throw C23922p0.m29483h();
        }

        /* renamed from: w */
        public void mo37778w(C23845j1.C23846a aVar, C23806a0 a0Var) {
            int x = mo37779x();
            if (this.f68359a < this.f68360b) {
                int k = mo37766k(x);
                this.f68359a++;
                aVar.mergeFrom(this, a0Var);
                mo37761a(0);
                this.f68359a--;
                mo37765j(k);
                return;
            }
            throw C23922p0.m29483h();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0083, code lost:
            if (com.google.protobuf.C24065x2.m29980g(r4) < 0) goto L_0x0085;
         */
        /* renamed from: x */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo37779x() {
            /*
                r10 = this;
                long r0 = r10.f68382h
                long r2 = r10.f68381g
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 != 0) goto L_0x000a
                goto L_0x0085
            L_0x000a:
                r2 = 1
                long r4 = r0 + r2
                byte r0 = com.google.protobuf.C24065x2.m29980g(r0)
                if (r0 < 0) goto L_0x0017
                r10.f68382h = r4
                return r0
            L_0x0017:
                long r6 = r10.f68381g
                long r6 = r6 - r4
                r8 = 9
                int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r1 >= 0) goto L_0x0021
                goto L_0x0085
            L_0x0021:
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.C24065x2.m29980g(r4)
                int r1 = r1 << 7
                r0 = r0 ^ r1
                if (r0 >= 0) goto L_0x002f
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x008b
            L_0x002f:
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.C24065x2.m29980g(r6)
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x003e
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x003c:
                r6 = r4
                goto L_0x008b
            L_0x003e:
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.C24065x2.m29980g(r4)
                int r1 = r1 << 21
                r0 = r0 ^ r1
                if (r0 >= 0) goto L_0x004e
                r1 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r1
                goto L_0x008b
            L_0x004e:
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.C24065x2.m29980g(r6)
                int r6 = r1 << 28
                r0 = r0 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r6
                if (r1 >= 0) goto L_0x003c
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.C24065x2.m29980g(r4)
                if (r1 >= 0) goto L_0x008b
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.C24065x2.m29980g(r6)
                if (r1 >= 0) goto L_0x003c
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.C24065x2.m29980g(r4)
                if (r1 >= 0) goto L_0x008b
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.C24065x2.m29980g(r6)
                if (r1 >= 0) goto L_0x003c
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.C24065x2.m29980g(r4)
                if (r1 >= 0) goto L_0x008b
            L_0x0085:
                long r0 = r10.mo37800M()
                int r1 = (int) r0
                return r1
            L_0x008b:
                r10.f68382h = r6
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C23856l.C23860d.mo37779x():int");
        }

        /* renamed from: z */
        public int mo37780z() {
            return mo37797J();
        }
    }

    /* renamed from: b */
    public static int m28955b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: c */
    public static long m28956c(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: g */
    public static C23856l m28957g(InputStream inputStream) {
        if (inputStream != null) {
            return new C23859c(inputStream, 4096, (C23857a) null);
        }
        byte[] bArr = C23908o0.f68507c;
        return m28959i(bArr, 0, bArr.length, false);
    }

    /* renamed from: h */
    public static C23856l m28958h(ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer.hasArray()) {
            return m28959i(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), z);
        }
        if (byteBuffer.isDirect() && C24065x2.f69192e) {
            return new C23860d(byteBuffer, z, (C23857a) null);
        }
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.duplicate().get(bArr);
        return m28959i(bArr, 0, remaining, true);
    }

    /* renamed from: i */
    public static C23856l m28959i(byte[] bArr, int i, int i2, boolean z) {
        C23858b bVar = new C23858b(bArr, i, i2, z, (C23857a) null);
        try {
            bVar.mo37766k(i2);
            return bVar;
        } catch (C23922p0 e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: y */
    public static int m28960y(int i, InputStream inputStream) {
        if ((i & 128) == 0) {
            return i;
        }
        int i2 = i & 127;
        int i3 = 7;
        while (i3 < 32) {
            int read = inputStream.read();
            if (read != -1) {
                i2 |= (read & 127) << i3;
                if ((read & 128) == 0) {
                    return i2;
                }
                i3 += 7;
            } else {
                throw C23922p0.m29484i();
            }
        }
        while (i3 < 64) {
            int read2 = inputStream.read();
            if (read2 == -1) {
                throw C23922p0.m29484i();
            } else if ((read2 & 128) == 0) {
                return i2;
            } else {
                i3 += 7;
            }
        }
        throw C23922p0.m29480e();
    }

    /* renamed from: A */
    public abstract long mo37752A();

    /* renamed from: B */
    public abstract int mo37753B();

    /* renamed from: C */
    public abstract long mo37754C();

    /* renamed from: D */
    public abstract String mo37755D();

    /* renamed from: E */
    public abstract String mo37756E();

    /* renamed from: F */
    public abstract int mo37757F();

    /* renamed from: G */
    public abstract int mo37758G();

    /* renamed from: H */
    public abstract long mo37759H();

    /* renamed from: I */
    public abstract boolean mo37760I(int i);

    /* renamed from: a */
    public abstract void mo37761a(int i);

    /* renamed from: d */
    public abstract int mo37762d();

    /* renamed from: e */
    public abstract int mo37763e();

    /* renamed from: f */
    public abstract boolean mo37764f();

    /* renamed from: j */
    public abstract void mo37765j(int i);

    /* renamed from: k */
    public abstract int mo37766k(int i);

    /* renamed from: l */
    public abstract boolean mo37767l();

    /* renamed from: m */
    public abstract C16994k mo37768m();

    /* renamed from: n */
    public abstract double mo37769n();

    /* renamed from: o */
    public abstract int mo37770o();

    /* renamed from: p */
    public abstract int mo37771p();

    /* renamed from: q */
    public abstract long mo37772q();

    /* renamed from: r */
    public abstract float mo37773r();

    /* renamed from: s */
    public abstract void mo37774s(int i, C23845j1.C23846a aVar, C23806a0 a0Var);

    /* renamed from: t */
    public abstract int mo37775t();

    /* renamed from: u */
    public abstract long mo37776u();

    /* renamed from: v */
    public abstract <T extends C23845j1> T mo37777v(C24062w1<T> w1Var, C23806a0 a0Var);

    /* renamed from: w */
    public abstract void mo37778w(C23845j1.C23846a aVar, C23806a0 a0Var);

    /* renamed from: x */
    public abstract int mo37779x();

    /* renamed from: z */
    public abstract int mo37780z();
}
