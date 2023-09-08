package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.pw0 */
public class C64639pw0 extends C47465a {

    /* renamed from: d */
    public int f184902d;

    /* renamed from: e */
    public float f184903e;

    /* renamed from: f */
    public int f184904f;

    /* renamed from: g */
    public int f184905g;

    /* renamed from: h */
    public float f184906h;

    /* renamed from: i */
    public int f184907i;

    /* renamed from: j */
    public int f184908j;

    /* renamed from: n */
    public long f184909n;

    /* renamed from: o */
    public String f184910o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64639pw0)) {
            return false;
        }
        C64639pw0 pw02 = (C64639pw0) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f184902d), Integer.valueOf(pw02.f184902d)) && C46238a.m51546a(Float.valueOf(this.f184903e), Float.valueOf(pw02.f184903e)) && C46238a.m51546a(Integer.valueOf(this.f184904f), Integer.valueOf(pw02.f184904f)) && C46238a.m51546a(Integer.valueOf(this.f184905g), Integer.valueOf(pw02.f184905g)) && C46238a.m51546a(Float.valueOf(this.f184906h), Float.valueOf(pw02.f184906h)) && C46238a.m51546a(Integer.valueOf(this.f184907i), Integer.valueOf(pw02.f184907i)) && C46238a.m51546a(Integer.valueOf(this.f184908j), Integer.valueOf(pw02.f184908j)) && C46238a.m51546a(Long.valueOf(this.f184909n), Long.valueOf(pw02.f184909n)) && C46238a.m51546a(this.f184910o, pw02.f184910o);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f184902d);
            aVar.mo74317d(2, this.f184903e);
            aVar.mo74318e(3, this.f184904f);
            aVar.mo74318e(4, this.f184905g);
            aVar.mo74317d(5, this.f184906h);
            aVar.mo74318e(6, this.f184907i);
            aVar.mo74318e(7, this.f184908j);
            aVar.mo74321h(11, this.f184909n);
            String str = this.f184910o;
            if (str != null) {
                aVar.mo74323j(21, str);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f184902d) + 0 + C52418a.m58677d(2, this.f184903e) + C52418a.m58678e(3, this.f184904f) + C52418a.m58678e(4, this.f184905g) + C52418a.m58677d(5, this.f184906h) + C52418a.m58678e(6, this.f184907i) + C52418a.m58678e(7, this.f184908j) + C52418a.m58681h(11, this.f184909n);
            String str2 = this.f184910o;
            return str2 != null ? e + C52418a.m58683j(21, str2) : e;
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
            C64639pw0 pw02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 11) {
                pw02.f184909n = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 21) {
                switch (intValue) {
                    case 1:
                        pw02.f184902d = aVar3.mo141629g(intValue);
                        return 0;
                    case 2:
                        pw02.f184903e = aVar3.mo141628f(intValue);
                        return 0;
                    case 3:
                        pw02.f184904f = aVar3.mo141629g(intValue);
                        return 0;
                    case 4:
                        pw02.f184905g = aVar3.mo141629g(intValue);
                        return 0;
                    case 5:
                        pw02.f184906h = aVar3.mo141628f(intValue);
                        return 0;
                    case 6:
                        pw02.f184907i = aVar3.mo141629g(intValue);
                        return 0;
                    case 7:
                        pw02.f184908j = aVar3.mo141629g(intValue);
                        return 0;
                    default:
                        return -1;
                }
            } else {
                pw02.f184910o = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
