package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.a7 */
public class C48673a7 extends C47465a {

    /* renamed from: d */
    public int f130336d;

    /* renamed from: e */
    public int f130337e;

    /* renamed from: f */
    public int f130338f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48673a7)) {
            return false;
        }
        C48673a7 a7Var = (C48673a7) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f130336d), Integer.valueOf(a7Var.f130336d)) && C46238a.m51546a(Integer.valueOf(this.f130337e), Integer.valueOf(a7Var.f130337e)) && C46238a.m51546a(Integer.valueOf(this.f130338f), Integer.valueOf(a7Var.f130338f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f130336d);
            aVar.mo74318e(2, this.f130337e);
            aVar.mo74318e(3, this.f130338f);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f130336d) + 0 + C52418a.m58678e(2, this.f130337e) + C52418a.m58678e(3, this.f130338f);
        } else {
            if (i == 2) {
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
                C48673a7 a7Var = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    a7Var.f130336d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    a7Var.f130337e = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 3) {
                    return -1;
                } else {
                    a7Var.f130338f = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
