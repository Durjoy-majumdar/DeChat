package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ka2 */
public class C50103ka2 extends C49335eu3 {

    /* renamed from: d */
    public int f136636d;

    /* renamed from: e */
    public String f136637e;

    /* renamed from: f */
    public String f136638f;

    /* renamed from: g */
    public String f136639g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50103ka2)) {
            return false;
        }
        C50103ka2 ka22 = (C50103ka2) aVar;
        return C46238a.m51546a(this.BaseResponse, ka22.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f136636d), Integer.valueOf(ka22.f136636d)) && C46238a.m51546a(this.f136637e, ka22.f136637e) && C46238a.m51546a(this.f136638f, ka22.f136638f) && C46238a.m51546a(this.f136639g, ka22.f136639g);
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
            aVar.mo74318e(2, this.f136636d);
            String str = this.f136637e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f136638f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f136639g;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f136636d);
            String str4 = this.f136637e;
            if (str4 != null) {
                e += C52418a.m58683j(3, str4);
            }
            String str5 = this.f136638f;
            if (str5 != null) {
                e += C52418a.m58683j(4, str5);
            }
            String str6 = this.f136639g;
            return str6 != null ? e + C52418a.m58683j(5, str6) : e;
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
            C50103ka2 ka22 = objArr[1];
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
                    ka22.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                ka22.f136636d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                ka22.f136637e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                ka22.f136638f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                ka22.f136639g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
