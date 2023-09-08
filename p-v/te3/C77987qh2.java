package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.qh2 */
public class C77987qh2 extends C47465a {

    /* renamed from: d */
    public String f228126d;

    /* renamed from: e */
    public String f228127e;

    /* renamed from: f */
    public String f228128f;

    /* renamed from: g */
    public String f228129g;

    /* renamed from: h */
    public String f228130h;

    /* renamed from: i */
    public String f228131i;

    /* renamed from: j */
    public String f228132j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77987qh2)) {
            return false;
        }
        C77987qh2 qh22 = (C77987qh2) aVar;
        return C46238a.m51546a(this.f228126d, qh22.f228126d) && C46238a.m51546a(this.f228127e, qh22.f228127e) && C46238a.m51546a(this.f228128f, qh22.f228128f) && C46238a.m51546a(this.f228129g, qh22.f228129g) && C46238a.m51546a(this.f228130h, qh22.f228130h) && C46238a.m51546a(this.f228131i, qh22.f228131i) && C46238a.m51546a(this.f228132j, qh22.f228132j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f228126d;
            if (str == null) {
                throw new C52419b("Not all required fields were included: product_id");
            } else if (this.f228127e == null) {
                throw new C52419b("Not all required fields were included: price");
            } else if (this.f228128f == null) {
                throw new C52419b("Not all required fields were included: currency_type");
            } else if (this.f228129g != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                String str2 = this.f228127e;
                if (str2 != null) {
                    aVar.mo74323j(2, str2);
                }
                String str3 = this.f228128f;
                if (str3 != null) {
                    aVar.mo74323j(3, str3);
                }
                String str4 = this.f228129g;
                if (str4 != null) {
                    aVar.mo74323j(4, str4);
                }
                String str5 = this.f228130h;
                if (str5 != null) {
                    aVar.mo74323j(5, str5);
                }
                String str6 = this.f228131i;
                if (str6 != null) {
                    aVar.mo74323j(6, str6);
                }
                String str7 = this.f228132j;
                if (str7 != null) {
                    aVar.mo74323j(7, str7);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: session_data");
            }
        } else if (i == 1) {
            String str8 = this.f228126d;
            if (str8 != null) {
                i2 = 0 + C52418a.m58683j(1, str8);
            }
            String str9 = this.f228127e;
            if (str9 != null) {
                i2 += C52418a.m58683j(2, str9);
            }
            String str10 = this.f228128f;
            if (str10 != null) {
                i2 += C52418a.m58683j(3, str10);
            }
            String str11 = this.f228129g;
            if (str11 != null) {
                i2 += C52418a.m58683j(4, str11);
            }
            String str12 = this.f228130h;
            if (str12 != null) {
                i2 += C52418a.m58683j(5, str12);
            }
            String str13 = this.f228131i;
            if (str13 != null) {
                i2 += C52418a.m58683j(6, str13);
            }
            String str14 = this.f228132j;
            return str14 != null ? i2 + C52418a.m58683j(7, str14) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f228126d == null) {
                throw new C52419b("Not all required fields were included: product_id");
            } else if (this.f228127e == null) {
                throw new C52419b("Not all required fields were included: price");
            } else if (this.f228128f == null) {
                throw new C52419b("Not all required fields were included: currency_type");
            } else if (this.f228129g != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: session_data");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C77987qh2 qh22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    qh22.f228126d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    qh22.f228127e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    qh22.f228128f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    qh22.f228129g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    qh22.f228130h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    qh22.f228131i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    qh22.f228132j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
