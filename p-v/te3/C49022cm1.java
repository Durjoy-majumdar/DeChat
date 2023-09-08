package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.cm1 */
public class C49022cm1 extends C47465a {

    /* renamed from: d */
    public LinkedList<C48960c53> f131823d = new LinkedList<>();

    /* renamed from: e */
    public int f131824e;

    /* renamed from: f */
    public C89349b f131825f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49022cm1)) {
            return false;
        }
        C49022cm1 cm12 = (C49022cm1) aVar;
        return C46238a.m51546a(this.f131823d, cm12.f131823d) && C46238a.m51546a(Integer.valueOf(this.f131824e), Integer.valueOf(cm12.f131824e)) && C46238a.m51546a(this.f131825f, cm12.f131825f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f131823d);
            aVar.mo74318e(2, this.f131824e);
            C89349b bVar = this.f131825f;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 8, this.f131823d) + 0 + C52418a.m58678e(2, this.f131824e);
            C89349b bVar2 = this.f131825f;
            return bVar2 != null ? g + C52418a.m58675b(3, bVar2) : g;
        } else if (i == 2) {
            this.f131823d.clear();
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
            C49022cm1 cm12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C48960c53 c532 = new C48960c53();
                    if (bArr != null && bArr.length > 0) {
                        c532.parseFrom(bArr);
                    }
                    cm12.f131823d.add(c532);
                }
                return 0;
            } else if (intValue == 2) {
                cm12.f131824e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                cm12.f131825f = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}
