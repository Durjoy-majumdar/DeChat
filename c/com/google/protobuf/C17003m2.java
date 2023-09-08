package com.google.protobuf;

import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.protobuf.C16994k;
import com.google.protobuf.C17010p2;
import com.google.protobuf.C23938s;
import com.google.protobuf.C24020s2;
import com.google.protobuf.C24025t;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.io.IOException;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Logger;

/* renamed from: com.google.protobuf.m2 */
public final class C17003m2 {

    /* renamed from: a */
    public static final Logger f46007a = Logger.getLogger(C17003m2.class.getName());

    /* renamed from: com.google.protobuf.m2$b */
    public static class C17005b extends IOException {
        public C17005b(String str) {
            super(str);
        }
    }

    /* renamed from: com.google.protobuf.m2$d */
    public static final class C17006d {

        /* renamed from: a */
        public final Appendable f46008a;

        /* renamed from: b */
        public final StringBuilder f46009b = new StringBuilder();

        /* renamed from: c */
        public boolean f46010c = false;

        public C17006d(Appendable appendable, boolean z, C17004a aVar) {
            this.f46008a = appendable;
        }

        /* renamed from: a */
        public void mo18758a() {
            this.f46008a.append("\n");
            this.f46010c = true;
        }

        /* renamed from: b */
        public void mo18759b() {
            int length = this.f46009b.length();
            if (length != 0) {
                this.f46009b.setLength(length - 2);
                return;
            }
            throw new IllegalArgumentException(" Outdent() without matching Indent().");
        }

        /* renamed from: c */
        public void mo18760c(CharSequence charSequence) {
            if (this.f46010c) {
                this.f46010c = false;
                this.f46008a.append(this.f46009b);
            }
            this.f46008a.append(charSequence);
        }
    }

    /* renamed from: com.google.protobuf.m2$c */
    public static final class C17007c {

        /* renamed from: b */
        public static final C17007c f46011b = new C17007c(true, C17010p2.C17011a.f46018a);

        /* renamed from: a */
        public final C17010p2 f46012a;

        /* renamed from: com.google.protobuf.m2$c$a */
        public static class C17008a implements Comparable<C17008a> {

            /* renamed from: d */
            public Object f46013d;

            /* renamed from: e */
            public C24074y0 f46014e;

            /* renamed from: f */
            public final C24025t.C24035g.C24036a f46015f;

            public C17008a(Object obj, C24025t.C24035g gVar) {
                if (obj instanceof C24074y0) {
                    this.f46014e = (C24074y0) obj;
                } else {
                    this.f46013d = obj;
                }
                this.f46015f = gVar.mo38339h().mo38319h().get(0).f69109j.f69132d;
            }

            /* renamed from: a */
            public Object mo18763a() {
                C24074y0 y0Var = this.f46014e;
                if (y0Var != null) {
                    return y0Var.f69205d;
                }
                return null;
            }

            public int compareTo(Object obj) {
                C17008a aVar = (C17008a) obj;
                if (mo18763a() == null || aVar.mo18763a() == null) {
                    C17003m2.f46007a.info("Invalid key for map field.");
                    return -1;
                }
                int ordinal = this.f46015f.ordinal();
                if (ordinal == 0) {
                    return Integer.compare(((Integer) mo18763a()).intValue(), ((Integer) aVar.mo18763a()).intValue());
                }
                if (ordinal == 1) {
                    return Long.compare(((Long) mo18763a()).longValue(), ((Long) aVar.mo18763a()).longValue());
                }
                if (ordinal == 4) {
                    return Boolean.compare(((Boolean) mo18763a()).booleanValue(), ((Boolean) aVar.mo18763a()).booleanValue());
                }
                if (ordinal == 5) {
                    String str = (String) mo18763a();
                    String str2 = (String) aVar.mo18763a();
                    if (!(str == null && str2 == null)) {
                        if (str == null && str2 != null) {
                            return -1;
                        }
                        if (str == null || str2 != null) {
                            return str.compareTo(str2);
                        }
                        return 1;
                    }
                }
                return 0;
            }
        }

