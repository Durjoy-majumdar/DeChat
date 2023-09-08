package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.sx1 */
public class C51312sx1 extends C49335eu3 {

    /* renamed from: d */
    public int f141812d;

    /* renamed from: e */
    public int f141813e;

    /* renamed from: f */
    public int f141814f;

    /* renamed from: g */
    public int f141815g;

    /* renamed from: h */
    public int f141816h;

    /* renamed from: i */
    public String f141817i;

    /* renamed from: j */
    public int f141818j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51312sx1)) {
            return false;
        }
        C51312sx1 sx12 = (C51312sx1) aVar;
        return C46238a.m51546a(this.BaseResponse, sx12.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f141812d), Integer.valueOf(sx12.f141812d)) && C46238a.m51546a(Integer.valueOf(this.f141813e), Integer.valueOf(sx12.f141813e)) && C46238a.m51546a(Integer.valueOf(this.f141814f), Integer.valueOf(sx12.f141814f)) && C46238a.m51546a(Integer.valueOf(this.f141815g), Integer.valueOf(sx12.f141815g)) && C46238a.m51546a(Integer.valueOf(this.f141816h), Integer.valueOf(sx12.f141816h)) && C46238a.m51546a(this.f141817i, sx12.f141817i) && C46238a.m51546a(Integer.valueOf(this.f141818j), Integer.valueOf(sx12.f141818j));
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
                aVar.mo74318e(2, this.f141812d);
                aVar.mo74318e(3, this.f141813e);
                aVar.mo74318e(4, this.f141814f);
                aVar.mo74318e(5, this.f141815g);
                aVar.mo74318e(6, this.f141816h);
                String str = this.f141817i;
                if (str != null) {
                    aVar.mo74323j(7, str);
                }
                aVar.mo74318e(8, this.f141818j);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f141812d) + C52418a.m58678e(3, this.f141813e) + C52418a.m58678e(4, this.f141814f) + C52418a.m58678e(5, this.f141815g) + C52418a.m58678e(6, this.f141816h);
            String str2 = this.f141817i;
            if (str2 != null) {
                e += C52418a.m58683j(7, str2);
            }
            return e + C52418a.m58678e(8, this.f141818j);
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
            C51312sx1 sx12 = objArr[1];
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
                        sx12.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    sx12.f141812d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    sx12.f141813e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    sx12.f141814f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    sx12.f141815g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    sx12.f141816h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    sx12.f141817i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    sx12.f141818j = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
