package py1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C49335eu3;
import te3.C49966ja;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.l2 */
public class C47620l2 extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<C47589h> f127852d = new LinkedList<>();

    /* renamed from: e */
    public boolean f127853e;

    /* renamed from: f */
    public int f127854f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47620l2)) {
            return false;
        }
        C47620l2 l2Var = (C47620l2) aVar;
        return C46238a.m51546a(this.BaseResponse, l2Var.BaseResponse) && C46238a.m51546a(this.f127852d, l2Var.f127852d) && C46238a.m51546a(Boolean.valueOf(this.f127853e), Boolean.valueOf(l2Var.f127853e)) && C46238a.m51546a(Integer.valueOf(this.f127854f), Integer.valueOf(l2Var.f127854f));
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
                aVar.mo74320g(2, 8, this.f127852d);
                aVar.mo74314a(3, this.f127853e);
                aVar.mo74318e(4, this.f127854f);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            return i2 + C52418a.m58680g(2, 8, this.f127852d) + C52418a.m58674a(3, this.f127853e) + C52418a.m58678e(4, this.f127854f);
        } else if (i == 2) {
            this.f127852d.clear();
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
            C47620l2 l2Var = objArr[1];
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
                    l2Var.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C47589h hVar = new C47589h();
                    if (bArr2 != null && bArr2.length > 0) {
                        hVar.parseFrom(bArr2);
                    }
                    l2Var.f127852d.add(hVar);
                }
                return 0;
            } else if (intValue == 3) {
                l2Var.f127853e = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                l2Var.f127854f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
