package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.iu */
public class C49896iu extends C49335eu3 {

    /* renamed from: d */
    public int f135661d;

    /* renamed from: e */
    public int f135662e;

    /* renamed from: f */
    public int f135663f;

    /* renamed from: g */
    public int f135664g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49896iu)) {
            return false;
        }
        C49896iu iuVar = (C49896iu) aVar;
        return C46238a.m51546a(this.BaseResponse, iuVar.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f135661d), Integer.valueOf(iuVar.f135661d)) && C46238a.m51546a(Integer.valueOf(this.f135662e), Integer.valueOf(iuVar.f135662e)) && C46238a.m51546a(Integer.valueOf(this.f135663f), Integer.valueOf(iuVar.f135663f)) && C46238a.m51546a(Integer.valueOf(this.f135664g), Integer.valueOf(iuVar.f135664g));
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
                aVar.mo74318e(2, this.f135661d);
                aVar.mo74318e(3, this.f135662e);
                aVar.mo74318e(4, this.f135663f);
                aVar.mo74318e(5, this.f135664g);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f135661d) + C52418a.m58678e(3, this.f135662e) + C52418a.m58678e(4, this.f135663f) + C52418a.m58678e(5, this.f135664g);
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
            C49896iu iuVar = objArr[1];
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
                    iuVar.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                iuVar.f135661d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                iuVar.f135662e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                iuVar.f135663f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                iuVar.f135664g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
