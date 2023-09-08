package te3;

import com.tencent.p014mm.protocal.protobuf.FinderContact;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ao0 */
public class C48742ao0 extends C49335eu3 {

    /* renamed from: A */
    public C64530lp2 f130663A;

    /* renamed from: B */
    public int f130664B;

    /* renamed from: C */
    public LinkedList<Integer> f130665C = new LinkedList<>();

    /* renamed from: D */
    public LinkedList<Integer> f130666D = new LinkedList<>();

    /* renamed from: E */
    public LinkedList<Integer> f130667E = new LinkedList<>();

    /* renamed from: F */
    public long f130668F;

    /* renamed from: G */
    public boolean f130669G;

    /* renamed from: H */
    public C50326ly0 f130670H;

    /* renamed from: I */
    public C51602uv0 f130671I;

    /* renamed from: J */
    public C49592gp2 f130672J;

    /* renamed from: K */
    public C50917q51 f130673K;

    /* renamed from: L */
    public C64760uw0 f130674L;

    /* renamed from: M */
    public C49063cy0 f130675M;

    /* renamed from: d */
    public LinkedList<FinderContact> f130676d = new LinkedList<>();

    /* renamed from: e */
    public LinkedList<C64674r41> f130677e = new LinkedList<>();

    /* renamed from: f */
    public C64273c21 f130678f;

    /* renamed from: g */
    public C89349b f130679g;

    /* renamed from: h */
    public int f130680h;

    /* renamed from: i */
    public int f130681i;

    /* renamed from: j */
    public int f130682j;

    /* renamed from: n */
    public C50347m31 f130683n;

    /* renamed from: o */
    public int f130684o;

    /* renamed from: p */
    public int f130685p;

    /* renamed from: q */
    public int f130686q;

    /* renamed from: r */
    public C50497n51 f130687r;

    /* renamed from: s */
    public int f130688s;

    /* renamed from: t */
    public LinkedList<C52013xs0> f130689t = new LinkedList<>();

    /* renamed from: u */
    public LinkedList<C52235z91> f130690u = new LinkedList<>();

    /* renamed from: v */
    public C48770aw0 f130691v;

    /* renamed from: w */
    public int f130692w;

    /* renamed from: x */
    public long f130693x;

    /* renamed from: y */
    public LinkedList<C48770aw0> f130694y = new LinkedList<>();

