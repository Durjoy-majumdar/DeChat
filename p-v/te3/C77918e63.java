package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.e63 */
public class C77918e63 extends C47465a {

    /* renamed from: d */
    public String f227203d;

    /* renamed from: e */
    public int f227204e;

    /* renamed from: f */
    public int f227205f;

    /* renamed from: g */
    public int f227206g;

    /* renamed from: h */
    public String f227207h;

    /* renamed from: i */
    public int f227208i;

    /* renamed from: j */
    public int f227209j;

    /* renamed from: n */
    public int f227210n;

    /* renamed from: o */
    public String f227211o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77918e63)) {
            return false;
        }
        C77918e63 e632 = (C77918e63) aVar;
        return C46238a.m51546a(this.f227203d, e632.f227203d) && C46238a.m51546a(Integer.valueOf(this.f227204e), Integer.valueOf(e632.f227204e)) && C46238a.m51546a(Integer.valueOf(this.f227205f), Integer.valueOf(e632.f227205f)) && C46238a.m51546a(Integer.valueOf(this.f227206g), Integer.valueOf(e632.f227206g)) && C46238a.m51546a(this.f227207h, e632.f227207h) && C46238a.m51546a(Integer.valueOf(this.f227208i), Integer.valueOf(e632.f227208i)) && C46238a.m51546a(Integer.valueOf(this.f227209j), Integer.valueOf(e632.f227209j)) && C46238a.m51546a(Integer.valueOf(this.f227210n), Integer.valueOf(e632.f227210n)) && C46238a.m51546a(this.f227211o, e632.f227211o);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f227203d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f227204e);
            aVar.mo74318e(3, this.f227205f);
            aVar.mo74318e(4, this.f227206g);
            String str2 = this.f227207h;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            aVar.mo74318e(6, this.f227208i);
            aVar.mo74318e(7, this.f227209j);
            aVar.mo74318e(8, this.f227210n);
            String str3 = this.f227211o;
            if (str3 != null) {
                aVar.mo74323j(9, str3);
            }
            return 0;
        } else if (i == 1) {
            String str4 = this.f227203d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            int e = i2 + C52418a.m58678e(2, this.f227204e) + C52418a.m58678e(3, this.f227205f) + C52418a.m58678e(4, this.f227206g);
            String str5 = this.f227207h;
            if (str5 != null) {
                e += C52418a.m58683j(5, str5);
            }
            int e2 = e + C52418a.m58678e(6, this.f227208i) + C52418a.m58678e(7, this.f227209j) + C52418a.m58678e(8, this.f227210n);
            String str6 = this.f227211o;
            return str6 != null ? e2 + C52418a.m58683j(9, str6) : e2;
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
            C77918e63 e632 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    e632.f227203d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    e632.f227204e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    e632.f227205f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    e632.f227206g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    e632.f227207h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    e632.f227208i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    e632.f227209j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    e632.f227210n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    e632.f227211o = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
