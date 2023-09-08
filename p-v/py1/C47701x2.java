package py1;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.x2 */
public class C47701x2 extends C47465a {

    /* renamed from: d */
    public String f128138d;

    /* renamed from: e */
    public String f128139e;

    /* renamed from: f */
    public String f128140f;

    /* renamed from: g */
    public String f128141g;

    /* renamed from: h */
    public String f128142h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47701x2)) {
            return false;
        }
        C47701x2 x2Var = (C47701x2) aVar;
        return C46238a.m51546a(this.f128138d, x2Var.f128138d) && C46238a.m51546a(this.f128139e, x2Var.f128139e) && C46238a.m51546a(this.f128140f, x2Var.f128140f) && C46238a.m51546a(this.f128141g, x2Var.f128141g) && C46238a.m51546a(this.f128142h, x2Var.f128142h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f128139e != null) {
                String str = this.f128138d;
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                String str2 = this.f128139e;
                if (str2 != null) {
                    aVar.mo74323j(2, str2);
                }
                String str3 = this.f128140f;
                if (str3 != null) {
                    aVar.mo74323j(3, str3);
                }
                String str4 = this.f128141g;
                if (str4 != null) {
                    aVar.mo74323j(4, str4);
                }
                String str5 = this.f128142h;
                if (str5 != null) {
                    aVar.mo74323j(5, str5);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: Title");
        } else if (i == 1) {
            String str6 = this.f128138d;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            String str7 = this.f128139e;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            String str8 = this.f128140f;
            if (str8 != null) {
                i2 += C52418a.m58683j(3, str8);
            }
            String str9 = this.f128141g;
            if (str9 != null) {
                i2 += C52418a.m58683j(4, str9);
            }
            String str10 = this.f128142h;
            return str10 != null ? i2 + C52418a.m58683j(5, str10) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f128139e != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: Title");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C47701x2 x2Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                x2Var.f128138d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                x2Var.f128139e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                x2Var.f128140f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                x2Var.f128141g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                x2Var.f128142h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
