package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.x22 */
public class C51914x22 extends C101820nt3 {

    /* renamed from: d */
    public long f144417d;

    /* renamed from: e */
    public String f144418e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51914x22)) {
            return false;
        }
        C51914x22 x222 = (C51914x22) aVar;
        return C46238a.m51546a(this.BaseRequest, x222.BaseRequest) && C46238a.m51546a(Long.valueOf(this.f144417d), Long.valueOf(x222.f144417d)) && C46238a.m51546a(this.f144418e, x222.f144418e);
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
            aVar.mo74321h(2, this.f144417d);
            String str = this.f144418e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int h = i2 + C52418a.m58681h(2, this.f144417d);
            String str2 = this.f144418e;
            return str2 != null ? h + C52418a.m58683j(3, str2) : h;
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
            C51914x22 x222 = objArr[1];
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
                    x222.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                x222.f144417d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                x222.f144418e = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
