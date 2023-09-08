package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.b52 */
public class C48810b52 extends C49335eu3 {

    /* renamed from: d */
    public C89349b f130948d;

    /* renamed from: e */
    public String f130949e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48810b52)) {
            return false;
        }
        C48810b52 b522 = (C48810b52) aVar;
        return C46238a.m51546a(this.BaseResponse, b522.BaseResponse) && C46238a.m51546a(this.f130948d, b522.f130948d) && C46238a.m51546a(this.f130949e, b522.f130949e);
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
            C89349b bVar = this.f130948d;
            if (bVar != null) {
                aVar.mo74315b(2, bVar);
            }
            String str = this.f130949e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C89349b bVar2 = this.f130948d;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(2, bVar2);
            }
            String str2 = this.f130949e;
            return str2 != null ? i2 + C52418a.m58683j(3, str2) : i2;
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
            C48810b52 b522 = objArr[1];
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
                    b522.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                b522.f130948d = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                b522.f130949e = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
