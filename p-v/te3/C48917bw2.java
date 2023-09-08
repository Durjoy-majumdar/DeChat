package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.bw2 */
public class C48917bw2 extends C47465a {

    /* renamed from: d */
    public float f131344d;

    /* renamed from: e */
    public float f131345e;

    /* renamed from: f */
    public String f131346f;

    /* renamed from: g */
    public String f131347g;

    /* renamed from: h */
    public String f131348h;

    /* renamed from: i */
    public String f131349i;

    /* renamed from: j */
    public int f131350j;

    /* renamed from: n */
    public String f131351n;

    /* renamed from: o */
    public String f131352o;

    /* renamed from: p */
    public String f131353p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48917bw2)) {
            return false;
        }
        C48917bw2 bw22 = (C48917bw2) aVar;
        return C46238a.m51546a(Float.valueOf(this.f131344d), Float.valueOf(bw22.f131344d)) && C46238a.m51546a(Float.valueOf(this.f131345e), Float.valueOf(bw22.f131345e)) && C46238a.m51546a(this.f131346f, bw22.f131346f) && C46238a.m51546a(this.f131347g, bw22.f131347g) && C46238a.m51546a(this.f131348h, bw22.f131348h) && C46238a.m51546a(this.f131349i, bw22.f131349i) && C46238a.m51546a(Integer.valueOf(this.f131350j), Integer.valueOf(bw22.f131350j)) && C46238a.m51546a(this.f131351n, bw22.f131351n) && C46238a.m51546a(this.f131352o, bw22.f131352o) && C46238a.m51546a(this.f131353p, bw22.f131353p);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74317d(1, this.f131344d);
            aVar.mo74317d(2, this.f131345e);
            String str = this.f131346f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f131347g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f131348h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            String str4 = this.f131349i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            aVar.mo74318e(7, this.f131350j);
            String str5 = this.f131351n;
            if (str5 != null) {
                aVar.mo74323j(8, str5);
            }
            String str6 = this.f131352o;
            if (str6 != null) {
                aVar.mo74323j(9, str6);
            }
            String str7 = this.f131353p;
            if (str7 != null) {
                aVar.mo74323j(10, str7);
            }
            return 0;
        } else if (i == 1) {
            int d = C52418a.m58677d(1, this.f131344d) + 0 + C52418a.m58677d(2, this.f131345e);
            String str8 = this.f131346f;
            if (str8 != null) {
                d += C52418a.m58683j(3, str8);
            }
            String str9 = this.f131347g;
            if (str9 != null) {
                d += C52418a.m58683j(4, str9);
            }
            String str10 = this.f131348h;
            if (str10 != null) {
                d += C52418a.m58683j(5, str10);
            }
            String str11 = this.f131349i;
            if (str11 != null) {
                d += C52418a.m58683j(6, str11);
            }
            int e = d + C52418a.m58678e(7, this.f131350j);
            String str12 = this.f131351n;
            if (str12 != null) {
                e += C52418a.m58683j(8, str12);
            }
            String str13 = this.f131352o;
            if (str13 != null) {
                e += C52418a.m58683j(9, str13);
            }
            String str14 = this.f131353p;
            return str14 != null ? e + C52418a.m58683j(10, str14) : e;
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
            C48917bw2 bw22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    bw22.f131344d = aVar3.mo141628f(intValue);
                    return 0;
                case 2:
                    bw22.f131345e = aVar3.mo141628f(intValue);
                    return 0;
                case 3:
                    bw22.f131346f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    bw22.f131347g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    bw22.f131348h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    bw22.f131349i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    bw22.f131350j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    bw22.f131351n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    bw22.f131352o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    bw22.f131353p = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
