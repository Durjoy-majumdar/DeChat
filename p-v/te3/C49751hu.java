package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.hu */
public class C49751hu extends C47465a {

    /* renamed from: d */
    public int f134875d;

    /* renamed from: e */
    public int f134876e;

    /* renamed from: f */
    public String f134877f;

    /* renamed from: g */
    public String f134878g;

    /* renamed from: h */
    public String f134879h;

    /* renamed from: i */
    public String f134880i;

    /* renamed from: j */
    public String f134881j;

    /* renamed from: n */
    public String f134882n;

    /* renamed from: o */
    public String f134883o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49751hu)) {
            return false;
        }
        C49751hu huVar = (C49751hu) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f134875d), Integer.valueOf(huVar.f134875d)) && C46238a.m51546a(Integer.valueOf(this.f134876e), Integer.valueOf(huVar.f134876e)) && C46238a.m51546a(this.f134877f, huVar.f134877f) && C46238a.m51546a(this.f134878g, huVar.f134878g) && C46238a.m51546a(this.f134879h, huVar.f134879h) && C46238a.m51546a(this.f134880i, huVar.f134880i) && C46238a.m51546a(this.f134881j, huVar.f134881j) && C46238a.m51546a(this.f134882n, huVar.f134882n) && C46238a.m51546a(this.f134883o, huVar.f134883o);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f134875d);
            aVar.mo74318e(2, this.f134876e);
            String str = this.f134877f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f134878g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f134879h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            String str4 = this.f134880i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            String str5 = this.f134881j;
            if (str5 != null) {
                aVar.mo74323j(7, str5);
            }
            String str6 = this.f134882n;
            if (str6 != null) {
                aVar.mo74323j(8, str6);
            }
            String str7 = this.f134883o;
            if (str7 != null) {
                aVar.mo74323j(9, str7);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f134875d) + 0 + C52418a.m58678e(2, this.f134876e);
            String str8 = this.f134877f;
            if (str8 != null) {
                e += C52418a.m58683j(3, str8);
            }
            String str9 = this.f134878g;
            if (str9 != null) {
                e += C52418a.m58683j(4, str9);
            }
            String str10 = this.f134879h;
            if (str10 != null) {
                e += C52418a.m58683j(5, str10);
            }
            String str11 = this.f134880i;
            if (str11 != null) {
                e += C52418a.m58683j(6, str11);
            }
            String str12 = this.f134881j;
            if (str12 != null) {
                e += C52418a.m58683j(7, str12);
            }
            String str13 = this.f134882n;
            if (str13 != null) {
                e += C52418a.m58683j(8, str13);
            }
            String str14 = this.f134883o;
            return str14 != null ? e + C52418a.m58683j(9, str14) : e;
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
            C49751hu huVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    huVar.f134875d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    huVar.f134876e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    huVar.f134877f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    huVar.f134878g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    huVar.f134879h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    huVar.f134880i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    huVar.f134881j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    huVar.f134882n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    huVar.f134883o = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
