package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ba3 */
public class C48830ba3 extends C47465a {

    /* renamed from: d */
    public LinkedList<C51875wt3> f131025d = new LinkedList<>();

    /* renamed from: e */
    public int f131026e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48830ba3)) {
            return false;
        }
        C48830ba3 ba32 = (C48830ba3) aVar;
        return C46238a.m51546a(this.f131025d, ba32.f131025d) && C46238a.m51546a(Integer.valueOf(this.f131026e), Integer.valueOf(ba32.f131026e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f131025d);
            aVar.mo74318e(2, this.f131026e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58680g(1, 8, this.f131025d) + 0 + C52418a.m58678e(2, this.f131026e);
        } else {
            if (i == 2) {
                this.f131025d.clear();
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
                C48830ba3 ba32 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C51875wt3 wt32 = new C51875wt3();
                        if (bArr != null && bArr.length > 0) {
                            wt32.parseFrom(bArr);
                        }
                        ba32.f131025d.add(wt32);
                    }
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    ba32.f131026e = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
