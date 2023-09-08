package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.xa3 */
public class C51948xa3 extends C49335eu3 {

    /* renamed from: d */
    public String f144566d;

    /* renamed from: e */
    public String f144567e;

    /* renamed from: f */
    public String f144568f;

    /* renamed from: g */
    public int f144569g;

    /* renamed from: h */
    public String f144570h;

    /* renamed from: i */
    public int f144571i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51948xa3)) {
            return false;
        }
        C51948xa3 xa32 = (C51948xa3) aVar;
        return C46238a.m51546a(this.BaseResponse, xa32.BaseResponse) && C46238a.m51546a(this.f144566d, xa32.f144566d) && C46238a.m51546a(this.f144567e, xa32.f144567e) && C46238a.m51546a(this.f144568f, xa32.f144568f) && C46238a.m51546a(Integer.valueOf(this.f144569g), Integer.valueOf(xa32.f144569g)) && C46238a.m51546a(this.f144570h, xa32.f144570h) && C46238a.m51546a(Integer.valueOf(this.f144571i), Integer.valueOf(xa32.f144571i));
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
                String str = this.f144566d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                String str2 = this.f144567e;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                String str3 = this.f144568f;
                if (str3 != null) {
                    aVar.mo74323j(4, str3);
                }
                aVar.mo74318e(6, this.f144569g);
                String str4 = this.f144570h;
                if (str4 != null) {
                    aVar.mo74323j(8, str4);
                }
                aVar.mo74318e(9, this.f144571i);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            String str5 = this.f144566d;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f144567e;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            String str7 = this.f144568f;
            if (str7 != null) {
                i2 += C52418a.m58683j(4, str7);
            }
            int e = i2 + C52418a.m58678e(6, this.f144569g);
            String str8 = this.f144570h;
            if (str8 != null) {
                e += C52418a.m58683j(8, str8);
            }
            return e + C52418a.m58678e(9, this.f144571i);
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
            C51948xa3 xa32 = objArr[1];
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
                    xa32.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                xa32.f144566d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                xa32.f144567e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                xa32.f144568f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 6) {
                xa32.f144569g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 8) {
                xa32.f144570h = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 9) {
                return -1;
            } else {
                xa32.f144571i = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
