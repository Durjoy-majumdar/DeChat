package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.v52 */
public class C51648v52 extends C49335eu3 {

    /* renamed from: d */
    public String f143314d;

    /* renamed from: e */
    public int f143315e;

    /* renamed from: f */
    public int f143316f;

    /* renamed from: g */
    public int f143317g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51648v52)) {
            return false;
        }
        C51648v52 v522 = (C51648v52) aVar;
        return C46238a.m51546a(this.BaseResponse, v522.BaseResponse) && C46238a.m51546a(this.f143314d, v522.f143314d) && C46238a.m51546a(Integer.valueOf(this.f143315e), Integer.valueOf(v522.f143315e)) && C46238a.m51546a(Integer.valueOf(this.f143316f), Integer.valueOf(v522.f143316f)) && C46238a.m51546a(Integer.valueOf(this.f143317g), Integer.valueOf(v522.f143317g));
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
                String str = this.f143314d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                aVar.mo74318e(3, this.f143315e);
                aVar.mo74318e(4, this.f143316f);
                aVar.mo74318e(5, this.f143317g);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            String str2 = this.f143314d;
            if (str2 != null) {
                i2 += C52418a.m58683j(2, str2);
            }
            return i2 + C52418a.m58678e(3, this.f143315e) + C52418a.m58678e(4, this.f143316f) + C52418a.m58678e(5, this.f143317g);
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
            C51648v52 v522 = objArr[1];
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
                    v522.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                v522.f143314d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                v522.f143315e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                v522.f143316f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                v522.f143317g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
