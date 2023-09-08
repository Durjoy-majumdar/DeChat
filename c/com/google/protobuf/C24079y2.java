package com.google.protobuf;

import androidx.exifinterface.media.ExifInterface;
import java.nio.ByteBuffer;

/* renamed from: com.google.protobuf.y2 */
public final class C24079y2 {

    /* renamed from: a */
    public static final C24081b f69220a = ((!(C24065x2.f69193f && C24065x2.f69192e) || C16987e.m16777a()) ? new C24082c() : new C24083e());

    /* renamed from: com.google.protobuf.y2$d */
    public static class C17017d extends IllegalArgumentException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C17017d(int r3, int r4) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = 54
                r0.<init>(r1)
                java.lang.String r1 = "Unpaired surrogate at index "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = " of "
                r0.append(r3)
                r0.append(r4)
                java.lang.String r3 = r0.toString()
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C24079y2.C17017d.<init>(int, int):void");
        }
    }

    /* renamed from: com.google.protobuf.y2$a */
    public static class C24080a {
        /* renamed from: a */
        public static void m30064a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
            if (m30067d(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || m30067d(b3) || m30067d(b4)) {
                throw C23922p0.m29478c();
            }
            byte b5 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
            cArr[i] = (char) ((b5 >>> 10) + 55232);
            cArr[i + 1] = (char) ((b5 & ExifInterface.MARKER) + 56320);
        }

        /* renamed from: b */
        public static void m30065b(byte b, byte b2, char[] cArr, int i) {
            if (b < -62 || m30067d(b2)) {
                throw C23922p0.m29478c();
            }
            cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
        }

        /* renamed from: c */
        public static void m30066c(byte b, byte b2, byte b3, char[] cArr, int i) {
            if (m30067d(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || m30067d(b3)))) {
                throw C23922p0.m29478c();
            }
            cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
        }

        /* renamed from: d */
        public static boolean m30067d(byte b) {
            return b > -65;
        }
    }

    /* renamed from: com.google.protobuf.y2$b */
    public static abstract class C24081b {
        /* renamed from: a */
        public abstract String mo38431a(byte[] bArr, int i, int i2);

        /* renamed from: b */
        public final String mo38432b(ByteBuffer byteBuffer, int i, int i2) {
            if ((i | i2 | ((byteBuffer.limit() - i) - i2)) >= 0) {
                int i3 = i + i2;
                char[] cArr = new char[i2];
                int i4 = 0;
                while (r13 < i3) {
                    byte b = byteBuffer.get(r13);
                    if (!(b >= 0)) {
                        break;
                    }
                    i = r13 + 1;
                    cArr[i4] = (char) b;
                    i4++;
                }
                int i5 = i4;
                while (r13 < i3) {
                    int i6 = r13 + 1;
                    byte b2 = byteBuffer.get(r13);
                    if (b2 >= 0) {
                        int i7 = i5 + 1;
                        cArr[i5] = (char) b2;
                        r13 = i6;
                        while (true) {
                            i5 = i7;
                            if (r13 >= i3) {
                                break;
                            }
                            byte b3 = byteBuffer.get(r13);
                            if (!(b3 >= 0)) {
                                break;
                            }
                            r13++;
                            i7 = i5 + 1;
                            cArr[i5] = (char) b3;
                        }
                    } else {
                        if (!(b2 < -32)) {
                            if (b2 < -16) {
                                if (i6 < i3 - 1) {
                                    int i8 = i6 + 1;
                                    C24080a.m30066c(b2, byteBuffer.get(i6), byteBuffer.get(i8), cArr, i5);
                                    r13 = i8 + 1;
                                    i5++;
                                } else {
                                    throw C23922p0.m29478c();
                                }
                            } else if (i6 < i3 - 2) {
                                int i9 = i6 + 1;
                                byte b4 = byteBuffer.get(i6);
                                int i15 = i9 + 1;
                                C24080a.m30064a(b2, b4, byteBuffer.get(i9), byteBuffer.get(i15), cArr, i5);
                                i5 = i5 + 1 + 1;
                                r13 = i15 + 1;
                            } else {
                                throw C23922p0.m29478c();
                            }
                        } else if (i6 < i3) {
                            C24080a.m30065b(b2, byteBuffer.get(i6), cArr, i5);
                            r13 = i6 + 1;
                            i5++;
                        } else {
                            throw C23922p0.m29478c();
                        }
                    }
                }
                return new String(cArr, 0, i5);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)}));
        }

        /* renamed from: c */
        public abstract String mo38433c(ByteBuffer byteBuffer, int i, int i2);

        /* renamed from: d */
        public abstract int mo38434d(CharSequence charSequence, byte[] bArr, int i, int i2);

        /* renamed from: e */
        public abstract int mo38435e(int i, byte[] bArr, int i2, int i3);
    }

    /* renamed from: com.google.protobuf.y2$c */
    public static final class C24082c extends C24081b {
        /* renamed from: a */
        public String mo38431a(byte[] bArr, int i, int i2) {
            if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
                int i3 = i + i2;
                char[] cArr = new char[i2];
                int i4 = 0;
                while (r13 < i3) {
                    byte b = bArr[r13];
                    if (!(b >= 0)) {
                        break;
                    }
                    i = r13 + 1;
                    cArr[i4] = (char) b;
                    i4++;
                }
                int i5 = i4;
                while (r13 < i3) {
                    int i6 = r13 + 1;
                    byte b2 = bArr[r13];
                    if (b2 >= 0) {
                        int i7 = i5 + 1;
                        cArr[i5] = (char) b2;
                        r13 = i6;
                        while (true) {
                            i5 = i7;
                            if (r13 >= i3) {
                                break;
                            }
                            byte b3 = bArr[r13];
                            if (!(b3 >= 0)) {
                                break;
                            }
                            r13++;
                            i7 = i5 + 1;
                            cArr[i5] = (char) b3;
                        }
                    } else {
                        if (!(b2 < -32)) {
                            if (b2 < -16) {
                                if (i6 < i3 - 1) {
                                    int i8 = i6 + 1;
                                    C24080a.m30066c(b2, bArr[i6], bArr[i8], cArr, i5);
                                    r13 = i8 + 1;
                                    i5++;
                                } else {
                                    throw C23922p0.m29478c();
                                }
                            } else if (i6 < i3 - 2) {
                                int i9 = i6 + 1;
                                byte b4 = bArr[i6];
                                int i15 = i9 + 1;
                                C24080a.m30064a(b2, b4, bArr[i9], bArr[i15], cArr, i5);
                                i5 = i5 + 1 + 1;
                                r13 = i15 + 1;
                            } else {
                                throw C23922p0.m29478c();
                            }
                        } else if (i6 < i3) {
                            C24080a.m30065b(b2, bArr[i6], cArr, i5);
                            r13 = i6 + 1;
                            i5++;
                        } else {
                            throw C23922p0.m29478c();
                        }
                    }
                }
                return new String(cArr, 0, i5);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
        }

        /* renamed from: c */
        public String mo38433c(ByteBuffer byteBuffer, int i, int i2) {
            return mo38432b(byteBuffer, i, i2);
        }

        /* renamed from: d */
        public int mo38434d(CharSequence charSequence, byte[] bArr, int i, int i2) {
            int i3;
            int i4;
            int i5;
            char charAt;
            int length = charSequence.length();
            int i6 = i2 + i;
            int i7 = 0;
            while (i7 < length && (i5 = i7 + i) < i6 && (charAt = charSequence.charAt(i7)) < 128) {
                bArr[i5] = (byte) charAt;
                i7++;
            }
            if (i7 == length) {
                return i + length;
            }
            int i8 = i + i7;
            while (i7 < length) {
                char charAt2 = charSequence.charAt(i7);
                if (charAt2 < 128 && i8 < i6) {
                    i4 = i8 + 1;
                    bArr[i8] = (byte) charAt2;
                } else if (charAt2 < 2048 && i8 <= i6 - 2) {
                    int i9 = i8 + 1;
                    bArr[i8] = (byte) ((charAt2 >>> 6) | 960);
                    i8 = i9 + 1;
                    bArr[i9] = (byte) ((charAt2 & '?') | 128);
                    i7++;
                } else if ((charAt2 < 55296 || 57343 < charAt2) && i8 <= i6 - 3) {
                    int i15 = i8 + 1;
                    bArr[i8] = (byte) ((charAt2 >>> 12) | 480);
                    int i16 = i15 + 1;
                    bArr[i15] = (byte) (((charAt2 >>> 6) & 63) | 128);
                    i4 = i16 + 1;
                    bArr[i16] = (byte) ((charAt2 & '?') | 128);
                } else if (i8 <= i6 - 4) {
                    int i17 = i7 + 1;
                    if (i17 != charSequence.length()) {
                        char charAt3 = charSequence.charAt(i17);
                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                            int codePoint = Character.toCodePoint(charAt2, charAt3);
                            int i18 = i8 + 1;
                            bArr[i8] = (byte) ((codePoint >>> 18) | 240);
                            int i19 = i18 + 1;
                            bArr[i18] = (byte) (((codePoint >>> 12) & 63) | 128);
                            int i25 = i19 + 1;
                            bArr[i19] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i8 = i25 + 1;
                            bArr[i25] = (byte) ((codePoint & 63) | 128);
                            i7 = i17;
                            i7++;
                        } else {
                            i7 = i17;
                        }
                    }
                    throw new C17017d(i7 - 1, length);
                } else if (55296 > charAt2 || charAt2 > 57343 || ((i3 = i7 + 1) != charSequence.length() && Character.isSurrogatePair(charAt2, charSequence.charAt(i3)))) {
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Failed writing ");
                    sb.append(charAt2);
                    sb.append(" at index ");
                    sb.append(i8);
                    throw new ArrayIndexOutOfBoundsException(sb.toString());
                } else {
                    throw new C17017d(i7, length);
                }
                i8 = i4;
                i7++;
            }
            return i8;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0047, code lost:
            if (r13[r14] > -65) goto L_0x0049;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x0082, code lost:
            if (r13[r14] > -65) goto L_0x0084;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
            if (r13[r14] > -65) goto L_0x0022;
         */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo38435e(int r12, byte[] r13, int r14, int r15) {
            /*
                r11 = this;
                r0 = -19
                r1 = -62
                r2 = -16
                r3 = 0
                r4 = -96
                r5 = -32
                r6 = -1
                r7 = -65
                if (r12 == 0) goto L_0x0085
                if (r14 < r15) goto L_0x0013
                return r12
            L_0x0013:
                byte r8 = (byte) r12
                if (r8 >= r5) goto L_0x0023
                if (r8 < r1) goto L_0x0022
                int r12 = r14 + 1
                byte r14 = r13[r14]
                if (r14 <= r7) goto L_0x001f
                goto L_0x0022
            L_0x001f:
                r14 = r12
                goto L_0x0085
            L_0x0022:
                return r6
            L_0x0023:
                if (r8 >= r2) goto L_0x004a
                int r12 = r12 >> 8
                int r12 = ~r12
                byte r12 = (byte) r12
                if (r12 != 0) goto L_0x0039
                int r12 = r14 + 1
                byte r14 = r13[r14]
                if (r12 < r15) goto L_0x0036
                int r12 = com.google.protobuf.C24079y2.m30061c(r8, r14)
                return r12
            L_0x0036:
                r10 = r14
                r14 = r12
                r12 = r10
            L_0x0039:
                if (r12 > r7) goto L_0x0049
                if (r8 != r5) goto L_0x003f
                if (r12 < r4) goto L_0x0049
            L_0x003f:
                if (r8 != r0) goto L_0x0043
                if (r12 >= r4) goto L_0x0049
            L_0x0043:
                int r12 = r14 + 1
                byte r14 = r13[r14]
                if (r14 <= r7) goto L_0x001f
            L_0x0049:
                return r6
            L_0x004a:
                int r9 = r12 >> 8
                int r9 = ~r9
                byte r9 = (byte) r9
                if (r9 != 0) goto L_0x005e
                int r12 = r14 + 1
                byte r9 = r13[r14]
                if (r12 < r15) goto L_0x005b
                int r12 = com.google.protobuf.C24079y2.m30061c(r8, r9)
                return r12
            L_0x005b:
                r14 = r12
                r12 = 0
                goto L_0x0061
            L_0x005e:
                int r12 = r12 >> 16
                byte r12 = (byte) r12
            L_0x0061:
                if (r12 != 0) goto L_0x0071
                int r12 = r14 + 1
                byte r14 = r13[r14]
                if (r12 < r15) goto L_0x006e
                int r12 = com.google.protobuf.C24079y2.m30062d(r8, r9, r14)
                return r12
            L_0x006e:
                r10 = r14
                r14 = r12
                r12 = r10
            L_0x0071:
                if (r9 > r7) goto L_0x0084
                int r8 = r8 << 28
                int r9 = r9 + 112
                int r8 = r8 + r9
                int r8 = r8 >> 30
                if (r8 != 0) goto L_0x0084
                if (r12 > r7) goto L_0x0084
                int r12 = r14 + 1
                byte r14 = r13[r14]
                if (r14 <= r7) goto L_0x001f
            L_0x0084:
                return r6
            L_0x0085:
                if (r14 >= r15) goto L_0x008e
                byte r12 = r13[r14]
                if (r12 < 0) goto L_0x008e
                int r14 = r14 + 1
                goto L_0x0085
            L_0x008e:
                if (r14 < r15) goto L_0x0092
                goto L_0x00ef
            L_0x0092:
                if (r14 < r15) goto L_0x0095
                goto L_0x00ef
            L_0x0095:
                int r12 = r14 + 1
                byte r14 = r13[r14]
                if (r14 >= 0) goto L_0x00f0
                if (r14 >= r5) goto L_0x00aa
                if (r12 < r15) goto L_0x00a1
                r3 = r14
                goto L_0x00ef
            L_0x00a1:
                if (r14 < r1) goto L_0x00ee
                int r14 = r12 + 1
                byte r12 = r13[r12]
                if (r12 <= r7) goto L_0x0092
                goto L_0x00ee
            L_0x00aa:
                if (r14 >= r2) goto L_0x00ca
                int r8 = r15 + -1
                if (r12 < r8) goto L_0x00b5
                int r3 = com.google.protobuf.C24079y2.m30059a(r13, r12, r15)
                goto L_0x00ef
            L_0x00b5:
                int r8 = r12 + 1
                byte r12 = r13[r12]
                if (r12 > r7) goto L_0x00ee
                if (r14 != r5) goto L_0x00bf
                if (r12 < r4) goto L_0x00ee
            L_0x00bf:
                if (r14 != r0) goto L_0x00c3
                if (r12 >= r4) goto L_0x00ee
            L_0x00c3:
                int r14 = r8 + 1
                byte r12 = r13[r8]
                if (r12 <= r7) goto L_0x0092
                goto L_0x00ee
            L_0x00ca:
                int r8 = r15 + -2
                if (r12 < r8) goto L_0x00d3
                int r3 = com.google.protobuf.C24079y2.m30059a(r13, r12, r15)
                goto L_0x00ef
            L_0x00d3:
                int r8 = r12 + 1
                byte r12 = r13[r12]
                if (r12 > r7) goto L_0x00ee
                int r14 = r14 << 28
                int r12 = r12 + 112
                int r14 = r14 + r12
                int r12 = r14 >> 30
                if (r12 != 0) goto L_0x00ee
                int r12 = r8 + 1
                byte r14 = r13[r8]
                if (r14 > r7) goto L_0x00ee
                int r14 = r12 + 1
                byte r12 = r13[r12]
                if (r12 <= r7) goto L_0x0092
            L_0x00ee:
                r3 = -1
            L_0x00ef:
                return r3
            L_0x00f0:
                r14 = r12
                goto L_0x0092
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C24079y2.C24082c.mo38435e(int, byte[], int, int):int");
        }
    }

    /* renamed from: com.google.protobuf.y2$e */
    public static final class C24083e extends C24081b {
        /* renamed from: f */
        public static int m30077f(byte[] bArr, int i, long j, int i2) {
            if (i2 == 0) {
                C24081b bVar = C24079y2.f69220a;
                if (i > -12) {
                    return -1;
                }
                return i;
            } else if (i2 == 1) {
                return C24079y2.m30061c(i, C24065x2.m29981h(bArr, j));
            } else {
                if (i2 == 2) {
                    return C24079y2.m30062d(i, C24065x2.m29981h(bArr, j), C24065x2.m29981h(bArr, j + 1));
                }
                throw new AssertionError();
            }
        }

        /* renamed from: a */
        public String mo38431a(byte[] bArr, int i, int i2) {
            if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
                int i3 = i + i2;
                char[] cArr = new char[i2];
                int i4 = 0;
                while (r13 < i3) {
                    byte h = C24065x2.m29981h(bArr, (long) r13);
                    if (!(h >= 0)) {
                        break;
                    }
                    i = r13 + 1;
                    cArr[i4] = (char) h;
                    i4++;
                }
                int i5 = i4;
                while (r13 < i3) {
                    int i6 = r13 + 1;
                    byte h2 = C24065x2.m29981h(bArr, (long) r13);
                    if (h2 >= 0) {
                        int i7 = i5 + 1;
                        cArr[i5] = (char) h2;
                        r13 = i6;
                        while (true) {
                            i5 = i7;
                            if (r13 >= i3) {
                                break;
                            }
                            byte h3 = C24065x2.m29981h(bArr, (long) r13);
                            if (!(h3 >= 0)) {
                                break;
                            }
                            r13++;
                            i7 = i5 + 1;
                            cArr[i5] = (char) h3;
                        }
                    } else {
                        if (!(h2 < -32)) {
                            if (h2 < -16) {
                                if (i6 < i3 - 1) {
                                    int i8 = i6 + 1;
                                    C24080a.m30066c(h2, C24065x2.m29981h(bArr, (long) i6), C24065x2.m29981h(bArr, (long) i8), cArr, i5);
                                    r13 = i8 + 1;
                                    i5++;
                                } else {
                                    throw C23922p0.m29478c();
                                }
                            } else if (i6 < i3 - 2) {
                                int i9 = i6 + 1;
                                byte h4 = C24065x2.m29981h(bArr, (long) i6);
                                int i15 = i9 + 1;
                                C24080a.m30064a(h2, h4, C24065x2.m29981h(bArr, (long) i9), C24065x2.m29981h(bArr, (long) i15), cArr, i5);
                                i5 = i5 + 1 + 1;
                                r13 = i15 + 1;
                            } else {
                                throw C23922p0.m29478c();
                            }
                        } else if (i6 < i3) {
                            C24080a.m30065b(h2, C24065x2.m29981h(bArr, (long) i6), cArr, i5);
                            r13 = i6 + 1;
                            i5++;
                        } else {
                            throw C23922p0.m29478c();
                        }
                    }
                }
                return new String(cArr, 0, i5);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
        }

        /* renamed from: c */
        public String mo38433c(ByteBuffer byteBuffer, int i, int i2) {
            long j;
            int i3 = i;
            int i4 = i2;
            if ((i3 | i4 | ((byteBuffer.limit() - i3) - i4)) >= 0) {
                long j2 = C24065x2.f69191d.mo38416j(byteBuffer, C24065x2.f69195h) + ((long) i3);
                long j3 = ((long) i4) + j2;
                char[] cArr = new char[i4];
                int i5 = 0;
                while (j2 < j3) {
                    byte g = C24065x2.m29980g(j2);
                    if (!(g >= 0)) {
                        break;
                    }
                    j2++;
                    cArr[i5] = (char) g;
                    i5++;
                }
                while (true) {
                    int i6 = i5;
                    while (j < j3) {
                        long j4 = j + 1;
                        byte g2 = C24065x2.m29980g(j);
                        if (g2 >= 0) {
                            cArr[i6] = (char) g2;
                            i6++;
                            j = j4;
                            while (j < j3) {
                                byte g3 = C24065x2.m29980g(j);
                                if (!(g3 >= 0)) {
                                    break;
                                }
                                j++;
                                cArr[i6] = (char) g3;
                                i6++;
                            }
                        } else {
                            if (!(g2 < -32)) {
                                if (g2 < -16) {
                                    if (j4 < j3 - 1) {
                                        long j5 = j4 + 1;
                                        C24080a.m30066c(g2, C24065x2.m29980g(j4), C24065x2.m29980g(j5), cArr, i6);
                                        i6++;
                                        j = j5 + 1;
                                    } else {
                                        throw C23922p0.m29478c();
                                    }
                                } else if (j4 < j3 - 2) {
                                    long j6 = j4 + 1;
                                    byte g4 = C24065x2.m29980g(j4);
                                    long j7 = j6 + 1;
                                    byte g5 = C24065x2.m29980g(j6);
                                    j2 = j7 + 1;
                                    C24080a.m30064a(g2, g4, g5, C24065x2.m29980g(j7), cArr, i6);
                                    i5 = i6 + 1 + 1;
                                } else {
                                    throw C23922p0.m29478c();
                                }
                            } else if (j4 < j3) {
                                j = j4 + 1;
                                C24080a.m30065b(g2, C24065x2.m29980g(j4), cArr, i6);
                                i6++;
                            } else {
                                throw C23922p0.m29478c();
                            }
                        }
                    }
                    return new String(cArr, 0, i6);
                }
            }
            ByteBuffer byteBuffer2 = byteBuffer;
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)}));
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0033 A[LOOP:1: B:13:0x0033->B:38:0x00fb, LOOP_START, PHI: r2 r3 r4 r11 
          PHI: (r2v4 int) = (r2v3 int), (r2v6 int) binds: [B:10:0x002f, B:38:0x00fb] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r3v3 char) = (r3v2 char), (r3v4 char) binds: [B:10:0x002f, B:38:0x00fb] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r4v3 long) = (r4v2 long), (r4v5 long) binds: [B:10:0x002f, B:38:0x00fb] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r11v3 long) = (r11v2 long), (r11v4 long) binds: [B:10:0x002f, B:38:0x00fb] A[DONT_GENERATE, DONT_INLINE]] */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo38434d(java.lang.CharSequence r23, byte[] r24, int r25, int r26) {
            /*
                r22 = this;
                r0 = r23
                r1 = r24
                r2 = r25
                r3 = r26
                long r4 = (long) r2
                long r6 = (long) r3
                long r6 = r6 + r4
                int r8 = r23.length()
                java.lang.String r9 = " at index "
                java.lang.String r10 = "Failed writing "
                if (r8 > r3) goto L_0x0146
                int r11 = r1.length
                int r11 = r11 - r3
                if (r11 < r2) goto L_0x0146
                r2 = 0
            L_0x001a:
                r3 = 128(0x80, float:1.794E-43)
                r11 = 1
                if (r2 >= r8) goto L_0x002f
                char r13 = r0.charAt(r2)
                if (r13 >= r3) goto L_0x002f
                long r11 = r11 + r4
                byte r3 = (byte) r13
                com.google.protobuf.C24065x2.m29992s(r1, r4, r3)
                int r2 = r2 + 1
                r4 = r11
                goto L_0x001a
            L_0x002f:
                if (r2 != r8) goto L_0x0033
                int r0 = (int) r4
                return r0
            L_0x0033:
                if (r2 >= r8) goto L_0x0144
                char r13 = r0.charAt(r2)
                if (r13 >= r3) goto L_0x004b
                int r14 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r14 >= 0) goto L_0x004b
                long r14 = r4 + r11
                byte r13 = (byte) r13
                com.google.protobuf.C24065x2.m29992s(r1, r4, r13)
                r4 = r11
                r12 = r14
            L_0x0047:
                r11 = 128(0x80, float:1.794E-43)
                goto L_0x00fb
            L_0x004b:
                r14 = 2048(0x800, float:2.87E-42)
                if (r13 >= r14) goto L_0x0075
                r14 = 2
                long r14 = r6 - r14
                int r16 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
                if (r16 > 0) goto L_0x0075
                long r14 = r4 + r11
                int r3 = r13 >>> 6
                r3 = r3 | 960(0x3c0, float:1.345E-42)
                byte r3 = (byte) r3
                com.google.protobuf.C24065x2.m29992s(r1, r4, r3)
                long r3 = r14 + r11
                r5 = r13 & 63
                r13 = 128(0x80, float:1.794E-43)
                r5 = r5 | r13
                byte r5 = (byte) r5
                com.google.protobuf.C24065x2.m29992s(r1, r14, r5)
                r20 = r11
                r11 = 128(0x80, float:1.794E-43)
                r12 = r3
                r4 = r20
                goto L_0x00fb
            L_0x0075:
                r3 = 57343(0xdfff, float:8.0355E-41)
                r14 = 55296(0xd800, float:7.7486E-41)
                if (r13 < r14) goto L_0x007f
                if (r3 >= r13) goto L_0x00ae
            L_0x007f:
                r15 = 3
                long r15 = r6 - r15
                int r17 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
                if (r17 > 0) goto L_0x00ae
                long r14 = r4 + r11
                int r3 = r13 >>> 12
                r3 = r3 | 480(0x1e0, float:6.73E-43)
                byte r3 = (byte) r3
                com.google.protobuf.C24065x2.m29992s(r1, r4, r3)
                long r3 = r14 + r11
                int r5 = r13 >>> 6
                r5 = r5 & 63
                r11 = 128(0x80, float:1.794E-43)
                r5 = r5 | r11
                byte r5 = (byte) r5
                com.google.protobuf.C24065x2.m29992s(r1, r14, r5)
                r14 = 1
                long r18 = r3 + r14
                r5 = r13 & 63
                r5 = r5 | r11
                byte r5 = (byte) r5
                com.google.protobuf.C24065x2.m29992s(r1, r3, r5)
                r12 = r18
                r4 = 1
                goto L_0x0047
            L_0x00ae:
                r11 = 4
                long r11 = r6 - r11
                int r15 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
                if (r15 > 0) goto L_0x010f
                int r3 = r2 + 1
                if (r3 == r8) goto L_0x0107
                char r2 = r0.charAt(r3)
                boolean r11 = java.lang.Character.isSurrogatePair(r13, r2)
                if (r11 == 0) goto L_0x0106
                int r2 = java.lang.Character.toCodePoint(r13, r2)
                r11 = 1
                long r13 = r4 + r11
                int r15 = r2 >>> 18
                r15 = r15 | 240(0xf0, float:3.36E-43)
                byte r15 = (byte) r15
                com.google.protobuf.C24065x2.m29992s(r1, r4, r15)
                long r4 = r13 + r11
                int r15 = r2 >>> 12
                r15 = r15 & 63
                r11 = 128(0x80, float:1.794E-43)
                r12 = r15 | 128(0x80, float:1.794E-43)
                byte r12 = (byte) r12
                com.google.protobuf.C24065x2.m29992s(r1, r13, r12)
                r12 = 1
                long r14 = r4 + r12
                int r16 = r2 >>> 6
                r12 = r16 & 63
                r12 = r12 | r11
                byte r12 = (byte) r12
                com.google.protobuf.C24065x2.m29992s(r1, r4, r12)
                r4 = 1
                long r12 = r14 + r4
                r2 = r2 & 63
                r2 = r2 | r11
                byte r2 = (byte) r2
                com.google.protobuf.C24065x2.m29992s(r1, r14, r2)
                r2 = r3
            L_0x00fb:
                int r2 = r2 + 1
                r3 = 128(0x80, float:1.794E-43)
                r20 = r4
                r4 = r12
                r11 = r20
                goto L_0x0033
            L_0x0106:
                r2 = r3
            L_0x0107:
                com.google.protobuf.y2$d r0 = new com.google.protobuf.y2$d
                int r2 = r2 + -1
                r0.<init>(r2, r8)
                throw r0
            L_0x010f:
                if (r14 > r13) goto L_0x0127
                if (r13 > r3) goto L_0x0127
                int r1 = r2 + 1
                if (r1 == r8) goto L_0x0121
                char r0 = r0.charAt(r1)
                boolean r0 = java.lang.Character.isSurrogatePair(r13, r0)
                if (r0 != 0) goto L_0x0127
            L_0x0121:
                com.google.protobuf.y2$d r0 = new com.google.protobuf.y2$d
                r0.<init>(r2, r8)
                throw r0
            L_0x0127:
                java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
                r1 = 46
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>(r1)
                r2.append(r10)
                r2.append(r13)
                r2.append(r9)
                r2.append(r4)
                java.lang.String r1 = r2.toString()
                r0.<init>(r1)
                throw r0
            L_0x0144:
                int r0 = (int) r4
                return r0
            L_0x0146:
                java.lang.ArrayIndexOutOfBoundsException r1 = new java.lang.ArrayIndexOutOfBoundsException
                int r8 = r8 + -1
                char r0 = r0.charAt(r8)
                int r2 = r2 + r3
                r3 = 37
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>(r3)
                r4.append(r10)
                r4.append(r0)
                r4.append(r9)
                r4.append(r2)
                java.lang.String r0 = r4.toString()
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C24079y2.C24083e.mo38434d(java.lang.CharSequence, byte[], int, int):int");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0036, code lost:
            if (com.google.protobuf.C24065x2.m29981h(r1, r8) > -65) goto L_0x003d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0067, code lost:
            if (com.google.protobuf.C24065x2.m29981h(r1, r8) > -65) goto L_0x0069;
         */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo38435e(int r24, byte[] r25, int r26, int r27) {
            /*
                r23 = this;
                r0 = r24
                r1 = r25
                r2 = r26
                r3 = r27
                r4 = r2 | r3
                int r5 = r1.length
                int r5 = r5 - r3
                r4 = r4 | r5
                r5 = 2
                if (r4 < 0) goto L_0x0152
                long r8 = (long) r2
                long r2 = (long) r3
                r4 = -19
                r10 = -62
                r11 = -16
                r12 = 16
                r13 = -96
                r14 = -32
                r15 = -65
                r16 = -1
                r17 = 1
                if (r0 == 0) goto L_0x00b1
                int r19 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r19 < 0) goto L_0x002b
                return r0
            L_0x002b:
                byte r7 = (byte) r0
                if (r7 >= r14) goto L_0x003e
                if (r7 < r10) goto L_0x003d
                long r20 = r8 + r17
                byte r0 = com.google.protobuf.C24065x2.m29981h(r1, r8)
                if (r0 <= r15) goto L_0x0039
                goto L_0x003d
            L_0x0039:
                r8 = r20
                goto L_0x00b1
            L_0x003d:
                return r16
            L_0x003e:
                if (r7 >= r11) goto L_0x006a
                int r0 = r0 >> 8
                int r0 = ~r0
                byte r0 = (byte) r0
                if (r0 != 0) goto L_0x0057
                long r20 = r8 + r17
                byte r0 = com.google.protobuf.C24065x2.m29981h(r1, r8)
                int r8 = (r20 > r2 ? 1 : (r20 == r2 ? 0 : -1))
                if (r8 < 0) goto L_0x0055
                int r0 = com.google.protobuf.C24079y2.m30061c(r7, r0)
                return r0
            L_0x0055:
                r8 = r20
            L_0x0057:
                if (r0 > r15) goto L_0x0069
                if (r7 != r14) goto L_0x005d
                if (r0 < r13) goto L_0x0069
            L_0x005d:
                if (r7 != r4) goto L_0x0061
                if (r0 >= r13) goto L_0x0069
            L_0x0061:
                long r20 = r8 + r17
                byte r0 = com.google.protobuf.C24065x2.m29981h(r1, r8)
                if (r0 <= r15) goto L_0x0039
            L_0x0069:
                return r16
            L_0x006a:
                int r6 = r0 >> 8
                int r6 = ~r6
                byte r6 = (byte) r6
                if (r6 != 0) goto L_0x0083
                long r21 = r8 + r17
                byte r6 = com.google.protobuf.C24065x2.m29981h(r1, r8)
                int r0 = (r21 > r2 ? 1 : (r21 == r2 ? 0 : -1))
                if (r0 < 0) goto L_0x007f
                int r0 = com.google.protobuf.C24079y2.m30061c(r7, r6)
                return r0
            L_0x007f:
                r8 = r21
                r0 = 0
                goto L_0x0085
            L_0x0083:
                int r0 = r0 >> r12
                byte r0 = (byte) r0
            L_0x0085:
                if (r0 != 0) goto L_0x0098
                long r21 = r8 + r17
                byte r0 = com.google.protobuf.C24065x2.m29981h(r1, r8)
                int r8 = (r21 > r2 ? 1 : (r21 == r2 ? 0 : -1))
                if (r8 < 0) goto L_0x0096
                int r0 = com.google.protobuf.C24079y2.m30062d(r7, r6, r0)
                return r0
            L_0x0096:
                r8 = r21
            L_0x0098:
                if (r6 > r15) goto L_0x00b0
                int r7 = r7 << 28
                int r6 = r6 + 112
                int r7 = r7 + r6
                int r6 = r7 >> 30
                if (r6 != 0) goto L_0x00b0
                if (r0 > r15) goto L_0x00b0
                long r6 = r8 + r17
                byte r0 = com.google.protobuf.C24065x2.m29981h(r1, r8)
                if (r0 <= r15) goto L_0x00ae
                goto L_0x00b0
            L_0x00ae:
                r8 = r6
                goto L_0x00b1
            L_0x00b0:
                return r16
            L_0x00b1:
                long r2 = r2 - r8
                int r0 = (int) r2
                if (r0 >= r12) goto L_0x00b7
                r2 = 0
                goto L_0x00ca
            L_0x00b7:
                r6 = r8
                r2 = 0
            L_0x00b9:
                if (r2 >= r0) goto L_0x00c9
                long r21 = r6 + r17
                byte r3 = com.google.protobuf.C24065x2.m29981h(r1, r6)
                if (r3 >= 0) goto L_0x00c4
                goto L_0x00ca
            L_0x00c4:
                int r2 = r2 + 1
                r6 = r21
                goto L_0x00b9
            L_0x00c9:
                r2 = r0
            L_0x00ca:
                int r0 = r0 - r2
                long r2 = (long) r2
                long r8 = r8 + r2
            L_0x00cd:
                r2 = 0
            L_0x00ce:
                if (r0 <= 0) goto L_0x00df
                long r2 = r8 + r17
                byte r6 = com.google.protobuf.C24065x2.m29981h(r1, r8)
                if (r6 < 0) goto L_0x00dd
                int r0 = r0 + -1
                r8 = r2
                r2 = r6
                goto L_0x00ce
            L_0x00dd:
                r8 = r2
                r2 = r6
            L_0x00df:
                if (r0 != 0) goto L_0x00e4
                r7 = 0
                goto L_0x0151
            L_0x00e4:
                int r0 = r0 + -1
                if (r2 >= r14) goto L_0x00fe
                if (r0 != 0) goto L_0x00ed
                r7 = r2
                goto L_0x0151
            L_0x00ed:
                int r0 = r0 + -1
                if (r2 < r10) goto L_0x00fc
                long r2 = r8 + r17
                byte r6 = com.google.protobuf.C24065x2.m29981h(r1, r8)
                if (r6 <= r15) goto L_0x00fa
                goto L_0x00fc
            L_0x00fa:
                r8 = r2
                goto L_0x00cd
            L_0x00fc:
                r7 = -1
                goto L_0x0151
            L_0x00fe:
                if (r2 >= r11) goto L_0x0122
                if (r0 >= r5) goto L_0x0107
                int r7 = m30077f(r1, r2, r8, r0)
                goto L_0x0151
            L_0x0107:
                int r0 = r0 + -2
                long r6 = r8 + r17
                byte r3 = com.google.protobuf.C24065x2.m29981h(r1, r8)
                if (r3 > r15) goto L_0x00fc
                if (r2 != r14) goto L_0x0115
                if (r3 < r13) goto L_0x00fc
            L_0x0115:
                if (r2 != r4) goto L_0x0119
                if (r3 >= r13) goto L_0x00fc
            L_0x0119:
                long r8 = r6 + r17
                byte r2 = com.google.protobuf.C24065x2.m29981h(r1, r6)
                if (r2 <= r15) goto L_0x00cd
                goto L_0x00fc
            L_0x0122:
                r3 = 3
                if (r0 >= r3) goto L_0x012a
                int r7 = m30077f(r1, r2, r8, r0)
                goto L_0x0151
            L_0x012a:
                int r0 = r0 + -3
                long r6 = r8 + r17
                byte r3 = com.google.protobuf.C24065x2.m29981h(r1, r8)
                if (r3 > r15) goto L_0x00fc
                int r2 = r2 << 28
                int r3 = r3 + 112
                int r2 = r2 + r3
                int r2 = r2 >> 30
                if (r2 != 0) goto L_0x00fc
                long r2 = r6 + r17
                byte r6 = com.google.protobuf.C24065x2.m29981h(r1, r6)
                if (r6 > r15) goto L_0x00fc
                long r6 = r2 + r17
                byte r2 = com.google.protobuf.C24065x2.m29981h(r1, r2)
                if (r2 <= r15) goto L_0x014e
                goto L_0x00fc
            L_0x014e:
                r8 = r6
                goto L_0x00cd
            L_0x0151:
                return r7
            L_0x0152:
                java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
                r4 = 3
                java.lang.Object[] r4 = new java.lang.Object[r4]
                int r1 = r1.length
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r6 = 0
                r4[r6] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r26)
                r2 = 1
                r4[r2] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r27)
                r4[r5] = r1
                java.lang.String r1 = "Array length=%d, index=%d, limit=%d"
                java.lang.String r1 = java.lang.String.format(r1, r4)
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C24079y2.C24083e.mo38435e(int, byte[], int, int):int");
        }
    }

    /* renamed from: a */
    public static int m30059a(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            if (b > -12) {
                b = -1;
            }
            return b;
        } else if (i3 == 1) {
            return m30061c(b, bArr[i]);
        } else {
            if (i3 == 2) {
                return m30062d(b, bArr[i], bArr[i + 1]);
            }
            throw new AssertionError();
        }
    }

    /* renamed from: b */
    public static int m30060b(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                throw new C17017d(i2, length2);
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(((long) i3) + 4294967296L);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: c */
    public static int m30061c(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* renamed from: d */
    public static int m30062d(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    /* renamed from: e */
    public static boolean m30063e(byte[] bArr, int i, int i2) {
        return f69220a.mo38435e(0, bArr, i, i2) == 0;
    }
}
