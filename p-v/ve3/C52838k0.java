package ve3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: ve3.k0 */
public class C52838k0 extends C47465a {

    /* renamed from: d */
    public C65686z0 f147597d;

    /* renamed from: e */
    public long f147598e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52838k0)) {
            return false;
        }
        C52838k0 k0Var = (C52838k0) aVar;
        return C46238a.m51546a(this.f147597d, k0Var.f147597d) && C46238a.m51546a(Long.valueOf(this.f147598e), Long.valueOf(k0Var.f147598e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C65686z0 z0Var = this.f147597d;
            if (z0Var != null) {
                aVar.mo74322i(1, z0Var.computeSize());
                this.f147597d.writeFields(aVar);
            }
            aVar.mo74321h(2, this.f147598e);
            return 0;
        } else if (i == 1) {
            C65686z0 z0Var2 = this.f147597d;
            if (z0Var2 != null) {
                i2 = 0 + C52418a.m58682i(1, z0Var2.computeSize());
            }
            return i2 + C52418a.m58681h(2, this.f147598e);
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
            C52838k0 k0Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C65686z0 z0Var3 = new C65686z0();
                    if (bArr != null && bArr.length > 0) {
                        z0Var3.parseFrom(bArr);
                    }
                    k0Var.f147597d = z0Var3;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                k0Var.f147598e = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }
}
