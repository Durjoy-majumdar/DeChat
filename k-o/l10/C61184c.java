package l10;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: l10.c */
public class C61184c extends C47465a {

    /* renamed from: d */
    public int f174173d;

    /* renamed from: e */
    public String f174174e;

    /* renamed from: f */
    public String f174175f;

    /* renamed from: g */
    public String f174176g;

    /* renamed from: h */
    public String f174177h;

    /* renamed from: i */
    public String f174178i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C61184c)) {
            return false;
        }
        C61184c cVar = (C61184c) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f174173d), Integer.valueOf(cVar.f174173d)) && C46238a.m51546a(this.f174174e, cVar.f174174e) && C46238a.m51546a(this.f174175f, cVar.f174175f) && C46238a.m51546a(this.f174176g, cVar.f174176g) && C46238a.m51546a(this.f174177h, cVar.f174177h) && C46238a.m51546a(this.f174178i, cVar.f174178i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f174174e == null) {
                throw new C52419b("Not all required fields were included: url");
            } else if (this.f174175f == null) {
                throw new C52419b("Not all required fields were included: urlToken");
            } else if (this.f174176g == null) {
                throw new C52419b("Not all required fields were included: thumbUrl");
            } else if (this.f174177h == null) {
                throw new C52419b("Not all required fields were included: thumbUrlToken");
            } else if (this.f174178i != null) {
                aVar.mo74318e(1, this.f174173d);
                String str = this.f174174e;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                String str2 = this.f174175f;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                String str3 = this.f174176g;
                if (str3 != null) {
                    aVar.mo74323j(4, str3);
                }
                String str4 = this.f174177h;
                if (str4 != null) {
                    aVar.mo74323j(5, str4);
                }
                String str5 = this.f174178i;
                if (str5 != null) {
                    aVar.mo74323j(6, str5);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: decodeKey");
            }
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f174173d) + 0;
            String str6 = this.f174174e;
            if (str6 != null) {
                e += C52418a.m58683j(2, str6);
            }
            String str7 = this.f174175f;
            if (str7 != null) {
                e += C52418a.m58683j(3, str7);
            }
            String str8 = this.f174176g;
            if (str8 != null) {
                e += C52418a.m58683j(4, str8);
            }
            String str9 = this.f174177h;
            if (str9 != null) {
                e += C52418a.m58683j(5, str9);
            }
            String str10 = this.f174178i;
            return str10 != null ? e + C52418a.m58683j(6, str10) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f174174e == null) {
                throw new C52419b("Not all required fields were included: url");
            } else if (this.f174175f == null) {
                throw new C52419b("Not all required fields were included: urlToken");
            } else if (this.f174176g == null) {
                throw new C52419b("Not all required fields were included: thumbUrl");
            } else if (this.f174177h == null) {
                throw new C52419b("Not all required fields were included: thumbUrlToken");
            } else if (this.f174178i != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: decodeKey");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C61184c cVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    cVar.f174173d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    cVar.f174174e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    cVar.f174175f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    cVar.f174176g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    cVar.f174177h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    cVar.f174178i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
