package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.e34 */
public class C49228e34 extends C47465a {

    /* renamed from: d */
    public LinkedList<so4> f132666d = new LinkedList<>();

    /* renamed from: e */
    public C89349b f132667e;

    /* renamed from: f */
    public int f132668f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49228e34)) {
            return false;
        }
        C49228e34 e342 = (C49228e34) aVar;
        return C46238a.m51546a(this.f132666d, e342.f132666d) && C46238a.m51546a(this.f132667e, e342.f132667e) && C46238a.m51546a(Integer.valueOf(this.f132668f), Integer.valueOf(e342.f132668f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f132666d);
            C89349b bVar = this.f132667e;
            if (bVar != null) {
                aVar.mo74315b(2, bVar);
            }
            aVar.mo74318e(3, this.f132668f);
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 8, this.f132666d) + 0;
            C89349b bVar2 = this.f132667e;
            if (bVar2 != null) {
                g += C52418a.m58675b(2, bVar2);
            }
            return g + C52418a.m58678e(3, this.f132668f);
        } else if (i == 2) {
            this.f132666d.clear();
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
            C49228e34 e342 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    so4 so4 = new so4();
                    if (bArr != null && bArr.length > 0) {
                        so4.parseFrom(bArr);
                    }
                    e342.f132666d.add(so4);
                }
                return 0;
            } else if (intValue == 2) {
                e342.f132667e = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                e342.f132668f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
