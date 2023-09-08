package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class r35 extends C47465a {

    /* renamed from: d */
    public LinkedList<o35> f140686d = new LinkedList<>();

    /* renamed from: e */
    public boolean f140687e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof r35)) {
            return false;
        }
        r35 r35 = (r35) aVar;
        return C46238a.m51546a(this.f140686d, r35.f140686d) && C46238a.m51546a(Boolean.valueOf(this.f140687e), Boolean.valueOf(r35.f140687e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f140686d);
            aVar.mo74314a(2, this.f140687e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58680g(1, 8, this.f140686d) + 0 + C52418a.m58674a(2, this.f140687e);
        } else {
            if (i == 2) {
                this.f140686d.clear();
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
                r35 r35 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        o35 o35 = new o35();
                        if (bArr != null && bArr.length > 0) {
                            o35.parseFrom(bArr);
                        }
                        r35.f140686d.add(o35);
                    }
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    r35.f140687e = aVar3.mo141625c(intValue);
                    return 0;
                }
            }
        }
    }
}
