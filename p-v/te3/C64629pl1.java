package te3;

import com.tencent.p014mm.protocal.protobuf.FinderObject;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.pl1 */
public class C64629pl1 extends C47465a {

    /* renamed from: A */
    public C50976ql1 f184835A;

    /* renamed from: B */
    public String f184836B;

    /* renamed from: C */
    public C50976ql1 f184837C;

    /* renamed from: D */
    public C50976ql1 f184838D;

    /* renamed from: E */
    public int f184839E;

    /* renamed from: d */
    public long f184840d;

    /* renamed from: e */
    public String f184841e;

    /* renamed from: f */
    public String f184842f;

    /* renamed from: g */
    public int f184843g;

    /* renamed from: h */
    public LinkedList<FinderObject> f184844h = new LinkedList<>();

    /* renamed from: i */
    public LinkedList<Integer> f184845i = new LinkedList<>();

    /* renamed from: j */
    public C89349b f184846j;

    /* renamed from: n */
    public int f184847n;

    /* renamed from: o */
    public boolean f184848o;

    /* renamed from: p */
    public int f184849p;

    /* renamed from: q */
    public boolean f184850q;

    /* renamed from: r */
    public String f184851r;

    /* renamed from: s */
    public int f184852s;

    /* renamed from: t */
    public String f184853t;

    /* renamed from: u */
    public long f184854u;

    /* renamed from: v */
    public String f184855v;

    /* renamed from: w */
    public C49165dm1 f184856w;

    /* renamed from: x */
    public C50976ql1 f184857x;

    /* renamed from: y */
    public LinkedList<C50976ql1> f184858y = new LinkedList<>();

