package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class ks4 extends C49335eu3 {

    /* renamed from: d */
    public C89349b f137026d;

    /* renamed from: e */
    public int f137027e;

    /* renamed from: f */
    public String f137028f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ks4)) {
            return false;
        }
        ks4 ks4 = (ks4) aVar;
        return C46238a.m51546a(this.BaseResponse, ks4.BaseResponse) && C46238a.m51546a(this.f137026d, ks4.f137026d) && C46238a.m51546a(Integer.valueOf(this.f137027e), Integer.valueOf(ks4.f137027e)) && C46238a.m51546a(this.f137028f, ks4.f137028f);
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
                C89349b bVar = this.f137026d;
                if (bVar != null) {
                    aVar.mo74315b(2, bVar);
                }
                aVar.mo74318e(3, this.f137027e);
                String str = this.f137028f;
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
            C89349b bVar2 = this.f137026d;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(2, bVar2);
            }
            int e = i2 + C52418a.m58678e(3, this.f137027e);
            String str2 = this.f137028f;
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
            ks4 ks4 = objArr[1];
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
                    ks4.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                ks4.f137026d = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue == 3) {
                ks4.f137027e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                ks4.f137028f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
