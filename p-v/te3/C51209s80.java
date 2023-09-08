package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.s80 */
public class C51209s80 extends C49335eu3 {

    /* renamed from: d */
    public C51506u80 f141370d;

    /* renamed from: e */
    public i35 f141371e;

    /* renamed from: f */
    public C50182ku3 f141372f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51209s80)) {
            return false;
        }
        C51209s80 s802 = (C51209s80) aVar;
        return C46238a.m51546a(this.BaseResponse, s802.BaseResponse) && C46238a.m51546a(this.f141370d, s802.f141370d) && C46238a.m51546a(this.f141371e, s802.f141371e) && C46238a.m51546a(this.f141372f, s802.f141372f);
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
                C51506u80 u802 = this.f141370d;
                if (u802 != null) {
                    aVar.mo74322i(2, u802.computeSize());
                    this.f141370d.writeFields(aVar);
                }
                i35 i35 = this.f141371e;
                if (i35 != null) {
                    aVar.mo74322i(3, i35.computeSize());
                    this.f141371e.writeFields(aVar);
                }
                C50182ku3 ku32 = this.f141372f;
                if (ku32 != null) {
                    aVar.mo74322i(100, ku32.computeSize());
                    this.f141372f.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C51506u80 u803 = this.f141370d;
            if (u803 != null) {
                i2 += C52418a.m58682i(2, u803.computeSize());
            }
            i35 i352 = this.f141371e;
            if (i352 != null) {
                i2 += C52418a.m58682i(3, i352.computeSize());
            }
            C50182ku3 ku33 = this.f141372f;
            return ku33 != null ? i2 + C52418a.m58682i(100, ku33.computeSize()) : i2;
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
            C51209s80 s802 = objArr[1];
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
                    s802.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C51506u80 u804 = new C51506u80();
                    if (bArr2 != null && bArr2.length > 0) {
                        u804.parseFrom(bArr2);
                    }
                    s802.f141370d = u804;
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    i35 i353 = new i35();
                    if (bArr3 != null && bArr3.length > 0) {
                        i353.parseFrom(bArr3);
                    }
                    s802.f141371e = i353;
                }
                return 0;
            } else if (intValue != 100) {
                return -1;
            } else {
                LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                int size4 = j4.size();
                for (int i6 = 0; i6 < size4; i6++) {
                    byte[] bArr4 = j4.get(i6);
                    C50182ku3 ku34 = new C50182ku3();
                    if (bArr4 != null && bArr4.length > 0) {
                        ku34.parseFrom(bArr4);
                    }
                    s802.f141372f = ku34;
                }
                return 0;
            }
        }
    }
}
