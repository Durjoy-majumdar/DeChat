package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.v34 */
public class C51641v34 extends C49335eu3 {

    /* renamed from: d */
    public int f143286d;

    /* renamed from: e */
    public int f143287e;

    /* renamed from: f */
    public String f143288f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51641v34)) {
            return false;
        }
        C51641v34 v342 = (C51641v34) aVar;
        return C46238a.m51546a(this.BaseResponse, v342.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f143286d), Integer.valueOf(v342.f143286d)) && C46238a.m51546a(Integer.valueOf(this.f143287e), Integer.valueOf(v342.f143287e)) && C46238a.m51546a(this.f143288f, v342.f143288f);
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
                aVar.mo74318e(2, this.f143286d);
                aVar.mo74318e(3, this.f143287e);
                String str = this.f143288f;
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
            int e = i2 + C52418a.m58678e(2, this.f143286d) + C52418a.m58678e(3, this.f143287e);
            String str2 = this.f143288f;
            return str2 != null ? e + C52418a.m58683j(4, str2) : e;
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
            C51641v34 v342 = objArr[1];
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
                    v342.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                v342.f143286d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                v342.f143287e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                v342.f143288f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
