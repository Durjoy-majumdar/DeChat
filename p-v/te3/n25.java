package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class n25 extends C47465a {

    /* renamed from: d */
    public String f138354d;

    /* renamed from: e */
    public int f138355e;

    /* renamed from: f */
    public int f138356f;

    /* renamed from: g */
    public int f138357g;

    /* renamed from: h */
    public int f138358h;

    /* renamed from: i */
    public int f138359i;

    /* renamed from: j */
    public String f138360j;

    /* renamed from: n */
    public String f138361n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof n25)) {
            return false;
        }
        n25 n25 = (n25) aVar;
        return C46238a.m51546a(this.f138354d, n25.f138354d) && C46238a.m51546a(Integer.valueOf(this.f138355e), Integer.valueOf(n25.f138355e)) && C46238a.m51546a(Integer.valueOf(this.f138356f), Integer.valueOf(n25.f138356f)) && C46238a.m51546a(Integer.valueOf(this.f138357g), Integer.valueOf(n25.f138357g)) && C46238a.m51546a(Integer.valueOf(this.f138358h), Integer.valueOf(n25.f138358h)) && C46238a.m51546a(Integer.valueOf(this.f138359i), Integer.valueOf(n25.f138359i)) && C46238a.m51546a(this.f138360j, n25.f138360j) && C46238a.m51546a(this.f138361n, n25.f138361n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f138354d;
            if (str != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                aVar.mo74318e(2, this.f138355e);
                aVar.mo74318e(3, this.f138356f);
                aVar.mo74318e(4, this.f138357g);
                aVar.mo74318e(5, this.f138358h);
                aVar.mo74318e(6, this.f138359i);
                String str2 = this.f138360j;
                if (str2 != null) {
                    aVar.mo74323j(7, str2);
                }
                String str3 = this.f138361n;
                if (str3 != null) {
                    aVar.mo74323j(8, str3);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: url");
        } else if (i == 1) {
            String str4 = this.f138354d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            int e = i2 + C52418a.m58678e(2, this.f138355e) + C52418a.m58678e(3, this.f138356f) + C52418a.m58678e(4, this.f138357g) + C52418a.m58678e(5, this.f138358h) + C52418a.m58678e(6, this.f138359i);
            String str5 = this.f138360j;
            if (str5 != null) {
                e += C52418a.m58683j(7, str5);
            }
            String str6 = this.f138361n;
            return str6 != null ? e + C52418a.m58683j(8, str6) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f138354d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: url");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            n25 n25 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    n25.f138354d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    n25.f138355e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    n25.f138356f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    n25.f138357g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    n25.f138358h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    n25.f138359i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    n25.f138360j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    n25.f138361n = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