        static {
            int i = C17010p2.f46016b;
        }

        public C17007c(boolean z, C17010p2 p2Var) {
            this.f46012a = p2Var;
        }

        /* renamed from: c */
        public static void m16829c(int i, int i2, List<?> list, C17006d dVar) {
            int F;
            for (Object next : list) {
                dVar.mo18760c(String.valueOf(i));
                dVar.mo18760c(": ");
                int i3 = i2 & 7;
                if (i3 == 0) {
                    dVar.mo18760c(C17003m2.m16825d(((Long) next).longValue()));
                } else if (i3 == 1) {
                    dVar.mo18760c(String.format((Locale) null, "0x%016x", new Object[]{(Long) next}));
                } else if (i3 == 2) {
                    try {
                        C16994k kVar = (C16994k) next;
                        C24020s2.C24021a b = C24020s2.m29807b();
                        C23856l o = kVar.mo18745o();
                        do {
                            F = o.mo37757F();
                            if (F == 0 || !b.mo38302e(F, o)) {
                                o.mo37761a(0);
                            }
                            F = o.mo37757F();
                            break;
                        } while (!b.mo38302e(F, o));
                        o.mo37761a(0);
                        C24020s2 b2 = b.build();
                        dVar.mo18760c("{");
                        dVar.mo18758a();
                        dVar.f46009b.append("  ");
                        m16830d(b2, dVar);
                        dVar.mo18759b();
                        dVar.mo18760c("}");
                    } catch (C23922p0 e) {
                        throw e;
                    } catch (IOException e2) {
                        throw new RuntimeException("Reading from a ByteString threw an IOException (should never happen).", e2);
                    } catch (C23922p0 unused) {
                        dVar.mo18760c(FastJsonResponse.QUOTE);
                        Logger logger = C17003m2.f46007a;
                        dVar.mo18760c(C113385n2.m155239a((C16994k) next));
                        dVar.mo18760c(FastJsonResponse.QUOTE);
                    }
                } else if (i3 == 3) {
                    m16830d((C24020s2) next, dVar);
                } else if (i3 == 5) {
                    dVar.mo18760c(String.format((Locale) null, "0x%08x", new Object[]{(Integer) next}));
                } else {
                    StringBuilder sb = new StringBuilder(20);
                    sb.append("Bad tag: ");
                    sb.append(i2);
                    throw new IllegalArgumentException(sb.toString());
                }
                dVar.mo18758a();
            }
        }

