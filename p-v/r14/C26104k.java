package r14;

import gy3.C87412m;
import l14.C24950a;
import n14.C25217e;
import o14.C25344a;
import o14.C25346c;
import q14.C110346e;
import q14.C25537a;
import q14.C25539c;
import s14.C26160b;
import z04.C91602g0;

/* renamed from: r14.k */
public final class C26104k extends C25344a implements C25539c {

    /* renamed from: a */
    public final C26160b f72969a;

    /* renamed from: b */
    public int f72970b = -1;

    /* renamed from: c */
    public final C26096c f72971c;

    /* renamed from: d */
    public final C25537a f72972d;

    /* renamed from: e */
    public final C26107n f72973e;

    /* renamed from: f */
    public final C26098e f72974f;

    public C26104k(C25537a aVar, C26107n nVar, C26098e eVar) {
        C87412m.m108594g(aVar, "json");
        C87412m.m108594g(nVar, "mode");
        C87412m.m108594g(eVar, "reader");
        this.f72972d = aVar;
        this.f72973e = nVar;
        this.f72974f = eVar;
        C26096c cVar = aVar.f72231a;
        this.f72969a = cVar.f72947k;
        this.f72971c = cVar;
    }

    /* renamed from: a */
    public void mo52508a(C25217e eVar) {
        C87412m.m108594g(eVar, "descriptor");
        C26107n nVar = this.f72973e;
        if (nVar.f72995g != 0) {
            C26098e eVar2 = this.f72974f;
            if (eVar2.f72951b == nVar.f72993e) {
                eVar2.mo52962g();
                return;
            }
            eVar2.mo52959c("Expected '" + this.f72973e.f72995g + '\'', eVar2.f72952c);
            throw null;
        }
    }

    /* renamed from: b */
    public C25346c mo52515b(C25217e eVar) {
        C87412m.m108594g(eVar, "descriptor");
        C26107n a = C26108o.m33516a(this.f72972d, eVar);
        if (a.f72994f != 0) {
            C26098e eVar2 = this.f72974f;
            if (eVar2.f72951b == a.f72992d) {
                eVar2.mo52962g();
            } else {
                eVar2.mo52959c("Expected '" + a.f72994f + ", kind: " + eVar.mo52323f() + '\'', eVar2.f72952c);
                throw null;
            }
        }
        int ordinal = a.ordinal();
        return (ordinal == 1 || ordinal == 2 || ordinal == 3) ? new C26104k(this.f72972d, a, this.f72974f) : this.f72973e == a ? this : new C26104k(this.f72972d, a, this.f72974f);
    }

    /* renamed from: c */
    public C26160b mo52509c() {
        return this.f72969a;
    }

