package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.iv1 */
public class C49903iv1 extends C101820nt3 {

    /* renamed from: d */
    public C48826ba f135696d;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49903iv1)) {
            return false;
        }
        C49903iv1 iv12 = (C49903iv1) aVar;
        return C46238a.m51546a(this.BaseRequest, iv12.BaseRequest) && C46238a.m51546a(this.f135696d, iv12.f135696d);
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
            C48826ba baVar = this.f135696d;
            if (baVar != null) {
                aVar.mo74322i(2, baVar.computeSize());
                this.f135696d.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C48826ba baVar2 = this.f135696d;
            return baVar2 != null ? i2 + C52418a.m58682i(2, baVar2.computeSize()) : i2;
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
            C49903iv1 iv12 = objArr[1];
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
                    iv12.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C48826ba baVar3 = new C48826ba();
                    if (bArr2 != null && bArr2.length > 0) {
                        baVar3.parseFrom(bArr2);
                    }
                    iv12.f135696d = baVar3;
                }
                return 0;
            }
        }
    }
}
