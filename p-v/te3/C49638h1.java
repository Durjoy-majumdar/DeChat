package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.h1 */
public class C49638h1 extends C47465a {

    /* renamed from: d */
    public String f134398d;

    /* renamed from: e */
    public String f134399e;

    /* renamed from: f */
    public int f134400f;

    /* renamed from: g */
    public String f134401g;

    /* renamed from: h */
    public String f134402h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49638h1)) {
            return false;
        }
        C49638h1 h1Var = (C49638h1) aVar;
        return C46238a.m51546a(this.f134398d, h1Var.f134398d) && C46238a.m51546a(this.f134399e, h1Var.f134399e) && C46238a.m51546a(Integer.valueOf(this.f134400f), Integer.valueOf(h1Var.f134400f)) && C46238a.m51546a(this.f134401g, h1Var.f134401g) && C46238a.m51546a(this.f134402h, h1Var.f134402h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f134398d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f134399e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f134400f);
            String str3 = this.f134401g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f134402h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            return 0;
        } else if (i == 1) {
            String str5 = this.f134398d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f134399e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            int e = i2 + C52418a.m58678e(3, this.f134400f);
            String str7 = this.f134401g;
            if (str7 != null) {
                e += C52418a.m58683j(4, str7);
            }
            String str8 = this.f134402h;
            return str8 != null ? e + C52418a.m58683j(5, str8) : e;
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
            C49638h1 h1Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                h1Var.f134398d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                h1Var.f134399e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                h1Var.f134400f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                h1Var.f134401g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                h1Var.f134402h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
