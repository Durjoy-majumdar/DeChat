package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.k42 */
public class C50079k42 extends C49335eu3 {

    /* renamed from: d */
    public String f136543d;

    /* renamed from: e */
    public String f136544e;

    /* renamed from: f */
    public int f136545f;

    /* renamed from: g */
    public String f136546g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50079k42)) {
            return false;
        }
        C50079k42 k422 = (C50079k42) aVar;
        return C46238a.m51546a(this.BaseResponse, k422.BaseResponse) && C46238a.m51546a(this.f136543d, k422.f136543d) && C46238a.m51546a(this.f136544e, k422.f136544e) && C46238a.m51546a(Integer.valueOf(this.f136545f), Integer.valueOf(k422.f136545f)) && C46238a.m51546a(this.f136546g, k422.f136546g);
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
                String str = this.f136543d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                String str2 = this.f136544e;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                aVar.mo74318e(4, this.f136545f);
                String str3 = this.f136546g;
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
            String str4 = this.f136543d;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            String str5 = this.f136544e;
            if (str5 != null) {
                i2 += C52418a.m58683j(3, str5);
            }
            int e = i2 + C52418a.m58678e(4, this.f136545f);
            String str6 = this.f136546g;
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
            C50079k42 k422 = objArr[1];
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
                    k422.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                k422.f136543d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                k422.f136544e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                k422.f136545f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                k422.f136546g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
