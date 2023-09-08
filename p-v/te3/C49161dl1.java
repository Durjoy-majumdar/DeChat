package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.dl1 */
public class C49161dl1 extends C47465a {

    /* renamed from: d */
    public int f132392d;

    /* renamed from: e */
    public int f132393e;

    /* renamed from: f */
    public int f132394f;

    /* renamed from: g */
    public int f132395g;

    /* renamed from: h */
    public int f132396h;

    /* renamed from: i */
    public int f132397i;

    /* renamed from: j */
    public int f132398j;

    /* renamed from: n */
    public int f132399n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49161dl1)) {
            return false;
        }
        C49161dl1 dl12 = (C49161dl1) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f132392d), Integer.valueOf(dl12.f132392d)) && C46238a.m51546a(Integer.valueOf(this.f132393e), Integer.valueOf(dl12.f132393e)) && C46238a.m51546a(Integer.valueOf(this.f132394f), Integer.valueOf(dl12.f132394f)) && C46238a.m51546a(Integer.valueOf(this.f132395g), Integer.valueOf(dl12.f132395g)) && C46238a.m51546a(Integer.valueOf(this.f132396h), Integer.valueOf(dl12.f132396h)) && C46238a.m51546a(Integer.valueOf(this.f132397i), Integer.valueOf(dl12.f132397i)) && C46238a.m51546a(Integer.valueOf(this.f132398j), Integer.valueOf(dl12.f132398j)) && C46238a.m51546a(Integer.valueOf(this.f132399n), Integer.valueOf(dl12.f132399n));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f132392d);
            aVar.mo74318e(2, this.f132393e);
            aVar.mo74318e(3, this.f132394f);
            aVar.mo74318e(4, this.f132395g);
            aVar.mo74318e(5, this.f132396h);
            aVar.mo74318e(6, this.f132397i);
            aVar.mo74318e(7, this.f132398j);
            aVar.mo74318e(8, this.f132399n);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f132392d) + 0 + C52418a.m58678e(2, this.f132393e) + C52418a.m58678e(3, this.f132394f) + C52418a.m58678e(4, this.f132395g) + C52418a.m58678e(5, this.f132396h) + C52418a.m58678e(6, this.f132397i) + C52418a.m58678e(7, this.f132398j) + C52418a.m58678e(8, this.f132399n);
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
                C49161dl1 dl12 = objArr[1];
                int intValue = objArr[2].intValue();
                switch (intValue) {
                    case 1:
                        dl12.f132392d = aVar3.mo141629g(intValue);
                        return 0;
                    case 2:
                        dl12.f132393e = aVar3.mo141629g(intValue);
                        return 0;
                    case 3:
                        dl12.f132394f = aVar3.mo141629g(intValue);
                        return 0;
                    case 4:
                        dl12.f132395g = aVar3.mo141629g(intValue);
                        return 0;
                    case 5:
                        dl12.f132396h = aVar3.mo141629g(intValue);
                        return 0;
                    case 6:
                        dl12.f132397i = aVar3.mo141629g(intValue);
                        return 0;
                    case 7:
                        dl12.f132398j = aVar3.mo141629g(intValue);
                        return 0;
                    case 8:
                        dl12.f132399n = aVar3.mo141629g(intValue);
                        return 0;
                    default:
                        return -1;
                }
            }
        }
    }
}
