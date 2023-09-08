package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ca3 */
public class C48977ca3 extends C47465a {

    /* renamed from: d */
    public String f131595d;

    /* renamed from: e */
    public String f131596e;

    /* renamed from: f */
    public int f131597f;

    /* renamed from: g */
    public int f131598g;

    /* renamed from: h */
    public String f131599h;

    /* renamed from: i */
    public String f131600i;

    /* renamed from: j */
    public boolean f131601j;

    /* renamed from: n */
    public boolean f131602n;

    /* renamed from: o */
    public int f131603o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48977ca3)) {
            return false;
        }
        C48977ca3 ca32 = (C48977ca3) aVar;
        return C46238a.m51546a(this.f131595d, ca32.f131595d) && C46238a.m51546a(this.f131596e, ca32.f131596e) && C46238a.m51546a(Integer.valueOf(this.f131597f), Integer.valueOf(ca32.f131597f)) && C46238a.m51546a(Integer.valueOf(this.f131598g), Integer.valueOf(ca32.f131598g)) && C46238a.m51546a(this.f131599h, ca32.f131599h) && C46238a.m51546a(this.f131600i, ca32.f131600i) && C46238a.m51546a(Boolean.valueOf(this.f131601j), Boolean.valueOf(ca32.f131601j)) && C46238a.m51546a(Boolean.valueOf(this.f131602n), Boolean.valueOf(ca32.f131602n)) && C46238a.m51546a(Integer.valueOf(this.f131603o), Integer.valueOf(ca32.f131603o));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f131595d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f131596e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f131597f);
            aVar.mo74318e(4, this.f131598g);
            String str3 = this.f131599h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            String str4 = this.f131600i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            aVar.mo74314a(20, this.f131601j);
            aVar.mo74314a(21, this.f131602n);
            aVar.mo74318e(22, this.f131603o);
            return 0;
        } else if (i == 1) {
            String str5 = this.f131595d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f131596e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            int e = i2 + C52418a.m58678e(3, this.f131597f) + C52418a.m58678e(4, this.f131598g);
            String str7 = this.f131599h;
            if (str7 != null) {
                e += C52418a.m58683j(5, str7);
            }
            String str8 = this.f131600i;
            if (str8 != null) {
                e += C52418a.m58683j(6, str8);
            }
            return e + C52418a.m58674a(20, this.f131601j) + C52418a.m58674a(21, this.f131602n) + C52418a.m58678e(22, this.f131603o);
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
            C48977ca3 ca32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ca32.f131595d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    ca32.f131596e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    ca32.f131597f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    ca32.f131598g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    ca32.f131599h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    ca32.f131600i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    switch (intValue) {
                        case 20:
                            ca32.f131601j = aVar3.mo141625c(intValue);
                            return 0;
                        case 21:
                            ca32.f131602n = aVar3.mo141625c(intValue);
                            return 0;
                        case 22:
                            ca32.f131603o = aVar3.mo141629g(intValue);
                            return 0;
                        default:
                            return -1;
                    }
            }
        }
    }
}
