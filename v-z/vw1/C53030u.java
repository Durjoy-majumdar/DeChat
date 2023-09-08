package vw1;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: vw1.u */
public class C53030u extends C47465a {

    /* renamed from: d */
    public int f148027d;

    /* renamed from: e */
    public String f148028e;

    /* renamed from: f */
    public String f148029f;

    /* renamed from: g */
    public int f148030g;

    /* renamed from: h */
    public int f148031h;

    /* renamed from: i */
    public boolean f148032i;

    /* renamed from: j */
    public int f148033j;

    /* renamed from: n */
    public long f148034n;

    /* renamed from: o */
    public int f148035o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C53030u)) {
            return false;
        }
        C53030u uVar = (C53030u) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f148027d), Integer.valueOf(uVar.f148027d)) && C46238a.m51546a(this.f148028e, uVar.f148028e) && C46238a.m51546a(this.f148029f, uVar.f148029f) && C46238a.m51546a(Integer.valueOf(this.f148030g), Integer.valueOf(uVar.f148030g)) && C46238a.m51546a(Integer.valueOf(this.f148031h), Integer.valueOf(uVar.f148031h)) && C46238a.m51546a(Boolean.valueOf(this.f148032i), Boolean.valueOf(uVar.f148032i)) && C46238a.m51546a(Integer.valueOf(this.f148033j), Integer.valueOf(uVar.f148033j)) && C46238a.m51546a(Long.valueOf(this.f148034n), Long.valueOf(uVar.f148034n)) && C46238a.m51546a(Integer.valueOf(this.f148035o), Integer.valueOf(uVar.f148035o));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f148027d);
            String str = this.f148028e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f148029f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74318e(4, this.f148030g);
            aVar.mo74318e(5, this.f148031h);
            aVar.mo74314a(6, this.f148032i);
            aVar.mo74318e(7, this.f148033j);
            aVar.mo74321h(8, this.f148034n);
            aVar.mo74318e(9, this.f148035o);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f148027d) + 0;
            String str3 = this.f148028e;
            if (str3 != null) {
                e += C52418a.m58683j(2, str3);
            }
            String str4 = this.f148029f;
            if (str4 != null) {
                e += C52418a.m58683j(3, str4);
            }
            return e + C52418a.m58678e(4, this.f148030g) + C52418a.m58678e(5, this.f148031h) + C52418a.m58674a(6, this.f148032i) + C52418a.m58678e(7, this.f148033j) + C52418a.m58681h(8, this.f148034n) + C52418a.m58678e(9, this.f148035o);
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
            C53030u uVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    uVar.f148027d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    uVar.f148028e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    uVar.f148029f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    uVar.f148030g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    uVar.f148031h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    uVar.f148032i = aVar3.mo141625c(intValue);
                    return 0;
                case 7:
                    uVar.f148033j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    uVar.f148034n = aVar3.mo141631i(intValue);
                    return 0;
                case 9:
                    uVar.f148035o = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
