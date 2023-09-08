package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class cn4 extends C101820nt3 {

    /* renamed from: d */
    public int f131845d;

    /* renamed from: e */
    public LinkedList<C101839s70> f131846e = new LinkedList<>();

    /* renamed from: f */
    public int f131847f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof cn4)) {
            return false;
        }
        cn4 cn4 = (cn4) aVar;
        return C46238a.m51546a(this.BaseRequest, cn4.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f131845d), Integer.valueOf(cn4.f131845d)) && C46238a.m51546a(this.f131846e, cn4.f131846e) && C46238a.m51546a(Integer.valueOf(this.f131847f), Integer.valueOf(cn4.f131847f));
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
            aVar.mo74318e(2, this.f131845d);
            aVar.mo74320g(3, 8, this.f131846e);
            aVar.mo74318e(4, this.f131847f);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f131845d) + C52418a.m58680g(3, 8, this.f131846e) + C52418a.m58678e(4, this.f131847f);
        } else if (i == 2) {
            this.f131846e.clear();
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
            cn4 cn4 = objArr[1];
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
                    cn4.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                cn4.f131845d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C101839s70 s702 = new C101839s70();
                    if (bArr2 != null && bArr2.length > 0) {
                        s702.parseFrom(bArr2);
                    }
                    cn4.f131846e.add(s702);
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                cn4.f131847f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
