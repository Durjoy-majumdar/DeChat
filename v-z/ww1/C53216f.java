package ww1;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: ww1.f */
public class C53216f extends C47465a {

    /* renamed from: d */
    public String f148451d;

    /* renamed from: e */
    public String f148452e;

    /* renamed from: f */
    public String f148453f;

    /* renamed from: g */
    public String f148454g;

    /* renamed from: h */
    public int f148455h;

    /* renamed from: i */
    public int f148456i;

    /* renamed from: j */
    public int f148457j;

    /* renamed from: n */
    public int f148458n;

    /* renamed from: o */
    public String f148459o;

    /* renamed from: p */
    public String f148460p;

    /* renamed from: q */
    public String f148461q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C53216f)) {
            return false;
        }
        C53216f fVar = (C53216f) aVar;
        return C46238a.m51546a(this.f148451d, fVar.f148451d) && C46238a.m51546a(this.f148452e, fVar.f148452e) && C46238a.m51546a(this.f148453f, fVar.f148453f) && C46238a.m51546a(this.f148454g, fVar.f148454g) && C46238a.m51546a(Integer.valueOf(this.f148455h), Integer.valueOf(fVar.f148455h)) && C46238a.m51546a(Integer.valueOf(this.f148456i), Integer.valueOf(fVar.f148456i)) && C46238a.m51546a(Integer.valueOf(this.f148457j), Integer.valueOf(fVar.f148457j)) && C46238a.m51546a(Integer.valueOf(this.f148458n), Integer.valueOf(fVar.f148458n)) && C46238a.m51546a(this.f148459o, fVar.f148459o) && C46238a.m51546a(this.f148460p, fVar.f148460p) && C46238a.m51546a(this.f148461q, fVar.f148461q);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f148451d;
            if (str != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                String str2 = this.f148452e;
                if (str2 != null) {
                    aVar.mo74323j(2, str2);
                }
                String str3 = this.f148453f;
                if (str3 != null) {
                    aVar.mo74323j(3, str3);
                }
                String str4 = this.f148454g;
                if (str4 != null) {
                    aVar.mo74323j(4, str4);
                }
                aVar.mo74318e(5, this.f148455h);
                aVar.mo74318e(6, this.f148456i);
                aVar.mo74318e(7, this.f148457j);
                aVar.mo74318e(8, this.f148458n);
                String str5 = this.f148459o;
                if (str5 != null) {
                    aVar.mo74323j(9, str5);
                }
                String str6 = this.f148460p;
                if (str6 != null) {
                    aVar.mo74323j(10, str6);
                }
                String str7 = this.f148461q;
                if (str7 != null) {
                    aVar.mo74323j(11, str7);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: appid");
        } else if (i == 1) {
            String str8 = this.f148451d;
            if (str8 != null) {
                i2 = 0 + C52418a.m58683j(1, str8);
            }
            String str9 = this.f148452e;
            if (str9 != null) {
                i2 += C52418a.m58683j(2, str9);
            }
            String str10 = this.f148453f;
            if (str10 != null) {
                i2 += C52418a.m58683j(3, str10);
            }
            String str11 = this.f148454g;
            if (str11 != null) {
                i2 += C52418a.m58683j(4, str11);
            }
            int e = i2 + C52418a.m58678e(5, this.f148455h) + C52418a.m58678e(6, this.f148456i) + C52418a.m58678e(7, this.f148457j) + C52418a.m58678e(8, this.f148458n);
            String str12 = this.f148459o;
            if (str12 != null) {
                e += C52418a.m58683j(9, str12);
            }
            String str13 = this.f148460p;
            if (str13 != null) {
                e += C52418a.m58683j(10, str13);
            }
            String str14 = this.f148461q;
            return str14 != null ? e + C52418a.m58683j(11, str14) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f148451d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: appid");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C53216f fVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    fVar.f148451d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    fVar.f148452e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    fVar.f148453f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    fVar.f148454g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    fVar.f148455h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    fVar.f148456i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    fVar.f148457j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    fVar.f148458n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    fVar.f148459o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    fVar.f148460p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    fVar.f148461q = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
