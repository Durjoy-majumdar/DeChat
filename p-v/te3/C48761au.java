package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.au */
public class C48761au extends C47465a {

    /* renamed from: d */
    public C89349b f130770d;

    /* renamed from: e */
    public LinkedList<C89349b> f130771e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48761au)) {
            return false;
        }
        C48761au auVar = (C48761au) aVar;
        return C46238a.m51546a(this.f130770d, auVar.f130770d) && C46238a.m51546a(this.f130771e, auVar.f130771e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C89349b bVar = this.f130770d;
            if (bVar != null) {
                aVar.mo74315b(1, bVar);
            }
            aVar.mo74320g(2, 6, this.f130771e);
            return 0;
        } else if (i == 1) {
            C89349b bVar2 = this.f130770d;
            if (bVar2 != null) {
                i2 = 0 + C52418a.m58675b(1, bVar2);
            }
            return i2 + C52418a.m58680g(2, 6, this.f130771e);
        } else if (i == 2) {
            this.f130771e.clear();
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
            C48761au auVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                auVar.f130770d = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                auVar.f130771e.add(aVar3.mo141626d(intValue));
                return 0;
            }
        }
    }
}
