package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.t91 */
public class C51362t91 extends C47465a {

    /* renamed from: d */
    public LinkedList<C48928bz0> f142052d = new LinkedList<>();

    /* renamed from: e */
    public long f142053e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51362t91)) {
            return false;
        }
        C51362t91 t912 = (C51362t91) aVar;
        return C46238a.m51546a(this.f142052d, t912.f142052d) && C46238a.m51546a(Long.valueOf(this.f142053e), Long.valueOf(t912.f142053e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f142052d);
            aVar.mo74321h(2, this.f142053e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58680g(1, 8, this.f142052d) + 0 + C52418a.m58681h(2, this.f142053e);
        } else {
            if (i == 2) {
                this.f142052d.clear();
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
                C51362t91 t912 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C48928bz0 bz02 = new C48928bz0();
                        if (bArr != null && bArr.length > 0) {
                            bz02.parseFrom(bArr);
                        }
                        t912.f142052d.add(bz02);
                    }
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    t912.f142053e = aVar3.mo141631i(intValue);
                    return 0;
                }
            }
        }
    }
}
