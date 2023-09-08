package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.d81 */
public class C49110d81 extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<C50173ks1> f132181d = new LinkedList<>();

    /* renamed from: e */
    public boolean f132182e;

    /* renamed from: f */
    public String f132183f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49110d81)) {
            return false;
        }
        C49110d81 d812 = (C49110d81) aVar;
        return C46238a.m51546a(this.BaseResponse, d812.BaseResponse) && C46238a.m51546a(this.f132181d, d812.f132181d) && C46238a.m51546a(Boolean.valueOf(this.f132182e), Boolean.valueOf(d812.f132182e)) && C46238a.m51546a(this.f132183f, d812.f132183f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                aVar.mo74322i(1, jaVar.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            aVar.mo74320g(2, 8, this.f132181d);
            aVar.mo74314a(3, this.f132182e);
            String str = this.f132183f;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f132181d) + C52418a.m58674a(3, this.f132182e);
            String str2 = this.f132183f;
            return str2 != null ? g + C52418a.m58683j(4, str2) : g;
        } else if (i == 2) {
            this.f132181d.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C49110d81 d812 = objArr[1];
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
                    d812.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C50173ks1 ks12 = new C50173ks1();
                    if (bArr2 != null && bArr2.length > 0) {
                        ks12.parseFrom(bArr2);
                    }
                    d812.f132181d.add(ks12);
                }
                return 0;
            } else if (intValue == 3) {
                d812.f132182e = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                d812.f132183f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
