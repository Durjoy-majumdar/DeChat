package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.c6 */
public class C48961c6 extends C47465a {

    /* renamed from: d */
    public boolean f131534d;

    /* renamed from: e */
    public boolean f131535e;

    /* renamed from: f */
    public int f131536f;

    /* renamed from: g */
    public int f131537g;

    /* renamed from: h */
    public int f131538h;

    /* renamed from: i */
    public int f131539i;

    /* renamed from: j */
    public int f131540j;

    /* renamed from: n */
    public boolean f131541n;

    /* renamed from: o */
    public boolean f131542o;

    /* renamed from: p */
    public boolean f131543p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48961c6)) {
            return false;
        }
        C48961c6 c6Var = (C48961c6) aVar;
        return C46238a.m51546a(Boolean.valueOf(this.f131534d), Boolean.valueOf(c6Var.f131534d)) && C46238a.m51546a(Boolean.valueOf(this.f131535e), Boolean.valueOf(c6Var.f131535e)) && C46238a.m51546a(Integer.valueOf(this.f131536f), Integer.valueOf(c6Var.f131536f)) && C46238a.m51546a(Integer.valueOf(this.f131537g), Integer.valueOf(c6Var.f131537g)) && C46238a.m51546a(Integer.valueOf(this.f131538h), Integer.valueOf(c6Var.f131538h)) && C46238a.m51546a(Integer.valueOf(this.f131539i), Integer.valueOf(c6Var.f131539i)) && C46238a.m51546a(Integer.valueOf(this.f131540j), Integer.valueOf(c6Var.f131540j)) && C46238a.m51546a(Boolean.valueOf(this.f131541n), Boolean.valueOf(c6Var.f131541n)) && C46238a.m51546a(Boolean.valueOf(this.f131542o), Boolean.valueOf(c6Var.f131542o)) && C46238a.m51546a(Boolean.valueOf(this.f131543p), Boolean.valueOf(c6Var.f131543p));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74314a(1, this.f131534d);
            aVar.mo74314a(2, this.f131535e);
            aVar.mo74318e(3, this.f131536f);
            aVar.mo74318e(4, this.f131537g);
            aVar.mo74318e(5, this.f131538h);
            aVar.mo74318e(6, this.f131539i);
            aVar.mo74318e(7, this.f131540j);
            aVar.mo74314a(8, this.f131541n);
            aVar.mo74314a(9, this.f131542o);
            aVar.mo74314a(10, this.f131543p);
            return 0;
        } else if (i == 1) {
            return C52418a.m58674a(1, this.f131534d) + 0 + C52418a.m58674a(2, this.f131535e) + C52418a.m58678e(3, this.f131536f) + C52418a.m58678e(4, this.f131537g) + C52418a.m58678e(5, this.f131538h) + C52418a.m58678e(6, this.f131539i) + C52418a.m58678e(7, this.f131540j) + C52418a.m58674a(8, this.f131541n) + C52418a.m58674a(9, this.f131542o) + C52418a.m58674a(10, this.f131543p);
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
                C48961c6 c6Var = objArr[1];
                int intValue = objArr[2].intValue();
                switch (intValue) {
                    case 1:
                        c6Var.f131534d = aVar3.mo141625c(intValue);
                        return 0;
                    case 2:
                        c6Var.f131535e = aVar3.mo141625c(intValue);
                        return 0;
                    case 3:
                        c6Var.f131536f = aVar3.mo141629g(intValue);
                        return 0;
                    case 4:
                        c6Var.f131537g = aVar3.mo141629g(intValue);
                        return 0;
                    case 5:
                        c6Var.f131538h = aVar3.mo141629g(intValue);
                        return 0;
                    case 6:
                        c6Var.f131539i = aVar3.mo141629g(intValue);
                        return 0;
                    case 7:
                        c6Var.f131540j = aVar3.mo141629g(intValue);
                        return 0;
                    case 8:
                        c6Var.f131541n = aVar3.mo141625c(intValue);
                        return 0;
                    case 9:
                        c6Var.f131542o = aVar3.mo141625c(intValue);
                        return 0;
                    case 10:
                        c6Var.f131543p = aVar3.mo141625c(intValue);
                        return 0;
                    default:
                        return -1;
                }
            }
        }
    }
}
