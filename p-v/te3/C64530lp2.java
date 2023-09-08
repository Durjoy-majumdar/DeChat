package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.lp2 */
public class C64530lp2 extends C47465a {

    /* renamed from: d */
    public int f184130d;

    /* renamed from: e */
    public int f184131e;

    /* renamed from: f */
    public int f184132f;

    /* renamed from: g */
    public int f184133g;

    /* renamed from: h */
    public int f184134h;

    /* renamed from: i */
    public int f184135i;

    /* renamed from: j */
    public int f184136j;

    /* renamed from: n */
    public int f184137n;

    /* renamed from: o */
    public int f184138o;

    /* renamed from: p */
    public boolean f184139p;

    /* renamed from: q */
    public int f184140q;

    /* renamed from: r */
    public int f184141r;

    /* renamed from: s */
    public int f184142s;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64530lp2)) {
            return false;
        }
        C64530lp2 lp22 = (C64530lp2) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f184130d), Integer.valueOf(lp22.f184130d)) && C46238a.m51546a(Integer.valueOf(this.f184131e), Integer.valueOf(lp22.f184131e)) && C46238a.m51546a(Integer.valueOf(this.f184132f), Integer.valueOf(lp22.f184132f)) && C46238a.m51546a(Integer.valueOf(this.f184133g), Integer.valueOf(lp22.f184133g)) && C46238a.m51546a(Integer.valueOf(this.f184134h), Integer.valueOf(lp22.f184134h)) && C46238a.m51546a(Integer.valueOf(this.f184135i), Integer.valueOf(lp22.f184135i)) && C46238a.m51546a(Integer.valueOf(this.f184136j), Integer.valueOf(lp22.f184136j)) && C46238a.m51546a(Integer.valueOf(this.f184137n), Integer.valueOf(lp22.f184137n)) && C46238a.m51546a(Integer.valueOf(this.f184138o), Integer.valueOf(lp22.f184138o)) && C46238a.m51546a(Boolean.valueOf(this.f184139p), Boolean.valueOf(lp22.f184139p)) && C46238a.m51546a(Integer.valueOf(this.f184140q), Integer.valueOf(lp22.f184140q)) && C46238a.m51546a(Integer.valueOf(this.f184141r), Integer.valueOf(lp22.f184141r)) && C46238a.m51546a(Integer.valueOf(this.f184142s), Integer.valueOf(lp22.f184142s));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f184130d);
            aVar.mo74318e(2, this.f184131e);
            aVar.mo74318e(3, this.f184132f);
            aVar.mo74318e(4, this.f184133g);
            aVar.mo74318e(5, this.f184134h);
            aVar.mo74318e(6, this.f184135i);
            aVar.mo74318e(7, this.f184136j);
            aVar.mo74318e(8, this.f184137n);
            aVar.mo74318e(9, this.f184138o);
            aVar.mo74314a(10, this.f184139p);
            aVar.mo74318e(11, this.f184140q);
            aVar.mo74318e(12, this.f184141r);
            aVar.mo74318e(13, this.f184142s);
            return 0;
        } else if (i2 == 1) {
            return C52418a.m58678e(1, this.f184130d) + 0 + C52418a.m58678e(2, this.f184131e) + C52418a.m58678e(3, this.f184132f) + C52418a.m58678e(4, this.f184133g) + C52418a.m58678e(5, this.f184134h) + C52418a.m58678e(6, this.f184135i) + C52418a.m58678e(7, this.f184136j) + C52418a.m58678e(8, this.f184137n) + C52418a.m58678e(9, this.f184138o) + C52418a.m58674a(10, this.f184139p) + C52418a.m58678e(11, this.f184140q) + C52418a.m58678e(12, this.f184141r) + C52418a.m58678e(13, this.f184142s);
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
                C64530lp2 lp22 = objArr[1];
                int intValue = objArr[2].intValue();
                switch (intValue) {
                    case 1:
                        lp22.f184130d = aVar3.mo141629g(intValue);
                        return 0;
                    case 2:
                        lp22.f184131e = aVar3.mo141629g(intValue);
                        return 0;
                    case 3:
                        lp22.f184132f = aVar3.mo141629g(intValue);
                        return 0;
                    case 4:
                        lp22.f184133g = aVar3.mo141629g(intValue);
                        return 0;
                    case 5:
                        lp22.f184134h = aVar3.mo141629g(intValue);
                        return 0;
                    case 6:
                        lp22.f184135i = aVar3.mo141629g(intValue);
                        return 0;
                    case 7:
                        lp22.f184136j = aVar3.mo141629g(intValue);
                        return 0;
                    case 8:
                        lp22.f184137n = aVar3.mo141629g(intValue);
                        return 0;
                    case 9:
                        lp22.f184138o = aVar3.mo141629g(intValue);
                        return 0;
                    case 10:
                        lp22.f184139p = aVar3.mo141625c(intValue);
                        return 0;
                    case 11:
                        lp22.f184140q = aVar3.mo141629g(intValue);
                        return 0;
                    case 12:
                        lp22.f184141r = aVar3.mo141629g(intValue);
                        return 0;
                    case 13:
                        lp22.f184142s = aVar3.mo141629g(intValue);
                        return 0;
                    default:
                        return -1;
                }
            }
        }
    }
}
