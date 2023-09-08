package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.c00 */
public class C48932c00 extends C49335eu3 {

    /* renamed from: d */
    public long f131417d;

    /* renamed from: e */
    public C50182ku3 f131418e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48932c00)) {
            return false;
        }
        C48932c00 c002 = (C48932c00) aVar;
        return C46238a.m51546a(this.BaseResponse, c002.BaseResponse) && C46238a.m51546a(Long.valueOf(this.f131417d), Long.valueOf(c002.f131417d)) && C46238a.m51546a(this.f131418e, c002.f131418e);
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
                aVar.mo74321h(2, this.f131417d);
                C50182ku3 ku32 = this.f131418e;
                if (ku32 != null) {
                    aVar.mo74322i(100, ku32.computeSize());
                    this.f131418e.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int h = i2 + C52418a.m58681h(2, this.f131417d);
            C50182ku3 ku33 = this.f131418e;
            return ku33 != null ? h + C52418a.m58682i(100, ku33.computeSize()) : h;
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
            C48932c00 c002 = objArr[1];
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
                    c002.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                c002.f131417d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 100) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C50182ku3 ku34 = new C50182ku3();
                    if (bArr2 != null && bArr2.length > 0) {
                        ku34.parseFrom(bArr2);
                    }
                    c002.f131418e = ku34;
                }
                return 0;
            }
        }
    }
}
