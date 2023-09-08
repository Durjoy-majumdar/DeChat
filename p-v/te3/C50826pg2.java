package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.pg2 */
public class C50826pg2 extends C47465a {

    /* renamed from: d */
    public String f139752d;

    /* renamed from: e */
    public long f139753e;

    /* renamed from: f */
    public int f139754f;

    /* renamed from: g */
    public long f139755g;

    /* renamed from: h */
    public long f139756h;

    /* renamed from: i */
    public String f139757i;

    /* renamed from: j */
    public String f139758j;

    /* renamed from: n */
    public int f139759n;

    /* renamed from: o */
    public String f139760o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50826pg2)) {
            return false;
        }
        C50826pg2 pg22 = (C50826pg2) aVar;
        return C46238a.m51546a(this.f139752d, pg22.f139752d) && C46238a.m51546a(Long.valueOf(this.f139753e), Long.valueOf(pg22.f139753e)) && C46238a.m51546a(Integer.valueOf(this.f139754f), Integer.valueOf(pg22.f139754f)) && C46238a.m51546a(Long.valueOf(this.f139755g), Long.valueOf(pg22.f139755g)) && C46238a.m51546a(Long.valueOf(this.f139756h), Long.valueOf(pg22.f139756h)) && C46238a.m51546a(this.f139757i, pg22.f139757i) && C46238a.m51546a(this.f139758j, pg22.f139758j) && C46238a.m51546a(Integer.valueOf(this.f139759n), Integer.valueOf(pg22.f139759n)) && C46238a.m51546a(this.f139760o, pg22.f139760o);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f139752d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74321h(2, this.f139753e);
            aVar.mo74318e(3, this.f139754f);
            aVar.mo74321h(4, this.f139755g);
            aVar.mo74321h(5, this.f139756h);
            String str2 = this.f139757i;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            String str3 = this.f139758j;
            if (str3 != null) {
                aVar.mo74323j(7, str3);
            }
            aVar.mo74318e(8, this.f139759n);
            String str4 = this.f139760o;
            if (str4 != null) {
                aVar.mo74323j(9, str4);
            }
            return 0;
        } else if (i == 1) {
            String str5 = this.f139752d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            int h = i2 + C52418a.m58681h(2, this.f139753e) + C52418a.m58678e(3, this.f139754f) + C52418a.m58681h(4, this.f139755g) + C52418a.m58681h(5, this.f139756h);
            String str6 = this.f139757i;
            if (str6 != null) {
                h += C52418a.m58683j(6, str6);
            }
            String str7 = this.f139758j;
            if (str7 != null) {
                h += C52418a.m58683j(7, str7);
            }
            int e = h + C52418a.m58678e(8, this.f139759n);
            String str8 = this.f139760o;
            return str8 != null ? e + C52418a.m58683j(9, str8) : e;
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
            C50826pg2 pg22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    pg22.f139752d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    pg22.f139753e = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    pg22.f139754f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    pg22.f139755g = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    pg22.f139756h = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    pg22.f139757i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    pg22.f139758j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    pg22.f139759n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    pg22.f139760o = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
