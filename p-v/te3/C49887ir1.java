package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ir1 */
public class C49887ir1 extends C47465a {

    /* renamed from: d */
    public LinkedList<C50027jr1> f135626d = new LinkedList<>();

    /* renamed from: e */
    public int f135627e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49887ir1)) {
            return false;
        }
        C49887ir1 ir12 = (C49887ir1) aVar;
        return C46238a.m51546a(this.f135626d, ir12.f135626d) && C46238a.m51546a(Integer.valueOf(this.f135627e), Integer.valueOf(ir12.f135627e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f135626d);
            aVar.mo74318e(2, this.f135627e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58680g(1, 8, this.f135626d) + 0 + C52418a.m58678e(2, this.f135627e);
        } else {
            if (i == 2) {
                this.f135626d.clear();
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
                C49887ir1 ir12 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C50027jr1 jr12 = new C50027jr1();
                        if (bArr != null && bArr.length > 0) {
                            jr12.parseFrom(bArr);
                        }
                        ir12.f135626d.add(jr12);
                    }
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    ir12.f135627e = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
