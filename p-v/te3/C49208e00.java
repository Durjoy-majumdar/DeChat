package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.e00 */
public class C49208e00 extends C47465a {

    /* renamed from: d */
    public int f132601d;

    /* renamed from: e */
    public C89349b f132602e;

    /* renamed from: f */
    public LinkedList<Long> f132603f = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49208e00)) {
            return false;
        }
        C49208e00 e002 = (C49208e00) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f132601d), Integer.valueOf(e002.f132601d)) && C46238a.m51546a(this.f132602e, e002.f132602e) && C46238a.m51546a(this.f132603f, e002.f132603f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f132601d);
            C89349b bVar = this.f132602e;
            if (bVar != null) {
                aVar.mo74315b(2, bVar);
            }
            aVar.mo74320g(3, 3, this.f132603f);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f132601d) + 0;
            C89349b bVar2 = this.f132602e;
            if (bVar2 != null) {
                e += C52418a.m58675b(2, bVar2);
            }
            return e + C52418a.m58680g(3, 3, this.f132603f);
        } else if (i == 2) {
            this.f132603f.clear();
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
            C49208e00 e002 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                e002.f132601d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                e002.f132602e = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                e002.f132603f.add(Long.valueOf(aVar3.mo141631i(intValue)));
                return 0;
            }
        }
    }
}
