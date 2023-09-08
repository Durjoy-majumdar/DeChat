package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.sj0 */
public class C51252sj0 extends C47465a {

    /* renamed from: d */
    public boolean f141546d;

    /* renamed from: e */
    public boolean f141547e;

    /* renamed from: f */
    public boolean f141548f;

    /* renamed from: g */
    public boolean f141549g;

    /* renamed from: h */
    public boolean f141550h;

    /* renamed from: i */
    public boolean f141551i;

    /* renamed from: j */
    public boolean f141552j;

    /* renamed from: n */
    public boolean f141553n;

    /* renamed from: o */
    public int f141554o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51252sj0)) {
            return false;
        }
        C51252sj0 sj02 = (C51252sj0) aVar;
        return C46238a.m51546a(Boolean.valueOf(this.f141546d), Boolean.valueOf(sj02.f141546d)) && C46238a.m51546a(Boolean.valueOf(this.f141547e), Boolean.valueOf(sj02.f141547e)) && C46238a.m51546a(Boolean.valueOf(this.f141548f), Boolean.valueOf(sj02.f141548f)) && C46238a.m51546a(Boolean.valueOf(this.f141549g), Boolean.valueOf(sj02.f141549g)) && C46238a.m51546a(Boolean.valueOf(this.f141550h), Boolean.valueOf(sj02.f141550h)) && C46238a.m51546a(Boolean.valueOf(this.f141551i), Boolean.valueOf(sj02.f141551i)) && C46238a.m51546a(Boolean.valueOf(this.f141552j), Boolean.valueOf(sj02.f141552j)) && C46238a.m51546a(Boolean.valueOf(this.f141553n), Boolean.valueOf(sj02.f141553n)) && C46238a.m51546a(Integer.valueOf(this.f141554o), Integer.valueOf(sj02.f141554o));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74314a(1, this.f141546d);
            aVar.mo74314a(2, this.f141547e);
            aVar.mo74314a(3, this.f141548f);
            aVar.mo74314a(4, this.f141549g);
            aVar.mo74314a(5, this.f141550h);
            aVar.mo74314a(6, this.f141551i);
            aVar.mo74314a(7, this.f141552j);
            aVar.mo74314a(8, this.f141553n);
            aVar.mo74318e(9, this.f141554o);
            return 0;
        } else if (i == 1) {
            return C52418a.m58674a(1, this.f141546d) + 0 + C52418a.m58674a(2, this.f141547e) + C52418a.m58674a(3, this.f141548f) + C52418a.m58674a(4, this.f141549g) + C52418a.m58674a(5, this.f141550h) + C52418a.m58674a(6, this.f141551i) + C52418a.m58674a(7, this.f141552j) + C52418a.m58674a(8, this.f141553n) + C52418a.m58678e(9, this.f141554o);
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
                C51252sj0 sj02 = objArr[1];
                int intValue = objArr[2].intValue();
                switch (intValue) {
                    case 1:
                        sj02.f141546d = aVar3.mo141625c(intValue);
                        return 0;
                    case 2:
                        sj02.f141547e = aVar3.mo141625c(intValue);
                        return 0;
                    case 3:
                        sj02.f141548f = aVar3.mo141625c(intValue);
                        return 0;
                    case 4:
                        sj02.f141549g = aVar3.mo141625c(intValue);
                        return 0;
                    case 5:
                        sj02.f141550h = aVar3.mo141625c(intValue);
                        return 0;
                    case 6:
                        sj02.f141551i = aVar3.mo141625c(intValue);
                        return 0;
                    case 7:
                        sj02.f141552j = aVar3.mo141625c(intValue);
                        return 0;
                    case 8:
                        sj02.f141553n = aVar3.mo141625c(intValue);
                        return 0;
                    case 9:
                        sj02.f141554o = aVar3.mo141629g(intValue);
                        return 0;
                    default:
                        return -1;
                }
            }
        }
    }
}
