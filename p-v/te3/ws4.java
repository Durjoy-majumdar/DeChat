package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class ws4 extends C49335eu3 {

    /* renamed from: d */
    public C89349b f144248d;

    /* renamed from: e */
    public C89349b f144249e;

    /* renamed from: f */
    public String f144250f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ws4)) {
            return false;
        }
        ws4 ws4 = (ws4) aVar;
        return C46238a.m51546a(this.BaseResponse, ws4.BaseResponse) && C46238a.m51546a(this.f144248d, ws4.f144248d) && C46238a.m51546a(this.f144249e, ws4.f144249e) && C46238a.m51546a(this.f144250f, ws4.f144250f);
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
                C89349b bVar = this.f144248d;
                if (bVar != null) {
                    aVar.mo74315b(2, bVar);
                }
                C89349b bVar2 = this.f144249e;
                if (bVar2 != null) {
                    aVar.mo74315b(3, bVar2);
                }
                String str = this.f144250f;
                if (str != null) {
                    aVar.mo74323j(4, str);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C89349b bVar3 = this.f144248d;
            if (bVar3 != null) {
                i2 += C52418a.m58675b(2, bVar3);
            }
            C89349b bVar4 = this.f144249e;
            if (bVar4 != null) {
                i2 += C52418a.m58675b(3, bVar4);
            }
            String str2 = this.f144250f;
            return str2 != null ? i2 + C52418a.m58683j(4, str2) : i2;
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
            ws4 ws4 = objArr[1];
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
                    ws4.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                ws4.f144248d = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue == 3) {
                ws4.f144249e = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                ws4.f144250f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
