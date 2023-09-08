package py1;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.n */
public class C47631n extends C47465a {

    /* renamed from: d */
    public boolean f127877d;

    /* renamed from: e */
    public boolean f127878e;

    /* renamed from: f */
    public boolean f127879f;

    /* renamed from: g */
    public boolean f127880g;

    /* renamed from: h */
    public boolean f127881h;

    /* renamed from: i */
    public boolean f127882i;

    /* renamed from: j */
    public boolean f127883j;

    /* renamed from: n */
    public boolean f127884n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47631n)) {
            return false;
        }
        C47631n nVar = (C47631n) aVar;
        return C46238a.m51546a(Boolean.valueOf(this.f127877d), Boolean.valueOf(nVar.f127877d)) && C46238a.m51546a(Boolean.valueOf(this.f127878e), Boolean.valueOf(nVar.f127878e)) && C46238a.m51546a(Boolean.valueOf(this.f127879f), Boolean.valueOf(nVar.f127879f)) && C46238a.m51546a(Boolean.valueOf(this.f127880g), Boolean.valueOf(nVar.f127880g)) && C46238a.m51546a(Boolean.valueOf(this.f127881h), Boolean.valueOf(nVar.f127881h)) && C46238a.m51546a(Boolean.valueOf(this.f127882i), Boolean.valueOf(nVar.f127882i)) && C46238a.m51546a(Boolean.valueOf(this.f127883j), Boolean.valueOf(nVar.f127883j)) && C46238a.m51546a(Boolean.valueOf(this.f127884n), Boolean.valueOf(nVar.f127884n));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74314a(1, this.f127877d);
            aVar.mo74314a(2, this.f127878e);
            aVar.mo74314a(3, this.f127879f);
            aVar.mo74314a(4, this.f127880g);
            aVar.mo74314a(5, this.f127881h);
            aVar.mo74314a(6, this.f127882i);
            aVar.mo74314a(7, this.f127883j);
            aVar.mo74314a(8, this.f127884n);
            return 0;
        } else if (i == 1) {
            return C52418a.m58674a(1, this.f127877d) + 0 + C52418a.m58674a(2, this.f127878e) + C52418a.m58674a(3, this.f127879f) + C52418a.m58674a(4, this.f127880g) + C52418a.m58674a(5, this.f127881h) + C52418a.m58674a(6, this.f127882i) + C52418a.m58674a(7, this.f127883j) + C52418a.m58674a(8, this.f127884n);
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
                C47631n nVar = objArr[1];
                int intValue = objArr[2].intValue();
                switch (intValue) {
                    case 1:
                        nVar.f127877d = aVar3.mo141625c(intValue);
                        return 0;
                    case 2:
                        nVar.f127878e = aVar3.mo141625c(intValue);
                        return 0;
                    case 3:
                        nVar.f127879f = aVar3.mo141625c(intValue);
                        return 0;
                    case 4:
                        nVar.f127880g = aVar3.mo141625c(intValue);
                        return 0;
                    case 5:
                        nVar.f127881h = aVar3.mo141625c(intValue);
                        return 0;
                    case 6:
                        nVar.f127882i = aVar3.mo141625c(intValue);
                        return 0;
                    case 7:
                        nVar.f127883j = aVar3.mo141625c(intValue);
                        return 0;
                    case 8:
                        nVar.f127884n = aVar3.mo141625c(intValue);
                        return 0;
                    default:
                        return -1;
                }
            }
        }
    }
}
