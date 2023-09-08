package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.dw0 */
public class C64331dw0 extends C47465a {

    /* renamed from: A */
    public boolean f182875A;

    /* renamed from: d */
    public String f182876d;

    /* renamed from: e */
    public int f182877e;

    /* renamed from: f */
    public int f182878f;

    /* renamed from: g */
    public String f182879g;

    /* renamed from: h */
    public int f182880h;

    /* renamed from: i */
    public String f182881i;

    /* renamed from: j */
    public String f182882j;

    /* renamed from: n */
    public String f182883n;

    /* renamed from: o */
    public boolean f182884o;

    /* renamed from: p */
    public String f182885p;

    /* renamed from: q */
    public int f182886q;

    /* renamed from: r */
    public int f182887r;

    /* renamed from: s */
    public int f182888s;

    /* renamed from: t */
    public LinkedList<C51663v9> f182889t = new LinkedList<>();

    /* renamed from: u */
    public String f182890u;

    /* renamed from: v */
    public int f182891v;

    /* renamed from: w */
    public int f182892w;

    /* renamed from: x */
    public int f182893x;

    /* renamed from: y */
    public boolean f182894y;

    /* renamed from: z */
    public int f182895z;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64331dw0)) {
            return false;
        }
        C64331dw0 dw02 = (C64331dw0) aVar;
        return C46238a.m51546a(this.f182876d, dw02.f182876d) && C46238a.m51546a(Integer.valueOf(this.f182877e), Integer.valueOf(dw02.f182877e)) && C46238a.m51546a(Integer.valueOf(this.f182878f), Integer.valueOf(dw02.f182878f)) && C46238a.m51546a(this.f182879g, dw02.f182879g) && C46238a.m51546a(Integer.valueOf(this.f182880h), Integer.valueOf(dw02.f182880h)) && C46238a.m51546a(this.f182881i, dw02.f182881i) && C46238a.m51546a(this.f182882j, dw02.f182882j) && C46238a.m51546a(this.f182883n, dw02.f182883n) && C46238a.m51546a(Boolean.valueOf(this.f182884o), Boolean.valueOf(dw02.f182884o)) && C46238a.m51546a(this.f182885p, dw02.f182885p) && C46238a.m51546a(Integer.valueOf(this.f182886q), Integer.valueOf(dw02.f182886q)) && C46238a.m51546a(Integer.valueOf(this.f182887r), Integer.valueOf(dw02.f182887r)) && C46238a.m51546a(Integer.valueOf(this.f182888s), Integer.valueOf(dw02.f182888s)) && C46238a.m51546a(this.f182889t, dw02.f182889t) && C46238a.m51546a(this.f182890u, dw02.f182890u) && C46238a.m51546a(Integer.valueOf(this.f182891v), Integer.valueOf(dw02.f182891v)) && C46238a.m51546a(Integer.valueOf(this.f182892w), Integer.valueOf(dw02.f182892w)) && C46238a.m51546a(Integer.valueOf(this.f182893x), Integer.valueOf(dw02.f182893x)) && C46238a.m51546a(Boolean.valueOf(this.f182894y), Boolean.valueOf(dw02.f182894y)) && C46238a.m51546a(Integer.valueOf(this.f182895z), Integer.valueOf(dw02.f182895z)) && C46238a.m51546a(Boolean.valueOf(this.f182875A), Boolean.valueOf(dw02.f182875A));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f182876d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f182877e);
            aVar.mo74318e(3, this.f182878f);
            String str2 = this.f182879g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            aVar.mo74318e(5, this.f182880h);
            String str3 = this.f182881i;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            String str4 = this.f182882j;
            if (str4 != null) {
                aVar.mo74323j(7, str4);
            }
            String str5 = this.f182883n;
            if (str5 != null) {
                aVar.mo74323j(8, str5);
            }
            aVar.mo74314a(9, this.f182884o);
            String str6 = this.f182885p;
            if (str6 != null) {
                aVar.mo74323j(10, str6);
            }
            aVar.mo74318e(11, this.f182886q);
            aVar.mo74318e(12, this.f182887r);
            aVar.mo74318e(13, this.f182888s);
            aVar.mo74320g(14, 8, this.f182889t);
            String str7 = this.f182890u;
            if (str7 != null) {
                aVar.mo74323j(15, str7);
            }
            aVar.mo74318e(16, this.f182891v);
            aVar.mo74318e(17, this.f182892w);
            aVar.mo74318e(18, this.f182893x);
            aVar.mo74314a(19, this.f182894y);
            aVar.mo74318e(20, this.f182895z);
            aVar.mo74314a(21, this.f182875A);
            return 0;
        } else if (i2 == 1) {
            String str8 = this.f182876d;
            if (str8 != null) {
                i3 = C52418a.m58683j(1, str8) + 0;
            }
            int e = i3 + C52418a.m58678e(2, this.f182877e) + C52418a.m58678e(3, this.f182878f);
            String str9 = this.f182879g;
            if (str9 != null) {
                e += C52418a.m58683j(4, str9);
            }
            int e2 = e + C52418a.m58678e(5, this.f182880h);
            String str10 = this.f182881i;
            if (str10 != null) {
                e2 += C52418a.m58683j(6, str10);
            }
            String str11 = this.f182882j;
            if (str11 != null) {
                e2 += C52418a.m58683j(7, str11);
            }
            String str12 = this.f182883n;
            if (str12 != null) {
                e2 += C52418a.m58683j(8, str12);
            }
            int a = e2 + C52418a.m58674a(9, this.f182884o);
            String str13 = this.f182885p;
            if (str13 != null) {
                a += C52418a.m58683j(10, str13);
            }
            int e3 = a + C52418a.m58678e(11, this.f182886q) + C52418a.m58678e(12, this.f182887r) + C52418a.m58678e(13, this.f182888s) + C52418a.m58680g(14, 8, this.f182889t);
            String str14 = this.f182890u;
            if (str14 != null) {
                e3 += C52418a.m58683j(15, str14);
            }
            return e3 + C52418a.m58678e(16, this.f182891v) + C52418a.m58678e(17, this.f182892w) + C52418a.m58678e(18, this.f182893x) + C52418a.m58674a(19, this.f182894y) + C52418a.m58678e(20, this.f182895z) + C52418a.m58674a(21, this.f182875A);
        } else if (i2 == 2) {
            this.f182889t.clear();
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
            C64331dw0 dw02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    dw02.f182876d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    dw02.f182877e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    dw02.f182878f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    dw02.f182879g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    dw02.f182880h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    dw02.f182881i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    dw02.f182882j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    dw02.f182883n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    dw02.f182884o = aVar3.mo141625c(intValue);
                    return 0;
                case 10:
                    dw02.f182885p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    dw02.f182886q = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    dw02.f182887r = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    dw02.f182888s = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C51663v9 v9Var = new C51663v9();
                        if (bArr != null && bArr.length > 0) {
                            v9Var.parseFrom(bArr);
                        }
                        dw02.f182889t.add(v9Var);
                    }
                    return 0;
                case 15:
                    dw02.f182890u = aVar3.mo141633k(intValue);
                    return 0;
                case 16:
                    dw02.f182891v = aVar3.mo141629g(intValue);
                    return 0;
                case 17:
                    dw02.f182892w = aVar3.mo141629g(intValue);
                    return 0;
                case 18:
                    dw02.f182893x = aVar3.mo141629g(intValue);
                    return 0;
                case 19:
                    dw02.f182894y = aVar3.mo141625c(intValue);
                    return 0;
                case 20:
                    dw02.f182895z = aVar3.mo141629g(intValue);
                    return 0;
                case 21:
                    dw02.f182875A = aVar3.mo141625c(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
