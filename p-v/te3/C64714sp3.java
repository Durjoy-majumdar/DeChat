package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.sp3 */
public class C64714sp3 extends C47465a {

    /* renamed from: d */
    public long f185434d;

    /* renamed from: e */
    public int f185435e;

    /* renamed from: f */
    public C89349b f185436f;

    /* renamed from: g */
    public long f185437g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64714sp3)) {
            return false;
        }
        C64714sp3 sp32 = (C64714sp3) aVar;
        return C46238a.m51546a(Long.valueOf(this.f185434d), Long.valueOf(sp32.f185434d)) && C46238a.m51546a(Integer.valueOf(this.f185435e), Integer.valueOf(sp32.f185435e)) && C46238a.m51546a(this.f185436f, sp32.f185436f) && C46238a.m51546a(Long.valueOf(this.f185437g), Long.valueOf(sp32.f185437g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f185434d);
            aVar.mo74318e(2, this.f185435e);
            C89349b bVar = this.f185436f;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            aVar.mo74321h(4, this.f185437g);
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f185434d) + 0 + C52418a.m58678e(2, this.f185435e);
            C89349b bVar2 = this.f185436f;
            if (bVar2 != null) {
                h += C52418a.m58675b(3, bVar2);
            }
            return h + C52418a.m58681h(4, this.f185437g);
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
            C64714sp3 sp32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                sp32.f185434d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 2) {
                sp32.f185435e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                sp32.f185436f = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                sp32.f185437g = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }
}
