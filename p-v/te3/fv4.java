package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;

public class fv4 extends C47465a {

    /* renamed from: d */
    public LinkedList<ev4> f133713d = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        return aVar != null && (aVar instanceof fv4) && C46238a.m51546a(this.f133713d, ((fv4) aVar).f133713d);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            objArr[0].mo74320g(1, 8, this.f133713d);
            return 0;
        } else if (i == 1) {
            return C52418a.m58680g(1, 8, this.f133713d) + 0;
        } else {
            if (i == 2) {
                this.f133713d.clear();
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
                fv4 fv4 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue != 1) {
                    return -1;
                }
                LinkedList<byte[]> j = aVar2.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    ev4 ev4 = new ev4();
                    if (bArr != null && bArr.length > 0) {
                        ev4.parseFrom(bArr);
                    }
                    fv4.f133713d.add(ev4);
                }
                return 0;
            }
        }
    }
}
