package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.xz2 */
public class C52042xz2 extends C49335eu3 {

    /* renamed from: d */
    public int f145038d;

    /* renamed from: e */
    public String f145039e;

    /* renamed from: f */
    public long f145040f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52042xz2)) {
            return false;
        }
        C52042xz2 xz22 = (C52042xz2) aVar;
        return C46238a.m51546a(this.BaseResponse, xz22.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f145038d), Integer.valueOf(xz22.f145038d)) && C46238a.m51546a(this.f145039e, xz22.f145039e) && C46238a.m51546a(Long.valueOf(this.f145040f), Long.valueOf(xz22.f145040f));
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
                aVar.mo74318e(2, this.f145038d);
                String str = this.f145039e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                aVar.mo74321h(4, this.f145040f);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f145038d);
            String str2 = this.f145039e;
            if (str2 != null) {
                e += C52418a.m58683j(3, str2);
            }
            return e + C52418a.m58681h(4, this.f145040f);
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
            C52042xz2 xz22 = objArr[1];
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
                    xz22.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                xz22.f145038d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                xz22.f145039e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                xz22.f145040f = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }
}
