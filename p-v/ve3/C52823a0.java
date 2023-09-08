package ve3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: ve3.a0 */
public class C52823a0 extends C47465a {

    /* renamed from: d */
    public C65685n0 f147573d;

    public boolean compareContent(C47465a aVar) {
        return aVar != null && (aVar instanceof C52823a0) && C46238a.m51546a(this.f147573d, ((C52823a0) aVar).f147573d);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            C65685n0 n0Var = this.f147573d;
            if (n0Var != null) {
                aVar.mo74322i(1, n0Var.computeSize());
                this.f147573d.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C65685n0 n0Var2 = this.f147573d;
            if (n0Var2 != null) {
                return 0 + C52418a.m58682i(1, n0Var2.computeSize());
            }
            return 0;
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
            C52823a0 a0Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue != 1) {
                return -1;
            }
            LinkedList<byte[]> j = aVar3.mo141632j(intValue);
            int size = j.size();
            for (int i2 = 0; i2 < size; i2++) {
                byte[] bArr = j.get(i2);
                C65685n0 n0Var3 = new C65685n0();
                if (bArr != null && bArr.length > 0) {
                    n0Var3.parseFrom(bArr);
                }
                a0Var.f147573d = n0Var3;
            }
            return 0;
        }
    }
}
