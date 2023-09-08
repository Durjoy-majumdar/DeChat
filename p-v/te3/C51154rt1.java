package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.rt1 */
public class C51154rt1 extends C47465a {

    /* renamed from: d */
    public String f141126d;

    /* renamed from: e */
    public String f141127e;

    /* renamed from: f */
    public String f141128f;

    /* renamed from: g */
    public int f141129g;

    /* renamed from: h */
    public C89349b f141130h;

    /* renamed from: i */
    public String f141131i;

    /* renamed from: j */
    public String f141132j;

    /* renamed from: n */
    public C89349b f141133n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51154rt1)) {
            return false;
        }
        C51154rt1 rt12 = (C51154rt1) aVar;
        return C46238a.m51546a(this.f141126d, rt12.f141126d) && C46238a.m51546a(this.f141127e, rt12.f141127e) && C46238a.m51546a(this.f141128f, rt12.f141128f) && C46238a.m51546a(Integer.valueOf(this.f141129g), Integer.valueOf(rt12.f141129g)) && C46238a.m51546a(this.f141130h, rt12.f141130h) && C46238a.m51546a(this.f141131i, rt12.f141131i) && C46238a.m51546a(this.f141132j, rt12.f141132j) && C46238a.m51546a(this.f141133n, rt12.f141133n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f141126d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f141127e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f141128f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            aVar.mo74318e(4, this.f141129g);
            C89349b bVar = this.f141130h;
            if (bVar != null) {
                aVar.mo74315b(5, bVar);
            }
            String str4 = this.f141131i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            String str5 = this.f141132j;
            if (str5 != null) {
                aVar.mo74323j(7, str5);
            }
            C89349b bVar2 = this.f141133n;
            if (bVar2 != null) {
                aVar.mo74315b(9, bVar2);
            }
            return 0;
        } else if (i == 1) {
            String str6 = this.f141126d;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            String str7 = this.f141127e;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            String str8 = this.f141128f;
            if (str8 != null) {
                i2 += C52418a.m58683j(3, str8);
            }
            int e = i2 + C52418a.m58678e(4, this.f141129g);
            C89349b bVar3 = this.f141130h;
            if (bVar3 != null) {
                e += C52418a.m58675b(5, bVar3);
            }
            String str9 = this.f141131i;
            if (str9 != null) {
                e += C52418a.m58683j(6, str9);
            }
            String str10 = this.f141132j;
            if (str10 != null) {
                e += C52418a.m58683j(7, str10);
            }
            C89349b bVar4 = this.f141133n;
            return bVar4 != null ? e + C52418a.m58675b(9, bVar4) : e;
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
            C51154rt1 rt12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    rt12.f141126d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    rt12.f141127e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    rt12.f141128f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    rt12.f141129g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    rt12.f141130h = aVar3.mo141626d(intValue);
                    return 0;
                case 6:
                    rt12.f141131i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    rt12.f141132j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    rt12.f141133n = aVar3.mo141626d(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
