package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class gd4 extends C49335eu3 {

    /* renamed from: d */
    public String f133982d;

    /* renamed from: e */
    public String f133983e;

    /* renamed from: f */
    public int f133984f;

    /* renamed from: g */
    public String f133985g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof gd4)) {
            return false;
        }
        gd4 gd4 = (gd4) aVar;
        return C46238a.m51546a(this.BaseResponse, gd4.BaseResponse) && C46238a.m51546a(this.f133982d, gd4.f133982d) && C46238a.m51546a(this.f133983e, gd4.f133983e) && C46238a.m51546a(Integer.valueOf(this.f133984f), Integer.valueOf(gd4.f133984f)) && C46238a.m51546a(this.f133985g, gd4.f133985g);
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
                String str = this.f133982d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                String str2 = this.f133983e;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                aVar.mo74318e(4, this.f133984f);
                String str3 = this.f133985g;
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
            String str4 = this.f133982d;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            String str5 = this.f133983e;
            if (str5 != null) {
                i2 += C52418a.m58683j(3, str5);
            }
            int e = i2 + C52418a.m58678e(4, this.f133984f);
            String str6 = this.f133985g;
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
            gd4 gd4 = objArr[1];
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
                    gd4.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                gd4.f133982d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                gd4.f133983e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                gd4.f133984f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                gd4.f133985g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
