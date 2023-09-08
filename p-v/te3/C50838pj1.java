package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.pj1 */
public class C50838pj1 extends C47465a {

    /* renamed from: d */
    public int f139783d;

    /* renamed from: e */
    public int f139784e;

    /* renamed from: f */
    public int f139785f;

    /* renamed from: g */
    public int f139786g;

    /* renamed from: h */
    public int f139787h;

    /* renamed from: i */
    public int f139788i;

    /* renamed from: j */
    public boolean f139789j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50838pj1)) {
            return false;
        }
        C50838pj1 pj12 = (C50838pj1) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f139783d), Integer.valueOf(pj12.f139783d)) && C46238a.m51546a(Integer.valueOf(this.f139784e), Integer.valueOf(pj12.f139784e)) && C46238a.m51546a(Integer.valueOf(this.f139785f), Integer.valueOf(pj12.f139785f)) && C46238a.m51546a(Integer.valueOf(this.f139786g), Integer.valueOf(pj12.f139786g)) && C46238a.m51546a(Integer.valueOf(this.f139787h), Integer.valueOf(pj12.f139787h)) && C46238a.m51546a(Integer.valueOf(this.f139788i), Integer.valueOf(pj12.f139788i)) && C46238a.m51546a(Boolean.valueOf(this.f139789j), Boolean.valueOf(pj12.f139789j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f139783d);
            aVar.mo74318e(2, this.f139784e);
            aVar.mo74318e(3, this.f139785f);
            aVar.mo74318e(4, this.f139786g);
            aVar.mo74318e(5, this.f139787h);
            aVar.mo74318e(6, this.f139788i);
            aVar.mo74314a(7, this.f139789j);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f139783d) + 0 + C52418a.m58678e(2, this.f139784e) + C52418a.m58678e(3, this.f139785f) + C52418a.m58678e(4, this.f139786g) + C52418a.m58678e(5, this.f139787h) + C52418a.m58678e(6, this.f139788i) + C52418a.m58674a(7, this.f139789j);
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
                C50838pj1 pj12 = objArr[1];
                int intValue = objArr[2].intValue();
                switch (intValue) {
                    case 1:
                        pj12.f139783d = aVar3.mo141629g(intValue);
                        return 0;
                    case 2:
                        pj12.f139784e = aVar3.mo141629g(intValue);
                        return 0;
                    case 3:
                        pj12.f139785f = aVar3.mo141629g(intValue);
                        return 0;
                    case 4:
                        pj12.f139786g = aVar3.mo141629g(intValue);
                        return 0;
                    case 5:
                        pj12.f139787h = aVar3.mo141629g(intValue);
                        return 0;
                    case 6:
                        pj12.f139788i = aVar3.mo141629g(intValue);
                        return 0;
                    case 7:
                        pj12.f139789j = aVar3.mo141625c(intValue);
                        return 0;
                    default:
                        return -1;
                }
            }
        }
    }
}
