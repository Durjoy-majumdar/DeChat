package te3;

import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.dj0 */
public class C64314dj0 extends C101820nt3 {

    /* renamed from: A */
    public LinkedList<String> f182709A = new LinkedList<>();

    /* renamed from: B */
    public C89349b f182710B;

    /* renamed from: C */
    public b65 f182711C;

    /* renamed from: D */
    public dg4 f182712D;

    /* renamed from: E */
    public LinkedList<String> f182713E = new LinkedList<>();

    /* renamed from: F */
    public C89349b f182714F;

    /* renamed from: G */
    public int f182715G;

    /* renamed from: H */
    public C64756up2 f182716H;

    /* renamed from: I */
    public String f182717I;

    /* renamed from: J */
    public int f182718J;

    /* renamed from: K */
    public C64840xw0 f182719K;

    /* renamed from: L */
    public C50555nj3 f182720L;

    /* renamed from: M */
    public int f182721M;

    /* renamed from: d */
    public C49842ig0 f182722d;

    /* renamed from: e */
    public String f182723e;

    /* renamed from: f */
    public FinderObjectDesc f182724f;

    /* renamed from: g */
    public String f182725g;

    /* renamed from: h */
    public String f182726h;

    /* renamed from: i */
    public int f182727i;

    /* renamed from: j */
    public int f182728j;

    /* renamed from: n */
    public C89349b f182729n;

    /* renamed from: o */
    public LinkedList<C51571un1> f182730o = new LinkedList<>();

    /* renamed from: p */
    public C64848y91 f182731p;

    /* renamed from: q */
    public int f182732q;

    /* renamed from: r */
    public LinkedList<String> f182733r = new LinkedList<>();

    /* renamed from: s */
    public LinkedList<String> f182734s = new LinkedList<>();

    /* renamed from: t */
    public LinkedList<String> f182735t = new LinkedList<>();

    /* renamed from: u */
    public LinkedList<String> f182736u = new LinkedList<>();

    /* renamed from: v */
    public String f182737v;

    /* renamed from: w */
    public int f182738w;

    /* renamed from: x */
    public int f182739x;

    /* renamed from: y */
    public C50457mw0 f182740y;

