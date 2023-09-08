package py1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.g0 */
public class C47583g0 extends C47465a {

    /* renamed from: d */
    public C47658q5 f127703d;

    /* renamed from: e */
    public boolean f127704e;

    /* renamed from: f */
    public boolean f127705f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47583g0)) {
            return false;
        }
        C47583g0 g0Var = (C47583g0) aVar;
        return C46238a.m51546a(this.f127703d, g0Var.f127703d) && C46238a.m51546a(Boolean.valueOf(this.f127704e), Boolean.valueOf(g0Var.f127704e)) && C46238a.m51546a(Boolean.valueOf(this.f127705f), Boolean.valueOf(g0Var.f127705f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C47658q5 q5Var = this.f127703d;
            if (q5Var != null) {
                aVar.mo74322i(1, q5Var.computeSize());
                this.f127703d.writeFields(aVar);
            }
            aVar.mo74314a(2, this.f127704e);
            aVar.mo74314a(4, this.f127705f);
            return 0;
        } else if (i == 1) {
            C47658q5 q5Var2 = this.f127703d;
            if (q5Var2 != null) {
                i2 = 0 + C52418a.m58682i(1, q5Var2.computeSize());
            }
            return i2 + C52418a.m58674a(2, this.f127704e) + C52418a.m58674a(4, this.f127705f);
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
            C47583g0 g0Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C47658q5 q5Var3 = new C47658q5();
                    if (bArr != null && bArr.length > 0) {
                        q5Var3.parseFrom(bArr);
                    }
                    g0Var.f127703d = q5Var3;
                }
                return 0;
            } else if (intValue == 2) {
                g0Var.f127704e = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                g0Var.f127705f = aVar3.mo141625c(intValue);
                return 0;
            }
        }
    }
}
