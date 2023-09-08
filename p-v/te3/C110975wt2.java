package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.wt2 */
public class C110975wt2 extends C47465a {

    /* renamed from: d */
    public int f332321d;

    /* renamed from: e */
    public int f332322e;

    /* renamed from: f */
    public int f332323f;

    /* renamed from: g */
    public int f332324g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C110975wt2)) {
            return false;
        }
        C110975wt2 wt22 = (C110975wt2) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f332321d), Integer.valueOf(wt22.f332321d)) && C46238a.m51546a(Integer.valueOf(this.f332322e), Integer.valueOf(wt22.f332322e)) && C46238a.m51546a(Integer.valueOf(this.f332323f), Integer.valueOf(wt22.f332323f)) && C46238a.m51546a(Integer.valueOf(this.f332324g), Integer.valueOf(wt22.f332324g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f332321d);
            aVar.mo74318e(2, this.f332322e);
            aVar.mo74318e(3, this.f332323f);
            aVar.mo74318e(4, this.f332324g);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f332321d) + 0 + C52418a.m58678e(2, this.f332322e) + C52418a.m58678e(3, this.f332323f) + C52418a.m58678e(4, this.f332324g);
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
                C110975wt2 wt22 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    wt22.f332321d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    wt22.f332322e = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 3) {
                    wt22.f332323f = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 4) {
                    return -1;
                } else {
                    wt22.f332324g = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
