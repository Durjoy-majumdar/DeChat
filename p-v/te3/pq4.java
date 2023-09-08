package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class pq4 extends C49335eu3 {

    /* renamed from: d */
    public String f139905d;

    /* renamed from: e */
    public String f139906e;

    /* renamed from: f */
    public qq4 f139907f;

    /* renamed from: g */
    public String f139908g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof pq4)) {
            return false;
        }
        pq4 pq4 = (pq4) aVar;
        return C46238a.m51546a(this.BaseResponse, pq4.BaseResponse) && C46238a.m51546a(this.f139905d, pq4.f139905d) && C46238a.m51546a(this.f139906e, pq4.f139906e) && C46238a.m51546a(this.f139907f, pq4.f139907f) && C46238a.m51546a(this.f139908g, pq4.f139908g);
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
                String str = this.f139905d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                String str2 = this.f139906e;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                qq4 qq4 = this.f139907f;
                if (qq4 != null) {
                    aVar.mo74322i(4, qq4.computeSize());
                    this.f139907f.writeFields(aVar);
                }
                String str3 = this.f139908g;
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
            String str4 = this.f139905d;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            String str5 = this.f139906e;
            if (str5 != null) {
                i2 += C52418a.m58683j(3, str5);
            }
            qq4 qq42 = this.f139907f;
            if (qq42 != null) {
                i2 += C52418a.m58682i(4, qq42.computeSize());
            }
            String str6 = this.f139908g;
            return str6 != null ? i2 + C52418a.m58683j(5, str6) : i2;
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
            pq4 pq4 = objArr[1];
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
                    pq4.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                pq4.f139905d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                pq4.f139906e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    qq4 qq43 = new qq4();
                    if (bArr2 != null && bArr2.length > 0) {
                        qq43.parseFrom(bArr2);
                    }
                    pq4.f139907f = qq43;
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                pq4.f139908g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
