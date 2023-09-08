package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.s21 */
public class C64693s21 extends C47465a {

    /* renamed from: d */
    public String f185309d;

    /* renamed from: e */
    public String f185310e;

    /* renamed from: f */
    public int f185311f;

    /* renamed from: g */
    public int f185312g;

    /* renamed from: h */
    public String f185313h;

    /* renamed from: i */
    public int f185314i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64693s21)) {
            return false;
        }
        C64693s21 s212 = (C64693s21) aVar;
        return C46238a.m51546a(this.f185309d, s212.f185309d) && C46238a.m51546a(this.f185310e, s212.f185310e) && C46238a.m51546a(Integer.valueOf(this.f185311f), Integer.valueOf(s212.f185311f)) && C46238a.m51546a(Integer.valueOf(this.f185312g), Integer.valueOf(s212.f185312g)) && C46238a.m51546a(this.f185313h, s212.f185313h) && C46238a.m51546a(Integer.valueOf(this.f185314i), Integer.valueOf(s212.f185314i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f185309d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f185310e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f185311f);
            aVar.mo74318e(4, this.f185312g);
            String str3 = this.f185313h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            aVar.mo74318e(6, this.f185314i);
            return 0;
        } else if (i == 1) {
            String str4 = this.f185309d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f185310e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            int e = i2 + C52418a.m58678e(3, this.f185311f) + C52418a.m58678e(4, this.f185312g);
            String str6 = this.f185313h;
            if (str6 != null) {
                e += C52418a.m58683j(5, str6);
            }
            return e + C52418a.m58678e(6, this.f185314i);
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
            C64693s21 s212 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    s212.f185309d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    s212.f185310e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    s212.f185311f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    s212.f185312g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    s212.f185313h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    s212.f185314i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
