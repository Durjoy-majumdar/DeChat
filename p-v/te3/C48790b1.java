package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.b1 */
public class C48790b1 extends C47465a {

    /* renamed from: d */
    public String f130879d;

    /* renamed from: e */
    public LinkedList<C48646a1> f130880e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48790b1)) {
            return false;
        }
        C48790b1 b1Var = (C48790b1) aVar;
        return C46238a.m51546a(this.f130879d, b1Var.f130879d) && C46238a.m51546a(this.f130880e, b1Var.f130880e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f130879d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74320g(2, 8, this.f130880e);
            return 0;
        } else if (i == 1) {
            String str2 = this.f130879d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58680g(2, 8, this.f130880e);
        } else if (i == 2) {
            this.f130880e.clear();
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
            C48790b1 b1Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                b1Var.f130879d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C48646a1 a1Var = new C48646a1();
                    if (bArr != null && bArr.length > 0) {
                        a1Var.parseFrom(bArr);
                    }
                    b1Var.f130880e.add(a1Var);
                }
                return 0;
            }
        }
    }
}
