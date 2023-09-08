package py1;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.g1 */
public class C47584g1 extends C47465a {

    /* renamed from: d */
    public String f127706d;

    /* renamed from: e */
    public String f127707e;

    /* renamed from: f */
    public String f127708f;

    /* renamed from: g */
    public String f127709g;

    /* renamed from: h */
    public String f127710h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47584g1)) {
            return false;
        }
        C47584g1 g1Var = (C47584g1) aVar;
        return C46238a.m51546a(this.f127706d, g1Var.f127706d) && C46238a.m51546a(this.f127707e, g1Var.f127707e) && C46238a.m51546a(this.f127708f, g1Var.f127708f) && C46238a.m51546a(this.f127709g, g1Var.f127709g) && C46238a.m51546a(this.f127710h, g1Var.f127710h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f127706d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f127707e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f127708f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f127709g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f127710h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            return 0;
        } else if (i == 1) {
            String str6 = this.f127706d;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            String str7 = this.f127707e;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            String str8 = this.f127708f;
            if (str8 != null) {
                i2 += C52418a.m58683j(3, str8);
            }
            String str9 = this.f127709g;
            if (str9 != null) {
                i2 += C52418a.m58683j(4, str9);
            }
            String str10 = this.f127710h;
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
            C47584g1 g1Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                g1Var.f127706d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                g1Var.f127707e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                g1Var.f127708f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                g1Var.f127709g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                g1Var.f127710h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
