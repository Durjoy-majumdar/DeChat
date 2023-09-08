package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.bd0 */
public class C101760bd0 extends C47465a {

    /* renamed from: d */
    public int f297979d;

    /* renamed from: e */
    public int f297980e;

    /* renamed from: f */
    public int f297981f;

    /* renamed from: g */
    public int f297982g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101760bd0)) {
            return false;
        }
        C101760bd0 bd02 = (C101760bd0) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f297979d), Integer.valueOf(bd02.f297979d)) && C46238a.m51546a(Integer.valueOf(this.f297980e), Integer.valueOf(bd02.f297980e)) && C46238a.m51546a(Integer.valueOf(this.f297981f), Integer.valueOf(bd02.f297981f)) && C46238a.m51546a(Integer.valueOf(this.f297982g), Integer.valueOf(bd02.f297982g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f297979d);
            aVar.mo74318e(2, this.f297980e);
            aVar.mo74318e(3, this.f297981f);
            aVar.mo74318e(4, this.f297982g);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f297979d) + 0 + C52418a.m58678e(2, this.f297980e) + C52418a.m58678e(3, this.f297981f) + C52418a.m58678e(4, this.f297982g);
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
                C101760bd0 bd02 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    bd02.f297979d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    bd02.f297980e = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 3) {
                    bd02.f297981f = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 4) {
                    return -1;
                } else {
                    bd02.f297982g = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
