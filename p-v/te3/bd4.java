package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class bd4 extends C101820nt3 {

    /* renamed from: d */
    public c64 f131061d;

    /* renamed from: e */
    public String f131062e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof bd4)) {
            return false;
        }
        bd4 bd4 = (bd4) aVar;
        return C46238a.m51546a(this.BaseRequest, bd4.BaseRequest) && C46238a.m51546a(this.f131061d, bd4.f131061d) && C46238a.m51546a(this.f131062e, bd4.f131062e);
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
            c64 c64 = this.f131061d;
            if (c64 != null) {
                aVar.mo74322i(2, c64.computeSize());
                this.f131061d.writeFields(aVar);
            }
            String str = this.f131062e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            c64 c642 = this.f131061d;
            if (c642 != null) {
                i2 += C52418a.m58682i(2, c642.computeSize());
            }
            String str2 = this.f131062e;
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
            bd4 bd4 = objArr[1];
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
                    bd4.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    c64 c643 = new c64();
                    if (bArr2 != null && bArr2.length > 0) {
                        c643.parseFrom(bArr2);
                    }
                    bd4.f131061d = c643;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                bd4.f131062e = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
