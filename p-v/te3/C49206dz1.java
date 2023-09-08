package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.dz1 */
public class C49206dz1 extends C49335eu3 {

    /* renamed from: d */
    public int f132586d;

    /* renamed from: e */
    public String f132587e;

    /* renamed from: f */
    public String f132588f;

    /* renamed from: g */
    public String f132589g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49206dz1)) {
            return false;
        }
        C49206dz1 dz12 = (C49206dz1) aVar;
        return C46238a.m51546a(this.BaseResponse, dz12.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f132586d), Integer.valueOf(dz12.f132586d)) && C46238a.m51546a(this.f132587e, dz12.f132587e) && C46238a.m51546a(this.f132588f, dz12.f132588f) && C46238a.m51546a(this.f132589g, dz12.f132589g);
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
                aVar.mo74318e(2, this.f132586d);
                String str = this.f132587e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                String str2 = this.f132588f;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                String str3 = this.f132589g;
                if (str3 != null) {
                    aVar.mo74323j(5, str3);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f132586d);
            String str4 = this.f132587e;
            if (str4 != null) {
                e += C52418a.m58683j(3, str4);
            }
            String str5 = this.f132588f;
            if (str5 != null) {
                e += C52418a.m58683j(4, str5);
            }
            String str6 = this.f132589g;
            return str6 != null ? e + C52418a.m58683j(5, str6) : e;
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
            C49206dz1 dz12 = objArr[1];
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
                    dz12.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                dz12.f132586d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                dz12.f132587e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                dz12.f132588f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                dz12.f132589g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
