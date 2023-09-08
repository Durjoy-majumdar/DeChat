package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.a73 */
public class C48676a73 extends C47465a {

    /* renamed from: d */
    public String f130343d;

    /* renamed from: e */
    public String f130344e;

    /* renamed from: f */
    public int f130345f;

    /* renamed from: g */
    public String f130346g;

    /* renamed from: h */
    public String f130347h;

    /* renamed from: i */
    public String f130348i;

    /* renamed from: j */
    public int f130349j;

    /* renamed from: n */
    public String f130350n;

    /* renamed from: o */
    public String f130351o;

    /* renamed from: p */
    public String f130352p;

    /* renamed from: q */
    public String f130353q;

    /* renamed from: r */
    public C48819b73 f130354r;

    /* renamed from: s */
    public String f130355s;

    /* renamed from: t */
    public String f130356t;

    /* renamed from: u */
    public int f130357u;

    /* renamed from: v */
    public String f130358v;

    /* renamed from: w */
    public String f130359w;

    /* renamed from: x */
    public long f130360x;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48676a73)) {
            return false;
        }
        C48676a73 a732 = (C48676a73) aVar;
        return C46238a.m51546a(this.f130343d, a732.f130343d) && C46238a.m51546a(this.f130344e, a732.f130344e) && C46238a.m51546a(Integer.valueOf(this.f130345f), Integer.valueOf(a732.f130345f)) && C46238a.m51546a(this.f130346g, a732.f130346g) && C46238a.m51546a(this.f130347h, a732.f130347h) && C46238a.m51546a(this.f130348i, a732.f130348i) && C46238a.m51546a(Integer.valueOf(this.f130349j), Integer.valueOf(a732.f130349j)) && C46238a.m51546a(this.f130350n, a732.f130350n) && C46238a.m51546a(this.f130351o, a732.f130351o) && C46238a.m51546a(this.f130352p, a732.f130352p) && C46238a.m51546a(this.f130353q, a732.f130353q) && C46238a.m51546a(this.f130354r, a732.f130354r) && C46238a.m51546a(this.f130355s, a732.f130355s) && C46238a.m51546a(this.f130356t, a732.f130356t) && C46238a.m51546a(Integer.valueOf(this.f130357u), Integer.valueOf(a732.f130357u)) && C46238a.m51546a(this.f130358v, a732.f130358v) && C46238a.m51546a(this.f130359w, a732.f130359w) && C46238a.m51546a(Long.valueOf(this.f130360x), Long.valueOf(a732.f130360x));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f130343d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f130344e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f130345f);
            String str3 = this.f130346g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f130347h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f130348i;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            aVar.mo74318e(7, this.f130349j);
            String str6 = this.f130350n;
            if (str6 != null) {
                aVar.mo74323j(8, str6);
            }
            String str7 = this.f130351o;
            if (str7 != null) {
                aVar.mo74323j(9, str7);
            }
            String str8 = this.f130352p;
            if (str8 != null) {
                aVar.mo74323j(10, str8);
            }
            String str9 = this.f130353q;
            if (str9 != null) {
                aVar.mo74323j(11, str9);
            }
            C48819b73 b732 = this.f130354r;
            if (b732 != null) {
                aVar.mo74322i(12, b732.computeSize());
                this.f130354r.writeFields(aVar);
            }
            String str10 = this.f130355s;
            if (str10 != null) {
                aVar.mo74323j(13, str10);
            }
            String str11 = this.f130356t;
            if (str11 != null) {
                aVar.mo74323j(14, str11);
            }
            aVar.mo74318e(15, this.f130357u);
            String str12 = this.f130358v;
            if (str12 != null) {
                aVar.mo74323j(16, str12);
            }
            String str13 = this.f130359w;
            if (str13 != null) {
                aVar.mo74323j(17, str13);
            }
            aVar.mo74321h(18, this.f130360x);
            return 0;
        } else if (i2 == 1) {
            String str14 = this.f130343d;
            if (str14 != null) {
                i3 = C52418a.m58683j(1, str14) + 0;
            }
            String str15 = this.f130344e;
            if (str15 != null) {
                i3 += C52418a.m58683j(2, str15);
            }
            int e = i3 + C52418a.m58678e(3, this.f130345f);
            String str16 = this.f130346g;
            if (str16 != null) {
                e += C52418a.m58683j(4, str16);
            }
            String str17 = this.f130347h;
            if (str17 != null) {
                e += C52418a.m58683j(5, str17);
            }
            String str18 = this.f130348i;
            if (str18 != null) {
                e += C52418a.m58683j(6, str18);
            }
            int e2 = e + C52418a.m58678e(7, this.f130349j);
            String str19 = this.f130350n;
            if (str19 != null) {
                e2 += C52418a.m58683j(8, str19);
            }
            String str20 = this.f130351o;
            if (str20 != null) {
                e2 += C52418a.m58683j(9, str20);
            }
            String str21 = this.f130352p;
            if (str21 != null) {
                e2 += C52418a.m58683j(10, str21);
            }
            String str22 = this.f130353q;
            if (str22 != null) {
                e2 += C52418a.m58683j(11, str22);
            }
            C48819b73 b733 = this.f130354r;
            if (b733 != null) {
                e2 += C52418a.m58682i(12, b733.computeSize());
            }
            String str23 = this.f130355s;
            if (str23 != null) {
                e2 += C52418a.m58683j(13, str23);
            }
            String str24 = this.f130356t;
            if (str24 != null) {
                e2 += C52418a.m58683j(14, str24);
            }
            int e3 = e2 + C52418a.m58678e(15, this.f130357u);
            String str25 = this.f130358v;
            if (str25 != null) {
                e3 += C52418a.m58683j(16, str25);
            }
            String str26 = this.f130359w;
            if (str26 != null) {
                e3 += C52418a.m58683j(17, str26);
            }
            return e3 + C52418a.m58681h(18, this.f130360x);
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
            C48676a73 a732 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    a732.f130343d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    a732.f130344e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    a732.f130345f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    a732.f130346g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    a732.f130347h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    a732.f130348i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    a732.f130349j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    a732.f130350n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    a732.f130351o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    a732.f130352p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    a732.f130353q = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C48819b73 b734 = new C48819b73();
                        if (bArr != null && bArr.length > 0) {
                            b734.parseFrom(bArr);
                        }
                        a732.f130354r = b734;
                    }
                    return 0;
                case 13:
                    a732.f130355s = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    a732.f130356t = aVar3.mo141633k(intValue);
                    return 0;
                case 15:
                    a732.f130357u = aVar3.mo141629g(intValue);
                    return 0;
                case 16:
                    a732.f130358v = aVar3.mo141633k(intValue);
                    return 0;
                case 17:
                    a732.f130359w = aVar3.mo141633k(intValue);
                    return 0;
                case 18:
                    a732.f130360x = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
