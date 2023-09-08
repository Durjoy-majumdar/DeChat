package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.gj0 */
public class C49567gj0 extends C47465a {

    /* renamed from: d */
    public String f134065d;

    /* renamed from: e */
    public String f134066e;

    /* renamed from: f */
    public String f134067f;

    /* renamed from: g */
    public String f134068g;

    /* renamed from: h */
    public int f134069h;

    /* renamed from: i */
    public String f134070i;

    /* renamed from: j */
    public String f134071j;

    /* renamed from: n */
    public String f134072n;

    /* renamed from: o */
    public String f134073o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49567gj0)) {
            return false;
        }
        C49567gj0 gj02 = (C49567gj0) aVar;
        return C46238a.m51546a(this.f134065d, gj02.f134065d) && C46238a.m51546a(this.f134066e, gj02.f134066e) && C46238a.m51546a(this.f134067f, gj02.f134067f) && C46238a.m51546a(this.f134068g, gj02.f134068g) && C46238a.m51546a(Integer.valueOf(this.f134069h), Integer.valueOf(gj02.f134069h)) && C46238a.m51546a(this.f134070i, gj02.f134070i) && C46238a.m51546a(this.f134071j, gj02.f134071j) && C46238a.m51546a(this.f134072n, gj02.f134072n) && C46238a.m51546a(this.f134073o, gj02.f134073o);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f134065d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f134066e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f134067f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f134068g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            aVar.mo74318e(5, this.f134069h);
            String str5 = this.f134070i;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            String str6 = this.f134071j;
            if (str6 != null) {
                aVar.mo74323j(7, str6);
            }
            String str7 = this.f134072n;
            if (str7 != null) {
                aVar.mo74323j(8, str7);
            }
            String str8 = this.f134073o;
            if (str8 != null) {
                aVar.mo74323j(9, str8);
            }
            return 0;
        } else if (i == 1) {
            String str9 = this.f134065d;
            if (str9 != null) {
                i2 = 0 + C52418a.m58683j(1, str9);
            }
            String str10 = this.f134066e;
            if (str10 != null) {
                i2 += C52418a.m58683j(2, str10);
            }
            String str11 = this.f134067f;
            if (str11 != null) {
                i2 += C52418a.m58683j(3, str11);
            }
            String str12 = this.f134068g;
            if (str12 != null) {
                i2 += C52418a.m58683j(4, str12);
            }
            int e = i2 + C52418a.m58678e(5, this.f134069h);
            String str13 = this.f134070i;
            if (str13 != null) {
                e += C52418a.m58683j(6, str13);
            }
            String str14 = this.f134071j;
            if (str14 != null) {
                e += C52418a.m58683j(7, str14);
            }
            String str15 = this.f134072n;
            if (str15 != null) {
                e += C52418a.m58683j(8, str15);
            }
            String str16 = this.f134073o;
            return str16 != null ? e + C52418a.m58683j(9, str16) : e;
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
            C49567gj0 gj02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    gj02.f134065d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    gj02.f134066e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    gj02.f134067f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    gj02.f134068g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    gj02.f134069h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    gj02.f134070i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    gj02.f134071j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    gj02.f134072n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    gj02.f134073o = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
