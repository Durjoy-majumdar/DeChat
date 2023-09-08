package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.am1 */
public class C48736am1 extends C47465a {

    /* renamed from: d */
    public boolean f130629d;

    /* renamed from: e */
    public boolean f130630e;

    /* renamed from: f */
    public boolean f130631f;

    /* renamed from: g */
    public boolean f130632g;

    /* renamed from: h */
    public int f130633h;

    /* renamed from: i */
    public int f130634i;

    /* renamed from: j */
    public int f130635j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48736am1)) {
            return false;
        }
        C48736am1 am12 = (C48736am1) aVar;
        return C46238a.m51546a(Boolean.valueOf(this.f130629d), Boolean.valueOf(am12.f130629d)) && C46238a.m51546a(Boolean.valueOf(this.f130630e), Boolean.valueOf(am12.f130630e)) && C46238a.m51546a(Boolean.valueOf(this.f130631f), Boolean.valueOf(am12.f130631f)) && C46238a.m51546a(Boolean.valueOf(this.f130632g), Boolean.valueOf(am12.f130632g)) && C46238a.m51546a(Integer.valueOf(this.f130633h), Integer.valueOf(am12.f130633h)) && C46238a.m51546a(Integer.valueOf(this.f130634i), Integer.valueOf(am12.f130634i)) && C46238a.m51546a(Integer.valueOf(this.f130635j), Integer.valueOf(am12.f130635j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74314a(1, this.f130629d);
            aVar.mo74314a(2, this.f130630e);
            aVar.mo74314a(3, this.f130631f);
            aVar.mo74314a(4, this.f130632g);
            aVar.mo74318e(5, this.f130633h);
            aVar.mo74318e(6, this.f130634i);
            aVar.mo74318e(7, this.f130635j);
            return 0;
        } else if (i == 1) {
            return C52418a.m58674a(1, this.f130629d) + 0 + C52418a.m58674a(2, this.f130630e) + C52418a.m58674a(3, this.f130631f) + C52418a.m58674a(4, this.f130632g) + C52418a.m58678e(5, this.f130633h) + C52418a.m58678e(6, this.f130634i) + C52418a.m58678e(7, this.f130635j);
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
                C48736am1 am12 = objArr[1];
                int intValue = objArr[2].intValue();
                switch (intValue) {
                    case 1:
                        am12.f130629d = aVar3.mo141625c(intValue);
                        return 0;
                    case 2:
                        am12.f130630e = aVar3.mo141625c(intValue);
                        return 0;
                    case 3:
                        am12.f130631f = aVar3.mo141625c(intValue);
                        return 0;
                    case 4:
                        am12.f130632g = aVar3.mo141625c(intValue);
                        return 0;
                    case 5:
                        am12.f130633h = aVar3.mo141629g(intValue);
                        return 0;
                    case 6:
                        am12.f130634i = aVar3.mo141629g(intValue);
                        return 0;
                    case 7:
                        am12.f130635j = aVar3.mo141629g(intValue);
                        return 0;
                    default:
                        return -1;
                }
            }
        }
    }
}
