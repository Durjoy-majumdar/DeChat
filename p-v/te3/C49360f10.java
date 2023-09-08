package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.f10 */
public class C49360f10 extends C49335eu3 {

    /* renamed from: d */
    public String f133225d;

    /* renamed from: e */
    public LinkedList<C52076y63> f133226e = new LinkedList<>();

    /* renamed from: f */
    public String f133227f;

    /* renamed from: g */
    public String f133228g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49360f10)) {
            return false;
        }
        C49360f10 f102 = (C49360f10) aVar;
        return C46238a.m51546a(this.BaseResponse, f102.BaseResponse) && C46238a.m51546a(this.f133225d, f102.f133225d) && C46238a.m51546a(this.f133226e, f102.f133226e) && C46238a.m51546a(this.f133227f, f102.f133227f) && C46238a.m51546a(this.f133228g, f102.f133228g);
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
            String str = this.f133225d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74320g(3, 8, this.f133226e);
            String str2 = this.f133227f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f133228g;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            String str4 = this.f133225d;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            int g = i2 + C52418a.m58680g(3, 8, this.f133226e);
            String str5 = this.f133227f;
            if (str5 != null) {
                g += C52418a.m58683j(4, str5);
            }
            String str6 = this.f133228g;
            return str6 != null ? g + C52418a.m58683j(5, str6) : g;
        } else if (i == 2) {
            this.f133226e.clear();
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
            C49360f10 f102 = objArr[1];
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
                    f102.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                f102.f133225d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C52076y63 y632 = new C52076y63();
                    if (bArr2 != null && bArr2.length > 0) {
                        y632.parseFrom(bArr2);
                    }
                    f102.f133226e.add(y632);
                }
                return 0;
            } else if (intValue == 4) {
                f102.f133227f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                f102.f133228g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
