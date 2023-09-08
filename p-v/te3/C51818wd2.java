package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.wd2 */
public class C51818wd2 extends C47465a {

    /* renamed from: d */
    public int f143972d;

    /* renamed from: e */
    public LinkedList<C51683vd2> f143973e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51818wd2)) {
            return false;
        }
        C51818wd2 wd22 = (C51818wd2) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f143972d), Integer.valueOf(wd22.f143972d)) && C46238a.m51546a(this.f143973e, wd22.f143973e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f143972d);
            aVar.mo74320g(2, 8, this.f143973e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f143972d) + 0 + C52418a.m58680g(2, 8, this.f143973e);
        } else {
            if (i == 2) {
                this.f143973e.clear();
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
                C51818wd2 wd22 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    wd22.f143972d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C51683vd2 vd22 = new C51683vd2();
                        if (bArr != null && bArr.length > 0) {
                            vd22.parseFrom(bArr);
                        }
                        wd22.f143973e.add(vd22);
                    }
                    return 0;
                }
            }
        }
    }
}
