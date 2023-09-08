package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.lx2 */
public class C64538lx2 extends C47465a {

    /* renamed from: d */
    public String f184166d;

    /* renamed from: e */
    public String f184167e;

    /* renamed from: f */
    public String f184168f;

    /* renamed from: g */
    public int f184169g;

    /* renamed from: h */
    public String f184170h;

    /* renamed from: i */
    public int f184171i;

    /* renamed from: j */
    public String f184172j;

    /* renamed from: n */
    public int f184173n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64538lx2)) {
            return false;
        }
        C64538lx2 lx22 = (C64538lx2) aVar;
        return C46238a.m51546a(this.f184166d, lx22.f184166d) && C46238a.m51546a(this.f184167e, lx22.f184167e) && C46238a.m51546a(this.f184168f, lx22.f184168f) && C46238a.m51546a(Integer.valueOf(this.f184169g), Integer.valueOf(lx22.f184169g)) && C46238a.m51546a(this.f184170h, lx22.f184170h) && C46238a.m51546a(Integer.valueOf(this.f184171i), Integer.valueOf(lx22.f184171i)) && C46238a.m51546a(this.f184172j, lx22.f184172j) && C46238a.m51546a(Integer.valueOf(this.f184173n), Integer.valueOf(lx22.f184173n));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f184166d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f184167e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f184168f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            aVar.mo74318e(4, this.f184169g);
            String str4 = this.f184170h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            aVar.mo74318e(6, this.f184171i);
            String str5 = this.f184172j;
            if (str5 != null) {
                aVar.mo74323j(7, str5);
            }
            aVar.mo74318e(8, this.f184173n);
            return 0;
        } else if (i == 1) {
            String str6 = this.f184166d;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            String str7 = this.f184167e;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            String str8 = this.f184168f;
            if (str8 != null) {
                i2 += C52418a.m58683j(3, str8);
            }
            int e = i2 + C52418a.m58678e(4, this.f184169g);
            String str9 = this.f184170h;
            if (str9 != null) {
                e += C52418a.m58683j(5, str9);
            }
            int e2 = e + C52418a.m58678e(6, this.f184171i);
            String str10 = this.f184172j;
            if (str10 != null) {
                e2 += C52418a.m58683j(7, str10);
            }
            return e2 + C52418a.m58678e(8, this.f184173n);
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
            C64538lx2 lx22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    lx22.f184166d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    lx22.f184167e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    lx22.f184168f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    lx22.f184169g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    lx22.f184170h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    lx22.f184171i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    lx22.f184172j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    lx22.f184173n = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
