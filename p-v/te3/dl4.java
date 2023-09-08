package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class dl4 extends C47465a {

    /* renamed from: d */
    public int f182772d;

    /* renamed from: e */
    public String f182773e;

    /* renamed from: f */
    public String f182774f;

    /* renamed from: g */
    public String f182775g;

    /* renamed from: h */
    public String f182776h;

    /* renamed from: i */
    public String f182777i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof dl4)) {
            return false;
        }
        dl4 dl4 = (dl4) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f182772d), Integer.valueOf(dl4.f182772d)) && C46238a.m51546a(this.f182773e, dl4.f182773e) && C46238a.m51546a(this.f182774f, dl4.f182774f) && C46238a.m51546a(this.f182775g, dl4.f182775g) && C46238a.m51546a(this.f182776h, dl4.f182776h) && C46238a.m51546a(this.f182777i, dl4.f182777i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f182772d);
            String str = this.f182773e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f182774f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f182775g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f182776h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f182777i;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f182772d) + 0;
            String str6 = this.f182773e;
            if (str6 != null) {
                e += C52418a.m58683j(2, str6);
            }
            String str7 = this.f182774f;
            if (str7 != null) {
                e += C52418a.m58683j(3, str7);
            }
            String str8 = this.f182775g;
            if (str8 != null) {
                e += C52418a.m58683j(4, str8);
            }
            String str9 = this.f182776h;
            if (str9 != null) {
                e += C52418a.m58683j(5, str9);
            }
            String str10 = this.f182777i;
            return str10 != null ? e + C52418a.m58683j(6, str10) : e;
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
            dl4 dl4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    dl4.f182772d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    dl4.f182773e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    dl4.f182774f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    dl4.f182775g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    dl4.f182776h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    dl4.f182777i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
