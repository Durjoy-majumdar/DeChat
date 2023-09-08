package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.u3 */
public class C51487u3 extends C49335eu3 {

    /* renamed from: d */
    public int f142572d;

    /* renamed from: e */
    public C49669h73 f142573e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51487u3)) {
            return false;
        }
        C51487u3 u3Var = (C51487u3) aVar;
        return C46238a.m51546a(this.BaseResponse, u3Var.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f142572d), Integer.valueOf(u3Var.f142572d)) && C46238a.m51546a(this.f142573e, u3Var.f142573e);
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
            aVar.mo74318e(2, this.f142572d);
            C49669h73 h732 = this.f142573e;
            if (h732 != null) {
                aVar.mo74322i(3, h732.computeSize());
                this.f142573e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f142572d);
            C49669h73 h733 = this.f142573e;
            return h733 != null ? e + C52418a.m58682i(3, h733.computeSize()) : e;
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
            C51487u3 u3Var = objArr[1];
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
                    u3Var.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                u3Var.f142572d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C49669h73 h734 = new C49669h73();
                    if (bArr2 != null && bArr2.length > 0) {
                        h734.parseFrom(bArr2);
                    }
                    u3Var.f142573e = h734;
                }
                return 0;
            }
        }
    }
}
