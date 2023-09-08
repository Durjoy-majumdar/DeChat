package com.google.protobuf;

import androidx.exifinterface.media.ExifInterface;
import com.google.protobuf.C16994k;
import com.google.protobuf.C24087z2;
import com.tencent.wxmm.v2encoder;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: com.google.protobuf.g */
public abstract class C23829g implements C23819d2 {

    /* renamed from: com.google.protobuf.g$b */
    public static final class C23831b extends C23829g {

        /* renamed from: a */
        public final boolean f68252a;

        /* renamed from: b */
        public final byte[] f68253b;

        /* renamed from: c */
        public int f68254c;

        /* renamed from: d */
        public int f68255d;

        /* renamed from: e */
        public int f68256e;

        /* renamed from: f */
        public int f68257f;

        public C23831b(ByteBuffer byteBuffer, boolean z) {
            super((C23830a) null);
            this.f68252a = z;
            this.f68253b = byteBuffer.array();
            this.f68254c = byteBuffer.arrayOffset() + byteBuffer.position();
            this.f68255d = byteBuffer.arrayOffset() + byteBuffer.limit();
        }

        /* renamed from: A */
        public long mo37533A() {
            mo37632d0(0);
            return mo37628Z();
        }

        /* renamed from: B */
        public void mo37534B(List<Integer> list) {
            int i;
            int i2;
            if (list instanceof C23901n0) {
                C23901n0 n0Var = (C23901n0) list;
                int i3 = this.f68256e & 7;
                if (i3 == 2) {
                    int Y = mo37627Y();
                    mo37633e0(Y);
                    int i4 = this.f68254c + Y;
                    while (this.f68254c < i4) {
                        n0Var.mo37933h(mo37622T());
                    }
                } else if (i3 == 5) {
                    do {
                        n0Var.mo37933h(mo37570s());
                        if (!mo37619Q()) {
                            i2 = this.f68254c;
                        } else {
                            return;
                        }
                    } while (mo37627Y() == this.f68256e);
                    this.f68254c = i2;
                } else {
                    throw C23922p0.m29479d();
                }
            } else {
                int i5 = this.f68256e & 7;
                if (i5 == 2) {
                    int Y2 = mo37627Y();
                    mo37633e0(Y2);
                    int i6 = this.f68254c + Y2;
                    while (this.f68254c < i6) {
                        list.add(Integer.valueOf(mo37622T()));
                    }
                } else if (i5 == 5) {
                    do {
                        list.add(Integer.valueOf(mo37570s()));
                        if (!mo37619Q()) {
                            i = this.f68254c;
                        } else {
                            return;
                        }
                    } while (mo37627Y() == this.f68256e);
                    this.f68254c = i;
                } else {
                    throw C23922p0.m29479d();
                }
            }
        }

        /* renamed from: C */
        public int mo37535C() {
            if (mo37619Q()) {
                return Integer.MAX_VALUE;
            }
            int Y = mo37627Y();
            this.f68256e = Y;
            if (Y == this.f68257f) {
                return Integer.MAX_VALUE;
            }
            return Y >>> 3;
        }

        /* renamed from: D */
        public void mo37536D(List<String> list) {
            mo37626X(list, false);
        }

        /* renamed from: E */
        public void mo37537E(List<Float> list) {
            int i;
            int i2;
            if (list instanceof C23843i0) {
                C23843i0 i0Var = (C23843i0) list;
                int i3 = this.f68256e & 7;
                if (i3 == 2) {
                    int Y = mo37627Y();
                    mo37633e0(Y);
                    int i4 = this.f68254c + Y;
                    while (this.f68254c < i4) {
                        i0Var.mo37694h(Float.intBitsToFloat(mo37622T()));
                    }
                } else if (i3 == 5) {
                    do {
                        i0Var.mo37694h(readFloat());
                        if (!mo37619Q()) {
                            i2 = this.f68254c;
                        } else {
                            return;
                        }
                    } while (mo37627Y() == this.f68256e);
                    this.f68254c = i2;
                } else {
                    throw C23922p0.m29479d();
                }
            } else {
                int i5 = this.f68256e & 7;
                if (i5 == 2) {
                    int Y2 = mo37627Y();
                    mo37633e0(Y2);
                    int i6 = this.f68254c + Y2;
                    while (this.f68254c < i6) {
                        list.add(Float.valueOf(Float.intBitsToFloat(mo37622T())));
                    }
                } else if (i5 == 5) {
                    do {
                        list.add(Float.valueOf(readFloat()));
                        if (!mo37619Q()) {
                            i = this.f68254c;
                        } else {
                            return;
                        }
                    } while (mo37627Y() == this.f68256e);
                    this.f68254c = i;
                } else {
                    throw C23922p0.m29479d();
                }
            }
        }

        /* renamed from: F */
        public void mo37538F(List<C16994k> list) {
            int i;
            if ((this.f68256e & 7) == 2) {
                do {
                    list.add(mo37577z());
                    if (!mo37619Q()) {
                        i = this.f68254c;
                    } else {
                        return;
                    }
                } while (mo37627Y() == this.f68256e);
                this.f68254c = i;
                return;
            }
            throw C23922p0.m29479d();
        }

