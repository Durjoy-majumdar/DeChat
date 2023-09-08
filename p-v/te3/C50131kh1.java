package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.kh1 */
public class C50131kh1 extends C49335eu3 {

    /* renamed from: d */
    public String f136790d;

    /* renamed from: e */
    public long f136791e;

    /* renamed from: f */
    public String f136792f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50131kh1)) {
            return false;
        }
        C50131kh1 kh12 = (C50131kh1) aVar;
        return C46238a.m51546a(this.BaseResponse, kh12.BaseResponse) && C46238a.m51546a(this.f136790d, kh12.f136790d) && C46238a.m51546a(Long.valueOf(this.f136791e), Long.valueOf(kh12.f136791e)) && C46238a.m51546a(this.f136792f, kh12.f136792f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                aVar.mo74322i(1, jaVar.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            String str = this.f136790d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74321h(3, this.f136791e);
            String str2 = this.f136792f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            String str3 = this.f136790d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            int h = i2 + C52418a.m58681h(3, this.f136791e);
            String str4 = this.f136792f;
            return str4 != null ? h + C52418a.m58683j(4, str4) : h;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C50131kh1 kh12 = objArr[1];
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
                    kh12.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                kh12.f136790d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                kh12.f136791e = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                kh12.f136792f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
