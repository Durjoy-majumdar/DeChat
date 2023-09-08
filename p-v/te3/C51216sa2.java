package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.sa2 */
public class C51216sa2 extends C47465a {

    /* renamed from: d */
    public int f141401d;

    /* renamed from: e */
    public String f141402e;

    /* renamed from: f */
    public int f141403f;

    /* renamed from: g */
    public int f141404g;

    /* renamed from: h */
    public String f141405h;

    /* renamed from: i */
    public String f141406i;

    /* renamed from: j */
    public String f141407j;

    /* renamed from: n */
    public String f141408n;

    /* renamed from: o */
    public int f141409o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51216sa2)) {
            return false;
        }
        C51216sa2 sa22 = (C51216sa2) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f141401d), Integer.valueOf(sa22.f141401d)) && C46238a.m51546a(this.f141402e, sa22.f141402e) && C46238a.m51546a(Integer.valueOf(this.f141403f), Integer.valueOf(sa22.f141403f)) && C46238a.m51546a(Integer.valueOf(this.f141404g), Integer.valueOf(sa22.f141404g)) && C46238a.m51546a(this.f141405h, sa22.f141405h) && C46238a.m51546a(this.f141406i, sa22.f141406i) && C46238a.m51546a(this.f141407j, sa22.f141407j) && C46238a.m51546a(this.f141408n, sa22.f141408n) && C46238a.m51546a(Integer.valueOf(this.f141409o), Integer.valueOf(sa22.f141409o));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f141401d);
            String str = this.f141402e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f141403f);
            aVar.mo74318e(4, this.f141404g);
            String str2 = this.f141405h;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            String str3 = this.f141406i;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            String str4 = this.f141407j;
            if (str4 != null) {
                aVar.mo74323j(7, str4);
            }
            String str5 = this.f141408n;
            if (str5 != null) {
                aVar.mo74323j(8, str5);
            }
            aVar.mo74318e(9, this.f141409o);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f141401d) + 0;
            String str6 = this.f141402e;
            if (str6 != null) {
                e += C52418a.m58683j(2, str6);
            }
            int e2 = e + C52418a.m58678e(3, this.f141403f) + C52418a.m58678e(4, this.f141404g);
            String str7 = this.f141405h;
            if (str7 != null) {
                e2 += C52418a.m58683j(5, str7);
            }
            String str8 = this.f141406i;
            if (str8 != null) {
                e2 += C52418a.m58683j(6, str8);
            }
            String str9 = this.f141407j;
            if (str9 != null) {
                e2 += C52418a.m58683j(7, str9);
            }
            String str10 = this.f141408n;
            if (str10 != null) {
                e2 += C52418a.m58683j(8, str10);
            }
            return e2 + C52418a.m58678e(9, this.f141409o);
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
            C51216sa2 sa22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    sa22.f141401d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    sa22.f141402e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    sa22.f141403f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    sa22.f141404g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    sa22.f141405h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    sa22.f141406i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    sa22.f141407j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    sa22.f141408n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    sa22.f141409o = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