    /* renamed from: z */
    public LinkedList<String> f182741z = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64314dj0)) {
            return false;
        }
        C64314dj0 dj02 = (C64314dj0) aVar;
        return C46238a.m51546a(this.BaseRequest, dj02.BaseRequest) && C46238a.m51546a(this.f182722d, dj02.f182722d) && C46238a.m51546a(this.f182723e, dj02.f182723e) && C46238a.m51546a(this.f182724f, dj02.f182724f) && C46238a.m51546a(this.f182725g, dj02.f182725g) && C46238a.m51546a(this.f182726h, dj02.f182726h) && C46238a.m51546a(Integer.valueOf(this.f182727i), Integer.valueOf(dj02.f182727i)) && C46238a.m51546a(Integer.valueOf(this.f182728j), Integer.valueOf(dj02.f182728j)) && C46238a.m51546a(this.f182729n, dj02.f182729n) && C46238a.m51546a(this.f182730o, dj02.f182730o) && C46238a.m51546a(this.f182731p, dj02.f182731p) && C46238a.m51546a(Integer.valueOf(this.f182732q), Integer.valueOf(dj02.f182732q)) && C46238a.m51546a(this.f182733r, dj02.f182733r) && C46238a.m51546a(this.f182734s, dj02.f182734s) && C46238a.m51546a(this.f182735t, dj02.f182735t) && C46238a.m51546a(this.f182736u, dj02.f182736u) && C46238a.m51546a(this.f182737v, dj02.f182737v) && C46238a.m51546a(Integer.valueOf(this.f182738w), Integer.valueOf(dj02.f182738w)) && C46238a.m51546a(Integer.valueOf(this.f182739x), Integer.valueOf(dj02.f182739x)) && C46238a.m51546a(this.f182740y, dj02.f182740y) && C46238a.m51546a(this.f182741z, dj02.f182741z) && C46238a.m51546a(this.f182709A, dj02.f182709A) && C46238a.m51546a(this.f182710B, dj02.f182710B) && C46238a.m51546a(this.f182711C, dj02.f182711C) && C46238a.m51546a(this.f182712D, dj02.f182712D) && C46238a.m51546a(this.f182713E, dj02.f182713E) && C46238a.m51546a(this.f182714F, dj02.f182714F) && C46238a.m51546a(Integer.valueOf(this.f182715G), Integer.valueOf(dj02.f182715G)) && C46238a.m51546a(this.f182716H, dj02.f182716H) && C46238a.m51546a(this.f182717I, dj02.f182717I) && C46238a.m51546a(Integer.valueOf(this.f182718J), Integer.valueOf(dj02.f182718J)) && C46238a.m51546a(this.f182719K, dj02.f182719K) && C46238a.m51546a(this.f182720L, dj02.f182720L) && C46238a.m51546a(Integer.valueOf(this.f182721M), Integer.valueOf(dj02.f182721M));
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
            C49842ig0 ig02 = this.f182722d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f182722d.writeFields(aVar);
            }
            String str = this.f182723e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            FinderObjectDesc finderObjectDesc = this.f182724f;
            if (finderObjectDesc != null) {
                aVar.mo74322i(4, finderObjectDesc.computeSize());
                this.f182724f.writeFields(aVar);
            }
            String str2 = this.f182725g;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            String str3 = this.f182726h;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            aVar.mo74318e(7, this.f182727i);
            aVar.mo74318e(8, this.f182728j);
            C89349b bVar = this.f182729n;
            if (bVar != null) {
                aVar.mo74315b(9, bVar);
            }
            aVar.mo74320g(10, 8, this.f182730o);
            C64848y91 y912 = this.f182731p;
            if (y912 != null) {
                aVar.mo74322i(11, y912.computeSize());
                this.f182731p.writeFields(aVar);
            }
            aVar.mo74318e(12, this.f182732q);
            aVar.mo74320g(13, 1, this.f182733r);
            aVar.mo74320g(14, 1, this.f182734s);
            aVar.mo74320g(15, 1, this.f182735t);
            aVar.mo74320g(16, 1, this.f182736u);
            String str4 = this.f182737v;
            if (str4 != null) {
                aVar.mo74323j(17, str4);
            }
            aVar.mo74318e(18, this.f182738w);
            aVar.mo74318e(19, this.f182739x);
            C50457mw0 mw02 = this.f182740y;
            if (mw02 != null) {
                aVar.mo74322i(20, mw02.computeSize());
                this.f182740y.writeFields(aVar);
            }
            aVar.mo74320g(21, 1, this.f182741z);
            aVar.mo74320g(22, 1, this.f182709A);
            C89349b bVar2 = this.f182710B;
            if (bVar2 != null) {
                aVar.mo74315b(23, bVar2);
            }
            b65 b65 = this.f182711C;
            if (b65 != null) {
                aVar.mo74322i(24, b65.computeSize());
                this.f182711C.writeFields(aVar);
            }
            dg4 dg4 = this.f182712D;
            if (dg4 != null) {
                aVar.mo74322i(25, dg4.computeSize());
                this.f182712D.writeFields(aVar);
            }
            aVar.mo74320g(26, 1, this.f182713E);
            C89349b bVar3 = this.f182714F;
            if (bVar3 != null) {
                aVar.mo74315b(27, bVar3);
            }
            aVar.mo74318e(28, this.f182715G);
            C64756up2 up22 = this.f182716H;
            if (up22 != null) {
                aVar.mo74322i(29, up22.computeSize());
                this.f182716H.writeFields(aVar);
            }
            String str5 = this.f182717I;
            if (str5 != null) {
                aVar.mo74323j(30, str5);
            }
            aVar.mo74318e(31, this.f182718J);
            C64840xw0 xw02 = this.f182719K;
            if (xw02 != null) {
                aVar.mo74322i(32, xw02.computeSize());
                this.f182719K.writeFields(aVar);
            }
            C50555nj3 nj32 = this.f182720L;
            if (nj32 != null) {
                aVar.mo74322i(33, nj32.computeSize());
                this.f182720L.writeFields(aVar);
            }
            aVar.mo74318e(34, this.f182721M);
            return 0;
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i3 = C52418a.m58682i(1, iaVar2.computeSize()) + 0;
            }
            C49842ig0 ig03 = this.f182722d;
            if (ig03 != null) {
                i3 += C52418a.m58682i(2, ig03.computeSize());
            }
            String str6 = this.f182723e;
            if (str6 != null) {
                i3 += C52418a.m58683j(3, str6);
            }
            FinderObjectDesc finderObjectDesc2 = this.f182724f;
            if (finderObjectDesc2 != null) {
                i3 += C52418a.m58682i(4, finderObjectDesc2.computeSize());
            }
            String str7 = this.f182725g;
            if (str7 != null) {
                i3 += C52418a.m58683j(5, str7);
            }
            String str8 = this.f182726h;
            if (str8 != null) {
                i3 += C52418a.m58683j(6, str8);
            }
            int e = i3 + C52418a.m58678e(7, this.f182727i) + C52418a.m58678e(8, this.f182728j);
            C89349b bVar4 = this.f182729n;
            if (bVar4 != null) {
                e += C52418a.m58675b(9, bVar4);
            }
            int g = e + C52418a.m58680g(10, 8, this.f182730o);
            C64848y91 y913 = this.f182731p;
            if (y913 != null) {
                g += C52418a.m58682i(11, y913.computeSize());
            }
            int e2 = g + C52418a.m58678e(12, this.f182732q) + C52418a.m58680g(13, 1, this.f182733r) + C52418a.m58680g(14, 1, this.f182734s) + C52418a.m58680g(15, 1, this.f182735t) + C52418a.m58680g(16, 1, this.f182736u);
            String str9 = this.f182737v;
            if (str9 != null) {
                e2 += C52418a.m58683j(17, str9);
            }
            int e3 = e2 + C52418a.m58678e(18, this.f182738w) + C52418a.m58678e(19, this.f182739x);
            C50457mw0 mw03 = this.f182740y;
            if (mw03 != null) {
                e3 += C52418a.m58682i(20, mw03.computeSize());
            }
            int g2 = e3 + C52418a.m58680g(21, 1, this.f182741z) + C52418a.m58680g(22, 1, this.f182709A);
            C89349b bVar5 = this.f182710B;
            if (bVar5 != null) {
                g2 += C52418a.m58675b(23, bVar5);
            }
            b65 b652 = this.f182711C;
            if (b652 != null) {
                g2 += C52418a.m58682i(24, b652.computeSize());
            }
            dg4 dg42 = this.f182712D;
            if (dg42 != null) {
                g2 += C52418a.m58682i(25, dg42.computeSize());
            }
            int g3 = g2 + C52418a.m58680g(26, 1, this.f182713E);
            C89349b bVar6 = this.f182714F;
            if (bVar6 != null) {
                g3 += C52418a.m58675b(27, bVar6);
            }
            int e4 = g3 + C52418a.m58678e(28, this.f182715G);
            C64756up2 up23 = this.f182716H;
            if (up23 != null) {
                e4 += C52418a.m58682i(29, up23.computeSize());
            }
            String str10 = this.f182717I;
            if (str10 != null) {
                e4 += C52418a.m58683j(30, str10);
            }
            int e5 = e4 + C52418a.m58678e(31, this.f182718J);
            C64840xw0 xw03 = this.f182719K;
            if (xw03 != null) {
                e5 += C52418a.m58682i(32, xw03.computeSize());
            }
            C50555nj3 nj33 = this.f182720L;
            if (nj33 != null) {
                e5 += C52418a.m58682i(33, nj33.computeSize());
            }
            return e5 + C52418a.m58678e(34, this.f182721M);
        } else if (i2 == 2) {
            this.f182730o.clear();
            this.f182733r.clear();
            this.f182734s.clear();
            this.f182735t.clear();
            this.f182736u.clear();
            this.f182741z.clear();
            this.f182709A.clear();
            this.f182713E.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C64314dj0 dj02 = objArr[1];
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
                        dj02.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C49842ig0 ig04 = new C49842ig0();
                        if (bArr2 != null && bArr2.length > 0) {
                            ig04.parseFrom(bArr2);
                        }
                        dj02.f182722d = ig04;
                    }
                    return 0;
                case 3:
                    dj02.f182723e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        FinderObjectDesc finderObjectDesc3 = new FinderObjectDesc();
                        if (bArr3 != null && bArr3.length > 0) {
                            finderObjectDesc3.parseFrom(bArr3);
                        }
                        dj02.f182724f = finderObjectDesc3;
                    }
                    return 0;
                case 5:
                    dj02.f182725g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    dj02.f182726h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    dj02.f182727i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    dj02.f182728j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    dj02.f182729n = aVar3.mo141626d(intValue);
                    return 0;
                case 10:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C51571un1 un12 = new C51571un1();
                        if (bArr4 != null && bArr4.length > 0) {
                            un12.parseFrom(bArr4);
                        }
                        dj02.f182730o.add(un12);
                    }
                    return 0;
                case 11:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C64848y91 y914 = new C64848y91();
                        if (bArr5 != null && bArr5.length > 0) {
                            y914.parseFrom(bArr5);
                        }
                        dj02.f182731p = y914;
                    }
                    return 0;
                case 12:
                    dj02.f182732q = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    dj02.f182733r.add(aVar3.mo141633k(intValue));
                    return 0;
                case 14:
                    dj02.f182734s.add(aVar3.mo141633k(intValue));
                    return 0;
                case 15:
                    dj02.f182735t.add(aVar3.mo141633k(intValue));
                    return 0;
                case 16:
                    dj02.f182736u.add(aVar3.mo141633k(intValue));
                    return 0;
                case 17:
                    dj02.f182737v = aVar3.mo141633k(intValue);
                    return 0;
                case 18:
                    dj02.f182738w = aVar3.mo141629g(intValue);
                    return 0;
                case 19:
                    dj02.f182739x = aVar3.mo141629g(intValue);
                    return 0;
                case 20:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        C50457mw0 mw04 = new C50457mw0();
                        if (bArr6 != null && bArr6.length > 0) {
                            mw04.parseFrom(bArr6);
                        }
                        dj02.f182740y = mw04;
                    }
                    return 0;
                case 21:
                    dj02.f182741z.add(aVar3.mo141633k(intValue));
                    return 0;
                case 22:
                    dj02.f182709A.add(aVar3.mo141633k(intValue));
                    return 0;
                case 23:
                    dj02.f182710B = aVar3.mo141626d(intValue);
                    return 0;
                case 24:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i15 = 0; i15 < size7; i15++) {
                        byte[] bArr7 = j7.get(i15);
                        b65 b653 = new b65();
                        if (bArr7 != null && bArr7.length > 0) {
                            b653.parseFrom(bArr7);
                        }
                        dj02.f182711C = b653;
                    }
                    return 0;
                case 25:
                    LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                    int size8 = j8.size();
                    for (int i16 = 0; i16 < size8; i16++) {
                        byte[] bArr8 = j8.get(i16);
                        dg4 dg43 = new dg4();
                        if (bArr8 != null && bArr8.length > 0) {
                            dg43.parseFrom(bArr8);
                        }
                        dj02.f182712D = dg43;
                    }
                    return 0;
                case 26:
                    dj02.f182713E.add(aVar3.mo141633k(intValue));
                    return 0;
                case 27:
                    dj02.f182714F = aVar3.mo141626d(intValue);
                    return 0;
                case 28:
                    dj02.f182715G = aVar3.mo141629g(intValue);
                    return 0;
                case 29:
                    LinkedList<byte[]> j9 = aVar3.mo141632j(intValue);
                    int size9 = j9.size();
                    for (int i17 = 0; i17 < size9; i17++) {
                        byte[] bArr9 = j9.get(i17);
                        C64756up2 up24 = new C64756up2();
                        if (bArr9 != null && bArr9.length > 0) {
                            up24.parseFrom(bArr9);
                        }
                        dj02.f182716H = up24;
                    }
                    return 0;
                case 30:
                    dj02.f182717I = aVar3.mo141633k(intValue);
                    return 0;
                case 31:
                    dj02.f182718J = aVar3.mo141629g(intValue);
                    return 0;
                case 32:
                    LinkedList<byte[]> j15 = aVar3.mo141632j(intValue);
                    int size10 = j15.size();
                    for (int i18 = 0; i18 < size10; i18++) {
                        byte[] bArr10 = j15.get(i18);
                        C64840xw0 xw04 = new C64840xw0();
                        if (bArr10 != null && bArr10.length > 0) {
                            xw04.parseFrom(bArr10);
                        }
                        dj02.f182719K = xw04;
                    }
                    return 0;
                case 33:
                    LinkedList<byte[]> j16 = aVar3.mo141632j(intValue);
                    int size11 = j16.size();
                    for (int i19 = 0; i19 < size11; i19++) {
                        byte[] bArr11 = j16.get(i19);
                        C50555nj3 nj34 = new C50555nj3();
                        if (bArr11 != null && bArr11.length > 0) {
                            nj34.parseFrom(bArr11);
                        }
                        dj02.f182720L = nj34;
                    }
                    return 0;
                case 34:
                    dj02.f182721M = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
