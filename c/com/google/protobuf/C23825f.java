package com.google.protobuf;

import androidx.exifinterface.media.ExifInterface;
import com.google.protobuf.C23806a0;
import com.google.protobuf.C23861l0;
import com.google.protobuf.C23908o0;
import com.tencent.wxmm.v2encoder;

/* renamed from: com.google.protobuf.f */
public final class C23825f {

    /* renamed from: com.google.protobuf.f$a */
    public static final class C23826a {

        /* renamed from: a */
        public int f68235a;

        /* renamed from: b */
        public long f68236b;

        /* renamed from: c */
        public Object f68237c;

        /* renamed from: d */
        public final C23806a0 f68238d;

        public C23826a(C23806a0 a0Var) {
            a0Var.getClass();
            this.f68238d = a0Var;
        }
    }

    /* renamed from: A */
    public static int m28719A(int i, byte[] bArr, int i2, int i3, C23908o0.C23919j<?> jVar, C23826a aVar) {
        C23901n0 n0Var = (C23901n0) jVar;
        int I = m28727I(bArr, i2, aVar);
        n0Var.mo37933h(C23856l.m28955b(aVar.f68235a));
        while (I < i3) {
            int I2 = m28727I(bArr, I, aVar);
            if (i != aVar.f68235a) {
                break;
            }
            I = m28727I(bArr, I2, aVar);
            n0Var.mo37933h(C23856l.m28955b(aVar.f68235a));
        }
        return I;
    }

    /* renamed from: B */
    public static int m28720B(int i, byte[] bArr, int i2, int i3, C23908o0.C23919j<?> jVar, C23826a aVar) {
        C24061w0 w0Var = (C24061w0) jVar;
        int K = m28729K(bArr, i2, aVar);
        w0Var.mo38392h(C23856l.m28956c(aVar.f68236b));
        while (K < i3) {
            int I = m28727I(bArr, K, aVar);
            if (i != aVar.f68235a) {
                break;
            }
            K = m28729K(bArr, I, aVar);
            w0Var.mo38392h(C23856l.m28956c(aVar.f68236b));
        }
        return K;
    }

