package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.p9 */
public class C50798p9 extends C47465a {

    /* renamed from: d */
    public String f139647d;

    /* renamed from: e */
    public String f139648e;

    /* renamed from: f */
    public String f139649f;

    /* renamed from: g */
    public boolean f139650g;

    /* renamed from: h */
    public String f139651h;

    /* renamed from: i */
    public String f139652i;

    /* renamed from: j */
    public String f139653j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50798p9)) {
            return false;
        }
        C50798p9 p9Var = (C50798p9) aVar;
        return C46238a.m51546a(this.f139647d, p9Var.f139647d) && C46238a.m51546a(this.f139648e, p9Var.f139648e) && C46238a.m51546a(this.f139649f, p9Var.f139649f) && C46238a.m51546a(Boolean.valueOf(this.f139650g), Boolean.valueOf(p9Var.f139650g)) && C46238a.m51546a(this.f139651h, p9Var.f139651h) && C46238a.m51546a(this.f139652i, p9Var.f139652i) && C46238a.m51546a(this.f139653j, p9Var.f139653j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f139647d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f139648e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f139649f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            aVar.mo74314a(4, this.f139650g);
            String str4 = this.f139651h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f139652i;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            String str6 = this.f139653j;
            if (str6 != null) {
                aVar.mo74323j(7, str6);
            }
            return 0;
        } else if (i == 1) {
            String str7 = this.f139647d;
            if (str7 != null) {
                i2 = 0 + C52418a.m58683j(1, str7);
            }
            String str8 = this.f139648e;
            if (str8 != null) {
                i2 += C52418a.m58683j(2, str8);
            }
            String str9 = this.f139649f;
            if (str9 != null) {
                i2 += C52418a.m58683j(3, str9);
            }
            int a = i2 + C52418a.m58674a(4, this.f139650g);
            String str10 = this.f139651h;
            if (str10 != null) {
                a += C52418a.m58683j(5, str10);
            }
            String str11 = this.f139652i;
            if (str11 != null) {
                a += C52418a.m58683j(6, str11);
            }
            String str12 = this.f139653j;
            return str12 != null ? a + C52418a.m58683j(7, str12) : a;
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
            C50798p9 p9Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    p9Var.f139647d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    p9Var.f139648e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    p9Var.f139649f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    p9Var.f139650g = aVar3.mo141625c(intValue);
                    return 0;
                case 5:
                    p9Var.f139651h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    p9Var.f139652i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    p9Var.f139653j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
