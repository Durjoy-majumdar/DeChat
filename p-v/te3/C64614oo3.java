package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.oo3 */
public class C64614oo3 extends C47465a {

    /* renamed from: d */
    public int f184682d;

    /* renamed from: e */
    public int f184683e;

    /* renamed from: f */
    public int f184684f;

    /* renamed from: g */
    public boolean f184685g;

    /* renamed from: h */
    public int f184686h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64614oo3)) {
            return false;
        }
        C64614oo3 oo32 = (C64614oo3) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f184682d), Integer.valueOf(oo32.f184682d)) && C46238a.m51546a(Integer.valueOf(this.f184683e), Integer.valueOf(oo32.f184683e)) && C46238a.m51546a(Integer.valueOf(this.f184684f), Integer.valueOf(oo32.f184684f)) && C46238a.m51546a(Boolean.valueOf(this.f184685g), Boolean.valueOf(oo32.f184685g)) && C46238a.m51546a(Integer.valueOf(this.f184686h), Integer.valueOf(oo32.f184686h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f184682d);
            aVar.mo74318e(2, this.f184683e);
            aVar.mo74318e(3, this.f184684f);
            aVar.mo74314a(4, this.f184685g);
            aVar.mo74318e(5, this.f184686h);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f184682d) + 0 + C52418a.m58678e(2, this.f184683e) + C52418a.m58678e(3, this.f184684f) + C52418a.m58674a(4, this.f184685g) + C52418a.m58678e(5, this.f184686h);
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
                C64614oo3 oo32 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    oo32.f184682d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    oo32.f184683e = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 3) {
                    oo32.f184684f = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 4) {
                    oo32.f184685g = aVar3.mo141625c(intValue);
                    return 0;
                } else if (intValue != 5) {
                    return -1;
                } else {
                    oo32.f184686h = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
