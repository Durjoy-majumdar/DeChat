package ve3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: ve3.x */
public class C52861x extends C47465a {

    /* renamed from: d */
    public int f147645d;

    /* renamed from: e */
    public C65685n0 f147646e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52861x)) {
            return false;
        }
        C52861x xVar = (C52861x) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f147645d), Integer.valueOf(xVar.f147645d)) && C46238a.m51546a(this.f147646e, xVar.f147646e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f147645d);
            C65685n0 n0Var = this.f147646e;
            if (n0Var != null) {
                aVar.mo74322i(2, n0Var.computeSize());
                this.f147646e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f147645d) + 0;
            C65685n0 n0Var2 = this.f147646e;
            return n0Var2 != null ? e + C52418a.m58682i(2, n0Var2.computeSize()) : e;
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
            C52861x xVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                xVar.f147645d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C65685n0 n0Var3 = new C65685n0();
                    if (bArr != null && bArr.length > 0) {
                        n0Var3.parseFrom(bArr);
                    }
                    xVar.f147646e = n0Var3;
                }
                return 0;
            }
        }
    }
}
