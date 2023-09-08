package te3;

import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.zj0 */
public class C52271zj0 extends C47465a {

    /* renamed from: A */
    public C52123yj0 f145995A;

    /* renamed from: B */
    public int f145996B;

    /* renamed from: C */
    public LinkedList<FinderJumpInfo> f145997C = new LinkedList<>();

    /* renamed from: D */
    public String f145998D;

    /* renamed from: E */
    public sf4 f145999E;

    /* renamed from: F */
    public C48726ak0 f146000F;

    /* renamed from: G */
    public qr4 f146001G;

    /* renamed from: H */
    public int f146002H;

    /* renamed from: I */
    public String f146003I;

    /* renamed from: J */
    public C48867bk0 f146004J;

    /* renamed from: d */
    public long f146005d;

    /* renamed from: e */
    public FinderContact f146006e;

    /* renamed from: f */
    public String f146007f;

    /* renamed from: g */
    public String f146008g;

    /* renamed from: h */
    public int f146009h;

    /* renamed from: i */
    public String f146010i;

    /* renamed from: j */
    public long f146011j;

    /* renamed from: n */
    public int f146012n;

    /* renamed from: o */
    public int f146013o;

    /* renamed from: p */
    public String f146014p;

    /* renamed from: q */
    public String f146015q;

    /* renamed from: r */
    public String f146016r;

    /* renamed from: s */
    public int f146017s;

    /* renamed from: t */
    public long f146018t;

    /* renamed from: u */
    public int f146019u;

    /* renamed from: v */
    public FinderJumpInfo f146020v;

    /* renamed from: w */
    public C51130rn1 f146021w;

    /* renamed from: x */
    public long f146022x;

    /* renamed from: y */
    public C49295ek0 f146023y;

