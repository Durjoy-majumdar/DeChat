package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.f31 */
public class C49372f31 extends C47465a {

    /* renamed from: d */
    public LinkedList<C49651h31> f133262d = new LinkedList<>();

    /* renamed from: e */
    public LinkedList<String> f133263e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49372f31)) {
            return false;
        }
        C49372f31 f312 = (C49372f31) aVar;
        return C46238a.m51546a(this.f133262d, f312.f133262d) && C46238a.m51546a(this.f133263e, f312.f133263e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f133262d);
            aVar.mo74320g(2, 1, this.f133263e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58680g(1, 8, this.f133262d) + 0 + C52418a.m58680g(2, 1, this.f133263e);
        } else {
            if (i == 2) {
                this.f133262d.clear();
                this.f133263e.clear();
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
                C49372f31 f312 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C49651h31 h312 = new C49651h31();
                        if (bArr != null && bArr.length > 0) {
                            h312.parseFrom(bArr);
                        }
                        f312.f133262d.add(h312);
                    }
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    f312.f133263e.add(aVar3.mo141633k(intValue));
                    return 0;
                }
            }
        }
    }
}
