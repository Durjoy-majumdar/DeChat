package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.yl1 */
public class C52133yl1 extends C101820nt3 {

    /* renamed from: A */
    public C64840xw0 f145355A;

    /* renamed from: B */
    public String f145356B;

    /* renamed from: C */
    public int f145357C;

    /* renamed from: D */
    public C49868im1 f145358D;

    /* renamed from: E */
    public long f145359E;

    /* renamed from: F */
    public LinkedList<C49022cm1> f145360F = new LinkedList<>();

    /* renamed from: G */
    public int f145361G;

    /* renamed from: H */
    public String f145362H;

    /* renamed from: I */
    public C51395th0 f145363I;

    /* renamed from: J */
    public C48736am1 f145364J;

    /* renamed from: K */
    public C50185kw0 f145365K;

    /* renamed from: L */
    public C51990xl1 f145366L;

    /* renamed from: M */
    public C49304em1 f145367M;

    /* renamed from: N */
    public LinkedList<C51449tu2> f145368N = new LinkedList<>();

    /* renamed from: d */
    public C89349b f145369d;

    /* renamed from: e */
    public String f145370e;

    /* renamed from: f */
    public int f145371f;

    /* renamed from: g */
    public C49842ig0 f145372g;

    /* renamed from: h */
    public float f145373h;

    /* renamed from: i */
    public float f145374i;

    /* renamed from: j */
    public String f145375j;

    /* renamed from: n */
    public C49704hh0 f145376n;

    /* renamed from: o */
    public LinkedList<C51449tu2> f145377o = new LinkedList<>();

    /* renamed from: p */
    public int f145378p;

    /* renamed from: q */
    public int f145379q;

    /* renamed from: r */
    public long f145380r;

    /* renamed from: s */
    public String f145381s;

    /* renamed from: t */
    public LinkedList<db4> f145382t = new LinkedList<>();

    /* renamed from: u */
    public long f145383u;

    /* renamed from: v */
    public LinkedList<C49173do1> f145384v = new LinkedList<>();

    /* renamed from: w */
    public C89349b f145385w;

    /* renamed from: x */
    public int f145386x;

    /* renamed from: y */
    public String f145387y;

