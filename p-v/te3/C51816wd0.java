package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.wd0 */
public class C51816wd0 extends C47465a {

    /* renamed from: d */
    public int f143966d;

    /* renamed from: e */
    public LinkedList<C51681vd0> f143967e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51816wd0)) {
            return false;
        }
        C51816wd0 wd02 = (C51816wd0) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f143966d), Integer.valueOf(wd02.f143966d)) && C46238a.m51546a(this.f143967e, wd02.f143967e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f143966d);
            aVar.mo74320g(2, 8, this.f143967e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f143966d) + 0 + C52418a.m58680g(2, 8, this.f143967e);
        } else {
            if (i == 2) {
                this.f143967e.clear();
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
                C51816wd0 wd02 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    wd02.f143966d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C51681vd0 vd02 = new C51681vd0();
                        if (bArr != null && bArr.length > 0) {
                            vd02.parseFrom(bArr);
                        }
                        wd02.f143967e.add(vd02);
                    }
                    return 0;
                }
            }
        }
    }
}