        /* renamed from: G */
        public void mo37539G(List<Double> list) {
            int i;
            int i2;
            if (list instanceof C24047u) {
                C24047u uVar = (C24047u) list;
                int i3 = this.f68256e & 7;
                if (i3 == 1) {
                    do {
                        uVar.mo38368h(readDouble());
                        if (!mo37619Q()) {
                            i2 = this.f68254c;
                        } else {
                            return;
                        }
                    } while (mo37627Y() == this.f68256e);
                    this.f68254c = i2;
                } else if (i3 == 2) {
                    int Y = mo37627Y();
                    mo37634f0(Y);
                    int i4 = this.f68254c + Y;
                    while (this.f68254c < i4) {
                        uVar.mo38368h(Double.longBitsToDouble(mo37623U()));
                    }
                } else {
                    throw C23922p0.m29479d();
                }
            } else {
                int i5 = this.f68256e & 7;
                if (i5 == 1) {
                    do {
                        list.add(Double.valueOf(readDouble()));
                        if (!mo37619Q()) {
                            i = this.f68254c;
                        } else {
                            return;
                        }
                    } while (mo37627Y() == this.f68256e);
                    this.f68254c = i;
                } else if (i5 == 2) {
                    int Y2 = mo37627Y();
                    mo37634f0(Y2);
                    int i6 = this.f68254c + Y2;
                    while (this.f68254c < i6) {
                        list.add(Double.valueOf(Double.longBitsToDouble(mo37623U())));
                    }
                } else {
                    throw C23922p0.m29479d();
                }
            }
        }

        /* renamed from: H */
        public long mo37540H() {
            mo37632d0(1);
            mo37630b0(8);
            return mo37623U();
        }

        /* renamed from: I */
        public void mo37541I(List<Integer> list) {
            int i;
            int i2;
            if (list instanceof C23901n0) {
                C23901n0 n0Var = (C23901n0) list;
                int i3 = this.f68256e & 7;
                if (i3 == 2) {
                    int Y = mo37627Y();
                    mo37633e0(Y);
                    int i4 = this.f68254c + Y;
                    while (this.f68254c < i4) {
                        n0Var.mo37933h(mo37622T());
                    }
                } else if (i3 == 5) {
                    do {
                        n0Var.mo37933h(mo37547O());
                        if (!mo37619Q()) {
                            i2 = this.f68254c;
                        } else {
                            return;
                        }
                    } while (mo37627Y() == this.f68256e);
                    this.f68254c = i2;
                } else {
                    throw C23922p0.m29479d();
                }
            } else {
                int i5 = this.f68256e & 7;
                if (i5 == 2) {
                    int Y2 = mo37627Y();
                    mo37633e0(Y2);
                    int i6 = this.f68254c + Y2;
                    while (this.f68254c < i6) {
                        list.add(Integer.valueOf(mo37622T()));
                    }
                } else if (i5 == 5) {
                    do {
                        list.add(Integer.valueOf(mo37547O()));
                        if (!mo37619Q()) {
                            i = this.f68254c;
                        } else {
                            return;
                        }
                    } while (mo37627Y() == this.f68256e);
                    this.f68254c = i;
                } else {
                    throw C23922p0.m29479d();
                }
            }
        }

        /* renamed from: J */
        public <T> void mo37542J(List<T> list, C23828f2<T> f2Var, C23806a0 a0Var) {
            int i;
            int i2 = this.f68256e;
            if ((i2 & 7) == 3) {
                do {
                    list.add(mo37621S(f2Var, a0Var));
                    if (!mo37619Q()) {
                        i = this.f68254c;
                    } else {
                        return;
                    }
                } while (mo37627Y() == i2);
                this.f68254c = i;
                return;
            }
            throw C23922p0.m29479d();
        }

        /* renamed from: K */
        public void mo37543K(List<Long> list) {
            int i;
            int i2;
            if (list instanceof C24061w0) {
                C24061w0 w0Var = (C24061w0) list;
                int i3 = this.f68256e & 7;
                if (i3 == 0) {
                    do {
                        w0Var.mo38392h(mo37559j());
                        if (!mo37619Q()) {
                            i2 = this.f68254c;
                        } else {
                            return;
                        }
                    } while (mo37627Y() == this.f68256e);
                    this.f68254c = i2;
                } else if (i3 == 2) {
                    int Y = this.f68254c + mo37627Y();
                    while (this.f68254c < Y) {
                        w0Var.mo38392h(mo37628Z());
                    }
                    mo37631c0(Y);
                } else {
                    throw C23922p0.m29479d();
                }
            } else {
                int i4 = this.f68256e & 7;
                if (i4 == 0) {
                    do {
                        list.add(Long.valueOf(mo37559j()));
                        if (!mo37619Q()) {
                            i = this.f68254c;
                        } else {
                            return;
                        }
                    } while (mo37627Y() == this.f68256e);
                    this.f68254c = i;
                } else if (i4 == 2) {
                    int Y2 = this.f68254c + mo37627Y();
                    while (this.f68254c < Y2) {
                        list.add(Long.valueOf(mo37628Z()));
                    }
                    mo37631c0(Y2);
                } else {
                    throw C23922p0.m29479d();
                }
            }
        }

        /* renamed from: L */
        public void mo37544L(List<Integer> list) {
            int i;
            int i2;
            if (list instanceof C23901n0) {
                C23901n0 n0Var = (C23901n0) list;
                int i3 = this.f68256e & 7;
                if (i3 == 0) {
                    do {
                        n0Var.mo37933h(mo37550b());
                        if (!mo37619Q()) {
                            i2 = this.f68254c;
                        } else {
                            return;
                        }
                    } while (mo37627Y() == this.f68256e);
                    this.f68254c = i2;
                } else if (i3 == 2) {
                    int Y = this.f68254c + mo37627Y();
                    while (this.f68254c < Y) {
                        n0Var.mo37933h(mo37627Y());
                    }
                } else {
                    throw C23922p0.m29479d();
                }
            } else {
                int i4 = this.f68256e & 7;
                if (i4 == 0) {
                    do {
                        list.add(Integer.valueOf(mo37550b()));
                        if (!mo37619Q()) {
                            i = this.f68254c;
                        } else {
                            return;
                        }
                    } while (mo37627Y() == this.f68256e);
                    this.f68254c = i;
                } else if (i4 == 2) {
                    int Y2 = this.f68254c + mo37627Y();
                    while (this.f68254c < Y2) {
                        list.add(Integer.valueOf(mo37627Y()));
                    }
                } else {
                    throw C23922p0.m29479d();
                }
            }
        }

