package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.gc0 */
public class C49541gc0 extends C49335eu3 {

    /* renamed from: d */
    public String f133958d;

    /* renamed from: e */
    public boolean f133959e = true;

    /* renamed from: f */
    public String f133960f;

    /* renamed from: g */
    public String f133961g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49541gc0)) {
            return false;
        }
        C49541gc0 gc02 = (C49541gc0) aVar;
        return C46238a.m51546a(this.BaseResponse, gc02.BaseResponse) && C46238a.m51546a(this.f133958d, gc02.f133958d) && C46238a.m51546a(Boolean.valueOf(this.f133959e), Boolean.valueOf(gc02.f133959e)) && C46238a.m51546a(this.f133960f, gc02.f133960f) && C46238a.m51546a(this.f133961g, gc02.f133961g);
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
                String str = this.f133958d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                aVar.mo74314a(3, this.f133959e);
                String str2 = this.f133960f;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                String str3 = this.f133961g;
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
            String str4 = this.f133958d;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            int a = i2 + C52418a.m58674a(3, this.f133959e);
            String str5 = this.f133960f;
            if (str5 != null) {
                a += C52418a.m58683j(4, str5);
            }
            String str6 = this.f133961g;
            return str6 != null ? a + C52418a.m58683j(5, str6) : a;
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
            C49541gc0 gc02 = objArr[1];
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
                    gc02.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                gc02.f133958d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                gc02.f133959e = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue == 4) {
                gc02.f133960f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                gc02.f133961g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
