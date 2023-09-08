package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ad3 */
public class C48699ad3 extends C49335eu3 {

    /* renamed from: d */
    public String f130459d;

    /* renamed from: e */
    public String f130460e;

    /* renamed from: f */
    public String f130461f;

    /* renamed from: g */
    public String f130462g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48699ad3)) {
            return false;
        }
        C48699ad3 ad32 = (C48699ad3) aVar;
        return C46238a.m51546a(this.BaseResponse, ad32.BaseResponse) && C46238a.m51546a(this.f130459d, ad32.f130459d) && C46238a.m51546a(this.f130460e, ad32.f130460e) && C46238a.m51546a(this.f130461f, ad32.f130461f) && C46238a.m51546a(this.f130462g, ad32.f130462g);
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
                String str = this.f130459d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                String str2 = this.f130460e;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                String str3 = this.f130461f;
                if (str3 != null) {
                    aVar.mo74323j(4, str3);
                }
                String str4 = this.f130462g;
                if (str4 != null) {
                    aVar.mo74323j(5, str4);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            String str5 = this.f130459d;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f130460e;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            String str7 = this.f130461f;
            if (str7 != null) {
                i2 += C52418a.m58683j(4, str7);
            }
            String str8 = this.f130462g;
            return str8 != null ? i2 + C52418a.m58683j(5, str8) : i2;
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
            C48699ad3 ad32 = objArr[1];
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
                    ad32.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                ad32.f130459d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                ad32.f130460e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                ad32.f130461f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                ad32.f130462g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
