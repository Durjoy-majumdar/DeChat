package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.x0 */
public class C51901x0 extends C47465a {

    /* renamed from: d */
    public LinkedList<C48646a1> f144375d = new LinkedList<>();

    /* renamed from: e */
    public LinkedList<C48790b1> f144376e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51901x0)) {
            return false;
        }
        C51901x0 x0Var = (C51901x0) aVar;
        return C46238a.m51546a(this.f144375d, x0Var.f144375d) && C46238a.m51546a(this.f144376e, x0Var.f144376e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f144375d);
            aVar.mo74320g(2, 8, this.f144376e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58680g(1, 8, this.f144375d) + 0 + C52418a.m58680g(2, 8, this.f144376e);
        } else {
            if (i == 2) {
                this.f144375d.clear();
                this.f144376e.clear();
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
                C51901x0 x0Var = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C48646a1 a1Var = new C48646a1();
                        if (bArr != null && bArr.length > 0) {
                            a1Var.parseFrom(bArr);
                        }
                        x0Var.f144375d.add(a1Var);
                    }
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        C48790b1 b1Var = new C48790b1();
                        if (bArr2 != null && bArr2.length > 0) {
                            b1Var.parseFrom(bArr2);
                        }
                        x0Var.f144376e.add(b1Var);
                    }
                    return 0;
                }
            }
        }
    }
}
