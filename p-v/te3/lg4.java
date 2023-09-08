package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class lg4 extends C101820nt3 {

    /* renamed from: d */
    public LinkedList<C51455tw> f137413d = new LinkedList<>();

    /* renamed from: e */
    public int f137414e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof lg4)) {
            return false;
        }
        lg4 lg4 = (lg4) aVar;
        return C46238a.m51546a(this.BaseRequest, lg4.BaseRequest) && C46238a.m51546a(this.f137413d, lg4.f137413d) && C46238a.m51546a(Integer.valueOf(this.f137414e), Integer.valueOf(lg4.f137414e));
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
            aVar.mo74320g(2, 8, this.f137413d);
            aVar.mo74318e(3, this.f137414e);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            return i2 + C52418a.m58680g(2, 8, this.f137413d) + C52418a.m58678e(3, this.f137414e);
        } else if (i == 2) {
            this.f137413d.clear();
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
            lg4 lg4 = objArr[1];
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
                    lg4.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C51455tw twVar = new C51455tw();
                    if (bArr2 != null && bArr2.length > 0) {
                        twVar.parseFrom(bArr2);
                    }
                    lg4.f137413d.add(twVar);
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                lg4.f137414e = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
