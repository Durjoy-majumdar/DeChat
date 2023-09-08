package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.j90 */
public class C49962j90 extends C47465a {

    /* renamed from: d */
    public int f135936d;

    /* renamed from: e */
    public int f135937e;

    /* renamed from: f */
    public int f135938f;

    /* renamed from: g */
    public String f135939g;

    /* renamed from: h */
    public String f135940h;

    /* renamed from: i */
    public String f135941i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49962j90)) {
            return false;
        }
        C49962j90 j902 = (C49962j90) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f135936d), Integer.valueOf(j902.f135936d)) && C46238a.m51546a(Integer.valueOf(this.f135937e), Integer.valueOf(j902.f135937e)) && C46238a.m51546a(Integer.valueOf(this.f135938f), Integer.valueOf(j902.f135938f)) && C46238a.m51546a(this.f135939g, j902.f135939g) && C46238a.m51546a(this.f135940h, j902.f135940h) && C46238a.m51546a(this.f135941i, j902.f135941i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f135936d);
            aVar.mo74318e(2, this.f135937e);
            aVar.mo74318e(3, this.f135938f);
            String str = this.f135939g;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            String str2 = this.f135940h;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            String str3 = this.f135941i;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f135936d) + 0 + C52418a.m58678e(2, this.f135937e) + C52418a.m58678e(3, this.f135938f);
            String str4 = this.f135939g;
            if (str4 != null) {
                e += C52418a.m58683j(4, str4);
            }
            String str5 = this.f135940h;
            if (str5 != null) {
                e += C52418a.m58683j(5, str5);
            }
            String str6 = this.f135941i;
            return str6 != null ? e + C52418a.m58683j(6, str6) : e;
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
            C49962j90 j902 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    j902.f135936d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    j902.f135937e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    j902.f135938f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    j902.f135939g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    j902.f135940h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    j902.f135941i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
