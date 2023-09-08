package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.wr3 */
public class C90447wr3 extends C47465a {

    /* renamed from: d */
    public String f259934d;

    /* renamed from: e */
    public int f259935e;

    /* renamed from: f */
    public String f259936f;

    /* renamed from: g */
    public String f259937g;

    /* renamed from: h */
    public int f259938h;

    /* renamed from: i */
    public int f259939i;

    /* renamed from: j */
    public String f259940j;

    /* renamed from: n */
    public String f259941n;

    /* renamed from: o */
    public String f259942o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C90447wr3)) {
            return false;
        }
        C90447wr3 wr32 = (C90447wr3) aVar;
        return C46238a.m51546a(this.f259934d, wr32.f259934d) && C46238a.m51546a(Integer.valueOf(this.f259935e), Integer.valueOf(wr32.f259935e)) && C46238a.m51546a(this.f259936f, wr32.f259936f) && C46238a.m51546a(this.f259937g, wr32.f259937g) && C46238a.m51546a(Integer.valueOf(this.f259938h), Integer.valueOf(wr32.f259938h)) && C46238a.m51546a(Integer.valueOf(this.f259939i), Integer.valueOf(wr32.f259939i)) && C46238a.m51546a(this.f259940j, wr32.f259940j) && C46238a.m51546a(this.f259941n, wr32.f259941n) && C46238a.m51546a(this.f259942o, wr32.f259942o);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f259934d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f259935e);
            String str2 = this.f259936f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f259937g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            aVar.mo74318e(5, this.f259938h);
            aVar.mo74318e(6, this.f259939i);
            String str4 = this.f259940j;
            if (str4 != null) {
                aVar.mo74323j(7, str4);
            }
            String str5 = this.f259941n;
            if (str5 != null) {
                aVar.mo74323j(8, str5);
            }
            String str6 = this.f259942o;
            if (str6 != null) {
                aVar.mo74323j(9, str6);
            }
            return 0;
        } else if (i == 1) {
            String str7 = this.f259934d;
            if (str7 != null) {
                i2 = 0 + C52418a.m58683j(1, str7);
            }
            int e = i2 + C52418a.m58678e(2, this.f259935e);
            String str8 = this.f259936f;
            if (str8 != null) {
                e += C52418a.m58683j(3, str8);
            }
            String str9 = this.f259937g;
            if (str9 != null) {
                e += C52418a.m58683j(4, str9);
            }
            int e2 = e + C52418a.m58678e(5, this.f259938h) + C52418a.m58678e(6, this.f259939i);
            String str10 = this.f259940j;
            if (str10 != null) {
                e2 += C52418a.m58683j(7, str10);
            }
            String str11 = this.f259941n;
            if (str11 != null) {
                e2 += C52418a.m58683j(8, str11);
            }
            String str12 = this.f259942o;
            return str12 != null ? e2 + C52418a.m58683j(9, str12) : e2;
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
            C90447wr3 wr32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    wr32.f259934d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    wr32.f259935e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    wr32.f259936f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    wr32.f259937g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    wr32.f259938h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    wr32.f259939i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    wr32.f259940j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    wr32.f259941n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    wr32.f259942o = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