        /* renamed from: M */
        public void mo37545M(List<Integer> list) {
            int i;
            int i2;
            if (list instanceof C23901n0) {
                C23901n0 n0Var = (C23901n0) list;
                int i3 = this.f68256e & 7;
                if (i3 == 0) {
                    do {
                        n0Var.mo37933h(mo37549a());
                        if (!mo37619Q()) {
                            i2 = this.f68254c;
                        } else {
                            return;
                        }
                    } while (mo37627Y() == this.f68256e);
                    this.f68254c = i2;
                } else if (i3 == 2) {
                    int Y = this.f68254c + mo37627Y();
                    while (this.f68254c < Y) {
                        n0Var.mo37933h(mo37627Y());
                    }
                } else {
                    throw C23922p0.m29479d();
                }
            } else {
                int i4 = this.f68256e & 7;
                if (i4 == 0) {
                    do {
                        list.add(Integer.valueOf(mo37549a()));
                        if (!mo37619Q()) {
                            i = this.f68254c;
                        } else {
                            return;
                        }
                    } while (mo37627Y() == this.f68256e);
                    this.f68254c = i;
                } else if (i4 == 2) {
                    int Y2 = this.f68254c + mo37627Y();
                    while (this.f68254c < Y2) {
                        list.add(Integer.valueOf(mo37627Y()));
                    }
                } else {
                    throw C23922p0.m29479d();
                }
            }
        }

        /* renamed from: N */
        public long mo37546N() {
            mo37632d0(0);
            return C23856l.m28956c(mo37628Z());
        }

        /* renamed from: O */
        public int mo37547O() {
            mo37632d0(5);
            mo37630b0(4);
            return mo37622T();
        }

        /* renamed from: P */
        public String mo37548P() {
            return mo37625W(true);
        }

        /* renamed from: Q */
        public final boolean mo37619Q() {
            return this.f68254c == this.f68255d;
        }

        /* renamed from: R */
        public final Object mo37620R(C24087z2.C24089b bVar, Class<?> cls, C23806a0 a0Var) {
            switch (bVar.ordinal()) {
                case 0:
                    return Double.valueOf(readDouble());
                case 1:
                    return Float.valueOf(readFloat());
                case 2:
                    return Long.valueOf(mo37559j());
                case 3:
                    return Long.valueOf(mo37533A());
                case 4:
                    return Integer.valueOf(mo37565p());
                case 5:
                    return Long.valueOf(mo37540H());
                case 6:
                    return Integer.valueOf(mo37570s());
                case 7:
                    return Boolean.valueOf(mo37560k());
                case 8:
                    return mo37625W(true);
                case 10:
                    return mo37567r(cls, a0Var);
                case 11:
                    return mo37577z();
                case 12:
                    return Integer.valueOf(mo37549a());
                case 13:
                    return Integer.valueOf(mo37550b());
                case 14:
                    return Integer.valueOf(mo37547O());
                case 15:
                    return Long.valueOf(mo37574w());
                case 16:
                    return Integer.valueOf(mo37575x());
                case 17:
                    return Long.valueOf(mo37546N());
                default:
                    throw new RuntimeException("unsupported field type.");
            }
        }

        /* renamed from: S */
        public final <T> T mo37621S(C23828f2<T> f2Var, C23806a0 a0Var) {
            int i = this.f68257f;
            this.f68257f = ((this.f68256e >>> 3) << 3) | 4;
            try {
                T g = f2Var.mo37616g();
                f2Var.mo37617h(g, this, a0Var);
                f2Var.mo37613e(g);
                if (this.f68256e == this.f68257f) {
                    return g;
                }
                throw C23922p0.m29482g();
            } finally {
                this.f68257f = i;
            }
        }

        /* renamed from: T */
        public final int mo37622T() {
            int i = this.f68254c;
            byte[] bArr = this.f68253b;
            this.f68254c = i + 4;
            return ((bArr[i + 3] & ExifInterface.MARKER) << 24) | (bArr[i] & ExifInterface.MARKER) | ((bArr[i + 1] & ExifInterface.MARKER) << 8) | ((bArr[i + 2] & ExifInterface.MARKER) << v2encoder.enumCODEC_vcodec2);
        }

        /* renamed from: U */
        public final long mo37623U() {
            int i = this.f68254c;
            byte[] bArr = this.f68253b;
            this.f68254c = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }

        /* renamed from: V */
        public final <T> T mo37624V(C23828f2<T> f2Var, C23806a0 a0Var) {
            int Y = mo37627Y();
            mo37630b0(Y);
            int i = this.f68255d;
            int i2 = this.f68254c + Y;
            this.f68255d = i2;
            try {
                T g = f2Var.mo37616g();
                f2Var.mo37617h(g, this, a0Var);
                f2Var.mo37613e(g);
                if (this.f68254c == i2) {
                    return g;
                }
                throw C23922p0.m29482g();
            } finally {
                this.f68255d = i;
            }
        }

