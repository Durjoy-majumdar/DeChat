package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class rm4 extends C49335eu3 {

    /* renamed from: d */
    public String f141029d;

    /* renamed from: e */
    public String f141030e;

    /* renamed from: f */
    public int f141031f;

    /* renamed from: g */
    public int f141032g;

    /* renamed from: h */
    public int f141033h;

    /* renamed from: i */
    public int f141034i;

    /* renamed from: j */
    public int f141035j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof rm4)) {
            return false;
        }
        rm4 rm4 = (rm4) aVar;
        return C46238a.m51546a(this.BaseResponse, rm4.BaseResponse) && C46238a.m51546a(this.f141029d, rm4.f141029d) && C46238a.m51546a(this.f141030e, rm4.f141030e) && C46238a.m51546a(Integer.valueOf(this.f141031f), Integer.valueOf(rm4.f141031f)) && C46238a.m51546a(Integer.valueOf(this.f141032g), Integer.valueOf(rm4.f141032g)) && C46238a.m51546a(Integer.valueOf(this.f141033h), Integer.valueOf(rm4.f141033h)) && C46238a.m51546a(Integer.valueOf(this.f141034i), Integer.valueOf(rm4.f141034i)) && C46238a.m51546a(Integer.valueOf(this.f141035j), Integer.valueOf(rm4.f141035j));
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
                String str = this.f141029d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                String str2 = this.f141030e;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                aVar.mo74318e(4, this.f141031f);
                aVar.mo74318e(5, this.f141032g);
                aVar.mo74318e(6, this.f141033h);
                aVar.mo74318e(7, this.f141034i);
                aVar.mo74318e(8, this.f141035j);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            String str3 = this.f141029d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            String str4 = this.f141030e;
            if (str4 != null) {
                i2 += C52418a.m58683j(3, str4);
            }
            return i2 + C52418a.m58678e(4, this.f141031f) + C52418a.m58678e(5, this.f141032g) + C52418a.m58678e(6, this.f141033h) + C52418a.m58678e(7, this.f141034i) + C52418a.m58678e(8, this.f141035j);
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
            rm4 rm4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C49966ja jaVar3 = new C49966ja();
                        if (bArr != null && bArr.length > 0) {
                            jaVar3.parseFrom(bArr);
                        }
                        rm4.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    rm4.f141029d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    rm4.f141030e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    rm4.f141031f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    rm4.f141032g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    rm4.f141033h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    rm4.f141034i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    rm4.f141035j = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
