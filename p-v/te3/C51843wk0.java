package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.wk0 */
public class C51843wk0 extends C49335eu3 {

    /* renamed from: d */
    public String f144111d;

    /* renamed from: e */
    public String f144112e;

    /* renamed from: f */
    public int f144113f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51843wk0)) {
            return false;
        }
        C51843wk0 wk02 = (C51843wk0) aVar;
        return C46238a.m51546a(this.f144111d, wk02.f144111d) && C46238a.m51546a(this.f144112e, wk02.f144112e) && C46238a.m51546a(Integer.valueOf(this.f144113f), Integer.valueOf(wk02.f144113f)) && C46238a.m51546a(this.BaseResponse, wk02.BaseResponse);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.BaseResponse != null) {
                String str = this.f144111d;
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                String str2 = this.f144112e;
                if (str2 != null) {
                    aVar.mo74323j(2, str2);
                }
                aVar.mo74318e(3, this.f144113f);
                C49966ja jaVar = this.BaseResponse;
                if (jaVar != null) {
                    aVar.mo74322i(4, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            String str3 = this.f144111d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f144112e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            int e = i2 + C52418a.m58678e(3, this.f144113f);
            C49966ja jaVar2 = this.BaseResponse;
            return jaVar2 != null ? e + C52418a.m58682i(4, jaVar2.computeSize()) : e;
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
            C51843wk0 wk02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                wk02.f144111d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                wk02.f144112e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                wk02.f144113f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C49966ja jaVar3 = new C49966ja();
                    if (bArr != null && bArr.length > 0) {
                        jaVar3.parseFrom(bArr);
                    }
                    wk02.BaseResponse = jaVar3;
                }
                return 0;
            }
        }
    }
}