    /* renamed from: z */
    public C51463ty0 f130695z;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48742ao0)) {
            return false;
        }
        C48742ao0 ao02 = (C48742ao0) aVar;
        return C46238a.m51546a(this.BaseResponse, ao02.BaseResponse) && C46238a.m51546a(this.f130676d, ao02.f130676d) && C46238a.m51546a(this.f130677e, ao02.f130677e) && C46238a.m51546a(this.f130678f, ao02.f130678f) && C46238a.m51546a(this.f130679g, ao02.f130679g) && C46238a.m51546a(Integer.valueOf(this.f130680h), Integer.valueOf(ao02.f130680h)) && C46238a.m51546a(Integer.valueOf(this.f130681i), Integer.valueOf(ao02.f130681i)) && C46238a.m51546a(Integer.valueOf(this.f130682j), Integer.valueOf(ao02.f130682j)) && C46238a.m51546a(this.f130683n, ao02.f130683n) && C46238a.m51546a(Integer.valueOf(this.f130684o), Integer.valueOf(ao02.f130684o)) && C46238a.m51546a(Integer.valueOf(this.f130685p), Integer.valueOf(ao02.f130685p)) && C46238a.m51546a(Integer.valueOf(this.f130686q), Integer.valueOf(ao02.f130686q)) && C46238a.m51546a(this.f130687r, ao02.f130687r) && C46238a.m51546a(Integer.valueOf(this.f130688s), Integer.valueOf(ao02.f130688s)) && C46238a.m51546a(this.f130689t, ao02.f130689t) && C46238a.m51546a(this.f130690u, ao02.f130690u) && C46238a.m51546a(this.f130691v, ao02.f130691v) && C46238a.m51546a(Integer.valueOf(this.f130692w), Integer.valueOf(ao02.f130692w)) && C46238a.m51546a(Long.valueOf(this.f130693x), Long.valueOf(ao02.f130693x)) && C46238a.m51546a(this.f130694y, ao02.f130694y) && C46238a.m51546a(this.f130695z, ao02.f130695z) && C46238a.m51546a(this.f130663A, ao02.f130663A) && C46238a.m51546a(Integer.valueOf(this.f130664B), Integer.valueOf(ao02.f130664B)) && C46238a.m51546a(this.f130665C, ao02.f130665C) && C46238a.m51546a(this.f130666D, ao02.f130666D) && C46238a.m51546a(this.f130667E, ao02.f130667E) && C46238a.m51546a(Long.valueOf(this.f130668F), Long.valueOf(ao02.f130668F)) && C46238a.m51546a(Boolean.valueOf(this.f130669G), Boolean.valueOf(ao02.f130669G)) && C46238a.m51546a(this.f130670H, ao02.f130670H) && C46238a.m51546a(this.f130671I, ao02.f130671I) && C46238a.m51546a(this.f130672J, ao02.f130672J) && C46238a.m51546a(this.f130673K, ao02.f130673K) && C46238a.m51546a(this.f130674L, ao02.f130674L) && C46238a.m51546a(this.f130675M, ao02.f130675M);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                aVar.mo74322i(1, jaVar.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            aVar.mo74320g(2, 8, this.f130676d);
            aVar.mo74320g(3, 8, this.f130677e);
            C64273c21 c212 = this.f130678f;
            if (c212 != null) {
                aVar.mo74322i(4, c212.computeSize());
                this.f130678f.writeFields(aVar);
            }
            C89349b bVar = this.f130679g;
            if (bVar != null) {
                aVar.mo74315b(5, bVar);
            }
            aVar.mo74318e(6, this.f130680h);
            aVar.mo74318e(7, this.f130681i);
            aVar.mo74318e(8, this.f130682j);
            C50347m31 m312 = this.f130683n;
            if (m312 != null) {
                aVar.mo74322i(9, m312.computeSize());
                this.f130683n.writeFields(aVar);
            }
            aVar.mo74318e(10, this.f130684o);
            aVar.mo74318e(11, this.f130685p);
            aVar.mo74318e(12, this.f130686q);
            C50497n51 n512 = this.f130687r;
            if (n512 != null) {
                aVar.mo74322i(13, n512.computeSize());
                this.f130687r.writeFields(aVar);
            }
            aVar.mo74318e(14, this.f130688s);
            aVar.mo74320g(15, 8, this.f130689t);
            aVar.mo74320g(16, 8, this.f130690u);
            C48770aw0 aw02 = this.f130691v;
            if (aw02 != null) {
                aVar.mo74322i(17, aw02.computeSize());
                this.f130691v.writeFields(aVar);
            }
            aVar.mo74318e(18, this.f130692w);
            aVar.mo74321h(19, this.f130693x);
            aVar.mo74320g(20, 8, this.f130694y);
            C51463ty0 ty02 = this.f130695z;
            if (ty02 != null) {
                aVar.mo74322i(21, ty02.computeSize());
                this.f130695z.writeFields(aVar);
            }
            C64530lp2 lp22 = this.f130663A;
            if (lp22 != null) {
                aVar.mo74322i(22, lp22.computeSize());
                this.f130663A.writeFields(aVar);
            }
            aVar.mo74318e(23, this.f130664B);
            aVar.mo74320g(24, 2, this.f130665C);
            aVar.mo74320g(25, 2, this.f130666D);
            aVar.mo74320g(26, 2, this.f130667E);
            aVar.mo74321h(27, this.f130668F);
            aVar.mo74314a(28, this.f130669G);
            C50326ly0 ly02 = this.f130670H;
            if (ly02 != null) {
                aVar.mo74322i(29, ly02.computeSize());
                this.f130670H.writeFields(aVar);
            }
            C51602uv0 uv02 = this.f130671I;
            if (uv02 != null) {
                aVar.mo74322i(33, uv02.computeSize());
                this.f130671I.writeFields(aVar);
            }
            C49592gp2 gp22 = this.f130672J;
            if (gp22 != null) {
                aVar.mo74322i(34, gp22.computeSize());
                this.f130672J.writeFields(aVar);
            }
            C50917q51 q512 = this.f130673K;
            if (q512 != null) {
                aVar.mo74322i(36, q512.computeSize());
                this.f130673K.writeFields(aVar);
            }
            C64760uw0 uw02 = this.f130674L;
            if (uw02 != null) {
                aVar.mo74322i(37, uw02.computeSize());
                this.f130674L.writeFields(aVar);
            }
            C49063cy0 cy02 = this.f130675M;
            if (cy02 != null) {
                aVar.mo74322i(38, cy02.computeSize());
                this.f130675M.writeFields(aVar);
            }
            return 0;
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            int g = i3 + C52418a.m58680g(2, 8, this.f130676d) + C52418a.m58680g(3, 8, this.f130677e);
            C64273c21 c213 = this.f130678f;
            if (c213 != null) {
                g += C52418a.m58682i(4, c213.computeSize());
            }
            C89349b bVar2 = this.f130679g;
            if (bVar2 != null) {
                g += C52418a.m58675b(5, bVar2);
            }
            int e = g + C52418a.m58678e(6, this.f130680h) + C52418a.m58678e(7, this.f130681i) + C52418a.m58678e(8, this.f130682j);
            C50347m31 m313 = this.f130683n;
            if (m313 != null) {
                e += C52418a.m58682i(9, m313.computeSize());
            }
            int e2 = e + C52418a.m58678e(10, this.f130684o) + C52418a.m58678e(11, this.f130685p) + C52418a.m58678e(12, this.f130686q);
            C50497n51 n513 = this.f130687r;
            if (n513 != null) {
                e2 += C52418a.m58682i(13, n513.computeSize());
            }
            int e3 = e2 + C52418a.m58678e(14, this.f130688s) + C52418a.m58680g(15, 8, this.f130689t) + C52418a.m58680g(16, 8, this.f130690u);
            C48770aw0 aw03 = this.f130691v;
            if (aw03 != null) {
                e3 += C52418a.m58682i(17, aw03.computeSize());
            }
            int e4 = e3 + C52418a.m58678e(18, this.f130692w) + C52418a.m58681h(19, this.f130693x) + C52418a.m58680g(20, 8, this.f130694y);
            C51463ty0 ty03 = this.f130695z;
            if (ty03 != null) {
                e4 += C52418a.m58682i(21, ty03.computeSize());
            }
            C64530lp2 lp23 = this.f130663A;
            if (lp23 != null) {
                e4 += C52418a.m58682i(22, lp23.computeSize());
            }
            int e5 = e4 + C52418a.m58678e(23, this.f130664B) + C52418a.m58680g(24, 2, this.f130665C) + C52418a.m58680g(25, 2, this.f130666D) + C52418a.m58680g(26, 2, this.f130667E) + C52418a.m58681h(27, this.f130668F) + C52418a.m58674a(28, this.f130669G);
            C50326ly0 ly03 = this.f130670H;
            if (ly03 != null) {
                e5 += C52418a.m58682i(29, ly03.computeSize());
            }
            C51602uv0 uv03 = this.f130671I;
            if (uv03 != null) {
                e5 += C52418a.m58682i(33, uv03.computeSize());
            }
            C49592gp2 gp23 = this.f130672J;
            if (gp23 != null) {
                e5 += C52418a.m58682i(34, gp23.computeSize());
            }
            C50917q51 q513 = this.f130673K;
            if (q513 != null) {
                e5 += C52418a.m58682i(36, q513.computeSize());
            }
            C64760uw0 uw03 = this.f130674L;
            if (uw03 != null) {
                e5 += C52418a.m58682i(37, uw03.computeSize());
            }
            C49063cy0 cy03 = this.f130675M;
            return cy03 != null ? e5 + C52418a.m58682i(38, cy03.computeSize()) : e5;
        } else if (i2 == 2) {
            this.f130676d.clear();
            this.f130677e.clear();
            this.f130689t.clear();
            this.f130690u.clear();
            this.f130694y.clear();
            this.f130665C.clear();
            this.f130666D.clear();
            this.f130667E.clear();
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
            C48742ao0 ao02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C49966ja jaVar3 = new C49966ja();
                        if (bArr != null && bArr.length > 0) {
                            jaVar3.parseFrom(bArr);
                        }
                        ao02.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        FinderContact finderContact = new FinderContact();
                        if (bArr2 != null && bArr2.length > 0) {
                            finderContact.parseFrom(bArr2);
                        }
                        ao02.f130676d.add(finderContact);
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C64674r41 r412 = new C64674r41();
                        if (bArr3 != null && bArr3.length > 0) {
                            r412.parseFrom(bArr3);
                        }
                        ao02.f130677e.add(r412);
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C64273c21 c214 = new C64273c21();
                        if (bArr4 != null && bArr4.length > 0) {
                            c214.parseFrom(bArr4);
                        }
                        ao02.f130678f = c214;
                    }
                    return 0;
                case 5:
                    ao02.f130679g = aVar3.mo141626d(intValue);
                    return 0;
                case 6:
                    ao02.f130680h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    ao02.f130681i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    ao02.f130682j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C50347m31 m314 = new C50347m31();
                        if (bArr5 != null && bArr5.length > 0) {
                            m314.parseFrom(bArr5);
                        }
                        ao02.f130683n = m314;
                    }
                    return 0;
                case 10:
                    ao02.f130684o = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    ao02.f130685p = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    ao02.f130686q = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        C50497n51 n514 = new C50497n51();
                        if (bArr6 != null && bArr6.length > 0) {
                            n514.parseFrom(bArr6);
                        }
                        ao02.f130687r = n514;
                    }
                    return 0;
                case 14:
                    ao02.f130688s = aVar3.mo141629g(intValue);
                    return 0;
                case 15:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i15 = 0; i15 < size7; i15++) {
                        byte[] bArr7 = j7.get(i15);
                        C52013xs0 xs02 = new C52013xs0();
                        if (bArr7 != null && bArr7.length > 0) {
                            xs02.parseFrom(bArr7);
                        }
                        ao02.f130689t.add(xs02);
                    }
                    return 0;
                case 16:
                    LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                    int size8 = j8.size();
                    for (int i16 = 0; i16 < size8; i16++) {
                        byte[] bArr8 = j8.get(i16);
                        C52235z91 z912 = new C52235z91();
                        if (bArr8 != null && bArr8.length > 0) {
                            z912.parseFrom(bArr8);
                        }
                        ao02.f130690u.add(z912);
                    }
                    return 0;
                case 17:
                    LinkedList<byte[]> j9 = aVar3.mo141632j(intValue);
                    int size9 = j9.size();
                    for (int i17 = 0; i17 < size9; i17++) {
                        byte[] bArr9 = j9.get(i17);
                        C48770aw0 aw04 = new C48770aw0();
                        if (bArr9 != null && bArr9.length > 0) {
                            aw04.parseFrom(bArr9);
                        }
                        ao02.f130691v = aw04;
                    }
                    return 0;
                case 18:
                    ao02.f130692w = aVar3.mo141629g(intValue);
                    return 0;
                case 19:
                    ao02.f130693x = aVar3.mo141631i(intValue);
                    return 0;
                case 20:
                    LinkedList<byte[]> j15 = aVar3.mo141632j(intValue);
                    int size10 = j15.size();
                    for (int i18 = 0; i18 < size10; i18++) {
                        byte[] bArr10 = j15.get(i18);
                        C48770aw0 aw05 = new C48770aw0();
                        if (bArr10 != null && bArr10.length > 0) {
                            aw05.parseFrom(bArr10);
                        }
                        ao02.f130694y.add(aw05);
                    }
                    return 0;
                case 21:
                    LinkedList<byte[]> j16 = aVar3.mo141632j(intValue);
                    int size11 = j16.size();
                    for (int i19 = 0; i19 < size11; i19++) {
                        byte[] bArr11 = j16.get(i19);
                        C51463ty0 ty04 = new C51463ty0();
                        if (bArr11 != null && bArr11.length > 0) {
                            ty04.parseFrom(bArr11);
                        }
                        ao02.f130695z = ty04;
                    }
                    return 0;
                case 22:
                    LinkedList<byte[]> j17 = aVar3.mo141632j(intValue);
                    int size12 = j17.size();
                    for (int i25 = 0; i25 < size12; i25++) {
                        byte[] bArr12 = j17.get(i25);
                        C64530lp2 lp24 = new C64530lp2();
                        if (bArr12 != null && bArr12.length > 0) {
                            lp24.parseFrom(bArr12);
                        }
                        ao02.f130663A = lp24;
                    }
                    return 0;
                case 23:
                    ao02.f130664B = aVar3.mo141629g(intValue);
                    return 0;
                case 24:
                    ao02.f130665C.add(Integer.valueOf(aVar3.mo141629g(intValue)));
                    return 0;
                case 25:
                    ao02.f130666D.add(Integer.valueOf(aVar3.mo141629g(intValue)));
                    return 0;
                case 26:
                    ao02.f130667E.add(Integer.valueOf(aVar3.mo141629g(intValue)));
                    return 0;
                case 27:
                    ao02.f130668F = aVar3.mo141631i(intValue);
                    return 0;
                case 28:
                    ao02.f130669G = aVar3.mo141625c(intValue);
                    return 0;
                case 29:
                    LinkedList<byte[]> j18 = aVar3.mo141632j(intValue);
                    int size13 = j18.size();
                    for (int i26 = 0; i26 < size13; i26++) {
                        byte[] bArr13 = j18.get(i26);
                        C50326ly0 ly04 = new C50326ly0();
                        if (bArr13 != null && bArr13.length > 0) {
                            ly04.parseFrom(bArr13);
                        }
                        ao02.f130670H = ly04;
                    }
                    return 0;
                case 33:
                    LinkedList<byte[]> j19 = aVar3.mo141632j(intValue);
                    int size14 = j19.size();
                    for (int i27 = 0; i27 < size14; i27++) {
                        byte[] bArr14 = j19.get(i27);
                        C51602uv0 uv04 = new C51602uv0();
                        if (bArr14 != null && bArr14.length > 0) {
                            uv04.parseFrom(bArr14);
                        }
                        ao02.f130671I = uv04;
                    }
                    return 0;
                case 34:
                    LinkedList<byte[]> j25 = aVar3.mo141632j(intValue);
                    int size15 = j25.size();
                    for (int i28 = 0; i28 < size15; i28++) {
                        byte[] bArr15 = j25.get(i28);
                        C49592gp2 gp24 = new C49592gp2();
                        if (bArr15 != null && bArr15.length > 0) {
                            gp24.parseFrom(bArr15);
                        }
                        ao02.f130672J = gp24;
                    }
                    return 0;
                case 36:
                    LinkedList<byte[]> j26 = aVar3.mo141632j(intValue);
                    int size16 = j26.size();
                    for (int i29 = 0; i29 < size16; i29++) {
                        byte[] bArr16 = j26.get(i29);
                        C50917q51 q514 = new C50917q51();
                        if (bArr16 != null && bArr16.length > 0) {
                            q514.parseFrom(bArr16);
                        }
                        ao02.f130673K = q514;
                    }
                    return 0;
                case 37:
                    LinkedList<byte[]> j27 = aVar3.mo141632j(intValue);
                    int size17 = j27.size();
                    for (int i35 = 0; i35 < size17; i35++) {
                        byte[] bArr17 = j27.get(i35);
                        C64760uw0 uw04 = new C64760uw0();
                        if (bArr17 != null && bArr17.length > 0) {
                            uw04.parseFrom(bArr17);
                        }
                        ao02.f130674L = uw04;
                    }
                    return 0;
                case 38:
                    LinkedList<byte[]> j28 = aVar3.mo141632j(intValue);
                    int size18 = j28.size();
                    for (int i36 = 0; i36 < size18; i36++) {
                        byte[] bArr18 = j28.get(i36);
                        C49063cy0 cy04 = new C49063cy0();
                        if (bArr18 != null && bArr18.length > 0) {
                            cy04.parseFrom(bArr18);
                        }
                        ao02.f130675M = cy04;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
