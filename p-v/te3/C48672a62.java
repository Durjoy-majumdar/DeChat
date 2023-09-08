package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.a62 */
public class C48672a62 extends C101820nt3 {

    /* renamed from: d */
    public C77963l1 f130330d;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48672a62)) {
            return false;
        }
        C48672a62 a622 = (C48672a62) aVar;
        return C46238a.m51546a(this.BaseRequest, a622.BaseRequest) && C46238a.m51546a(this.f130330d, a622.f130330d);
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
            C77963l1 l1Var = this.f130330d;
            if (l1Var != null) {
                aVar.mo74322i(2, l1Var.computeSize());
                this.f130330d.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C77963l1 l1Var2 = this.f130330d;
            return l1Var2 != null ? i2 + C52418a.m58682i(2, l1Var2.computeSize()) : i2;
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
            C48672a62 a622 = objArr[1];
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
                    a622.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C77963l1 l1Var3 = new C77963l1();
                    if (bArr2 != null && bArr2.length > 0) {
                        l1Var3.parseFrom(bArr2);
                    }
                    a622.f130330d = l1Var3;
                }
                return 0;
            }
        }
    }
}
