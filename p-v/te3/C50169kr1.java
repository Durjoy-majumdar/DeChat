package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.kr1 */
public class C50169kr1 extends C47465a {

    /* renamed from: d */
    public String f137001d;

    /* renamed from: e */
    public String f137002e;

    /* renamed from: f */
    public String f137003f;

    /* renamed from: g */
    public String f137004g;

    /* renamed from: h */
    public String f137005h;

    /* renamed from: i */
    public long f137006i;

    /* renamed from: j */
    public String f137007j;

    /* renamed from: n */
    public int f137008n;

    /* renamed from: o */
    public int f137009o;

    /* renamed from: p */
    public String f137010p;

    /* renamed from: q */
    public int f137011q;

    /* renamed from: r */
    public C48899bs1 f137012r;

    /* renamed from: s */
    public int f137013s;

    /* renamed from: t */
    public int f137014t;

    /* renamed from: u */
    public c05 f137015u;

    /* renamed from: v */
    public int f137016v;

    /* renamed from: w */
    public boolean f137017w;

    /* renamed from: x */
    public String f137018x;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50169kr1)) {
            return false;
        }
        C50169kr1 kr12 = (C50169kr1) aVar;
        return C46238a.m51546a(this.f137001d, kr12.f137001d) && C46238a.m51546a(this.f137002e, kr12.f137002e) && C46238a.m51546a(this.f137003f, kr12.f137003f) && C46238a.m51546a(this.f137004g, kr12.f137004g) && C46238a.m51546a(this.f137005h, kr12.f137005h) && C46238a.m51546a(Long.valueOf(this.f137006i), Long.valueOf(kr12.f137006i)) && C46238a.m51546a(this.f137007j, kr12.f137007j) && C46238a.m51546a(Integer.valueOf(this.f137008n), Integer.valueOf(kr12.f137008n)) && C46238a.m51546a(Integer.valueOf(this.f137009o), Integer.valueOf(kr12.f137009o)) && C46238a.m51546a(this.f137010p, kr12.f137010p) && C46238a.m51546a(Integer.valueOf(this.f137011q), Integer.valueOf(kr12.f137011q)) && C46238a.m51546a(this.f137012r, kr12.f137012r) && C46238a.m51546a(Integer.valueOf(this.f137013s), Integer.valueOf(kr12.f137013s)) && C46238a.m51546a(Integer.valueOf(this.f137014t), Integer.valueOf(kr12.f137014t)) && C46238a.m51546a(this.f137015u, kr12.f137015u) && C46238a.m51546a(Integer.valueOf(this.f137016v), Integer.valueOf(kr12.f137016v)) && C46238a.m51546a(Boolean.valueOf(this.f137017w), Boolean.valueOf(kr12.f137017w)) && C46238a.m51546a(this.f137018x, kr12.f137018x);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f137001d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f137002e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f137003f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f137004g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f137005h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            aVar.mo74321h(6, this.f137006i);
            String str6 = this.f137007j;
            if (str6 != null) {
                aVar.mo74323j(7, str6);
            }
            aVar.mo74318e(8, this.f137008n);
            aVar.mo74318e(9, this.f137009o);
            String str7 = this.f137010p;
            if (str7 != null) {
                aVar.mo74323j(10, str7);
            }
            aVar.mo74318e(11, this.f137011q);
            C48899bs1 bs12 = this.f137012r;
            if (bs12 != null) {
                aVar.mo74322i(12, bs12.computeSize());
                this.f137012r.writeFields(aVar);
            }
            aVar.mo74318e(13, this.f137013s);
            aVar.mo74318e(14, this.f137014t);
            c05 c05 = this.f137015u;
            if (c05 != null) {
                aVar.mo74322i(15, c05.computeSize());
                this.f137015u.writeFields(aVar);
            }
            aVar.mo74318e(16, this.f137016v);
            aVar.mo74314a(17, this.f137017w);
            String str8 = this.f137018x;
            if (str8 != null) {
                aVar.mo74323j(18, str8);
            }
            return 0;
        } else if (i2 == 1) {
            String str9 = this.f137001d;
            if (str9 != null) {
                i3 = C52418a.m58683j(1, str9) + 0;
            }
            String str10 = this.f137002e;
            if (str10 != null) {
                i3 += C52418a.m58683j(2, str10);
            }
            String str11 = this.f137003f;
            if (str11 != null) {
                i3 += C52418a.m58683j(3, str11);
            }
            String str12 = this.f137004g;
            if (str12 != null) {
                i3 += C52418a.m58683j(4, str12);
            }
            String str13 = this.f137005h;
            if (str13 != null) {
                i3 += C52418a.m58683j(5, str13);
            }
            int h = i3 + C52418a.m58681h(6, this.f137006i);
            String str14 = this.f137007j;
            if (str14 != null) {
                h += C52418a.m58683j(7, str14);
            }
            int e = h + C52418a.m58678e(8, this.f137008n) + C52418a.m58678e(9, this.f137009o);
            String str15 = this.f137010p;
            if (str15 != null) {
                e += C52418a.m58683j(10, str15);
            }
            int e2 = e + C52418a.m58678e(11, this.f137011q);
            C48899bs1 bs13 = this.f137012r;
            if (bs13 != null) {
                e2 += C52418a.m58682i(12, bs13.computeSize());
            }
            int e3 = e2 + C52418a.m58678e(13, this.f137013s) + C52418a.m58678e(14, this.f137014t);
            c05 c052 = this.f137015u;
            if (c052 != null) {
                e3 += C52418a.m58682i(15, c052.computeSize());
            }
            int e4 = e3 + C52418a.m58678e(16, this.f137016v) + C52418a.m58674a(17, this.f137017w);
            String str16 = this.f137018x;
            return str16 != null ? e4 + C52418a.m58683j(18, str16) : e4;
        } else if (i2 == 2) {
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
            C50169kr1 kr12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    kr12.f137001d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    kr12.f137002e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    kr12.f137003f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    kr12.f137004g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    kr12.f137005h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    kr12.f137006i = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    kr12.f137007j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    kr12.f137008n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    kr12.f137009o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    kr12.f137010p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    kr12.f137011q = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C48899bs1 bs14 = new C48899bs1();
                        if (bArr != null && bArr.length > 0) {
                            bs14.parseFrom(bArr);
                        }
                        kr12.f137012r = bs14;
                    }
                    return 0;
                case 13:
                    kr12.f137013s = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    kr12.f137014t = aVar3.mo141629g(intValue);
                    return 0;
                case 15:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        c05 c053 = new c05();
                        if (bArr2 != null && bArr2.length > 0) {
                            c053.parseFrom(bArr2);
                        }
                        kr12.f137015u = c053;
                    }
                    return 0;
                case 16:
                    kr12.f137016v = aVar3.mo141629g(intValue);
                    return 0;
                case 17:
                    kr12.f137017w = aVar3.mo141625c(intValue);
                    return 0;
                case 18:
                    kr12.f137018x = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
