package v41;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: v41.o */
public class C52756o extends C47465a {

    /* renamed from: d */
    public int f147416d;

    /* renamed from: e */
    public String f147417e;

    /* renamed from: f */
    public String f147418f;

    /* renamed from: g */
    public String f147419g;

    /* renamed from: h */
    public String f147420h;

    /* renamed from: i */
    public String f147421i;

    /* renamed from: j */
    public int f147422j;

    /* renamed from: n */
    public String f147423n;

    /* renamed from: o */
    public String f147424o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52756o)) {
            return false;
        }
        C52756o oVar = (C52756o) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f147416d), Integer.valueOf(oVar.f147416d)) && C46238a.m51546a(this.f147417e, oVar.f147417e) && C46238a.m51546a(this.f147418f, oVar.f147418f) && C46238a.m51546a(this.f147419g, oVar.f147419g) && C46238a.m51546a(this.f147420h, oVar.f147420h) && C46238a.m51546a(this.f147421i, oVar.f147421i) && C46238a.m51546a(Integer.valueOf(this.f147422j), Integer.valueOf(oVar.f147422j)) && C46238a.m51546a(this.f147423n, oVar.f147423n) && C46238a.m51546a(this.f147424o, oVar.f147424o);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f147416d);
            String str = this.f147417e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f147418f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f147419g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f147420h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f147421i;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            aVar.mo74318e(7, this.f147422j);
            String str6 = this.f147423n;
            if (str6 != null) {
                aVar.mo74323j(8, str6);
            }
            String str7 = this.f147424o;
            if (str7 != null) {
                aVar.mo74323j(9, str7);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f147416d) + 0;
            String str8 = this.f147417e;
            if (str8 != null) {
                e += C52418a.m58683j(2, str8);
            }
            String str9 = this.f147418f;
            if (str9 != null) {
                e += C52418a.m58683j(3, str9);
            }
            String str10 = this.f147419g;
            if (str10 != null) {
                e += C52418a.m58683j(4, str10);
            }
            String str11 = this.f147420h;
            if (str11 != null) {
                e += C52418a.m58683j(5, str11);
            }
            String str12 = this.f147421i;
            if (str12 != null) {
                e += C52418a.m58683j(6, str12);
            }
            int e2 = e + C52418a.m58678e(7, this.f147422j);
            String str13 = this.f147423n;
            if (str13 != null) {
                e2 += C52418a.m58683j(8, str13);
            }
            String str14 = this.f147424o;
            return str14 != null ? e2 + C52418a.m58683j(9, str14) : e2;
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
            C52756o oVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    oVar.f147416d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    oVar.f147417e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    oVar.f147418f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    oVar.f147419g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    oVar.f147420h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    oVar.f147421i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    oVar.f147422j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    oVar.f147423n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    oVar.f147424o = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
