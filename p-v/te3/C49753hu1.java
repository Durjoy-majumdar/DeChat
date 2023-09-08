package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.hu1 */
public class C49753hu1 extends C49335eu3 {

    /* renamed from: d */
    public int f134886d;

    /* renamed from: e */
    public LinkedList<C50197l0> f134887e = new LinkedList<>();

    /* renamed from: f */
    public int f134888f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49753hu1)) {
            return false;
        }
        C49753hu1 hu12 = (C49753hu1) aVar;
        return C46238a.m51546a(this.BaseResponse, hu12.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f134886d), Integer.valueOf(hu12.f134886d)) && C46238a.m51546a(this.f134887e, hu12.f134887e) && C46238a.m51546a(Integer.valueOf(this.f134888f), Integer.valueOf(hu12.f134888f));
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
                aVar.mo74318e(2, this.f134886d);
                aVar.mo74320g(3, 8, this.f134887e);
                aVar.mo74318e(4, this.f134888f);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f134886d) + C52418a.m58680g(3, 8, this.f134887e) + C52418a.m58678e(4, this.f134888f);
        } else if (i == 2) {
            this.f134887e.clear();
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
            C49753hu1 hu12 = objArr[1];
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
                    hu12.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                hu12.f134886d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C50197l0 l0Var = new C50197l0();
                    if (bArr2 != null && bArr2.length > 0) {
                        l0Var.parseFrom(bArr2);
                    }
                    hu12.f134887e.add(l0Var);
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                hu12.f134888f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
