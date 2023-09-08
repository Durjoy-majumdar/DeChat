package com.google.protobuf;

import com.google.protobuf.C24079y2;
import com.tencent.tinker.loader.shareutil.ShareElfFile;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.protobuf.n */
public abstract class C23897n extends C16991i {

    /* renamed from: b */
    public static final Logger f68486b = Logger.getLogger(C23897n.class.getName());

    /* renamed from: c */
    public static final boolean f68487c = C24065x2.f69193f;

    /* renamed from: a */
    public C23907o f68488a;

    /* renamed from: com.google.protobuf.n$c */
    public static class C17009c extends IOException {
        public C17009c(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C17009c(java.lang.String r3, java.lang.Throwable r4) {
            /*
                r2 = this;
                java.lang.String r0 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r1 = r3.length()
                if (r1 == 0) goto L_0x0011
                java.lang.String r3 = r0.concat(r3)
                goto L_0x0016
            L_0x0011:
                java.lang.String r3 = new java.lang.String
                r3.<init>(r0)
            L_0x0016:
                r2.<init>(r3, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C23897n.C17009c.<init>(java.lang.String, java.lang.Throwable):void");
        }
    }

    /* renamed from: com.google.protobuf.n$a */
    public static abstract class C23898a extends C23897n {

        /* renamed from: d */
        public final byte[] f68489d;

        /* renamed from: e */
        public final int f68490e;

        /* renamed from: f */
        public int f68491f;

        public C23898a(int i) {
            if (i >= 0) {
                byte[] bArr = new byte[Math.max(i, 20)];
                this.f68489d = bArr;
                this.f68490e = bArr.length;
                return;
            }
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }

        /* renamed from: B */
        public final int mo37895B() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }

        /* renamed from: b0 */
        public final void mo37921b0(int i) {
            byte[] bArr = this.f68489d;
            int i2 = this.f68491f;
            int i3 = i2 + 1;
            bArr[i2] = (byte) (i & 255);
            int i4 = i3 + 1;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i4 + 1;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f68491f = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & 255);
        }

        /* renamed from: c0 */
        public final void mo37922c0(long j) {
            byte[] bArr = this.f68489d;
            int i = this.f68491f;
            int i2 = i + 1;
            bArr[i] = (byte) ((int) (j & 255));
            int i3 = i2 + 1;
            bArr[i2] = (byte) ((int) ((j >> 8) & 255));
            int i4 = i3 + 1;
            bArr[i3] = (byte) ((int) ((j >> 16) & 255));
            int i5 = i4 + 1;
            bArr[i4] = (byte) ((int) (255 & (j >> 24)));
            int i6 = i5 + 1;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i6 + 1;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i7 + 1;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f68491f = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        }

        /* renamed from: d0 */
        public final void mo37923d0(int i, int i2) {
            mo37924e0((i << 3) | i2);
        }

        /* renamed from: e0 */
        public final void mo37924e0(int i) {
            if (C23897n.f68487c) {
                while ((i & -128) != 0) {
                    byte[] bArr = this.f68489d;
                    int i2 = this.f68491f;
                    this.f68491f = i2 + 1;
                    C24065x2.m29992s(bArr, (long) i2, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                byte[] bArr2 = this.f68489d;
                int i3 = this.f68491f;
                this.f68491f = i3 + 1;
                C24065x2.m29992s(bArr2, (long) i3, (byte) i);
                return;
            }
            while ((i & -128) != 0) {
                byte[] bArr3 = this.f68489d;
                int i4 = this.f68491f;
                this.f68491f = i4 + 1;
                bArr3[i4] = (byte) ((i & 127) | 128);
                i >>>= 7;
            }
            byte[] bArr4 = this.f68489d;
            int i5 = this.f68491f;
            this.f68491f = i5 + 1;
            bArr4[i5] = (byte) i;
        }

        /* renamed from: f0 */
        public final void mo37925f0(long j) {
            if (C23897n.f68487c) {
                while ((j & -128) != 0) {
                    byte[] bArr = this.f68489d;
                    int i = this.f68491f;
                    this.f68491f = i + 1;
                    C24065x2.m29992s(bArr, (long) i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.f68489d;
                int i2 = this.f68491f;
                this.f68491f = i2 + 1;
                C24065x2.m29992s(bArr2, (long) i2, (byte) ((int) j));
                return;
            }
            while ((j & -128) != 0) {
                byte[] bArr3 = this.f68489d;
                int i3 = this.f68491f;
                this.f68491f = i3 + 1;
                bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            }
            byte[] bArr4 = this.f68489d;
            int i4 = this.f68491f;
            this.f68491f = i4 + 1;
            bArr4[i4] = (byte) ((int) j);
        }
    }

    /* renamed from: com.google.protobuf.n$b */
    public static class C23899b extends C23897n {

        /* renamed from: d */
        public final byte[] f68492d;

        /* renamed from: e */
        public final int f68493e;

        /* renamed from: f */
        public int f68494f;

        public C23899b(byte[] bArr, int i, int i2) {
            if (bArr != null) {
                int i3 = i + i2;
                if ((i | i2 | (bArr.length - i3)) >= 0) {
                    this.f68492d = bArr;
                    this.f68494f = i;
                    this.f68493e = i3;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
            }
            throw new NullPointerException("buffer");
        }

        /* renamed from: B */
        public final int mo37895B() {
            return this.f68493e - this.f68494f;
        }

        /* renamed from: C */
        public final void mo37896C(byte b) {
            try {
                byte[] bArr = this.f68492d;
                int i = this.f68494f;
                this.f68494f = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new C17009c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f68494f), Integer.valueOf(this.f68493e), 1}), e);
            }
        }

        /* renamed from: D */
        public final void mo37897D(int i, boolean z) {
            mo37916W(i, 0);
            mo37896C(z ? (byte) 1 : 0);
        }

        /* renamed from: E */
        public final void mo37898E(byte[] bArr, int i, int i2) {
            mo37918Y(i2);
            mo37926b0(bArr, i, i2);
        }

        /* renamed from: F */
        public final void mo37899F(int i, C16994k kVar) {
            mo37916W(i, 2);
            mo37900G(kVar);
        }

        /* renamed from: G */
        public final void mo37900G(C16994k kVar) {
            mo37918Y(kVar.size());
            kVar.mo18753v(this);
        }

        /* renamed from: I */
        public final void mo37902I(int i, int i2) {
            mo37916W(i, 5);
            mo37903J(i2);
        }

        /* renamed from: J */
        public final void mo37903J(int i) {
            try {
                byte[] bArr = this.f68492d;
                int i2 = this.f68494f;
                int i3 = i2 + 1;
                bArr[i2] = (byte) (i & 255);
                int i4 = i3 + 1;
                bArr[i3] = (byte) ((i >> 8) & 255);
                int i5 = i4 + 1;
                bArr[i4] = (byte) ((i >> 16) & 255);
                this.f68494f = i5 + 1;
                bArr[i5] = (byte) ((i >> 24) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new C17009c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f68494f), Integer.valueOf(this.f68493e), 1}), e);
            }
        }

