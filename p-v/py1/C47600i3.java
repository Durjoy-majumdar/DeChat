package py1;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.i3 */
public class C47600i3 extends C47465a {

    /* renamed from: d */
    public String f127786d;

    /* renamed from: e */
    public String f127787e;

    /* renamed from: f */
    public String f127788f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47600i3)) {
            return false;
        }
        C47600i3 i3Var = (C47600i3) aVar;
        return C46238a.m51546a(this.f127786d, i3Var.f127786d) && C46238a.m51546a(this.f127787e, i3Var.f127787e) && C46238a.m51546a(this.f127788f, i3Var.f127788f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f127786d;
            if (str != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                String str2 = this.f127787e;
                if (str2 != null) {
                    aVar.mo74323j(2, str2);
                }
                String str3 = this.f127788f;
                if (str3 != null) {
                    aVar.mo74323j(3, str3);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: IconURL");
        } else if (i == 1) {
            String str4 = this.f127786d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f127787e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f127788f;
            return str6 != null ? i2 + C52418a.m58683j(3, str6) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f127786d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: IconURL");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C47600i3 i3Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                i3Var.f127786d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                i3Var.f127787e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                i3Var.f127788f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
