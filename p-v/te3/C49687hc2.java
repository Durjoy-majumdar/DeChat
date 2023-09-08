package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.hc2 */
public class C49687hc2 extends C101820nt3 {

    /* renamed from: d */
    public int f134567d;

    /* renamed from: e */
    public int f134568e;

    /* renamed from: f */
    public int f134569f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49687hc2)) {
            return false;
        }
        C49687hc2 hc22 = (C49687hc2) aVar;
        return C46238a.m51546a(this.BaseRequest, hc22.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f134567d), Integer.valueOf(hc22.f134567d)) && C46238a.m51546a(Integer.valueOf(this.f134568e), Integer.valueOf(hc22.f134568e)) && C46238a.m51546a(Integer.valueOf(this.f134569f), Integer.valueOf(hc22.f134569f));
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
            aVar.mo74318e(2, this.f134567d);
            aVar.mo74318e(3, this.f134568e);
            aVar.mo74318e(4, this.f134569f);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f134567d) + C52418a.m58678e(3, this.f134568e) + C52418a.m58678e(4, this.f134569f);
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
            C49687hc2 hc22 = objArr[1];
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
                    hc22.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                hc22.f134567d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                hc22.f134568e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                hc22.f134569f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
