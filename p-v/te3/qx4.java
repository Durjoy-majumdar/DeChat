package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class qx4 extends C47465a {

    /* renamed from: d */
    public String f140602d;

    /* renamed from: e */
    public String f140603e;

    /* renamed from: f */
    public String f140604f;

    /* renamed from: g */
    public String f140605g;

    /* renamed from: h */
    public String f140606h;

    /* renamed from: i */
    public int f140607i;

    /* renamed from: j */
    public String f140608j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof qx4)) {
            return false;
        }
        qx4 qx4 = (qx4) aVar;
        return C46238a.m51546a(this.f140602d, qx4.f140602d) && C46238a.m51546a(this.f140603e, qx4.f140603e) && C46238a.m51546a(this.f140604f, qx4.f140604f) && C46238a.m51546a(this.f140605g, qx4.f140605g) && C46238a.m51546a(this.f140606h, qx4.f140606h) && C46238a.m51546a(Integer.valueOf(this.f140607i), Integer.valueOf(qx4.f140607i)) && C46238a.m51546a(this.f140608j, qx4.f140608j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f140602d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f140603e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f140604f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f140605g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f140606h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            aVar.mo74318e(6, this.f140607i);
            String str6 = this.f140608j;
            if (str6 != null) {
                aVar.mo74323j(7, str6);
            }
            return 0;
        } else if (i == 1) {
            String str7 = this.f140602d;
            if (str7 != null) {
                i2 = 0 + C52418a.m58683j(1, str7);
            }
            String str8 = this.f140603e;
            if (str8 != null) {
                i2 += C52418a.m58683j(2, str8);
            }
            String str9 = this.f140604f;
            if (str9 != null) {
                i2 += C52418a.m58683j(3, str9);
            }
            String str10 = this.f140605g;
            if (str10 != null) {
                i2 += C52418a.m58683j(4, str10);
            }
            String str11 = this.f140606h;
            if (str11 != null) {
                i2 += C52418a.m58683j(5, str11);
            }
            int e = i2 + C52418a.m58678e(6, this.f140607i);
            String str12 = this.f140608j;
            return str12 != null ? e + C52418a.m58683j(7, str12) : e;
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
            qx4 qx4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    qx4.f140602d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    qx4.f140603e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    qx4.f140604f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    qx4.f140605g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    qx4.f140606h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    qx4.f140607i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    qx4.f140608j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
