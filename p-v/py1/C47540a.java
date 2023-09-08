package py1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;

/* renamed from: py1.a */
public class C47540a extends C47465a {

    /* renamed from: d */
    public LinkedList<C47580f4> f127551d = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        return aVar != null && (aVar instanceof C47540a) && C46238a.m51546a(this.f127551d, ((C47540a) aVar).f127551d);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            objArr[0].mo74320g(1, 8, this.f127551d);
            return 0;
        } else if (i == 1) {
            return C52418a.m58680g(1, 8, this.f127551d) + 0;
        } else {
            if (i == 2) {
                this.f127551d.clear();
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
                C47540a aVar3 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue != 1) {
                    return -1;
                }
                LinkedList<byte[]> j = aVar2.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C47580f4 f4Var = new C47580f4();
                    if (bArr != null && bArr.length > 0) {
                        f4Var.parseFrom(bArr);
                    }
                    aVar3.f127551d.add(f4Var);
                }
                return 0;
            }
        }
    }
}
