package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.js */
public class C101797js extends C47465a {

    /* renamed from: d */
    public String f298555d;

    /* renamed from: e */
    public double f298556e;

    /* renamed from: f */
    public double f298557f;

    /* renamed from: g */
    public double f298558g;

    /* renamed from: h */
    public double f298559h;

    /* renamed from: i */
    public double f298560i;

    /* renamed from: j */
    public int f298561j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101797js)) {
            return false;
        }
        C101797js jsVar = (C101797js) aVar;
        return C46238a.m51546a(this.f298555d, jsVar.f298555d) && C46238a.m51546a(Double.valueOf(this.f298556e), Double.valueOf(jsVar.f298556e)) && C46238a.m51546a(Double.valueOf(this.f298557f), Double.valueOf(jsVar.f298557f)) && C46238a.m51546a(Double.valueOf(this.f298558g), Double.valueOf(jsVar.f298558g)) && C46238a.m51546a(Double.valueOf(this.f298559h), Double.valueOf(jsVar.f298559h)) && C46238a.m51546a(Double.valueOf(this.f298560i), Double.valueOf(jsVar.f298560i)) && C46238a.m51546a(Integer.valueOf(this.f298561j), Integer.valueOf(jsVar.f298561j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f298555d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74316c(2, this.f298556e);
            aVar.mo74316c(3, this.f298557f);
            aVar.mo74316c(4, this.f298558g);
            aVar.mo74316c(5, this.f298559h);
            aVar.mo74316c(6, this.f298560i);
            aVar.mo74318e(7, this.f298561j);
            return 0;
        } else if (i == 1) {
            String str2 = this.f298555d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58676c(2, this.f298556e) + C52418a.m58676c(3, this.f298557f) + C52418a.m58676c(4, this.f298558g) + C52418a.m58676c(5, this.f298559h) + C52418a.m58676c(6, this.f298560i) + C52418a.m58678e(7, this.f298561j);
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
            C101797js jsVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    jsVar.f298555d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    jsVar.f298556e = aVar3.mo141627e(intValue);
                    return 0;
                case 3:
                    jsVar.f298557f = aVar3.mo141627e(intValue);
                    return 0;
                case 4:
                    jsVar.f298558g = aVar3.mo141627e(intValue);
                    return 0;
                case 5:
                    jsVar.f298559h = aVar3.mo141627e(intValue);
                    return 0;
                case 6:
                    jsVar.f298560i = aVar3.mo141627e(intValue);
                    return 0;
                case 7:
                    jsVar.f298561j = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
