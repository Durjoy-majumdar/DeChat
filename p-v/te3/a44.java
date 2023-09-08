package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class a44 extends C47465a {

    /* renamed from: d */
    public String f130307d;

    /* renamed from: e */
    public String f130308e;

    /* renamed from: f */
    public String f130309f;

    /* renamed from: g */
    public String f130310g;

    /* renamed from: h */
    public String f130311h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof a44)) {
            return false;
        }
        a44 a44 = (a44) aVar;
        return C46238a.m51546a(this.f130307d, a44.f130307d) && C46238a.m51546a(this.f130308e, a44.f130308e) && C46238a.m51546a(this.f130309f, a44.f130309f) && C46238a.m51546a(this.f130310g, a44.f130310g) && C46238a.m51546a(this.f130311h, a44.f130311h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f130307d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f130308e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f130309f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f130310g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f130311h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            return 0;
        } else if (i == 1) {
            String str6 = this.f130307d;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            String str7 = this.f130308e;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            String str8 = this.f130309f;
            if (str8 != null) {
                i2 += C52418a.m58683j(3, str8);
            }
            String str9 = this.f130310g;
            if (str9 != null) {
                i2 += C52418a.m58683j(4, str9);
            }
            String str10 = this.f130311h;
            return str10 != null ? i2 + C52418a.m58683j(5, str10) : i2;
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
            a44 a44 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                a44.f130307d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                a44.f130308e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                a44.f130309f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                a44.f130310g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                a44.f130311h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
