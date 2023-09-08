package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.kc0 */
public class C50109kc0 extends C49335eu3 {

    /* renamed from: d */
    public String f136655d;

    /* renamed from: e */
    public int f136656e;

    /* renamed from: f */
    public LinkedList<C50241lc0> f136657f = new LinkedList<>();

    /* renamed from: g */
    public String f136658g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50109kc0)) {
            return false;
        }
        C50109kc0 kc02 = (C50109kc0) aVar;
        return C46238a.m51546a(this.BaseResponse, kc02.BaseResponse) && C46238a.m51546a(this.f136655d, kc02.f136655d) && C46238a.m51546a(Integer.valueOf(this.f136656e), Integer.valueOf(kc02.f136656e)) && C46238a.m51546a(this.f136657f, kc02.f136657f) && C46238a.m51546a(this.f136658g, kc02.f136658g);
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
                String str = this.f136655d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                aVar.mo74318e(3, this.f136656e);
                aVar.mo74320g(4, 8, this.f136657f);
                String str2 = this.f136658g;
                if (str2 != null) {
                    aVar.mo74323j(5, str2);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            String str3 = this.f136655d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            int e = i2 + C52418a.m58678e(3, this.f136656e) + C52418a.m58680g(4, 8, this.f136657f);
            String str4 = this.f136658g;
            return str4 != null ? e + C52418a.m58683j(5, str4) : e;
        } else if (i == 2) {
            this.f136657f.clear();
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
            C50109kc0 kc02 = objArr[1];
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
                    kc02.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                kc02.f136655d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                kc02.f136656e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C50241lc0 lc02 = new C50241lc0();
                    if (bArr2 != null && bArr2.length > 0) {
                        lc02.parseFrom(bArr2);
                    }
                    kc02.f136657f.add(lc02);
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                kc02.f136658g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
