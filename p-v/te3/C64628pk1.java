package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.pk1 */
public class C64628pk1 extends C47465a {

    /* renamed from: d */
    public int f184826d;

    /* renamed from: e */
    public String f184827e;

    /* renamed from: f */
    public String f184828f;

    /* renamed from: g */
    public float f184829g;

    /* renamed from: h */
    public float f184830h;

    /* renamed from: i */
    public int f184831i;

    /* renamed from: j */
    public String f184832j;

    /* renamed from: n */
    public String f184833n;

    /* renamed from: o */
    public String f184834o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64628pk1)) {
            return false;
        }
        C64628pk1 pk12 = (C64628pk1) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f184826d), Integer.valueOf(pk12.f184826d)) && C46238a.m51546a(this.f184827e, pk12.f184827e) && C46238a.m51546a(this.f184828f, pk12.f184828f) && C46238a.m51546a(Float.valueOf(this.f184829g), Float.valueOf(pk12.f184829g)) && C46238a.m51546a(Float.valueOf(this.f184830h), Float.valueOf(pk12.f184830h)) && C46238a.m51546a(Integer.valueOf(this.f184831i), Integer.valueOf(pk12.f184831i)) && C46238a.m51546a(this.f184832j, pk12.f184832j) && C46238a.m51546a(this.f184833n, pk12.f184833n) && C46238a.m51546a(this.f184834o, pk12.f184834o);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f184826d);
            String str = this.f184827e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f184828f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74317d(4, this.f184829g);
            aVar.mo74317d(5, this.f184830h);
            aVar.mo74318e(6, this.f184831i);
            String str3 = this.f184832j;
            if (str3 != null) {
                aVar.mo74323j(7, str3);
            }
            String str4 = this.f184833n;
            if (str4 != null) {
                aVar.mo74323j(8, str4);
            }
            String str5 = this.f184834o;
            if (str5 != null) {
                aVar.mo74323j(9, str5);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f184826d) + 0;
            String str6 = this.f184827e;
            if (str6 != null) {
                e += C52418a.m58683j(2, str6);
            }
            String str7 = this.f184828f;
            if (str7 != null) {
                e += C52418a.m58683j(3, str7);
            }
            int d = e + C52418a.m58677d(4, this.f184829g) + C52418a.m58677d(5, this.f184830h) + C52418a.m58678e(6, this.f184831i);
            String str8 = this.f184832j;
            if (str8 != null) {
                d += C52418a.m58683j(7, str8);
            }
            String str9 = this.f184833n;
            if (str9 != null) {
                d += C52418a.m58683j(8, str9);
            }
            String str10 = this.f184834o;
            return str10 != null ? d + C52418a.m58683j(9, str10) : d;
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
            C64628pk1 pk12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    pk12.f184826d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    pk12.f184827e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    pk12.f184828f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    pk12.f184829g = aVar3.mo141628f(intValue);
                    return 0;
                case 5:
                    pk12.f184830h = aVar3.mo141628f(intValue);
                    return 0;
                case 6:
                    pk12.f184831i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    pk12.f184832j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    pk12.f184833n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    pk12.f184834o = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
