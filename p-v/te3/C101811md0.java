package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.md0 */
public class C101811md0 extends C47465a {

    /* renamed from: d */
    public int f298813d;

    /* renamed from: e */
    public int f298814e;

    /* renamed from: f */
    public int f298815f;

    /* renamed from: g */
    public String f298816g;

    /* renamed from: h */
    public String f298817h;

    /* renamed from: i */
    public String f298818i;

    /* renamed from: j */
    public int f298819j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101811md0)) {
            return false;
        }
        C101811md0 md02 = (C101811md0) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f298813d), Integer.valueOf(md02.f298813d)) && C46238a.m51546a(Integer.valueOf(this.f298814e), Integer.valueOf(md02.f298814e)) && C46238a.m51546a(Integer.valueOf(this.f298815f), Integer.valueOf(md02.f298815f)) && C46238a.m51546a(this.f298816g, md02.f298816g) && C46238a.m51546a(this.f298817h, md02.f298817h) && C46238a.m51546a(this.f298818i, md02.f298818i) && C46238a.m51546a(Integer.valueOf(this.f298819j), Integer.valueOf(md02.f298819j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f298813d);
            aVar.mo74318e(2, this.f298814e);
            aVar.mo74318e(3, this.f298815f);
            String str = this.f298816g;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            String str2 = this.f298817h;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            String str3 = this.f298818i;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            aVar.mo74318e(7, this.f298819j);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f298813d) + 0 + C52418a.m58678e(2, this.f298814e) + C52418a.m58678e(3, this.f298815f);
            String str4 = this.f298816g;
            if (str4 != null) {
                e += C52418a.m58683j(4, str4);
            }
            String str5 = this.f298817h;
            if (str5 != null) {
                e += C52418a.m58683j(5, str5);
            }
            String str6 = this.f298818i;
            if (str6 != null) {
                e += C52418a.m58683j(6, str6);
            }
            return e + C52418a.m58678e(7, this.f298819j);
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
            C101811md0 md02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    md02.f298813d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    md02.f298814e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    md02.f298815f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    md02.f298816g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    md02.f298817h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    md02.f298818i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    md02.f298819j = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
