package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.bf0 */
public class C64258bf0 extends C47465a {

    /* renamed from: d */
    public String f182280d;

    /* renamed from: e */
    public String f182281e;

    /* renamed from: f */
    public String f182282f;

    /* renamed from: g */
    public int f182283g;

    /* renamed from: h */
    public long f182284h;

    /* renamed from: i */
    public String f182285i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64258bf0)) {
            return false;
        }
        C64258bf0 bf02 = (C64258bf0) aVar;
        return C46238a.m51546a(this.f182280d, bf02.f182280d) && C46238a.m51546a(this.f182281e, bf02.f182281e) && C46238a.m51546a(this.f182282f, bf02.f182282f) && C46238a.m51546a(Integer.valueOf(this.f182283g), Integer.valueOf(bf02.f182283g)) && C46238a.m51546a(Long.valueOf(this.f182284h), Long.valueOf(bf02.f182284h)) && C46238a.m51546a(this.f182285i, bf02.f182285i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f182280d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f182281e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f182282f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            aVar.mo74318e(4, this.f182283g);
            aVar.mo74321h(5, this.f182284h);
            String str4 = this.f182285i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            return 0;
        } else if (i == 1) {
            String str5 = this.f182280d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f182281e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            String str7 = this.f182282f;
            if (str7 != null) {
                i2 += C52418a.m58683j(3, str7);
            }
            int e = i2 + C52418a.m58678e(4, this.f182283g) + C52418a.m58681h(5, this.f182284h);
            String str8 = this.f182285i;
            return str8 != null ? e + C52418a.m58683j(6, str8) : e;
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
            C64258bf0 bf02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    bf02.f182280d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    bf02.f182281e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    bf02.f182282f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    bf02.f182283g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    bf02.f182284h = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    bf02.f182285i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
