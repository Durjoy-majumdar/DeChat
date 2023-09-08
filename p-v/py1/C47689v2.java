package py1;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.v2 */
public class C47689v2 extends C47465a {

    /* renamed from: d */
    public String f128082d;

    /* renamed from: e */
    public String f128083e;

    /* renamed from: f */
    public String f128084f;

    /* renamed from: g */
    public String f128085g;

    /* renamed from: h */
    public String f128086h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47689v2)) {
            return false;
        }
        C47689v2 v2Var = (C47689v2) aVar;
        return C46238a.m51546a(this.f128082d, v2Var.f128082d) && C46238a.m51546a(this.f128083e, v2Var.f128083e) && C46238a.m51546a(this.f128084f, v2Var.f128084f) && C46238a.m51546a(this.f128085g, v2Var.f128085g) && C46238a.m51546a(this.f128086h, v2Var.f128086h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f128082d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f128083e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f128084f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f128085g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f128086h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            return 0;
        } else if (i == 1) {
            String str6 = this.f128082d;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            String str7 = this.f128083e;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            String str8 = this.f128084f;
            if (str8 != null) {
                i2 += C52418a.m58683j(3, str8);
            }
            String str9 = this.f128085g;
            if (str9 != null) {
                i2 += C52418a.m58683j(4, str9);
            }
            String str10 = this.f128086h;
            return str10 != null ? i2 + C52418a.m58683j(5, str10) : i2;
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
            C47689v2 v2Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                v2Var.f128082d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                v2Var.f128083e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                v2Var.f128084f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                v2Var.f128085g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                v2Var.f128086h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
