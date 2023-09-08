package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.yb3 */
public class C64851yb3 extends C47465a {

    /* renamed from: d */
    public String f186480d;

    /* renamed from: e */
    public int f186481e;

    /* renamed from: f */
    public String f186482f;

    /* renamed from: g */
    public String f186483g;

    /* renamed from: h */
    public String f186484h;

    /* renamed from: i */
    public String f186485i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64851yb3)) {
            return false;
        }
        C64851yb3 yb32 = (C64851yb3) aVar;
        return C46238a.m51546a(this.f186480d, yb32.f186480d) && C46238a.m51546a(Integer.valueOf(this.f186481e), Integer.valueOf(yb32.f186481e)) && C46238a.m51546a(this.f186482f, yb32.f186482f) && C46238a.m51546a(this.f186483g, yb32.f186483g) && C46238a.m51546a(this.f186484h, yb32.f186484h) && C46238a.m51546a(this.f186485i, yb32.f186485i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f186480d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f186481e);
            String str2 = this.f186482f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f186483g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f186484h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f186485i;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            return 0;
        } else if (i == 1) {
            String str6 = this.f186480d;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            int e = i2 + C52418a.m58678e(2, this.f186481e);
            String str7 = this.f186482f;
            if (str7 != null) {
                e += C52418a.m58683j(3, str7);
            }
            String str8 = this.f186483g;
            if (str8 != null) {
                e += C52418a.m58683j(4, str8);
            }
            String str9 = this.f186484h;
            if (str9 != null) {
                e += C52418a.m58683j(5, str9);
            }
            String str10 = this.f186485i;
            return str10 != null ? e + C52418a.m58683j(6, str10) : e;
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
            C64851yb3 yb32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    yb32.f186480d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    yb32.f186481e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    yb32.f186482f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    yb32.f186483g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    yb32.f186484h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    yb32.f186485i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
