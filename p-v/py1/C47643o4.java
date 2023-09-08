package py1;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.o4 */
public class C47643o4 extends C47465a {

    /* renamed from: d */
    public String f127907d;

    /* renamed from: e */
    public String f127908e;

    /* renamed from: f */
    public String f127909f;

    /* renamed from: g */
    public String f127910g;

    /* renamed from: h */
    public String f127911h;

    /* renamed from: i */
    public boolean f127912i;

    /* renamed from: j */
    public boolean f127913j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47643o4)) {
            return false;
        }
        C47643o4 o4Var = (C47643o4) aVar;
        return C46238a.m51546a(this.f127907d, o4Var.f127907d) && C46238a.m51546a(this.f127908e, o4Var.f127908e) && C46238a.m51546a(this.f127909f, o4Var.f127909f) && C46238a.m51546a(this.f127910g, o4Var.f127910g) && C46238a.m51546a(this.f127911h, o4Var.f127911h) && C46238a.m51546a(Boolean.valueOf(this.f127912i), Boolean.valueOf(o4Var.f127912i)) && C46238a.m51546a(Boolean.valueOf(this.f127913j), Boolean.valueOf(o4Var.f127913j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f127907d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f127908e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f127909f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f127910g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f127911h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            aVar.mo74314a(6, this.f127912i);
            aVar.mo74314a(7, this.f127913j);
            return 0;
        } else if (i == 1) {
            String str6 = this.f127907d;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            String str7 = this.f127908e;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            String str8 = this.f127909f;
            if (str8 != null) {
                i2 += C52418a.m58683j(3, str8);
            }
            String str9 = this.f127910g;
            if (str9 != null) {
                i2 += C52418a.m58683j(4, str9);
            }
            String str10 = this.f127911h;
            if (str10 != null) {
                i2 += C52418a.m58683j(5, str10);
            }
            return i2 + C52418a.m58674a(6, this.f127912i) + C52418a.m58674a(7, this.f127913j);
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
            C47643o4 o4Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    o4Var.f127907d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    o4Var.f127908e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    o4Var.f127909f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    o4Var.f127910g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    o4Var.f127911h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    o4Var.f127912i = aVar3.mo141625c(intValue);
                    return 0;
                case 7:
                    o4Var.f127913j = aVar3.mo141625c(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
