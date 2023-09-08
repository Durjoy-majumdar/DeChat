package py1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C49335eu3;
import te3.C49966ja;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.p2 */
public class C47648p2 extends C49335eu3 {

    /* renamed from: d */
    public C47547b f127922d;

    /* renamed from: e */
    public C47621l3 f127923e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47648p2)) {
            return false;
        }
        C47648p2 p2Var = (C47648p2) aVar;
        return C46238a.m51546a(this.BaseResponse, p2Var.BaseResponse) && C46238a.m51546a(this.f127922d, p2Var.f127922d) && C46238a.m51546a(this.f127923e, p2Var.f127923e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                aVar.mo74322i(1, jaVar.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            C47547b bVar = this.f127922d;
            if (bVar != null) {
                aVar.mo74322i(2, bVar.computeSize());
                this.f127922d.writeFields(aVar);
            }
            C47621l3 l3Var = this.f127923e;
            if (l3Var != null) {
                aVar.mo74322i(3, l3Var.computeSize());
                this.f127923e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C47547b bVar2 = this.f127922d;
            if (bVar2 != null) {
                i2 += C52418a.m58682i(2, bVar2.computeSize());
            }
            C47621l3 l3Var2 = this.f127923e;
            return l3Var2 != null ? i2 + C52418a.m58682i(3, l3Var2.computeSize()) : i2;
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
            C47648p2 p2Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C49966ja jaVar3 = new C49966ja();
                    if (bArr != null && bArr.length > 0) {
                        jaVar3.parseFrom(bArr);
                    }
                    p2Var.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C47547b bVar3 = new C47547b();
                    if (bArr2 != null && bArr2.length > 0) {
                        bVar3.parseFrom(bArr2);
                    }
                    p2Var.f127922d = bVar3;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C47621l3 l3Var3 = new C47621l3();
                    if (bArr3 != null && bArr3.length > 0) {
                        l3Var3.parseFrom(bArr3);
                    }
                    p2Var.f127923e = l3Var3;
                }
                return 0;
            }
        }
    }
}