        /* renamed from: W */
        public String mo37625W(boolean z) {
            mo37632d0(2);
            int Y = mo37627Y();
            if (Y == 0) {
                return "";
            }
            mo37630b0(Y);
            if (z) {
                byte[] bArr = this.f68253b;
                int i = this.f68254c;
                if (!C24079y2.m30063e(bArr, i, i + Y)) {
                    throw C23922p0.m29478c();
                }
            }
            String str = new String(this.f68253b, this.f68254c, Y, C23908o0.f68505a);
            this.f68254c += Y;
            return str;
        }

        /* renamed from: X */
        public void mo37626X(List<String> list, boolean z) {
            int i;
            int i2;
            if ((this.f68256e & 7) != 2) {
                throw C23922p0.m29479d();
            } else if (!(list instanceof C24048u0) || z) {
                do {
                    list.add(mo37625W(z));
                    if (!mo37619Q()) {
                        i = this.f68254c;
                    } else {
                        return;
                    }
                } while (mo37627Y() == this.f68256e);
                this.f68254c = i;
            } else {
                C24048u0 u0Var = (C24048u0) list;
                do {
                    u0Var.mo38353g(mo37577z());
                    if (!mo37619Q()) {
                        i2 = this.f68254c;
                    } else {
                        return;
                    }
                } while (mo37627Y() == this.f68256e);
                this.f68254c = i2;
            }
        }

