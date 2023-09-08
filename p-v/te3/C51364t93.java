package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.t93 */
public class C51364t93 extends C47465a {

    /* renamed from: d */
    public int f142055d;

    /* renamed from: e */
    public LinkedList<C52049y03> f142056e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51364t93)) {
            return false;
        }
        C51364t93 t932 = (C51364t93) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f142055d), Integer.valueOf(t932.f142055d)) && C46238a.m51546a(this.f142056e, t932.f142056e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f142055d);
            aVar.mo74320g(2, 8, this.f142056e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f142055d) + 0 + C52418a.m58680g(2, 8, this.f142056e);
        } else {
            if (i == 2) {
                this.f142056e.clear();
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
                C51364t93 t932 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    t932.f142055d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C52049y03 y032 = new C52049y03();
                        if (bArr != null && bArr.length > 0) {
                            y032.parseFrom(bArr);
                        }
                        t932.f142056e.add(y032);
                    }
                    return 0;
                }
            }
        }
    }
}
