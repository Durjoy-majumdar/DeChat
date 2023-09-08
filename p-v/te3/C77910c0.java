package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.c0 */
public class C77910c0 extends C47465a {

    /* renamed from: d */
    public int f227110d;

    /* renamed from: e */
    public String f227111e;

    /* renamed from: f */
    public String f227112f;

    /* renamed from: g */
    public String f227113g;

    /* renamed from: h */
    public String f227114h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77910c0)) {
            return false;
        }
        C77910c0 c0Var = (C77910c0) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f227110d), Integer.valueOf(c0Var.f227110d)) && C46238a.m51546a(this.f227111e, c0Var.f227111e) && C46238a.m51546a(this.f227112f, c0Var.f227112f) && C46238a.m51546a(this.f227113g, c0Var.f227113g) && C46238a.m51546a(this.f227114h, c0Var.f227114h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f227110d);
            String str = this.f227111e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f227112f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f227113g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f227114h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f227110d) + 0;
            String str5 = this.f227111e;
            if (str5 != null) {
                e += C52418a.m58683j(2, str5);
            }
            String str6 = this.f227112f;
            if (str6 != null) {
                e += C52418a.m58683j(3, str6);
            }
            String str7 = this.f227113g;
            if (str7 != null) {
                e += C52418a.m58683j(4, str7);
            }
            String str8 = this.f227114h;
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
            C77910c0 c0Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                c0Var.f227110d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                c0Var.f227111e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                c0Var.f227112f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                c0Var.f227113g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                c0Var.f227114h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
