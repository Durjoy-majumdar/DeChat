package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;

/* renamed from: te3.af */
public class C48702af extends C47465a {

    /* renamed from: d */
    public LinkedList<C52251ze> f130476d = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        return aVar != null && (aVar instanceof C48702af) && C46238a.m51546a(this.f130476d, ((C48702af) aVar).f130476d);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            objArr[0].mo74320g(1, 8, this.f130476d);
            return 0;
        } else if (i == 1) {
            return C52418a.m58680g(1, 8, this.f130476d) + 0;
        } else {
            if (i == 2) {
                this.f130476d.clear();
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
                C48702af afVar = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue != 1) {
                    return -1;
                }
                LinkedList<byte[]> j = aVar2.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C52251ze zeVar = new C52251ze();
                    if (bArr != null && bArr.length > 0) {
                        zeVar.parseFrom(bArr);
                    }
                    afVar.f130476d.add(zeVar);
                }
                return 0;
            }
        }
    }
}
