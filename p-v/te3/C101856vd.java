package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.vd */
public class C101856vd extends C47465a {

    /* renamed from: d */
    public int f299665d;

    /* renamed from: e */
    public int f299666e;

    /* renamed from: f */
    public int f299667f;

    /* renamed from: g */
    public String f299668g;

    /* renamed from: h */
    public String f299669h;

    /* renamed from: i */
    public int f299670i;

    /* renamed from: j */
    public String f299671j;

    /* renamed from: n */
    public String f299672n;

    /* renamed from: o */
    public int f299673o;

    /* renamed from: p */
    public long f299674p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101856vd)) {
            return false;
        }
        C101856vd vdVar = (C101856vd) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f299665d), Integer.valueOf(vdVar.f299665d)) && C46238a.m51546a(Integer.valueOf(this.f299666e), Integer.valueOf(vdVar.f299666e)) && C46238a.m51546a(Integer.valueOf(this.f299667f), Integer.valueOf(vdVar.f299667f)) && C46238a.m51546a(this.f299668g, vdVar.f299668g) && C46238a.m51546a(this.f299669h, vdVar.f299669h) && C46238a.m51546a(Integer.valueOf(this.f299670i), Integer.valueOf(vdVar.f299670i)) && C46238a.m51546a(this.f299671j, vdVar.f299671j) && C46238a.m51546a(this.f299672n, vdVar.f299672n) && C46238a.m51546a(Integer.valueOf(this.f299673o), Integer.valueOf(vdVar.f299673o)) && C46238a.m51546a(Long.valueOf(this.f299674p), Long.valueOf(vdVar.f299674p));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f299665d);
            aVar.mo74318e(2, this.f299666e);
            aVar.mo74318e(3, this.f299667f);
            String str = this.f299668g;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            String str2 = this.f299669h;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            aVar.mo74318e(6, this.f299670i);
            String str3 = this.f299671j;
            if (str3 != null) {
                aVar.mo74323j(7, str3);
            }
            String str4 = this.f299672n;
            if (str4 != null) {
                aVar.mo74323j(8, str4);
            }
            aVar.mo74318e(9, this.f299673o);
            aVar.mo74321h(10, this.f299674p);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f299665d) + 0 + C52418a.m58678e(2, this.f299666e) + C52418a.m58678e(3, this.f299667f);
            String str5 = this.f299668g;
            if (str5 != null) {
                e += C52418a.m58683j(4, str5);
            }
            String str6 = this.f299669h;
            if (str6 != null) {
                e += C52418a.m58683j(5, str6);
            }
            int e2 = e + C52418a.m58678e(6, this.f299670i);
            String str7 = this.f299671j;
            if (str7 != null) {
                e2 += C52418a.m58683j(7, str7);
            }
            String str8 = this.f299672n;
            if (str8 != null) {
                e2 += C52418a.m58683j(8, str8);
            }
            return e2 + C52418a.m58678e(9, this.f299673o) + C52418a.m58681h(10, this.f299674p);
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
            C101856vd vdVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    vdVar.f299665d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    vdVar.f299666e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    vdVar.f299667f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    vdVar.f299668g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    vdVar.f299669h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    vdVar.f299670i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    vdVar.f299671j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    vdVar.f299672n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    vdVar.f299673o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    vdVar.f299674p = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
