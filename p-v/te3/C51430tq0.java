package te3;

import com.tencent.p014mm.protocal.protobuf.FinderContact;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.tq0 */
public class C51430tq0 extends C49335eu3 {

    /* renamed from: A */
    public C51252sj0 f142325A;

    /* renamed from: B */
    public String f142326B;

    /* renamed from: C */
    public LinkedList<C51248si0> f142327C = new LinkedList<>();

    /* renamed from: D */
    public LinkedList<C49692he1> f142328D = new LinkedList<>();

    /* renamed from: E */
    public String f142329E;

    /* renamed from: F */
    public String f142330F;

    /* renamed from: G */
    public int f142331G;

    /* renamed from: H */
    public C49300el1 f142332H;

    /* renamed from: I */
    public C49002ch0 f142333I;

    /* renamed from: J */
    public LinkedList<C48860bi0> f142334J = new LinkedList<>();

    /* renamed from: K */
    public LinkedList<C89349b> f142335K = new LinkedList<>();

    /* renamed from: L */
    public C50687oi1 f142336L;

    /* renamed from: d */
    public LinkedList<FinderContact> f142337d = new LinkedList<>();

    /* renamed from: e */
    public C51018qv3 f142338e;

    /* renamed from: f */
    public LinkedList<C50401mh0> f142339f = new LinkedList<>();

    /* renamed from: g */
    public int f142340g;

    /* renamed from: h */
    public int f142341h;

    /* renamed from: i */
    public LinkedList<C49027cn1> f142342i = new LinkedList<>();

    /* renamed from: j */
    public int f142343j;

    /* renamed from: n */
    public int f142344n;

    /* renamed from: o */
    public ly4 f142345o;

    /* renamed from: p */
    public LinkedList<C64373fs0> f142346p = new LinkedList<>();

    /* renamed from: q */
    public int f142347q;

    /* renamed from: r */
    public long f142348r;

    /* renamed from: s */
    public C49873in1 f142349s;

    /* renamed from: t */
    public LinkedList<String> f142350t = new LinkedList<>();

    /* renamed from: u */
    public String f142351u;

    /* renamed from: v */
    public int f142352v;

    /* renamed from: w */
    public C49728hn1 f142353w;

    /* renamed from: x */
    public LinkedList<C49161dl1> f142354x = new LinkedList<>();

    /* renamed from: y */
    public C50295lp1 f142355y;

