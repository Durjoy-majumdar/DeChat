package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.gq3 */
public class C49597gq3 extends C49335eu3 {

    /* renamed from: d */
    public String f134199d;

    /* renamed from: e */
    public String f134200e;

    /* renamed from: f */
    public int f134201f;

    /* renamed from: g */
    public C51018qv3 f134202g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49597gq3)) {
            return false;
        }
        C49597gq3 gq32 = (C49597gq3) aVar;
        return C46238a.m51546a(this.BaseResponse, gq32.BaseResponse) && C46238a.m51546a(this.f134199d, gq32.f134199d) && C46238a.m51546a(this.f134200e, gq32.f134200e) && C46238a.m51546a(Integer.valueOf(this.f134201f), Integer.valueOf(gq32.f134201f)) && C46238a.m51546a(this.f134202g, gq32.f134202g);
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
                String str = this.f134199d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                String str2 = this.f134200e;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                aVar.mo74318e(4, this.f134201f);
                C51018qv3 qv32 = this.f134202g;
                if (qv32 != null) {
                    aVar.mo74322i(5, qv32.computeSize());
                    this.f134202g.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            String str3 = this.f134199d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            String str4 = this.f134200e;
            if (str4 != null) {
                i2 += C52418a.m58683j(3, str4);
            }
            int e = i2 + C52418a.m58678e(4, this.f134201f);
            C51018qv3 qv33 = this.f134202g;
            return qv33 != null ? e + C52418a.m58682i(5, qv33.computeSize()) : e;
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
            C49597gq3 gq32 = objArr[1];
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
                    gq32.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                gq32.f134199d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                gq32.f134200e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                gq32.f134201f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C51018qv3 qv34 = new C51018qv3();
                    if (bArr2 != null && bArr2.length > 0) {
                        qv34.mo73348f(bArr2);
                    }
                    gq32.f134202g = qv34;
                }
                return 0;
            }
        }
    }
}
