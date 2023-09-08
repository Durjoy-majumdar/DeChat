package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.i2 */
public class C101786i2 extends C47465a {

    /* renamed from: d */
    public int f298371d;

    /* renamed from: e */
    public int f298372e;

    /* renamed from: f */
    public float f298373f;

    /* renamed from: g */
    public float f298374g;

    /* renamed from: h */
    public float f298375h;

    /* renamed from: i */
    public long f298376i;

    /* renamed from: j */
    public long f298377j;

    /* renamed from: n */
    public long f298378n;

    /* renamed from: o */
    public long f298379o;

    /* renamed from: p */
    public long f298380p;

    /* renamed from: q */
    public long f298381q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101786i2)) {
            return false;
        }
        C101786i2 i2Var = (C101786i2) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f298371d), Integer.valueOf(i2Var.f298371d)) && C46238a.m51546a(Integer.valueOf(this.f298372e), Integer.valueOf(i2Var.f298372e)) && C46238a.m51546a(Float.valueOf(this.f298373f), Float.valueOf(i2Var.f298373f)) && C46238a.m51546a(Float.valueOf(this.f298374g), Float.valueOf(i2Var.f298374g)) && C46238a.m51546a(Float.valueOf(this.f298375h), Float.valueOf(i2Var.f298375h)) && C46238a.m51546a(Long.valueOf(this.f298376i), Long.valueOf(i2Var.f298376i)) && C46238a.m51546a(Long.valueOf(this.f298377j), Long.valueOf(i2Var.f298377j)) && C46238a.m51546a(Long.valueOf(this.f298378n), Long.valueOf(i2Var.f298378n)) && C46238a.m51546a(Long.valueOf(this.f298379o), Long.valueOf(i2Var.f298379o)) && C46238a.m51546a(Long.valueOf(this.f298380p), Long.valueOf(i2Var.f298380p)) && C46238a.m51546a(Long.valueOf(this.f298381q), Long.valueOf(i2Var.f298381q));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f298371d);
            aVar.mo74318e(2, this.f298372e);
            aVar.mo74317d(3, this.f298373f);
            aVar.mo74317d(4, this.f298374g);
            aVar.mo74317d(5, this.f298375h);
            aVar.mo74321h(6, this.f298376i);
            aVar.mo74321h(7, this.f298377j);
            aVar.mo74321h(8, this.f298378n);
            aVar.mo74321h(9, this.f298379o);
            aVar.mo74321h(10, this.f298380p);
            aVar.mo74321h(11, this.f298381q);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f298371d) + 0 + C52418a.m58678e(2, this.f298372e) + C52418a.m58677d(3, this.f298373f) + C52418a.m58677d(4, this.f298374g) + C52418a.m58677d(5, this.f298375h) + C52418a.m58681h(6, this.f298376i) + C52418a.m58681h(7, this.f298377j) + C52418a.m58681h(8, this.f298378n) + C52418a.m58681h(9, this.f298379o) + C52418a.m58681h(10, this.f298380p) + C52418a.m58681h(11, this.f298381q);
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
                C101786i2 i2Var = objArr[1];
                int intValue = objArr[2].intValue();
                switch (intValue) {
                    case 1:
                        i2Var.f298371d = aVar3.mo141629g(intValue);
                        return 0;
                    case 2:
                        i2Var.f298372e = aVar3.mo141629g(intValue);
                        return 0;
                    case 3:
                        i2Var.f298373f = aVar3.mo141628f(intValue);
                        return 0;
                    case 4:
                        i2Var.f298374g = aVar3.mo141628f(intValue);
                        return 0;
                    case 5:
                        i2Var.f298375h = aVar3.mo141628f(intValue);
                        return 0;
                    case 6:
                        i2Var.f298376i = aVar3.mo141631i(intValue);
                        return 0;
                    case 7:
                        i2Var.f298377j = aVar3.mo141631i(intValue);
                        return 0;
                    case 8:
                        i2Var.f298378n = aVar3.mo141631i(intValue);
                        return 0;
                    case 9:
                        i2Var.f298379o = aVar3.mo141631i(intValue);
                        return 0;
                    case 10:
                        i2Var.f298380p = aVar3.mo141631i(intValue);
                        return 0;
                    case 11:
                        i2Var.f298381q = aVar3.mo141631i(intValue);
                        return 0;
                    default:
                        return -1;
                }
            }
        }
    }
}
