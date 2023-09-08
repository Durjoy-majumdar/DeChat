package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.n4 */
public class C50492n4 extends C47465a {

    /* renamed from: d */
    public String f138401d;

    /* renamed from: e */
    public C48730al f138402e;

    /* renamed from: f */
    public C48730al f138403f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50492n4)) {
            return false;
        }
        C50492n4 n4Var = (C50492n4) aVar;
        return C46238a.m51546a(this.f138401d, n4Var.f138401d) && C46238a.m51546a(this.f138402e, n4Var.f138402e) && C46238a.m51546a(this.f138403f, n4Var.f138403f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f138401d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            C48730al alVar = this.f138402e;
            if (alVar != null) {
                aVar.mo74322i(2, alVar.computeSize());
                this.f138402e.writeFields(aVar);
            }
            C48730al alVar2 = this.f138403f;
            if (alVar2 != null) {
                aVar.mo74322i(3, alVar2.computeSize());
                this.f138403f.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str2 = this.f138401d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            C48730al alVar3 = this.f138402e;
            if (alVar3 != null) {
                i2 += C52418a.m58682i(2, alVar3.computeSize());
            }
            C48730al alVar4 = this.f138403f;
            return alVar4 != null ? i2 + C52418a.m58682i(3, alVar4.computeSize()) : i2;
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
            C50492n4 n4Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                n4Var.f138401d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C48730al alVar5 = new C48730al();
                    if (bArr != null && bArr.length > 0) {
                        alVar5.parseFrom(bArr);
                    }
                    n4Var.f138402e = alVar5;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C48730al alVar6 = new C48730al();
                    if (bArr2 != null && bArr2.length > 0) {
                        alVar6.parseFrom(bArr2);
                    }
                    n4Var.f138403f = alVar6;
                }
                return 0;
            }
        }
    }
}
