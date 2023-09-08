package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ri3 */
public class C51114ri3 extends C49335eu3 {

    /* renamed from: d */
    public String f140934d;

    /* renamed from: e */
    public String f140935e;

    /* renamed from: f */
    public int f140936f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51114ri3)) {
            return false;
        }
        C51114ri3 ri32 = (C51114ri3) aVar;
        return C46238a.m51546a(this.BaseResponse, ri32.BaseResponse) && C46238a.m51546a(this.f140934d, ri32.f140934d) && C46238a.m51546a(this.f140935e, ri32.f140935e) && C46238a.m51546a(Integer.valueOf(this.f140936f), Integer.valueOf(ri32.f140936f));
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
                String str = this.f140934d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                String str2 = this.f140935e;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                aVar.mo74318e(4, this.f140936f);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            String str3 = this.f140934d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            String str4 = this.f140935e;
            if (str4 != null) {
                i2 += C52418a.m58683j(3, str4);
            }
            return i2 + C52418a.m58678e(4, this.f140936f);
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
            C51114ri3 ri32 = objArr[1];
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
                    ri32.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                ri32.f140934d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                ri32.f140935e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                ri32.f140936f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
