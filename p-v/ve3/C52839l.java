package ve3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: ve3.l */
public class C52839l extends C47465a {

    /* renamed from: d */
    public C65685n0 f147599d;

    /* renamed from: e */
    public int f147600e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52839l)) {
            return false;
        }
        C52839l lVar = (C52839l) aVar;
        return C46238a.m51546a(this.f147599d, lVar.f147599d) && C46238a.m51546a(Integer.valueOf(this.f147600e), Integer.valueOf(lVar.f147600e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C65685n0 n0Var = this.f147599d;
            if (n0Var != null) {
                aVar.mo74322i(1, n0Var.computeSize());
                this.f147599d.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f147600e);
            return 0;
        } else if (i == 1) {
            C65685n0 n0Var2 = this.f147599d;
            if (n0Var2 != null) {
                i2 = 0 + C52418a.m58682i(1, n0Var2.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f147600e);
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
            C52839l lVar = objArr[1];
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
                    lVar.f147599d = n0Var3;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                lVar.f147600e = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
