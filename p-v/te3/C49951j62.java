package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.j62 */
public class C49951j62 extends C49335eu3 {

    /* renamed from: d */
    public String f135893d;

    /* renamed from: e */
    public String f135894e;

    /* renamed from: f */
    public String f135895f;

    /* renamed from: g */
    public float f135896g;

    /* renamed from: h */
    public float f135897h;

    /* renamed from: i */
    public float f135898i;

    /* renamed from: j */
    public int f135899j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49951j62)) {
            return false;
        }
        C49951j62 j622 = (C49951j62) aVar;
        return C46238a.m51546a(this.BaseResponse, j622.BaseResponse) && C46238a.m51546a(this.f135893d, j622.f135893d) && C46238a.m51546a(this.f135894e, j622.f135894e) && C46238a.m51546a(this.f135895f, j622.f135895f) && C46238a.m51546a(Float.valueOf(this.f135896g), Float.valueOf(j622.f135896g)) && C46238a.m51546a(Float.valueOf(this.f135897h), Float.valueOf(j622.f135897h)) && C46238a.m51546a(Float.valueOf(this.f135898i), Float.valueOf(j622.f135898i)) && C46238a.m51546a(Integer.valueOf(this.f135899j), Integer.valueOf(j622.f135899j));
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
                String str = this.f135893d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                String str2 = this.f135894e;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                String str3 = this.f135895f;
                if (str3 != null) {
                    aVar.mo74323j(4, str3);
                }
                aVar.mo74317d(5, this.f135896g);
                aVar.mo74317d(6, this.f135897h);
                aVar.mo74317d(7, this.f135898i);
                aVar.mo74318e(8, this.f135899j);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            String str4 = this.f135893d;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            String str5 = this.f135894e;
            if (str5 != null) {
                i2 += C52418a.m58683j(3, str5);
            }
            String str6 = this.f135895f;
            if (str6 != null) {
                i2 += C52418a.m58683j(4, str6);
            }
            return i2 + C52418a.m58677d(5, this.f135896g) + C52418a.m58677d(6, this.f135897h) + C52418a.m58677d(7, this.f135898i) + C52418a.m58678e(8, this.f135899j);
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
            C49951j62 j622 = objArr[1];
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
                        j622.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    j622.f135893d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    j622.f135894e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    j622.f135895f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    j622.f135896g = aVar3.mo141628f(intValue);
                    return 0;
                case 6:
                    j622.f135897h = aVar3.mo141628f(intValue);
                    return 0;
                case 7:
                    j622.f135898i = aVar3.mo141628f(intValue);
                    return 0;
                case 8:
                    j622.f135899j = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
