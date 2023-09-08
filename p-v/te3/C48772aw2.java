package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.aw2 */
public class C48772aw2 extends C47465a {

    /* renamed from: d */
    public int f130796d;

    /* renamed from: e */
    public int f130797e;

    /* renamed from: f */
    public int f130798f;

    /* renamed from: g */
    public int f130799g;

    /* renamed from: h */
    public int f130800h;

    /* renamed from: i */
    public int f130801i;

    /* renamed from: j */
    public int f130802j;

    /* renamed from: n */
    public int f130803n;

    /* renamed from: o */
    public int f130804o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48772aw2)) {
            return false;
        }
        C48772aw2 aw22 = (C48772aw2) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f130796d), Integer.valueOf(aw22.f130796d)) && C46238a.m51546a(Integer.valueOf(this.f130797e), Integer.valueOf(aw22.f130797e)) && C46238a.m51546a(Integer.valueOf(this.f130798f), Integer.valueOf(aw22.f130798f)) && C46238a.m51546a(Integer.valueOf(this.f130799g), Integer.valueOf(aw22.f130799g)) && C46238a.m51546a(Integer.valueOf(this.f130800h), Integer.valueOf(aw22.f130800h)) && C46238a.m51546a(Integer.valueOf(this.f130801i), Integer.valueOf(aw22.f130801i)) && C46238a.m51546a(Integer.valueOf(this.f130802j), Integer.valueOf(aw22.f130802j)) && C46238a.m51546a(Integer.valueOf(this.f130803n), Integer.valueOf(aw22.f130803n)) && C46238a.m51546a(Integer.valueOf(this.f130804o), Integer.valueOf(aw22.f130804o));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f130796d);
            aVar.mo74318e(2, this.f130797e);
            aVar.mo74318e(3, this.f130798f);
            aVar.mo74318e(4, this.f130799g);
            aVar.mo74318e(5, this.f130800h);
            aVar.mo74318e(6, this.f130801i);
            aVar.mo74318e(7, this.f130802j);
            aVar.mo74318e(8, this.f130803n);
            aVar.mo74318e(9, this.f130804o);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f130796d) + 0 + C52418a.m58678e(2, this.f130797e) + C52418a.m58678e(3, this.f130798f) + C52418a.m58678e(4, this.f130799g) + C52418a.m58678e(5, this.f130800h) + C52418a.m58678e(6, this.f130801i) + C52418a.m58678e(7, this.f130802j) + C52418a.m58678e(8, this.f130803n) + C52418a.m58678e(9, this.f130804o);
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
                C48772aw2 aw22 = objArr[1];
                int intValue = objArr[2].intValue();
                switch (intValue) {
                    case 1:
                        aw22.f130796d = aVar3.mo141629g(intValue);
                        return 0;
                    case 2:
                        aw22.f130797e = aVar3.mo141629g(intValue);
                        return 0;
                    case 3:
                        aw22.f130798f = aVar3.mo141629g(intValue);
                        return 0;
                    case 4:
                        aw22.f130799g = aVar3.mo141629g(intValue);
                        return 0;
                    case 5:
                        aw22.f130800h = aVar3.mo141629g(intValue);
                        return 0;
                    case 6:
                        aw22.f130801i = aVar3.mo141629g(intValue);
                        return 0;
                    case 7:
                        aw22.f130802j = aVar3.mo141629g(intValue);
                        return 0;
                    case 8:
                        aw22.f130803n = aVar3.mo141629g(intValue);
                        return 0;
                    case 9:
                        aw22.f130804o = aVar3.mo141629g(intValue);
                        return 0;
                    default:
                        return -1;
                }
            }
        }
    }
}
