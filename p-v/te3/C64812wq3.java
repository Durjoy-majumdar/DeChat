package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.wq3 */
public class C64812wq3 extends C47465a {

    /* renamed from: d */
    public String f186186d;

    /* renamed from: e */
    public String f186187e;

    /* renamed from: f */
    public String f186188f;

    /* renamed from: g */
    public boolean f186189g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64812wq3)) {
            return false;
        }
        C64812wq3 wq32 = (C64812wq3) aVar;
        return C46238a.m51546a(this.f186186d, wq32.f186186d) && C46238a.m51546a(this.f186187e, wq32.f186187e) && C46238a.m51546a(this.f186188f, wq32.f186188f) && C46238a.m51546a(Boolean.valueOf(this.f186189g), Boolean.valueOf(wq32.f186189g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f186186d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f186187e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f186188f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            aVar.mo74314a(4, this.f186189g);
            return 0;
        } else if (i == 1) {
            String str4 = this.f186186d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f186187e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f186188f;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            return i2 + C52418a.m58674a(4, this.f186189g);
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
            C64812wq3 wq32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                wq32.f186186d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                wq32.f186187e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                wq32.f186188f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                wq32.f186189g = aVar3.mo141625c(intValue);
                return 0;
            }
        }
    }
}
