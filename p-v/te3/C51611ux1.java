package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ux1 */
public class C51611ux1 extends C49335eu3 {

    /* renamed from: d */
    public String f143174d;

    /* renamed from: e */
    public int f143175e;

    /* renamed from: f */
    public C49324es f143176f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51611ux1)) {
            return false;
        }
        C51611ux1 ux12 = (C51611ux1) aVar;
        return C46238a.m51546a(this.BaseResponse, ux12.BaseResponse) && C46238a.m51546a(this.f143174d, ux12.f143174d) && C46238a.m51546a(Integer.valueOf(this.f143175e), Integer.valueOf(ux12.f143175e)) && C46238a.m51546a(this.f143176f, ux12.f143176f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f143176f != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                String str = this.f143174d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                aVar.mo74318e(3, this.f143175e);
                C49324es esVar = this.f143176f;
                if (esVar != null) {
                    aVar.mo74322i(4, esVar.computeSize());
                    this.f143176f.writeFields(aVar);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: NewChatroomData");
            }
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            String str2 = this.f143174d;
            if (str2 != null) {
                i2 += C52418a.m58683j(2, str2);
            }
            int e = i2 + C52418a.m58678e(3, this.f143175e);
            C49324es esVar2 = this.f143176f;
            return esVar2 != null ? e + C52418a.m58682i(4, esVar2.computeSize()) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f143176f != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: NewChatroomData");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C51611ux1 ux12 = objArr[1];
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
                    ux12.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                ux12.f143174d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                ux12.f143175e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C49324es esVar3 = new C49324es();
                    if (bArr2 != null && bArr2.length > 0) {
                        esVar3.parseFrom(bArr2);
                    }
                    ux12.f143176f = esVar3;
                }
                return 0;
            }
        }
    }
}
