package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ms3 */
public class C50445ms3 extends C101820nt3 {

    /* renamed from: d */
    public C50067k13 f138182d;

    /* renamed from: e */
    public String f138183e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50445ms3)) {
            return false;
        }
        C50445ms3 ms32 = (C50445ms3) aVar;
        return C46238a.m51546a(this.BaseRequest, ms32.BaseRequest) && C46238a.m51546a(this.f138182d, ms32.f138182d) && C46238a.m51546a(this.f138183e, ms32.f138183e);
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
            C50067k13 k132 = this.f138182d;
            if (k132 != null) {
                aVar.mo74322i(2, k132.computeSize());
                this.f138182d.writeFields(aVar);
            }
            String str = this.f138183e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C50067k13 k133 = this.f138182d;
            if (k133 != null) {
                i2 += C52418a.m58682i(2, k133.computeSize());
            }
            String str2 = this.f138183e;
            return str2 != null ? i2 + C52418a.m58683j(3, str2) : i2;
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
            C50445ms3 ms32 = objArr[1];
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
                    ms32.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C50067k13 k134 = new C50067k13();
                    if (bArr2 != null && bArr2.length > 0) {
                        k134.parseFrom(bArr2);
                    }
                    ms32.f138182d = k134;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                ms32.f138183e = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