    /* renamed from: C */
    public static int m28721C(byte[] bArr, int i, C23826a aVar) {
        int I = m28727I(bArr, i, aVar);
        int i2 = aVar.f68235a;
        if (i2 < 0) {
            throw C23922p0.m29481f();
        } else if (i2 == 0) {
            aVar.f68237c = "";
            return I;
        } else {
            aVar.f68237c = new String(bArr, I, i2, C23908o0.f68505a);
            return I + i2;
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044 A[EDGE_INSN: B:21:0x0044->B:17:0x0044 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001d  */
    /* renamed from: D */
    public static int m28722D(int r4, byte[] r5, int r6, int r7, com.google.protobuf.C23908o0.C23919j<?> r8, com.google.protobuf.C23825f.C23826a r9) {
        /*
            int r6 = m28727I(r5, r6, r9)
            int r0 = r9.f68235a
            if (r0 < 0) goto L_0x0045
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0010
            r8.add(r1)
            goto L_0x001b
        L_0x0010:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = com.google.protobuf.C23908o0.f68505a
            r2.<init>(r5, r6, r0, r3)
            r8.add(r2)
        L_0x001a:
            int r6 = r6 + r0
        L_0x001b:
            if (r6 >= r7) goto L_0x0044
            int r0 = m28727I(r5, r6, r9)
            int r2 = r9.f68235a
            if (r4 == r2) goto L_0x0026
            goto L_0x0044
        L_0x0026:
            int r6 = m28727I(r5, r0, r9)
            int r0 = r9.f68235a
            if (r0 < 0) goto L_0x003f
            if (r0 != 0) goto L_0x0034
            r8.add(r1)
            goto L_0x001b
        L_0x0034:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = com.google.protobuf.C23908o0.f68505a
            r2.<init>(r5, r6, r0, r3)
            r8.add(r2)
            goto L_0x001a
        L_0x003f:
            com.google.protobuf.p0 r4 = com.google.protobuf.C23922p0.m29481f()
            throw r4
        L_0x0044:
            return r6
        L_0x0045:
            com.google.protobuf.p0 r4 = com.google.protobuf.C23922p0.m29481f()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C23825f.m28722D(int, byte[], int, int, com.google.protobuf.o0$j, com.google.protobuf.f$a):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        r2 = r7 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0042, code lost:
        if (com.google.protobuf.C24079y2.m30063e(r6, r7, r2) == false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
        r9.add(new java.lang.String(r6, r7, r0, com.google.protobuf.C23908o0.f68505a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0053, code lost:
        throw com.google.protobuf.C23922p0.m29478c();
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0059 A[EDGE_INSN: B:28:0x0059->B:23:0x0059 ?: BREAK  , SYNTHETIC] */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m28723E(int r5, byte[] r6, int r7, int r8, com.google.protobuf.C23908o0.C23919j<?> r9, com.google.protobuf.C23825f.C23826a r10) {
        /*
            int r7 = m28727I(r6, r7, r10)
            int r0 = r10.f68235a
            if (r0 < 0) goto L_0x005f
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0010
            r9.add(r1)
            goto L_0x0023
        L_0x0010:
            int r2 = r7 + r0
            boolean r3 = com.google.protobuf.C24079y2.m30063e(r6, r7, r2)
            if (r3 == 0) goto L_0x005a
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = com.google.protobuf.C23908o0.f68505a
            r3.<init>(r6, r7, r0, r4)
            r9.add(r3)
        L_0x0022:
            r7 = r2
        L_0x0023:
            if (r7 >= r8) goto L_0x0059
            int r0 = m28727I(r6, r7, r10)
            int r2 = r10.f68235a
            if (r5 == r2) goto L_0x002e
            goto L_0x0059
        L_0x002e:
            int r7 = m28727I(r6, r0, r10)
            int r0 = r10.f68235a
            if (r0 < 0) goto L_0x0054
            if (r0 != 0) goto L_0x003c
            r9.add(r1)
            goto L_0x0023
        L_0x003c:
            int r2 = r7 + r0
            boolean r3 = com.google.protobuf.C24079y2.m30063e(r6, r7, r2)
            if (r3 == 0) goto L_0x004f
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = com.google.protobuf.C23908o0.f68505a
            r3.<init>(r6, r7, r0, r4)
            r9.add(r3)
            goto L_0x0022
        L_0x004f:
            com.google.protobuf.p0 r5 = com.google.protobuf.C23922p0.m29478c()
            throw r5
        L_0x0054:
            com.google.protobuf.p0 r5 = com.google.protobuf.C23922p0.m29481f()
            throw r5
        L_0x0059:
            return r7
        L_0x005a:
            com.google.protobuf.p0 r5 = com.google.protobuf.C23922p0.m29478c()
            throw r5
        L_0x005f:
            com.google.protobuf.p0 r5 = com.google.protobuf.C23922p0.m29481f()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C23825f.m28723E(int, byte[], int, int, com.google.protobuf.o0$j, com.google.protobuf.f$a):int");
    }

    /* renamed from: F */
    public static int m28724F(byte[] bArr, int i, C23826a aVar) {
        int I = m28727I(bArr, i, aVar);
        int i2 = aVar.f68235a;
        if (i2 < 0) {
            throw C23922p0.m29481f();
        } else if (i2 == 0) {
            aVar.f68237c = "";
            return I;
        } else {
            aVar.f68237c = C24079y2.f69220a.mo38431a(bArr, I, i2);
            return I + i2;
        }
    }

    /* renamed from: G */
    public static int m28725G(int i, byte[] bArr, int i2, int i3, C24046t2 t2Var, C23826a aVar) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int K = m28729K(bArr, i2, aVar);
                t2Var.mo38361d(i, Long.valueOf(aVar.f68236b));
                return K;
            } else if (i4 == 1) {
                t2Var.mo38361d(i, Long.valueOf(m28741j(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int I = m28727I(bArr, i2, aVar);
                int i5 = aVar.f68235a;
                if (i5 < 0) {
                    throw C23922p0.m29481f();
                } else if (i5 <= bArr.length - I) {
                    if (i5 == 0) {
                        t2Var.mo38361d(i, C16994k.f46000e);
                    } else {
                        t2Var.mo38361d(i, C16994k.m16790i(bArr, I, i5));
                    }
                    return I + i5;
                } else {
                    throw C23922p0.m29484i();
                }
            } else if (i4 == 3) {
                C24046t2 t2Var2 = new C24046t2();
                int i6 = (i & -8) | 4;
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int I2 = m28727I(bArr, i2, aVar);
                    int i8 = aVar.f68235a;
                    if (i8 == i6) {
                        i7 = i8;
                        i2 = I2;
                        break;
                    }
                    i7 = i8;
                    i2 = m28725G(i8, bArr, I2, i3, t2Var2, aVar);
                }
                if (i2 > i3 || i7 != i6) {
                    throw C23922p0.m29482g();
                }
                t2Var.mo38361d(i, t2Var2);
                return i2;
            } else if (i4 == 5) {
                t2Var.mo38361d(i, Integer.valueOf(m28739h(bArr, i2)));
                return i2 + 4;
            } else {
                throw C23922p0.m29477b();
            }
        } else {
            throw C23922p0.m29477b();
        }
    }

    /* renamed from: H */
    public static int m28726H(int i, byte[] bArr, int i2, C23826a aVar) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            aVar.f68235a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            aVar.f68235a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            aVar.f68235a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i15 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            aVar.f68235a = i9 | (b4 << 28);
            return i15;
        }
        int i16 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i17 = i15 + 1;
            if (bArr[i15] < 0) {
                i15 = i17;
            } else {
                aVar.f68235a = i16;
                return i17;
            }
        }
    }

    /* renamed from: I */
    public static int m28727I(byte[] bArr, int i, C23826a aVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m28726H(b, bArr, i2, aVar);
        }
        aVar.f68235a = b;
        return i2;
    }

