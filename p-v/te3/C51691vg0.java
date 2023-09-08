package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.vg0 */
public class C51691vg0 extends C47465a {

    /* renamed from: d */
    public LinkedList<C64284cg> f143474d = new LinkedList<>();

    /* renamed from: e */
    public LinkedList<C50242lc1> f143475e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51691vg0)) {
            return false;
        }
        C51691vg0 vg02 = (C51691vg0) aVar;
        return C46238a.m51546a(this.f143474d, vg02.f143474d) && C46238a.m51546a(this.f143475e, vg02.f143475e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f143474d);
            aVar.mo74320g(2, 8, this.f143475e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58680g(1, 8, this.f143474d) + 0 + C52418a.m58680g(2, 8, this.f143475e);
        } else {
            if (i == 2) {
                this.f143474d.clear();
                this.f143475e.clear();
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
                C51691vg0 vg02 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C64284cg cgVar = new C64284cg();
                        if (bArr != null && bArr.length > 0) {
                            cgVar.parseFrom(bArr);
                        }
                        vg02.f143474d.add(cgVar);
                    }
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        C50242lc1 lc12 = new C50242lc1();
                        if (bArr2 != null && bArr2.length > 0) {
                            lc12.parseFrom(bArr2);
                        }
                        vg02.f143475e.add(lc12);
                    }
                    return 0;
                }
            }
        }
    }
}
