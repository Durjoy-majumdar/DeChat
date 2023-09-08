package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.cg2 */
public class C64285cg2 extends C47465a {

    /* renamed from: d */
    public LinkedList<C22490bg2> f182474d = new LinkedList<>();

    /* renamed from: e */
    public int f182475e = -1;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64285cg2)) {
            return false;
        }
        C64285cg2 cg22 = (C64285cg2) aVar;
        return C46238a.m51546a(this.f182474d, cg22.f182474d) && C46238a.m51546a(Integer.valueOf(this.f182475e), Integer.valueOf(cg22.f182475e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f182474d);
            aVar.mo74318e(2, this.f182475e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58680g(1, 8, this.f182474d) + 0 + C52418a.m58678e(2, this.f182475e);
        } else {
            if (i == 2) {
                this.f182474d.clear();
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
                C64285cg2 cg22 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C22490bg2 bg22 = new C22490bg2();
                        if (bArr != null && bArr.length > 0) {
                            bg22.parseFrom(bArr);
                        }
                        cg22.f182474d.add(bg22);
                    }
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    cg22.f182475e = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
