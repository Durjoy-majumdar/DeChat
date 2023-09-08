package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.k62 */
public class C50087k62 extends C101820nt3 {

    /* renamed from: d */
    public String f136583d;

    /* renamed from: e */
    public int f136584e;

    /* renamed from: f */
    public String f136585f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50087k62)) {
            return false;
        }
        C50087k62 k622 = (C50087k62) aVar;
        return C46238a.m51546a(this.BaseRequest, k622.BaseRequest) && C46238a.m51546a(this.f136583d, k622.f136583d) && C46238a.m51546a(Integer.valueOf(this.f136584e), Integer.valueOf(k622.f136584e)) && C46238a.m51546a(this.f136585f, k622.f136585f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            String str = this.f136583d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f136584e);
            String str2 = this.f136585f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str3 = this.f136583d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            int e = i2 + C52418a.m58678e(3, this.f136584e);
            String str4 = this.f136585f;
            return str4 != null ? e + C52418a.m58683j(4, str4) : e;
        } else if (i == 2) {
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
            C50087k62 k622 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C90417ia iaVar3 = new C90417ia();
                    if (bArr != null && bArr.length > 0) {
                        iaVar3.parseFrom(bArr);
                    }
                    k622.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                k622.f136583d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                k622.f136584e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                k622.f136585f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
