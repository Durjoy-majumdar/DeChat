package py1;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.k3 */
public class C47614k3 extends C47465a {

    /* renamed from: d */
    public int f127835d;

    /* renamed from: e */
    public int f127836e;

    /* renamed from: f */
    public String f127837f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47614k3)) {
            return false;
        }
        C47614k3 k3Var = (C47614k3) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f127835d), Integer.valueOf(k3Var.f127835d)) && C46238a.m51546a(Integer.valueOf(this.f127836e), Integer.valueOf(k3Var.f127836e)) && C46238a.m51546a(this.f127837f, k3Var.f127837f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f127835d);
            aVar.mo74318e(2, this.f127836e);
            String str = this.f127837f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f127835d) + 0 + C52418a.m58678e(2, this.f127836e);
            String str2 = this.f127837f;
            return str2 != null ? e + C52418a.m58683j(3, str2) : e;
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
            C47614k3 k3Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                k3Var.f127835d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                k3Var.f127836e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                k3Var.f127837f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
