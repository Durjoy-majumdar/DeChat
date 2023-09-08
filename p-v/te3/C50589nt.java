package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.nt */
public class C50589nt extends C47465a {

    /* renamed from: d */
    public String f138752d;

    /* renamed from: e */
    public String f138753e;

    /* renamed from: f */
    public String f138754f;

    /* renamed from: g */
    public int f138755g;

    /* renamed from: h */
    public int f138756h;

    /* renamed from: i */
    public String f138757i;

    /* renamed from: j */
    public String f138758j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50589nt)) {
            return false;
        }
        C50589nt ntVar = (C50589nt) aVar;
        return C46238a.m51546a(this.f138752d, ntVar.f138752d) && C46238a.m51546a(this.f138753e, ntVar.f138753e) && C46238a.m51546a(this.f138754f, ntVar.f138754f) && C46238a.m51546a(Integer.valueOf(this.f138755g), Integer.valueOf(ntVar.f138755g)) && C46238a.m51546a(Integer.valueOf(this.f138756h), Integer.valueOf(ntVar.f138756h)) && C46238a.m51546a(this.f138757i, ntVar.f138757i) && C46238a.m51546a(this.f138758j, ntVar.f138758j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f138752d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f138753e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f138754f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            aVar.mo74318e(4, this.f138755g);
            aVar.mo74318e(5, this.f138756h);
            String str4 = this.f138757i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            String str5 = this.f138758j;
            if (str5 != null) {
                aVar.mo74323j(7, str5);
            }
            return 0;
        } else if (i == 1) {
            String str6 = this.f138752d;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            String str7 = this.f138753e;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            String str8 = this.f138754f;
            if (str8 != null) {
                i2 += C52418a.m58683j(3, str8);
            }
            int e = i2 + C52418a.m58678e(4, this.f138755g) + C52418a.m58678e(5, this.f138756h);
            String str9 = this.f138757i;
            if (str9 != null) {
                e += C52418a.m58683j(6, str9);
            }
            String str10 = this.f138758j;
            return str10 != null ? e + C52418a.m58683j(7, str10) : e;
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
            C50589nt ntVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ntVar.f138752d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    ntVar.f138753e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    ntVar.f138754f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    ntVar.f138755g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    ntVar.f138756h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    ntVar.f138757i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    ntVar.f138758j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
