package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.k9 */
public class C77958k9 extends C47465a {

    /* renamed from: d */
    public String f227734d;

    /* renamed from: e */
    public String f227735e;

    /* renamed from: f */
    public String f227736f;

    /* renamed from: g */
    public String f227737g;

    /* renamed from: h */
    public String f227738h;

    /* renamed from: i */
    public String f227739i;

    /* renamed from: j */
    public String f227740j;

    /* renamed from: n */
    public String f227741n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77958k9)) {
            return false;
        }
        C77958k9 k9Var = (C77958k9) aVar;
        return C46238a.m51546a(this.f227734d, k9Var.f227734d) && C46238a.m51546a(this.f227735e, k9Var.f227735e) && C46238a.m51546a(this.f227736f, k9Var.f227736f) && C46238a.m51546a(this.f227737g, k9Var.f227737g) && C46238a.m51546a(this.f227738h, k9Var.f227738h) && C46238a.m51546a(this.f227739i, k9Var.f227739i) && C46238a.m51546a(this.f227740j, k9Var.f227740j) && C46238a.m51546a(this.f227741n, k9Var.f227741n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f227734d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f227735e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f227736f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f227737g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f227738h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            String str6 = this.f227739i;
            if (str6 != null) {
                aVar.mo74323j(6, str6);
            }
            String str7 = this.f227740j;
            if (str7 != null) {
                aVar.mo74323j(7, str7);
            }
            String str8 = this.f227741n;
            if (str8 != null) {
                aVar.mo74323j(8, str8);
            }
            return 0;
        } else if (i == 1) {
            String str9 = this.f227734d;
            if (str9 != null) {
                i2 = 0 + C52418a.m58683j(1, str9);
            }
            String str10 = this.f227735e;
            if (str10 != null) {
                i2 += C52418a.m58683j(2, str10);
            }
            String str11 = this.f227736f;
            if (str11 != null) {
                i2 += C52418a.m58683j(3, str11);
            }
            String str12 = this.f227737g;
            if (str12 != null) {
                i2 += C52418a.m58683j(4, str12);
            }
            String str13 = this.f227738h;
            if (str13 != null) {
                i2 += C52418a.m58683j(5, str13);
            }
            String str14 = this.f227739i;
            if (str14 != null) {
                i2 += C52418a.m58683j(6, str14);
            }
            String str15 = this.f227740j;
            if (str15 != null) {
                i2 += C52418a.m58683j(7, str15);
            }
            String str16 = this.f227741n;
            return str16 != null ? i2 + C52418a.m58683j(8, str16) : i2;
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
            C77958k9 k9Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    k9Var.f227734d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    k9Var.f227735e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    k9Var.f227736f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    k9Var.f227737g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    k9Var.f227738h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    k9Var.f227739i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    k9Var.f227740j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    k9Var.f227741n = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
