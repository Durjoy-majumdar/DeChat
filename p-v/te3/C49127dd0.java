package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.dd0 */
public class C49127dd0 extends C47465a {

    /* renamed from: d */
    public int f132242d;

    /* renamed from: e */
    public int f132243e;

    /* renamed from: f */
    public String f132244f;

    /* renamed from: g */
    public int f132245g;

    /* renamed from: h */
    public int f132246h;

    /* renamed from: i */
    public int f132247i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49127dd0)) {
            return false;
        }
        C49127dd0 dd02 = (C49127dd0) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f132242d), Integer.valueOf(dd02.f132242d)) && C46238a.m51546a(Integer.valueOf(this.f132243e), Integer.valueOf(dd02.f132243e)) && C46238a.m51546a(this.f132244f, dd02.f132244f) && C46238a.m51546a(Integer.valueOf(this.f132245g), Integer.valueOf(dd02.f132245g)) && C46238a.m51546a(Integer.valueOf(this.f132246h), Integer.valueOf(dd02.f132246h)) && C46238a.m51546a(Integer.valueOf(this.f132247i), Integer.valueOf(dd02.f132247i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f132242d);
            aVar.mo74318e(2, this.f132243e);
            String str = this.f132244f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74318e(4, this.f132245g);
            aVar.mo74318e(5, this.f132246h);
            aVar.mo74318e(6, this.f132247i);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f132242d) + 0 + C52418a.m58678e(2, this.f132243e);
            String str2 = this.f132244f;
            if (str2 != null) {
                e += C52418a.m58683j(3, str2);
            }
            return e + C52418a.m58678e(4, this.f132245g) + C52418a.m58678e(5, this.f132246h) + C52418a.m58678e(6, this.f132247i);
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
            C49127dd0 dd02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    dd02.f132242d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    dd02.f132243e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    dd02.f132244f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    dd02.f132245g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    dd02.f132246h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    dd02.f132247i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
