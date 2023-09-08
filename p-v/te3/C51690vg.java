package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.vg */
public class C51690vg extends C49335eu3 {

    /* renamed from: d */
    public C50649o9 f143473d;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51690vg)) {
            return false;
        }
        C51690vg vgVar = (C51690vg) aVar;
        return C46238a.m51546a(this.BaseResponse, vgVar.BaseResponse) && C46238a.m51546a(this.f143473d, vgVar.f143473d);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                C50649o9 o9Var = this.f143473d;
                if (o9Var != null) {
                    aVar.mo74322i(6, o9Var.computeSize());
                    this.f143473d.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C50649o9 o9Var2 = this.f143473d;
            return o9Var2 != null ? i2 + C52418a.m58682i(6, o9Var2.computeSize()) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C51690vg vgVar = objArr[1];
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
                    vgVar.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue != 6) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C50649o9 o9Var3 = new C50649o9();
                    if (bArr2 != null && bArr2.length > 0) {
                        o9Var3.parseFrom(bArr2);
                    }
                    vgVar.f143473d = o9Var3;
                }
                return 0;
            }
        }
    }
}
