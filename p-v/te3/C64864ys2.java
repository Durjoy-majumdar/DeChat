package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ys2 */
public class C64864ys2 extends C47465a {

    /* renamed from: d */
    public long f186595d;

    /* renamed from: e */
    public long f186596e;

    /* renamed from: f */
    public int f186597f;

    /* renamed from: g */
    public long f186598g;

    /* renamed from: h */
    public long f186599h;

    /* renamed from: i */
    public long f186600i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64864ys2)) {
            return false;
        }
        C64864ys2 ys22 = (C64864ys2) aVar;
        return C46238a.m51546a(Long.valueOf(this.f186595d), Long.valueOf(ys22.f186595d)) && C46238a.m51546a(Long.valueOf(this.f186596e), Long.valueOf(ys22.f186596e)) && C46238a.m51546a(Integer.valueOf(this.f186597f), Integer.valueOf(ys22.f186597f)) && C46238a.m51546a(Long.valueOf(this.f186598g), Long.valueOf(ys22.f186598g)) && C46238a.m51546a(Long.valueOf(this.f186599h), Long.valueOf(ys22.f186599h)) && C46238a.m51546a(Long.valueOf(this.f186600i), Long.valueOf(ys22.f186600i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f186595d);
            aVar.mo74321h(2, this.f186596e);
            aVar.mo74318e(3, this.f186597f);
            aVar.mo74321h(4, this.f186598g);
            aVar.mo74321h(5, this.f186599h);
            aVar.mo74321h(6, this.f186600i);
            return 0;
        } else if (i == 1) {
            return C52418a.m58681h(1, this.f186595d) + 0 + C52418a.m58681h(2, this.f186596e) + C52418a.m58678e(3, this.f186597f) + C52418a.m58681h(4, this.f186598g) + C52418a.m58681h(5, this.f186599h) + C52418a.m58681h(6, this.f186600i);
        } else {
            if (i == 2) {
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
                C64864ys2 ys22 = objArr[1];
                int intValue = objArr[2].intValue();
                switch (intValue) {
                    case 1:
                        ys22.f186595d = aVar3.mo141631i(intValue);
                        return 0;
                    case 2:
                        ys22.f186596e = aVar3.mo141631i(intValue);
                        return 0;
                    case 3:
                        ys22.f186597f = aVar3.mo141629g(intValue);
                        return 0;
                    case 4:
                        ys22.f186598g = aVar3.mo141631i(intValue);
                        return 0;
                    case 5:
                        ys22.f186599h = aVar3.mo141631i(intValue);
                        return 0;
                    case 6:
                        ys22.f186600i = aVar3.mo141631i(intValue);
                        return 0;
                    default:
                        return -1;
                }
            }
        }
    }
}
