package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.zs */
public class C52300zs extends C49335eu3 {

    /* renamed from: d */
    public String f146197d;

    /* renamed from: e */
    public int f146198e;

    /* renamed from: f */
    public String f146199f;

    /* renamed from: g */
    public String f146200g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52300zs)) {
            return false;
        }
        C52300zs zsVar = (C52300zs) aVar;
        return C46238a.m51546a(this.BaseResponse, zsVar.BaseResponse) && C46238a.m51546a(this.f146197d, zsVar.f146197d) && C46238a.m51546a(Integer.valueOf(this.f146198e), Integer.valueOf(zsVar.f146198e)) && C46238a.m51546a(this.f146199f, zsVar.f146199f) && C46238a.m51546a(this.f146200g, zsVar.f146200g);
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
                String str = this.f146197d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                aVar.mo74318e(3, this.f146198e);
                String str2 = this.f146199f;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                String str3 = this.f146200g;
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
            String str4 = this.f146197d;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            int e = i2 + C52418a.m58678e(3, this.f146198e);
            String str5 = this.f146199f;
            if (str5 != null) {
                e += C52418a.m58683j(4, str5);
            }
            String str6 = this.f146200g;
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
            C52300zs zsVar = objArr[1];
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
                    zsVar.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                zsVar.f146197d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                zsVar.f146198e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                zsVar.f146199f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                zsVar.f146200g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
