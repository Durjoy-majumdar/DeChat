package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.aw0 */
public class C48770aw0 extends C47465a {

    /* renamed from: d */
    public int f130789d;

    /* renamed from: e */
    public String f130790e;

    /* renamed from: f */
    public int f130791f;

    /* renamed from: g */
    public String f130792g;

    /* renamed from: h */
    public String f130793h;

    /* renamed from: i */
    public int f130794i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48770aw0)) {
            return false;
        }
        C48770aw0 aw02 = (C48770aw0) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f130789d), Integer.valueOf(aw02.f130789d)) && C46238a.m51546a(this.f130790e, aw02.f130790e) && C46238a.m51546a(Integer.valueOf(this.f130791f), Integer.valueOf(aw02.f130791f)) && C46238a.m51546a(this.f130792g, aw02.f130792g) && C46238a.m51546a(this.f130793h, aw02.f130793h) && C46238a.m51546a(Integer.valueOf(this.f130794i), Integer.valueOf(aw02.f130794i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f130789d);
            String str = this.f130790e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f130791f);
            String str2 = this.f130792g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f130793h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            aVar.mo74318e(6, this.f130794i);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f130789d) + 0;
            String str4 = this.f130790e;
            if (str4 != null) {
                e += C52418a.m58683j(2, str4);
            }
            int e2 = e + C52418a.m58678e(3, this.f130791f);
            String str5 = this.f130792g;
            if (str5 != null) {
                e2 += C52418a.m58683j(4, str5);
            }
            String str6 = this.f130793h;
            if (str6 != null) {
                e2 += C52418a.m58683j(5, str6);
            }
            return e2 + C52418a.m58678e(6, this.f130794i);
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
            C48770aw0 aw02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    aw02.f130789d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    aw02.f130790e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    aw02.f130791f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    aw02.f130792g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    aw02.f130793h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    aw02.f130794i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
