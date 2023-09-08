package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class tm4 extends C49335eu3 {

    /* renamed from: d */
    public String f185612d;

    /* renamed from: e */
    public String f185613e;

    /* renamed from: f */
    public String f185614f;

    /* renamed from: g */
    public String f185615g;

    /* renamed from: h */
    public int f185616h;

    /* renamed from: i */
    public int f185617i;

    /* renamed from: j */
    public int f185618j;

    /* renamed from: n */
    public int f185619n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof tm4)) {
            return false;
        }
        tm4 tm4 = (tm4) aVar;
        return C46238a.m51546a(this.BaseResponse, tm4.BaseResponse) && C46238a.m51546a(this.f185612d, tm4.f185612d) && C46238a.m51546a(this.f185613e, tm4.f185613e) && C46238a.m51546a(this.f185614f, tm4.f185614f) && C46238a.m51546a(this.f185615g, tm4.f185615g) && C46238a.m51546a(Integer.valueOf(this.f185616h), Integer.valueOf(tm4.f185616h)) && C46238a.m51546a(Integer.valueOf(this.f185617i), Integer.valueOf(tm4.f185617i)) && C46238a.m51546a(Integer.valueOf(this.f185618j), Integer.valueOf(tm4.f185618j)) && C46238a.m51546a(Integer.valueOf(this.f185619n), Integer.valueOf(tm4.f185619n));
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
                String str = this.f185612d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                String str2 = this.f185613e;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                String str3 = this.f185614f;
                if (str3 != null) {
                    aVar.mo74323j(4, str3);
                }
                String str4 = this.f185615g;
                if (str4 != null) {
                    aVar.mo74323j(5, str4);
                }
                aVar.mo74318e(6, this.f185616h);
                aVar.mo74318e(7, this.f185617i);
                aVar.mo74318e(8, this.f185618j);
                aVar.mo74318e(9, this.f185619n);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            String str5 = this.f185612d;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f185613e;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            String str7 = this.f185614f;
            if (str7 != null) {
                i2 += C52418a.m58683j(4, str7);
            }
            String str8 = this.f185615g;
            if (str8 != null) {
                i2 += C52418a.m58683j(5, str8);
            }
            return i2 + C52418a.m58678e(6, this.f185616h) + C52418a.m58678e(7, this.f185617i) + C52418a.m58678e(8, this.f185618j) + C52418a.m58678e(9, this.f185619n);
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
            tm4 tm4 = objArr[1];
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
                        tm4.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    tm4.f185612d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    tm4.f185613e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    tm4.f185614f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    tm4.f185615g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    tm4.f185616h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    tm4.f185617i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    tm4.f185618j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    tm4.f185619n = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
