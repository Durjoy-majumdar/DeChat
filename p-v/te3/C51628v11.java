package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.v11 */
public class C51628v11 extends C47465a {

    /* renamed from: d */
    public LinkedList<String> f143243d = new LinkedList<>();

    /* renamed from: e */
    public LinkedList<C51769w11> f143244e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51628v11)) {
            return false;
        }
        C51628v11 v112 = (C51628v11) aVar;
        return C46238a.m51546a(this.f143243d, v112.f143243d) && C46238a.m51546a(this.f143244e, v112.f143244e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 1, this.f143243d);
            aVar.mo74320g(2, 8, this.f143244e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58680g(1, 1, this.f143243d) + 0 + C52418a.m58680g(2, 8, this.f143244e);
        } else {
            if (i == 2) {
                this.f143243d.clear();
                this.f143244e.clear();
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
                C51628v11 v112 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    v112.f143243d.add(aVar3.mo141633k(intValue));
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C51769w11 w112 = new C51769w11();
                        if (bArr != null && bArr.length > 0) {
                            w112.parseFrom(bArr);
                        }
                        v112.f143244e.add(w112);
                    }
                    return 0;
                }
            }
        }
    }
}
