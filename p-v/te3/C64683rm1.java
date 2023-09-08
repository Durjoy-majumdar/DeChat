package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.rm1 */
public class C64683rm1 extends C47465a {

    /* renamed from: d */
    public LinkedList<C64780vo2> f185203d = new LinkedList<>();

    /* renamed from: e */
    public LinkedList<C64780vo2> f185204e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64683rm1)) {
            return false;
        }
        C64683rm1 rm12 = (C64683rm1) aVar;
        return C46238a.m51546a(this.f185203d, rm12.f185203d) && C46238a.m51546a(this.f185204e, rm12.f185204e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f185203d);
            aVar.mo74320g(2, 8, this.f185204e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58680g(1, 8, this.f185203d) + 0 + C52418a.m58680g(2, 8, this.f185204e);
        } else {
            if (i == 2) {
                this.f185203d.clear();
                this.f185204e.clear();
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
                C64683rm1 rm12 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C64780vo2 vo22 = new C64780vo2();
                        if (bArr != null && bArr.length > 0) {
                            vo22.parseFrom(bArr);
                        }
                        rm12.f185203d.add(vo22);
                    }
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        C64780vo2 vo23 = new C64780vo2();
                        if (bArr2 != null && bArr2.length > 0) {
                            vo23.parseFrom(bArr2);
                        }
                        rm12.f185204e.add(vo23);
                    }
                    return 0;
                }
            }
        }
    }
}
