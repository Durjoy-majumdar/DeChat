package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class q64 extends C47465a {

    /* renamed from: d */
    public String f184974d;

    /* renamed from: e */
    public int f184975e;

    /* renamed from: f */
    public String f184976f;

    /* renamed from: g */
    public String f184977g;

    /* renamed from: h */
    public int f184978h;

    /* renamed from: i */
    public int f184979i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof q64)) {
            return false;
        }
        q64 q64 = (q64) aVar;
        return C46238a.m51546a(this.f184974d, q64.f184974d) && C46238a.m51546a(Integer.valueOf(this.f184975e), Integer.valueOf(q64.f184975e)) && C46238a.m51546a(this.f184976f, q64.f184976f) && C46238a.m51546a(this.f184977g, q64.f184977g) && C46238a.m51546a(Integer.valueOf(this.f184978h), Integer.valueOf(q64.f184978h)) && C46238a.m51546a(Integer.valueOf(this.f184979i), Integer.valueOf(q64.f184979i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f184974d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f184975e);
            String str2 = this.f184976f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f184977g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            aVar.mo74318e(5, this.f184978h);
            aVar.mo74318e(6, this.f184979i);
            return 0;
        } else if (i == 1) {
            String str4 = this.f184974d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            int e = i2 + C52418a.m58678e(2, this.f184975e);
            String str5 = this.f184976f;
            if (str5 != null) {
                e += C52418a.m58683j(3, str5);
            }
            String str6 = this.f184977g;
            if (str6 != null) {
                e += C52418a.m58683j(4, str6);
            }
            return e + C52418a.m58678e(5, this.f184978h) + C52418a.m58678e(6, this.f184979i);
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
            q64 q64 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    q64.f184974d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    q64.f184975e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    q64.f184976f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    q64.f184977g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    q64.f184978h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    q64.f184979i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
