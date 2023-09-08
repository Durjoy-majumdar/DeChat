package ag2;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C49335eu3;
import te3.C49966ja;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: ag2.a1 */
public class C39566a1 extends C49335eu3 {

    /* renamed from: d */
    public C39597s0 f106214d;

    /* renamed from: e */
    public C39582g1 f106215e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C39566a1)) {
            return false;
        }
        C39566a1 a1Var = (C39566a1) aVar;
        return C46238a.m51546a(this.BaseResponse, a1Var.BaseResponse) && C46238a.m51546a(this.f106214d, a1Var.f106214d) && C46238a.m51546a(this.f106215e, a1Var.f106215e);
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
            C39597s0 s0Var = this.f106214d;
            if (s0Var != null) {
                aVar.mo74322i(2, s0Var.computeSize());
                this.f106214d.writeFields(aVar);
            }
            C39582g1 g1Var = this.f106215e;
            if (g1Var != null) {
                aVar.mo74322i(3, g1Var.computeSize());
                this.f106215e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C39597s0 s0Var2 = this.f106214d;
            if (s0Var2 != null) {
                i2 += C52418a.m58682i(2, s0Var2.computeSize());
            }
            C39582g1 g1Var2 = this.f106215e;
            return g1Var2 != null ? i2 + C52418a.m58682i(3, g1Var2.computeSize()) : i2;
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
            C39566a1 a1Var = objArr[1];
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
                    a1Var.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C39597s0 s0Var3 = new C39597s0();
                    if (bArr2 != null && bArr2.length > 0) {
                        s0Var3.parseFrom(bArr2);
                    }
                    a1Var.f106214d = s0Var3;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C39582g1 g1Var3 = new C39582g1();
                    if (bArr3 != null && bArr3.length > 0) {
                        g1Var3.parseFrom(bArr3);
                    }
                    a1Var.f106215e = g1Var3;
                }
                return 0;
            }
        }
    }
}
