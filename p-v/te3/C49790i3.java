package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.i3 */
public class C49790i3 extends C47465a {

    /* renamed from: d */
    public String f135070d;

    /* renamed from: e */
    public int f135071e;

    /* renamed from: f */
    public String f135072f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49790i3)) {
            return false;
        }
        C49790i3 i3Var = (C49790i3) aVar;
        return C46238a.m51546a(this.f135070d, i3Var.f135070d) && C46238a.m51546a(Integer.valueOf(this.f135071e), Integer.valueOf(i3Var.f135071e)) && C46238a.m51546a(this.f135072f, i3Var.f135072f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f135070d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f135071e);
            String str2 = this.f135072f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            return 0;
        } else if (i == 1) {
            String str3 = this.f135070d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            int e = i2 + C52418a.m58678e(2, this.f135071e);
            String str4 = this.f135072f;
            return str4 != null ? e + C52418a.m58683j(3, str4) : e;
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
            C49790i3 i3Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                i3Var.f135070d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                i3Var.f135071e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                i3Var.f135072f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
