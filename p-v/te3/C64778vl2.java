package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.vl2 */
public class C64778vl2 extends C47465a {

    /* renamed from: d */
    public int f185956d;

    /* renamed from: e */
    public LinkedList<C64753ul2> f185957e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64778vl2)) {
            return false;
        }
        C64778vl2 vl22 = (C64778vl2) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f185956d), Integer.valueOf(vl22.f185956d)) && C46238a.m51546a(this.f185957e, vl22.f185957e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f185956d);
            aVar.mo74320g(2, 8, this.f185957e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f185956d) + 0 + C52418a.m58680g(2, 8, this.f185957e);
        } else {
            if (i == 2) {
                this.f185957e.clear();
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
                C64778vl2 vl22 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    vl22.f185956d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C64753ul2 ul22 = new C64753ul2();
                        if (bArr != null && bArr.length > 0) {
                            ul22.parseFrom(bArr);
                        }
                        vl22.f185957e.add(ul22);
                    }
                    return 0;
                }
            }
        }
    }
}
