package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.v13 */
public class C51630v13 extends C49335eu3 {

    /* renamed from: d */
    public String f143245d;

    /* renamed from: e */
    public String f143246e;

    /* renamed from: f */
    public String f143247f;

    /* renamed from: g */
    public String f143248g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51630v13)) {
            return false;
        }
        C51630v13 v132 = (C51630v13) aVar;
        return C46238a.m51546a(this.BaseResponse, v132.BaseResponse) && C46238a.m51546a(this.f143245d, v132.f143245d) && C46238a.m51546a(this.f143246e, v132.f143246e) && C46238a.m51546a(this.f143247f, v132.f143247f) && C46238a.m51546a(this.f143248g, v132.f143248g);
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
            String str = this.f143245d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f143246e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f143247f;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f143248g;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            String str5 = this.f143245d;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f143246e;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            String str7 = this.f143247f;
            if (str7 != null) {
                i2 += C52418a.m58683j(4, str7);
            }
            String str8 = this.f143248g;
            return str8 != null ? i2 + C52418a.m58683j(5, str8) : i2;
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
            C51630v13 v132 = objArr[1];
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
                    v132.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                v132.f143245d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                v132.f143246e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                v132.f143247f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                v132.f143248g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
