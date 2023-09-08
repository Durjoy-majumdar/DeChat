package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.qk1 */
public class C64659qk1 extends C47465a {

    /* renamed from: d */
    public String f185045d;

    /* renamed from: e */
    public String f185046e;

    /* renamed from: f */
    public String f185047f;

    /* renamed from: g */
    public String f185048g;

    /* renamed from: h */
    public int f185049h;

    /* renamed from: i */
    public String f185050i;

    /* renamed from: j */
    public String f185051j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64659qk1)) {
            return false;
        }
        C64659qk1 qk12 = (C64659qk1) aVar;
        return C46238a.m51546a(this.f185045d, qk12.f185045d) && C46238a.m51546a(this.f185046e, qk12.f185046e) && C46238a.m51546a(this.f185047f, qk12.f185047f) && C46238a.m51546a(this.f185048g, qk12.f185048g) && C46238a.m51546a(Integer.valueOf(this.f185049h), Integer.valueOf(qk12.f185049h)) && C46238a.m51546a(this.f185050i, qk12.f185050i) && C46238a.m51546a(this.f185051j, qk12.f185051j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f185045d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f185046e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f185047f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f185048g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            aVar.mo74318e(5, this.f185049h);
            String str5 = this.f185050i;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            String str6 = this.f185051j;
            if (str6 != null) {
                aVar.mo74323j(7, str6);
            }
            return 0;
        } else if (i == 1) {
            String str7 = this.f185045d;
            if (str7 != null) {
                i2 = 0 + C52418a.m58683j(1, str7);
            }
            String str8 = this.f185046e;
            if (str8 != null) {
                i2 += C52418a.m58683j(2, str8);
            }
            String str9 = this.f185047f;
            if (str9 != null) {
                i2 += C52418a.m58683j(3, str9);
            }
            String str10 = this.f185048g;
            if (str10 != null) {
                i2 += C52418a.m58683j(4, str10);
            }
            int e = i2 + C52418a.m58678e(5, this.f185049h);
            String str11 = this.f185050i;
            if (str11 != null) {
                e += C52418a.m58683j(6, str11);
            }
            String str12 = this.f185051j;
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
            C64659qk1 qk12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    qk12.f185045d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    qk12.f185046e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    qk12.f185047f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    qk12.f185048g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    qk12.f185049h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    qk12.f185050i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    qk12.f185051j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
