package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.g82 */
public class C49530g82 extends C47465a {

    /* renamed from: d */
    public int f133924d;

    /* renamed from: e */
    public int f133925e;

    /* renamed from: f */
    public C89349b f133926f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49530g82)) {
            return false;
        }
        C49530g82 g822 = (C49530g82) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f133924d), Integer.valueOf(g822.f133924d)) && C46238a.m51546a(Integer.valueOf(this.f133925e), Integer.valueOf(g822.f133925e)) && C46238a.m51546a(this.f133926f, g822.f133926f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f133924d);
            aVar.mo74318e(2, this.f133925e);
            C89349b bVar = this.f133926f;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f133924d) + 0 + C52418a.m58678e(2, this.f133925e);
            C89349b bVar2 = this.f133926f;
            return bVar2 != null ? e + C52418a.m58675b(3, bVar2) : e;
        } else if (i == 2) {
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
            C49530g82 g822 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                g822.f133924d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                g822.f133925e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                g822.f133926f = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}
