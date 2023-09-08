package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.l61 */
public class C50222l61 extends C47465a {

    /* renamed from: d */
    public String f137217d;

    /* renamed from: e */
    public String f137218e;

    /* renamed from: f */
    public String f137219f;

    /* renamed from: g */
    public int f137220g;

    /* renamed from: h */
    public String f137221h;

    /* renamed from: i */
    public int f137222i;

    /* renamed from: j */
    public int f137223j;

    /* renamed from: n */
    public int f137224n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50222l61)) {
            return false;
        }
        C50222l61 l612 = (C50222l61) aVar;
        return C46238a.m51546a(this.f137217d, l612.f137217d) && C46238a.m51546a(this.f137218e, l612.f137218e) && C46238a.m51546a(this.f137219f, l612.f137219f) && C46238a.m51546a(Integer.valueOf(this.f137220g), Integer.valueOf(l612.f137220g)) && C46238a.m51546a(this.f137221h, l612.f137221h) && C46238a.m51546a(Integer.valueOf(this.f137222i), Integer.valueOf(l612.f137222i)) && C46238a.m51546a(Integer.valueOf(this.f137223j), Integer.valueOf(l612.f137223j)) && C46238a.m51546a(Integer.valueOf(this.f137224n), Integer.valueOf(l612.f137224n));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f137217d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f137218e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f137219f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            aVar.mo74318e(4, this.f137220g);
            String str4 = this.f137221h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            aVar.mo74318e(6, this.f137222i);
            aVar.mo74318e(7, this.f137223j);
            aVar.mo74318e(8, this.f137224n);
            return 0;
        } else if (i == 1) {
            String str5 = this.f137217d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f137218e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            String str7 = this.f137219f;
            if (str7 != null) {
                i2 += C52418a.m58683j(3, str7);
            }
            int e = i2 + C52418a.m58678e(4, this.f137220g);
            String str8 = this.f137221h;
            if (str8 != null) {
                e += C52418a.m58683j(5, str8);
            }
            return e + C52418a.m58678e(6, this.f137222i) + C52418a.m58678e(7, this.f137223j) + C52418a.m58678e(8, this.f137224n);
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
            C50222l61 l612 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    l612.f137217d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    l612.f137218e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    l612.f137219f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    l612.f137220g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    l612.f137221h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    l612.f137222i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    l612.f137223j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    l612.f137224n = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
