package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.l80 */
public class C50228l80 extends C47465a {

    /* renamed from: d */
    public String f137244d;

    /* renamed from: e */
    public String f137245e;

    /* renamed from: f */
    public String f137246f;

    /* renamed from: g */
    public String f137247g;

    /* renamed from: h */
    public String f137248h;

    /* renamed from: i */
    public int f137249i;

    /* renamed from: j */
    public int f137250j;

    /* renamed from: n */
    public String f137251n;

    /* renamed from: o */
    public int f137252o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50228l80)) {
            return false;
        }
        C50228l80 l802 = (C50228l80) aVar;
        return C46238a.m51546a(this.f137244d, l802.f137244d) && C46238a.m51546a(this.f137245e, l802.f137245e) && C46238a.m51546a(this.f137246f, l802.f137246f) && C46238a.m51546a(this.f137247g, l802.f137247g) && C46238a.m51546a(this.f137248h, l802.f137248h) && C46238a.m51546a(Integer.valueOf(this.f137249i), Integer.valueOf(l802.f137249i)) && C46238a.m51546a(Integer.valueOf(this.f137250j), Integer.valueOf(l802.f137250j)) && C46238a.m51546a(this.f137251n, l802.f137251n) && C46238a.m51546a(Integer.valueOf(this.f137252o), Integer.valueOf(l802.f137252o));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f137244d;
            if (str == null) {
                throw new C52419b("Not all required fields were included: BegWord");
            } else if (this.f137245e == null) {
                throw new C52419b("Not all required fields were included: BegPicUrl");
            } else if (this.f137246f != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                String str2 = this.f137245e;
                if (str2 != null) {
                    aVar.mo74323j(2, str2);
                }
                String str3 = this.f137246f;
                if (str3 != null) {
                    aVar.mo74323j(3, str3);
                }
                String str4 = this.f137247g;
                if (str4 != null) {
                    aVar.mo74323j(4, str4);
                }
                String str5 = this.f137248h;
                if (str5 != null) {
                    aVar.mo74323j(5, str5);
                }
                aVar.mo74318e(6, this.f137249i);
                aVar.mo74318e(7, this.f137250j);
                String str6 = this.f137251n;
                if (str6 != null) {
                    aVar.mo74323j(8, str6);
                }
                aVar.mo74318e(9, this.f137252o);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: ThanksPicUrl");
            }
        } else if (i == 1) {
            String str7 = this.f137244d;
            if (str7 != null) {
                i2 = 0 + C52418a.m58683j(1, str7);
            }
            String str8 = this.f137245e;
            if (str8 != null) {
                i2 += C52418a.m58683j(2, str8);
            }
            String str9 = this.f137246f;
            if (str9 != null) {
                i2 += C52418a.m58683j(3, str9);
            }
            String str10 = this.f137247g;
            if (str10 != null) {
                i2 += C52418a.m58683j(4, str10);
            }
            String str11 = this.f137248h;
            if (str11 != null) {
                i2 += C52418a.m58683j(5, str11);
            }
            int e = i2 + C52418a.m58678e(6, this.f137249i) + C52418a.m58678e(7, this.f137250j);
            String str12 = this.f137251n;
            if (str12 != null) {
                e += C52418a.m58683j(8, str12);
            }
            return e + C52418a.m58678e(9, this.f137252o);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f137244d == null) {
                throw new C52419b("Not all required fields were included: BegWord");
            } else if (this.f137245e == null) {
                throw new C52419b("Not all required fields were included: BegPicUrl");
            } else if (this.f137246f != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: ThanksPicUrl");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C50228l80 l802 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    l802.f137244d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    l802.f137245e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    l802.f137246f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    l802.f137247g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    l802.f137248h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    l802.f137249i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    l802.f137250j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    l802.f137251n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    l802.f137252o = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
