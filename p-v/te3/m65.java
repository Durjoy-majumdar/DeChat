package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class m65 extends C47465a {

    /* renamed from: d */
    public String f137881d;

    /* renamed from: e */
    public int f137882e;

    /* renamed from: f */
    public String f137883f;

    /* renamed from: g */
    public String f137884g;

    /* renamed from: h */
    public String f137885h;

    /* renamed from: i */
    public String f137886i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof m65)) {
            return false;
        }
        m65 m65 = (m65) aVar;
        return C46238a.m51546a(this.f137881d, m65.f137881d) && C46238a.m51546a(Integer.valueOf(this.f137882e), Integer.valueOf(m65.f137882e)) && C46238a.m51546a(this.f137883f, m65.f137883f) && C46238a.m51546a(this.f137884g, m65.f137884g) && C46238a.m51546a(this.f137885h, m65.f137885h) && C46238a.m51546a(this.f137886i, m65.f137886i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f137881d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f137882e);
            String str2 = this.f137883f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f137884g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f137885h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f137886i;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            return 0;
        } else if (i == 1) {
            String str6 = this.f137881d;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            int e = i2 + C52418a.m58678e(2, this.f137882e);
            String str7 = this.f137883f;
            if (str7 != null) {
                e += C52418a.m58683j(3, str7);
            }
            String str8 = this.f137884g;
            if (str8 != null) {
                e += C52418a.m58683j(4, str8);
            }
            String str9 = this.f137885h;
            if (str9 != null) {
                e += C52418a.m58683j(5, str9);
            }
            String str10 = this.f137886i;
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
            m65 m65 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    m65.f137881d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    m65.f137882e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    m65.f137883f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    m65.f137884g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    m65.f137885h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    m65.f137886i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
