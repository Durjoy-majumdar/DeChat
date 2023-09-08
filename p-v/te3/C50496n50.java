package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.n50 */
public class C50496n50 extends C49335eu3 {

    /* renamed from: d */
    public C51018qv3 f138412d;

    /* renamed from: e */
    public int f138413e;

    /* renamed from: f */
    public int f138414f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50496n50)) {
            return false;
        }
        C50496n50 n502 = (C50496n50) aVar;
        return C46238a.m51546a(this.BaseResponse, n502.BaseResponse) && C46238a.m51546a(this.f138412d, n502.f138412d) && C46238a.m51546a(Integer.valueOf(this.f138413e), Integer.valueOf(n502.f138413e)) && C46238a.m51546a(Integer.valueOf(this.f138414f), Integer.valueOf(n502.f138414f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f138412d != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                C51018qv3 qv32 = this.f138412d;
                if (qv32 != null) {
                    aVar.mo74322i(2, qv32.computeSize());
                    this.f138412d.writeFields(aVar);
                }
                aVar.mo74318e(3, this.f138413e);
                aVar.mo74318e(4, this.f138414f);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: PackageBuf");
            }
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C51018qv3 qv33 = this.f138412d;
            if (qv33 != null) {
                i2 += C52418a.m58682i(2, qv33.computeSize());
            }
            return i2 + C52418a.m58678e(3, this.f138413e) + C52418a.m58678e(4, this.f138414f);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f138412d != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: PackageBuf");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C50496n50 n502 = objArr[1];
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
                    n502.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C51018qv3 qv34 = new C51018qv3();
                    if (bArr2 != null && bArr2.length > 0) {
                        qv34.mo73348f(bArr2);
                    }
                    n502.f138412d = qv34;
                }
                return 0;
            } else if (intValue == 3) {
                n502.f138413e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                n502.f138414f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
