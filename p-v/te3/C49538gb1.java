package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;

/* renamed from: te3.gb1 */
public class C49538gb1 extends C47465a {

    /* renamed from: d */
    public LinkedList<C49088d31> f133948d = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        return aVar != null && (aVar instanceof C49538gb1) && C46238a.m51546a(this.f133948d, ((C49538gb1) aVar).f133948d);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            objArr[0].mo74320g(1, 8, this.f133948d);
            return 0;
        } else if (i == 1) {
            return C52418a.m58680g(1, 8, this.f133948d) + 0;
        } else {
            if (i == 2) {
                this.f133948d.clear();
                C102122a aVar = new C102122a(objArr[0], C47465a.unknownTagHandler);
                for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar)) {
                    if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
                        aVar.mo141624b();
                    }
                }
                return 0;
            } else if (i != 3) {
                return -1;
            } else {
                C102122a aVar2 = objArr[0];
                C49538gb1 gb12 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue != 1) {
                    return -1;
                }
                LinkedList<byte[]> j = aVar2.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C49088d31 d312 = new C49088d31();
                    if (bArr != null && bArr.length > 0) {
                        d312.parseFrom(bArr);
                    }
                    gb12.f133948d.add(d312);
                }
                return 0;
            }
        }
    }
}
