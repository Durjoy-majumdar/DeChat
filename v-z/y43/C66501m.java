package y43;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: y43.m */
public class C66501m extends C47465a {

    /* renamed from: d */
    public LinkedList<C79034n> f191301d = new LinkedList<>();

    /* renamed from: e */
    public C89349b f191302e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C66501m)) {
            return false;
        }
        C66501m mVar = (C66501m) aVar;
        return C46238a.m51546a(this.f191301d, mVar.f191301d) && C46238a.m51546a(this.f191302e, mVar.f191302e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f191301d);
            C89349b bVar = this.f191302e;
            if (bVar != null) {
                aVar.mo74315b(2, bVar);
            }
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 8, this.f191301d) + 0;
            C89349b bVar2 = this.f191302e;
            return bVar2 != null ? g + C52418a.m58675b(2, bVar2) : g;
        } else if (i == 2) {
            this.f191301d.clear();
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
            C66501m mVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C79034n nVar = new C79034n();
                    if (bArr != null && bArr.length > 0) {
                        nVar.parseFrom(bArr);
                    }
                    mVar.f191301d.add(nVar);
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                mVar.f191302e = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}
