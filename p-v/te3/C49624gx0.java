package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.gx0 */
public class C49624gx0 extends C47465a {

    /* renamed from: d */
    public int f134337d;

    /* renamed from: e */
    public int f134338e;

    /* renamed from: f */
    public int f134339f;

    /* renamed from: g */
    public int f134340g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49624gx0)) {
            return false;
        }
        C49624gx0 gx02 = (C49624gx0) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f134337d), Integer.valueOf(gx02.f134337d)) && C46238a.m51546a(Integer.valueOf(this.f134338e), Integer.valueOf(gx02.f134338e)) && C46238a.m51546a(Integer.valueOf(this.f134339f), Integer.valueOf(gx02.f134339f)) && C46238a.m51546a(Integer.valueOf(this.f134340g), Integer.valueOf(gx02.f134340g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f134337d);
            aVar.mo74318e(2, this.f134338e);
            aVar.mo74318e(3, this.f134339f);
            aVar.mo74318e(4, this.f134340g);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f134337d) + 0 + C52418a.m58678e(2, this.f134338e) + C52418a.m58678e(3, this.f134339f) + C52418a.m58678e(4, this.f134340g);
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
                C49624gx0 gx02 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    gx02.f134337d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    gx02.f134338e = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 3) {
                    gx02.f134339f = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 4) {
                    return -1;
                } else {
                    gx02.f134340g = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
