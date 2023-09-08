package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.t13 */
public class C51330t13 extends C101820nt3 {

    /* renamed from: d */
    public C51480u13 f141902d;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51330t13)) {
            return false;
        }
        C51330t13 t132 = (C51330t13) aVar;
        return C46238a.m51546a(this.BaseRequest, t132.BaseRequest) && C46238a.m51546a(this.f141902d, t132.f141902d);
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
            C51480u13 u132 = this.f141902d;
            if (u132 != null) {
                aVar.mo74322i(2, u132.computeSize());
                this.f141902d.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C51480u13 u133 = this.f141902d;
            return u133 != null ? i2 + C52418a.m58682i(2, u133.computeSize()) : i2;
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
            C51330t13 t132 = objArr[1];
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
                    t132.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C51480u13 u134 = new C51480u13();
                    if (bArr2 != null && bArr2.length > 0) {
                        u134.parseFrom(bArr2);
                    }
                    t132.f141902d = u134;
                }
                return 0;
            }
        }
    }
}
