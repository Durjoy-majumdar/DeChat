package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ys1 */
public class C52163ys1 extends C49335eu3 {

    /* renamed from: d */
    public String f145492d;

    /* renamed from: e */
    public String f145493e;

    /* renamed from: f */
    public int f145494f;

    /* renamed from: g */
    public String f145495g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52163ys1)) {
            return false;
        }
        C52163ys1 ys12 = (C52163ys1) aVar;
        return C46238a.m51546a(this.BaseResponse, ys12.BaseResponse) && C46238a.m51546a(this.f145492d, ys12.f145492d) && C46238a.m51546a(this.f145493e, ys12.f145493e) && C46238a.m51546a(Integer.valueOf(this.f145494f), Integer.valueOf(ys12.f145494f)) && C46238a.m51546a(this.f145495g, ys12.f145495g);
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
                String str = this.f145492d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                String str2 = this.f145493e;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                aVar.mo74318e(4, this.f145494f);
                String str3 = this.f145495g;
                if (str3 != null) {
                    aVar.mo74323j(5, str3);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            String str4 = this.f145492d;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            String str5 = this.f145493e;
            if (str5 != null) {
                i2 += C52418a.m58683j(3, str5);
            }
            int e = i2 + C52418a.m58678e(4, this.f145494f);
            String str6 = this.f145495g;
            return str6 != null ? e + C52418a.m58683j(5, str6) : e;
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
            C52163ys1 ys12 = objArr[1];
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
                    ys12.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                ys12.f145492d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                ys12.f145493e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                ys12.f145494f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                ys12.f145495g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