        /* renamed from: K */
        public final void mo37904K(int i, long j) {
            mo37916W(i, 1);
            mo37905L(j);
        }

        /* renamed from: L */
        public final void mo37905L(long j) {
            try {
                byte[] bArr = this.f68492d;
                int i = this.f68494f;
                int i2 = i + 1;
                bArr[i] = (byte) (((int) j) & 255);
                int i3 = i2 + 1;
                bArr[i2] = (byte) (((int) (j >> 8)) & 255);
                int i4 = i3 + 1;
                bArr[i3] = (byte) (((int) (j >> 16)) & 255);
                int i5 = i4 + 1;
                bArr[i4] = (byte) (((int) (j >> 24)) & 255);
                int i6 = i5 + 1;
                bArr[i5] = (byte) (((int) (j >> 32)) & 255);
                int i7 = i6 + 1;
                bArr[i6] = (byte) (((int) (j >> 40)) & 255);
                int i8 = i7 + 1;
                bArr[i7] = (byte) (((int) (j >> 48)) & 255);
                this.f68494f = i8 + 1;
                bArr[i8] = (byte) (((int) (j >> 56)) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new C17009c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f68494f), Integer.valueOf(this.f68493e), 1}), e);
            }
        }

        /* renamed from: N */
        public final void mo37907N(int i, int i2) {
            mo37916W(i, 0);
            mo37908O(i2);
        }

        /* renamed from: O */
        public final void mo37908O(int i) {
            if (i >= 0) {
                mo37918Y(i);
            } else {
                mo37920a0((long) i);
            }
        }

        /* renamed from: P */
        public final void mo37909P(int i, C23845j1 j1Var) {
            mo37916W(i, 2);
            mo37911R(j1Var);
        }

        /* renamed from: Q */
        public final void mo37910Q(int i, C23845j1 j1Var, C23828f2 f2Var) {
            mo37916W(i, 2);
            mo37918Y(((C23810b) j1Var).getSerializedSize(f2Var));
            f2Var.mo37611c(j1Var, this.f68488a);
        }

        /* renamed from: R */
        public final void mo37911R(C23845j1 j1Var) {
            mo37918Y(j1Var.getSerializedSize());
            j1Var.writeTo(this);
        }

        /* renamed from: S */
        public final void mo37912S(int i, C23845j1 j1Var) {
            mo37916W(1, 3);
            mo37917X(2, i);
            mo37909P(3, j1Var);
            mo37916W(1, 4);
        }

        /* renamed from: T */
        public final void mo37913T(int i, C16994k kVar) {
            mo37916W(1, 3);
            mo37917X(2, i);
            mo37899F(3, kVar);
            mo37916W(1, 4);
        }

        /* renamed from: U */
        public final void mo37914U(int i, String str) {
            mo37916W(i, 2);
            mo37915V(str);
        }

        /* renamed from: V */
        public final void mo37915V(String str) {
            int i = this.f68494f;
            try {
                int x = C23897n.m29279x(str.length() * 3);
                int x2 = C23897n.m29279x(str.length());
                if (x2 == x) {
                    int i2 = i + x2;
                    this.f68494f = i2;
                    int d = C24079y2.f69220a.mo38434d(str, this.f68492d, i2, this.f68493e - i2);
                    this.f68494f = i;
                    mo37918Y((d - i) - x2);
                    this.f68494f = d;
                    return;
                }
                mo37918Y(C24079y2.m30060b(str));
                byte[] bArr = this.f68492d;
                int i3 = this.f68494f;
                this.f68494f = C24079y2.f69220a.mo38434d(str, bArr, i3, this.f68493e - i3);
            } catch (C24079y2.C17017d e) {
                this.f68494f = i;
                mo37894A(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new C17009c(e2);
            }
        }

        /* renamed from: W */
        public final void mo37916W(int i, int i2) {
            mo37918Y((i << 3) | i2);
        }

        /* renamed from: X */
        public final void mo37917X(int i, int i2) {
            mo37916W(i, 0);
            mo37918Y(i2);
        }

        /* renamed from: Y */
        public final void mo37918Y(int i) {
            if (C23897n.f68487c && !C16987e.m16777a()) {
                int i2 = this.f68493e;
                int i3 = this.f68494f;
                if (i2 - i3 >= 5) {
                    if ((i & -128) == 0) {
                        byte[] bArr = this.f68492d;
                        this.f68494f = i3 + 1;
                        C24065x2.m29992s(bArr, (long) i3, (byte) i);
                        return;
                    }
                    byte[] bArr2 = this.f68492d;
                    this.f68494f = i3 + 1;
                    C24065x2.m29992s(bArr2, (long) i3, (byte) (i | 128));
                    int i4 = i >>> 7;
                    if ((i4 & -128) == 0) {
                        byte[] bArr3 = this.f68492d;
                        int i5 = this.f68494f;
                        this.f68494f = i5 + 1;
                        C24065x2.m29992s(bArr3, (long) i5, (byte) i4);
                        return;
                    }
                    byte[] bArr4 = this.f68492d;
                    int i6 = this.f68494f;
                    this.f68494f = i6 + 1;
                    C24065x2.m29992s(bArr4, (long) i6, (byte) (i4 | 128));
                    int i7 = i4 >>> 7;
                    if ((i7 & -128) == 0) {
                        byte[] bArr5 = this.f68492d;
                        int i8 = this.f68494f;
                        this.f68494f = i8 + 1;
                        C24065x2.m29992s(bArr5, (long) i8, (byte) i7);
                        return;
                    }
                    byte[] bArr6 = this.f68492d;
                    int i9 = this.f68494f;
                    this.f68494f = i9 + 1;
                    C24065x2.m29992s(bArr6, (long) i9, (byte) (i7 | 128));
                    int i15 = i7 >>> 7;
                    if ((i15 & -128) == 0) {
                        byte[] bArr7 = this.f68492d;
                        int i16 = this.f68494f;
                        this.f68494f = i16 + 1;
                        C24065x2.m29992s(bArr7, (long) i16, (byte) i15);
                        return;
                    }
                    byte[] bArr8 = this.f68492d;
                    int i17 = this.f68494f;
                    this.f68494f = i17 + 1;
                    C24065x2.m29992s(bArr8, (long) i17, (byte) (i15 | 128));
                    byte[] bArr9 = this.f68492d;
                    int i18 = this.f68494f;
                    this.f68494f = i18 + 1;
                    C24065x2.m29992s(bArr9, (long) i18, (byte) (i15 >>> 7));
                    return;
                }
            }
            while ((i & -128) != 0) {
                byte[] bArr10 = this.f68492d;
                int i19 = this.f68494f;
                this.f68494f = i19 + 1;
                bArr10[i19] = (byte) ((i & 127) | 128);
                i >>>= 7;
            }
            try {
                byte[] bArr11 = this.f68492d;
                int i25 = this.f68494f;
                this.f68494f = i25 + 1;
                bArr11[i25] = (byte) i;
            } catch (IndexOutOfBoundsException e) {
                throw new C17009c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f68494f), Integer.valueOf(this.f68493e), 1}), e);
            }
        }

        /* renamed from: Z */
        public final void mo37919Z(int i, long j) {
            mo37916W(i, 0);
            mo37920a0(j);
        }

        /* renamed from: a */
        public final void mo18733a(byte[] bArr, int i, int i2) {
            mo37926b0(bArr, i, i2);
        }

        /* renamed from: a0 */
        public final void mo37920a0(long j) {
            if (!C23897n.f68487c || this.f68493e - this.f68494f < 10) {
                while ((j & -128) != 0) {
                    byte[] bArr = this.f68492d;
                    int i = this.f68494f;
                    this.f68494f = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f68492d;
                    int i2 = this.f68494f;
                    this.f68494f = i2 + 1;
                    bArr2[i2] = (byte) ((int) j);
                } catch (IndexOutOfBoundsException e) {
                    throw new C17009c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f68494f), Integer.valueOf(this.f68493e), 1}), e);
                }
            } else {
                while ((j & -128) != 0) {
                    byte[] bArr3 = this.f68492d;
                    int i3 = this.f68494f;
                    this.f68494f = i3 + 1;
                    C24065x2.m29992s(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr4 = this.f68492d;
                int i4 = this.f68494f;
                this.f68494f = i4 + 1;
                C24065x2.m29992s(bArr4, (long) i4, (byte) ((int) j));
            }
        }

        /* renamed from: b0 */
        public final void mo37926b0(byte[] bArr, int i, int i2) {
            try {
                System.arraycopy(bArr, i, this.f68492d, this.f68494f, i2);
                this.f68494f += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new C17009c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f68494f), Integer.valueOf(this.f68493e), Integer.valueOf(i2)}), e);
            }
        }
    }

    /* renamed from: com.google.protobuf.n$d */
    public static final class C23900d extends C23898a {

        /* renamed from: g */
        public final OutputStream f68495g;

        public C23900d(OutputStream outputStream, int i) {
            super(i);
            if (outputStream != null) {
                this.f68495g = outputStream;
                return;
            }
            throw new NullPointerException("out");
        }

        /* renamed from: C */
        public void mo37896C(byte b) {
            if (this.f68491f == this.f68490e) {
                mo37927g0();
            }
            byte[] bArr = this.f68489d;
            int i = this.f68491f;
            this.f68491f = i + 1;
            bArr[i] = b;
        }

        /* renamed from: D */
        public void mo37897D(int i, boolean z) {
            mo37928h0(11);
            mo37923d0(i, 0);
            byte b = z ? (byte) 1 : 0;
            byte[] bArr = this.f68489d;
            int i2 = this.f68491f;
            this.f68491f = i2 + 1;
            bArr[i2] = b;
        }

        /* renamed from: E */
        public void mo37898E(byte[] bArr, int i, int i2) {
            mo37918Y(i2);
            mo37929i0(bArr, i, i2);
        }

        /* renamed from: F */
        public void mo37899F(int i, C16994k kVar) {
            mo37916W(i, 2);
            mo37900G(kVar);
        }

        /* renamed from: G */
        public void mo37900G(C16994k kVar) {
            mo37918Y(kVar.size());
            kVar.mo18753v(this);
        }

        /* renamed from: I */
        public void mo37902I(int i, int i2) {
            mo37928h0(14);
            mo37923d0(i, 5);
            mo37921b0(i2);
        }

        /* renamed from: J */
        public void mo37903J(int i) {
            mo37928h0(4);
            mo37921b0(i);
        }

        /* renamed from: K */
        public void mo37904K(int i, long j) {
            mo37928h0(18);
            mo37923d0(i, 1);
            mo37922c0(j);
        }

        /* renamed from: L */
        public void mo37905L(long j) {
            mo37928h0(8);
            mo37922c0(j);
        }

        /* renamed from: N */
        public void mo37907N(int i, int i2) {
            mo37928h0(20);
            mo37923d0(i, 0);
            if (i2 >= 0) {
                mo37924e0(i2);
            } else {
                mo37925f0((long) i2);
            }
        }

        /* renamed from: O */
        public void mo37908O(int i) {
            if (i >= 0) {
                mo37918Y(i);
            } else {
                mo37920a0((long) i);
            }
        }

        /* renamed from: P */
        public void mo37909P(int i, C23845j1 j1Var) {
            mo37916W(i, 2);
            mo37911R(j1Var);
        }

        /* renamed from: Q */
        public void mo37910Q(int i, C23845j1 j1Var, C23828f2 f2Var) {
            mo37916W(i, 2);
            mo37918Y(((C23810b) j1Var).getSerializedSize(f2Var));
            f2Var.mo37611c(j1Var, this.f68488a);
        }

        /* renamed from: R */
        public void mo37911R(C23845j1 j1Var) {
            mo37918Y(j1Var.getSerializedSize());
            j1Var.writeTo(this);
        }

        /* renamed from: S */
        public void mo37912S(int i, C23845j1 j1Var) {
            mo37916W(1, 3);
            mo37917X(2, i);
            mo37909P(3, j1Var);
            mo37916W(1, 4);
        }

        /* renamed from: T */
        public void mo37913T(int i, C16994k kVar) {
            mo37916W(1, 3);
            mo37917X(2, i);
            mo37899F(3, kVar);
            mo37916W(1, 4);
        }

        /* renamed from: U */
        public void mo37914U(int i, String str) {
            mo37916W(i, 2);
            mo37915V(str);
        }

        /* renamed from: V */
        public void mo37915V(String str) {
            int i;
            try {
                int length = str.length() * 3;
                int x = C23897n.m29279x(length);
                int i2 = x + length;
                int i3 = this.f68490e;
                if (i2 > i3) {
                    byte[] bArr = new byte[length];
                    int d = C24079y2.f69220a.mo38434d(str, bArr, 0, length);
                    mo37918Y(d);
                    mo37929i0(bArr, 0, d);
                    return;
                }
                if (i2 > i3 - this.f68491f) {
                    mo37927g0();
                }
                int x2 = C23897n.m29279x(str.length());
                i = this.f68491f;
                if (x2 == x) {
                    int i4 = i + x2;
                    this.f68491f = i4;
                    int d2 = C24079y2.f69220a.mo38434d(str, this.f68489d, i4, this.f68490e - i4);
                    this.f68491f = i;
                    mo37924e0((d2 - i) - x2);
                    this.f68491f = d2;
                    return;
                }
                int b = C24079y2.m30060b(str);
                mo37924e0(b);
                this.f68491f = C24079y2.f69220a.mo38434d(str, this.f68489d, this.f68491f, b);
            } catch (C24079y2.C17017d e) {
                this.f68491f = i;
                throw e;
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new C17009c(e2);
            } catch (C24079y2.C17017d e3) {
                mo37894A(str, e3);
            }
        }

        /* renamed from: W */
        public void mo37916W(int i, int i2) {
            mo37918Y((i << 3) | i2);
        }

        /* renamed from: X */
        public void mo37917X(int i, int i2) {
            mo37928h0(20);
            mo37923d0(i, 0);
            mo37924e0(i2);
        }

        /* renamed from: Y */
        public void mo37918Y(int i) {
            mo37928h0(5);
            mo37924e0(i);
        }

        /* renamed from: Z */
        public void mo37919Z(int i, long j) {
            mo37928h0(20);
            mo37923d0(i, 0);
            mo37925f0(j);
        }

        /* renamed from: a */
        public void mo18733a(byte[] bArr, int i, int i2) {
            mo37929i0(bArr, i, i2);
        }

        /* renamed from: a0 */
        public void mo37920a0(long j) {
            mo37928h0(10);
            mo37925f0(j);
        }

        /* renamed from: g0 */
        public final void mo37927g0() {
            this.f68495g.write(this.f68489d, 0, this.f68491f);
            this.f68491f = 0;
        }

        /* renamed from: h0 */
        public final void mo37928h0(int i) {
            if (this.f68490e - this.f68491f < i) {
                mo37927g0();
            }
        }

        /* renamed from: i0 */
        public void mo37929i0(byte[] bArr, int i, int i2) {
            int i3 = this.f68490e;
            int i4 = this.f68491f;
            int i5 = i3 - i4;
            if (i5 >= i2) {
                System.arraycopy(bArr, i, this.f68489d, i4, i2);
                this.f68491f += i2;
                return;
            }
            System.arraycopy(bArr, i, this.f68489d, i4, i5);
            int i6 = i + i5;
            int i7 = i2 - i5;
            this.f68491f = this.f68490e;
            mo37927g0();
            if (i7 <= this.f68490e) {
                System.arraycopy(bArr, i6, this.f68489d, 0, i7);
                this.f68491f = i7;
                return;
            }
            this.f68495g.write(bArr, i6, i7);
        }
    }

    /* renamed from: b */
    public static int m29257b(int i, boolean z) {
        return m29277v(i) + 1;
    }

    /* renamed from: c */
    public static int m29258c(int i, C16994k kVar) {
        int v = m29277v(i);
        int size = kVar.size();
        return v + m29279x(size) + size;
    }

    /* renamed from: d */
    public static int m29259d(C16994k kVar) {
        int size = kVar.size();
        return m29279x(size) + size;
    }

    /* renamed from: e */
    public static int m29260e(int i, double d) {
        return m29277v(i) + 8;
    }

    /* renamed from: f */
    public static int m29261f(int i, int i2) {
        return m29277v(i) + m29267l(i2);
    }

    /* renamed from: g */
    public static int m29262g(int i, int i2) {
        return m29277v(i) + 4;
    }

    /* renamed from: h */
    public static int m29263h(int i, long j) {
        return m29277v(i) + 8;
    }

    /* renamed from: i */
    public static int m29264i(int i, float f) {
        return m29277v(i) + 4;
    }

    @Deprecated
    /* renamed from: j */
    public static int m29265j(int i, C23845j1 j1Var, C23828f2 f2Var) {
        return (m29277v(i) * 2) + ((C23810b) j1Var).getSerializedSize(f2Var);
    }

    /* renamed from: k */
    public static int m29266k(int i, int i2) {
        return m29277v(i) + m29267l(i2);
    }

    /* renamed from: l */
    public static int m29267l(int i) {
        if (i >= 0) {
            return m29279x(i);
        }
        return 10;
    }

    /* renamed from: m */
    public static int m29268m(int i, long j) {
        return m29277v(i) + m29281z(j);
    }

    /* renamed from: n */
    public static int m29269n(C24018s0 s0Var) {
        int i;
        if (s0Var.f69053d != null) {
            i = s0Var.f69053d.size();
        } else {
            C16994k kVar = s0Var.f69050a;
            i = kVar != null ? kVar.size() : s0Var.f69052c != null ? s0Var.f69052c.getSerializedSize() : 0;
        }
        return m29279x(i) + i;
    }

    /* renamed from: o */
    public static int m29270o(int i, C23845j1 j1Var) {
        int v = m29277v(i);
        int serializedSize = j1Var.getSerializedSize();
        return v + m29279x(serializedSize) + serializedSize;
    }

    /* renamed from: p */
    public static int m29271p(int i, int i2) {
        return m29277v(i) + 4;
    }

    /* renamed from: q */
    public static int m29272q(int i, long j) {
        return m29277v(i) + 8;
    }

    /* renamed from: r */
    public static int m29273r(int i, int i2) {
        return m29277v(i) + m29279x((i2 >> 31) ^ (i2 << 1));
    }

    /* renamed from: s */
    public static int m29274s(int i, long j) {
        return m29277v(i) + m29281z((j >> 63) ^ (j << 1));
    }

    /* renamed from: t */
    public static int m29275t(int i, String str) {
        return m29277v(i) + m29276u(str);
    }

    /* renamed from: u */
    public static int m29276u(String str) {
        int i;
        try {
            i = C24079y2.m30060b(str);
        } catch (C24079y2.C17017d unused) {
            i = str.getBytes(C23908o0.f68505a).length;
        }
        return m29279x(i) + i;
    }

    /* renamed from: v */
    public static int m29277v(int i) {
        return m29279x((i << 3) | 0);
    }

    /* renamed from: w */
    public static int m29278w(int i, int i2) {
        return m29277v(i) + m29279x(i2);
    }

    /* renamed from: x */
    public static int m29279x(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & ShareElfFile.SectionHeader.SHF_MASKPROC) == 0 ? 4 : 5;
    }

    /* renamed from: y */
    public static int m29280y(int i, long j) {
        return m29277v(i) + m29281z(j);
    }

    /* renamed from: z */
    public static int m29281z(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            i = 6;
            j >>>= 28;
        } else {
            i = 2;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & -16384) != 0 ? i + 1 : i;
    }

    /* renamed from: A */
    public final void mo37894A(String str, C24079y2.C17017d dVar) {
        f68486b.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", dVar);
        byte[] bytes = str.getBytes(C23908o0.f68505a);
        try {
            mo37918Y(bytes.length);
            mo18733a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new C17009c(e);
        } catch (C17009c e2) {
            throw e2;
        }
    }

    /* renamed from: B */
    public abstract int mo37895B();

    /* renamed from: C */
    public abstract void mo37896C(byte b);

    /* renamed from: D */
    public abstract void mo37897D(int i, boolean z);

    /* renamed from: E */
    public abstract void mo37898E(byte[] bArr, int i, int i2);

    /* renamed from: F */
    public abstract void mo37899F(int i, C16994k kVar);

    /* renamed from: G */
    public abstract void mo37900G(C16994k kVar);

    /* renamed from: H */
    public final void mo37901H(int i, double d) {
        mo37904K(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: I */
    public abstract void mo37902I(int i, int i2);

    /* renamed from: J */
    public abstract void mo37903J(int i);

    /* renamed from: K */
    public abstract void mo37904K(int i, long j);

    /* renamed from: L */
    public abstract void mo37905L(long j);

    /* renamed from: M */
    public final void mo37906M(int i, float f) {
        mo37902I(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: N */
    public abstract void mo37907N(int i, int i2);

    /* renamed from: O */
    public abstract void mo37908O(int i);

    /* renamed from: P */
    public abstract void mo37909P(int i, C23845j1 j1Var);

    /* renamed from: Q */
    public abstract void mo37910Q(int i, C23845j1 j1Var, C23828f2 f2Var);

    /* renamed from: R */
    public abstract void mo37911R(C23845j1 j1Var);

    /* renamed from: S */
    public abstract void mo37912S(int i, C23845j1 j1Var);

    /* renamed from: T */
    public abstract void mo37913T(int i, C16994k kVar);

    /* renamed from: U */
    public abstract void mo37914U(int i, String str);

    /* renamed from: V */
    public abstract void mo37915V(String str);

    /* renamed from: W */
    public abstract void mo37916W(int i, int i2);

    /* renamed from: X */
    public abstract void mo37917X(int i, int i2);

    /* renamed from: Y */
    public abstract void mo37918Y(int i);

    /* renamed from: Z */
    public abstract void mo37919Z(int i, long j);

    /* renamed from: a0 */
    public abstract void mo37920a0(long j);
}
