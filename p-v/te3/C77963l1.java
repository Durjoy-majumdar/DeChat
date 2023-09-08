package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.l1 */
public class C77963l1 extends C47465a {

    /* renamed from: d */
    public String f227791d;

    /* renamed from: e */
    public String f227792e;

    /* renamed from: f */
    public double f227793f;

    /* renamed from: g */
    public double f227794g;

    /* renamed from: h */
    public long f227795h;

    /* renamed from: i */
    public String f227796i;

    /* renamed from: j */
    public String f227797j;

    /* renamed from: n */
    public String f227798n;

    /* renamed from: o */
    public String f227799o;

    /* renamed from: p */
    public String f227800p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77963l1)) {
            return false;
        }
        C77963l1 l1Var = (C77963l1) aVar;
        return C46238a.m51546a(this.f227791d, l1Var.f227791d) && C46238a.m51546a(this.f227792e, l1Var.f227792e) && C46238a.m51546a(Double.valueOf(this.f227793f), Double.valueOf(l1Var.f227793f)) && C46238a.m51546a(Double.valueOf(this.f227794g), Double.valueOf(l1Var.f227794g)) && C46238a.m51546a(Long.valueOf(this.f227795h), Long.valueOf(l1Var.f227795h)) && C46238a.m51546a(this.f227796i, l1Var.f227796i) && C46238a.m51546a(this.f227797j, l1Var.f227797j) && C46238a.m51546a(this.f227798n, l1Var.f227798n) && C46238a.m51546a(this.f227799o, l1Var.f227799o) && C46238a.m51546a(this.f227800p, l1Var.f227800p);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f227791d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f227792e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74316c(3, this.f227793f);
            aVar.mo74316c(4, this.f227794g);
            aVar.mo74321h(5, this.f227795h);
            String str3 = this.f227796i;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            String str4 = this.f227797j;
            if (str4 != null) {
                aVar.mo74323j(7, str4);
            }
            String str5 = this.f227798n;
            if (str5 != null) {
                aVar.mo74323j(8, str5);
            }
            String str6 = this.f227799o;
            if (str6 != null) {
                aVar.mo74323j(9, str6);
            }
            String str7 = this.f227800p;
            if (str7 != null) {
                aVar.mo74323j(10, str7);
            }
            return 0;
        } else if (i == 1) {
            String str8 = this.f227791d;
            if (str8 != null) {
                i2 = 0 + C52418a.m58683j(1, str8);
            }
            String str9 = this.f227792e;
            if (str9 != null) {
                i2 += C52418a.m58683j(2, str9);
            }
            int c = i2 + C52418a.m58676c(3, this.f227793f) + C52418a.m58676c(4, this.f227794g) + C52418a.m58681h(5, this.f227795h);
            String str10 = this.f227796i;
            if (str10 != null) {
                c += C52418a.m58683j(6, str10);
            }
            String str11 = this.f227797j;
            if (str11 != null) {
                c += C52418a.m58683j(7, str11);
            }
            String str12 = this.f227798n;
            if (str12 != null) {
                c += C52418a.m58683j(8, str12);
            }
            String str13 = this.f227799o;
            if (str13 != null) {
                c += C52418a.m58683j(9, str13);
            }
            String str14 = this.f227800p;
            return str14 != null ? c + C52418a.m58683j(10, str14) : c;
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
            C77963l1 l1Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    l1Var.f227791d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    l1Var.f227792e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    l1Var.f227793f = aVar3.mo141627e(intValue);
                    return 0;
                case 4:
                    l1Var.f227794g = aVar3.mo141627e(intValue);
                    return 0;
                case 5:
                    l1Var.f227795h = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    l1Var.f227796i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    l1Var.f227797j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    l1Var.f227798n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    l1Var.f227799o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    l1Var.f227800p = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
