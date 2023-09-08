package ve3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: ve3.p */
public class C52845p extends C47465a {

    /* renamed from: d */
    public C65684l0 f147616d;

    /* renamed from: e */
    public C65685n0 f147617e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52845p)) {
            return false;
        }
        C52845p pVar = (C52845p) aVar;
        return C46238a.m51546a(this.f147616d, pVar.f147616d) && C46238a.m51546a(this.f147617e, pVar.f147617e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C65684l0 l0Var = this.f147616d;
            if (l0Var != null) {
                aVar.mo74322i(1, l0Var.computeSize());
                this.f147616d.writeFields(aVar);
            }
            C65685n0 n0Var = this.f147617e;
            if (n0Var != null) {
                aVar.mo74322i(2, n0Var.computeSize());
                this.f147617e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C65684l0 l0Var2 = this.f147616d;
            if (l0Var2 != null) {
                i2 = 0 + C52418a.m58682i(1, l0Var2.computeSize());
            }
            C65685n0 n0Var2 = this.f147617e;
            return n0Var2 != null ? i2 + C52418a.m58682i(2, n0Var2.computeSize()) : i2;
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
            C52845p pVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C65684l0 l0Var3 = new C65684l0();
                    if (bArr != null && bArr.length > 0) {
                        l0Var3.parseFrom(bArr);
                    }
                    pVar.f147616d = l0Var3;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C65685n0 n0Var3 = new C65685n0();
                    if (bArr2 != null && bArr2.length > 0) {
                        n0Var3.parseFrom(bArr2);
                    }
                    pVar.f147617e = n0Var3;
                }
                return 0;
            }
        }
    }
}
