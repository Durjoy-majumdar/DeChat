package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.j53 */
public class C77951j53 extends C47465a {

    /* renamed from: d */
    public int f227645d;

    /* renamed from: e */
    public C64485k53 f227646e;

    /* renamed from: f */
    public int f227647f;

    /* renamed from: g */
    public String f227648g;

    /* renamed from: h */
    public String f227649h;

    /* renamed from: i */
    public String f227650i;

    /* renamed from: j */
    public String f227651j;

    /* renamed from: n */
    public String f227652n;

    /* renamed from: o */
    public String f227653o;

    /* renamed from: p */
    public String f227654p;

    /* renamed from: q */
    public String f227655q;

    /* renamed from: r */
    public String f227656r;

    /* renamed from: s */
    public int f227657s;

    /* renamed from: t */
    public String f227658t;

    /* renamed from: u */
    public String f227659u;

    /* renamed from: v */
    public String f227660v;

    /* renamed from: w */
    public String f227661w;

    /* renamed from: x */
    public String f227662x;

    /* renamed from: y */
    public String f227663y;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77951j53)) {
            return false;
        }
        C77951j53 j532 = (C77951j53) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f227645d), Integer.valueOf(j532.f227645d)) && C46238a.m51546a(this.f227646e, j532.f227646e) && C46238a.m51546a(Integer.valueOf(this.f227647f), Integer.valueOf(j532.f227647f)) && C46238a.m51546a(this.f227648g, j532.f227648g) && C46238a.m51546a(this.f227649h, j532.f227649h) && C46238a.m51546a(this.f227650i, j532.f227650i) && C46238a.m51546a(this.f227651j, j532.f227651j) && C46238a.m51546a(this.f227652n, j532.f227652n) && C46238a.m51546a(this.f227653o, j532.f227653o) && C46238a.m51546a(this.f227654p, j532.f227654p) && C46238a.m51546a(this.f227655q, j532.f227655q) && C46238a.m51546a(this.f227656r, j532.f227656r) && C46238a.m51546a(Integer.valueOf(this.f227657s), Integer.valueOf(j532.f227657s)) && C46238a.m51546a(this.f227658t, j532.f227658t) && C46238a.m51546a(this.f227659u, j532.f227659u) && C46238a.m51546a(this.f227660v, j532.f227660v) && C46238a.m51546a(this.f227661w, j532.f227661w) && C46238a.m51546a(this.f227662x, j532.f227662x) && C46238a.m51546a(this.f227663y, j532.f227663y);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f227645d);
            C64485k53 k532 = this.f227646e;
            if (k532 != null) {
                aVar.mo74322i(2, k532.computeSize());
                this.f227646e.writeFields(aVar);
            }
            aVar.mo74318e(3, this.f227647f);
            String str = this.f227648g;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            String str2 = this.f227649h;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            String str3 = this.f227650i;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            String str4 = this.f227651j;
            if (str4 != null) {
                aVar.mo74323j(7, str4);
            }
            String str5 = this.f227652n;
            if (str5 != null) {
                aVar.mo74323j(8, str5);
            }
            String str6 = this.f227653o;
            if (str6 != null) {
                aVar.mo74323j(9, str6);
            }
            String str7 = this.f227654p;
            if (str7 != null) {
                aVar.mo74323j(10, str7);
            }
            String str8 = this.f227655q;
            if (str8 != null) {
                aVar.mo74323j(11, str8);
            }
            String str9 = this.f227656r;
            if (str9 != null) {
                aVar.mo74323j(12, str9);
            }
            aVar.mo74318e(13, this.f227657s);
            String str10 = this.f227658t;
            if (str10 != null) {
                aVar.mo74323j(14, str10);
            }
            String str11 = this.f227659u;
            if (str11 != null) {
                aVar.mo74323j(15, str11);
            }
            String str12 = this.f227660v;
            if (str12 != null) {
                aVar.mo74323j(16, str12);
            }
            String str13 = this.f227661w;
            if (str13 != null) {
                aVar.mo74323j(17, str13);
            }
            String str14 = this.f227662x;
            if (str14 != null) {
                aVar.mo74323j(18, str14);
            }
            String str15 = this.f227663y;
            if (str15 != null) {
                aVar.mo74323j(19, str15);
            }
            return 0;
        } else if (i2 == 1) {
            int e = C52418a.m58678e(1, this.f227645d) + 0;
            C64485k53 k533 = this.f227646e;
            if (k533 != null) {
                e += C52418a.m58682i(2, k533.computeSize());
            }
            int e2 = e + C52418a.m58678e(3, this.f227647f);
            String str16 = this.f227648g;
            if (str16 != null) {
                e2 += C52418a.m58683j(4, str16);
            }
            String str17 = this.f227649h;
            if (str17 != null) {
                e2 += C52418a.m58683j(5, str17);
            }
            String str18 = this.f227650i;
            if (str18 != null) {
                e2 += C52418a.m58683j(6, str18);
            }
            String str19 = this.f227651j;
            if (str19 != null) {
                e2 += C52418a.m58683j(7, str19);
            }
            String str20 = this.f227652n;
            if (str20 != null) {
                e2 += C52418a.m58683j(8, str20);
            }
            String str21 = this.f227653o;
            if (str21 != null) {
                e2 += C52418a.m58683j(9, str21);
            }
            String str22 = this.f227654p;
            if (str22 != null) {
                e2 += C52418a.m58683j(10, str22);
            }
            String str23 = this.f227655q;
            if (str23 != null) {
                e2 += C52418a.m58683j(11, str23);
            }
            String str24 = this.f227656r;
            if (str24 != null) {
                e2 += C52418a.m58683j(12, str24);
            }
            int e3 = e2 + C52418a.m58678e(13, this.f227657s);
            String str25 = this.f227658t;
            if (str25 != null) {
                e3 += C52418a.m58683j(14, str25);
            }
            String str26 = this.f227659u;
            if (str26 != null) {
                e3 += C52418a.m58683j(15, str26);
            }
            String str27 = this.f227660v;
            if (str27 != null) {
                e3 += C52418a.m58683j(16, str27);
            }
            String str28 = this.f227661w;
            if (str28 != null) {
                e3 += C52418a.m58683j(17, str28);
            }
            String str29 = this.f227662x;
            if (str29 != null) {
                e3 += C52418a.m58683j(18, str29);
            }
            String str30 = this.f227663y;
            return str30 != null ? e3 + C52418a.m58683j(19, str30) : e3;
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
            C77951j53 j532 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    j532.f227645d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C64485k53 k534 = new C64485k53();
                        if (bArr != null && bArr.length > 0) {
                            k534.parseFrom(bArr);
                        }
                        j532.f227646e = k534;
                    }
                    return 0;
                case 3:
                    j532.f227647f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    j532.f227648g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    j532.f227649h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    j532.f227650i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    j532.f227651j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    j532.f227652n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    j532.f227653o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    j532.f227654p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    j532.f227655q = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    j532.f227656r = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    j532.f227657s = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    j532.f227658t = aVar3.mo141633k(intValue);
                    return 0;
                case 15:
                    j532.f227659u = aVar3.mo141633k(intValue);
                    return 0;
                case 16:
                    j532.f227660v = aVar3.mo141633k(intValue);
                    return 0;
                case 17:
                    j532.f227661w = aVar3.mo141633k(intValue);
                    return 0;
                case 18:
                    j532.f227662x = aVar3.mo141633k(intValue);
                    return 0;
                case 19:
                    j532.f227663y = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
