package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.b62 */
public class C48815b62 extends C49335eu3 {

    /* renamed from: d */
    public int f130981d;

    /* renamed from: e */
    public String f130982e;

    /* renamed from: f */
    public String f130983f;

    /* renamed from: g */
    public boolean f130984g;

    /* renamed from: h */
    public String f130985h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48815b62)) {
            return false;
        }
        C48815b62 b622 = (C48815b62) aVar;
        return C46238a.m51546a(this.BaseResponse, b622.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f130981d), Integer.valueOf(b622.f130981d)) && C46238a.m51546a(this.f130982e, b622.f130982e) && C46238a.m51546a(this.f130983f, b622.f130983f) && C46238a.m51546a(Boolean.valueOf(this.f130984g), Boolean.valueOf(b622.f130984g)) && C46238a.m51546a(this.f130985h, b622.f130985h);
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
                aVar.mo74318e(2, this.f130981d);
                String str = this.f130982e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                String str2 = this.f130983f;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                aVar.mo74314a(5, this.f130984g);
                String str3 = this.f130985h;
                if (str3 != null) {
                    aVar.mo74323j(6, str3);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f130981d);
            String str4 = this.f130982e;
            if (str4 != null) {
                e += C52418a.m58683j(3, str4);
            }
            String str5 = this.f130983f;
            if (str5 != null) {
                e += C52418a.m58683j(4, str5);
            }
            int a = e + C52418a.m58674a(5, this.f130984g);
            String str6 = this.f130985h;
            return str6 != null ? a + C52418a.m58683j(6, str6) : a;
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
            C48815b62 b622 = objArr[1];
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
                        b622.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    b622.f130981d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    b622.f130982e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    b622.f130983f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    b622.f130984g = aVar3.mo141625c(intValue);
                    return 0;
                case 6:
                    b622.f130985h = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
