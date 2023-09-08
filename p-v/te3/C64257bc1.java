package te3;

import com.tencent.p014mm.protocal.protobuf.FinderContact;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.bc1 */
public class C64257bc1 extends C47465a {

    /* renamed from: A */
    public C49262ec1 f182244A;

    /* renamed from: B */
    public C48983cc1 f182245B;

    /* renamed from: C */
    public LinkedList<FinderContact> f182246C = new LinkedList<>();

    /* renamed from: D */
    public int f182247D;

    /* renamed from: E */
    public int f182248E;

    /* renamed from: F */
    public String f182249F;

    /* renamed from: G */
    public long f182250G;

    /* renamed from: H */
    public int f182251H;

    /* renamed from: I */
    public long f182252I;

    /* renamed from: J */
    public String f182253J;

    /* renamed from: K */
    public C50986qn2 f182254K;

    /* renamed from: L */
    public FinderContact f182255L;

    /* renamed from: M */
    public C64829xh0 f182256M;

    /* renamed from: N */
    public C64392gc1 f182257N;

    /* renamed from: P */
    public long f182258P;

    /* renamed from: Q */
    public int f182259Q;

    /* renamed from: d */
    public String f182260d;

    /* renamed from: e */
    public String f182261e;

    /* renamed from: f */
    public int f182262f;

    /* renamed from: g */
    public String f182263g;

    /* renamed from: h */
    public int f182264h;

    /* renamed from: i */
    public String f182265i;

    /* renamed from: j */
    public long f182266j;

    /* renamed from: n */
    public long f182267n;

    /* renamed from: o */
    public long f182268o;

    /* renamed from: p */
    public int f182269p;

    /* renamed from: q */
    public int f182270q;

    /* renamed from: r */
    public String f182271r;

    /* renamed from: s */
    public C64580ne1 f182272s;

    /* renamed from: t */
    public int f182273t;

    /* renamed from: u */
    public String f182274u;

    /* renamed from: v */
    public String f182275v;

    /* renamed from: w */
    public String f182276w;

    /* renamed from: x */
    public String f182277x;

    /* renamed from: y */
    public String f182278y;