        /* renamed from: Y */
        public final int mo37627Y() {
            byte b;
            int i = this.f68254c;
            int i2 = this.f68255d;
            if (i2 != i) {
                byte[] bArr = this.f68253b;
                int i3 = i + 1;
                byte b2 = bArr[i];
                if (b2 >= 0) {
                    this.f68254c = i3;
                    return b2;
                } else if (i2 - i3 < 9) {
                    return (int) mo37629a0();
                } else {
                    int i4 = i3 + 1;
                    byte b3 = b2 ^ (bArr[i3] << 7);
                    if (b3 < 0) {
                        b = b3 ^ Byte.MIN_VALUE;
                    } else {
                        int i5 = i4 + 1;
                        byte b4 = b3 ^ (bArr[i4] << 14);
                        if (b4 >= 0) {
                            b = b4 ^ 16256;
                        } else {
                            i4 = i5 + 1;
                            byte b5 = b4 ^ (bArr[i5] << 21);
                            if (b5 < 0) {
                                b = b5 ^ -2080896;
                            } else {
                                i5 = i4 + 1;
                                byte b6 = bArr[i4];
                                b = (b5 ^ (b6 << 28)) ^ 266354560;
                                if (b6 < 0) {
                                    i4 = i5 + 1;
                                    if (bArr[i5] < 0) {
                                        i5 = i4 + 1;
                                        if (bArr[i4] < 0) {
                                            i4 = i5 + 1;
                                            if (bArr[i5] < 0) {
                                                i5 = i4 + 1;
                                                if (bArr[i4] < 0) {
                                                    i4 = i5 + 1;
                                                    if (bArr[i5] < 0) {
                                                        throw C23922p0.m29480e();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i4 = i5;
                    }
                    this.f68254c = i4;
                    return b;
                }
            } else {
                throw C23922p0.m29484i();
            }
        }

        /* renamed from: Z */
        public long mo37628Z() {
            long j;
            int i;
            long j2;
            long j3;
            byte b;
            int i2 = this.f68254c;
            int i3 = this.f68255d;
            if (i3 != i2) {
                byte[] bArr = this.f68253b;
                int i4 = i2 + 1;
                byte b2 = bArr[i2];
                if (b2 >= 0) {
                    this.f68254c = i4;
                    return (long) b2;
                } else if (i3 - i4 < 9) {
                    return mo37629a0();
                } else {
                    int i5 = i4 + 1;
                    byte b3 = b2 ^ (bArr[i4] << 7);
                    if (b3 < 0) {
                        b = b3 ^ Byte.MIN_VALUE;
                    } else {
                        int i6 = i5 + 1;
                        byte b4 = b3 ^ (bArr[i5] << 14);
                        if (b4 >= 0) {
                            i = i6;
                            j = (long) (b4 ^ 16256);
                        } else {
                            i5 = i6 + 1;
                            byte b5 = b4 ^ (bArr[i6] << 21);
                            if (b5 < 0) {
                                b = b5 ^ -2080896;
                            } else {
                                long j4 = (long) b5;
                                int i7 = i5 + 1;
                                long j5 = j4 ^ (((long) bArr[i5]) << 28);
                                if (j5 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    int i8 = i7 + 1;
                                    long j6 = j5 ^ (((long) bArr[i7]) << 35);
                                    if (j6 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        i7 = i8 + 1;
                                        j5 = j6 ^ (((long) bArr[i8]) << 42);
                                        if (j5 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            i8 = i7 + 1;
                                            j6 = j5 ^ (((long) bArr[i7]) << 49);
                                            if (j6 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                int i9 = i8 + 1;
                                                long j7 = (j6 ^ (((long) bArr[i8]) << 56)) ^ 71499008037633920L;
                                                if (j7 < 0) {
                                                    i = i9 + 1;
                                                    if (((long) bArr[i9]) < 0) {
                                                        throw C23922p0.m29480e();
                                                    }
                                                } else {
                                                    i = i9;
                                                }
                                                j = j7;
                                            }
                                        }
                                    }
                                    j = j6 ^ j2;
                                }
                                j = j5 ^ j3;
                                i = i7;
                            }
                        }
                        this.f68254c = i;
                        return j;
                    }
                    j = (long) b;
                    this.f68254c = i;
                    return j;
                }
            } else {
                throw C23922p0.m29484i();
            }
        }

        /* renamed from: a */
        public int mo37549a() {
            mo37632d0(0);
            return mo37627Y();
        }

        /* renamed from: a0 */
        public final long mo37629a0() {
            long j = 0;
            int i = 0;
            while (i < 64) {
                int i2 = this.f68254c;
                if (i2 != this.f68255d) {
                    byte[] bArr = this.f68253b;
                    this.f68254c = i2 + 1;
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

        /* renamed from: b */
        public int mo37550b() {
            mo37632d0(0);
            return mo37627Y();
        }

        /* renamed from: b0 */
        public final void mo37630b0(int i) {
            if (i < 0 || i > this.f68255d - this.f68254c) {
                throw C23922p0.m29484i();
            }
        }

        /* renamed from: c */
        public void mo37551c(List<Boolean> list) {
            int i;
            int i2;
            if (list instanceof C23838h) {
                C23838h hVar = (C23838h) list;
                int i3 = this.f68256e & 7;
                if (i3 == 0) {
                    do {
                        hVar.mo37681h(mo37560k());
                        if (!mo37619Q()) {
                            i2 = this.f68254c;
                        } else {
                            return;
                        }
                    } while (mo37627Y() == this.f68256e);
                    this.f68254c = i2;
                } else if (i3 == 2) {
                    int Y = this.f68254c + mo37627Y();
                    while (this.f68254c < Y) {
                        hVar.mo37681h(mo37627Y() != 0);
                    }
                    mo37631c0(Y);
                } else {
                    throw C23922p0.m29479d();
                }
            } else {
                int i4 = this.f68256e & 7;
                if (i4 == 0) {
                    do {
                        list.add(Boolean.valueOf(mo37560k()));
                        if (!mo37619Q()) {
                            i = this.f68254c;
                        } else {
                            return;
                        }
                    } while (mo37627Y() == this.f68256e);
                    this.f68254c = i;
                } else if (i4 == 2) {
                    int Y2 = this.f68254c + mo37627Y();
                    while (this.f68254c < Y2) {
                        list.add(Boolean.valueOf(mo37627Y() != 0));
                    }
                    mo37631c0(Y2);
                } else {
                    throw C23922p0.m29479d();
                }
            }
        }

        /* renamed from: c0 */
        public final void mo37631c0(int i) {
            if (this.f68254c != i) {
                throw C23922p0.m29484i();
            }
        }

        /* renamed from: d */
        public void mo37552d(List<Integer> list) {
            int i;
            int i2;
            if (list instanceof C23901n0) {
                C23901n0 n0Var = (C23901n0) list;
                int i3 = this.f68256e & 7;
                if (i3 == 0) {
                    do {
                        n0Var.mo37933h(mo37575x());
                        if (!mo37619Q()) {
                            i2 = this.f68254c;
                        } else {
                            return;
                        }
                    } while (mo37627Y() == this.f68256e);
                    this.f68254c = i2;
                } else if (i3 == 2) {
                    int Y = this.f68254c + mo37627Y();
                    while (this.f68254c < Y) {
                        n0Var.mo37933h(C23856l.m28955b(mo37627Y()));
                    }
                } else {
                    throw C23922p0.m29479d();
                }
            } else {
                int i4 = this.f68256e & 7;
                if (i4 == 0) {
                    do {
                        list.add(Integer.valueOf(mo37575x()));
                        if (!mo37619Q()) {
                            i = this.f68254c;
                        } else {
                            return;
                        }
                    } while (mo37627Y() == this.f68256e);
                    this.f68254c = i;
                } else if (i4 == 2) {
                    int Y2 = this.f68254c + mo37627Y();
                    while (this.f68254c < Y2) {
                        list.add(Integer.valueOf(C23856l.m28955b(mo37627Y())));
                    }
                } else {
                    throw C23922p0.m29479d();
                }
            }
        }

        /* renamed from: d0 */
        public final void mo37632d0(int i) {
            if ((this.f68256e & 7) != i) {
                throw C23922p0.m29479d();
            }
        }

        /* renamed from: e */
        public <T> T mo37553e(C23828f2<T> f2Var, C23806a0 a0Var) {
            mo37632d0(3);
            return mo37621S(f2Var, a0Var);
        }

        /* renamed from: e0 */
        public final void mo37633e0(int i) {
            mo37630b0(i);
            if ((i & 3) != 0) {
                throw C23922p0.m29482g();
            }
        }

        /* renamed from: f */
        public void mo37554f(List<Long> list) {
            int i;
            int i2;
            if (list instanceof C24061w0) {
                C24061w0 w0Var = (C24061w0) list;
                int i3 = this.f68256e & 7;
                if (i3 == 1) {
                    do {
                        w0Var.mo38392h(mo37574w());
                        if (!mo37619Q()) {
                            i2 = this.f68254c;
                        } else {
                            return;
                        }
                    } while (mo37627Y() == this.f68256e);
                    this.f68254c = i2;
                } else if (i3 == 2) {
                    int Y = mo37627Y();
                    mo37634f0(Y);
                    int i4 = this.f68254c + Y;
                    while (this.f68254c < i4) {
                        w0Var.mo38392h(mo37623U());
                    }
                } else {
                    throw C23922p0.m29479d();
                }
            } else {
                int i5 = this.f68256e & 7;
                if (i5 == 1) {
                    do {
                        list.add(Long.valueOf(mo37574w()));
                        if (!mo37619Q()) {
                            i = this.f68254c;
                        } else {
                            return;
                        }
                    } while (mo37627Y() == this.f68256e);
                    this.f68254c = i;
                } else if (i5 == 2) {
                    int Y2 = mo37627Y();
                    mo37634f0(Y2);
                    int i6 = this.f68254c + Y2;
                    while (this.f68254c < i6) {
                        list.add(Long.valueOf(mo37623U()));
                    }
                } else {
                    throw C23922p0.m29479d();
                }
            }
        }

        /* renamed from: f0 */
        public final void mo37634f0(int i) {
            mo37630b0(i);
            if ((i & 7) != 0) {
                throw C23922p0.m29482g();
            }
        }

        /* renamed from: g */
        public void mo37555g(List<Integer> list) {
            int i;
            int i2;
            if (list instanceof C23901n0) {
                C23901n0 n0Var = (C23901n0) list;
                int i3 = this.f68256e & 7;
                if (i3 == 0) {
                    do {
                        n0Var.mo37933h(mo37565p());
                        if (!mo37619Q()) {
                            i2 = this.f68254c;
                        } else {
                            return;
                        }
                    } while (mo37627Y() == this.f68256e);
                    this.f68254c = i2;
                } else if (i3 == 2) {
                    int Y = this.f68254c + mo37627Y();
                    while (this.f68254c < Y) {
                        n0Var.mo37933h(mo37627Y());
                    }
                    mo37631c0(Y);
                } else {
                    throw C23922p0.m29479d();
                }
            } else {
                int i4 = this.f68256e & 7;
                if (i4 == 0) {
                    do {
                        list.add(Integer.valueOf(mo37565p()));
                        if (!mo37619Q()) {
                            i = this.f68254c;
                        } else {
                            return;
                        }
                    } while (mo37627Y() == this.f68256e);
                    this.f68254c = i;
                } else if (i4 == 2) {
                    int Y2 = this.f68254c + mo37627Y();
                    while (this.f68254c < Y2) {
                        list.add(Integer.valueOf(mo37627Y()));
                    }
                    mo37631c0(Y2);
                } else {
                    throw C23922p0.m29479d();
                }
            }
        }

        public int getTag() {
            return this.f68256e;
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0033 A[LOOP:0: B:18:0x0033->B:21:0x0040, LOOP_START] */
        /* renamed from: i */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo37558i() {
            /*
                r7 = this;
                boolean r0 = r7.mo37619Q()
                r1 = 0
                if (r0 != 0) goto L_0x00a3
                int r0 = r7.f68256e
                int r2 = r7.f68257f
                if (r0 != r2) goto L_0x000f
                goto L_0x00a3
            L_0x000f:
                r3 = r0 & 7
                r4 = 1
                if (r3 == 0) goto L_0x0068
                if (r3 == r4) goto L_0x005d
                r1 = 2
                if (r3 == r1) goto L_0x0050
                r1 = 4
                r5 = 3
                if (r3 == r5) goto L_0x002e
                r0 = 5
                if (r3 != r0) goto L_0x0029
                r7.mo37630b0(r1)
                int r0 = r7.f68254c
                int r0 = r0 + r1
                r7.f68254c = r0
                return r4
            L_0x0029:
                com.google.protobuf.p0$a r0 = com.google.protobuf.C23922p0.m29479d()
                throw r0
            L_0x002e:
                int r0 = r0 >>> r5
                int r0 = r0 << r5
                r0 = r0 | r1
                r7.f68257f = r0
            L_0x0033:
                int r0 = r7.mo37535C()
                r1 = 2147483647(0x7fffffff, float:NaN)
                if (r0 == r1) goto L_0x0042
                boolean r0 = r7.mo37558i()
                if (r0 != 0) goto L_0x0033
            L_0x0042:
                int r0 = r7.f68256e
                int r1 = r7.f68257f
                if (r0 != r1) goto L_0x004b
                r7.f68257f = r2
                return r4
            L_0x004b:
                com.google.protobuf.p0 r0 = com.google.protobuf.C23922p0.m29482g()
                throw r0
            L_0x0050:
                int r0 = r7.mo37627Y()
                r7.mo37630b0(r0)
                int r1 = r7.f68254c
                int r1 = r1 + r0
                r7.f68254c = r1
                return r4
            L_0x005d:
                r0 = 8
                r7.mo37630b0(r0)
                int r1 = r7.f68254c
                int r1 = r1 + r0
                r7.f68254c = r1
                return r4
            L_0x0068:
                int r0 = r7.f68255d
                int r2 = r7.f68254c
                int r0 = r0 - r2
                r3 = 10
                if (r0 < r3) goto L_0x0083
                byte[] r0 = r7.f68253b
                r5 = 0
            L_0x0074:
                if (r5 >= r3) goto L_0x0083
                int r6 = r2 + 1
                byte r2 = r0[r2]
                if (r2 < 0) goto L_0x007f
                r7.f68254c = r6
                goto L_0x0095
            L_0x007f:
                int r5 = r5 + 1
                r2 = r6
                goto L_0x0074
            L_0x0083:
                if (r1 >= r3) goto L_0x009e
                int r0 = r7.f68254c
                int r2 = r7.f68255d
                if (r0 == r2) goto L_0x0099
                byte[] r2 = r7.f68253b
                int r5 = r0 + 1
                r7.f68254c = r5
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0096
            L_0x0095:
                return r4
            L_0x0096:
                int r1 = r1 + 1
                goto L_0x0083
            L_0x0099:
                com.google.protobuf.p0 r0 = com.google.protobuf.C23922p0.m29484i()
                throw r0
            L_0x009e:
                com.google.protobuf.p0 r0 = com.google.protobuf.C23922p0.m29480e()
                throw r0
            L_0x00a3:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C23829g.C23831b.mo37558i():boolean");
        }

        /* renamed from: j */
        public long mo37559j() {
            mo37632d0(0);
            return mo37628Z();
        }

        /* renamed from: k */
        public boolean mo37560k() {
            mo37632d0(0);
            return mo37627Y() != 0;
        }

        /* renamed from: l */
        public <T> void mo37561l(List<T> list, C23828f2<T> f2Var, C23806a0 a0Var) {
            int i;
            int i2 = this.f68256e;
            if ((i2 & 7) == 2) {
                do {
                    list.add(mo37624V(f2Var, a0Var));
                    if (!mo37619Q()) {
                        i = this.f68254c;
                    } else {
                        return;
                    }
                } while (mo37627Y() == i2);
                this.f68254c = i;
                return;
            }
            throw C23922p0.m29479d();
        }

        /* renamed from: m */
        public void mo37562m(List<Long> list) {
            int i;
            int i2;
            if (list instanceof C24061w0) {
                C24061w0 w0Var = (C24061w0) list;
                int i3 = this.f68256e & 7;
                if (i3 == 0) {
                    do {
                        w0Var.mo38392h(mo37533A());
                        if (!mo37619Q()) {
                            i2 = this.f68254c;
                        } else {
                            return;
                        }
                    } while (mo37627Y() == this.f68256e);
                    this.f68254c = i2;
                } else if (i3 == 2) {
                    int Y = this.f68254c + mo37627Y();
                    while (this.f68254c < Y) {
                        w0Var.mo38392h(mo37628Z());
                    }
                    mo37631c0(Y);
                } else {
                    throw C23922p0.m29479d();
                }
            } else {
                int i4 = this.f68256e & 7;
                if (i4 == 0) {
                    do {
                        list.add(Long.valueOf(mo37533A()));
                        if (!mo37619Q()) {
                            i = this.f68254c;
                        } else {
                            return;
                        }
                    } while (mo37627Y() == this.f68256e);
                    this.f68254c = i;
                } else if (i4 == 2) {
                    int Y2 = this.f68254c + mo37627Y();
                    while (this.f68254c < Y2) {
                        list.add(Long.valueOf(mo37628Z()));
                    }
                    mo37631c0(Y2);
                } else {
                    throw C23922p0.m29479d();
                }
            }
        }

        /* renamed from: n */
        public <T> T mo37563n(Class<T> cls, C23806a0 a0Var) {
            mo37632d0(3);
            return mo37621S(C24086z1.f69225c.mo38436a(cls), a0Var);
        }

        /* renamed from: o */
        public void mo37564o(List<String> list) {
            mo37626X(list, true);
        }

        /* renamed from: p */
        public int mo37565p() {
            mo37632d0(0);
            return mo37627Y();
        }

        /* renamed from: q */
        public void mo37566q(List<Long> list) {
            int i;
            int i2;
            if (list instanceof C24061w0) {
                C24061w0 w0Var = (C24061w0) list;
                int i3 = this.f68256e & 7;
                if (i3 == 1) {
                    do {
                        w0Var.mo38392h(mo37540H());
                        if (!mo37619Q()) {
                            i2 = this.f68254c;
                        } else {
                            return;
                        }
                    } while (mo37627Y() == this.f68256e);
                    this.f68254c = i2;
                } else if (i3 == 2) {
                    int Y = mo37627Y();
                    mo37634f0(Y);
                    int i4 = this.f68254c + Y;
                    while (this.f68254c < i4) {
                        w0Var.mo38392h(mo37623U());
                    }
                } else {
                    throw C23922p0.m29479d();
                }
            } else {
                int i5 = this.f68256e & 7;
                if (i5 == 1) {
                    do {
                        list.add(Long.valueOf(mo37540H()));
                        if (!mo37619Q()) {
                            i = this.f68254c;
                        } else {
                            return;
                        }
                    } while (mo37627Y() == this.f68256e);
                    this.f68254c = i;
                } else if (i5 == 2) {
                    int Y2 = mo37627Y();
                    mo37634f0(Y2);
                    int i6 = this.f68254c + Y2;
                    while (this.f68254c < i6) {
                        list.add(Long.valueOf(mo37623U()));
                    }
                } else {
                    throw C23922p0.m29479d();
                }
            }
        }

        /* renamed from: r */
        public <T> T mo37567r(Class<T> cls, C23806a0 a0Var) {
            mo37632d0(2);
            return mo37624V(C24086z1.f69225c.mo38436a(cls), a0Var);
        }

        public double readDouble() {
            mo37632d0(1);
            mo37630b0(8);
            return Double.longBitsToDouble(mo37623U());
        }

        public float readFloat() {
            mo37632d0(5);
            mo37630b0(4);
            return Float.intBitsToFloat(mo37622T());
        }

        /* renamed from: s */
        public int mo37570s() {
            mo37632d0(5);
            mo37630b0(4);
            return mo37622T();
        }

        /* renamed from: t */
        public String mo37571t() {
            return mo37625W(false);
        }

        /* renamed from: u */
        public <T> T mo37572u(C23828f2<T> f2Var, C23806a0 a0Var) {
            mo37632d0(2);
            return mo37624V(f2Var, a0Var);
        }

        /* renamed from: v */
        public void mo37573v(List<Long> list) {
            int i;
            int i2;
            if (list instanceof C24061w0) {
                C24061w0 w0Var = (C24061w0) list;
                int i3 = this.f68256e & 7;
                if (i3 == 0) {
                    do {
                        w0Var.mo38392h(mo37546N());
                        if (!mo37619Q()) {
                            i2 = this.f68254c;
                        } else {
                            return;
                        }
                    } while (mo37627Y() == this.f68256e);
                    this.f68254c = i2;
                } else if (i3 == 2) {
                    int Y = this.f68254c + mo37627Y();
                    while (this.f68254c < Y) {
                        w0Var.mo38392h(C23856l.m28956c(mo37628Z()));
                    }
                } else {
                    throw C23922p0.m29479d();
                }
            } else {
                int i4 = this.f68256e & 7;
                if (i4 == 0) {
                    do {
                        list.add(Long.valueOf(mo37546N()));
                        if (!mo37619Q()) {
                            i = this.f68254c;
                        } else {
                            return;
                        }
                    } while (mo37627Y() == this.f68256e);
                    this.f68254c = i;
                } else if (i4 == 2) {
                    int Y2 = this.f68254c + mo37627Y();
                    while (this.f68254c < Y2) {
                        list.add(Long.valueOf(C23856l.m28956c(mo37628Z())));
                    }
                } else {
                    throw C23922p0.m29479d();
                }
            }
        }

        /* renamed from: w */
        public long mo37574w() {
            mo37632d0(1);
            mo37630b0(8);
            return mo37623U();
        }

        /* renamed from: x */
        public int mo37575x() {
            mo37632d0(0);
            return C23856l.m28955b(mo37627Y());
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(3:19|20|(2:22|35)(3:30|23|24)) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0052, code lost:
            if (mo37558i() != false) goto L_0x0054;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x005a, code lost:
            throw new com.google.protobuf.C23922p0("Unable to parse map entry.");
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004e */
        /* renamed from: y */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public <K, V> void mo37576y(java.util.Map<K, V> r8, com.google.protobuf.C24084z0.C24085a<K, V> r9, com.google.protobuf.C23806a0 r10) {
            /*
                r7 = this;
                r0 = 2
                r7.mo37632d0(r0)
                int r1 = r7.mo37627Y()
                r7.mo37630b0(r1)
                int r2 = r7.f68255d
                int r3 = r7.f68254c
                int r3 = r3 + r1
                r7.f68255d = r3
                K r1 = r9.f69222b     // Catch:{ all -> 0x005b }
                V r3 = r9.f69224d     // Catch:{ all -> 0x005b }
            L_0x0016:
                int r4 = r7.mo37535C()     // Catch:{ all -> 0x005b }
                r5 = 2147483647(0x7fffffff, float:NaN)
                if (r4 != r5) goto L_0x0025
                r8.put(r1, r3)     // Catch:{ all -> 0x005b }
                r7.f68255d = r2
                return
            L_0x0025:
                r5 = 1
                java.lang.String r6 = "Unable to parse map entry."
                if (r4 == r5) goto L_0x0046
                if (r4 == r0) goto L_0x0039
                boolean r4 = r7.mo37558i()     // Catch:{ a -> 0x004e }
                if (r4 == 0) goto L_0x0033
                goto L_0x0016
            L_0x0033:
                com.google.protobuf.p0 r4 = new com.google.protobuf.p0     // Catch:{ a -> 0x004e }
                r4.<init>((java.lang.String) r6)     // Catch:{ a -> 0x004e }
                throw r4     // Catch:{ a -> 0x004e }
            L_0x0039:
                com.google.protobuf.z2$b r4 = r9.f69223c     // Catch:{ a -> 0x004e }
                V r5 = r9.f69224d     // Catch:{ a -> 0x004e }
                java.lang.Class r5 = r5.getClass()     // Catch:{ a -> 0x004e }
                java.lang.Object r3 = r7.mo37620R(r4, r5, r10)     // Catch:{ a -> 0x004e }
                goto L_0x0016
            L_0x0046:
                com.google.protobuf.z2$b r4 = r9.f69221a     // Catch:{ a -> 0x004e }
                r5 = 0
                java.lang.Object r1 = r7.mo37620R(r4, r5, r5)     // Catch:{ a -> 0x004e }
                goto L_0x0016
            L_0x004e:
                boolean r4 = r7.mo37558i()     // Catch:{ all -> 0x005b }
                if (r4 == 0) goto L_0x0055
                goto L_0x0016
            L_0x0055:
                com.google.protobuf.p0 r8 = new com.google.protobuf.p0     // Catch:{ all -> 0x005b }
                r8.<init>((java.lang.String) r6)     // Catch:{ all -> 0x005b }
                throw r8     // Catch:{ all -> 0x005b }
            L_0x005b:
                r8 = move-exception
                r7.f68255d = r2
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C23829g.C23831b.mo37576y(java.util.Map, com.google.protobuf.z0$a, com.google.protobuf.a0):void");
        }

        /* renamed from: z */
        public C16994k mo37577z() {
            C16994k kVar;
            mo37632d0(2);
            int Y = mo37627Y();
            if (Y == 0) {
                return C16994k.f46000e;
            }
            mo37630b0(Y);
            if (this.f68252a) {
                byte[] bArr = this.f68253b;
                int i = this.f68254c;
                C16994k kVar2 = C16994k.f46000e;
                kVar = new C16994k.C16997c(bArr, i, Y);
            } else {
                kVar = C16994k.m16790i(this.f68253b, this.f68254c, Y);
            }
            this.f68254c += Y;
            return kVar;
        }
    }

    public C23829g(C23830a aVar) {
    }

    /* renamed from: h */
    public boolean mo37557h() {
        return false;
    }
}
