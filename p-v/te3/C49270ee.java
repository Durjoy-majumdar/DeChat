package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ee */
public class C49270ee extends C49335eu3 {

    /* renamed from: d */
    public String f132880d;

    /* renamed from: e */
    public long f132881e;

    /* renamed from: f */
    public int f132882f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49270ee)) {
            return false;
        }
        C49270ee eeVar = (C49270ee) aVar;
        return C46238a.m51546a(this.BaseResponse, eeVar.BaseResponse) && C46238a.m51546a(this.f132880d, eeVar.f132880d) && C46238a.m51546a(Long.valueOf(this.f132881e), Long.valueOf(eeVar.f132881e)) && C46238a.m51546a(Integer.valueOf(this.f132882f), Integer.valueOf(eeVar.f132882f));
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
                String str = this.f132880d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                aVar.mo74321h(11, this.f132881e);
                aVar.mo74318e(15, this.f132882f);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            String str2 = this.f132880d;
            if (str2 != null) {
                i2 += C52418a.m58683j(2, str2);
            }
            return i2 + C52418a.m58681h(11, this.f132881e) + C52418a.m58678e(15, this.f132882f);
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
            C49270ee eeVar = objArr[1];
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
                    eeVar.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                eeVar.f132880d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 11) {
                eeVar.f132881e = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 15) {
                return -1;
            } else {
                eeVar.f132882f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
