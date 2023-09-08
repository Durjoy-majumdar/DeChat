package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.st2 */
public class C101842st2 extends C47465a {

    /* renamed from: d */
    public int f299443d = -1;

    /* renamed from: e */
    public int f299444e = 0;

    /* renamed from: f */
    public String f299445f;

    /* renamed from: g */
    public int f299446g;

    /* renamed from: h */
    public int f299447h;

    /* renamed from: i */
    public int f299448i;

    /* renamed from: j */
    public int f299449j;

    /* renamed from: n */
    public String f299450n;

    /* renamed from: o */
    public int f299451o;

    /* renamed from: p */
    public String f299452p;

    /* renamed from: q */
    public int f299453q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101842st2)) {
            return false;
        }
        C101842st2 st22 = (C101842st2) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f299443d), Integer.valueOf(st22.f299443d)) && C46238a.m51546a(Integer.valueOf(this.f299444e), Integer.valueOf(st22.f299444e)) && C46238a.m51546a(this.f299445f, st22.f299445f) && C46238a.m51546a(Integer.valueOf(this.f299446g), Integer.valueOf(st22.f299446g)) && C46238a.m51546a(Integer.valueOf(this.f299447h), Integer.valueOf(st22.f299447h)) && C46238a.m51546a(Integer.valueOf(this.f299448i), Integer.valueOf(st22.f299448i)) && C46238a.m51546a(Integer.valueOf(this.f299449j), Integer.valueOf(st22.f299449j)) && C46238a.m51546a(this.f299450n, st22.f299450n) && C46238a.m51546a(Integer.valueOf(this.f299451o), Integer.valueOf(st22.f299451o)) && C46238a.m51546a(this.f299452p, st22.f299452p) && C46238a.m51546a(Integer.valueOf(this.f299453q), Integer.valueOf(st22.f299453q));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f299443d);
            aVar.mo74318e(2, this.f299444e);
            String str = this.f299445f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74318e(4, this.f299446g);
            aVar.mo74318e(5, this.f299447h);
            aVar.mo74318e(6, this.f299448i);
            aVar.mo74318e(7, this.f299449j);
            String str2 = this.f299450n;
            if (str2 != null) {
                aVar.mo74323j(8, str2);
            }
            aVar.mo74318e(9, this.f299451o);
            String str3 = this.f299452p;
            if (str3 != null) {
                aVar.mo74323j(10, str3);
            }
            aVar.mo74318e(11, this.f299453q);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f299443d) + 0 + C52418a.m58678e(2, this.f299444e);
            String str4 = this.f299445f;
            if (str4 != null) {
                e += C52418a.m58683j(3, str4);
            }
            int e2 = e + C52418a.m58678e(4, this.f299446g) + C52418a.m58678e(5, this.f299447h) + C52418a.m58678e(6, this.f299448i) + C52418a.m58678e(7, this.f299449j);
            String str5 = this.f299450n;
            if (str5 != null) {
                e2 += C52418a.m58683j(8, str5);
            }
            int e3 = e2 + C52418a.m58678e(9, this.f299451o);
            String str6 = this.f299452p;
            if (str6 != null) {
                e3 += C52418a.m58683j(10, str6);
            }
            return e3 + C52418a.m58678e(11, this.f299453q);
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
            C101842st2 st22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    st22.f299443d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    st22.f299444e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    st22.f299445f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    st22.f299446g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    st22.f299447h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    st22.f299448i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    st22.f299449j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    st22.f299450n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    st22.f299451o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    st22.f299452p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    st22.f299453q = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
