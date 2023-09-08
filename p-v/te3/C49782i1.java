package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.i1 */
public class C49782i1 extends C47465a {

    /* renamed from: d */
    public boolean f135018d;

    /* renamed from: e */
    public C49927j1 f135019e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49782i1)) {
            return false;
        }
        C49782i1 i1Var = (C49782i1) aVar;
        return C46238a.m51546a(Boolean.valueOf(this.f135018d), Boolean.valueOf(i1Var.f135018d)) && C46238a.m51546a(this.f135019e, i1Var.f135019e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74314a(1, this.f135018d);
            C49927j1 j1Var = this.f135019e;
            if (j1Var != null) {
                aVar.mo74322i(2, j1Var.computeSize());
                this.f135019e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int a = C52418a.m58674a(1, this.f135018d) + 0;
            C49927j1 j1Var2 = this.f135019e;
            return j1Var2 != null ? a + C52418a.m58682i(2, j1Var2.computeSize()) : a;
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
            C49782i1 i1Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                i1Var.f135018d = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C49927j1 j1Var3 = new C49927j1();
                    if (bArr != null && bArr.length > 0) {
                        j1Var3.parseFrom(bArr);
                    }
                    i1Var.f135019e = j1Var3;
                }
                return 0;
            }
        }
    }
}
