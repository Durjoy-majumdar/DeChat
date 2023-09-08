package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.lq0 */
public class C50296lq0 extends C47465a {

    /* renamed from: d */
    public String f137576d;

    /* renamed from: e */
    public int f137577e;

    /* renamed from: f */
    public int f137578f;

    /* renamed from: g */
    public String f137579g;

    /* renamed from: h */
    public int f137580h;

    /* renamed from: i */
    public float f137581i;

    /* renamed from: j */
    public int f137582j;

    /* renamed from: n */
    public int f137583n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50296lq0)) {
            return false;
        }
        C50296lq0 lq02 = (C50296lq0) aVar;
        return C46238a.m51546a(this.f137576d, lq02.f137576d) && C46238a.m51546a(Integer.valueOf(this.f137577e), Integer.valueOf(lq02.f137577e)) && C46238a.m51546a(Integer.valueOf(this.f137578f), Integer.valueOf(lq02.f137578f)) && C46238a.m51546a(this.f137579g, lq02.f137579g) && C46238a.m51546a(Integer.valueOf(this.f137580h), Integer.valueOf(lq02.f137580h)) && C46238a.m51546a(Float.valueOf(this.f137581i), Float.valueOf(lq02.f137581i)) && C46238a.m51546a(Integer.valueOf(this.f137582j), Integer.valueOf(lq02.f137582j)) && C46238a.m51546a(Integer.valueOf(this.f137583n), Integer.valueOf(lq02.f137583n));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f137576d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f137577e);
            aVar.mo74318e(3, this.f137578f);
            String str2 = this.f137579g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            aVar.mo74318e(5, this.f137580h);
            aVar.mo74317d(6, this.f137581i);
            aVar.mo74318e(7, this.f137582j);
            aVar.mo74318e(8, this.f137583n);
            return 0;
        } else if (i == 1) {
            String str3 = this.f137576d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            int e = i2 + C52418a.m58678e(2, this.f137577e) + C52418a.m58678e(3, this.f137578f);
            String str4 = this.f137579g;
            if (str4 != null) {
                e += C52418a.m58683j(4, str4);
            }
            return e + C52418a.m58678e(5, this.f137580h) + C52418a.m58677d(6, this.f137581i) + C52418a.m58678e(7, this.f137582j) + C52418a.m58678e(8, this.f137583n);
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
            C50296lq0 lq02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    lq02.f137576d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    lq02.f137577e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    lq02.f137578f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    lq02.f137579g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    lq02.f137580h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    lq02.f137581i = aVar3.mo141628f(intValue);
                    return 0;
                case 7:
                    lq02.f137582j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    lq02.f137583n = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
