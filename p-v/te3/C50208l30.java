package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.l30 */
public class C50208l30 extends C101820nt3 {

    /* renamed from: d */
    public String f137142d;

    /* renamed from: e */
    public int f137143e;

    /* renamed from: f */
    public boolean f137144f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50208l30)) {
            return false;
        }
        C50208l30 l302 = (C50208l30) aVar;
        return C46238a.m51546a(this.BaseRequest, l302.BaseRequest) && C46238a.m51546a(this.f137142d, l302.f137142d) && C46238a.m51546a(Integer.valueOf(this.f137143e), Integer.valueOf(l302.f137143e)) && C46238a.m51546a(Boolean.valueOf(this.f137144f), Boolean.valueOf(l302.f137144f));
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
            String str = this.f137142d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f137143e);
            aVar.mo74314a(4, this.f137144f);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str2 = this.f137142d;
            if (str2 != null) {
                i2 += C52418a.m58683j(2, str2);
            }
            return i2 + C52418a.m58678e(3, this.f137143e) + C52418a.m58674a(4, this.f137144f);
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
            C50208l30 l302 = objArr[1];
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
                    l302.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                l302.f137142d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                l302.f137143e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                l302.f137144f = aVar3.mo141625c(intValue);
                return 0;
            }
        }
    }
}
