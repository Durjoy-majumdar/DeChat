package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.wi0 */
public class C64803wi0 extends C47465a {

    /* renamed from: d */
    public LinkedList<String> f186121d = new LinkedList<>();

    /* renamed from: e */
    public LinkedList<C64775vi0> f186122e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64803wi0)) {
            return false;
        }
        C64803wi0 wi02 = (C64803wi0) aVar;
        return C46238a.m51546a(this.f186121d, wi02.f186121d) && C46238a.m51546a(this.f186122e, wi02.f186122e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 1, this.f186121d);
            aVar.mo74320g(2, 8, this.f186122e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58680g(1, 1, this.f186121d) + 0 + C52418a.m58680g(2, 8, this.f186122e);
        } else {
            if (i == 2) {
                this.f186121d.clear();
                this.f186122e.clear();
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
                C64803wi0 wi02 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    wi02.f186121d.add(aVar3.mo141633k(intValue));
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C64775vi0 vi02 = new C64775vi0();
                        if (bArr != null && bArr.length > 0) {
                            vi02.parseFrom(bArr);
                        }
                        wi02.f186122e.add(vi02);
                    }
                    return 0;
                }
            }
        }
    }
}
