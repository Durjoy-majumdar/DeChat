package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class vm4 extends C49335eu3 {

    /* renamed from: d */
    public int f143566d;

    /* renamed from: e */
    public int f143567e;

    /* renamed from: f */
    public String f143568f;

    /* renamed from: g */
    public String f143569g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof vm4)) {
            return false;
        }
        vm4 vm4 = (vm4) aVar;
        return C46238a.m51546a(this.BaseResponse, vm4.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f143566d), Integer.valueOf(vm4.f143566d)) && C46238a.m51546a(Integer.valueOf(this.f143567e), Integer.valueOf(vm4.f143567e)) && C46238a.m51546a(this.f143568f, vm4.f143568f) && C46238a.m51546a(this.f143569g, vm4.f143569g);
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
                aVar.mo74318e(2, this.f143566d);
                aVar.mo74318e(3, this.f143567e);
                String str = this.f143568f;
                if (str != null) {
                    aVar.mo74323j(4, str);
                }
                String str2 = this.f143569g;
                if (str2 != null) {
                    aVar.mo74323j(5, str2);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f143566d) + C52418a.m58678e(3, this.f143567e);
            String str3 = this.f143568f;
            if (str3 != null) {
                e += C52418a.m58683j(4, str3);
            }
            String str4 = this.f143569g;
            return str4 != null ? e + C52418a.m58683j(5, str4) : e;
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
            vm4 vm4 = objArr[1];
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
                    vm4.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                vm4.f143566d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                vm4.f143567e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                vm4.f143568f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                vm4.f143569g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
