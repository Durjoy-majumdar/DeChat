package py1;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.p4 */
public class C47650p4 extends C47465a {

    /* renamed from: d */
    public String f127926d;

    /* renamed from: e */
    public String f127927e;

    /* renamed from: f */
    public String f127928f;

    /* renamed from: g */
    public int f127929g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47650p4)) {
            return false;
        }
        C47650p4 p4Var = (C47650p4) aVar;
        return C46238a.m51546a(this.f127926d, p4Var.f127926d) && C46238a.m51546a(this.f127927e, p4Var.f127927e) && C46238a.m51546a(this.f127928f, p4Var.f127928f) && C46238a.m51546a(Integer.valueOf(this.f127929g), Integer.valueOf(p4Var.f127929g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f127926d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f127927e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f127928f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            aVar.mo74318e(4, this.f127929g);
            return 0;
        } else if (i == 1) {
            String str4 = this.f127926d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f127927e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f127928f;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            return i2 + C52418a.m58678e(4, this.f127929g);
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
            C47650p4 p4Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                p4Var.f127926d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                p4Var.f127927e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                p4Var.f127928f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                p4Var.f127929g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
