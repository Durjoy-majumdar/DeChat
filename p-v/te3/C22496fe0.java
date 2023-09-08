package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.fe0 */
public class C22496fe0 extends C47465a {

    /* renamed from: d */
    public boolean f63803d;

    /* renamed from: e */
    public boolean f63804e;

    /* renamed from: f */
    public boolean f63805f;

    /* renamed from: g */
    public boolean f63806g;

    /* renamed from: h */
    public boolean f63807h;

    /* renamed from: i */
    public boolean f63808i;

    /* renamed from: j */
    public boolean f63809j;

    /* renamed from: n */
    public boolean f63810n;

    /* renamed from: o */
    public boolean f63811o;

    /* renamed from: p */
    public boolean f63812p;

    /* renamed from: q */
    public boolean f63813q;

    /* renamed from: r */
    public boolean f63814r;

    /* renamed from: s */
    public boolean f63815s;

    /* renamed from: t */
    public boolean f63816t;

    /* renamed from: u */
    public boolean f63817u;

    /* renamed from: v */
    public boolean f63818v;

    /* renamed from: w */
    public boolean f63819w;

    /* renamed from: x */
    public boolean f63820x;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C22496fe0)) {
            return false;
        }
        C22496fe0 fe02 = (C22496fe0) aVar;
        return C46238a.m51546a(Boolean.valueOf(this.f63803d), Boolean.valueOf(fe02.f63803d)) && C46238a.m51546a(Boolean.valueOf(this.f63804e), Boolean.valueOf(fe02.f63804e)) && C46238a.m51546a(Boolean.valueOf(this.f63805f), Boolean.valueOf(fe02.f63805f)) && C46238a.m51546a(Boolean.valueOf(this.f63806g), Boolean.valueOf(fe02.f63806g)) && C46238a.m51546a(Boolean.valueOf(this.f63807h), Boolean.valueOf(fe02.f63807h)) && C46238a.m51546a(Boolean.valueOf(this.f63808i), Boolean.valueOf(fe02.f63808i)) && C46238a.m51546a(Boolean.valueOf(this.f63809j), Boolean.valueOf(fe02.f63809j)) && C46238a.m51546a(Boolean.valueOf(this.f63810n), Boolean.valueOf(fe02.f63810n)) && C46238a.m51546a(Boolean.valueOf(this.f63811o), Boolean.valueOf(fe02.f63811o)) && C46238a.m51546a(Boolean.valueOf(this.f63812p), Boolean.valueOf(fe02.f63812p)) && C46238a.m51546a(Boolean.valueOf(this.f63813q), Boolean.valueOf(fe02.f63813q)) && C46238a.m51546a(Boolean.valueOf(this.f63814r), Boolean.valueOf(fe02.f63814r)) && C46238a.m51546a(Boolean.valueOf(this.f63815s), Boolean.valueOf(fe02.f63815s)) && C46238a.m51546a(Boolean.valueOf(this.f63816t), Boolean.valueOf(fe02.f63816t)) && C46238a.m51546a(Boolean.valueOf(this.f63817u), Boolean.valueOf(fe02.f63817u)) && C46238a.m51546a(Boolean.valueOf(this.f63818v), Boolean.valueOf(fe02.f63818v)) && C46238a.m51546a(Boolean.valueOf(this.f63819w), Boolean.valueOf(fe02.f63819w)) && C46238a.m51546a(Boolean.valueOf(this.f63820x), Boolean.valueOf(fe02.f63820x));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74314a(1, this.f63803d);
            aVar.mo74314a(2, this.f63804e);
            aVar.mo74314a(3, this.f63805f);
            aVar.mo74314a(4, this.f63806g);
            aVar.mo74314a(5, this.f63807h);
            aVar.mo74314a(6, this.f63808i);
            aVar.mo74314a(7, this.f63809j);
            aVar.mo74314a(8, this.f63810n);
            aVar.mo74314a(9, this.f63811o);
            aVar.mo74314a(10, this.f63812p);
            aVar.mo74314a(11, this.f63813q);
            aVar.mo74314a(12, this.f63814r);
            aVar.mo74314a(13, this.f63815s);
            aVar.mo74314a(14, this.f63816t);
            aVar.mo74314a(15, this.f63817u);
            aVar.mo74314a(16, this.f63818v);
            aVar.mo74314a(17, this.f63819w);
            aVar.mo74314a(18, this.f63820x);
            return 0;
        } else if (i2 == 1) {
            return C52418a.m58674a(1, this.f63803d) + 0 + C52418a.m58674a(2, this.f63804e) + C52418a.m58674a(3, this.f63805f) + C52418a.m58674a(4, this.f63806g) + C52418a.m58674a(5, this.f63807h) + C52418a.m58674a(6, this.f63808i) + C52418a.m58674a(7, this.f63809j) + C52418a.m58674a(8, this.f63810n) + C52418a.m58674a(9, this.f63811o) + C52418a.m58674a(10, this.f63812p) + C52418a.m58674a(11, this.f63813q) + C52418a.m58674a(12, this.f63814r) + C52418a.m58674a(13, this.f63815s) + C52418a.m58674a(14, this.f63816t) + C52418a.m58674a(15, this.f63817u) + C52418a.m58674a(16, this.f63818v) + C52418a.m58674a(17, this.f63819w) + C52418a.m58674a(18, this.f63820x);
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
                C22496fe0 fe02 = objArr[1];
                int intValue = objArr[2].intValue();
                switch (intValue) {
                    case 1:
                        fe02.f63803d = aVar3.mo141625c(intValue);
                        return 0;
                    case 2:
                        fe02.f63804e = aVar3.mo141625c(intValue);
                        return 0;
                    case 3:
                        fe02.f63805f = aVar3.mo141625c(intValue);
                        return 0;
                    case 4:
                        fe02.f63806g = aVar3.mo141625c(intValue);
                        return 0;
                    case 5:
                        fe02.f63807h = aVar3.mo141625c(intValue);
                        return 0;
                    case 6:
                        fe02.f63808i = aVar3.mo141625c(intValue);
                        return 0;
                    case 7:
                        fe02.f63809j = aVar3.mo141625c(intValue);
                        return 0;
                    case 8:
                        fe02.f63810n = aVar3.mo141625c(intValue);
                        return 0;
                    case 9:
                        fe02.f63811o = aVar3.mo141625c(intValue);
                        return 0;
                    case 10:
                        fe02.f63812p = aVar3.mo141625c(intValue);
                        return 0;
                    case 11:
                        fe02.f63813q = aVar3.mo141625c(intValue);
                        return 0;
                    case 12:
                        fe02.f63814r = aVar3.mo141625c(intValue);
                        return 0;
                    case 13:
                        fe02.f63815s = aVar3.mo141625c(intValue);
                        return 0;
                    case 14:
                        fe02.f63816t = aVar3.mo141625c(intValue);
                        return 0;
                    case 15:
                        fe02.f63817u = aVar3.mo141625c(intValue);
                        return 0;
                    case 16:
                        fe02.f63818v = aVar3.mo141625c(intValue);
                        return 0;
                    case 17:
                        fe02.f63819w = aVar3.mo141625c(intValue);
                        return 0;
                    case 18:
                        fe02.f63820x = aVar3.mo141625c(intValue);
                        return 0;
                    default:
                        return -1;
                }
            }
        }
    }
}
