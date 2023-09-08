package py1;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.s5 */
public class C47672s5 extends C47465a {

    /* renamed from: d */
    public String f128004d;

    /* renamed from: e */
    public String f128005e;

    /* renamed from: f */
    public String f128006f;

    /* renamed from: g */
    public String f128007g;

    /* renamed from: h */
    public String f128008h;

    /* renamed from: i */
    public int f128009i;

    /* renamed from: j */
    public String f128010j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47672s5)) {
            return false;
        }
        C47672s5 s5Var = (C47672s5) aVar;
        return C46238a.m51546a(this.f128004d, s5Var.f128004d) && C46238a.m51546a(this.f128005e, s5Var.f128005e) && C46238a.m51546a(this.f128006f, s5Var.f128006f) && C46238a.m51546a(this.f128007g, s5Var.f128007g) && C46238a.m51546a(this.f128008h, s5Var.f128008h) && C46238a.m51546a(Integer.valueOf(this.f128009i), Integer.valueOf(s5Var.f128009i)) && C46238a.m51546a(this.f128010j, s5Var.f128010j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f128004d;
            if (str != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                String str2 = this.f128005e;
                if (str2 != null) {
                    aVar.mo74323j(2, str2);
                }
                String str3 = this.f128006f;
                if (str3 != null) {
                    aVar.mo74323j(3, str3);
                }
                String str4 = this.f128007g;
                if (str4 != null) {
                    aVar.mo74323j(4, str4);
                }
                String str5 = this.f128008h;
                if (str5 != null) {
                    aVar.mo74323j(5, str5);
                }
                aVar.mo74318e(6, this.f128009i);
                String str6 = this.f128010j;
                if (str6 != null) {
                    aVar.mo74323j(7, str6);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: AppId");
        } else if (i == 1) {
            String str7 = this.f128004d;
            if (str7 != null) {
                i2 = 0 + C52418a.m58683j(1, str7);
            }
            String str8 = this.f128005e;
            if (str8 != null) {
                i2 += C52418a.m58683j(2, str8);
            }
            String str9 = this.f128006f;
            if (str9 != null) {
                i2 += C52418a.m58683j(3, str9);
            }
            String str10 = this.f128007g;
            if (str10 != null) {
                i2 += C52418a.m58683j(4, str10);
            }
            String str11 = this.f128008h;
            if (str11 != null) {
                i2 += C52418a.m58683j(5, str11);
            }
            int e = i2 + C52418a.m58678e(6, this.f128009i);
            String str12 = this.f128010j;
            return str12 != null ? e + C52418a.m58683j(7, str12) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f128004d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: AppId");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C47672s5 s5Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    s5Var.f128004d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    s5Var.f128005e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    s5Var.f128006f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    s5Var.f128007g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    s5Var.f128008h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    s5Var.f128009i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    s5Var.f128010j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
