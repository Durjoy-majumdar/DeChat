package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.im */
public class C101788im extends C47465a {

    /* renamed from: d */
    public int f298408d;

    /* renamed from: e */
    public int f298409e;

    /* renamed from: f */
    public int f298410f;

    /* renamed from: g */
    public int f298411g;

    /* renamed from: h */
    public int f298412h;

    /* renamed from: i */
    public int f298413i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101788im)) {
            return false;
        }
        C101788im imVar = (C101788im) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f298408d), Integer.valueOf(imVar.f298408d)) && C46238a.m51546a(Integer.valueOf(this.f298409e), Integer.valueOf(imVar.f298409e)) && C46238a.m51546a(Integer.valueOf(this.f298410f), Integer.valueOf(imVar.f298410f)) && C46238a.m51546a(Integer.valueOf(this.f298411g), Integer.valueOf(imVar.f298411g)) && C46238a.m51546a(Integer.valueOf(this.f298412h), Integer.valueOf(imVar.f298412h)) && C46238a.m51546a(Integer.valueOf(this.f298413i), Integer.valueOf(imVar.f298413i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f298408d);
            aVar.mo74318e(2, this.f298409e);
            aVar.mo74318e(3, this.f298410f);
            aVar.mo74318e(4, this.f298411g);
            aVar.mo74318e(5, this.f298412h);
            aVar.mo74318e(6, this.f298413i);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f298408d) + 0 + C52418a.m58678e(2, this.f298409e) + C52418a.m58678e(3, this.f298410f) + C52418a.m58678e(4, this.f298411g) + C52418a.m58678e(5, this.f298412h) + C52418a.m58678e(6, this.f298413i);
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
                C101788im imVar = objArr[1];
                int intValue = objArr[2].intValue();
                switch (intValue) {
                    case 1:
                        imVar.f298408d = aVar3.mo141629g(intValue);
                        return 0;
                    case 2:
                        imVar.f298409e = aVar3.mo141629g(intValue);
                        return 0;
                    case 3:
                        imVar.f298410f = aVar3.mo141629g(intValue);
                        return 0;
                    case 4:
                        imVar.f298411g = aVar3.mo141629g(intValue);
                        return 0;
                    case 5:
                        imVar.f298412h = aVar3.mo141629g(intValue);
                        return 0;
                    case 6:
                        imVar.f298413i = aVar3.mo141629g(intValue);
                        return 0;
                    default:
                        return -1;
                }
            }
        }
    }
}
