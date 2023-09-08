package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.dp2 */
public class C64321dp2 extends C47465a {

    /* renamed from: d */
    public int f182791d;

    /* renamed from: e */
    public int f182792e;

    /* renamed from: f */
    public int f182793f;

    /* renamed from: g */
    public int f182794g;

    /* renamed from: h */
    public boolean f182795h;

    /* renamed from: i */
    public boolean f182796i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64321dp2)) {
            return false;
        }
        C64321dp2 dp22 = (C64321dp2) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f182791d), Integer.valueOf(dp22.f182791d)) && C46238a.m51546a(Integer.valueOf(this.f182792e), Integer.valueOf(dp22.f182792e)) && C46238a.m51546a(Integer.valueOf(this.f182793f), Integer.valueOf(dp22.f182793f)) && C46238a.m51546a(Integer.valueOf(this.f182794g), Integer.valueOf(dp22.f182794g)) && C46238a.m51546a(Boolean.valueOf(this.f182795h), Boolean.valueOf(dp22.f182795h)) && C46238a.m51546a(Boolean.valueOf(this.f182796i), Boolean.valueOf(dp22.f182796i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f182791d);
            aVar.mo74318e(2, this.f182792e);
            aVar.mo74318e(3, this.f182793f);
            aVar.mo74318e(4, this.f182794g);
            aVar.mo74314a(5, this.f182795h);
            aVar.mo74314a(6, this.f182796i);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f182791d) + 0 + C52418a.m58678e(2, this.f182792e) + C52418a.m58678e(3, this.f182793f) + C52418a.m58678e(4, this.f182794g) + C52418a.m58674a(5, this.f182795h) + C52418a.m58674a(6, this.f182796i);
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
                C64321dp2 dp22 = objArr[1];
                int intValue = objArr[2].intValue();
                switch (intValue) {
                    case 1:
                        dp22.f182791d = aVar3.mo141629g(intValue);
                        return 0;
                    case 2:
                        dp22.f182792e = aVar3.mo141629g(intValue);
                        return 0;
                    case 3:
                        dp22.f182793f = aVar3.mo141629g(intValue);
                        return 0;
                    case 4:
                        dp22.f182794g = aVar3.mo141629g(intValue);
                        return 0;
                    case 5:
                        dp22.f182795h = aVar3.mo141625c(intValue);
                        return 0;
                    case 6:
                        dp22.f182796i = aVar3.mo141625c(intValue);
                        return 0;
                    default:
                        return -1;
                }
            }
        }
    }
}
