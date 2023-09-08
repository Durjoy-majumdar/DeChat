package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.r90 */
public class C51074r90 extends C49335eu3 {

    /* renamed from: d */
    public C48820b80 f140769d;

    /* renamed from: e */
    public C51369ta3 f140770e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51074r90)) {
            return false;
        }
        C51074r90 r902 = (C51074r90) aVar;
        return C46238a.m51546a(this.BaseResponse, r902.BaseResponse) && C46238a.m51546a(this.f140769d, r902.f140769d) && C46238a.m51546a(this.f140770e, r902.f140770e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f140769d != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                C48820b80 b802 = this.f140769d;
                if (b802 != null) {
                    aVar.mo74322i(2, b802.computeSize());
                    this.f140769d.writeFields(aVar);
                }
                C51369ta3 ta32 = this.f140770e;
                if (ta32 != null) {
                    aVar.mo74322i(3, ta32.computeSize());
                    this.f140770e.writeFields(aVar);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: DownloadInfo");
            }
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C48820b80 b803 = this.f140769d;
            if (b803 != null) {
                i2 += C52418a.m58682i(2, b803.computeSize());
            }
            C51369ta3 ta33 = this.f140770e;
            return ta33 != null ? i2 + C52418a.m58682i(3, ta33.computeSize()) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f140769d != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: DownloadInfo");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C51074r90 r902 = objArr[1];
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
                    r902.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C48820b80 b804 = new C48820b80();
                    if (bArr2 != null && bArr2.length > 0) {
                        b804.parseFrom(bArr2);
                    }
                    r902.f140769d = b804;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C51369ta3 ta34 = new C51369ta3();
                    if (bArr3 != null && bArr3.length > 0) {
                        ta34.parseFrom(bArr3);
                    }
                    r902.f140770e = ta34;
                }
                return 0;
            }
        }
    }
}