    /* renamed from: z */
    public FinderJumpInfo f146024z;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52271zj0)) {
            return false;
        }
        C52271zj0 zj02 = (C52271zj0) aVar;
        return C46238a.m51546a(Long.valueOf(this.f146005d), Long.valueOf(zj02.f146005d)) && C46238a.m51546a(this.f146006e, zj02.f146006e) && C46238a.m51546a(this.f146007f, zj02.f146007f) && C46238a.m51546a(this.f146008g, zj02.f146008g) && C46238a.m51546a(Integer.valueOf(this.f146009h), Integer.valueOf(zj02.f146009h)) && C46238a.m51546a(this.f146010i, zj02.f146010i) && C46238a.m51546a(Long.valueOf(this.f146011j), Long.valueOf(zj02.f146011j)) && C46238a.m51546a(Integer.valueOf(this.f146012n), Integer.valueOf(zj02.f146012n)) && C46238a.m51546a(Integer.valueOf(this.f146013o), Integer.valueOf(zj02.f146013o)) && C46238a.m51546a(this.f146014p, zj02.f146014p) && C46238a.m51546a(this.f146015q, zj02.f146015q) && C46238a.m51546a(this.f146016r, zj02.f146016r) && C46238a.m51546a(Integer.valueOf(this.f146017s), Integer.valueOf(zj02.f146017s)) && C46238a.m51546a(Long.valueOf(this.f146018t), Long.valueOf(zj02.f146018t)) && C46238a.m51546a(Integer.valueOf(this.f146019u), Integer.valueOf(zj02.f146019u)) && C46238a.m51546a(this.f146020v, zj02.f146020v) && C46238a.m51546a(this.f146021w, zj02.f146021w) && C46238a.m51546a(Long.valueOf(this.f146022x), Long.valueOf(zj02.f146022x)) && C46238a.m51546a(this.f146023y, zj02.f146023y) && C46238a.m51546a(this.f146024z, zj02.f146024z) && C46238a.m51546a(this.f145995A, zj02.f145995A) && C46238a.m51546a(Integer.valueOf(this.f145996B), Integer.valueOf(zj02.f145996B)) && C46238a.m51546a(this.f145997C, zj02.f145997C) && C46238a.m51546a(this.f145998D, zj02.f145998D) && C46238a.m51546a(this.f145999E, zj02.f145999E) && C46238a.m51546a(this.f146000F, zj02.f146000F) && C46238a.m51546a(this.f146001G, zj02.f146001G) && C46238a.m51546a(Integer.valueOf(this.f146002H), Integer.valueOf(zj02.f146002H)) && C46238a.m51546a(this.f146003I, zj02.f146003I) && C46238a.m51546a(this.f146004J, zj02.f146004J);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f146005d);
            FinderContact finderContact = this.f146006e;
            if (finderContact != null) {
                aVar.mo74322i(2, finderContact.computeSize());
                this.f146006e.writeFields(aVar);
            }
            String str = this.f146007f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f146008g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            aVar.mo74318e(5, this.f146009h);
            String str3 = this.f146010i;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            aVar.mo74321h(7, this.f146011j);
            aVar.mo74318e(8, this.f146012n);
            aVar.mo74318e(9, this.f146013o);
            String str4 = this.f146014p;
            if (str4 != null) {
                aVar.mo74323j(10, str4);
            }
            String str5 = this.f146015q;
            if (str5 != null) {
                aVar.mo74323j(11, str5);
            }
            String str6 = this.f146016r;
            if (str6 != null) {
                aVar.mo74323j(12, str6);
            }
            aVar.mo74318e(13, this.f146017s);
            aVar.mo74321h(14, this.f146018t);
            aVar.mo74318e(15, this.f146019u);
            FinderJumpInfo finderJumpInfo = this.f146020v;
            if (finderJumpInfo != null) {
                aVar.mo74322i(16, finderJumpInfo.computeSize());
                this.f146020v.writeFields(aVar);
            }
            C51130rn1 rn12 = this.f146021w;
            if (rn12 != null) {
                aVar.mo74322i(17, rn12.computeSize());
                this.f146021w.writeFields(aVar);
            }
            aVar.mo74321h(18, this.f146022x);
            C49295ek0 ek02 = this.f146023y;
            if (ek02 != null) {
                aVar.mo74322i(19, ek02.computeSize());
                this.f146023y.writeFields(aVar);
            }
            FinderJumpInfo finderJumpInfo2 = this.f146024z;
            if (finderJumpInfo2 != null) {
                aVar.mo74322i(20, finderJumpInfo2.computeSize());
                this.f146024z.writeFields(aVar);
            }
            C52123yj0 yj02 = this.f145995A;
            if (yj02 != null) {
                aVar.mo74322i(21, yj02.computeSize());
                this.f145995A.writeFields(aVar);
            }
            aVar.mo74318e(22, this.f145996B);
            aVar.mo74320g(23, 8, this.f145997C);
            String str7 = this.f145998D;
            if (str7 != null) {
                aVar.mo74323j(24, str7);
            }
            sf4 sf4 = this.f145999E;
            if (sf4 != null) {
                aVar.mo74322i(25, sf4.computeSize());
                this.f145999E.writeFields(aVar);
            }
            C48726ak0 ak02 = this.f146000F;
            if (ak02 != null) {
                aVar.mo74322i(26, ak02.computeSize());
                this.f146000F.writeFields(aVar);
            }
            qr4 qr4 = this.f146001G;
            if (qr4 != null) {
                aVar.mo74322i(27, qr4.computeSize());
                this.f146001G.writeFields(aVar);
            }
            aVar.mo74318e(28, this.f146002H);
            String str8 = this.f146003I;
            if (str8 != null) {
                aVar.mo74323j(29, str8);
            }
            C48867bk0 bk02 = this.f146004J;
            if (bk02 != null) {
                aVar.mo74322i(30, bk02.computeSize());
                this.f146004J.writeFields(aVar);
            }
            return 0;
        } else if (i2 == 1) {
            int h = C52418a.m58681h(1, this.f146005d) + 0;
            FinderContact finderContact2 = this.f146006e;
            if (finderContact2 != null) {
                h += C52418a.m58682i(2, finderContact2.computeSize());
            }
            String str9 = this.f146007f;
            if (str9 != null) {
                h += C52418a.m58683j(3, str9);
            }
            String str10 = this.f146008g;
            if (str10 != null) {
                h += C52418a.m58683j(4, str10);
            }
            int e = h + C52418a.m58678e(5, this.f146009h);
            String str11 = this.f146010i;
            if (str11 != null) {
                e += C52418a.m58683j(6, str11);
            }
            int h2 = e + C52418a.m58681h(7, this.f146011j) + C52418a.m58678e(8, this.f146012n) + C52418a.m58678e(9, this.f146013o);
            String str12 = this.f146014p;
            if (str12 != null) {
                h2 += C52418a.m58683j(10, str12);
            }
            String str13 = this.f146015q;
            if (str13 != null) {
                h2 += C52418a.m58683j(11, str13);
            }
            String str14 = this.f146016r;
            if (str14 != null) {
                h2 += C52418a.m58683j(12, str14);
            }
            int e2 = h2 + C52418a.m58678e(13, this.f146017s) + C52418a.m58681h(14, this.f146018t) + C52418a.m58678e(15, this.f146019u);
            FinderJumpInfo finderJumpInfo3 = this.f146020v;
            if (finderJumpInfo3 != null) {
                e2 += C52418a.m58682i(16, finderJumpInfo3.computeSize());
            }
            C51130rn1 rn13 = this.f146021w;
            if (rn13 != null) {
                e2 += C52418a.m58682i(17, rn13.computeSize());
            }
            int h3 = e2 + C52418a.m58681h(18, this.f146022x);
            C49295ek0 ek03 = this.f146023y;
            if (ek03 != null) {
                h3 += C52418a.m58682i(19, ek03.computeSize());
            }
            FinderJumpInfo finderJumpInfo4 = this.f146024z;
            if (finderJumpInfo4 != null) {
                h3 += C52418a.m58682i(20, finderJumpInfo4.computeSize());
            }
            C52123yj0 yj03 = this.f145995A;
            if (yj03 != null) {
                h3 += C52418a.m58682i(21, yj03.computeSize());
            }
            int e3 = h3 + C52418a.m58678e(22, this.f145996B) + C52418a.m58680g(23, 8, this.f145997C);
            String str15 = this.f145998D;
            if (str15 != null) {
                e3 += C52418a.m58683j(24, str15);
            }
            sf4 sf42 = this.f145999E;
            if (sf42 != null) {
                e3 += C52418a.m58682i(25, sf42.computeSize());
            }
            C48726ak0 ak03 = this.f146000F;
            if (ak03 != null) {
                e3 += C52418a.m58682i(26, ak03.computeSize());
            }
            qr4 qr42 = this.f146001G;
            if (qr42 != null) {
                e3 += C52418a.m58682i(27, qr42.computeSize());
            }
            int e4 = e3 + C52418a.m58678e(28, this.f146002H);
            String str16 = this.f146003I;
            if (str16 != null) {
                e4 += C52418a.m58683j(29, str16);
            }
            C48867bk0 bk03 = this.f146004J;
            return bk03 != null ? e4 + C52418a.m58682i(30, bk03.computeSize()) : e4;
        } else if (i2 == 2) {
            this.f145997C.clear();
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
            C52271zj0 zj02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    zj02.f146005d = aVar3.mo141631i(intValue);
                    return 0;
                case 2:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        FinderContact finderContact3 = new FinderContact();
                        if (bArr != null && bArr.length > 0) {
                            finderContact3.parseFrom(bArr);
                        }
                        zj02.f146006e = finderContact3;
                    }
                    return 0;
                case 3:
                    zj02.f146007f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    zj02.f146008g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    zj02.f146009h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    zj02.f146010i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    zj02.f146011j = aVar3.mo141631i(intValue);
                    return 0;
                case 8:
                    zj02.f146012n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    zj02.f146013o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    zj02.f146014p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    zj02.f146015q = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    zj02.f146016r = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    zj02.f146017s = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    zj02.f146018t = aVar3.mo141631i(intValue);
                    return 0;
                case 15:
                    zj02.f146019u = aVar3.mo141629g(intValue);
                    return 0;
                case 16:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        FinderJumpInfo finderJumpInfo5 = new FinderJumpInfo();
                        if (bArr2 != null && bArr2.length > 0) {
                            finderJumpInfo5.parseFrom(bArr2);
                        }
                        zj02.f146020v = finderJumpInfo5;
                    }
                    return 0;
                case 17:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C51130rn1 rn14 = new C51130rn1();
                        if (bArr3 != null && bArr3.length > 0) {
                            rn14.parseFrom(bArr3);
                        }
                        zj02.f146021w = rn14;
                    }
                    return 0;
                case 18:
                    zj02.f146022x = aVar3.mo141631i(intValue);
                    return 0;
                case 19:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C49295ek0 ek04 = new C49295ek0();
                        if (bArr4 != null && bArr4.length > 0) {
                            ek04.parseFrom(bArr4);
                        }
                        zj02.f146023y = ek04;
                    }
                    return 0;
                case 20:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        byte[] bArr5 = j5.get(i7);
                        FinderJumpInfo finderJumpInfo6 = new FinderJumpInfo();
                        if (bArr5 != null && bArr5.length > 0) {
                            finderJumpInfo6.parseFrom(bArr5);
                        }
                        zj02.f146024z = finderJumpInfo6;
                    }
                    return 0;
                case 21:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i8 = 0; i8 < size6; i8++) {
                        byte[] bArr6 = j6.get(i8);
                        C52123yj0 yj04 = new C52123yj0();
                        if (bArr6 != null && bArr6.length > 0) {
                            yj04.parseFrom(bArr6);
                        }
                        zj02.f145995A = yj04;
                    }
                    return 0;
                case 22:
                    zj02.f145996B = aVar3.mo141629g(intValue);
                    return 0;
                case 23:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i9 = 0; i9 < size7; i9++) {
                        byte[] bArr7 = j7.get(i9);
                        FinderJumpInfo finderJumpInfo7 = new FinderJumpInfo();
                        if (bArr7 != null && bArr7.length > 0) {
                            finderJumpInfo7.parseFrom(bArr7);
                        }
                        zj02.f145997C.add(finderJumpInfo7);
                    }
                    return 0;
                case 24:
                    zj02.f145998D = aVar3.mo141633k(intValue);
                    return 0;
                case 25:
                    LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                    int size8 = j8.size();
                    for (int i15 = 0; i15 < size8; i15++) {
                        byte[] bArr8 = j8.get(i15);
                        sf4 sf43 = new sf4();
                        if (bArr8 != null && bArr8.length > 0) {
                            sf43.parseFrom(bArr8);
                        }
                        zj02.f145999E = sf43;
                    }
                    return 0;
                case 26:
                    LinkedList<byte[]> j9 = aVar3.mo141632j(intValue);
                    int size9 = j9.size();
                    for (int i16 = 0; i16 < size9; i16++) {
                        byte[] bArr9 = j9.get(i16);
                        C48726ak0 ak04 = new C48726ak0();
                        if (bArr9 != null && bArr9.length > 0) {
                            ak04.parseFrom(bArr9);
                        }
                        zj02.f146000F = ak04;
                    }
                    return 0;
                case 27:
                    LinkedList<byte[]> j15 = aVar3.mo141632j(intValue);
                    int size10 = j15.size();
                    for (int i17 = 0; i17 < size10; i17++) {
                        byte[] bArr10 = j15.get(i17);
                        qr4 qr43 = new qr4();
                        if (bArr10 != null && bArr10.length > 0) {
                            qr43.parseFrom(bArr10);
                        }
                        zj02.f146001G = qr43;
                    }
                    return 0;
                case 28:
                    zj02.f146002H = aVar3.mo141629g(intValue);
                    return 0;
                case 29:
                    zj02.f146003I = aVar3.mo141633k(intValue);
                    return 0;
                case 30:
                    LinkedList<byte[]> j16 = aVar3.mo141632j(intValue);
                    int size11 = j16.size();
                    for (int i18 = 0; i18 < size11; i18++) {
                        byte[] bArr11 = j16.get(i18);
                        C48867bk0 bk04 = new C48867bk0();
                        if (bArr11 != null && bArr11.length > 0) {
                            bk04.parseFrom(bArr11);
                        }
                        zj02.f146004J = bk04;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
