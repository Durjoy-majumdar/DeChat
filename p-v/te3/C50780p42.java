package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.p42 */
public class C50780p42 extends C49335eu3 {

    /* renamed from: d */
    public int f139575d;

    /* renamed from: e */
    public String f139576e;

    /* renamed from: f */
    public String f139577f;

    /* renamed from: g */
    public String f139578g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50780p42)) {
            return false;
        }
        C50780p42 p422 = (C50780p42) aVar;
        return C46238a.m51546a(this.BaseResponse, p422.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f139575d), Integer.valueOf(p422.f139575d)) && C46238a.m51546a(this.f139576e, p422.f139576e) && C46238a.m51546a(this.f139577f, p422.f139577f) && C46238a.m51546a(this.f139578g, p422.f139578g);
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
                aVar.mo74318e(2, this.f139575d);
                String str = this.f139576e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                String str2 = this.f139577f;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                String str3 = this.f139578g;
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
            int e = i2 + C52418a.m58678e(2, this.f139575d);
            String str4 = this.f139576e;
            if (str4 != null) {
                e += C52418a.m58683j(3, str4);
            }
            String str5 = this.f139577f;
            if (str5 != null) {
                e += C52418a.m58683j(4, str5);
            }
            String str6 = this.f139578g;
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
            C50780p42 p422 = objArr[1];
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
                    p422.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                p422.f139575d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                p422.f139576e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                p422.f139577f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                p422.f139578g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
