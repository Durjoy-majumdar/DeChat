package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.jz */
public class C110966jz extends C47465a {

    /* renamed from: d */
    public int f332114d;

    /* renamed from: e */
    public int f332115e;

    /* renamed from: f */
    public int f332116f;

    /* renamed from: g */
    public int f332117g;

    /* renamed from: h */
    public int f332118h;

    /* renamed from: i */
    public int f332119i;

    /* renamed from: j */
    public int f332120j;

    /* renamed from: n */
    public int f332121n;

    /* renamed from: o */
    public int f332122o;

    /* renamed from: p */
    public int f332123p;

    /* renamed from: q */
    public int f332124q;

    /* renamed from: r */
    public int f332125r;

    /* renamed from: s */
    public int f332126s;

    /* renamed from: t */
    public long f332127t;

    /* renamed from: u */
    public long f332128u;

    /* renamed from: v */
    public int f332129v;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C110966jz)) {
            return false;
        }
        C110966jz jzVar = (C110966jz) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f332114d), Integer.valueOf(jzVar.f332114d)) && C46238a.m51546a(Integer.valueOf(this.f332115e), Integer.valueOf(jzVar.f332115e)) && C46238a.m51546a(Integer.valueOf(this.f332116f), Integer.valueOf(jzVar.f332116f)) && C46238a.m51546a(Integer.valueOf(this.f332117g), Integer.valueOf(jzVar.f332117g)) && C46238a.m51546a(Integer.valueOf(this.f332118h), Integer.valueOf(jzVar.f332118h)) && C46238a.m51546a(Integer.valueOf(this.f332119i), Integer.valueOf(jzVar.f332119i)) && C46238a.m51546a(Integer.valueOf(this.f332120j), Integer.valueOf(jzVar.f332120j)) && C46238a.m51546a(Integer.valueOf(this.f332121n), Integer.valueOf(jzVar.f332121n)) && C46238a.m51546a(Integer.valueOf(this.f332122o), Integer.valueOf(jzVar.f332122o)) && C46238a.m51546a(Integer.valueOf(this.f332123p), Integer.valueOf(jzVar.f332123p)) && C46238a.m51546a(Integer.valueOf(this.f332124q), Integer.valueOf(jzVar.f332124q)) && C46238a.m51546a(Integer.valueOf(this.f332125r), Integer.valueOf(jzVar.f332125r)) && C46238a.m51546a(Integer.valueOf(this.f332126s), Integer.valueOf(jzVar.f332126s)) && C46238a.m51546a(Long.valueOf(this.f332127t), Long.valueOf(jzVar.f332127t)) && C46238a.m51546a(Long.valueOf(this.f332128u), Long.valueOf(jzVar.f332128u)) && C46238a.m51546a(Integer.valueOf(this.f332129v), Integer.valueOf(jzVar.f332129v));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f332114d);
            aVar.mo74318e(2, this.f332115e);
            aVar.mo74318e(3, this.f332116f);
            aVar.mo74318e(4, this.f332117g);
            aVar.mo74318e(5, this.f332118h);
            aVar.mo74318e(6, this.f332119i);
            aVar.mo74318e(7, this.f332120j);
            aVar.mo74318e(8, this.f332121n);
            aVar.mo74318e(9, this.f332122o);
            aVar.mo74318e(10, this.f332123p);
            aVar.mo74318e(11, this.f332124q);
            aVar.mo74318e(12, this.f332125r);
            aVar.mo74318e(13, this.f332126s);
            aVar.mo74321h(14, this.f332127t);
            aVar.mo74321h(15, this.f332128u);
            aVar.mo74318e(16, this.f332129v);
            return 0;
        } else if (i2 == 1) {
            return C52418a.m58678e(1, this.f332114d) + 0 + C52418a.m58678e(2, this.f332115e) + C52418a.m58678e(3, this.f332116f) + C52418a.m58678e(4, this.f332117g) + C52418a.m58678e(5, this.f332118h) + C52418a.m58678e(6, this.f332119i) + C52418a.m58678e(7, this.f332120j) + C52418a.m58678e(8, this.f332121n) + C52418a.m58678e(9, this.f332122o) + C52418a.m58678e(10, this.f332123p) + C52418a.m58678e(11, this.f332124q) + C52418a.m58678e(12, this.f332125r) + C52418a.m58678e(13, this.f332126s) + C52418a.m58681h(14, this.f332127t) + C52418a.m58681h(15, this.f332128u) + C52418a.m58678e(16, this.f332129v);
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
                C110966jz jzVar = objArr[1];
                int intValue = objArr[2].intValue();
                switch (intValue) {
                    case 1:
                        jzVar.f332114d = aVar3.mo141629g(intValue);
                        return 0;
                    case 2:
                        jzVar.f332115e = aVar3.mo141629g(intValue);
                        return 0;
                    case 3:
                        jzVar.f332116f = aVar3.mo141629g(intValue);
                        return 0;
                    case 4:
                        jzVar.f332117g = aVar3.mo141629g(intValue);
                        return 0;
                    case 5:
                        jzVar.f332118h = aVar3.mo141629g(intValue);
                        return 0;
                    case 6:
                        jzVar.f332119i = aVar3.mo141629g(intValue);
                        return 0;
                    case 7:
                        jzVar.f332120j = aVar3.mo141629g(intValue);
                        return 0;
                    case 8:
                        jzVar.f332121n = aVar3.mo141629g(intValue);
                        return 0;
                    case 9:
                        jzVar.f332122o = aVar3.mo141629g(intValue);
                        return 0;
                    case 10:
                        jzVar.f332123p = aVar3.mo141629g(intValue);
                        return 0;
                    case 11:
                        jzVar.f332124q = aVar3.mo141629g(intValue);
                        return 0;
                    case 12:
                        jzVar.f332125r = aVar3.mo141629g(intValue);
                        return 0;
                    case 13:
                        jzVar.f332126s = aVar3.mo141629g(intValue);
                        return 0;
                    case 14:
                        jzVar.f332127t = aVar3.mo141631i(intValue);
                        return 0;
                    case 15:
                        jzVar.f332128u = aVar3.mo141631i(intValue);
                        return 0;
                    case 16:
                        jzVar.f332129v = aVar3.mo141629g(intValue);
                        return 0;
                    default:
                        return -1;
                }
            }
        }
    }
}
