package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.gk0 */
public class C49571gk0 extends C47465a {

    /* renamed from: d */
    public LinkedList<C49434fk0> f134086d = new LinkedList<>();

    /* renamed from: e */
    public int f134087e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49571gk0)) {
            return false;
        }
        C49571gk0 gk02 = (C49571gk0) aVar;
        return C46238a.m51546a(this.f134086d, gk02.f134086d) && C46238a.m51546a(Integer.valueOf(this.f134087e), Integer.valueOf(gk02.f134087e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f134086d);
            aVar.mo74318e(2, this.f134087e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58680g(1, 8, this.f134086d) + 0 + C52418a.m58678e(2, this.f134087e);
        } else {
            if (i == 2) {
                this.f134086d.clear();
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
                C49571gk0 gk02 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C49434fk0 fk02 = new C49434fk0();
                        if (bArr != null && bArr.length > 0) {
                            fk02.parseFrom(bArr);
                        }
                        gk02.f134086d.add(fk02);
                    }
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    gk02.f134087e = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
