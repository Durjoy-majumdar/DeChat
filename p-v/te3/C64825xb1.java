package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.xb1 */
public class C64825xb1 extends C47465a {

    /* renamed from: d */
    public float f186282d;

    /* renamed from: e */
    public float f186283e;

    /* renamed from: f */
    public float f186284f;

    /* renamed from: g */
    public float f186285g;

    /* renamed from: h */
    public float f186286h;

    /* renamed from: i */
    public boolean f186287i;

    /* renamed from: j */
    public boolean f186288j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64825xb1)) {
            return false;
        }
        C64825xb1 xb12 = (C64825xb1) aVar;
        return C46238a.m51546a(Float.valueOf(this.f186282d), Float.valueOf(xb12.f186282d)) && C46238a.m51546a(Float.valueOf(this.f186283e), Float.valueOf(xb12.f186283e)) && C46238a.m51546a(Float.valueOf(this.f186284f), Float.valueOf(xb12.f186284f)) && C46238a.m51546a(Float.valueOf(this.f186285g), Float.valueOf(xb12.f186285g)) && C46238a.m51546a(Float.valueOf(this.f186286h), Float.valueOf(xb12.f186286h)) && C46238a.m51546a(Boolean.valueOf(this.f186287i), Boolean.valueOf(xb12.f186287i)) && C46238a.m51546a(Boolean.valueOf(this.f186288j), Boolean.valueOf(xb12.f186288j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74317d(1, this.f186282d);
            aVar.mo74317d(2, this.f186283e);
            aVar.mo74317d(3, this.f186284f);
            aVar.mo74317d(4, this.f186285g);
            aVar.mo74317d(5, this.f186286h);
            aVar.mo74314a(6, this.f186287i);
            aVar.mo74314a(7, this.f186288j);
            return 0;
        } else if (i == 1) {
            return C52418a.m58677d(1, this.f186282d) + 0 + C52418a.m58677d(2, this.f186283e) + C52418a.m58677d(3, this.f186284f) + C52418a.m58677d(4, this.f186285g) + C52418a.m58677d(5, this.f186286h) + C52418a.m58674a(6, this.f186287i) + C52418a.m58674a(7, this.f186288j);
        } else {
            if (i == 2) {
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
                C64825xb1 xb12 = objArr[1];
                int intValue = objArr[2].intValue();
                switch (intValue) {
                    case 1:
                        xb12.f186282d = aVar3.mo141628f(intValue);
                        return 0;
                    case 2:
                        xb12.f186283e = aVar3.mo141628f(intValue);
                        return 0;
                    case 3:
                        xb12.f186284f = aVar3.mo141628f(intValue);
                        return 0;
                    case 4:
                        xb12.f186285g = aVar3.mo141628f(intValue);
                        return 0;
                    case 5:
                        xb12.f186286h = aVar3.mo141628f(intValue);
                        return 0;
                    case 6:
                        xb12.f186287i = aVar3.mo141625c(intValue);
                        return 0;
                    case 7:
                        xb12.f186288j = aVar3.mo141625c(intValue);
                        return 0;
                    default:
                        return -1;
                }
            }
        }
    }
}
