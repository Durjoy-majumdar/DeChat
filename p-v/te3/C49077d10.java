package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.d10 */
public class C49077d10 extends C49335eu3 {

    /* renamed from: d */
    public C49317ep2 f132059d;

    /* renamed from: e */
    public boolean f132060e;

    /* renamed from: f */
    public String f132061f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49077d10)) {
            return false;
        }
        C49077d10 d102 = (C49077d10) aVar;
        return C46238a.m51546a(this.BaseResponse, d102.BaseResponse) && C46238a.m51546a(this.f132059d, d102.f132059d) && C46238a.m51546a(Boolean.valueOf(this.f132060e), Boolean.valueOf(d102.f132060e)) && C46238a.m51546a(this.f132061f, d102.f132061f);
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
                C49317ep2 ep22 = this.f132059d;
                if (ep22 != null) {
                    aVar.mo74322i(2, ep22.computeSize());
                    this.f132059d.writeFields(aVar);
                }
                aVar.mo74314a(3, this.f132060e);
                String str = this.f132061f;
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
            C49317ep2 ep23 = this.f132059d;
            if (ep23 != null) {
                i2 += C52418a.m58682i(2, ep23.computeSize());
            }
            int a = i2 + C52418a.m58674a(3, this.f132060e);
            String str2 = this.f132061f;
            return str2 != null ? a + C52418a.m58683j(4, str2) : a;
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
            C49077d10 d102 = objArr[1];
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
                    d102.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C49317ep2 ep24 = new C49317ep2();
                    if (bArr2 != null && bArr2.length > 0) {
                        ep24.parseFrom(bArr2);
                    }
                    d102.f132059d = ep24;
                }
                return 0;
            } else if (intValue == 3) {
                d102.f132060e = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                d102.f132061f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
