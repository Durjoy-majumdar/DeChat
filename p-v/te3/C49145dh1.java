package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.dh1 */
public class C49145dh1 extends C47465a {

    /* renamed from: d */
    public long f132324d;

    /* renamed from: e */
    public LinkedList<C48727ak1> f132325e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49145dh1)) {
            return false;
        }
        C49145dh1 dh12 = (C49145dh1) aVar;
        return C46238a.m51546a(Long.valueOf(this.f132324d), Long.valueOf(dh12.f132324d)) && C46238a.m51546a(this.f132325e, dh12.f132325e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f132324d);
            aVar.mo74320g(2, 8, this.f132325e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58681h(1, this.f132324d) + 0 + C52418a.m58680g(2, 8, this.f132325e);
        } else {
            if (i == 2) {
                this.f132325e.clear();
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
                C49145dh1 dh12 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    dh12.f132324d = aVar3.mo141631i(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C48727ak1 ak12 = new C48727ak1();
                        if (bArr != null && bArr.length > 0) {
                            ak12.parseFrom(bArr);
                        }
                        dh12.f132325e.add(ak12);
                    }
                    return 0;
                }
            }
        }
    }
}
