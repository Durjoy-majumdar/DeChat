package py1;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.p0 */
public class C47646p0 extends C47465a {

    /* renamed from: d */
    public boolean f127917d;

    /* renamed from: e */
    public String f127918e;

    /* renamed from: f */
    public boolean f127919f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47646p0)) {
            return false;
        }
        C47646p0 p0Var = (C47646p0) aVar;
        return C46238a.m51546a(Boolean.valueOf(this.f127917d), Boolean.valueOf(p0Var.f127917d)) && C46238a.m51546a(this.f127918e, p0Var.f127918e) && C46238a.m51546a(Boolean.valueOf(this.f127919f), Boolean.valueOf(p0Var.f127919f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74314a(1, this.f127917d);
            String str = this.f127918e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74314a(3, this.f127919f);
            return 0;
        } else if (i == 1) {
            int a = C52418a.m58674a(1, this.f127917d) + 0;
            String str2 = this.f127918e;
            if (str2 != null) {
                a += C52418a.m58683j(2, str2);
            }
            return a + C52418a.m58674a(3, this.f127919f);
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
            C47646p0 p0Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                p0Var.f127917d = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue == 2) {
                p0Var.f127918e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                p0Var.f127919f = aVar3.mo141625c(intValue);
                return 0;
            }
        }
    }
}