    /* renamed from: z */
    public C49262ec1 f182279z;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64257bc1)) {
            return false;
        }
        C64257bc1 bc12 = (C64257bc1) aVar;
        return C46238a.m51546a(this.f182260d, bc12.f182260d) && C46238a.m51546a(this.f182261e, bc12.f182261e) && C46238a.m51546a(Integer.valueOf(this.f182262f), Integer.valueOf(bc12.f182262f)) && C46238a.m51546a(this.f182263g, bc12.f182263g) && C46238a.m51546a(Integer.valueOf(this.f182264h), Integer.valueOf(bc12.f182264h)) && C46238a.m51546a(this.f182265i, bc12.f182265i) && C46238a.m51546a(Long.valueOf(this.f182266j), Long.valueOf(bc12.f182266j)) && C46238a.m51546a(Long.valueOf(this.f182267n), Long.valueOf(bc12.f182267n)) && C46238a.m51546a(Long.valueOf(this.f182268o), Long.valueOf(bc12.f182268o)) && C46238a.m51546a(Integer.valueOf(this.f182269p), Integer.valueOf(bc12.f182269p)) && C46238a.m51546a(Integer.valueOf(this.f182270q), Integer.valueOf(bc12.f182270q)) && C46238a.m51546a(this.f182271r, bc12.f182271r) && C46238a.m51546a(this.f182272s, bc12.f182272s) && C46238a.m51546a(Integer.valueOf(this.f182273t), Integer.valueOf(bc12.f182273t)) && C46238a.m51546a(this.f182274u, bc12.f182274u) && C46238a.m51546a(this.f182275v, bc12.f182275v) && C46238a.m51546a(this.f182276w, bc12.f182276w) && C46238a.m51546a(this.f182277x, bc12.f182277x) && C46238a.m51546a(this.f182278y, bc12.f182278y) && C46238a.m51546a(this.f182279z, bc12.f182279z) && C46238a.m51546a(this.f182244A, bc12.f182244A) && C46238a.m51546a(this.f182245B, bc12.f182245B) && C46238a.m51546a(this.f182246C, bc12.f182246C) && C46238a.m51546a(Integer.valueOf(this.f182247D), Integer.valueOf(bc12.f182247D)) && C46238a.m51546a(Integer.valueOf(this.f182248E), Integer.valueOf(bc12.f182248E)) && C46238a.m51546a(this.f182249F, bc12.f182249F) && C46238a.m51546a(Long.valueOf(this.f182250G), Long.valueOf(bc12.f182250G)) && C46238a.m51546a(Integer.valueOf(this.f182251H), Integer.valueOf(bc12.f182251H)) && C46238a.m51546a(Long.valueOf(this.f182252I), Long.valueOf(bc12.f182252I)) && C46238a.m51546a(this.f182253J, bc12.f182253J) && C46238a.m51546a(this.f182254K, bc12.f182254K) && C46238a.m51546a(this.f182255L, bc12.f182255L) && C46238a.m51546a(this.f182256M, bc12.f182256M) && C46238a.m51546a(this.f182257N, bc12.f182257N) && C46238a.m51546a(Long.valueOf(this.f182258P), Long.valueOf(bc12.f182258P)) && C46238a.m51546a(Integer.valueOf(this.f182259Q), Integer.valueOf(bc12.f182259Q));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f182260d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f182261e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f182262f);
            String str3 = this.f182263g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            aVar.mo74318e(5, this.f182264h);
            String str4 = this.f182265i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            aVar.mo74321h(7, this.f182266j);
            aVar.mo74321h(8, this.f182267n);
            aVar.mo74321h(9, this.f182268o);
            aVar.mo74318e(10, this.f182269p);
            aVar.mo74318e(11, this.f182270q);
            String str5 = this.f182271r;
            if (str5 != null) {
                aVar.mo74323j(12, str5);
            }
            C64580ne1 ne12 = this.f182272s;
            if (ne12 != null) {
                aVar.mo74322i(13, ne12.computeSize());
                this.f182272s.writeFields(aVar);
            }
            aVar.mo74318e(14, this.f182273t);
            String str6 = this.f182274u;
            if (str6 != null) {
                aVar.mo74323j(15, str6);
            }
            String str7 = this.f182275v;
            if (str7 != null) {
                aVar.mo74323j(16, str7);
            }
            String str8 = this.f182276w;
            if (str8 != null) {
                aVar.mo74323j(17, str8);
            }
            String str9 = this.f182277x;
            if (str9 != null) {
                aVar.mo74323j(18, str9);
            }
            String str10 = this.f182278y;
            if (str10 != null) {
                aVar.mo74323j(19, str10);
            }
            C49262ec1 ec12 = this.f182279z;
            if (ec12 != null) {
                aVar.mo74322i(20, ec12.computeSize());
                this.f182279z.writeFields(aVar);
            }
            C49262ec1 ec13 = this.f182244A;
            if (ec13 != null) {
                aVar.mo74322i(21, ec13.computeSize());
                this.f182244A.writeFields(aVar);
            }
            C48983cc1 cc12 = this.f182245B;
            if (cc12 != null) {
                aVar.mo74322i(22, cc12.computeSize());
                this.f182245B.writeFields(aVar);
            }
            aVar.mo74320g(23, 8, this.f182246C);
            aVar.mo74318e(24, this.f182247D);
            aVar.mo74318e(25, this.f182248E);
            String str11 = this.f182249F;
            if (str11 != null) {
                aVar.mo74323j(26, str11);
            }
            aVar.mo74321h(27, this.f182250G);
            aVar.mo74318e(28, this.f182251H);
            aVar.mo74321h(29, this.f182252I);
            String str12 = this.f182253J;
            if (str12 != null) {
                aVar.mo74323j(30, str12);
            }
            C50986qn2 qn22 = this.f182254K;
            if (qn22 != null) {
                aVar.mo74322i(31, qn22.computeSize());
                this.f182254K.writeFields(aVar);
            }
            FinderContact finderContact = this.f182255L;
            if (finderContact != null) {
                aVar.mo74322i(32, finderContact.computeSize());
                this.f182255L.writeFields(aVar);
            }
            C64829xh0 xh02 = this.f182256M;
            if (xh02 != null) {
                aVar.mo74322i(33, xh02.computeSize());
                this.f182256M.writeFields(aVar);
            }
            C64392gc1 gc12 = this.f182257N;
            if (gc12 != null) {
                aVar.mo74322i(34, gc12.computeSize());
                this.f182257N.writeFields(aVar);
            }
            aVar.mo74321h(35, this.f182258P);
            aVar.mo74318e(36, this.f182259Q);
            return 0;
        } else if (i2 == 1) {
            String str13 = this.f182260d;
            if (str13 != null) {
                i3 = C52418a.m58683j(1, str13) + 0;
            }
            String str14 = this.f182261e;
            if (str14 != null) {
                i3 += C52418a.m58683j(2, str14);
            }
            int e = i3 + C52418a.m58678e(3, this.f182262f);
            String str15 = this.f182263g;
            if (str15 != null) {
                e += C52418a.m58683j(4, str15);
            }
            int e2 = e + C52418a.m58678e(5, this.f182264h);
            String str16 = this.f182265i;
            if (str16 != null) {
                e2 += C52418a.m58683j(6, str16);
            }
            int h = e2 + C52418a.m58681h(7, this.f182266j) + C52418a.m58681h(8, this.f182267n) + C52418a.m58681h(9, this.f182268o) + C52418a.m58678e(10, this.f182269p) + C52418a.m58678e(11, this.f182270q);
            String str17 = this.f182271r;
            if (str17 != null) {
                h += C52418a.m58683j(12, str17);
            }
            C64580ne1 ne13 = this.f182272s;
            if (ne13 != null) {
                h += C52418a.m58682i(13, ne13.computeSize());
            }
            int e3 = h + C52418a.m58678e(14, this.f182273t);
            String str18 = this.f182274u;
            if (str18 != null) {
                e3 += C52418a.m58683j(15, str18);
            }
            String str19 = this.f182275v;
            if (str19 != null) {
                e3 += C52418a.m58683j(16, str19);
            }
            String str20 = this.f182276w;
            if (str20 != null) {
                e3 += C52418a.m58683j(17, str20);
            }
            String str21 = this.f182277x;
            if (str21 != null) {
                e3 += C52418a.m58683j(18, str21);
            }
            String str22 = this.f182278y;
            if (str22 != null) {
                e3 += C52418a.m58683j(19, str22);
            }
            C49262ec1 ec14 = this.f182279z;
            if (ec14 != null) {
                e3 += C52418a.m58682i(20, ec14.computeSize());
            }
            C49262ec1 ec15 = this.f182244A;
            if (ec15 != null) {
                e3 += C52418a.m58682i(21, ec15.computeSize());
            }
            C48983cc1 cc13 = this.f182245B;
            if (cc13 != null) {
                e3 += C52418a.m58682i(22, cc13.computeSize());
            }
            int g = e3 + C52418a.m58680g(23, 8, this.f182246C) + C52418a.m58678e(24, this.f182247D) + C52418a.m58678e(25, this.f182248E);
            String str23 = this.f182249F;
            if (str23 != null) {
                g += C52418a.m58683j(26, str23);
            }
            int h2 = g + C52418a.m58681h(27, this.f182250G) + C52418a.m58678e(28, this.f182251H) + C52418a.m58681h(29, this.f182252I);
            String str24 = this.f182253J;
            if (str24 != null) {
                h2 += C52418a.m58683j(30, str24);
            }
            C50986qn2 qn23 = this.f182254K;
            if (qn23 != null) {
                h2 += C52418a.m58682i(31, qn23.computeSize());
            }
            FinderContact finderContact2 = this.f182255L;
            if (finderContact2 != null) {
                h2 += C52418a.m58682i(32, finderContact2.computeSize());
            }
            C64829xh0 xh03 = this.f182256M;
            if (xh03 != null) {
                h2 += C52418a.m58682i(33, xh03.computeSize());
            }
            C64392gc1 gc13 = this.f182257N;
            if (gc13 != null) {
                h2 += C52418a.m58682i(34, gc13.computeSize());
            }
            return h2 + C52418a.m58681h(35, this.f182258P) + C52418a.m58678e(36, this.f182259Q);
        } else if (i2 == 2) {
            this.f182246C.clear();
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
            C64257bc1 bc12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    bc12.f182260d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    bc12.f182261e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    bc12.f182262f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    bc12.f182263g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    bc12.f182264h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    bc12.f182265i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    bc12.f182266j = aVar3.mo141631i(intValue);
                    return 0;
                case 8:
                    bc12.f182267n = aVar3.mo141631i(intValue);
                    return 0;
                case 9:
                    bc12.f182268o = aVar3.mo141631i(intValue);
                    return 0;
                case 10:
                    bc12.f182269p = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    bc12.f182270q = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    bc12.f182271r = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C64580ne1 ne14 = new C64580ne1();
                        if (bArr != null && bArr.length > 0) {
                            ne14.parseFrom(bArr);
                        }
                        bc12.f182272s = ne14;
                    }
                    return 0;
                case 14:
                    bc12.f182273t = aVar3.mo141629g(intValue);
                    return 0;
                case 15:
                    bc12.f182274u = aVar3.mo141633k(intValue);
                    return 0;
                case 16:
                    bc12.f182275v = aVar3.mo141633k(intValue);
                    return 0;
                case 17:
                    bc12.f182276w = aVar3.mo141633k(intValue);
                    return 0;
                case 18:
                    bc12.f182277x = aVar3.mo141633k(intValue);
                    return 0;
                case 19:
                    bc12.f182278y = aVar3.mo141633k(intValue);
                    return 0;
                case 20:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C49262ec1 ec16 = new C49262ec1();
                        if (bArr2 != null && bArr2.length > 0) {
                            ec16.parseFrom(bArr2);
                        }
                        bc12.f182279z = ec16;
                    }
                    return 0;
                case 21:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C49262ec1 ec17 = new C49262ec1();
                        if (bArr3 != null && bArr3.length > 0) {
                            ec17.parseFrom(bArr3);
                        }
                        bc12.f182244A = ec17;
                    }
                    return 0;
                case 22:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C48983cc1 cc14 = new C48983cc1();
                        if (bArr4 != null && bArr4.length > 0) {
                            cc14.parseFrom(bArr4);
                        }
                        bc12.f182245B = cc14;
                    }
                    return 0;
                case 23:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        FinderContact finderContact3 = new FinderContact();
                        if (bArr5 != null && bArr5.length > 0) {
                            finderContact3.parseFrom(bArr5);
                        }
                        bc12.f182246C.add(finderContact3);
                    }
                    return 0;
                case 24:
                    bc12.f182247D = aVar3.mo141629g(intValue);
                    return 0;
                case 25:
                    bc12.f182248E = aVar3.mo141629g(intValue);
                    return 0;
                case 26:
                    bc12.f182249F = aVar3.mo141633k(intValue);
                    return 0;
                case 27:
                    bc12.f182250G = aVar3.mo141631i(intValue);
                    return 0;
                case 28:
                    bc12.f182251H = aVar3.mo141629g(intValue);
                    return 0;
                case 29:
                    bc12.f182252I = aVar3.mo141631i(intValue);
                    return 0;
                case 30:
                    bc12.f182253J = aVar3.mo141633k(intValue);
                    return 0;
                case 31:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        C50986qn2 qn24 = new C50986qn2();
                        if (bArr6 != null && bArr6.length > 0) {
                            qn24.parseFrom(bArr6);
                        }
                        bc12.f182254K = qn24;
                    }
                    return 0;
                case 32:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i15 = 0; i15 < size7; i15++) {
                        byte[] bArr7 = j7.get(i15);
                        FinderContact finderContact4 = new FinderContact();
                        if (bArr7 != null && bArr7.length > 0) {
                            finderContact4.parseFrom(bArr7);
                        }
                        bc12.f182255L = finderContact4;
                    }
                    return 0;
                case 33:
                    LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                    int size8 = j8.size();
                    for (int i16 = 0; i16 < size8; i16++) {
                        byte[] bArr8 = j8.get(i16);
                        C64829xh0 xh04 = new C64829xh0();
                        if (bArr8 != null && bArr8.length > 0) {
                            xh04.parseFrom(bArr8);
                        }
                        bc12.f182256M = xh04;
                    }
                    return 0;
                case 34:
                    LinkedList<byte[]> j9 = aVar3.mo141632j(intValue);
                    int size9 = j9.size();
                    for (int i17 = 0; i17 < size9; i17++) {
                        byte[] bArr9 = j9.get(i17);
                        C64392gc1 gc14 = new C64392gc1();
                        if (bArr9 != null && bArr9.length > 0) {
                            gc14.parseFrom(bArr9);
                        }
                        bc12.f182257N = gc14;
                    }
                    return 0;
                case 35:
                    bc12.f182258P = aVar3.mo141631i(intValue);
                    return 0;
                case 36:
                    bc12.f182259Q = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