        /* renamed from: d */
        public static void m16830d(C24020s2 s2Var, C17006d dVar) {
            for (Map.Entry next : s2Var.f69056d.entrySet()) {
                int intValue = ((Integer) next.getKey()).intValue();
                C24020s2.C24022b bVar = (C24020s2.C24022b) next.getValue();
                m16829c(intValue, 0, bVar.f69062a, dVar);
                m16829c(intValue, 5, bVar.f69063b, dVar);
                m16829c(intValue, 1, bVar.f69064c, dVar);
                m16829c(intValue, 2, bVar.f69065d, dVar);
                for (C24020s2 d : bVar.f69066e) {
                    dVar.mo18760c(((Integer) next.getKey()).toString());
                    dVar.mo18760c(" {");
                    dVar.mo18758a();
                    dVar.f46009b.append("  ");
                    m16830d(d, dVar);
                    dVar.mo18759b();
                    dVar.mo18760c("}");
                    dVar.mo18758a();
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0080 A[RETURN] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo18761a(com.google.protobuf.C23896m1 r7, com.google.protobuf.C17003m2.C17006d r8) {
            /*
                r6 = this;
                com.google.protobuf.t$b r0 = r7.getDescriptorForType()
                java.lang.String r0 = r0.f69070e
                java.lang.String r1 = "google.protobuf.Any"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0081
                com.google.protobuf.t$b r0 = r7.getDescriptorForType()
                r1 = 1
                com.google.protobuf.t$g r2 = r0.mo38317g(r1)
                r3 = 2
                com.google.protobuf.t$g r0 = r0.mo38317g(r3)
                if (r2 == 0) goto L_0x007d
                com.google.protobuf.t$g$b r3 = r2.f69109j
                com.google.protobuf.t$g$b r4 = com.google.protobuf.C24025t.C24035g.C24037b.STRING
                if (r3 != r4) goto L_0x007d
                if (r0 == 0) goto L_0x007d
                com.google.protobuf.t$g$b r3 = r0.f69109j
                com.google.protobuf.t$g$b r4 = com.google.protobuf.C24025t.C24035g.C24037b.BYTES
                if (r3 == r4) goto L_0x002d
                goto L_0x007d
            L_0x002d:
                java.lang.Object r2 = r7.getField(r2)
                java.lang.String r2 = (java.lang.String) r2
                boolean r3 = r2.isEmpty()
                if (r3 == 0) goto L_0x003a
                goto L_0x007d
            L_0x003a:
                java.lang.Object r0 = r7.getField(r0)
                com.google.protobuf.p2 r3 = r6.f46012a     // Catch:{ p0 -> 0x007d }
                com.google.protobuf.t$b r3 = r3.mo18765a(r2)     // Catch:{ p0 -> 0x007d }
                if (r3 != 0) goto L_0x0047
                goto L_0x007d
            L_0x0047:
                com.google.protobuf.v r3 = com.google.protobuf.C24051v.m29929a(r3)     // Catch:{ p0 -> 0x007d }
                com.google.protobuf.v$b r4 = new com.google.protobuf.v$b     // Catch:{ p0 -> 0x007d }
                com.google.protobuf.t$b r3 = r3.f69170d     // Catch:{ p0 -> 0x007d }
                r4.<init>(r3)     // Catch:{ p0 -> 0x007d }
                com.google.protobuf.k r0 = (com.google.protobuf.C16994k) r0     // Catch:{ p0 -> 0x007d }
                r4.mergeFrom((com.google.protobuf.C16994k) r0)     // Catch:{ p0 -> 0x007d }
                java.lang.String r0 = "["
                r8.mo18760c(r0)
                r8.mo18760c(r2)
                java.lang.String r0 = "] {"
                r8.mo18760c(r0)
                r8.mo18758a()
                java.lang.StringBuilder r0 = r8.f46009b
                java.lang.String r2 = "  "
                r0.append(r2)
                r6.mo18761a(r4, r8)
                r8.mo18759b()
                java.lang.String r0 = "}"
                r8.mo18760c(r0)
                r8.mo18758a()
                goto L_0x007e
            L_0x007d:
                r1 = 0
            L_0x007e:
                if (r1 == 0) goto L_0x0081
                return
            L_0x0081:
                java.util.Map r0 = r7.getAllFields()
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
            L_0x008d:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x0103
                java.lang.Object r1 = r0.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.lang.Object r2 = r1.getKey()
                com.google.protobuf.t$g r2 = (com.google.protobuf.C24025t.C24035g) r2
                java.lang.Object r1 = r1.getValue()
                boolean r3 = r2.mo38341j()
                if (r3 == 0) goto L_0x00e5
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                java.util.List r1 = (java.util.List) r1
                java.util.Iterator r1 = r1.iterator()
            L_0x00b4:
                boolean r4 = r1.hasNext()
                if (r4 == 0) goto L_0x00c7
                java.lang.Object r4 = r1.next()
                com.google.protobuf.m2$c$a r5 = new com.google.protobuf.m2$c$a
                r5.<init>(r4, r2)
                r3.add(r5)
                goto L_0x00b4
            L_0x00c7:
                java.util.Collections.sort(r3)
                java.util.Iterator r1 = r3.iterator()
            L_0x00ce:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L_0x008d
                java.lang.Object r3 = r1.next()
                com.google.protobuf.m2$c$a r3 = (com.google.protobuf.C17003m2.C17007c.C17008a) r3
                com.google.protobuf.y0 r4 = r3.f46014e
                if (r4 == 0) goto L_0x00df
                goto L_0x00e1
            L_0x00df:
                java.lang.Object r4 = r3.f46013d
            L_0x00e1:
                r6.mo18762b(r2, r4, r8)
                goto L_0x00ce
            L_0x00e5:
                boolean r3 = r2.mo37662E0()
                if (r3 == 0) goto L_0x00ff
                java.util.List r1 = (java.util.List) r1
                java.util.Iterator r1 = r1.iterator()
            L_0x00f1:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L_0x008d
                java.lang.Object r3 = r1.next()
                r6.mo18762b(r2, r3, r8)
                goto L_0x00f1
            L_0x00ff:
                r6.mo18762b(r2, r1, r8)
                goto L_0x008d
            L_0x0103:
                com.google.protobuf.s2 r7 = r7.getUnknownFields()
                m16830d(r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C17003m2.C17007c.mo18761a(com.google.protobuf.m1, com.google.protobuf.m2$d):void");
        }

        /* renamed from: b */
        public final void mo18762b(C24025t.C24035g gVar, Object obj, C17006d dVar) {
            if (gVar.mo38340i()) {
                dVar.mo18760c("[");
                if (gVar.f69110n.mo38322k().f68909f && gVar.f69109j == C24025t.C24035g.C24037b.MESSAGE) {
                    C23938s.C23967h.C23970c a = C23938s.C23967h.C23970c.m29635a(gVar.f69104e.f68740g);
                    if (a == null) {
                        a = C23938s.C23967h.C23970c.LABEL_OPTIONAL;
                    }
                    if (a == C23938s.C23967h.C23970c.LABEL_OPTIONAL) {
                        if (!gVar.mo38340i()) {
                            throw new UnsupportedOperationException(String.format("This field is not an extension. (%s)", new Object[]{gVar.f69105f}));
                        } else if (gVar.f69107h == gVar.mo38339h()) {
                            dVar.mo18760c(gVar.mo38339h().f69070e);
                            dVar.mo18760c("]");
                        }
                    }
                }
                dVar.mo18760c(gVar.f69105f);
                dVar.mo18760c("]");
            } else if (gVar.f69109j == C24025t.C24035g.C24037b.GROUP) {
                dVar.mo18760c(gVar.mo38339h().getName());
            } else {
                dVar.mo18760c(gVar.getName());
            }
            C24025t.C24035g.C24036a aVar = gVar.f69109j.f69132d;
            C24025t.C24035g.C24036a aVar2 = C24025t.C24035g.C24036a.MESSAGE;
            if (aVar == aVar2) {
                dVar.mo18760c(" {");
                dVar.mo18758a();
                dVar.f46009b.append("  ");
            } else {
                dVar.mo18760c(": ");
            }
            switch (gVar.f69109j.ordinal()) {
                case 0:
                    dVar.mo18760c(((Double) obj).toString());
                    break;
                case 1:
                    dVar.mo18760c(((Float) obj).toString());
                    break;
                case 2:
                case 15:
                case 17:
                    dVar.mo18760c(((Long) obj).toString());
                    break;
                case 3:
                case 5:
                    dVar.mo18760c(C17003m2.m16825d(((Long) obj).longValue()));
                    break;
                case 4:
                case 14:
                case 16:
                    dVar.mo18760c(((Integer) obj).toString());
                    break;
                case 6:
                case 12:
                    int intValue = ((Integer) obj).intValue();
                    Logger logger = C17003m2.f46007a;
                    dVar.mo18760c(intValue >= 0 ? Integer.toString(intValue) : Long.toString(((long) intValue) & Util.MAX_32BIT_VALUE));
                    break;
                case 7:
                    dVar.mo18760c(((Boolean) obj).toString());
                    break;
                case 8:
                    dVar.mo18760c(FastJsonResponse.QUOTE);
                    dVar.mo18760c(C113385n2.m155239a(C16994k.m16791k((String) obj)));
                    dVar.mo18760c(FastJsonResponse.QUOTE);
                    break;
                case 9:
                case 10:
                    mo18761a((C23836g1) obj, dVar);
                    break;
                case 11:
                    dVar.mo18760c(FastJsonResponse.QUOTE);
                    if (obj instanceof C16994k) {
                        Logger logger2 = C17003m2.f46007a;
                        dVar.mo18760c(C113385n2.m155239a((C16994k) obj));
                    } else {
                        Logger logger3 = C17003m2.f46007a;
                        dVar.mo18760c(C113385n2.m155240b(new C113388o2((byte[]) obj)));
                    }
                    dVar.mo18760c(FastJsonResponse.QUOTE);
                    break;
                case 13:
                    dVar.mo18760c(((C24025t.C24034f) obj).getName());
                    break;
            }
            if (gVar.f69109j.f69132d == aVar2) {
                dVar.mo18759b();
                dVar.mo18760c("}");
            }
            dVar.mo18758a();
        }
    }

    static {
        int i = C17010p2.f46016b;
        C17010p2 p2Var = C17010p2.C17011a.f46018a;
    }

    /* renamed from: a */
    public static int m16822a(byte b) {
        if (48 <= b && b <= 57) {
            return b - 48;
        }
        return ((97 > b || b > 122) ? b - 65 : b - 97) + 10;
    }

    /* renamed from: b */
    public static long m16823b(String str, boolean z, boolean z2) {
        int i = 0;
        boolean z3 = true;
        if (!str.startsWith("-", 0)) {
            z3 = false;
        } else if (!z) {
            throw new NumberFormatException(str.length() != 0 ? "Number must be positive: ".concat(str) : new String("Number must be positive: "));
        } else {
            i = 1;
        }
        int i2 = 10;
        if (str.startsWith("0x", i)) {
            i += 2;
            i2 = 16;
        } else if (str.startsWith("0", i)) {
            i2 = 8;
        }
        String substring = str.substring(i);
        if (substring.length() < 16) {
            long parseLong = Long.parseLong(substring, i2);
            if (z3) {
                parseLong = -parseLong;
            }
            if (z2) {
                return parseLong;
            }
            if (z) {
                if (parseLong <= 2147483647L && parseLong >= -2147483648L) {
                    return parseLong;
                }
                throw new NumberFormatException(str.length() != 0 ? "Number out of range for 32-bit signed integer: ".concat(str) : new String("Number out of range for 32-bit signed integer: "));
            } else if (parseLong < 4294967296L && parseLong >= 0) {
                return parseLong;
            } else {
                throw new NumberFormatException(str.length() != 0 ? "Number out of range for 32-bit unsigned integer: ".concat(str) : new String("Number out of range for 32-bit unsigned integer: "));
            }
        } else {
            BigInteger bigInteger = new BigInteger(substring, i2);
            if (z3) {
                bigInteger = bigInteger.negate();
            }
            if (!z2) {
                if (z) {
                    if (bigInteger.bitLength() > 31) {
                        throw new NumberFormatException(str.length() != 0 ? "Number out of range for 32-bit signed integer: ".concat(str) : new String("Number out of range for 32-bit signed integer: "));
                    }
                } else if (bigInteger.bitLength() > 32) {
                    throw new NumberFormatException(str.length() != 0 ? "Number out of range for 32-bit unsigned integer: ".concat(str) : new String("Number out of range for 32-bit unsigned integer: "));
                }
            } else if (z) {
                if (bigInteger.bitLength() > 63) {
                    throw new NumberFormatException(str.length() != 0 ? "Number out of range for 64-bit signed integer: ".concat(str) : new String("Number out of range for 64-bit signed integer: "));
                }
            } else if (bigInteger.bitLength() > 64) {
                throw new NumberFormatException(str.length() != 0 ? "Number out of range for 64-bit unsigned integer: ".concat(str) : new String("Number out of range for 64-bit unsigned integer: "));
            }
            return bigInteger.longValue();
        }
    }

    /* renamed from: c */
    public static C16994k m16824c(CharSequence charSequence) {
        int i;
        int i2;
        int i3;
        C16994k.C17000f fVar = (C16994k.C17000f) C16994k.m16791k(charSequence.toString());
        int length = fVar.f46005g.length;
        byte[] bArr = new byte[length];
        int i4 = 0;
        int i5 = 0;
        while (true) {
            byte[] bArr2 = fVar.f46005g;
            if (i4 >= bArr2.length) {
                return length == i5 ? new C16994k.C17000f(bArr) : C16994k.m16790i(bArr, 0, i5);
            }
            byte b = bArr2[i4];
            if (b == 92) {
                i4++;
                if (i4 < bArr2.length) {
                    byte b2 = bArr2[i4];
                    if (48 <= b2 && b2 <= 55) {
                        int a = m16822a(b2);
                        int i6 = i4 + 1;
                        byte[] bArr3 = fVar.f46005g;
                        if (i6 < bArr3.length) {
                            byte b3 = bArr3[i6];
                            if (48 <= b3 && b3 <= 55) {
                                a = (a * 8) + m16822a(b3);
                                i4 = i6;
                            }
                        }
                        int i7 = i4 + 1;
                        byte[] bArr4 = fVar.f46005g;
                        if (i7 < bArr4.length) {
                            byte b4 = bArr4[i7];
                            if (48 <= b4 && b4 <= 55) {
                                a = (a * 8) + m16822a(b4);
                                i4 = i7;
                            }
                        }
                        i3 = i5 + 1;
                        bArr[i5] = (byte) a;
                    } else if (b2 == 34) {
                        i2 = i5 + 1;
                        bArr[i5] = 34;
                    } else if (b2 == 39) {
                        i2 = i5 + 1;
                        bArr[i5] = 39;
                    } else if (b2 == 92) {
                        i2 = i5 + 1;
                        bArr[i5] = 92;
                    } else if (b2 == 102) {
                        i2 = i5 + 1;
                        bArr[i5] = 12;
                    } else if (b2 == 110) {
                        i2 = i5 + 1;
                        bArr[i5] = 10;
                    } else if (b2 == 114) {
                        i2 = i5 + 1;
                        bArr[i5] = 13;
                    } else if (b2 == 116) {
                        i2 = i5 + 1;
                        bArr[i5] = 9;
                    } else if (b2 != 118) {
                        if (b2 == 120) {
                            i = i4 + 1;
                            if (i < bArr2.length) {
                                byte b5 = bArr2[i];
                                if (!((48 <= b5 && b5 <= 57) || (97 <= b5 && b5 <= 102) || (65 <= b5 && b5 <= 70))) {
                                    break;
                                }
                                int a2 = m16822a(b5);
                                int i8 = i + 1;
                                byte[] bArr5 = fVar.f46005g;
                                if (i8 < bArr5.length) {
                                    byte b6 = bArr5[i8];
                                    if ((48 <= b6 && b6 <= 57) || (97 <= b6 && b6 <= 102) || (65 <= b6 && b6 <= 70)) {
                                        a2 = (a2 * 16) + m16822a(b6);
                                        i = i8;
                                    }
                                }
                                i3 = i5 + 1;
                                bArr[i5] = (byte) a2;
                            } else {
                                break;
                            }
                        } else if (b2 == 97) {
                            i2 = i5 + 1;
                            bArr[i5] = 7;
                        } else if (b2 == 98) {
                            i2 = i5 + 1;
                            bArr[i5] = 8;
                        } else {
                            StringBuilder sb = new StringBuilder(29);
                            sb.append("Invalid escape sequence: '\\");
                            sb.append((char) b2);
                            sb.append('\'');
                            throw new C17005b(sb.toString());
                        }
                    } else {
                        i2 = i5 + 1;
                        bArr[i5] = 11;
                    }
                    i5 = i3;
                    i4 = i + 1;
                } else {
                    throw new C17005b("Invalid escape sequence: '\\' at end of string.");
                }
            } else {
                i2 = i5 + 1;
                bArr[i5] = b;
            }
            i5 = i2;
            i4 = i + 1;
        }
        throw new C17005b("Invalid escape sequence: '\\x' with no digits");
    }

    /* renamed from: d */
    public static String m16825d(long j) {
        return j >= 0 ? Long.toString(j) : BigInteger.valueOf(j & MAlarmHandler.NEXT_FIRE_INTERVAL).setBit(63).toString();
    }
}
