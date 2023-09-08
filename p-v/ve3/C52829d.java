package ve3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: ve3.d */
public class C52829d extends C47465a {

    /* renamed from: d */
    public C65686z0 f147578d;

    public boolean compareContent(C47465a aVar) {
        return aVar != null && (aVar instanceof C52829d) && C46238a.m51546a(this.f147578d, ((C52829d) aVar).f147578d);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            C65686z0 z0Var = this.f147578d;
            if (z0Var != null) {
                aVar.mo74322i(1, z0Var.computeSize());
                this.f147578d.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C65686z0 z0Var2 = this.f147578d;
            if (z0Var2 != null) {
                return 0 + C52418a.m58682i(1, z0Var2.computeSize());
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
            C52829d dVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue != 1) {
                return -1;
            }
            LinkedList<byte[]> j = aVar3.mo141632j(intValue);
            int size = j.size();
            for (int i2 = 0; i2 < size; i2++) {
                byte[] bArr = j.get(i2);
                C65686z0 z0Var3 = new C65686z0();
                if (bArr != null && bArr.length > 0) {
                    z0Var3.parseFrom(bArr);
                }
                dVar.f147578d = z0Var3;
            }
            return 0;
        }
    }
}