    /* renamed from: z */
    public C89349b f145388z;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52133yl1)) {
            return false;
        }
        C52133yl1 yl12 = (C52133yl1) aVar;
        return C46238a.m51546a(this.BaseRequest, yl12.BaseRequest) && C46238a.m51546a(this.f145369d, yl12.f145369d) && C46238a.m51546a(this.f145370e, yl12.f145370e) && C46238a.m51546a(Integer.valueOf(this.f145371f), Integer.valueOf(yl12.f145371f)) && C46238a.m51546a(this.f145372g, yl12.f145372g) && C46238a.m51546a(Float.valueOf(this.f145373h), Float.valueOf(yl12.f145373h)) && C46238a.m51546a(Float.valueOf(this.f145374i), Float.valueOf(yl12.f145374i)) && C46238a.m51546a(this.f145375j, yl12.f145375j) && C46238a.m51546a(this.f145376n, yl12.f145376n) && C46238a.m51546a(this.f145377o, yl12.f145377o) && C46238a.m51546a(Integer.valueOf(this.f145378p), Integer.valueOf(yl12.f145378p)) && C46238a.m51546a(Integer.valueOf(this.f145379q), Integer.valueOf(yl12.f145379q)) && C46238a.m51546a(Long.valueOf(this.f145380r), Long.valueOf(yl12.f145380r)) && C46238a.m51546a(this.f145381s, yl12.f145381s) && C46238a.m51546a(this.f145382t, yl12.f145382t) && C46238a.m51546a(Long.valueOf(this.f145383u), Long.valueOf(yl12.f145383u)) && C46238a.m51546a(this.f145384v, yl12.f145384v) && C46238a.m51546a(this.f145385w, yl12.f145385w) && C46238a.m51546a(Integer.valueOf(this.f145386x), Integer.valueOf(yl12.f145386x)) && C46238a.m51546a(this.f145387y, yl12.f145387y) && C46238a.m51546a(this.f145388z, yl12.f145388z) && C46238a.m51546a(this.f145355A, yl12.f145355A) && C46238a.m51546a(this.f145356B, yl12.f145356B) && C46238a.m51546a(Integer.valueOf(this.f145357C), Integer.valueOf(yl12.f145357C)) && C46238a.m51546a(this.f145358D, yl12.f145358D) && C46238a.m51546a(Long.valueOf(this.f145359E), Long.valueOf(yl12.f145359E)) && C46238a.m51546a(this.f145360F, yl12.f145360F) && C46238a.m51546a(Integer.valueOf(this.f145361G), Integer.valueOf(yl12.f145361G)) && C46238a.m51546a(this.f145362H, yl12.f145362H) && C46238a.m51546a(this.f145363I, yl12.f145363I) && C46238a.m51546a(this.f145364J, yl12.f145364J) && C46238a.m51546a(this.f145365K, yl12.f145365K) && C46238a.m51546a(this.f145366L, yl12.f145366L) && C46238a.m51546a(this.f145367M, yl12.f145367M) && C46238a.m51546a(this.f145368N, yl12.f145368N);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            C89349b bVar = this.f145369d;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            String str = this.f145370e;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            aVar.mo74318e(5, this.f145371f);
            C49842ig0 ig02 = this.f145372g;
            if (ig02 != null) {
                aVar.mo74322i(6, ig02.computeSize());
                this.f145372g.writeFields(aVar);
            }
            aVar.mo74317d(7, this.f145373h);
            aVar.mo74317d(8, this.f145374i);
            String str2 = this.f145375j;
            if (str2 != null) {
                aVar.mo74323j(9, str2);
            }
            C49704hh0 hh02 = this.f145376n;
            if (hh02 != null) {
                aVar.mo74322i(10, hh02.computeSize());
                this.f145376n.writeFields(aVar);
            }
            aVar.mo74320g(11, 8, this.f145377o);
            aVar.mo74318e(12, this.f145378p);
            aVar.mo74318e(13, this.f145379q);
            aVar.mo74321h(14, this.f145380r);
            String str3 = this.f145381s;
            if (str3 != null) {
                aVar.mo74323j(15, str3);
            }
            aVar.mo74320g(16, 8, this.f145382t);
            aVar.mo74321h(17, this.f145383u);
            aVar.mo74320g(18, 8, this.f145384v);
            C89349b bVar2 = this.f145385w;
            if (bVar2 != null) {
                aVar.mo74315b(19, bVar2);
            }
            aVar.mo74318e(20, this.f145386x);
            String str4 = this.f145387y;
            if (str4 != null) {
                aVar.mo74323j(21, str4);
            }
            C89349b bVar3 = this.f145388z;
            if (bVar3 != null) {
                aVar.mo74315b(22, bVar3);
            }
            C64840xw0 xw02 = this.f145355A;
            if (xw02 != null) {
                aVar.mo74322i(23, xw02.computeSize());
                this.f145355A.writeFields(aVar);
            }
            String str5 = this.f145356B;
            if (str5 != null) {
                aVar.mo74323j(24, str5);
            }
            aVar.mo74318e(25, this.f145357C);
            C49868im1 im12 = this.f145358D;
            if (im12 != null) {
                aVar.mo74322i(26, im12.computeSize());
                this.f145358D.writeFields(aVar);
            }
            aVar.mo74321h(27, this.f145359E);
            aVar.mo74320g(28, 8, this.f145360F);
            aVar.mo74318e(29, this.f145361G);
            String str6 = this.f145362H;
            if (str6 != null) {
                aVar.mo74323j(30, str6);
            }
            C51395th0 th02 = this.f145363I;
            if (th02 != null) {
                aVar.mo74322i(32, th02.computeSize());
                this.f145363I.writeFields(aVar);
            }
            C48736am1 am12 = this.f145364J;
            if (am12 != null) {
                aVar.mo74322i(33, am12.computeSize());
                this.f145364J.writeFields(aVar);
            }
            C50185kw0 kw02 = this.f145365K;
            if (kw02 != null) {
                aVar.mo74322i(34, kw02.computeSize());
                this.f145365K.writeFields(aVar);
            }
            C51990xl1 xl12 = this.f145366L;
            if (xl12 != null) {
                aVar.mo74322i(36, xl12.computeSize());
                this.f145366L.writeFields(aVar);
            }
            C49304em1 em12 = this.f145367M;
            if (em12 != null) {
                aVar.mo74322i(37, em12.computeSize());
                this.f145367M.writeFields(aVar);
            }
            aVar.mo74320g(38, 8, this.f145368N);
            return 0;
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i3 = C52418a.m58682i(1, iaVar2.computeSize()) + 0;
            }
            C89349b bVar4 = this.f145369d;
            if (bVar4 != null) {
                i3 += C52418a.m58675b(3, bVar4);
            }
            String str7 = this.f145370e;
            if (str7 != null) {
                i3 += C52418a.m58683j(4, str7);
            }
            int e = i3 + C52418a.m58678e(5, this.f145371f);
            C49842ig0 ig03 = this.f145372g;
            if (ig03 != null) {
                e += C52418a.m58682i(6, ig03.computeSize());
            }
            int d = e + C52418a.m58677d(7, this.f145373h) + C52418a.m58677d(8, this.f145374i);
            String str8 = this.f145375j;
            if (str8 != null) {
                d += C52418a.m58683j(9, str8);
            }
            C49704hh0 hh03 = this.f145376n;
            if (hh03 != null) {
                d += C52418a.m58682i(10, hh03.computeSize());
            }
            int g = d + C52418a.m58680g(11, 8, this.f145377o) + C52418a.m58678e(12, this.f145378p) + C52418a.m58678e(13, this.f145379q) + C52418a.m58681h(14, this.f145380r);
            String str9 = this.f145381s;
            if (str9 != null) {
                g += C52418a.m58683j(15, str9);
            }
            int g2 = g + C52418a.m58680g(16, 8, this.f145382t) + C52418a.m58681h(17, this.f145383u) + C52418a.m58680g(18, 8, this.f145384v);
            C89349b bVar5 = this.f145385w;
            if (bVar5 != null) {
                g2 += C52418a.m58675b(19, bVar5);
            }
            int e2 = g2 + C52418a.m58678e(20, this.f145386x);
            String str10 = this.f145387y;
            if (str10 != null) {
                e2 += C52418a.m58683j(21, str10);
            }
            C89349b bVar6 = this.f145388z;
            if (bVar6 != null) {
                e2 += C52418a.m58675b(22, bVar6);
            }
            C64840xw0 xw03 = this.f145355A;
            if (xw03 != null) {
                e2 += C52418a.m58682i(23, xw03.computeSize());
            }
            String str11 = this.f145356B;
            if (str11 != null) {
                e2 += C52418a.m58683j(24, str11);
            }
            int e3 = e2 + C52418a.m58678e(25, this.f145357C);
            C49868im1 im13 = this.f145358D;
            if (im13 != null) {
                e3 += C52418a.m58682i(26, im13.computeSize());
            }
            int h = e3 + C52418a.m58681h(27, this.f145359E) + C52418a.m58680g(28, 8, this.f145360F) + C52418a.m58678e(29, this.f145361G);
            String str12 = this.f145362H;
            if (str12 != null) {
                h += C52418a.m58683j(30, str12);
            }
            C51395th0 th03 = this.f145363I;
            if (th03 != null) {
                h += C52418a.m58682i(32, th03.computeSize());
            }
            C48736am1 am13 = this.f145364J;
            if (am13 != null) {
                h += C52418a.m58682i(33, am13.computeSize());
            }
            C50185kw0 kw03 = this.f145365K;
            if (kw03 != null) {
                h += C52418a.m58682i(34, kw03.computeSize());
            }
            C51990xl1 xl13 = this.f145366L;
            if (xl13 != null) {
                h += C52418a.m58682i(36, xl13.computeSize());
            }
            C49304em1 em13 = this.f145367M;
            if (em13 != null) {
                h += C52418a.m58682i(37, em13.computeSize());
            }
            return h + C52418a.m58680g(38, 8, this.f145368N);
        } else if (i2 == 2) {
            this.f145377o.clear();
            this.f145382t.clear();
            this.f145384v.clear();
            this.f145360F.clear();
            this.f145368N.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C52133yl1 yl12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C90417ia iaVar3 = new C90417ia();
                        if (bArr != null && bArr.length > 0) {
                            iaVar3.parseFrom(bArr);
                        }
                        yl12.BaseRequest = iaVar3;
                    }
                    return 0;
                case 3:
                    yl12.f145369d = aVar3.mo141626d(intValue);
                    return 0;
                case 4:
                    yl12.f145370e = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    yl12.f145371f = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C49842ig0 ig04 = new C49842ig0();
                        if (bArr2 != null && bArr2.length > 0) {
                            ig04.parseFrom(bArr2);
                        }
                        yl12.f145372g = ig04;
                    }
                    return 0;
                case 7:
                    yl12.f145373h = aVar3.mo141628f(intValue);
                    return 0;
                case 8:
                    yl12.f145374i = aVar3.mo141628f(intValue);
                    return 0;
                case 9:
                    yl12.f145375j = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C49704hh0 hh04 = new C49704hh0();
                        if (bArr3 != null && bArr3.length > 0) {
                            hh04.parseFrom(bArr3);
                        }
                        yl12.f145376n = hh04;
                    }
                    return 0;
                case 11:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C51449tu2 tu22 = new C51449tu2();
                        if (bArr4 != null && bArr4.length > 0) {
                            tu22.parseFrom(bArr4);
                        }
                        yl12.f145377o.add(tu22);
                    }
                    return 0;
                case 12:
                    yl12.f145378p = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    yl12.f145379q = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    yl12.f145380r = aVar3.mo141631i(intValue);
                    return 0;
                case 15:
                    yl12.f145381s = aVar3.mo141633k(intValue);
                    return 0;
                case 16:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        db4 db4 = new db4();
                        if (bArr5 != null && bArr5.length > 0) {
                            db4.parseFrom(bArr5);
                        }
                        yl12.f145382t.add(db4);
                    }
                    return 0;
                case 17:
                    yl12.f145383u = aVar3.mo141631i(intValue);
                    return 0;
                case 18:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        C49173do1 do12 = new C49173do1();
                        if (bArr6 != null && bArr6.length > 0) {
                            do12.parseFrom(bArr6);
                        }
                        yl12.f145384v.add(do12);
                    }
                    return 0;
                case 19:
                    yl12.f145385w = aVar3.mo141626d(intValue);
                    return 0;
                case 20:
                    yl12.f145386x = aVar3.mo141629g(intValue);
                    return 0;
                case 21:
                    yl12.f145387y = aVar3.mo141633k(intValue);
                    return 0;
                case 22:
                    yl12.f145388z = aVar3.mo141626d(intValue);
                    return 0;
                case 23:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i15 = 0; i15 < size7; i15++) {
                        byte[] bArr7 = j7.get(i15);
                        C64840xw0 xw04 = new C64840xw0();
                        if (bArr7 != null && bArr7.length > 0) {
                            xw04.parseFrom(bArr7);
                        }
                        yl12.f145355A = xw04;
                    }
                    return 0;
                case 24:
                    yl12.f145356B = aVar3.mo141633k(intValue);
                    return 0;
                case 25:
                    yl12.f145357C = aVar3.mo141629g(intValue);
                    return 0;
                case 26:
                    LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                    int size8 = j8.size();
                    for (int i16 = 0; i16 < size8; i16++) {
                        byte[] bArr8 = j8.get(i16);
                        C49868im1 im14 = new C49868im1();
                        if (bArr8 != null && bArr8.length > 0) {
                            im14.parseFrom(bArr8);
                        }
                        yl12.f145358D = im14;
                    }
                    return 0;
                case 27:
                    yl12.f145359E = aVar3.mo141631i(intValue);
                    return 0;
                case 28:
                    LinkedList<byte[]> j9 = aVar3.mo141632j(intValue);
                    int size9 = j9.size();
                    for (int i17 = 0; i17 < size9; i17++) {
                        byte[] bArr9 = j9.get(i17);
                        C49022cm1 cm12 = new C49022cm1();
                        if (bArr9 != null && bArr9.length > 0) {
                            cm12.parseFrom(bArr9);
                        }
                        yl12.f145360F.add(cm12);
                    }
                    return 0;
                case 29:
                    yl12.f145361G = aVar3.mo141629g(intValue);
                    return 0;
                case 30:
                    yl12.f145362H = aVar3.mo141633k(intValue);
                    return 0;
                case 32:
                    LinkedList<byte[]> j15 = aVar3.mo141632j(intValue);
                    int size10 = j15.size();
                    for (int i18 = 0; i18 < size10; i18++) {
                        byte[] bArr10 = j15.get(i18);
                        C51395th0 th04 = new C51395th0();
                        if (bArr10 != null && bArr10.length > 0) {
                            th04.parseFrom(bArr10);
                        }
                        yl12.f145363I = th04;
                    }
                    return 0;
                case 33:
                    LinkedList<byte[]> j16 = aVar3.mo141632j(intValue);
                    int size11 = j16.size();
                    for (int i19 = 0; i19 < size11; i19++) {
                        byte[] bArr11 = j16.get(i19);
                        C48736am1 am14 = new C48736am1();
                        if (bArr11 != null && bArr11.length > 0) {
                            am14.parseFrom(bArr11);
                        }
                        yl12.f145364J = am14;
                    }
                    return 0;
                case 34:
                    LinkedList<byte[]> j17 = aVar3.mo141632j(intValue);
                    int size12 = j17.size();
                    for (int i25 = 0; i25 < size12; i25++) {
                        byte[] bArr12 = j17.get(i25);
                        C50185kw0 kw04 = new C50185kw0();
                        if (bArr12 != null && bArr12.length > 0) {
                            kw04.parseFrom(bArr12);
                        }
                        yl12.f145365K = kw04;
                    }
                    return 0;
                case 36:
                    LinkedList<byte[]> j18 = aVar3.mo141632j(intValue);
                    int size13 = j18.size();
                    for (int i26 = 0; i26 < size13; i26++) {
                        byte[] bArr13 = j18.get(i26);
                        C51990xl1 xl14 = new C51990xl1();
                        if (bArr13 != null && bArr13.length > 0) {
                            xl14.parseFrom(bArr13);
                        }
                        yl12.f145366L = xl14;
                    }
                    return 0;
                case 37:
                    LinkedList<byte[]> j19 = aVar3.mo141632j(intValue);
                    int size14 = j19.size();
                    for (int i27 = 0; i27 < size14; i27++) {
                        byte[] bArr14 = j19.get(i27);
                        C49304em1 em14 = new C49304em1();
                        if (bArr14 != null && bArr14.length > 0) {
                            em14.parseFrom(bArr14);
                        }
                        yl12.f145367M = em14;
                    }
                    return 0;
                case 38:
                    LinkedList<byte[]> j25 = aVar3.mo141632j(intValue);
                    int size15 = j25.size();
                    for (int i28 = 0; i28 < size15; i28++) {
                        byte[] bArr15 = j25.get(i28);
                        C51449tu2 tu23 = new C51449tu2();
                        if (bArr15 != null && bArr15.length > 0) {
                            tu23.parseFrom(bArr15);
                        }
                        yl12.f145368N.add(tu23);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
