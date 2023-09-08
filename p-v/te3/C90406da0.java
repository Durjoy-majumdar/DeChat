package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.da0 */
public class C90406da0 extends C47465a {

    /* renamed from: d */
    public String f259454d;

    /* renamed from: e */
    public int f259455e;

    /* renamed from: f */
    public String f259456f;

    /* renamed from: g */
    public String f259457g;

    /* renamed from: h */
    public int f259458h;

    /* renamed from: i */
    public String f259459i;

    /* renamed from: j */
    public String f259460j;

    /* renamed from: n */
    public String f259461n;

    /* renamed from: o */
    public int f259462o;

    /* renamed from: p */
    public String f259463p;

    /* renamed from: q */
    public int f259464q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C90406da0)) {
            return false;
        }
        C90406da0 da02 = (C90406da0) aVar;
        return C46238a.m51546a(this.f259454d, da02.f259454d) && C46238a.m51546a(Integer.valueOf(this.f259455e), Integer.valueOf(da02.f259455e)) && C46238a.m51546a(this.f259456f, da02.f259456f) && C46238a.m51546a(this.f259457g, da02.f259457g) && C46238a.m51546a(Integer.valueOf(this.f259458h), Integer.valueOf(da02.f259458h)) && C46238a.m51546a(this.f259459i, da02.f259459i) && C46238a.m51546a(this.f259460j, da02.f259460j) && C46238a.m51546a(this.f259461n, da02.f259461n) && C46238a.m51546a(Integer.valueOf(this.f259462o), Integer.valueOf(da02.f259462o)) && C46238a.m51546a(this.f259463p, da02.f259463p) && C46238a.m51546a(Integer.valueOf(this.f259464q), Integer.valueOf(da02.f259464q));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f259454d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f259455e);
            String str2 = this.f259456f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f259457g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            aVar.mo74318e(5, this.f259458h);
            String str4 = this.f259459i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            String str5 = this.f259460j;
            if (str5 != null) {
                aVar.mo74323j(7, str5);
            }
            String str6 = this.f259461n;
            if (str6 != null) {
                aVar.mo74323j(8, str6);
            }
            aVar.mo74318e(9, this.f259462o);
            String str7 = this.f259463p;
            if (str7 != null) {
                aVar.mo74323j(10, str7);
            }
            aVar.mo74318e(11, this.f259464q);
            return 0;
        } else if (i == 1) {
            String str8 = this.f259454d;
            if (str8 != null) {
                i2 = 0 + C52418a.m58683j(1, str8);
            }
            int e = i2 + C52418a.m58678e(2, this.f259455e);
            String str9 = this.f259456f;
            if (str9 != null) {
                e += C52418a.m58683j(3, str9);
            }
            String str10 = this.f259457g;
            if (str10 != null) {
                e += C52418a.m58683j(4, str10);
            }
            int e2 = e + C52418a.m58678e(5, this.f259458h);
            String str11 = this.f259459i;
            if (str11 != null) {
                e2 += C52418a.m58683j(6, str11);
            }
            String str12 = this.f259460j;
            if (str12 != null) {
                e2 += C52418a.m58683j(7, str12);
            }
            String str13 = this.f259461n;
            if (str13 != null) {
                e2 += C52418a.m58683j(8, str13);
            }
            int e3 = e2 + C52418a.m58678e(9, this.f259462o);
            String str14 = this.f259463p;
            if (str14 != null) {
                e3 += C52418a.m58683j(10, str14);
            }
            return e3 + C52418a.m58678e(11, this.f259464q);
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
            C90406da0 da02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    da02.f259454d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    da02.f259455e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    da02.f259456f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    da02.f259457g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    da02.f259458h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    da02.f259459i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    da02.f259460j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    da02.f259461n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    da02.f259462o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    da02.f259463p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    da02.f259464q = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
