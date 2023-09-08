package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class bk4 extends C47465a {

    /* renamed from: d */
    public int f353920d;

    /* renamed from: e */
    public int f353921e;

    /* renamed from: f */
    public int f353922f;

    /* renamed from: g */
    public int f353923g;

    /* renamed from: h */
    public String f353924h;

    /* renamed from: i */
    public String f353925i;

    /* renamed from: j */
    public int f353926j;

    /* renamed from: n */
    public int f353927n;

    /* renamed from: o */
    public int f353928o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof bk4)) {
            return false;
        }
        bk4 bk4 = (bk4) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f353920d), Integer.valueOf(bk4.f353920d)) && C46238a.m51546a(Integer.valueOf(this.f353921e), Integer.valueOf(bk4.f353921e)) && C46238a.m51546a(Integer.valueOf(this.f353922f), Integer.valueOf(bk4.f353922f)) && C46238a.m51546a(Integer.valueOf(this.f353923g), Integer.valueOf(bk4.f353923g)) && C46238a.m51546a(this.f353924h, bk4.f353924h) && C46238a.m51546a(this.f353925i, bk4.f353925i) && C46238a.m51546a(Integer.valueOf(this.f353926j), Integer.valueOf(bk4.f353926j)) && C46238a.m51546a(Integer.valueOf(this.f353927n), Integer.valueOf(bk4.f353927n)) && C46238a.m51546a(Integer.valueOf(this.f353928o), Integer.valueOf(bk4.f353928o));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f353920d);
            aVar.mo74318e(2, this.f353921e);
            aVar.mo74318e(3, this.f353922f);
            aVar.mo74318e(4, this.f353923g);
            String str = this.f353924h;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            String str2 = this.f353925i;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            aVar.mo74318e(7, this.f353926j);
            aVar.mo74318e(8, this.f353927n);
            aVar.mo74318e(9, this.f353928o);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f353920d) + 0 + C52418a.m58678e(2, this.f353921e) + C52418a.m58678e(3, this.f353922f) + C52418a.m58678e(4, this.f353923g);
            String str3 = this.f353924h;
            if (str3 != null) {
                e += C52418a.m58683j(5, str3);
            }
            String str4 = this.f353925i;
            if (str4 != null) {
                e += C52418a.m58683j(6, str4);
            }
            return e + C52418a.m58678e(7, this.f353926j) + C52418a.m58678e(8, this.f353927n) + C52418a.m58678e(9, this.f353928o);
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
            bk4 bk4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    bk4.f353920d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    bk4.f353921e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    bk4.f353922f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    bk4.f353923g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    bk4.f353924h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    bk4.f353925i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    bk4.f353926j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    bk4.f353927n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    bk4.f353928o = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
