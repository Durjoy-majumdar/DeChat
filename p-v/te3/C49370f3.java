package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.f3 */
public class C49370f3 extends C49335eu3 {

    /* renamed from: d */
    public int f133258d;

    /* renamed from: e */
    public int f133259e;

    /* renamed from: f */
    public long f133260f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49370f3)) {
            return false;
        }
        C49370f3 f3Var = (C49370f3) aVar;
        return C46238a.m51546a(this.BaseResponse, f3Var.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f133258d), Integer.valueOf(f3Var.f133258d)) && C46238a.m51546a(Integer.valueOf(this.f133259e), Integer.valueOf(f3Var.f133259e)) && C46238a.m51546a(Long.valueOf(this.f133260f), Long.valueOf(f3Var.f133260f));
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
                aVar.mo74318e(2, this.f133258d);
                aVar.mo74318e(3, this.f133259e);
                aVar.mo74321h(4, this.f133260f);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f133258d) + C52418a.m58678e(3, this.f133259e) + C52418a.m58681h(4, this.f133260f);
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
            C49370f3 f3Var = objArr[1];
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
                    f3Var.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                f3Var.f133258d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                f3Var.f133259e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                f3Var.f133260f = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }
}
