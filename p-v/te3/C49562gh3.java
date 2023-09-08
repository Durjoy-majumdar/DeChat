package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.gh3 */
public class C49562gh3 extends C49335eu3 {

    /* renamed from: d */
    public C48777ax2 f134052d;

    /* renamed from: e */
    public String f134053e;

    /* renamed from: f */
    public String f134054f;

    /* renamed from: g */
    public String f134055g;

    /* renamed from: h */
    public C49851ii2 f134056h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49562gh3)) {
            return false;
        }
        C49562gh3 gh32 = (C49562gh3) aVar;
        return C46238a.m51546a(this.BaseResponse, gh32.BaseResponse) && C46238a.m51546a(this.f134052d, gh32.f134052d) && C46238a.m51546a(this.f134053e, gh32.f134053e) && C46238a.m51546a(this.f134054f, gh32.f134054f) && C46238a.m51546a(this.f134055g, gh32.f134055g) && C46238a.m51546a(this.f134056h, gh32.f134056h);
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
                C48777ax2 ax22 = this.f134052d;
                if (ax22 != null) {
                    aVar.mo74322i(2, ax22.computeSize());
                    this.f134052d.writeFields(aVar);
                }
                String str = this.f134053e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                String str2 = this.f134054f;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                String str3 = this.f134055g;
                if (str3 != null) {
                    aVar.mo74323j(5, str3);
                }
                C49851ii2 ii22 = this.f134056h;
                if (ii22 != null) {
                    aVar.mo74322i(100, ii22.computeSize());
                    this.f134056h.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C48777ax2 ax23 = this.f134052d;
            if (ax23 != null) {
                i2 += C52418a.m58682i(2, ax23.computeSize());
            }
            String str4 = this.f134053e;
            if (str4 != null) {
                i2 += C52418a.m58683j(3, str4);
            }
            String str5 = this.f134054f;
            if (str5 != null) {
                i2 += C52418a.m58683j(4, str5);
            }
            String str6 = this.f134055g;
            if (str6 != null) {
                i2 += C52418a.m58683j(5, str6);
            }
            C49851ii2 ii23 = this.f134056h;
            return ii23 != null ? i2 + C52418a.m58682i(100, ii23.computeSize()) : i2;
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
            C49562gh3 gh32 = objArr[1];
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
                    gh32.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C48777ax2 ax24 = new C48777ax2();
                    if (bArr2 != null && bArr2.length > 0) {
                        ax24.parseFrom(bArr2);
                    }
                    gh32.f134052d = ax24;
                }
                return 0;
            } else if (intValue == 3) {
                gh32.f134053e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                gh32.f134054f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 5) {
                gh32.f134055g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 100) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C49851ii2 ii24 = new C49851ii2();
                    if (bArr3 != null && bArr3.length > 0) {
                        ii24.parseFrom(bArr3);
                    }
                    gh32.f134056h = ii24;
                }
                return 0;
            }
        }
    }
}
