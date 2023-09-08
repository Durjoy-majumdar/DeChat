package py1;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.u2 */
public class C47683u2 extends C47465a {

    /* renamed from: d */
    public String f128055d;

    /* renamed from: e */
    public String f128056e;

    /* renamed from: f */
    public String f128057f;

    /* renamed from: g */
    public String f128058g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47683u2)) {
            return false;
        }
        C47683u2 u2Var = (C47683u2) aVar;
        return C46238a.m51546a(this.f128055d, u2Var.f128055d) && C46238a.m51546a(this.f128056e, u2Var.f128056e) && C46238a.m51546a(this.f128057f, u2Var.f128057f) && C46238a.m51546a(this.f128058g, u2Var.f128058g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f128055d;
            if (str == null) {
                throw new C52419b("Not all required fields were included: LogoURL");
            } else if (this.f128056e == null) {
                throw new C52419b("Not all required fields were included: Title");
            } else if (this.f128057f == null) {
                throw new C52419b("Not all required fields were included: Detail");
            } else if (this.f128058g != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                String str2 = this.f128056e;
                if (str2 != null) {
                    aVar.mo74323j(2, str2);
                }
                String str3 = this.f128057f;
                if (str3 != null) {
                    aVar.mo74323j(3, str3);
                }
                String str4 = this.f128058g;
                if (str4 != null) {
                    aVar.mo74323j(4, str4);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: WebURL");
            }
        } else if (i == 1) {
            String str5 = this.f128055d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f128056e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            String str7 = this.f128057f;
            if (str7 != null) {
                i2 += C52418a.m58683j(3, str7);
            }
            String str8 = this.f128058g;
            return str8 != null ? i2 + C52418a.m58683j(4, str8) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f128055d == null) {
                throw new C52419b("Not all required fields were included: LogoURL");
            } else if (this.f128056e == null) {
                throw new C52419b("Not all required fields were included: Title");
            } else if (this.f128057f == null) {
                throw new C52419b("Not all required fields were included: Detail");
            } else if (this.f128058g != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: WebURL");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C47683u2 u2Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                u2Var.f128055d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                u2Var.f128056e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                u2Var.f128057f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                u2Var.f128058g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
