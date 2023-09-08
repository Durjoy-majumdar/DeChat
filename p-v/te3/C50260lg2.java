package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.lg2 */
public class C50260lg2 extends C47465a {

    /* renamed from: d */
    public String f137403d;

    /* renamed from: e */
    public String f137404e;

    /* renamed from: f */
    public String f137405f;

    /* renamed from: g */
    public int f137406g;

    /* renamed from: h */
    public int f137407h;

    /* renamed from: i */
    public String f137408i;

    /* renamed from: j */
    public String f137409j;

    /* renamed from: n */
    public String f137410n;

    /* renamed from: o */
    public int f137411o;

    /* renamed from: p */
    public int f137412p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50260lg2)) {
            return false;
        }
        C50260lg2 lg22 = (C50260lg2) aVar;
        return C46238a.m51546a(this.f137403d, lg22.f137403d) && C46238a.m51546a(this.f137404e, lg22.f137404e) && C46238a.m51546a(this.f137405f, lg22.f137405f) && C46238a.m51546a(Integer.valueOf(this.f137406g), Integer.valueOf(lg22.f137406g)) && C46238a.m51546a(Integer.valueOf(this.f137407h), Integer.valueOf(lg22.f137407h)) && C46238a.m51546a(this.f137408i, lg22.f137408i) && C46238a.m51546a(this.f137409j, lg22.f137409j) && C46238a.m51546a(this.f137410n, lg22.f137410n) && C46238a.m51546a(Integer.valueOf(this.f137411o), Integer.valueOf(lg22.f137411o)) && C46238a.m51546a(Integer.valueOf(this.f137412p), Integer.valueOf(lg22.f137412p));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f137403d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f137404e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f137405f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            aVar.mo74318e(4, this.f137406g);
            aVar.mo74318e(5, this.f137407h);
            String str4 = this.f137408i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            String str5 = this.f137409j;
            if (str5 != null) {
                aVar.mo74323j(7, str5);
            }
            String str6 = this.f137410n;
            if (str6 != null) {
                aVar.mo74323j(8, str6);
            }
            aVar.mo74318e(9, this.f137411o);
            aVar.mo74318e(10, this.f137412p);
            return 0;
        } else if (i == 1) {
            String str7 = this.f137403d;
            if (str7 != null) {
                i2 = 0 + C52418a.m58683j(1, str7);
            }
            String str8 = this.f137404e;
            if (str8 != null) {
                i2 += C52418a.m58683j(2, str8);
            }
            String str9 = this.f137405f;
            if (str9 != null) {
                i2 += C52418a.m58683j(3, str9);
            }
            int e = i2 + C52418a.m58678e(4, this.f137406g) + C52418a.m58678e(5, this.f137407h);
            String str10 = this.f137408i;
            if (str10 != null) {
                e += C52418a.m58683j(6, str10);
            }
            String str11 = this.f137409j;
            if (str11 != null) {
                e += C52418a.m58683j(7, str11);
            }
            String str12 = this.f137410n;
            if (str12 != null) {
                e += C52418a.m58683j(8, str12);
            }
            return e + C52418a.m58678e(9, this.f137411o) + C52418a.m58678e(10, this.f137412p);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C50260lg2 lg22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    lg22.f137403d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    lg22.f137404e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    lg22.f137405f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    lg22.f137406g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    lg22.f137407h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    lg22.f137408i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    lg22.f137409j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    lg22.f137410n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    lg22.f137411o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    lg22.f137412p = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
