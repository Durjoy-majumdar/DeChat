package ve3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: ve3.u0 */
public class C52856u0 extends C47465a {

    /* renamed from: d */
    public C65685n0 f147634d;

    /* renamed from: e */
    public int f147635e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52856u0)) {
            return false;
        }
        C52856u0 u0Var = (C52856u0) aVar;
        return C46238a.m51546a(this.f147634d, u0Var.f147634d) && C46238a.m51546a(Integer.valueOf(this.f147635e), Integer.valueOf(u0Var.f147635e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C65685n0 n0Var = this.f147634d;
            if (n0Var != null) {
                aVar.mo74322i(1, n0Var.computeSize());
                this.f147634d.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f147635e);
            return 0;
        } else if (i == 1) {
            C65685n0 n0Var2 = this.f147634d;
            if (n0Var2 != null) {
                i2 = 0 + C52418a.m58682i(1, n0Var2.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f147635e);
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
            C52856u0 u0Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C65685n0 n0Var3 = new C65685n0();
                    if (bArr != null && bArr.length > 0) {
                        n0Var3.parseFrom(bArr);
                    }
                    u0Var.f147634d = n0Var3;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                u0Var.f147635e = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