    /* renamed from: z */
    public C50976ql1 f184859z;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64629pl1)) {
            return false;
        }
        C64629pl1 pl12 = (C64629pl1) aVar;
        return C46238a.m51546a(Long.valueOf(this.f184840d), Long.valueOf(pl12.f184840d)) && C46238a.m51546a(this.f184841e, pl12.f184841e) && C46238a.m51546a(this.f184842f, pl12.f184842f) && C46238a.m51546a(Integer.valueOf(this.f184843g), Integer.valueOf(pl12.f184843g)) && C46238a.m51546a(this.f184844h, pl12.f184844h) && C46238a.m51546a(this.f184845i, pl12.f184845i) && C46238a.m51546a(this.f184846j, pl12.f184846j) && C46238a.m51546a(Integer.valueOf(this.f184847n), Integer.valueOf(pl12.f184847n)) && C46238a.m51546a(Boolean.valueOf(this.f184848o), Boolean.valueOf(pl12.f184848o)) && C46238a.m51546a(Integer.valueOf(this.f184849p), Integer.valueOf(pl12.f184849p)) && C46238a.m51546a(Boolean.valueOf(this.f184850q), Boolean.valueOf(pl12.f184850q)) && C46238a.m51546a(this.f184851r, pl12.f184851r) && C46238a.m51546a(Integer.valueOf(this.f184852s), Integer.valueOf(pl12.f184852s)) && C46238a.m51546a(this.f184853t, pl12.f184853t) && C46238a.m51546a(Long.valueOf(this.f184854u), Long.valueOf(pl12.f184854u)) && C46238a.m51546a(this.f184855v, pl12.f184855v) && C46238a.m51546a(this.f184856w, pl12.f184856w) && C46238a.m51546a(this.f184857x, pl12.f184857x) && C46238a.m51546a(this.f184858y, pl12.f184858y) && C46238a.m51546a(this.f184859z, pl12.f184859z) && C46238a.m51546a(this.f184835A, pl12.f184835A) && C46238a.m51546a(this.f184836B, pl12.f184836B) && C46238a.m51546a(this.f184837C, pl12.f184837C) && C46238a.m51546a(this.f184838D, pl12.f184838D) && C46238a.m51546a(Integer.valueOf(this.f184839E), Integer.valueOf(pl12.f184839E));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f184840d);
            String str = this.f184841e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f184842f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74318e(4, this.f184843g);
            aVar.mo74320g(5, 8, this.f184844h);
            aVar.mo74320g(6, 2, this.f184845i);
            C89349b bVar = this.f184846j;
            if (bVar != null) {
                aVar.mo74315b(7, bVar);
            }
            aVar.mo74318e(8, this.f184847n);
            aVar.mo74314a(9, this.f184848o);
            aVar.mo74318e(10, this.f184849p);
            aVar.mo74314a(11, this.f184850q);
            String str3 = this.f184851r;
            if (str3 != null) {
                aVar.mo74323j(12, str3);
            }
            aVar.mo74318e(13, this.f184852s);
            String str4 = this.f184853t;
            if (str4 != null) {
                aVar.mo74323j(14, str4);
            }
            aVar.mo74321h(15, this.f184854u);
            String str5 = this.f184855v;
            if (str5 != null) {
                aVar.mo74323j(16, str5);
            }
            C49165dm1 dm12 = this.f184856w;
            if (dm12 != null) {
                aVar.mo74322i(17, dm12.computeSize());
                this.f184856w.writeFields(aVar);
            }
            C50976ql1 ql12 = this.f184857x;
            if (ql12 != null) {
                aVar.mo74322i(18, ql12.computeSize());
                this.f184857x.writeFields(aVar);
            }
            aVar.mo74320g(19, 8, this.f184858y);
            C50976ql1 ql13 = this.f184859z;
            if (ql13 != null) {
                aVar.mo74322i(20, ql13.computeSize());
                this.f184859z.writeFields(aVar);
            }
            C50976ql1 ql14 = this.f184835A;
            if (ql14 != null) {
                aVar.mo74322i(21, ql14.computeSize());
                this.f184835A.writeFields(aVar);
            }
            String str6 = this.f184836B;
            if (str6 != null) {
                aVar.mo74323j(22, str6);
            }
            C50976ql1 ql15 = this.f184837C;
            if (ql15 != null) {
                aVar.mo74322i(23, ql15.computeSize());
                this.f184837C.writeFields(aVar);
            }
            C50976ql1 ql16 = this.f184838D;
            if (ql16 != null) {
                aVar.mo74322i(24, ql16.computeSize());
                this.f184838D.writeFields(aVar);
            }
            aVar.mo74318e(25, this.f184839E);
            return 0;
        } else if (i2 == 1) {
            int h = C52418a.m58681h(1, this.f184840d) + 0;
            String str7 = this.f184841e;
            if (str7 != null) {
                h += C52418a.m58683j(2, str7);
            }
            String str8 = this.f184842f;
            if (str8 != null) {
                h += C52418a.m58683j(3, str8);
            }
            int e = h + C52418a.m58678e(4, this.f184843g) + C52418a.m58680g(5, 8, this.f184844h) + C52418a.m58680g(6, 2, this.f184845i);
            C89349b bVar2 = this.f184846j;
            if (bVar2 != null) {
                e += C52418a.m58675b(7, bVar2);
            }
            int e2 = e + C52418a.m58678e(8, this.f184847n) + C52418a.m58674a(9, this.f184848o) + C52418a.m58678e(10, this.f184849p) + C52418a.m58674a(11, this.f184850q);
            String str9 = this.f184851r;
            if (str9 != null) {
                e2 += C52418a.m58683j(12, str9);
            }
            int e3 = e2 + C52418a.m58678e(13, this.f184852s);
            String str10 = this.f184853t;
            if (str10 != null) {
                e3 += C52418a.m58683j(14, str10);
            }
            int h2 = e3 + C52418a.m58681h(15, this.f184854u);
            String str11 = this.f184855v;
            if (str11 != null) {
                h2 += C52418a.m58683j(16, str11);
            }
            C49165dm1 dm13 = this.f184856w;
            if (dm13 != null) {
                h2 += C52418a.m58682i(17, dm13.computeSize());
            }
            C50976ql1 ql17 = this.f184857x;
            if (ql17 != null) {
                h2 += C52418a.m58682i(18, ql17.computeSize());
            }
            int g = h2 + C52418a.m58680g(19, 8, this.f184858y);
            C50976ql1 ql18 = this.f184859z;
            if (ql18 != null) {
                g += C52418a.m58682i(20, ql18.computeSize());
            }
            C50976ql1 ql19 = this.f184835A;
            if (ql19 != null) {
                g += C52418a.m58682i(21, ql19.computeSize());
            }
            String str12 = this.f184836B;
            if (str12 != null) {
                g += C52418a.m58683j(22, str12);
            }
            C50976ql1 ql110 = this.f184837C;
            if (ql110 != null) {
                g += C52418a.m58682i(23, ql110.computeSize());
            }
            C50976ql1 ql111 = this.f184838D;
            if (ql111 != null) {
                g += C52418a.m58682i(24, ql111.computeSize());
            }
            return g + C52418a.m58678e(25, this.f184839E);
        } else if (i2 == 2) {
            this.f184844h.clear();
            this.f184845i.clear();
            this.f184858y.clear();
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
            C64629pl1 pl12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    pl12.f184840d = aVar3.mo141631i(intValue);
                    return 0;
                case 2:
                    pl12.f184841e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    pl12.f184842f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    pl12.f184843g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        FinderObject finderObject = new FinderObject();
                        if (bArr != null && bArr.length > 0) {
                            finderObject.parseFrom(bArr);
                        }
                        pl12.f184844h.add(finderObject);
                    }
                    return 0;
                case 6:
                    pl12.f184845i.add(Integer.valueOf(aVar3.mo141629g(intValue)));
                    return 0;
                case 7:
                    pl12.f184846j = aVar3.mo141626d(intValue);
                    return 0;
                case 8:
                    pl12.f184847n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    pl12.f184848o = aVar3.mo141625c(intValue);
                    return 0;
                case 10:
                    pl12.f184849p = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    pl12.f184850q = aVar3.mo141625c(intValue);
                    return 0;
                case 12:
                    pl12.f184851r = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    pl12.f184852s = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    pl12.f184853t = aVar3.mo141633k(intValue);
                    return 0;
                case 15:
                    pl12.f184854u = aVar3.mo141631i(intValue);
                    return 0;
                case 16:
                    pl12.f184855v = aVar3.mo141633k(intValue);
                    return 0;
                case 17:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C49165dm1 dm14 = new C49165dm1();
                        if (bArr2 != null && bArr2.length > 0) {
                            dm14.parseFrom(bArr2);
                        }
                        pl12.f184856w = dm14;
                    }
                    return 0;
                case 18:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C50976ql1 ql112 = new C50976ql1();
                        if (bArr3 != null && bArr3.length > 0) {
                            ql112.parseFrom(bArr3);
                        }
                        pl12.f184857x = ql112;
                    }
                    return 0;
                case 19:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C50976ql1 ql113 = new C50976ql1();
                        if (bArr4 != null && bArr4.length > 0) {
                            ql113.parseFrom(bArr4);
                        }
                        pl12.f184858y.add(ql113);
                    }
                    return 0;
                case 20:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        byte[] bArr5 = j5.get(i7);
                        C50976ql1 ql114 = new C50976ql1();
                        if (bArr5 != null && bArr5.length > 0) {
                            ql114.parseFrom(bArr5);
                        }
                        pl12.f184859z = ql114;
                    }
                    return 0;
                case 21:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i8 = 0; i8 < size6; i8++) {
                        byte[] bArr6 = j6.get(i8);
                        C50976ql1 ql115 = new C50976ql1();
                        if (bArr6 != null && bArr6.length > 0) {
                            ql115.parseFrom(bArr6);
                        }
                        pl12.f184835A = ql115;
                    }
                    return 0;
                case 22:
                    pl12.f184836B = aVar3.mo141633k(intValue);
                    return 0;
                case 23:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i9 = 0; i9 < size7; i9++) {
                        byte[] bArr7 = j7.get(i9);
                        C50976ql1 ql116 = new C50976ql1();
                        if (bArr7 != null && bArr7.length > 0) {
                            ql116.parseFrom(bArr7);
                        }
                        pl12.f184837C = ql116;
                    }
                    return 0;
                case 24:
                    LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                    int size8 = j8.size();
                    for (int i15 = 0; i15 < size8; i15++) {
                        byte[] bArr8 = j8.get(i15);
                        C50976ql1 ql117 = new C50976ql1();
                        if (bArr8 != null && bArr8.length > 0) {
                            ql117.parseFrom(bArr8);
                        }
                        pl12.f184838D = ql117;
                    }
                    return 0;
                case 25:
                    pl12.f184839E = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
