package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.li3 */
public class C50269li3 extends C47465a {

    /* renamed from: d */
    public String f137442d;

    /* renamed from: e */
    public String f137443e;

    /* renamed from: f */
    public boolean f137444f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50269li3)) {
            return false;
        }
        C50269li3 li32 = (C50269li3) aVar;
        return C46238a.m51546a(this.f137442d, li32.f137442d) && C46238a.m51546a(this.f137443e, li32.f137443e) && C46238a.m51546a(Boolean.valueOf(this.f137444f), Boolean.valueOf(li32.f137444f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f137442d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f137443e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74314a(3, this.f137444f);
            return 0;
        } else if (i == 1) {
            String str3 = this.f137442d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f137443e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            return i2 + C52418a.m58674a(3, this.f137444f);
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
            C50269li3 li32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                li32.f137442d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                li32.f137443e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                li32.f137444f = aVar3.mo141625c(intValue);
                return 0;
            }
        }
    }
}
