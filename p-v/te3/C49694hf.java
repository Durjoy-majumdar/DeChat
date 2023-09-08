package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.hf */
public class C49694hf extends C49335eu3 {

    /* renamed from: d */
    public int f134589d;

    /* renamed from: e */
    public String f134590e;

    /* renamed from: f */
    public String f134591f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49694hf)) {
            return false;
        }
        C49694hf hfVar = (C49694hf) aVar;
        return C46238a.m51546a(this.BaseResponse, hfVar.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f134589d), Integer.valueOf(hfVar.f134589d)) && C46238a.m51546a(this.f134590e, hfVar.f134590e) && C46238a.m51546a(this.f134591f, hfVar.f134591f);
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
                aVar.mo74318e(2, this.f134589d);
                String str = this.f134590e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                String str2 = this.f134591f;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f134589d);
            String str3 = this.f134590e;
            if (str3 != null) {
                e += C52418a.m58683j(3, str3);
            }
            String str4 = this.f134591f;
            return str4 != null ? e + C52418a.m58683j(4, str4) : e;
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
            C49694hf hfVar = objArr[1];
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
                    hfVar.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                hfVar.f134589d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                hfVar.f134590e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                hfVar.f134591f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
