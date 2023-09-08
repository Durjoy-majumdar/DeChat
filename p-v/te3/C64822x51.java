package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.x51 */
public class C64822x51 extends C47465a {

    /* renamed from: d */
    public int f186254d;

    /* renamed from: e */
    public boolean f186255e;

    /* renamed from: f */
    public C89349b f186256f;

    /* renamed from: g */
    public int f186257g;

    /* renamed from: h */
    public long f186258h;

    /* renamed from: i */
    public String f186259i;

    /* renamed from: j */
    public C89349b f186260j;

    /* renamed from: n */
    public int f186261n;

    /* renamed from: o */
    public int f186262o;

    /* renamed from: p */
    public int f186263p;

    /* renamed from: q */
    public int f186264q;

    /* renamed from: r */
    public boolean f186265r;

    /* renamed from: s */
    public boolean f186266s;

    /* renamed from: t */
    public String f186267t;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64822x51)) {
            return false;
        }
        C64822x51 x512 = (C64822x51) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f186254d), Integer.valueOf(x512.f186254d)) && C46238a.m51546a(Boolean.valueOf(this.f186255e), Boolean.valueOf(x512.f186255e)) && C46238a.m51546a(this.f186256f, x512.f186256f) && C46238a.m51546a(Integer.valueOf(this.f186257g), Integer.valueOf(x512.f186257g)) && C46238a.m51546a(Long.valueOf(this.f186258h), Long.valueOf(x512.f186258h)) && C46238a.m51546a(this.f186259i, x512.f186259i) && C46238a.m51546a(this.f186260j, x512.f186260j) && C46238a.m51546a(Integer.valueOf(this.f186261n), Integer.valueOf(x512.f186261n)) && C46238a.m51546a(Integer.valueOf(this.f186262o), Integer.valueOf(x512.f186262o)) && C46238a.m51546a(Integer.valueOf(this.f186263p), Integer.valueOf(x512.f186263p)) && C46238a.m51546a(Integer.valueOf(this.f186264q), Integer.valueOf(x512.f186264q)) && C46238a.m51546a(Boolean.valueOf(this.f186265r), Boolean.valueOf(x512.f186265r)) && C46238a.m51546a(Boolean.valueOf(this.f186266s), Boolean.valueOf(x512.f186266s)) && C46238a.m51546a(this.f186267t, x512.f186267t);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f186254d);
            aVar.mo74314a(2, this.f186255e);
            C89349b bVar = this.f186256f;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            aVar.mo74318e(4, this.f186257g);
            aVar.mo74321h(5, this.f186258h);
            String str = this.f186259i;
            if (str != null) {
                aVar.mo74323j(6, str);
            }
            C89349b bVar2 = this.f186260j;
            if (bVar2 != null) {
                aVar.mo74315b(7, bVar2);
            }
            aVar.mo74318e(8, this.f186261n);
            aVar.mo74318e(9, this.f186262o);
            aVar.mo74318e(10, this.f186263p);
            aVar.mo74318e(11, this.f186264q);
            aVar.mo74314a(14, this.f186265r);
            aVar.mo74314a(15, this.f186266s);
            String str2 = this.f186267t;
            if (str2 != null) {
                aVar.mo74323j(16, str2);
            }
            return 0;
        } else if (i2 == 1) {
            int e = C52418a.m58678e(1, this.f186254d) + 0 + C52418a.m58674a(2, this.f186255e);
            C89349b bVar3 = this.f186256f;
            if (bVar3 != null) {
                e += C52418a.m58675b(3, bVar3);
            }
            int e2 = e + C52418a.m58678e(4, this.f186257g) + C52418a.m58681h(5, this.f186258h);
            String str3 = this.f186259i;
            if (str3 != null) {
                e2 += C52418a.m58683j(6, str3);
            }
            C89349b bVar4 = this.f186260j;
            if (bVar4 != null) {
                e2 += C52418a.m58675b(7, bVar4);
            }
            int e3 = e2 + C52418a.m58678e(8, this.f186261n) + C52418a.m58678e(9, this.f186262o) + C52418a.m58678e(10, this.f186263p) + C52418a.m58678e(11, this.f186264q) + C52418a.m58674a(14, this.f186265r) + C52418a.m58674a(15, this.f186266s);
            String str4 = this.f186267t;
            return str4 != null ? e3 + C52418a.m58683j(16, str4) : e3;
        } else if (i2 == 2) {
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
            C64822x51 x512 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    x512.f186254d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    x512.f186255e = aVar3.mo141625c(intValue);
                    return 0;
                case 3:
                    x512.f186256f = aVar3.mo141626d(intValue);
                    return 0;
                case 4:
                    x512.f186257g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    x512.f186258h = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    x512.f186259i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    x512.f186260j = aVar3.mo141626d(intValue);
                    return 0;
                case 8:
                    x512.f186261n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    x512.f186262o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    x512.f186263p = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    x512.f186264q = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    x512.f186265r = aVar3.mo141625c(intValue);
                    return 0;
                case 15:
                    x512.f186266s = aVar3.mo141625c(intValue);
                    return 0;
                case 16:
                    x512.f186267t = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
