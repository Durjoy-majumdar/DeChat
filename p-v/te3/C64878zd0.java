package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.zd0 */
public class C64878zd0 extends C47465a {

    /* renamed from: d */
    public int f186671d;

    /* renamed from: e */
    public int f186672e;

    /* renamed from: f */
    public int f186673f;

    /* renamed from: g */
    public int f186674g;

    /* renamed from: h */
    public int f186675h;

    /* renamed from: i */
    public int f186676i;

    /* renamed from: j */
    public int f186677j;

    /* renamed from: n */
    public int f186678n;

    /* renamed from: o */
    public int f186679o;

    /* renamed from: p */
    public int f186680p;

    /* renamed from: q */
    public int f186681q;

    /* renamed from: r */
    public int f186682r;

    /* renamed from: s */
    public int f186683s;

    /* renamed from: t */
    public int f186684t;

    /* renamed from: u */
    public int f186685u;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64878zd0)) {
            return false;
        }
        C64878zd0 zd02 = (C64878zd0) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f186671d), Integer.valueOf(zd02.f186671d)) && C46238a.m51546a(Integer.valueOf(this.f186672e), Integer.valueOf(zd02.f186672e)) && C46238a.m51546a(Integer.valueOf(this.f186673f), Integer.valueOf(zd02.f186673f)) && C46238a.m51546a(Integer.valueOf(this.f186674g), Integer.valueOf(zd02.f186674g)) && C46238a.m51546a(Integer.valueOf(this.f186675h), Integer.valueOf(zd02.f186675h)) && C46238a.m51546a(Integer.valueOf(this.f186676i), Integer.valueOf(zd02.f186676i)) && C46238a.m51546a(Integer.valueOf(this.f186677j), Integer.valueOf(zd02.f186677j)) && C46238a.m51546a(Integer.valueOf(this.f186678n), Integer.valueOf(zd02.f186678n)) && C46238a.m51546a(Integer.valueOf(this.f186679o), Integer.valueOf(zd02.f186679o)) && C46238a.m51546a(Integer.valueOf(this.f186680p), Integer.valueOf(zd02.f186680p)) && C46238a.m51546a(Integer.valueOf(this.f186681q), Integer.valueOf(zd02.f186681q)) && C46238a.m51546a(Integer.valueOf(this.f186682r), Integer.valueOf(zd02.f186682r)) && C46238a.m51546a(Integer.valueOf(this.f186683s), Integer.valueOf(zd02.f186683s)) && C46238a.m51546a(Integer.valueOf(this.f186684t), Integer.valueOf(zd02.f186684t)) && C46238a.m51546a(Integer.valueOf(this.f186685u), Integer.valueOf(zd02.f186685u));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f186671d);
            aVar.mo74318e(2, this.f186672e);
            aVar.mo74318e(3, this.f186673f);
            aVar.mo74318e(4, this.f186674g);
            aVar.mo74318e(5, this.f186675h);
            aVar.mo74318e(6, this.f186676i);
            aVar.mo74318e(7, this.f186677j);
            aVar.mo74318e(8, this.f186678n);
            aVar.mo74318e(9, this.f186679o);
            aVar.mo74318e(10, this.f186680p);
            aVar.mo74318e(11, this.f186681q);
            aVar.mo74318e(12, this.f186682r);
            aVar.mo74318e(13, this.f186683s);
            aVar.mo74318e(14, this.f186684t);
            aVar.mo74318e(15, this.f186685u);
            return 0;
        } else if (i2 == 1) {
            return C52418a.m58678e(1, this.f186671d) + 0 + C52418a.m58678e(2, this.f186672e) + C52418a.m58678e(3, this.f186673f) + C52418a.m58678e(4, this.f186674g) + C52418a.m58678e(5, this.f186675h) + C52418a.m58678e(6, this.f186676i) + C52418a.m58678e(7, this.f186677j) + C52418a.m58678e(8, this.f186678n) + C52418a.m58678e(9, this.f186679o) + C52418a.m58678e(10, this.f186680p) + C52418a.m58678e(11, this.f186681q) + C52418a.m58678e(12, this.f186682r) + C52418a.m58678e(13, this.f186683s) + C52418a.m58678e(14, this.f186684t) + C52418a.m58678e(15, this.f186685u);
        } else {
            if (i2 == 2) {
                C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
                for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                    if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                        aVar2.mo141624b();
                    }
                }
                return 0;
            } else if (i2 != 3) {
                return -1;
            } else {
                C102122a aVar3 = objArr[0];
                C64878zd0 zd02 = objArr[1];
                int intValue = objArr[2].intValue();
                switch (intValue) {
                    case 1:
                        zd02.f186671d = aVar3.mo141629g(intValue);
                        return 0;
                    case 2:
                        zd02.f186672e = aVar3.mo141629g(intValue);
                        return 0;
                    case 3:
                        zd02.f186673f = aVar3.mo141629g(intValue);
                        return 0;
                    case 4:
                        zd02.f186674g = aVar3.mo141629g(intValue);
                        return 0;
                    case 5:
                        zd02.f186675h = aVar3.mo141629g(intValue);
                        return 0;
                    case 6:
                        zd02.f186676i = aVar3.mo141629g(intValue);
                        return 0;
                    case 7:
                        zd02.f186677j = aVar3.mo141629g(intValue);
                        return 0;
                    case 8:
                        zd02.f186678n = aVar3.mo141629g(intValue);
                        return 0;
                    case 9:
                        zd02.f186679o = aVar3.mo141629g(intValue);
                        return 0;
                    case 10:
                        zd02.f186680p = aVar3.mo141629g(intValue);
                        return 0;
                    case 11:
                        zd02.f186681q = aVar3.mo141629g(intValue);
                        return 0;
                    case 12:
                        zd02.f186682r = aVar3.mo141629g(intValue);
                        return 0;
                    case 13:
                        zd02.f186683s = aVar3.mo141629g(intValue);
                        return 0;
                    case 14:
                        zd02.f186684t = aVar3.mo141629g(intValue);
                        return 0;
                    case 15:
                        zd02.f186685u = aVar3.mo141629g(intValue);
                        return 0;
                    default:
                        return -1;
                }
            }
        }
    }
}
