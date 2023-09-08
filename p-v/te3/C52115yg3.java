package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.yg3 */
public class C52115yg3 extends C47465a {

    /* renamed from: d */
    public int f145278d;

    /* renamed from: e */
    public String f145279e;

    /* renamed from: f */
    public int f145280f;

    /* renamed from: g */
    public int f145281g;

    /* renamed from: h */
    public int f145282h;

    /* renamed from: i */
    public int f145283i;

    /* renamed from: j */
    public int f145284j;

    /* renamed from: n */
    public String f145285n = "";

    /* renamed from: o */
    public boolean f145286o;

    /* renamed from: p */
    public boolean f145287p;

    /* renamed from: q */
    public boolean f145288q;

    /* renamed from: r */
    public boolean f145289r;

    /* renamed from: s */
    public boolean f145290s;

    /* renamed from: t */
    public boolean f145291t;

    /* renamed from: u */
    public boolean f145292u;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52115yg3)) {
            return false;
        }
        C52115yg3 yg32 = (C52115yg3) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f145278d), Integer.valueOf(yg32.f145278d)) && C46238a.m51546a(this.f145279e, yg32.f145279e) && C46238a.m51546a(Integer.valueOf(this.f145280f), Integer.valueOf(yg32.f145280f)) && C46238a.m51546a(Integer.valueOf(this.f145281g), Integer.valueOf(yg32.f145281g)) && C46238a.m51546a(Integer.valueOf(this.f145282h), Integer.valueOf(yg32.f145282h)) && C46238a.m51546a(Integer.valueOf(this.f145283i), Integer.valueOf(yg32.f145283i)) && C46238a.m51546a(Integer.valueOf(this.f145284j), Integer.valueOf(yg32.f145284j)) && C46238a.m51546a(this.f145285n, yg32.f145285n) && C46238a.m51546a(Boolean.valueOf(this.f145286o), Boolean.valueOf(yg32.f145286o)) && C46238a.m51546a(Boolean.valueOf(this.f145287p), Boolean.valueOf(yg32.f145287p)) && C46238a.m51546a(Boolean.valueOf(this.f145288q), Boolean.valueOf(yg32.f145288q)) && C46238a.m51546a(Boolean.valueOf(this.f145289r), Boolean.valueOf(yg32.f145289r)) && C46238a.m51546a(Boolean.valueOf(this.f145290s), Boolean.valueOf(yg32.f145290s)) && C46238a.m51546a(Boolean.valueOf(this.f145291t), Boolean.valueOf(yg32.f145291t)) && C46238a.m51546a(Boolean.valueOf(this.f145292u), Boolean.valueOf(yg32.f145292u));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            if (this.f145279e == null) {
                throw new C52419b("Not all required fields were included: url");
            } else if (this.f145285n != null) {
                aVar.mo74318e(1, this.f145278d);
                String str = this.f145279e;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                aVar.mo74318e(3, this.f145280f);
                aVar.mo74318e(4, this.f145281g);
                aVar.mo74318e(5, this.f145282h);
                aVar.mo74318e(6, this.f145283i);
                aVar.mo74318e(7, this.f145284j);
                String str2 = this.f145285n;
                if (str2 != null) {
                    aVar.mo74323j(8, str2);
                }
                aVar.mo74314a(9, this.f145286o);
                aVar.mo74314a(10, this.f145287p);
                aVar.mo74314a(11, this.f145288q);
                aVar.mo74314a(12, this.f145289r);
                aVar.mo74314a(13, this.f145290s);
                aVar.mo74314a(14, this.f145291t);
                aVar.mo74314a(15, this.f145292u);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: uid");
            }
        } else if (i2 == 1) {
            int e = C52418a.m58678e(1, this.f145278d) + 0;
            String str3 = this.f145279e;
            if (str3 != null) {
                e += C52418a.m58683j(2, str3);
            }
            int e2 = e + C52418a.m58678e(3, this.f145280f) + C52418a.m58678e(4, this.f145281g) + C52418a.m58678e(5, this.f145282h) + C52418a.m58678e(6, this.f145283i) + C52418a.m58678e(7, this.f145284j);
            String str4 = this.f145285n;
            if (str4 != null) {
                e2 += C52418a.m58683j(8, str4);
            }
            return e2 + C52418a.m58674a(9, this.f145286o) + C52418a.m58674a(10, this.f145287p) + C52418a.m58674a(11, this.f145288q) + C52418a.m58674a(12, this.f145289r) + C52418a.m58674a(13, this.f145290s) + C52418a.m58674a(14, this.f145291t) + C52418a.m58674a(15, this.f145292u);
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f145279e == null) {
                throw new C52419b("Not all required fields were included: url");
            } else if (this.f145285n != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: uid");
            }
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C52115yg3 yg32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    yg32.f145278d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    yg32.f145279e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    yg32.f145280f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    yg32.f145281g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    yg32.f145282h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    yg32.f145283i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    yg32.f145284j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    yg32.f145285n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    yg32.f145286o = aVar3.mo141625c(intValue);
                    return 0;
                case 10:
                    yg32.f145287p = aVar3.mo141625c(intValue);
                    return 0;
                case 11:
                    yg32.f145288q = aVar3.mo141625c(intValue);
                    return 0;
                case 12:
                    yg32.f145289r = aVar3.mo141625c(intValue);
                    return 0;
                case 13:
                    yg32.f145290s = aVar3.mo141625c(intValue);
                    return 0;
                case 14:
                    yg32.f145291t = aVar3.mo141625c(intValue);
                    return 0;
                case 15:
                    yg32.f145292u = aVar3.mo141625c(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
