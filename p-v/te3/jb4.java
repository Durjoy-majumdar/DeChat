package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class jb4 extends C47465a {

    /* renamed from: d */
    public int f135996d;

    /* renamed from: e */
    public int f135997e;

    /* renamed from: f */
    public int f135998f;

    /* renamed from: g */
    public int f135999g;

    /* renamed from: h */
    public int f136000h;

    /* renamed from: i */
    public int f136001i;

    /* renamed from: j */
    public int f136002j;

    /* renamed from: n */
    public int f136003n;

    /* renamed from: o */
    public String f136004o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof jb4)) {
            return false;
        }
        jb4 jb4 = (jb4) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f135996d), Integer.valueOf(jb4.f135996d)) && C46238a.m51546a(Integer.valueOf(this.f135997e), Integer.valueOf(jb4.f135997e)) && C46238a.m51546a(Integer.valueOf(this.f135998f), Integer.valueOf(jb4.f135998f)) && C46238a.m51546a(Integer.valueOf(this.f135999g), Integer.valueOf(jb4.f135999g)) && C46238a.m51546a(Integer.valueOf(this.f136000h), Integer.valueOf(jb4.f136000h)) && C46238a.m51546a(Integer.valueOf(this.f136001i), Integer.valueOf(jb4.f136001i)) && C46238a.m51546a(Integer.valueOf(this.f136002j), Integer.valueOf(jb4.f136002j)) && C46238a.m51546a(Integer.valueOf(this.f136003n), Integer.valueOf(jb4.f136003n)) && C46238a.m51546a(this.f136004o, jb4.f136004o);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f135996d);
            aVar.mo74318e(2, this.f135997e);
            aVar.mo74318e(3, this.f135998f);
            aVar.mo74318e(4, this.f135999g);
            aVar.mo74318e(5, this.f136000h);
            aVar.mo74318e(6, this.f136001i);
            aVar.mo74318e(7, this.f136002j);
            aVar.mo74318e(8, this.f136003n);
            String str = this.f136004o;
            if (str != null) {
                aVar.mo74323j(9, str);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f135996d) + 0 + C52418a.m58678e(2, this.f135997e) + C52418a.m58678e(3, this.f135998f) + C52418a.m58678e(4, this.f135999g) + C52418a.m58678e(5, this.f136000h) + C52418a.m58678e(6, this.f136001i) + C52418a.m58678e(7, this.f136002j) + C52418a.m58678e(8, this.f136003n);
            String str2 = this.f136004o;
            return str2 != null ? e + C52418a.m58683j(9, str2) : e;
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
            jb4 jb4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    jb4.f135996d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    jb4.f135997e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    jb4.f135998f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    jb4.f135999g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    jb4.f136000h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    jb4.f136001i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    jb4.f136002j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    jb4.f136003n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    jb4.f136004o = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
