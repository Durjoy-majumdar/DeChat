package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.vh1 */
public class C51695vh1 extends C47465a {

    /* renamed from: d */
    public boolean f143484d;

    /* renamed from: e */
    public int f143485e;

    /* renamed from: f */
    public boolean f143486f;

    /* renamed from: g */
    public int f143487g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51695vh1)) {
            return false;
        }
        C51695vh1 vh12 = (C51695vh1) aVar;
        return C46238a.m51546a(Boolean.valueOf(this.f143484d), Boolean.valueOf(vh12.f143484d)) && C46238a.m51546a(Integer.valueOf(this.f143485e), Integer.valueOf(vh12.f143485e)) && C46238a.m51546a(Boolean.valueOf(this.f143486f), Boolean.valueOf(vh12.f143486f)) && C46238a.m51546a(Integer.valueOf(this.f143487g), Integer.valueOf(vh12.f143487g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74314a(1, this.f143484d);
            aVar.mo74318e(2, this.f143485e);
            aVar.mo74314a(3, this.f143486f);
            aVar.mo74318e(4, this.f143487g);
            return 0;
        } else if (i == 1) {
            return C52418a.m58674a(1, this.f143484d) + 0 + C52418a.m58678e(2, this.f143485e) + C52418a.m58674a(3, this.f143486f) + C52418a.m58678e(4, this.f143487g);
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
                C51695vh1 vh12 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    vh12.f143484d = aVar3.mo141625c(intValue);
                    return 0;
                } else if (intValue == 2) {
                    vh12.f143485e = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 3) {
                    vh12.f143486f = aVar3.mo141625c(intValue);
                    return 0;
                } else if (intValue != 4) {
                    return -1;
                } else {
                    vh12.f143487g = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
