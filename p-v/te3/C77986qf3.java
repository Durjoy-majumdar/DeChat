package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.qf3 */
public class C77986qf3 extends C47465a {

    /* renamed from: d */
    public String f228119d;

    /* renamed from: e */
    public int f228120e;

    /* renamed from: f */
    public String f228121f;

    /* renamed from: g */
    public String f228122g;

    /* renamed from: h */
    public String f228123h;

    /* renamed from: i */
    public String f228124i;

    /* renamed from: j */
    public String f228125j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77986qf3)) {
            return false;
        }
        C77986qf3 qf32 = (C77986qf3) aVar;
        return C46238a.m51546a(this.f228119d, qf32.f228119d) && C46238a.m51546a(Integer.valueOf(this.f228120e), Integer.valueOf(qf32.f228120e)) && C46238a.m51546a(this.f228121f, qf32.f228121f) && C46238a.m51546a(this.f228122g, qf32.f228122g) && C46238a.m51546a(this.f228123h, qf32.f228123h) && C46238a.m51546a(this.f228124i, qf32.f228124i) && C46238a.m51546a(this.f228125j, qf32.f228125j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f228119d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f228120e);
            String str2 = this.f228121f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f228122g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f228123h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f228124i;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            String str6 = this.f228125j;
            if (str6 != null) {
                aVar.mo74323j(7, str6);
            }
            return 0;
        } else if (i == 1) {
            String str7 = this.f228119d;
            if (str7 != null) {
                i2 = 0 + C52418a.m58683j(1, str7);
            }
            int e = i2 + C52418a.m58678e(2, this.f228120e);
            String str8 = this.f228121f;
            if (str8 != null) {
                e += C52418a.m58683j(3, str8);
            }
            String str9 = this.f228122g;
            if (str9 != null) {
                e += C52418a.m58683j(4, str9);
            }
            String str10 = this.f228123h;
            if (str10 != null) {
                e += C52418a.m58683j(5, str10);
            }
            String str11 = this.f228124i;
            if (str11 != null) {
                e += C52418a.m58683j(6, str11);
            }
            String str12 = this.f228125j;
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
            C77986qf3 qf32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    qf32.f228119d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    qf32.f228120e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    qf32.f228121f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    qf32.f228122g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    qf32.f228123h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    qf32.f228124i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    qf32.f228125j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
