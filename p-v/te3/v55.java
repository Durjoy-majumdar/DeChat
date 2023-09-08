package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class v55 extends C47465a {

    /* renamed from: d */
    public LinkedList<ke4> f143332d = new LinkedList<>();

    /* renamed from: e */
    public int f143333e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof v55)) {
            return false;
        }
        v55 v55 = (v55) aVar;
        return C46238a.m51546a(this.f143332d, v55.f143332d) && C46238a.m51546a(Integer.valueOf(this.f143333e), Integer.valueOf(v55.f143333e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f143332d);
            aVar.mo74318e(2, this.f143333e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58680g(1, 8, this.f143332d) + 0 + C52418a.m58678e(2, this.f143333e);
        } else {
            if (i == 2) {
                this.f143332d.clear();
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
                v55 v55 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        ke4 ke4 = new ke4();
                        if (bArr != null && bArr.length > 0) {
                            ke4.parseFrom(bArr);
                        }
                        v55.f143332d.add(ke4);
                    }
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    v55.f143333e = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
