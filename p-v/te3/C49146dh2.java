package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.dh2 */
public class C49146dh2 extends C101820nt3 {

    /* renamed from: d */
    public String f132326d;

    /* renamed from: e */
    public String f132327e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49146dh2)) {
            return false;
        }
        C49146dh2 dh22 = (C49146dh2) aVar;
        return C46238a.m51546a(this.BaseRequest, dh22.BaseRequest) && C46238a.m51546a(this.f132326d, dh22.f132326d) && C46238a.m51546a(this.f132327e, dh22.f132327e);
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
            String str = this.f132326d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f132327e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str3 = this.f132326d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            String str4 = this.f132327e;
            return str4 != null ? i2 + C52418a.m58683j(3, str4) : i2;
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
            C49146dh2 dh22 = objArr[1];
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
                    dh22.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                dh22.f132326d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                dh22.f132327e = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
