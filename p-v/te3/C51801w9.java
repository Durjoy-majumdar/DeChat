package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.w9 */
public class C51801w9 extends C47465a {

    /* renamed from: d */
    public String f143927d;

    /* renamed from: e */
    public String f143928e;

    /* renamed from: f */
    public String f143929f;

    /* renamed from: g */
    public String f143930g;

    /* renamed from: h */
    public String f143931h;

    /* renamed from: i */
    public String f143932i;

    /* renamed from: j */
    public String f143933j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51801w9)) {
            return false;
        }
        C51801w9 w9Var = (C51801w9) aVar;
        return C46238a.m51546a(this.f143927d, w9Var.f143927d) && C46238a.m51546a(this.f143928e, w9Var.f143928e) && C46238a.m51546a(this.f143929f, w9Var.f143929f) && C46238a.m51546a(this.f143930g, w9Var.f143930g) && C46238a.m51546a(this.f143931h, w9Var.f143931h) && C46238a.m51546a(this.f143932i, w9Var.f143932i) && C46238a.m51546a(this.f143933j, w9Var.f143933j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f143927d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f143928e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f143929f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f143930g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f143931h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            String str6 = this.f143932i;
            if (str6 != null) {
                aVar.mo74323j(6, str6);
            }
            String str7 = this.f143933j;
            if (str7 != null) {
                aVar.mo74323j(7, str7);
            }
            return 0;
        } else if (i == 1) {
            String str8 = this.f143927d;
            if (str8 != null) {
                i2 = 0 + C52418a.m58683j(1, str8);
            }
            String str9 = this.f143928e;
            if (str9 != null) {
                i2 += C52418a.m58683j(2, str9);
            }
            String str10 = this.f143929f;
            if (str10 != null) {
                i2 += C52418a.m58683j(3, str10);
            }
            String str11 = this.f143930g;
            if (str11 != null) {
                i2 += C52418a.m58683j(4, str11);
            }
            String str12 = this.f143931h;
            if (str12 != null) {
                i2 += C52418a.m58683j(5, str12);
            }
            String str13 = this.f143932i;
            if (str13 != null) {
                i2 += C52418a.m58683j(6, str13);
            }
            String str14 = this.f143933j;
            return str14 != null ? i2 + C52418a.m58683j(7, str14) : i2;
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
            C51801w9 w9Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    w9Var.f143927d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    w9Var.f143928e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    w9Var.f143929f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    w9Var.f143930g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    w9Var.f143931h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    w9Var.f143932i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    w9Var.f143933j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
