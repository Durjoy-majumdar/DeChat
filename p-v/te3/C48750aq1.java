package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.aq1 */
public class C48750aq1 extends C47465a {

    /* renamed from: d */
    public String f130723d;

    /* renamed from: e */
    public int f130724e;

    /* renamed from: f */
    public int f130725f;

    /* renamed from: g */
    public String f130726g;

    /* renamed from: h */
    public String f130727h;

    /* renamed from: i */
    public String f130728i;

    /* renamed from: j */
    public String f130729j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48750aq1)) {
            return false;
        }
        C48750aq1 aq12 = (C48750aq1) aVar;
        return C46238a.m51546a(this.f130723d, aq12.f130723d) && C46238a.m51546a(Integer.valueOf(this.f130724e), Integer.valueOf(aq12.f130724e)) && C46238a.m51546a(Integer.valueOf(this.f130725f), Integer.valueOf(aq12.f130725f)) && C46238a.m51546a(this.f130726g, aq12.f130726g) && C46238a.m51546a(this.f130727h, aq12.f130727h) && C46238a.m51546a(this.f130728i, aq12.f130728i) && C46238a.m51546a(this.f130729j, aq12.f130729j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f130723d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f130724e);
            aVar.mo74318e(3, this.f130725f);
            String str2 = this.f130726g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f130727h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            String str4 = this.f130728i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            String str5 = this.f130729j;
            if (str5 != null) {
                aVar.mo74323j(7, str5);
            }
            return 0;
        } else if (i == 1) {
            String str6 = this.f130723d;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            int e = i2 + C52418a.m58678e(2, this.f130724e) + C52418a.m58678e(3, this.f130725f);
            String str7 = this.f130726g;
            if (str7 != null) {
                e += C52418a.m58683j(4, str7);
            }
            String str8 = this.f130727h;
            if (str8 != null) {
                e += C52418a.m58683j(5, str8);
            }
            String str9 = this.f130728i;
            if (str9 != null) {
                e += C52418a.m58683j(6, str9);
            }
            String str10 = this.f130729j;
            return str10 != null ? e + C52418a.m58683j(7, str10) : e;
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
            C48750aq1 aq12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    aq12.f130723d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    aq12.f130724e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    aq12.f130725f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    aq12.f130726g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    aq12.f130727h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    aq12.f130728i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    aq12.f130729j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
