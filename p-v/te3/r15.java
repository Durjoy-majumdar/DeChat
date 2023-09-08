package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class r15 extends C47465a {

    /* renamed from: d */
    public String f140665d;

    /* renamed from: e */
    public int f140666e;

    /* renamed from: f */
    public int f140667f;

    /* renamed from: g */
    public int f140668g;

    /* renamed from: h */
    public int f140669h;

    /* renamed from: i */
    public String f140670i;

    /* renamed from: j */
    public int f140671j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof r15)) {
            return false;
        }
        r15 r15 = (r15) aVar;
        return C46238a.m51546a(this.f140665d, r15.f140665d) && C46238a.m51546a(Integer.valueOf(this.f140666e), Integer.valueOf(r15.f140666e)) && C46238a.m51546a(Integer.valueOf(this.f140667f), Integer.valueOf(r15.f140667f)) && C46238a.m51546a(Integer.valueOf(this.f140668g), Integer.valueOf(r15.f140668g)) && C46238a.m51546a(Integer.valueOf(this.f140669h), Integer.valueOf(r15.f140669h)) && C46238a.m51546a(this.f140670i, r15.f140670i) && C46238a.m51546a(Integer.valueOf(this.f140671j), Integer.valueOf(r15.f140671j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f140665d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f140666e);
            aVar.mo74318e(3, this.f140667f);
            aVar.mo74318e(4, this.f140668g);
            aVar.mo74318e(5, this.f140669h);
            String str2 = this.f140670i;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            aVar.mo74318e(7, this.f140671j);
            return 0;
        } else if (i == 1) {
            String str3 = this.f140665d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            int e = i2 + C52418a.m58678e(2, this.f140666e) + C52418a.m58678e(3, this.f140667f) + C52418a.m58678e(4, this.f140668g) + C52418a.m58678e(5, this.f140669h);
            String str4 = this.f140670i;
            if (str4 != null) {
                e += C52418a.m58683j(6, str4);
            }
            return e + C52418a.m58678e(7, this.f140671j);
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
            r15 r15 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    r15.f140665d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    r15.f140666e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    r15.f140667f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    r15.f140668g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    r15.f140669h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    r15.f140670i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    r15.f140671j = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
