package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.vy */
public class C51754vy extends C47465a {

    /* renamed from: d */
    public String f143760d;

    /* renamed from: e */
    public int f143761e;

    /* renamed from: f */
    public String f143762f;

    /* renamed from: g */
    public String f143763g;

    /* renamed from: h */
    public String f143764h;

    /* renamed from: i */
    public String f143765i;

    /* renamed from: j */
    public int f143766j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51754vy)) {
            return false;
        }
        C51754vy vyVar = (C51754vy) aVar;
        return C46238a.m51546a(this.f143760d, vyVar.f143760d) && C46238a.m51546a(Integer.valueOf(this.f143761e), Integer.valueOf(vyVar.f143761e)) && C46238a.m51546a(this.f143762f, vyVar.f143762f) && C46238a.m51546a(this.f143763g, vyVar.f143763g) && C46238a.m51546a(this.f143764h, vyVar.f143764h) && C46238a.m51546a(this.f143765i, vyVar.f143765i) && C46238a.m51546a(Integer.valueOf(this.f143766j), Integer.valueOf(vyVar.f143766j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f143760d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f143761e);
            String str2 = this.f143762f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f143763g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f143764h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f143765i;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            aVar.mo74318e(7, this.f143766j);
            return 0;
        } else if (i == 1) {
            String str6 = this.f143760d;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            int e = i2 + C52418a.m58678e(2, this.f143761e);
            String str7 = this.f143762f;
            if (str7 != null) {
                e += C52418a.m58683j(3, str7);
            }
            String str8 = this.f143763g;
            if (str8 != null) {
                e += C52418a.m58683j(4, str8);
            }
            String str9 = this.f143764h;
            if (str9 != null) {
                e += C52418a.m58683j(5, str9);
            }
            String str10 = this.f143765i;
            if (str10 != null) {
                e += C52418a.m58683j(6, str10);
            }
            return e + C52418a.m58678e(7, this.f143766j);
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
            C51754vy vyVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    vyVar.f143760d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    vyVar.f143761e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    vyVar.f143762f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    vyVar.f143763g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    vyVar.f143764h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    vyVar.f143765i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    vyVar.f143766j = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