    /* renamed from: J */
    public static int m28728J(int i, byte[] bArr, int i2, int i3, C23908o0.C23919j<?> jVar, C23826a aVar) {
        C23901n0 n0Var = (C23901n0) jVar;
        int I = m28727I(bArr, i2, aVar);
        n0Var.mo37933h(aVar.f68235a);
        while (I < i3) {
            int I2 = m28727I(bArr, I, aVar);
            if (i != aVar.f68235a) {
                break;
            }
            I = m28727I(bArr, I2, aVar);
            n0Var.mo37933h(aVar.f68235a);
        }
        return I;
    }

    /* renamed from: K */
    public static int m28729K(byte[] bArr, int i, C23826a aVar) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            aVar.f68236b = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & Byte.MAX_VALUE)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & Byte.MAX_VALUE)) << i4;
            int i6 = i5;
            b = b2;
            i3 = i6;
        }
        aVar.f68236b = j2;
        return i3;
    }

    /* renamed from: L */
    public static int m28730L(int i, byte[] bArr, int i2, int i3, C23908o0.C23919j<?> jVar, C23826a aVar) {
        C24061w0 w0Var = (C24061w0) jVar;
        int K = m28729K(bArr, i2, aVar);
        w0Var.mo38392h(aVar.f68236b);
        while (K < i3) {
            int I = m28727I(bArr, K, aVar);
            if (i != aVar.f68235a) {
                break;
            }
            K = m28729K(bArr, I, aVar);
            w0Var.mo38392h(aVar.f68236b);
        }
        return K;
    }

    /* renamed from: M */
    public static int m28731M(int i, byte[] bArr, int i2, int i3, C23826a aVar) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                return m28729K(bArr, i2, aVar);
            }
            if (i4 == 1) {
                return i2 + 8;
            }
            if (i4 == 2) {
                return m28727I(bArr, i2, aVar) + aVar.f68235a;
            }
            if (i4 == 3) {
                int i5 = (i & -8) | 4;
                int i6 = 0;
                while (i2 < i3) {
                    i2 = m28727I(bArr, i2, aVar);
                    i6 = aVar.f68235a;
                    if (i6 == i5) {
                        break;
                    }
                    i2 = m28731M(i6, bArr, i2, i3, aVar);
                }
                if (i2 <= i3 && i6 == i5) {
                    return i2;
                }
                throw C23922p0.m29482g();
            } else if (i4 == 5) {
                return i2 + 4;
            } else {
                throw C23922p0.m29477b();
            }
        } else {
            throw C23922p0.m29477b();
        }
    }

    /* renamed from: a */
    public static int m28732a(int i, byte[] bArr, int i2, int i3, C23908o0.C23919j<?> jVar, C23826a aVar) {
        C23838h hVar = (C23838h) jVar;
        int K = m28729K(bArr, i2, aVar);
        hVar.mo37681h(aVar.f68236b != 0);
        while (K < i3) {
            int I = m28727I(bArr, K, aVar);
            if (i != aVar.f68235a) {
                break;
            }
            K = m28729K(bArr, I, aVar);
            hVar.mo37681h(aVar.f68236b != 0);
        }
        return K;
    }

    /* renamed from: b */
    public static int m28733b(byte[] bArr, int i, C23826a aVar) {
        int I = m28727I(bArr, i, aVar);
        int i2 = aVar.f68235a;
        if (i2 < 0) {
            throw C23922p0.m29481f();
        } else if (i2 > bArr.length - I) {
            throw C23922p0.m29484i();
        } else if (i2 == 0) {
            aVar.f68237c = C16994k.f46000e;
            return I;
        } else {
            aVar.f68237c = C16994k.m16790i(bArr, I, i2);
            return I + i2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x004d A[EDGE_INSN: B:30:0x004d->B:22:0x004d ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001e  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m28734c(int r2, byte[] r3, int r4, int r5, com.google.protobuf.C23908o0.C23919j<?> r6, com.google.protobuf.C23825f.C23826a r7) {
        /*
            int r4 = m28727I(r3, r4, r7)
            int r0 = r7.f68235a
            if (r0 < 0) goto L_0x0053
            int r1 = r3.length
            int r1 = r1 - r4
            if (r0 > r1) goto L_0x004e
            if (r0 != 0) goto L_0x0014
            com.google.protobuf.k r0 = com.google.protobuf.C16994k.f46000e
            r6.add(r0)
            goto L_0x001c
        L_0x0014:
            com.google.protobuf.k r1 = com.google.protobuf.C16994k.m16790i(r3, r4, r0)
            r6.add(r1)
        L_0x001b:
            int r4 = r4 + r0
        L_0x001c:
            if (r4 >= r5) goto L_0x004d
            int r0 = m28727I(r3, r4, r7)
            int r1 = r7.f68235a
            if (r2 == r1) goto L_0x0027
            goto L_0x004d
        L_0x0027:
            int r4 = m28727I(r3, r0, r7)
            int r0 = r7.f68235a
            if (r0 < 0) goto L_0x0048
            int r1 = r3.length
            int r1 = r1 - r4
            if (r0 > r1) goto L_0x0043
            if (r0 != 0) goto L_0x003b
            com.google.protobuf.k r0 = com.google.protobuf.C16994k.f46000e
            r6.add(r0)
            goto L_0x001c
        L_0x003b:
            com.google.protobuf.k r1 = com.google.protobuf.C16994k.m16790i(r3, r4, r0)
            r6.add(r1)
            goto L_0x001b
        L_0x0043:
            com.google.protobuf.p0 r2 = com.google.protobuf.C23922p0.m29484i()
            throw r2
        L_0x0048:
            com.google.protobuf.p0 r2 = com.google.protobuf.C23922p0.m29481f()
            throw r2
        L_0x004d:
            return r4
        L_0x004e:
            com.google.protobuf.p0 r2 = com.google.protobuf.C23922p0.m29484i()
            throw r2
        L_0x0053:
            com.google.protobuf.p0 r2 = com.google.protobuf.C23922p0.m29481f()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C23825f.m28734c(int, byte[], int, int, com.google.protobuf.o0$j, com.google.protobuf.f$a):int");
    }

    /* renamed from: d */
    public static double m28735d(byte[] bArr, int i) {
        return Double.longBitsToDouble(m28741j(bArr, i));
    }

    /* renamed from: e */
    public static int m28736e(int i, byte[] bArr, int i2, int i3, C23908o0.C23919j<?> jVar, C23826a aVar) {
        C24047u uVar = (C24047u) jVar;
        uVar.mo38368h(Double.longBitsToDouble(m28741j(bArr, i2)));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int I = m28727I(bArr, i4, aVar);
            if (i != aVar.f68235a) {
                break;
            }
            uVar.mo38368h(Double.longBitsToDouble(m28741j(bArr, I)));
            i4 = I + 8;
        }
        return i4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01dd, code lost:
        r9 = r9 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01ec, code lost:
        r9 = r9 + 8;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m28737f(int r7, byte[] r8, int r9, int r10, com.google.protobuf.C23861l0.C23864c<?, ?> r11, com.google.protobuf.C23861l0.C23866e<?, ?> r12, com.google.protobuf.C23937r2<com.google.protobuf.C24046t2, com.google.protobuf.C24046t2> r13, com.google.protobuf.C23825f.C23826a r14) {
        /*
            com.google.protobuf.g0<com.google.protobuf.l0$d> r0 = r11.f68388d
            int r7 = r7 >>> 3
            com.google.protobuf.l0$d r1 = r12.f68397d
            boolean r2 = r1.f68392g
            r3 = 0
            if (r2 == 0) goto L_0x00f5
            boolean r2 = r1.f68393h
            if (r2 == 0) goto L_0x00f5
            com.google.protobuf.z2$b r10 = r1.f68391f
            int r10 = r10.ordinal()
            switch(r10) {
                case 0: goto L_0x00c4;
                case 1: goto L_0x00b4;
                case 2: goto L_0x00a4;
                case 3: goto L_0x00a4;
                case 4: goto L_0x0094;
                case 5: goto L_0x0084;
                case 6: goto L_0x0074;
                case 7: goto L_0x0064;
                case 8: goto L_0x0018;
                case 9: goto L_0x0018;
                case 10: goto L_0x0018;
                case 11: goto L_0x0018;
                case 12: goto L_0x0094;
                case 13: goto L_0x001e;
                case 14: goto L_0x0074;
                case 15: goto L_0x0084;
                case 16: goto L_0x0054;
                case 17: goto L_0x0044;
                default: goto L_0x0018;
            }
        L_0x0018:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            com.google.protobuf.l0$d r8 = r12.f68397d
            goto L_0x00d4
        L_0x001e:
            com.google.protobuf.n0 r10 = new com.google.protobuf.n0
            r10.<init>()
            int r8 = m28756y(r8, r9, r10, r14)
            com.google.protobuf.t2 r9 = r11.unknownFields
            com.google.protobuf.t2 r14 = com.google.protobuf.C24046t2.f69159f
            if (r9 != r14) goto L_0x002e
            goto L_0x002f
        L_0x002e:
            r3 = r9
        L_0x002f:
            com.google.protobuf.l0$d r9 = r12.f68397d
            com.google.protobuf.o0$d<?> r9 = r9.f68389d
            java.lang.Object r7 = com.google.protobuf.C23842h2.m28929z(r7, r10, r9, r3, r13)
            com.google.protobuf.t2 r7 = (com.google.protobuf.C24046t2) r7
            if (r7 == 0) goto L_0x003d
            r11.unknownFields = r7
        L_0x003d:
            com.google.protobuf.l0$d r7 = r12.f68397d
            r0.mo37654x(r7, r10)
            goto L_0x0219
        L_0x0044:
            com.google.protobuf.w0 r7 = new com.google.protobuf.w0
            r7.<init>()
            int r8 = m28755x(r8, r9, r7, r14)
            com.google.protobuf.l0$d r9 = r12.f68397d
            r0.mo37654x(r9, r7)
            goto L_0x0219
        L_0x0054:
            com.google.protobuf.n0 r7 = new com.google.protobuf.n0
            r7.<init>()
            int r8 = m28754w(r8, r9, r7, r14)
            com.google.protobuf.l0$d r9 = r12.f68397d
            r0.mo37654x(r9, r7)
            goto L_0x0219
        L_0x0064:
            com.google.protobuf.h r7 = new com.google.protobuf.h
            r7.<init>()
            int r8 = m28749r(r8, r9, r7, r14)
            com.google.protobuf.l0$d r9 = r12.f68397d
            r0.mo37654x(r9, r7)
            goto L_0x0219
        L_0x0074:
            com.google.protobuf.n0 r7 = new com.google.protobuf.n0
            r7.<init>()
            int r8 = m28751t(r8, r9, r7, r14)
            com.google.protobuf.l0$d r9 = r12.f68397d
            r0.mo37654x(r9, r7)
            goto L_0x0219
        L_0x0084:
            com.google.protobuf.w0 r7 = new com.google.protobuf.w0
            r7.<init>()
            int r8 = m28752u(r8, r9, r7, r14)
            com.google.protobuf.l0$d r9 = r12.f68397d
            r0.mo37654x(r9, r7)
            goto L_0x0219
        L_0x0094:
            com.google.protobuf.n0 r7 = new com.google.protobuf.n0
            r7.<init>()
            int r8 = m28756y(r8, r9, r7, r14)
            com.google.protobuf.l0$d r9 = r12.f68397d
            r0.mo37654x(r9, r7)
            goto L_0x0219
        L_0x00a4:
            com.google.protobuf.w0 r7 = new com.google.protobuf.w0
            r7.<init>()
            int r8 = m28757z(r8, r9, r7, r14)
            com.google.protobuf.l0$d r9 = r12.f68397d
            r0.mo37654x(r9, r7)
            goto L_0x0219
        L_0x00b4:
            com.google.protobuf.i0 r7 = new com.google.protobuf.i0
            r7.<init>()
            int r8 = m28753v(r8, r9, r7, r14)
            com.google.protobuf.l0$d r9 = r12.f68397d
            r0.mo37654x(r9, r7)
            goto L_0x0219
        L_0x00c4:
            com.google.protobuf.u r7 = new com.google.protobuf.u
            r7.<init>()
            int r8 = m28750s(r8, r9, r7, r14)
            com.google.protobuf.l0$d r9 = r12.f68397d
            r0.mo37654x(r9, r7)
            goto L_0x0219
        L_0x00d4:
            com.google.protobuf.z2$b r8 = r8.f68391f
            java.lang.String r8 = java.lang.String.valueOf(r8)
            int r9 = r8.length()
            int r9 = r9 + 23
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r9)
            java.lang.String r9 = "Type cannot be packed: "
            r10.append(r9)
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            r7.<init>(r8)
            throw r7
        L_0x00f5:
            com.google.protobuf.z2$b r1 = r1.f68391f
            com.google.protobuf.z2$b r2 = com.google.protobuf.C24087z2.C24089b.ENUM
            if (r1 != r2) goto L_0x0126
            int r9 = m28727I(r8, r9, r14)
            com.google.protobuf.l0$d r8 = r12.f68397d
            com.google.protobuf.o0$d<?> r8 = r8.f68389d
            int r10 = r14.f68235a
            com.google.protobuf.o0$c r8 = r8.findValueByNumber(r10)
            if (r8 != 0) goto L_0x011e
            com.google.protobuf.t2 r8 = r11.unknownFields
            com.google.protobuf.t2 r10 = com.google.protobuf.C24046t2.f69159f
            if (r8 != r10) goto L_0x0118
            com.google.protobuf.t2 r8 = new com.google.protobuf.t2
            r8.<init>()
            r11.unknownFields = r8
        L_0x0118:
            int r10 = r14.f68235a
            com.google.protobuf.C23842h2.m28885E(r7, r10, r8, r13)
            return r9
        L_0x011e:
            int r7 = r14.f68235a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            goto L_0x01ee
        L_0x0126:
            int r11 = r1.ordinal()
            switch(r11) {
                case 0: goto L_0x01e0;
                case 1: goto L_0x01d1;
                case 2: goto L_0x01c6;
                case 3: goto L_0x01c6;
                case 4: goto L_0x01bb;
                case 5: goto L_0x01b2;
                case 6: goto L_0x01a9;
                case 7: goto L_0x0195;
                case 8: goto L_0x015f;
                case 9: goto L_0x0143;
                case 10: goto L_0x012f;
                case 11: goto L_0x0167;
                case 12: goto L_0x01bb;
                case 13: goto L_0x016f;
                case 14: goto L_0x01a9;
                case 15: goto L_0x01b2;
                case 16: goto L_0x0186;
                case 17: goto L_0x0177;
                default: goto L_0x012d;
            }
        L_0x012d:
            goto L_0x01ee
        L_0x012f:
            com.google.protobuf.z1 r7 = com.google.protobuf.C24086z1.f69225c
            com.google.protobuf.j1 r11 = r12.f68396c
            java.lang.Class r11 = r11.getClass()
            com.google.protobuf.f2 r7 = r7.mo38436a(r11)
            int r9 = m28747p(r7, r8, r9, r10, r14)
            java.lang.Object r3 = r14.f68237c
            goto L_0x01ee
        L_0x0143:
            int r7 = r7 << 3
            r5 = r7 | 4
            com.google.protobuf.z1 r7 = com.google.protobuf.C24086z1.f69225c
            com.google.protobuf.j1 r11 = r12.f68396c
            java.lang.Class r11 = r11.getClass()
            com.google.protobuf.f2 r1 = r7.mo38436a(r11)
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r14
            int r9 = m28745n(r1, r2, r3, r4, r5, r6)
            java.lang.Object r3 = r14.f68237c
            goto L_0x01ee
        L_0x015f:
            int r9 = m28721C(r8, r9, r14)
            java.lang.Object r3 = r14.f68237c
            goto L_0x01ee
        L_0x0167:
            int r9 = m28733b(r8, r9, r14)
            java.lang.Object r3 = r14.f68237c
            goto L_0x01ee
        L_0x016f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Shouldn't reach here."
            r7.<init>(r8)
            throw r7
        L_0x0177:
            int r9 = m28729K(r8, r9, r14)
            long r7 = r14.f68236b
            long r7 = com.google.protobuf.C23856l.m28956c(r7)
            java.lang.Long r3 = java.lang.Long.valueOf(r7)
            goto L_0x01ee
        L_0x0186:
            int r9 = m28727I(r8, r9, r14)
            int r7 = r14.f68235a
            int r7 = com.google.protobuf.C23856l.m28955b(r7)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            goto L_0x01ee
        L_0x0195:
            int r9 = m28729K(r8, r9, r14)
            long r7 = r14.f68236b
            r10 = 0
            int r13 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r13 == 0) goto L_0x01a3
            r7 = 1
            goto L_0x01a4
        L_0x01a3:
            r7 = 0
        L_0x01a4:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r7)
            goto L_0x01ee
        L_0x01a9:
            int r7 = m28739h(r8, r9)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            goto L_0x01dd
        L_0x01b2:
            long r7 = m28741j(r8, r9)
            java.lang.Long r3 = java.lang.Long.valueOf(r7)
            goto L_0x01ec
        L_0x01bb:
            int r9 = m28727I(r8, r9, r14)
            int r7 = r14.f68235a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            goto L_0x01ee
        L_0x01c6:
            int r9 = m28729K(r8, r9, r14)
            long r7 = r14.f68236b
            java.lang.Long r3 = java.lang.Long.valueOf(r7)
            goto L_0x01ee
        L_0x01d1:
            int r7 = m28739h(r8, r9)
            float r7 = java.lang.Float.intBitsToFloat(r7)
            java.lang.Float r3 = java.lang.Float.valueOf(r7)
        L_0x01dd:
            int r9 = r9 + 4
            goto L_0x01ee
        L_0x01e0:
            long r7 = m28741j(r8, r9)
            double r7 = java.lang.Double.longBitsToDouble(r7)
            java.lang.Double r3 = java.lang.Double.valueOf(r7)
        L_0x01ec:
            int r9 = r9 + 8
        L_0x01ee:
            com.google.protobuf.l0$d r7 = r12.f68397d
            boolean r8 = r7.f68392g
            if (r8 == 0) goto L_0x01f8
            r0.mo37636a(r7, r3)
            goto L_0x0218
        L_0x01f8:
            com.google.protobuf.z2$b r7 = r7.f68391f
            int r7 = r7.ordinal()
            r8 = 9
            if (r7 == r8) goto L_0x0207
            r8 = 10
            if (r7 == r8) goto L_0x0207
            goto L_0x0213
        L_0x0207:
            com.google.protobuf.l0$d r7 = r12.f68397d
            java.lang.Object r7 = r0.mo37643k(r7)
            if (r7 == 0) goto L_0x0213
            java.lang.Object r3 = com.google.protobuf.C23908o0.m29425c(r7, r3)
        L_0x0213:
            com.google.protobuf.l0$d r7 = r12.f68397d
            r0.mo37654x(r7, r3)
        L_0x0218:
            r8 = r9
        L_0x0219:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C23825f.m28737f(int, byte[], int, int, com.google.protobuf.l0$c, com.google.protobuf.l0$e, com.google.protobuf.r2, com.google.protobuf.f$a):int");
    }

    /* renamed from: g */
    public static int m28738g(int i, byte[] bArr, int i2, int i3, Object obj, C23845j1 j1Var, C23937r2<C24046t2, C24046t2> r2Var, C23826a aVar) {
        C23861l0.C23866e eVar = aVar.f68238d.f68209a.get(new C23806a0.C23807a(j1Var, i >>> 3));
        if (eVar == null) {
            return m28725G(i, bArr, i2, i3, C23920o1.m29434o(obj), aVar);
        }
        C23861l0.C23864c cVar = (C23861l0.C23864c) obj;
        C23832g0<C23861l0.C23865d> g0Var = cVar.f68388d;
        if (g0Var.f68260b) {
            cVar.f68388d = g0Var.clone();
        }
        return m28737f(i, bArr, i2, i3, cVar, eVar, r2Var, aVar);
    }

    /* renamed from: h */
    public static int m28739h(byte[] bArr, int i) {
        return ((bArr[i + 3] & ExifInterface.MARKER) << 24) | (bArr[i] & ExifInterface.MARKER) | ((bArr[i + 1] & ExifInterface.MARKER) << 8) | ((bArr[i + 2] & ExifInterface.MARKER) << v2encoder.enumCODEC_vcodec2);
    }

    /* renamed from: i */
    public static int m28740i(int i, byte[] bArr, int i2, int i3, C23908o0.C23919j<?> jVar, C23826a aVar) {
        C23901n0 n0Var = (C23901n0) jVar;
        n0Var.mo37933h(m28739h(bArr, i2));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int I = m28727I(bArr, i4, aVar);
            if (i != aVar.f68235a) {
                break;
            }
            n0Var.mo37933h(m28739h(bArr, I));
            i4 = I + 4;
        }
        return i4;
    }

    /* renamed from: j */
    public static long m28741j(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* renamed from: k */
    public static int m28742k(int i, byte[] bArr, int i2, int i3, C23908o0.C23919j<?> jVar, C23826a aVar) {
        C24061w0 w0Var = (C24061w0) jVar;
        w0Var.mo38392h(m28741j(bArr, i2));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int I = m28727I(bArr, i4, aVar);
            if (i != aVar.f68235a) {
                break;
            }
            w0Var.mo38392h(m28741j(bArr, I));
            i4 = I + 8;
        }
        return i4;
    }

    /* renamed from: l */
    public static float m28743l(byte[] bArr, int i) {
        return Float.intBitsToFloat(m28739h(bArr, i));
    }

    /* renamed from: m */
    public static int m28744m(int i, byte[] bArr, int i2, int i3, C23908o0.C23919j<?> jVar, C23826a aVar) {
        C23843i0 i0Var = (C23843i0) jVar;
        i0Var.mo37694h(Float.intBitsToFloat(m28739h(bArr, i2)));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int I = m28727I(bArr, i4, aVar);
            if (i != aVar.f68235a) {
                break;
            }
            i0Var.mo37694h(Float.intBitsToFloat(m28739h(bArr, I)));
            i4 = I + 4;
        }
        return i4;
    }

    /* renamed from: n */
    public static int m28745n(C23828f2 f2Var, byte[] bArr, int i, int i2, int i3, C23826a aVar) {
        C23920o1 o1Var = (C23920o1) f2Var;
        Object g = o1Var.mo37616g();
        int F = o1Var.mo37985F(g, bArr, i, i2, i3, aVar);
        o1Var.mo37613e(g);
        aVar.f68237c = g;
        return F;
    }

    /* renamed from: o */
    public static int m28746o(C23828f2 f2Var, int i, byte[] bArr, int i2, int i3, C23908o0.C23919j<?> jVar, C23826a aVar) {
        int i4 = (i & -8) | 4;
        int n = m28745n(f2Var, bArr, i2, i3, i4, aVar);
        jVar.add(aVar.f68237c);
        while (n < i3) {
            int I = m28727I(bArr, n, aVar);
            if (i != aVar.f68235a) {
                break;
            }
            n = m28745n(f2Var, bArr, I, i3, i4, aVar);
            jVar.add(aVar.f68237c);
        }
        return n;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m28747p(com.google.protobuf.C23828f2 r6, byte[] r7, int r8, int r9, com.google.protobuf.C23825f.C23826a r10) {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = m28726H(r8, r7, r0, r10)
            int r8 = r10.f68235a
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.mo37616g()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.mo37612d(r1, r2, r3, r4, r5)
            r6.mo37613e(r9)
            r10.f68237c = r9
            return r8
        L_0x0025:
            com.google.protobuf.p0 r6 = com.google.protobuf.C23922p0.m29484i()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C23825f.m28747p(com.google.protobuf.f2, byte[], int, int, com.google.protobuf.f$a):int");
    }

    /* renamed from: q */
    public static int m28748q(C23828f2<?> f2Var, int i, byte[] bArr, int i2, int i3, C23908o0.C23919j<?> jVar, C23826a aVar) {
        int p = m28747p(f2Var, bArr, i2, i3, aVar);
        jVar.add(aVar.f68237c);
        while (p < i3) {
            int I = m28727I(bArr, p, aVar);
            if (i != aVar.f68235a) {
                break;
            }
            p = m28747p(f2Var, bArr, I, i3, aVar);
            jVar.add(aVar.f68237c);
        }
        return p;
    }

    /* renamed from: r */
    public static int m28749r(byte[] bArr, int i, C23908o0.C23919j<?> jVar, C23826a aVar) {
        C23838h hVar = (C23838h) jVar;
        int I = m28727I(bArr, i, aVar);
        int i2 = aVar.f68235a + I;
        while (I < i2) {
            I = m28729K(bArr, I, aVar);
            hVar.mo37681h(aVar.f68236b != 0);
        }
        if (I == i2) {
            return I;
        }
        throw C23922p0.m29484i();
    }

    /* renamed from: s */
    public static int m28750s(byte[] bArr, int i, C23908o0.C23919j<?> jVar, C23826a aVar) {
        C24047u uVar = (C24047u) jVar;
        int I = m28727I(bArr, i, aVar);
        int i2 = aVar.f68235a + I;
        while (I < i2) {
            uVar.mo38368h(Double.longBitsToDouble(m28741j(bArr, I)));
            I += 8;
        }
        if (I == i2) {
            return I;
        }
        throw C23922p0.m29484i();
    }

    /* renamed from: t */
    public static int m28751t(byte[] bArr, int i, C23908o0.C23919j<?> jVar, C23826a aVar) {
        C23901n0 n0Var = (C23901n0) jVar;
        int I = m28727I(bArr, i, aVar);
        int i2 = aVar.f68235a + I;
        while (I < i2) {
            n0Var.mo37933h(m28739h(bArr, I));
            I += 4;
        }
        if (I == i2) {
            return I;
        }
        throw C23922p0.m29484i();
    }

    /* renamed from: u */
    public static int m28752u(byte[] bArr, int i, C23908o0.C23919j<?> jVar, C23826a aVar) {
        C24061w0 w0Var = (C24061w0) jVar;
        int I = m28727I(bArr, i, aVar);
        int i2 = aVar.f68235a + I;
        while (I < i2) {
            w0Var.mo38392h(m28741j(bArr, I));
            I += 8;
        }
        if (I == i2) {
            return I;
        }
        throw C23922p0.m29484i();
    }

    /* renamed from: v */
    public static int m28753v(byte[] bArr, int i, C23908o0.C23919j<?> jVar, C23826a aVar) {
        C23843i0 i0Var = (C23843i0) jVar;
        int I = m28727I(bArr, i, aVar);
        int i2 = aVar.f68235a + I;
        while (I < i2) {
            i0Var.mo37694h(Float.intBitsToFloat(m28739h(bArr, I)));
            I += 4;
        }
        if (I == i2) {
            return I;
        }
        throw C23922p0.m29484i();
    }

    /* renamed from: w */
    public static int m28754w(byte[] bArr, int i, C23908o0.C23919j<?> jVar, C23826a aVar) {
        C23901n0 n0Var = (C23901n0) jVar;
        int I = m28727I(bArr, i, aVar);
        int i2 = aVar.f68235a + I;
        while (I < i2) {
            I = m28727I(bArr, I, aVar);
            n0Var.mo37933h(C23856l.m28955b(aVar.f68235a));
        }
        if (I == i2) {
            return I;
        }
        throw C23922p0.m29484i();
    }

    /* renamed from: x */
    public static int m28755x(byte[] bArr, int i, C23908o0.C23919j<?> jVar, C23826a aVar) {
        C24061w0 w0Var = (C24061w0) jVar;
        int I = m28727I(bArr, i, aVar);
        int i2 = aVar.f68235a + I;
        while (I < i2) {
            I = m28729K(bArr, I, aVar);
            w0Var.mo38392h(C23856l.m28956c(aVar.f68236b));
        }
        if (I == i2) {
            return I;
        }
        throw C23922p0.m29484i();
    }

    /* renamed from: y */
    public static int m28756y(byte[] bArr, int i, C23908o0.C23919j<?> jVar, C23826a aVar) {
        C23901n0 n0Var = (C23901n0) jVar;
        int I = m28727I(bArr, i, aVar);
        int i2 = aVar.f68235a + I;
        while (I < i2) {
            I = m28727I(bArr, I, aVar);
            n0Var.mo37933h(aVar.f68235a);
        }
        if (I == i2) {
            return I;
        }
        throw C23922p0.m29484i();
    }

    /* renamed from: z */
    public static int m28757z(byte[] bArr, int i, C23908o0.C23919j<?> jVar, C23826a aVar) {
        C24061w0 w0Var = (C24061w0) jVar;
        int I = m28727I(bArr, i, aVar);
        int i2 = aVar.f68235a + I;
        while (I < i2) {
            I = m28729K(bArr, I, aVar);
            w0Var.mo38392h(aVar.f68236b);
        }
        if (I == i2) {
            return I;
        }
        throw C23922p0.m29484i();
    }
}
