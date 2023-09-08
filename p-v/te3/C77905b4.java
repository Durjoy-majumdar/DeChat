package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.b4 */
public class C77905b4 extends C47465a {

    /* renamed from: d */
    public String f226980d;

    /* renamed from: e */
    public String f226981e;

    /* renamed from: f */
    public String f226982f;

    /* renamed from: g */
    public String f226983g;

    /* renamed from: h */
    public String f226984h;

    /* renamed from: i */
    public String f226985i;

    /* renamed from: j */
    public String f226986j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77905b4)) {
            return false;
        }
        C77905b4 b4Var = (C77905b4) aVar;
        return C46238a.m51546a(this.f226980d, b4Var.f226980d) && C46238a.m51546a(this.f226981e, b4Var.f226981e) && C46238a.m51546a(this.f226982f, b4Var.f226982f) && C46238a.m51546a(this.f226983g, b4Var.f226983g) && C46238a.m51546a(this.f226984h, b4Var.f226984h) && C46238a.m51546a(this.f226985i, b4Var.f226985i) && C46238a.m51546a(this.f226986j, b4Var.f226986j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f226980d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f226981e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f226982f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f226983g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f226984h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            String str6 = this.f226985i;
            if (str6 != null) {
                aVar.mo74323j(6, str6);
            }
            String str7 = this.f226986j;
            if (str7 != null) {
                aVar.mo74323j(7, str7);
            }
            return 0;
        } else if (i == 1) {
            String str8 = this.f226980d;
            if (str8 != null) {
                i2 = 0 + C52418a.m58683j(1, str8);
            }
            String str9 = this.f226981e;
            if (str9 != null) {
                i2 += C52418a.m58683j(2, str9);
            }
            String str10 = this.f226982f;
            if (str10 != null) {
                i2 += C52418a.m58683j(3, str10);
            }
            String str11 = this.f226983g;
            if (str11 != null) {
                i2 += C52418a.m58683j(4, str11);
            }
            String str12 = this.f226984h;
            if (str12 != null) {
                i2 += C52418a.m58683j(5, str12);
            }
            String str13 = this.f226985i;
            if (str13 != null) {
                i2 += C52418a.m58683j(6, str13);
            }
            String str14 = this.f226986j;
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
            C77905b4 b4Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    b4Var.f226980d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    b4Var.f226981e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    b4Var.f226982f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    b4Var.f226983g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    b4Var.f226984h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    b4Var.f226985i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    b4Var.f226986j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
