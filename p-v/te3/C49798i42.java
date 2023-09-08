package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.i42 */
public class C49798i42 extends C47465a {

    /* renamed from: d */
    public int f135102d;

    /* renamed from: e */
    public LinkedList<C49657h42> f135103e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49798i42)) {
            return false;
        }
        C49798i42 i422 = (C49798i42) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f135102d), Integer.valueOf(i422.f135102d)) && C46238a.m51546a(this.f135103e, i422.f135103e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f135102d);
            aVar.mo74320g(2, 8, this.f135103e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f135102d) + 0 + C52418a.m58680g(2, 8, this.f135103e);
        } else {
            if (i == 2) {
                this.f135103e.clear();
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
                C49798i42 i422 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    i422.f135102d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C49657h42 h422 = new C49657h42();
                        if (bArr != null && bArr.length > 0) {
                            h422.parseFrom(bArr);
                        }
                        i422.f135103e.add(h422);
                    }
                    return 0;
                }
            }
        }
    }
}
