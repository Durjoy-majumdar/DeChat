package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.eu1 */
public class C49333eu1 extends C101820nt3 {

    /* renamed from: d */
    public C49923j0 f133122d;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49333eu1)) {
            return false;
        }
        C49333eu1 eu12 = (C49333eu1) aVar;
        return C46238a.m51546a(this.BaseRequest, eu12.BaseRequest) && C46238a.m51546a(this.f133122d, eu12.f133122d);
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
            C49923j0 j0Var = this.f133122d;
            if (j0Var != null) {
                aVar.mo74322i(2, j0Var.computeSize());
                this.f133122d.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49923j0 j0Var2 = this.f133122d;
            return j0Var2 != null ? i2 + C52418a.m58682i(2, j0Var2.computeSize()) : i2;
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
            C49333eu1 eu12 = objArr[1];
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
                    eu12.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C49923j0 j0Var3 = new C49923j0();
                    if (bArr2 != null && bArr2.length > 0) {
                        j0Var3.parseFrom(bArr2);
                    }
                    eu12.f133122d = j0Var3;
                }
                return 0;
            }
        }
    }
}
