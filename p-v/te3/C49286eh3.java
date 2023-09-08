package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.eh3 */
public class C49286eh3 extends C49335eu3 {

    /* renamed from: d */
    public C89349b f132927d;

    /* renamed from: e */
    public C48641a00 f132928e;

    /* renamed from: f */
    public C49851ii2 f132929f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49286eh3)) {
            return false;
        }
        C49286eh3 eh32 = (C49286eh3) aVar;
        return C46238a.m51546a(this.BaseResponse, eh32.BaseResponse) && C46238a.m51546a(this.f132927d, eh32.f132927d) && C46238a.m51546a(this.f132928e, eh32.f132928e) && C46238a.m51546a(this.f132929f, eh32.f132929f);
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
                C89349b bVar = this.f132927d;
                if (bVar != null) {
                    aVar.mo74315b(2, bVar);
                }
                C48641a00 a002 = this.f132928e;
                if (a002 != null) {
                    aVar.mo74322i(3, a002.computeSize());
                    this.f132928e.writeFields(aVar);
                }
                C49851ii2 ii22 = this.f132929f;
                if (ii22 != null) {
                    aVar.mo74322i(100, ii22.computeSize());
                    this.f132929f.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C89349b bVar2 = this.f132927d;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(2, bVar2);
            }
            C48641a00 a003 = this.f132928e;
            if (a003 != null) {
                i2 += C52418a.m58682i(3, a003.computeSize());
            }
            C49851ii2 ii23 = this.f132929f;
            return ii23 != null ? i2 + C52418a.m58682i(100, ii23.computeSize()) : i2;
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
            C49286eh3 eh32 = objArr[1];
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
                    eh32.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                eh32.f132927d = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C48641a00 a004 = new C48641a00();
                    if (bArr2 != null && bArr2.length > 0) {
                        a004.parseFrom(bArr2);
                    }
                    eh32.f132928e = a004;
                }
                return 0;
            } else if (intValue != 100) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C49851ii2 ii24 = new C49851ii2();
                    if (bArr3 != null && bArr3.length > 0) {
                        ii24.parseFrom(bArr3);
                    }
                    eh32.f132929f = ii24;
                }
                return 0;
            }
        }
    }
}
