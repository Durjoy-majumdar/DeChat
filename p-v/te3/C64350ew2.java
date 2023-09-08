package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ew2 */
public class C64350ew2 extends C47465a {

    /* renamed from: d */
    public String f183039d;

    /* renamed from: e */
    public String f183040e;

    /* renamed from: f */
    public float f183041f;

    /* renamed from: g */
    public float f183042g;

    /* renamed from: h */
    public String f183043h;

    /* renamed from: i */
    public int f183044i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64350ew2)) {
            return false;
        }
        C64350ew2 ew22 = (C64350ew2) aVar;
        return C46238a.m51546a(this.f183039d, ew22.f183039d) && C46238a.m51546a(this.f183040e, ew22.f183040e) && C46238a.m51546a(Float.valueOf(this.f183041f), Float.valueOf(ew22.f183041f)) && C46238a.m51546a(Float.valueOf(this.f183042g), Float.valueOf(ew22.f183042g)) && C46238a.m51546a(this.f183043h, ew22.f183043h) && C46238a.m51546a(Integer.valueOf(this.f183044i), Integer.valueOf(ew22.f183044i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f183039d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f183040e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74317d(3, this.f183041f);
            aVar.mo74317d(4, this.f183042g);
            String str3 = this.f183043h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            aVar.mo74318e(6, this.f183044i);
            return 0;
        } else if (i == 1) {
            String str4 = this.f183039d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f183040e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            int d = i2 + C52418a.m58677d(3, this.f183041f) + C52418a.m58677d(4, this.f183042g);
            String str6 = this.f183043h;
            if (str6 != null) {
                d += C52418a.m58683j(5, str6);
            }
            return d + C52418a.m58678e(6, this.f183044i);
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
            C64350ew2 ew22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ew22.f183039d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    ew22.f183040e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    ew22.f183041f = aVar3.mo141628f(intValue);
                    return 0;
                case 4:
                    ew22.f183042g = aVar3.mo141628f(intValue);
                    return 0;
                case 5:
                    ew22.f183043h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    ew22.f183044i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
