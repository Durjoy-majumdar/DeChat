package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class j35 extends C47465a {

    /* renamed from: d */
    public LinkedList<zx4> f135852d = new LinkedList<>();

    /* renamed from: e */
    public LinkedList<ng4> f135853e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof j35)) {
            return false;
        }
        j35 j35 = (j35) aVar;
        return C46238a.m51546a(this.f135852d, j35.f135852d) && C46238a.m51546a(this.f135853e, j35.f135853e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f135852d);
            aVar.mo74320g(2, 8, this.f135853e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58680g(1, 8, this.f135852d) + 0 + C52418a.m58680g(2, 8, this.f135853e);
        } else {
            if (i == 2) {
                this.f135852d.clear();
                this.f135853e.clear();
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
                j35 j35 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        zx4 zx4 = new zx4();
                        if (bArr != null && bArr.length > 0) {
                            zx4.parseFrom(bArr);
                        }
                        j35.f135852d.add(zx4);
                    }
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        ng4 ng4 = new ng4();
                        if (bArr2 != null && bArr2.length > 0) {
                            ng4.parseFrom(bArr2);
                        }
                        j35.f135853e.add(ng4);
                    }
                    return 0;
                }
            }
        }
    }
}