    /* renamed from: d */
    public Void mo52491d() {
        C26098e eVar = this.f72974f;
        if (eVar.f72951b == 10) {
            eVar.mo52962g();
            return null;
        }
        eVar.mo52959c("Expected 'null' literal", eVar.f72952c);
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ab, code lost:
        if (r13.mo52329k(r10) == -3) goto L_0x00ad;
     */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x00b4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b2  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo52510e(n14.C25217e r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            java.lang.String r2 = "descriptor"
            gy3.C87412m.m108594g(r1, r2)
            r14.e r2 = r0.f72974f
            byte r3 = r2.f72951b
            r4 = 4
            r5 = -1
            r6 = 0
            r7 = 0
            r8 = 1
            if (r3 != r4) goto L_0x0029
            int r9 = r0.f72970b
            if (r9 == r5) goto L_0x001a
            r9 = 1
            goto L_0x001b
        L_0x001a:
            r9 = 0
        L_0x001b:
            int r10 = r2.f72950a
            if (r9 == 0) goto L_0x0023
            r2.mo52962g()
            goto L_0x0029
        L_0x0023:
            java.lang.String r1 = "Unexpected leading comma"
            r2.mo52959c(r1, r10)
            throw r7
        L_0x0029:
            r14.n r2 = r0.f72973e
            int r2 = r2.ordinal()
            java.lang.String r9 = "Unexpected trailing comma"
            if (r2 == r8) goto L_0x01cf
            r10 = 5
            r11 = 2
            if (r2 == r11) goto L_0x0183
            r12 = 3
            if (r2 == r12) goto L_0x0172
            if (r3 != r4) goto L_0x004b
            r14.e r2 = r0.f72974f
            boolean r2 = r2.mo52961f()
            if (r2 == 0) goto L_0x0045
            goto L_0x004b
        L_0x0045:
            r14.e r1 = r0.f72974f
            r14.C26098e.m33448d(r1, r9, r6, r11, r7)
            throw r7
        L_0x004b:
            r14.e r2 = r0.f72974f
            boolean r2 = r2.mo52961f()
            if (r2 == 0) goto L_0x0202
            int r2 = r0.f72970b
            int r2 = r2 + r8
            r0.f72970b = r2
            java.lang.String r2 = r16.mo52494p()
            r14.e r3 = r0.f72974f
            byte r12 = r3.f72951b
            if (r12 != r10) goto L_0x016a
            r3.mo52962g()
            int r3 = r1.mo52329k(r2)
            r12 = -3
            if (r3 == r12) goto L_0x00b7
            r14.c r13 = r0.f72971c
            boolean r13 = r13.f72943g
            if (r13 == 0) goto L_0x00b4
            n14.e r13 = r1.mo52330l(r3)
            r14.e r14 = r0.f72974f
            byte r14 = r14.f72951b
            r15 = 10
            if (r14 != r15) goto L_0x0085
            boolean r14 = r13.mo52324g()
            if (r14 != 0) goto L_0x0085
            goto L_0x00ad
        L_0x0085:
            n14.i r14 = r13.mo52323f()
            n14.i$b r15 = n14.C25223i.C25225b.f71695a
            boolean r14 = gy3.C87412m.m108589b(r14, r15)
            if (r14 == 0) goto L_0x00af
            r14.e r14 = r0.f72974f
            r14.c r15 = r0.f72971c
            boolean r15 = r15.f72939c
            byte r10 = r14.f72951b
            if (r10 == r8) goto L_0x00a1
            if (r15 == 0) goto L_0x009f
            if (r10 == 0) goto L_0x00a1
        L_0x009f:
            r10 = r7
            goto L_0x00a5
        L_0x00a1:
            java.lang.String r10 = r14.mo52964i(r6)
        L_0x00a5:
            if (r10 == 0) goto L_0x00af
            int r10 = r13.mo52329k(r10)
            if (r10 != r12) goto L_0x00af
        L_0x00ad:
            r10 = 1
            goto L_0x00b0
        L_0x00af:
            r10 = 0
        L_0x00b0:
            if (r10 == 0) goto L_0x00b4
            r3 = 0
            goto L_0x00b8
        L_0x00b4:
            r5 = r3
            goto L_0x0202
        L_0x00b7:
            r3 = 1
        L_0x00b8:
            if (r3 == 0) goto L_0x00e2
            r14.c r3 = r0.f72971c
            boolean r3 = r3.f72938b
            if (r3 == 0) goto L_0x00c1
            goto L_0x00e2
        L_0x00c1:
            r14.e r1 = r0.f72974f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Encountered an unknown key '"
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = "'. You can enable 'JsonBuilder.ignoreUnknownKeys' property"
            r3.append(r2)
            java.lang.String r2 = " to ignore unknown keys"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r14.C26098e.m33448d(r1, r2, r6, r11, r7)
            throw r7
        L_0x00e2:
            r14.e r2 = r0.f72974f
            byte r3 = r2.f72951b
            r10 = 8
            r12 = 6
            if (r3 == r12) goto L_0x00f1
            if (r3 == r10) goto L_0x00f1
            r2.mo52962g()
            goto L_0x014d
        L_0x00f1:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
        L_0x00f6:
            byte r3 = r2.f72951b
            switch(r3) {
                case 6: goto L_0x013c;
                case 7: goto L_0x011c;
                case 8: goto L_0x013c;
                case 9: goto L_0x00fc;
                default: goto L_0x00fb;
            }
        L_0x00fb:
            goto L_0x0143
        L_0x00fc:
            java.lang.Object r3 = sx3.C110818d0.m150923U(r13)
            java.lang.Number r3 = (java.lang.Number) r3
            byte r3 = r3.byteValue()
            if (r3 != r10) goto L_0x0111
            int r3 = r13.size()
            int r3 = r3 + r5
            r13.remove(r3)
            goto L_0x0143
        L_0x0111:
            int r1 = r2.f72950a
            java.lang.String r2 = r2.f72956g
            java.lang.String r3 = "found ] instead of }"
            q14.d r1 = q14.C25541i.m33035c(r1, r3, r2)
            throw r1
        L_0x011c:
            java.lang.Object r3 = sx3.C110818d0.m150923U(r13)
            java.lang.Number r3 = (java.lang.Number) r3
            byte r3 = r3.byteValue()
            if (r3 != r12) goto L_0x0131
            int r3 = r13.size()
            int r3 = r3 + r5
            r13.remove(r3)
            goto L_0x0143
        L_0x0131:
            int r1 = r2.f72950a
            java.lang.String r2 = r2.f72956g
            java.lang.String r3 = "found } instead of ]"
            q14.d r1 = q14.C25541i.m33035c(r1, r3, r2)
            throw r1
        L_0x013c:
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            r13.add(r3)
        L_0x0143:
            r2.mo52962g()
            boolean r3 = r13.isEmpty()
            r3 = r3 ^ r8
            if (r3 != 0) goto L_0x00f6
        L_0x014d:
            r14.e r2 = r0.f72974f
            byte r3 = r2.f72951b
            if (r3 != r4) goto L_0x0167
            r2.mo52962g()
            r14.e r2 = r0.f72974f
            boolean r3 = r2.mo52961f()
            r14.e r10 = r0.f72974f
            int r10 = r10.f72950a
            if (r3 == 0) goto L_0x0163
            goto L_0x0167
        L_0x0163:
            r2.mo52959c(r9, r10)
            throw r7
        L_0x0167:
            r10 = 5
            goto L_0x004b
        L_0x016a:
            int r1 = r3.f72952c
            java.lang.String r2 = "Expected ':'"
            r3.mo52959c(r2, r1)
            throw r7
        L_0x0172:
            int r1 = r0.f72970b
            int r1 = r1 + r8
            r0.f72970b = r1
            if (r1 == 0) goto L_0x0180
            if (r1 == r8) goto L_0x017d
            goto L_0x0202
        L_0x017d:
            r5 = 1
            goto L_0x0202
        L_0x0180:
            r5 = 0
            goto L_0x0202
        L_0x0183:
            if (r3 == r4) goto L_0x019a
            int r1 = r0.f72970b
            int r1 = r1 % r11
            if (r1 != r8) goto L_0x019a
            r14.e r1 = r0.f72974f
            r2 = 7
            byte r10 = r1.f72951b
            if (r10 != r2) goto L_0x0192
            goto L_0x019a
        L_0x0192:
            int r2 = r1.f72952c
            java.lang.String r3 = "Expected end of the object or comma"
            r1.mo52959c(r3, r2)
            throw r7
        L_0x019a:
            int r1 = r0.f72970b
            int r1 = r1 % r11
            if (r1 != 0) goto L_0x01b2
            r14.e r1 = r0.f72974f
            byte r2 = r1.f72951b
            r10 = 5
            if (r2 != r10) goto L_0x01aa
            r1.mo52962g()
            goto L_0x01b2
        L_0x01aa:
            int r2 = r1.f72952c
            java.lang.String r3 = "Expected ':' after the key"
            r1.mo52959c(r3, r2)
            throw r7
        L_0x01b2:
            r14.e r1 = r0.f72974f
            boolean r1 = r1.mo52961f()
            if (r1 != 0) goto L_0x01c8
            r14.e r1 = r0.f72974f
            if (r3 == r4) goto L_0x01bf
            r6 = 1
        L_0x01bf:
            int r2 = r1.f72950a
            if (r6 == 0) goto L_0x01c4
            goto L_0x0202
        L_0x01c4:
            r1.mo52959c(r9, r2)
            throw r7
        L_0x01c8:
            int r1 = r0.f72970b
            int r5 = r1 + 1
            r0.f72970b = r5
            goto L_0x0202
        L_0x01cf:
            if (r3 == r4) goto L_0x01e6
            int r1 = r0.f72970b
            if (r1 == r5) goto L_0x01e6
            r14.e r1 = r0.f72974f
            r2 = 9
            byte r10 = r1.f72951b
            if (r10 != r2) goto L_0x01de
            goto L_0x01e6
        L_0x01de:
            int r2 = r1.f72952c
            java.lang.String r3 = "Expected end of the array or comma"
            r1.mo52959c(r3, r2)
            throw r7
        L_0x01e6:
            r14.e r1 = r0.f72974f
            boolean r1 = r1.mo52961f()
            if (r1 != 0) goto L_0x01fc
            r14.e r1 = r0.f72974f
            if (r3 == r4) goto L_0x01f3
            r6 = 1
        L_0x01f3:
            int r2 = r1.f72950a
            if (r6 == 0) goto L_0x01f8
            goto L_0x0202
        L_0x01f8:
            r1.mo52959c(r9, r2)
            throw r7
        L_0x01fc:
            int r1 = r0.f72970b
            int r5 = r1 + 1
            r0.f72970b = r5
        L_0x0202:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: r14.C26104k.mo52510e(n14.e):int");
    }

    /* renamed from: f */
    public double mo52516f() {
        try {
            return Double.parseDouble(this.f72974f.mo52963h());
        } catch (Throwable unused) {
            C26098e.m33448d(this.f72974f, "Failed to parse 'double'", 0, 2, (Object) null);
            throw null;
        }
    }

    /* renamed from: h */
    public C110346e mo52777h() {
        return new C26097d(this.f72972d.f72231a, this.f72974f).mo52955a();
    }

    /* renamed from: j */
    public byte mo52517j() {
        try {
            return Byte.parseByte(this.f72974f.mo52963h());
        } catch (Throwable unused) {
            C26098e.m33448d(this.f72974f, "Failed to parse 'byte'", 0, 2, (Object) null);
            throw null;
        }
    }

    /* renamed from: k */
    public long mo52518k() {
        try {
            return Long.parseLong(this.f72974f.mo52963h());
        } catch (Throwable unused) {
            C26098e.m33448d(this.f72974f, "Failed to parse 'long'", 0, 2, (Object) null);
            throw null;
        }
    }

    /* renamed from: l */
    public int mo52511l(C25217e eVar) {
        C87412m.m108594g(eVar, "descriptor");
        return -1;
    }

    /* renamed from: m */
    public boolean mo52512m() {
        return false;
    }

    /* renamed from: n */
    public short mo52519n() {
        try {
            return Short.parseShort(this.f72974f.mo52963h());
        } catch (Throwable unused) {
            C26098e.m33448d(this.f72974f, "Failed to parse 'short'", 0, 2, (Object) null);
            throw null;
        }
    }

    /* renamed from: o */
    public char mo52520o() {
        try {
            return C91602g0.m114946n0(this.f72974f.mo52963h());
        } catch (Throwable unused) {
            C26098e.m33448d(this.f72974f, "Failed to parse 'char'", 0, 2, (Object) null);
            throw null;
        }
    }

    /* renamed from: p */
    public String mo52494p() {
        return this.f72971c.f72939c ? this.f72974f.mo52963h() : this.f72974f.mo52965j();
    }

    /* renamed from: s */
    public int mo52497s() {
        try {
            return Integer.parseInt(this.f72974f.mo52963h());
        } catch (Throwable unused) {
            C26098e.m33448d(this.f72974f, "Failed to parse 'int'", 0, 2, (Object) null);
            throw null;
        }
    }

    /* renamed from: t */
    public float mo52521t() {
        try {
            return Float.parseFloat(this.f72974f.mo52963h());
        } catch (Throwable unused) {
            C26098e.m33448d(this.f72974f, "Failed to parse 'float'", 0, 2, (Object) null);
            throw null;
        }
    }

    /* renamed from: u */
    public boolean mo52522u() {
        if (this.f72971c.f72939c) {
            return C89864m.m112380b(this.f72974f.mo52963h());
        }
        C26098e eVar = this.f72974f;
        if (eVar.f72951b == 0) {
            return C89864m.m112380b(eVar.mo52964i(true));
        }
        eVar.mo52959c("Expected start of the unquoted boolean literal. Use 'JsonBuilder.isLenient = true' to accept non-compliant JSON", eVar.f72952c);
        throw null;
    }

    /* renamed from: v */
    public <T> T mo52498v(C24950a<T> aVar) {
        C87412m.m108594g(aVar, "deserializer");
        return C26103j.m33474a(this, aVar);
    }

    /* renamed from: w */
    public boolean mo52499w() {
        return this.f72974f.f72951b != 10;
    }

    /* renamed from: x */
    public C25537a mo52778x() {
        return this.f72972d;
    }
}
