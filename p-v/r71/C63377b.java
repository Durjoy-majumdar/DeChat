package r71;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;

/* renamed from: r71.b */
public class C63377b extends C47465a {

    /* renamed from: d */
    public LinkedList<C63376a> f179779d = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        return aVar != null && (aVar instanceof C63377b) && C46238a.m51546a(this.f179779d, ((C63377b) aVar).f179779d);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            objArr[0].mo74320g(1, 8, this.f179779d);
            return 0;
        } else if (i == 1) {
            return C52418a.m58680g(1, 8, this.f179779d) + 0;
        } else {
            if (i == 2) {
                this.f179779d.clear();
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
                C63377b bVar = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue != 1) {
                    return -1;
                }
                LinkedList<byte[]> j = aVar2.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C63376a aVar3 = new C63376a();
                    if (bArr != null && bArr.length > 0) {
                        aVar3.parseFrom(bArr);
                    }
                    bVar.f179779d.add(aVar3);
                }
                return 0;
            }
        }
    }
}
