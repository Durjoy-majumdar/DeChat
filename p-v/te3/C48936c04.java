package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.c04 */
public class C48936c04 extends C49335eu3 {

    /* renamed from: d */
    public int f131432d;

    /* renamed from: e */
    public LinkedList<C52318zw2> f131433e = new LinkedList<>();

    /* renamed from: f */
    public int f131434f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48936c04)) {
            return false;
        }
        C48936c04 c042 = (C48936c04) aVar;
        return C46238a.m51546a(this.BaseResponse, c042.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f131432d), Integer.valueOf(c042.f131432d)) && C46238a.m51546a(this.f131433e, c042.f131433e) && C46238a.m51546a(Integer.valueOf(this.f131434f), Integer.valueOf(c042.f131434f));
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
                aVar.mo74318e(2, this.f131432d);
                aVar.mo74320g(3, 8, this.f131433e);
                aVar.mo74318e(4, this.f131434f);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f131432d) + C52418a.m58680g(3, 8, this.f131433e) + C52418a.m58678e(4, this.f131434f);
        } else if (i == 2) {
            this.f131433e.clear();
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
            C48936c04 c042 = objArr[1];
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
                    c042.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                c042.f131432d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C52318zw2 zw22 = new C52318zw2();
                    if (bArr2 != null && bArr2.length > 0) {
                        zw22.parseFrom(bArr2);
                    }
                    c042.f131433e.add(zw22);
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                c042.f131434f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
