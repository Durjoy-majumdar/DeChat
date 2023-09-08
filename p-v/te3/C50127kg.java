package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.kg */
public class C50127kg extends C47465a {

    /* renamed from: d */
    public boolean f136774d;

    /* renamed from: e */
    public int f136775e;

    /* renamed from: f */
    public int f136776f;

    /* renamed from: g */
    public boolean f136777g;

    /* renamed from: h */
    public boolean f136778h;

    /* renamed from: i */
    public int f136779i;

    /* renamed from: j */
    public int f136780j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50127kg)) {
            return false;
        }
        C50127kg kgVar = (C50127kg) aVar;
        return C46238a.m51546a(Boolean.valueOf(this.f136774d), Boolean.valueOf(kgVar.f136774d)) && C46238a.m51546a(Integer.valueOf(this.f136775e), Integer.valueOf(kgVar.f136775e)) && C46238a.m51546a(Integer.valueOf(this.f136776f), Integer.valueOf(kgVar.f136776f)) && C46238a.m51546a(Boolean.valueOf(this.f136777g), Boolean.valueOf(kgVar.f136777g)) && C46238a.m51546a(Boolean.valueOf(this.f136778h), Boolean.valueOf(kgVar.f136778h)) && C46238a.m51546a(Integer.valueOf(this.f136779i), Integer.valueOf(kgVar.f136779i)) && C46238a.m51546a(Integer.valueOf(this.f136780j), Integer.valueOf(kgVar.f136780j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74314a(1, this.f136774d);
            aVar.mo74318e(2, this.f136775e);
            aVar.mo74318e(3, this.f136776f);
            aVar.mo74314a(4, this.f136777g);
            aVar.mo74314a(5, this.f136778h);
            aVar.mo74318e(6, this.f136779i);
            aVar.mo74318e(7, this.f136780j);
            return 0;
        } else if (i == 1) {
            return C52418a.m58674a(1, this.f136774d) + 0 + C52418a.m58678e(2, this.f136775e) + C52418a.m58678e(3, this.f136776f) + C52418a.m58674a(4, this.f136777g) + C52418a.m58674a(5, this.f136778h) + C52418a.m58678e(6, this.f136779i) + C52418a.m58678e(7, this.f136780j);
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
                C50127kg kgVar = objArr[1];
                int intValue = objArr[2].intValue();
                switch (intValue) {
                    case 1:
                        kgVar.f136774d = aVar3.mo141625c(intValue);
                        return 0;
                    case 2:
                        kgVar.f136775e = aVar3.mo141629g(intValue);
                        return 0;
                    case 3:
                        kgVar.f136776f = aVar3.mo141629g(intValue);
                        return 0;
                    case 4:
                        kgVar.f136777g = aVar3.mo141625c(intValue);
                        return 0;
                    case 5:
                        kgVar.f136778h = aVar3.mo141625c(intValue);
                        return 0;
                    case 6:
                        kgVar.f136779i = aVar3.mo141629g(intValue);
                        return 0;
                    case 7:
                        kgVar.f136780j = aVar3.mo141629g(intValue);
                        return 0;
                    default:
                        return -1;
                }
            }
        }
    }
}
