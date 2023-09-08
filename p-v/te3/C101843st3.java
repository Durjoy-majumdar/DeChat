package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.st3 */
public class C101843st3 extends C47465a {

    /* renamed from: d */
    public String f299454d;

    /* renamed from: e */
    public String f299455e;

    /* renamed from: f */
    public long f299456f;

    /* renamed from: g */
    public int f299457g;

    /* renamed from: h */
    public int f299458h;

    /* renamed from: i */
    public int f299459i;

    /* renamed from: j */
    public int f299460j;

    /* renamed from: n */
    public int f299461n;

    /* renamed from: o */
    public int f299462o;

    /* renamed from: p */
    public float f299463p;

    /* renamed from: q */
    public float f299464q;

    /* renamed from: r */
    public float f299465r;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101843st3)) {
            return false;
        }
        C101843st3 st32 = (C101843st3) aVar;
        return C46238a.m51546a(this.f299454d, st32.f299454d) && C46238a.m51546a(this.f299455e, st32.f299455e) && C46238a.m51546a(Long.valueOf(this.f299456f), Long.valueOf(st32.f299456f)) && C46238a.m51546a(Integer.valueOf(this.f299457g), Integer.valueOf(st32.f299457g)) && C46238a.m51546a(Integer.valueOf(this.f299458h), Integer.valueOf(st32.f299458h)) && C46238a.m51546a(Integer.valueOf(this.f299459i), Integer.valueOf(st32.f299459i)) && C46238a.m51546a(Integer.valueOf(this.f299460j), Integer.valueOf(st32.f299460j)) && C46238a.m51546a(Integer.valueOf(this.f299461n), Integer.valueOf(st32.f299461n)) && C46238a.m51546a(Integer.valueOf(this.f299462o), Integer.valueOf(st32.f299462o)) && C46238a.m51546a(Float.valueOf(this.f299463p), Float.valueOf(st32.f299463p)) && C46238a.m51546a(Float.valueOf(this.f299464q), Float.valueOf(st32.f299464q)) && C46238a.m51546a(Float.valueOf(this.f299465r), Float.valueOf(st32.f299465r));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f299454d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f299455e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74321h(3, this.f299456f);
            aVar.mo74318e(4, this.f299457g);
            aVar.mo74318e(5, this.f299458h);
            aVar.mo74318e(6, this.f299459i);
            aVar.mo74318e(7, this.f299460j);
            aVar.mo74318e(8, this.f299461n);
            aVar.mo74318e(9, this.f299462o);
            aVar.mo74317d(10, this.f299463p);
            aVar.mo74317d(11, this.f299464q);
            aVar.mo74317d(12, this.f299465r);
            return 0;
        } else if (i == 1) {
            String str3 = this.f299454d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f299455e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            return i2 + C52418a.m58681h(3, this.f299456f) + C52418a.m58678e(4, this.f299457g) + C52418a.m58678e(5, this.f299458h) + C52418a.m58678e(6, this.f299459i) + C52418a.m58678e(7, this.f299460j) + C52418a.m58678e(8, this.f299461n) + C52418a.m58678e(9, this.f299462o) + C52418a.m58677d(10, this.f299463p) + C52418a.m58677d(11, this.f299464q) + C52418a.m58677d(12, this.f299465r);
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
            C101843st3 st32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    st32.f299454d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    st32.f299455e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    st32.f299456f = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    st32.f299457g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    st32.f299458h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    st32.f299459i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    st32.f299460j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    st32.f299461n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    st32.f299462o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    st32.f299463p = aVar3.mo141628f(intValue);
                    return 0;
                case 11:
                    st32.f299464q = aVar3.mo141628f(intValue);
                    return 0;
                case 12:
                    st32.f299465r = aVar3.mo141628f(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
