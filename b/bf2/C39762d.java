package bf2;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;

/* renamed from: bf2.d */
public class C39762d extends C47465a {

    /* renamed from: d */
    public LinkedList<C39765h> f106708d = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        return aVar != null && (aVar instanceof C39762d) && C46238a.m51546a(this.f106708d, ((C39762d) aVar).f106708d);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            objArr[0].mo74320g(1, 8, this.f106708d);
            return 0;
        } else if (i == 1) {
            return C52418a.m58680g(1, 8, this.f106708d) + 0;
        } else {
            if (i == 2) {
                this.f106708d.clear();
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
                C39762d dVar = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue != 1) {
                    return -1;
                }
                LinkedList<byte[]> j = aVar2.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C39765h hVar = new C39765h();
                    if (bArr != null && bArr.length > 0) {
                        hVar.parseFrom(bArr);
                    }
                    dVar.f106708d.add(hVar);
                }
                return 0;
            }
        }
    }
}
