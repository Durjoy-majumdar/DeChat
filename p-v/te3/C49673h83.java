package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.h83 */
public class C49673h83 extends C49335eu3 {

    /* renamed from: d */
    public int f134500d;

    /* renamed from: e */
    public String f134501e;

    /* renamed from: f */
    public C52159yr2 f134502f;

    /* renamed from: g */
    public String f134503g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49673h83)) {
            return false;
        }
        C49673h83 h832 = (C49673h83) aVar;
        return C46238a.m51546a(this.BaseResponse, h832.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f134500d), Integer.valueOf(h832.f134500d)) && C46238a.m51546a(this.f134501e, h832.f134501e) && C46238a.m51546a(this.f134502f, h832.f134502f) && C46238a.m51546a(this.f134503g, h832.f134503g);
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
                aVar.mo74318e(2, this.f134500d);
                String str = this.f134501e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                C52159yr2 yr22 = this.f134502f;
                if (yr22 != null) {
                    aVar.mo74322i(99, yr22.computeSize());
                    this.f134502f.writeFields(aVar);
                }
                String str2 = this.f134503g;
                if (str2 != null) {
                    aVar.mo74323j(100, str2);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f134500d);
            String str3 = this.f134501e;
            if (str3 != null) {
                e += C52418a.m58683j(3, str3);
            }
            C52159yr2 yr23 = this.f134502f;
            if (yr23 != null) {
                e += C52418a.m58682i(99, yr23.computeSize());
            }
            String str4 = this.f134503g;
            return str4 != null ? e + C52418a.m58683j(100, str4) : e;
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
            C49673h83 h832 = objArr[1];
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
                    h832.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                h832.f134500d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                h832.f134501e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 99) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C52159yr2 yr24 = new C52159yr2();
                    if (bArr2 != null && bArr2.length > 0) {
                        yr24.parseFrom(bArr2);
                    }
                    h832.f134502f = yr24;
                }
                return 0;
            } else if (intValue != 100) {
                return -1;
            } else {
                h832.f134503g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
