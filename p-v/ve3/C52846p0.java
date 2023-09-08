package ve3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;

/* renamed from: ve3.p0 */
public class C52846p0 extends C47465a {

    /* renamed from: d */
    public LinkedList<C52848q0> f147618d = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        return aVar != null && (aVar instanceof C52846p0) && C46238a.m51546a(this.f147618d, ((C52846p0) aVar).f147618d);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            objArr[0].mo74320g(1, 8, this.f147618d);
            return 0;
        } else if (i == 1) {
            return C52418a.m58680g(1, 8, this.f147618d) + 0;
        } else {
            if (i == 2) {
                this.f147618d.clear();
                C102122a aVar = new C102122a(objArr[0], C47465a.unknownTagHandler);
                for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar)) {
                    if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
                        aVar.mo141624b();
                    }
                }
                return 0;
            } else if (i != 3) {
                return -1;
            } else {
                C102122a aVar2 = objArr[0];
                C52846p0 p0Var = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue != 1) {
                    return -1;
                }
                LinkedList<byte[]> j = aVar2.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C52848q0 q0Var = new C52848q0();
                    if (bArr != null && bArr.length > 0) {
                        q0Var.parseFrom(bArr);
                    }
                    p0Var.f147618d.add(q0Var);
                }
                return 0;
            }
        }
    }
}