    /* renamed from: z */
    public C50838pj1 f142356z;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51430tq0)) {
            return false;
        }
        C51430tq0 tq02 = (C51430tq0) aVar;
        return C46238a.m51546a(this.BaseResponse, tq02.BaseResponse) && C46238a.m51546a(this.f142337d, tq02.f142337d) && C46238a.m51546a(this.f142338e, tq02.f142338e) && C46238a.m51546a(this.f142339f, tq02.f142339f) && C46238a.m51546a(Integer.valueOf(this.f142340g), Integer.valueOf(tq02.f142340g)) && C46238a.m51546a(Integer.valueOf(this.f142341h), Integer.valueOf(tq02.f142341h)) && C46238a.m51546a(this.f142342i, tq02.f142342i) && C46238a.m51546a(Integer.valueOf(this.f142343j), Integer.valueOf(tq02.f142343j)) && C46238a.m51546a(Integer.valueOf(this.f142344n), Integer.valueOf(tq02.f142344n)) && C46238a.m51546a(this.f142345o, tq02.f142345o) && C46238a.m51546a(this.f142346p, tq02.f142346p) && C46238a.m51546a(Integer.valueOf(this.f142347q), Integer.valueOf(tq02.f142347q)) && C46238a.m51546a(Long.valueOf(this.f142348r), Long.valueOf(tq02.f142348r)) && C46238a.m51546a(this.f142349s, tq02.f142349s) && C46238a.m51546a(this.f142350t, tq02.f142350t) && C46238a.m51546a(this.f142351u, tq02.f142351u) && C46238a.m51546a(Integer.valueOf(this.f142352v), Integer.valueOf(tq02.f142352v)) && C46238a.m51546a(this.f142353w, tq02.f142353w) && C46238a.m51546a(this.f142354x, tq02.f142354x) && C46238a.m51546a(this.f142355y, tq02.f142355y) && C46238a.m51546a(this.f142356z, tq02.f142356z) && C46238a.m51546a(this.f142325A, tq02.f142325A) && C46238a.m51546a(this.f142326B, tq02.f142326B) && C46238a.m51546a(this.f142327C, tq02.f142327C) && C46238a.m51546a(this.f142328D, tq02.f142328D) && C46238a.m51546a(this.f142329E, tq02.f142329E) && C46238a.m51546a(this.f142330F, tq02.f142330F) && C46238a.m51546a(Integer.valueOf(this.f142331G), Integer.valueOf(tq02.f142331G)) && C46238a.m51546a(this.f142332H, tq02.f142332H) && C46238a.m51546a(this.f142333I, tq02.f142333I) && C46238a.m51546a(this.f142334J, tq02.f142334J) && C46238a.m51546a(this.f142335K, tq02.f142335K) && C46238a.m51546a(this.f142336L, tq02.f142336L);
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
            aVar.mo74320g(2, 8, this.f142337d);
            C51018qv3 qv32 = this.f142338e;
            if (qv32 != null) {
                aVar.mo74322i(3, qv32.computeSize());
                this.f142338e.writeFields(aVar);
            }
            aVar.mo74320g(4, 8, this.f142339f);
            aVar.mo74318e(5, this.f142340g);
            aVar.mo74318e(6, this.f142341h);
            aVar.mo74320g(7, 8, this.f142342i);
            aVar.mo74318e(8, this.f142343j);
            aVar.mo74318e(9, this.f142344n);
            ly4 ly4 = this.f142345o;
            if (ly4 != null) {
                aVar.mo74322i(10, ly4.computeSize());
                this.f142345o.writeFields(aVar);
            }
            aVar.mo74320g(11, 8, this.f142346p);
            aVar.mo74318e(12, this.f142347q);
            aVar.mo74321h(13, this.f142348r);
            C49873in1 in12 = this.f142349s;
            if (in12 != null) {
                aVar.mo74322i(14, in12.computeSize());
                this.f142349s.writeFields(aVar);
            }
            aVar.mo74320g(15, 1, this.f142350t);
            String str = this.f142351u;
            if (str != null) {
                aVar.mo74323j(16, str);
            }
            aVar.mo74318e(17, this.f142352v);
            C49728hn1 hn12 = this.f142353w;
            if (hn12 != null) {
                aVar.mo74322i(18, hn12.computeSize());
                this.f142353w.writeFields(aVar);
            }
            aVar.mo74320g(19, 8, this.f142354x);
            C50295lp1 lp12 = this.f142355y;
            if (lp12 != null) {
                aVar.mo74322i(20, lp12.computeSize());
                this.f142355y.writeFields(aVar);
            }
            C50838pj1 pj12 = this.f142356z;
            if (pj12 != null) {
                aVar.mo74322i(21, pj12.computeSize());
                this.f142356z.writeFields(aVar);
            }
            C51252sj0 sj02 = this.f142325A;
            if (sj02 != null) {
                aVar.mo74322i(22, sj02.computeSize());
                this.f142325A.writeFields(aVar);
            }
            String str2 = this.f142326B;
            if (str2 != null) {
                aVar.mo74323j(23, str2);
            }
            aVar.mo74320g(24, 8, this.f142327C);
            aVar.mo74320g(25, 8, this.f142328D);
            String str3 = this.f142329E;
            if (str3 != null) {
                aVar.mo74323j(26, str3);
            }
            String str4 = this.f142330F;
            if (str4 != null) {
                aVar.mo74323j(27, str4);
            }
            aVar.mo74318e(28, this.f142331G);
            C49300el1 el12 = this.f142332H;
            if (el12 != null) {
                aVar.mo74322i(29, el12.computeSize());
                this.f142332H.writeFields(aVar);
            }
            C49002ch0 ch02 = this.f142333I;
            if (ch02 != null) {
                aVar.mo74322i(30, ch02.computeSize());
                this.f142333I.writeFields(aVar);
            }
            aVar.mo74320g(32, 8, this.f142334J);
            aVar.mo74320g(33, 6, this.f142335K);
            C50687oi1 oi12 = this.f142336L;
            if (oi12 != null) {
                aVar.mo74322i(34, oi12.computeSize());
                this.f142336L.writeFields(aVar);
            }
            return 0;
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            int g = i3 + C52418a.m58680g(2, 8, this.f142337d);
            C51018qv3 qv33 = this.f142338e;
            if (qv33 != null) {
                g += C52418a.m58682i(3, qv33.computeSize());
            }
            int g2 = g + C52418a.m58680g(4, 8, this.f142339f) + C52418a.m58678e(5, this.f142340g) + C52418a.m58678e(6, this.f142341h) + C52418a.m58680g(7, 8, this.f142342i) + C52418a.m58678e(8, this.f142343j) + C52418a.m58678e(9, this.f142344n);
            ly4 ly42 = this.f142345o;
            if (ly42 != null) {
                g2 += C52418a.m58682i(10, ly42.computeSize());
            }
            int g3 = g2 + C52418a.m58680g(11, 8, this.f142346p) + C52418a.m58678e(12, this.f142347q) + C52418a.m58681h(13, this.f142348r);
            C49873in1 in13 = this.f142349s;
            if (in13 != null) {
                g3 += C52418a.m58682i(14, in13.computeSize());
            }
            int g4 = g3 + C52418a.m58680g(15, 1, this.f142350t);
            String str5 = this.f142351u;
            if (str5 != null) {
                g4 += C52418a.m58683j(16, str5);
            }
            int e = g4 + C52418a.m58678e(17, this.f142352v);
            C49728hn1 hn13 = this.f142353w;
            if (hn13 != null) {
                e += C52418a.m58682i(18, hn13.computeSize());
            }
            int g5 = e + C52418a.m58680g(19, 8, this.f142354x);
            C50295lp1 lp13 = this.f142355y;
            if (lp13 != null) {
                g5 += C52418a.m58682i(20, lp13.computeSize());
            }
            C50838pj1 pj13 = this.f142356z;
            if (pj13 != null) {
                g5 += C52418a.m58682i(21, pj13.computeSize());
            }
            C51252sj0 sj03 = this.f142325A;
            if (sj03 != null) {
                g5 += C52418a.m58682i(22, sj03.computeSize());
            }
            String str6 = this.f142326B;
            if (str6 != null) {
                g5 += C52418a.m58683j(23, str6);
            }
            int g6 = g5 + C52418a.m58680g(24, 8, this.f142327C) + C52418a.m58680g(25, 8, this.f142328D);
            String str7 = this.f142329E;
            if (str7 != null) {
                g6 += C52418a.m58683j(26, str7);
            }
            String str8 = this.f142330F;
            if (str8 != null) {
                g6 += C52418a.m58683j(27, str8);
            }
            int e2 = g6 + C52418a.m58678e(28, this.f142331G);
            C49300el1 el13 = this.f142332H;
            if (el13 != null) {
                e2 += C52418a.m58682i(29, el13.computeSize());
            }
            C49002ch0 ch03 = this.f142333I;
            if (ch03 != null) {
                e2 += C52418a.m58682i(30, ch03.computeSize());
            }
            int g7 = e2 + C52418a.m58680g(32, 8, this.f142334J) + C52418a.m58680g(33, 6, this.f142335K);
            C50687oi1 oi13 = this.f142336L;
            return oi13 != null ? g7 + C52418a.m58682i(34, oi13.computeSize()) : g7;
        } else if (i2 == 2) {
            this.f142337d.clear();
            this.f142339f.clear();
            this.f142342i.clear();
            this.f142346p.clear();
            this.f142350t.clear();
            this.f142354x.clear();
            this.f142327C.clear();
            this.f142328D.clear();
            this.f142334J.clear();
            this.f142335K.clear();
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
            C51430tq0 tq02 = objArr[1];
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
                        tq02.BaseResponse = jaVar3;
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
                        tq02.f142337d.add(finderContact);
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C51018qv3 qv34 = new C51018qv3();
                        if (bArr3 != null && bArr3.length > 0) {
                            qv34.mo73348f(bArr3);
                        }
                        tq02.f142338e = qv34;
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C50401mh0 mh02 = new C50401mh0();
                        if (bArr4 != null && bArr4.length > 0) {
                            mh02.parseFrom(bArr4);
                        }
                        tq02.f142339f.add(mh02);
                    }
                    return 0;
                case 5:
                    tq02.f142340g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    tq02.f142341h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C49027cn1 cn12 = new C49027cn1();
                        if (bArr5 != null && bArr5.length > 0) {
                            cn12.parseFrom(bArr5);
                        }
                        tq02.f142342i.add(cn12);
                    }
                    return 0;
                case 8:
                    tq02.f142343j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    tq02.f142344n = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        ly4 ly43 = new ly4();
                        if (bArr6 != null && bArr6.length > 0) {
                            ly43.parseFrom(bArr6);
                        }
                        tq02.f142345o = ly43;
                    }
                    return 0;
                case 11:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i15 = 0; i15 < size7; i15++) {
                        byte[] bArr7 = j7.get(i15);
                        C64373fs0 fs02 = new C64373fs0();
                        if (bArr7 != null && bArr7.length > 0) {
                            fs02.parseFrom(bArr7);
                        }
                        tq02.f142346p.add(fs02);
                    }
                    return 0;
                case 12:
                    tq02.f142347q = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    tq02.f142348r = aVar3.mo141631i(intValue);
                    return 0;
                case 14:
                    LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                    int size8 = j8.size();
                    for (int i16 = 0; i16 < size8; i16++) {
                        byte[] bArr8 = j8.get(i16);
                        C49873in1 in14 = new C49873in1();
                        if (bArr8 != null && bArr8.length > 0) {
                            in14.parseFrom(bArr8);
                        }
                        tq02.f142349s = in14;
                    }
                    return 0;
                case 15:
                    tq02.f142350t.add(aVar3.mo141633k(intValue));
                    return 0;
                case 16:
                    tq02.f142351u = aVar3.mo141633k(intValue);
                    return 0;
                case 17:
                    tq02.f142352v = aVar3.mo141629g(intValue);
                    return 0;
                case 18:
                    LinkedList<byte[]> j9 = aVar3.mo141632j(intValue);
                    int size9 = j9.size();
                    for (int i17 = 0; i17 < size9; i17++) {
                        byte[] bArr9 = j9.get(i17);
                        C49728hn1 hn14 = new C49728hn1();
                        if (bArr9 != null && bArr9.length > 0) {
                            hn14.parseFrom(bArr9);
                        }
                        tq02.f142353w = hn14;
                    }
                    return 0;
                case 19:
                    LinkedList<byte[]> j15 = aVar3.mo141632j(intValue);
                    int size10 = j15.size();
                    for (int i18 = 0; i18 < size10; i18++) {
                        byte[] bArr10 = j15.get(i18);
                        C49161dl1 dl12 = new C49161dl1();
                        if (bArr10 != null && bArr10.length > 0) {
                            dl12.parseFrom(bArr10);
                        }
                        tq02.f142354x.add(dl12);
                    }
                    return 0;
                case 20:
                    LinkedList<byte[]> j16 = aVar3.mo141632j(intValue);
                    int size11 = j16.size();
                    for (int i19 = 0; i19 < size11; i19++) {
                        byte[] bArr11 = j16.get(i19);
                        C50295lp1 lp14 = new C50295lp1();
                        if (bArr11 != null && bArr11.length > 0) {
                            lp14.parseFrom(bArr11);
                        }
                        tq02.f142355y = lp14;
                    }
                    return 0;
                case 21:
                    LinkedList<byte[]> j17 = aVar3.mo141632j(intValue);
                    int size12 = j17.size();
                    for (int i25 = 0; i25 < size12; i25++) {
                        byte[] bArr12 = j17.get(i25);
                        C50838pj1 pj14 = new C50838pj1();
                        if (bArr12 != null && bArr12.length > 0) {
                            pj14.parseFrom(bArr12);
                        }
                        tq02.f142356z = pj14;
                    }
                    return 0;
                case 22:
                    LinkedList<byte[]> j18 = aVar3.mo141632j(intValue);
                    int size13 = j18.size();
                    for (int i26 = 0; i26 < size13; i26++) {
                        byte[] bArr13 = j18.get(i26);
                        C51252sj0 sj04 = new C51252sj0();
                        if (bArr13 != null && bArr13.length > 0) {
                            sj04.parseFrom(bArr13);
                        }
                        tq02.f142325A = sj04;
                    }
                    return 0;
                case 23:
                    tq02.f142326B = aVar3.mo141633k(intValue);
                    return 0;
                case 24:
                    LinkedList<byte[]> j19 = aVar3.mo141632j(intValue);
                    int size14 = j19.size();
                    for (int i27 = 0; i27 < size14; i27++) {
                        byte[] bArr14 = j19.get(i27);
                        C51248si0 si02 = new C51248si0();
                        if (bArr14 != null && bArr14.length > 0) {
                            si02.parseFrom(bArr14);
                        }
                        tq02.f142327C.add(si02);
                    }
                    return 0;
                case 25:
                    LinkedList<byte[]> j25 = aVar3.mo141632j(intValue);
                    int size15 = j25.size();
                    for (int i28 = 0; i28 < size15; i28++) {
                        byte[] bArr15 = j25.get(i28);
                        C49692he1 he12 = new C49692he1();
                        if (bArr15 != null && bArr15.length > 0) {
                            he12.parseFrom(bArr15);
                        }
                        tq02.f142328D.add(he12);
                    }
                    return 0;
                case 26:
                    tq02.f142329E = aVar3.mo141633k(intValue);
                    return 0;
                case 27:
                    tq02.f142330F = aVar3.mo141633k(intValue);
                    return 0;
                case 28:
                    tq02.f142331G = aVar3.mo141629g(intValue);
                    return 0;
                case 29:
                    LinkedList<byte[]> j26 = aVar3.mo141632j(intValue);
                    int size16 = j26.size();
                    for (int i29 = 0; i29 < size16; i29++) {
                        byte[] bArr16 = j26.get(i29);
                        C49300el1 el14 = new C49300el1();
                        if (bArr16 != null && bArr16.length > 0) {
                            el14.parseFrom(bArr16);
                        }
                        tq02.f142332H = el14;
                    }
                    return 0;
                case 30:
                    LinkedList<byte[]> j27 = aVar3.mo141632j(intValue);
                    int size17 = j27.size();
                    for (int i35 = 0; i35 < size17; i35++) {
                        byte[] bArr17 = j27.get(i35);
                        C49002ch0 ch04 = new C49002ch0();
                        if (bArr17 != null && bArr17.length > 0) {
                            ch04.parseFrom(bArr17);
                        }
                        tq02.f142333I = ch04;
                    }
                    return 0;
                case 32:
                    LinkedList<byte[]> j28 = aVar3.mo141632j(intValue);
                    int size18 = j28.size();
                    for (int i36 = 0; i36 < size18; i36++) {
                        byte[] bArr18 = j28.get(i36);
                        C48860bi0 bi02 = new C48860bi0();
                        if (bArr18 != null && bArr18.length > 0) {
                            bi02.parseFrom(bArr18);
                        }
                        tq02.f142334J.add(bi02);
                    }
                    return 0;
                case 33:
                    tq02.f142335K.add(aVar3.mo141626d(intValue));
                    return 0;
                case 34:
                    LinkedList<byte[]> j29 = aVar3.mo141632j(intValue);
                    int size19 = j29.size();
                    for (int i37 = 0; i37 < size19; i37++) {
                        byte[] bArr19 = j29.get(i37);
                        C50687oi1 oi14 = new C50687oi1();
                        if (bArr19 != null && bArr19.length > 0) {
                            oi14.parseFrom(bArr19);
                        }
                        tq02.f142336L = oi14;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
