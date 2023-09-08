package ve3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C101820nt3;
import te3.C90417ia;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: ve3.i0 */
public class C52834i0 extends C101820nt3 {

    /* renamed from: d */
    public C65686z0 f147592d;

    /* renamed from: e */
    public int f147593e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52834i0)) {
            return false;
        }
        C52834i0 i0Var = (C52834i0) aVar;
        return C46238a.m51546a(this.BaseRequest, i0Var.BaseRequest) && C46238a.m51546a(this.f147592d, i0Var.f147592d) && C46238a.m51546a(Integer.valueOf(this.f147593e), Integer.valueOf(i0Var.f147593e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            C65686z0 z0Var = this.f147592d;
            if (z0Var != null) {
                aVar.mo74322i(2, z0Var.computeSize());
                this.f147592d.writeFields(aVar);
            }
            aVar.mo74318e(3, this.f147593e);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C65686z0 z0Var2 = this.f147592d;
            if (z0Var2 != null) {
                i2 += C52418a.m58682i(2, z0Var2.computeSize());
            }
            return i2 + C52418a.m58678e(3, this.f147593e);
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
            C52834i0 i0Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C90417ia iaVar3 = new C90417ia();
                    if (bArr != null && bArr.length > 0) {
                        iaVar3.parseFrom(bArr);
                    }
                    i0Var.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C65686z0 z0Var3 = new C65686z0();
                    if (bArr2 != null && bArr2.length > 0) {
                        z0Var3.parseFrom(bArr2);
                    }
                    i0Var.f147592d = z0Var3;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                i0Var.f147593e = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
