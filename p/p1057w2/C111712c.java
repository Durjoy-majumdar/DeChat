package p1057w2;

import android.graphics.Path;

/* renamed from: w2.c */
public class C111712c {
    /* renamed from: a */
    public static boolean m152278a(C111713a[] aVarArr, C111713a[] aVarArr2) {
        if (aVarArr == null || aVarArr2 == null || aVarArr.length != aVarArr2.length) {
            return false;
        }
        for (int i = 0; i < aVarArr.length; i++) {
            C111713a aVar = aVarArr[i];
            char c = aVar.f334392a;
            C111713a aVar2 = aVarArr2[i];
            if (c != aVar2.f334392a || aVar.f334393b.length != aVar2.f334393b.length) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static float[] m152279b(float[] fArr, int i, int i2) {
        if (i <= i2) {
            int length = fArr.length;
            if (i < 0 || i > length) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i3 = i2 - i;
            int min = Math.min(i3, length - i);
            float[] fArr2 = new float[i3];
            System.arraycopy(fArr, i, fArr2, 0, min);
            return fArr2;
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008a, code lost:
        if (r16 == false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008c, code lost:
        r14 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0097 A[Catch:{ NumberFormatException -> 0x00b8 }, LOOP:3: B:25:0x006e->B:43:0x0097, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00e3 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0096 A[SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p1057w2.C111712c.C111713a[] m152280c(java.lang.String r17) {
        /*
            r0 = r17
            if (r0 != 0) goto L_0x0006
            r0 = 0
            return r0
        L_0x0006:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            r4 = 1
            r5 = 0
        L_0x000e:
            int r6 = r17.length()
            if (r4 >= r6) goto L_0x00ea
        L_0x0014:
            int r6 = r17.length()
            r7 = 69
            r8 = 101(0x65, float:1.42E-43)
            if (r4 >= r6) goto L_0x003a
            char r6 = r0.charAt(r4)
            int r9 = r6 + -65
            int r10 = r6 + -90
            int r9 = r9 * r10
            if (r9 <= 0) goto L_0x0032
            int r9 = r6 + -97
            int r10 = r6 + -122
            int r9 = r9 * r10
            if (r9 > 0) goto L_0x0037
        L_0x0032:
            if (r6 == r8) goto L_0x0037
            if (r6 == r7) goto L_0x0037
            goto L_0x003a
        L_0x0037:
            int r4 = r4 + 1
            goto L_0x0014
        L_0x003a:
            java.lang.String r5 = r0.substring(r5, r4)
            java.lang.String r5 = r5.trim()
            int r6 = r5.length()
            if (r6 <= 0) goto L_0x00e3
            char r6 = r5.charAt(r2)
            r9 = 122(0x7a, float:1.71E-43)
            if (r6 == r9) goto L_0x00d5
            char r6 = r5.charAt(r2)
            r9 = 90
            if (r6 != r9) goto L_0x005a
            goto L_0x00d5
        L_0x005a:
            int r6 = r5.length()     // Catch:{ NumberFormatException -> 0x00b8 }
            float[] r6 = new float[r6]     // Catch:{ NumberFormatException -> 0x00b8 }
            int r9 = r5.length()     // Catch:{ NumberFormatException -> 0x00b8 }
            r10 = 1
            r11 = 0
        L_0x0066:
            if (r10 >= r9) goto L_0x00b2
            r12 = r10
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
        L_0x006e:
            int r3 = r5.length()     // Catch:{ NumberFormatException -> 0x00b8 }
            if (r12 >= r3) goto L_0x009b
            char r3 = r5.charAt(r12)     // Catch:{ NumberFormatException -> 0x00b8 }
            r2 = 32
            if (r3 == r2) goto L_0x0091
            if (r3 == r7) goto L_0x008e
            if (r3 == r8) goto L_0x008e
            switch(r3) {
                case 44: goto L_0x0091;
                case 45: goto L_0x0088;
                case 46: goto L_0x0084;
                default: goto L_0x0083;
            }     // Catch:{ NumberFormatException -> 0x00b8 }
        L_0x0083:
            goto L_0x0092
        L_0x0084:
            if (r15 != 0) goto L_0x008c
            r15 = 1
            goto L_0x0092
        L_0x0088:
            if (r12 == r10) goto L_0x0092
            if (r16 != 0) goto L_0x0092
        L_0x008c:
            r14 = 1
            goto L_0x0091
        L_0x008e:
            r16 = 1
            goto L_0x0094
        L_0x0091:
            r13 = 1
        L_0x0092:
            r16 = 0
        L_0x0094:
            if (r13 == 0) goto L_0x0097
            goto L_0x009b
        L_0x0097:
            int r12 = r12 + 1
            r2 = 0
            goto L_0x006e
        L_0x009b:
            if (r10 >= r12) goto L_0x00aa
            int r2 = r11 + 1
            java.lang.String r3 = r5.substring(r10, r12)     // Catch:{ NumberFormatException -> 0x00b8 }
            float r3 = java.lang.Float.parseFloat(r3)     // Catch:{ NumberFormatException -> 0x00b8 }
            r6[r11] = r3     // Catch:{ NumberFormatException -> 0x00b8 }
            r11 = r2
        L_0x00aa:
            if (r14 == 0) goto L_0x00ad
            goto L_0x00af
        L_0x00ad:
            int r12 = r12 + 1
        L_0x00af:
            r10 = r12
            r2 = 0
            goto L_0x0066
        L_0x00b2:
            float[] r3 = m152279b(r6, r2, r11)     // Catch:{ NumberFormatException -> 0x00b8 }
            r2 = 0
            goto L_0x00d7
        L_0x00b8:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "error in parsing \""
            r2.append(r3)
            r2.append(r5)
            java.lang.String r3 = "\""
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
        L_0x00d5:
            float[] r3 = new float[r2]
        L_0x00d7:
            char r5 = r5.charAt(r2)
            w2.c$a r2 = new w2.c$a
            r2.<init>(r5, r3)
            r1.add(r2)
        L_0x00e3:
            int r2 = r4 + 1
            r5 = r4
            r4 = r2
            r2 = 0
            goto L_0x000e
        L_0x00ea:
            int r4 = r4 - r5
            r2 = 1
            if (r4 != r2) goto L_0x0103
            int r2 = r17.length()
            if (r5 >= r2) goto L_0x0103
            char r0 = r0.charAt(r5)
            r2 = 0
            float[] r2 = new float[r2]
            w2.c$a r3 = new w2.c$a
            r3.<init>(r0, r2)
            r1.add(r3)
        L_0x0103:
            int r0 = r1.size()
            w2.c$a[] r0 = new p1057w2.C111712c.C111713a[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            w2.c$a[] r0 = (p1057w2.C111712c.C111713a[]) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p1057w2.C111712c.m152280c(java.lang.String):w2.c$a[]");
    }

    /* renamed from: d */
    public static Path m152281d(String str) {
        Path path = new Path();
        C111713a[] c = m152280c(str);
        if (c == null) {
            return null;
        }
        try {
            C111713a.m152284b(c, path);
            return path;
        } catch (RuntimeException e) {
            throw new RuntimeException("Error in parsing " + str, e);
        }
    }

    /* renamed from: e */
    public static C111713a[] m152282e(C111713a[] aVarArr) {
        if (aVarArr == null) {
            return null;
        }
        C111713a[] aVarArr2 = new C111713a[aVarArr.length];
        for (int i = 0; i < aVarArr.length; i++) {
            aVarArr2[i] = new C111713a(aVarArr[i]);
        }
        return aVarArr2;
    }

    /* renamed from: w2.c$a */
    public static class C111713a {

        /* renamed from: a */
        public char f334392a;

        /* renamed from: b */
        public float[] f334393b;

        public C111713a(char c, float[] fArr) {
            this.f334392a = c;
            this.f334393b = fArr;
        }

        /* renamed from: a */
        public static void m152283a(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
            double d;
            double d2;
            float f8 = f;
            float f9 = f3;
            float f15 = f5;
            float f16 = f6;
            boolean z3 = z2;
            double radians = Math.toRadians((double) f7);
            double cos = Math.cos(radians);
            double sin = Math.sin(radians);
            double d3 = (double) f8;
            double d4 = (double) f2;
            double d5 = (d3 * cos) + (d4 * sin);
            double d6 = d3;
            double d7 = (double) f15;
            double d8 = d5 / d7;
            double d9 = radians;
            double d15 = d4;
            double d16 = (double) f16;
            double d17 = ((((double) (-f8)) * sin) + (d4 * cos)) / d16;
            double d18 = (double) f4;
            double d19 = ((((double) f9) * cos) + (d18 * sin)) / d7;
            double d25 = d7;
            double d26 = ((((double) (-f9)) * sin) + (d18 * cos)) / d16;
            double d27 = d8 - d19;
            double d28 = d17 - d26;
            double d29 = (d8 + d19) / 2.0d;
            double d35 = (d17 + d26) / 2.0d;
            double d36 = (d27 * d27) + (d28 * d28);
            if (d36 != 0.0d) {
                double d37 = (1.0d / d36) - 0.25d;
                if (d37 < 0.0d) {
                    float sqrt = (float) (Math.sqrt(d36) / 1.99999d);
                    m152283a(path, f, f2, f3, f4, f15 * sqrt, f16 * sqrt, f7, z, z2);
                    return;
                }
                double sqrt2 = Math.sqrt(d37);
                double d38 = d27 * sqrt2;
                double d39 = sqrt2 * d28;
                boolean z4 = z2;
                if (z == z4) {
                    d2 = d29 - d39;
                    d = d35 + d38;
                } else {
                    d2 = d29 + d39;
                    d = d35 - d38;
                }
                double atan2 = Math.atan2(d17 - d, d8 - d2);
                double atan22 = Math.atan2(d26 - d, d19 - d2) - atan2;
                int i = (atan22 > 0.0d ? 1 : (atan22 == 0.0d ? 0 : -1));
                if (z4 != (i >= 0)) {
                    atan22 = i > 0 ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
                }
                double d44 = d2 * d25;
                double d45 = d * d16;
                double d46 = (d44 * cos) - (d45 * sin);
                double d47 = (d44 * sin) + (d45 * cos);
                int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
                double cos2 = Math.cos(d9);
                double sin2 = Math.sin(d9);
                double cos3 = Math.cos(atan2);
                double sin3 = Math.sin(atan2);
                double d48 = d25;
                double d49 = -d48;
                double d54 = d49 * cos2;
                double d55 = d16 * sin2;
                double d56 = (d54 * sin3) - (d55 * cos3);
                double d57 = d49 * sin2;
                double d58 = d16 * cos2;
                double d59 = (sin3 * d57) + (cos3 * d58);
                double d64 = atan2;
                double d65 = d57;
                int i2 = ceil;
                double d66 = atan22 / ((double) i2);
                double d67 = d64;
                int i3 = 0;
                while (i3 < i2) {
                    double d68 = d67 + d66;
                    double sin4 = Math.sin(d68);
                    double cos4 = Math.cos(d68);
                    double d69 = d66;
                    double d74 = (d46 + ((d48 * cos2) * cos4)) - (d55 * sin4);
                    double d75 = d46;
                    double d76 = d47 + (d48 * sin2 * cos4) + (d58 * sin4);
                    double d77 = (d54 * sin4) - (d55 * cos4);
                    double d78 = d65;
                    double d79 = (sin4 * d78) + (cos4 * d58);
                    double d84 = d68 - d67;
                    double tan = Math.tan(d84 / 2.0d);
                    double sin5 = (Math.sin(d84) * (Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d)) / 3.0d;
                    double d85 = d58;
                    double d86 = d6 + (d56 * sin5);
                    path.rLineTo(0.0f, 0.0f);
                    path.cubicTo((float) d86, (float) (d15 + (d59 * sin5)), (float) (d74 - (sin5 * d77)), (float) (d76 - (sin5 * d79)), (float) d74, (float) d76);
                    i3++;
                    d58 = d85;
                    cos2 = cos2;
                    d15 = d76;
                    d67 = d68;
                    d48 = d48;
                    sin2 = sin2;
                    i2 = i2;
                    d59 = d79;
                    d56 = d77;
                    d65 = d78;
                    d46 = d75;
                    d6 = d74;
                    d66 = d69;
                }
            }
        }

        /* renamed from: b */
        public static void m152284b(C111713a[] aVarArr, Path path) {
            int i;
            float f;
            float f2;
            int i2;
            int i3;
            float[] fArr;
            char c;
            int i4;
            float[] fArr2;
            char c2;
            int i5;
            float f3;
            float f4;
            float f5;
            float f6;
            int i6;
            float f7;
            float f8;
            int i7;
            float f9;
            float f15;
            float f16;
            float f17;
            float f18;
            float f19;
            float f25;
            float f26;
            float f27;
            float f28;
            float f29;
            float f35;
            float f36;
            float f37;
            float f38;
            float f39;
            float f44;
            C111713a[] aVarArr2 = aVarArr;
            Path path2 = path;
            float[] fArr3 = new float[6];
            char c3 = 'm';
            char c4 = 0;
            char c5 = 'm';
            int i8 = 0;
            while (i8 < aVarArr2.length) {
                C111713a aVar = aVarArr2[i8];
                char c6 = aVar.f334392a;
                float[] fArr4 = aVar.f334393b;
                float f45 = fArr3[c4];
                float f46 = fArr3[1];
                float f47 = fArr3[2];
                float f48 = fArr3[3];
                float f49 = fArr3[4];
                float f54 = fArr3[5];
                switch (c6) {
                    case 'A':
                    case 'a':
                        i = 7;
                        break;
                    case 'C':
                    case 'c':
                        i = 6;
                        break;
                    case 'H':
                    case 'V':
                    case 'h':
                    case 'v':
                        i = 1;
                        break;
                    case 'Q':
                    case 'S':
                    case 'q':
                    case 's':
                        i = 4;
                        break;
                    case 'Z':
                    case 'z':
                        path.close();
                        path2.moveTo(f49, f54);
                        f45 = f49;
                        f47 = f45;
                        f46 = f54;
                        f48 = f46;
                        break;
                }
                i = 2;
                float f55 = f49;
                float f56 = f54;
                float f57 = f45;
                float f58 = f46;
                int i9 = 0;
                while (i9 < fArr4.length) {
                    if (c6 != 'A') {
                        if (c6 != 'C') {
                            if (c6 == 'H') {
                                i2 = i9;
                                fArr = fArr4;
                                c = c6;
                                i3 = i8;
                                int i15 = i2 + 0;
                                path2.lineTo(fArr[i15], f58);
                                f57 = fArr[i15];
                            } else if (c6 == 'Q') {
                                i6 = i9;
                                fArr = fArr4;
                                c = c6;
                                i3 = i8;
                                int i16 = i6 + 0;
                                int i17 = i6 + 1;
                                int i18 = i6 + 2;
                                int i19 = i6 + 3;
                                path2.quadTo(fArr[i16], fArr[i17], fArr[i18], fArr[i19]);
                                f6 = fArr[i16];
                                f5 = fArr[i17];
                                f57 = fArr[i18];
                                f58 = fArr[i19];
                            } else if (c6 == 'V') {
                                i2 = i9;
                                fArr = fArr4;
                                c = c6;
                                i3 = i8;
                                int i25 = i2 + 0;
                                path2.lineTo(f57, fArr[i25]);
                                f58 = fArr[i25];
                            } else if (c6 != 'a') {
                                if (c6 != 'c') {
                                    if (c6 == 'h') {
                                        i2 = i9;
                                        float f59 = f58;
                                        int i26 = i2 + 0;
                                        path2.rLineTo(fArr4[i26], 0.0f);
                                        f57 += fArr4[i26];
                                    } else if (c6 != 'q') {
                                        if (c6 != 'v') {
                                            if (c6 != 'L') {
                                                if (c6 == 'M') {
                                                    i2 = i9;
                                                    f27 = fArr4[i2 + 0];
                                                    f26 = fArr4[i2 + 1];
                                                    if (i2 > 0) {
                                                        path2.lineTo(f27, f26);
                                                    } else {
                                                        path2.moveTo(f27, f26);
                                                        f57 = f27;
                                                        f58 = f26;
                                                    }
                                                } else if (c6 == 'S') {
                                                    i7 = i9;
                                                    float f64 = f58;
                                                    float f65 = f57;
                                                    if (c5 == 'c' || c5 == 's' || c5 == 'C' || c5 == 'S') {
                                                        f28 = (f64 * 2.0f) - f;
                                                        f29 = (f65 * 2.0f) - f2;
                                                    } else {
                                                        f29 = f65;
                                                        f28 = f64;
                                                    }
                                                    int i27 = i7 + 0;
                                                    int i28 = i7 + 1;
                                                    int i29 = i7 + 2;
                                                    int i35 = i7 + 3;
                                                    path.cubicTo(f29, f28, fArr4[i27], fArr4[i28], fArr4[i29], fArr4[i35]);
                                                    float f66 = fArr4[i27];
                                                    float f67 = fArr4[i28];
                                                    f8 = fArr4[i29];
                                                    f7 = fArr4[i35];
                                                    f2 = f66;
                                                    f = f67;
                                                    f57 = f8;
                                                    f58 = f7;
                                                } else if (c6 == 'T') {
                                                    i2 = i9;
                                                    float f68 = f58;
                                                    float f69 = f57;
                                                    if (c5 == 'q' || c5 == 't' || c5 == 'Q' || c5 == 'T') {
                                                        f35 = (f69 * 2.0f) - f2;
                                                        f36 = (f68 * 2.0f) - f;
                                                    } else {
                                                        f35 = f69;
                                                        f36 = f68;
                                                    }
                                                    int i36 = i2 + 0;
                                                    int i37 = i2 + 1;
                                                    path2.quadTo(f35, f36, fArr4[i36], fArr4[i37]);
                                                    f = f36;
                                                    f2 = f35;
                                                    fArr = fArr4;
                                                    c = c6;
                                                    i3 = i8;
                                                    f57 = fArr4[i36];
                                                    f58 = fArr4[i37];
                                                } else if (c6 == 'l') {
                                                    i2 = i9;
                                                    f19 = f58;
                                                    int i38 = i2 + 0;
                                                    int i39 = i2 + 1;
                                                    path2.rLineTo(fArr4[i38], fArr4[i39]);
                                                    f57 += fArr4[i38];
                                                    f25 = fArr4[i39];
                                                } else if (c6 == c3) {
                                                    i2 = i9;
                                                    float f74 = fArr4[i2 + 0];
                                                    f57 += f74;
                                                    float f75 = fArr4[i2 + 1];
                                                    f58 += f75;
                                                    if (i2 > 0) {
                                                        path2.rLineTo(f74, f75);
                                                    } else {
                                                        path2.rMoveTo(f74, f75);
                                                    }
                                                } else if (c6 != 's') {
                                                    if (c6 == 't') {
                                                        if (c5 == 'q' || c5 == 't' || c5 == 'Q' || c5 == 'T') {
                                                            f39 = f57 - f2;
                                                            f44 = f58 - f;
                                                        } else {
                                                            f44 = 0.0f;
                                                            f39 = 0;
                                                        }
                                                        int i44 = i9 + 0;
                                                        int i45 = i9 + 1;
                                                        path2.rQuadTo(f39, f44, fArr4[i44], fArr4[i45]);
                                                        f2 = f39 + f57;
                                                        float f76 = f44 + f58;
                                                        f57 += fArr4[i44];
                                                        f58 += fArr4[i45];
                                                        f = f76;
                                                    }
                                                    i2 = i9;
                                                } else {
                                                    if (c5 == 'c' || c5 == 's' || c5 == 'C' || c5 == 'S') {
                                                        f37 = f58 - f;
                                                        f38 = f57 - f2;
                                                    } else {
                                                        f38 = 0.0f;
                                                        f37 = 0.0f;
                                                    }
                                                    int i46 = i9 + 0;
                                                    int i47 = i9 + 1;
                                                    int i48 = i9 + 2;
                                                    int i49 = i9 + 3;
                                                    i7 = i9;
                                                    f9 = f58;
                                                    float f77 = f57;
                                                    path.rCubicTo(f38, f37, fArr4[i46], fArr4[i47], fArr4[i48], fArr4[i49]);
                                                    f17 = fArr4[i46] + f77;
                                                    f16 = fArr4[i47] + f9;
                                                    f15 = f77 + fArr4[i48];
                                                    f18 = fArr4[i49];
                                                }
                                                f56 = f58;
                                                f55 = f57;
                                            } else {
                                                i2 = i9;
                                                int i54 = i2 + 0;
                                                int i55 = i2 + 1;
                                                path2.lineTo(fArr4[i54], fArr4[i55]);
                                                f27 = fArr4[i54];
                                                f26 = fArr4[i55];
                                            }
                                            f57 = f27;
                                            f58 = f26;
                                        } else {
                                            i2 = i9;
                                            f19 = f58;
                                            float f78 = f57;
                                            int i56 = i2 + 0;
                                            path2.rLineTo(0.0f, fArr4[i56]);
                                            f25 = fArr4[i56];
                                        }
                                        f58 = f19 + f25;
                                    } else {
                                        i7 = i9;
                                        f9 = f58;
                                        float f79 = f57;
                                        int i57 = i7 + 0;
                                        int i58 = i7 + 1;
                                        int i59 = i7 + 2;
                                        int i64 = i7 + 3;
                                        path2.rQuadTo(fArr4[i57], fArr4[i58], fArr4[i59], fArr4[i64]);
                                        f17 = fArr4[i57] + f79;
                                        f16 = fArr4[i58] + f9;
                                        float f84 = f79 + fArr4[i59];
                                        float f85 = fArr4[i64];
                                        f15 = f84;
                                        f18 = f85;
                                    }
                                    fArr = fArr4;
                                    c = c6;
                                    i3 = i8;
                                } else {
                                    i7 = i9;
                                    f9 = f58;
                                    float f86 = f57;
                                    int i65 = i7 + 2;
                                    int i66 = i7 + 3;
                                    int i67 = i7 + 4;
                                    int i68 = i7 + 5;
                                    path.rCubicTo(fArr4[i7 + 0], fArr4[i7 + 1], fArr4[i65], fArr4[i66], fArr4[i67], fArr4[i68]);
                                    f17 = fArr4[i65] + f86;
                                    f16 = fArr4[i66] + f9;
                                    f15 = f86 + fArr4[i67];
                                    f18 = fArr4[i68];
                                }
                                f7 = f9 + f18;
                                f2 = f17;
                                f = f16;
                                f8 = f15;
                                f57 = f8;
                                f58 = f7;
                                fArr = fArr4;
                                c = c6;
                                i3 = i8;
                            } else {
                                i4 = i9;
                                float f87 = f58;
                                float f88 = f57;
                                int i69 = i4 + 5;
                                float f89 = fArr4[i69] + f88;
                                int i74 = i4 + 6;
                                float f94 = fArr4[i74] + f87;
                                float f95 = fArr4[i4 + 0];
                                float f96 = fArr4[i4 + 1];
                                float f97 = fArr4[i4 + 2];
                                boolean z = fArr4[i4 + 3] != 0.0f;
                                boolean z2 = fArr4[i4 + 4] != 0.0f;
                                fArr2 = fArr4;
                                float f98 = f97;
                                c2 = c6;
                                i5 = i8;
                                m152283a(path, f88, f87, f89, f94, f95, f96, f98, z, z2);
                                f3 = f88 + fArr2[i69];
                                f4 = f87 + fArr2[i74];
                            }
                            i9 = i2 + i;
                            c5 = c;
                            c6 = c5;
                            fArr4 = fArr;
                            i8 = i3;
                            c3 = 'm';
                            C111713a[] aVarArr3 = aVarArr;
                        } else {
                            i6 = i9;
                            fArr = fArr4;
                            c = c6;
                            i3 = i8;
                            int i75 = i6 + 2;
                            int i76 = i6 + 3;
                            int i77 = i6 + 4;
                            int i78 = i6 + 5;
                            path.cubicTo(fArr[i6 + 0], fArr[i6 + 1], fArr[i75], fArr[i76], fArr[i77], fArr[i78]);
                            f57 = fArr[i77];
                            f58 = fArr[i78];
                            f6 = fArr[i75];
                            f5 = fArr[i76];
                        }
                        f2 = f6;
                        f = f5;
                        i9 = i2 + i;
                        c5 = c;
                        c6 = c5;
                        fArr4 = fArr;
                        i8 = i3;
                        c3 = 'm';
                        C111713a[] aVarArr32 = aVarArr;
                    } else {
                        i4 = i9;
                        fArr2 = fArr4;
                        c2 = c6;
                        i5 = i8;
                        int i79 = i4 + 5;
                        int i84 = i4 + 6;
                        m152283a(path, f57, f58, fArr2[i79], fArr2[i84], fArr2[i4 + 0], fArr2[i4 + 1], fArr2[i4 + 2], fArr2[i4 + 3] != 0.0f, fArr2[i4 + 4] != 0.0f);
                        f3 = fArr2[i79];
                        f4 = fArr2[i84];
                    }
                    f = f58;
                    f2 = f57;
                    i9 = i2 + i;
                    c5 = c;
                    c6 = c5;
                    fArr4 = fArr;
                    i8 = i3;
                    c3 = 'm';
                    C111713a[] aVarArr322 = aVarArr;
                }
                int i85 = i8;
                fArr3[0] = f57;
                fArr3[1] = f58;
                fArr3[2] = f2;
                fArr3[3] = f;
                fArr3[4] = f55;
                fArr3[5] = f56;
                i8 = i85 + 1;
                c5 = aVarArr[i85].f334392a;
                c3 = 'm';
                c4 = 0;
                aVarArr2 = aVarArr;
            }
        }

        public C111713a(C111713a aVar) {
            this.f334392a = aVar.f334392a;
            float[] fArr = aVar.f334393b;
            this.f334393b = C111712c.m152279b(fArr, 0, fArr.length);
        }
    }
}
