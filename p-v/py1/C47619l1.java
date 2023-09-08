package py1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.l1 */
public class C47619l1 extends C47465a {

    /* renamed from: d */
    public String f127850d;

    /* renamed from: e */
    public LinkedList<String> f127851e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47619l1)) {
            return false;
        }
        C47619l1 l1Var = (C47619l1) aVar;
        return C46238a.m51546a(this.f127850d, l1Var.f127850d) && C46238a.m51546a(this.f127851e, l1Var.f127851e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f127850d;
            if (str != null) {
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                aVar.mo74320g(3, 1, this.f127851e);
                return 0;
            }
            throw new C52419b("Not all required fields were included: Detail");
        } else if (i == 1) {
            String str2 = this.f127850d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(2, str2);
            }
            return i2 + C52418a.m58680g(3, 1, this.f127851e);
        } else if (i == 2) {
            this.f127851e.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f127850d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: Detail");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C47619l1 l1Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 2) {
                l1Var.f127850d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                l1Var.f127851e.add(aVar3.mo141633k(intValue));
                return 0;
            }
        }
    }
}
