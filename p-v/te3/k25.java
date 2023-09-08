package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class k25 extends C47465a {

    /* renamed from: d */
    public String f136526d;

    /* renamed from: e */
    public LinkedList<String> f136527e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof k25)) {
            return false;
        }
        k25 k25 = (k25) aVar;
        return C46238a.m51546a(this.f136526d, k25.f136526d) && C46238a.m51546a(this.f136527e, k25.f136527e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f136526d;
            if (str != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                aVar.mo74320g(2, 1, this.f136527e);
                return 0;
            }
            throw new C52419b("Not all required fields were included: key");
        } else if (i == 1) {
            String str2 = this.f136526d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58680g(2, 1, this.f136527e);
        } else if (i == 2) {
            this.f136527e.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f136526d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: key");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            k25 k25 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                k25.f136526d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                k25.f136527e.add(aVar3.mo141633k(intValue));
                return 0;
            }
        }
    }
}
