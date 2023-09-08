package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;

/* renamed from: te3.uq2 */
public class C64757uq2 extends C47465a {

    /* renamed from: d */
    public LinkedList<C64589nq2> f185785d = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        return aVar != null && (aVar instanceof C64757uq2) && C46238a.m51546a(this.f185785d, ((C64757uq2) aVar).f185785d);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            objArr[0].mo74320g(1, 8, this.f185785d);
            return 0;
        } else if (i == 1) {
            return C52418a.m58680g(1, 8, this.f185785d) + 0;
        } else {
            if (i == 2) {
                this.f185785d.clear();
                C102122a aVar = new C102122a(objArr[0], C47465a.unknownTagHandler);
                for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar)) {
                    if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
                        aVar.mo141624b();
                    }
                }
                return 0;
            } else if (i != 3) {
                return -1;
            } else {
                C102122a aVar2 = objArr[0];
                C64757uq2 uq22 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue != 1) {
                    return -1;
                }
                LinkedList<byte[]> j = aVar2.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C64589nq2 nq22 = new C64589nq2();
                    if (bArr != null && bArr.length > 0) {
                        nq22.parseFrom(bArr);
                    }
                    uq22.f185785d.add(nq22);
                }
                return 0;
            }
        }
    }
}
