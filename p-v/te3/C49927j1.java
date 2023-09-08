package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.j1 */
public class C49927j1 extends C47465a {

    /* renamed from: d */
    public int f135801d;

    /* renamed from: e */
    public int f135802e;

    /* renamed from: f */
    public int f135803f;

    /* renamed from: g */
    public int f135804g;

    /* renamed from: h */
    public int f135805h;

    /* renamed from: i */
    public int f135806i;

    /* renamed from: j */
    public int f135807j;

    /* renamed from: n */
    public int f135808n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49927j1)) {
            return false;
        }
        C49927j1 j1Var = (C49927j1) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f135801d), Integer.valueOf(j1Var.f135801d)) && C46238a.m51546a(Integer.valueOf(this.f135802e), Integer.valueOf(j1Var.f135802e)) && C46238a.m51546a(Integer.valueOf(this.f135803f), Integer.valueOf(j1Var.f135803f)) && C46238a.m51546a(Integer.valueOf(this.f135804g), Integer.valueOf(j1Var.f135804g)) && C46238a.m51546a(Integer.valueOf(this.f135805h), Integer.valueOf(j1Var.f135805h)) && C46238a.m51546a(Integer.valueOf(this.f135806i), Integer.valueOf(j1Var.f135806i)) && C46238a.m51546a(Integer.valueOf(this.f135807j), Integer.valueOf(j1Var.f135807j)) && C46238a.m51546a(Integer.valueOf(this.f135808n), Integer.valueOf(j1Var.f135808n));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f135801d);
            aVar.mo74318e(2, this.f135802e);
            aVar.mo74318e(3, this.f135803f);
            aVar.mo74318e(4, this.f135804g);
            aVar.mo74318e(5, this.f135805h);
            aVar.mo74318e(6, this.f135806i);
            aVar.mo74318e(7, this.f135807j);
            aVar.mo74318e(8, this.f135808n);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f135801d) + 0 + C52418a.m58678e(2, this.f135802e) + C52418a.m58678e(3, this.f135803f) + C52418a.m58678e(4, this.f135804g) + C52418a.m58678e(5, this.f135805h) + C52418a.m58678e(6, this.f135806i) + C52418a.m58678e(7, this.f135807j) + C52418a.m58678e(8, this.f135808n);
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
                C49927j1 j1Var = objArr[1];
                int intValue = objArr[2].intValue();
                switch (intValue) {
                    case 1:
                        j1Var.f135801d = aVar3.mo141629g(intValue);
                        return 0;
                    case 2:
                        j1Var.f135802e = aVar3.mo141629g(intValue);
                        return 0;
                    case 3:
                        j1Var.f135803f = aVar3.mo141629g(intValue);
                        return 0;
                    case 4:
                        j1Var.f135804g = aVar3.mo141629g(intValue);
                        return 0;
                    case 5:
                        j1Var.f135805h = aVar3.mo141629g(intValue);
                        return 0;
                    case 6:
                        j1Var.f135806i = aVar3.mo141629g(intValue);
                        return 0;
                    case 7:
                        j1Var.f135807j = aVar3.mo141629g(intValue);
                        return 0;
                    case 8:
                        j1Var.f135808n = aVar3.mo141629g(intValue);
                        return 0;
                    default:
                        return -1;
                }
            }
        }
    }
}
