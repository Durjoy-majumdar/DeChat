package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class e45 extends C47465a {

    /* renamed from: d */
    public LinkedList<jb4> f132692d = new LinkedList<>();

    /* renamed from: e */
    public C89349b f132693e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof e45)) {
            return false;
        }
        e45 e45 = (e45) aVar;
        return C46238a.m51546a(this.f132692d, e45.f132692d) && C46238a.m51546a(this.f132693e, e45.f132693e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f132692d);
            C89349b bVar = this.f132693e;
            if (bVar != null) {
                aVar.mo74315b(2, bVar);
            }
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 8, this.f132692d) + 0;
            C89349b bVar2 = this.f132693e;
            return bVar2 != null ? g + C52418a.m58675b(2, bVar2) : g;
        } else if (i == 2) {
            this.f132692d.clear();
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
            e45 e45 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    jb4 jb4 = new jb4();
                    if (bArr != null && bArr.length > 0) {
                        jb4.parseFrom(bArr);
                    }
                    e45.f132692d.add(jb4);
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                e45.f132693e = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}
