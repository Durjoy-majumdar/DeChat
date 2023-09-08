package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class ia4 extends C47465a {

    /* renamed from: d */
    public int f298395d;

    /* renamed from: e */
    public int f298396e;

    /* renamed from: f */
    public int f298397f;

    /* renamed from: g */
    public int f298398g;

    /* renamed from: h */
    public int f298399h;

    /* renamed from: i */
    public int f298400i;

    /* renamed from: j */
    public int f298401j;

    /* renamed from: n */
    public LinkedList<Integer> f298402n = new LinkedList<>();

    /* renamed from: o */
    public int f298403o;

    /* renamed from: p */
    public int f298404p;

    /* renamed from: q */
    public LinkedList<Integer> f298405q = new LinkedList<>();

    /* renamed from: r */
    public int f298406r;

    /* renamed from: s */
    public int f298407s;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ia4)) {
            return false;
        }
        ia4 ia4 = (ia4) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f298395d), Integer.valueOf(ia4.f298395d)) && C46238a.m51546a(Integer.valueOf(this.f298396e), Integer.valueOf(ia4.f298396e)) && C46238a.m51546a(Integer.valueOf(this.f298397f), Integer.valueOf(ia4.f298397f)) && C46238a.m51546a(Integer.valueOf(this.f298398g), Integer.valueOf(ia4.f298398g)) && C46238a.m51546a(Integer.valueOf(this.f298399h), Integer.valueOf(ia4.f298399h)) && C46238a.m51546a(Integer.valueOf(this.f298400i), Integer.valueOf(ia4.f298400i)) && C46238a.m51546a(Integer.valueOf(this.f298401j), Integer.valueOf(ia4.f298401j)) && C46238a.m51546a(this.f298402n, ia4.f298402n) && C46238a.m51546a(Integer.valueOf(this.f298403o), Integer.valueOf(ia4.f298403o)) && C46238a.m51546a(Integer.valueOf(this.f298404p), Integer.valueOf(ia4.f298404p)) && C46238a.m51546a(this.f298405q, ia4.f298405q) && C46238a.m51546a(Integer.valueOf(this.f298406r), Integer.valueOf(ia4.f298406r)) && C46238a.m51546a(Integer.valueOf(this.f298407s), Integer.valueOf(ia4.f298407s));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f298395d);
            aVar.mo74318e(2, this.f298396e);
            aVar.mo74318e(3, this.f298397f);
            aVar.mo74318e(4, this.f298398g);
            aVar.mo74318e(5, this.f298399h);
            aVar.mo74318e(6, this.f298400i);
            aVar.mo74318e(7, this.f298401j);
            aVar.mo74320g(8, 2, this.f298402n);
            aVar.mo74318e(9, this.f298403o);
            aVar.mo74318e(10, this.f298404p);
            aVar.mo74320g(11, 2, this.f298405q);
            aVar.mo74318e(12, this.f298406r);
            aVar.mo74318e(13, this.f298407s);
            return 0;
        } else if (i2 == 1) {
            return C52418a.m58678e(1, this.f298395d) + 0 + C52418a.m58678e(2, this.f298396e) + C52418a.m58678e(3, this.f298397f) + C52418a.m58678e(4, this.f298398g) + C52418a.m58678e(5, this.f298399h) + C52418a.m58678e(6, this.f298400i) + C52418a.m58678e(7, this.f298401j) + C52418a.m58680g(8, 2, this.f298402n) + C52418a.m58678e(9, this.f298403o) + C52418a.m58678e(10, this.f298404p) + C52418a.m58680g(11, 2, this.f298405q) + C52418a.m58678e(12, this.f298406r) + C52418a.m58678e(13, this.f298407s);
        } else {
            if (i2 == 2) {
                this.f298402n.clear();
                this.f298405q.clear();
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
                ia4 ia4 = objArr[1];
                int intValue = objArr[2].intValue();
                switch (intValue) {
                    case 1:
                        ia4.f298395d = aVar3.mo141629g(intValue);
                        return 0;
                    case 2:
                        ia4.f298396e = aVar3.mo141629g(intValue);
                        return 0;
                    case 3:
                        ia4.f298397f = aVar3.mo141629g(intValue);
                        return 0;
                    case 4:
                        ia4.f298398g = aVar3.mo141629g(intValue);
                        return 0;
                    case 5:
                        ia4.f298399h = aVar3.mo141629g(intValue);
                        return 0;
                    case 6:
                        ia4.f298400i = aVar3.mo141629g(intValue);
                        return 0;
                    case 7:
                        ia4.f298401j = aVar3.mo141629g(intValue);
                        return 0;
                    case 8:
                        ia4.f298402n.add(Integer.valueOf(aVar3.mo141629g(intValue)));
                        return 0;
                    case 9:
                        ia4.f298403o = aVar3.mo141629g(intValue);
                        return 0;
                    case 10:
                        ia4.f298404p = aVar3.mo141629g(intValue);
                        return 0;
                    case 11:
                        ia4.f298405q.add(Integer.valueOf(aVar3.mo141629g(intValue)));
                        return 0;
                    case 12:
                        ia4.f298406r = aVar3.mo141629g(intValue);
                        return 0;
                    case 13:
                        ia4.f298407s = aVar3.mo141629g(intValue);
                        return 0;
                    default:
                        return -1;
                }
            }
        }
    }
}
