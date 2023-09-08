package re3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: re3.n */
public class C63401n extends C47465a {

    /* renamed from: d */
    public int f179877d;

    /* renamed from: e */
    public int f179878e;

    /* renamed from: f */
    public int f179879f;

    /* renamed from: g */
    public int f179880g;

    /* renamed from: h */
    public int f179881h;

    /* renamed from: i */
    public int f179882i;

    /* renamed from: j */
    public int f179883j;

    /* renamed from: n */
    public int f179884n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C63401n)) {
            return false;
        }
        C63401n nVar = (C63401n) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f179877d), Integer.valueOf(nVar.f179877d)) && C46238a.m51546a(Integer.valueOf(this.f179878e), Integer.valueOf(nVar.f179878e)) && C46238a.m51546a(Integer.valueOf(this.f179879f), Integer.valueOf(nVar.f179879f)) && C46238a.m51546a(Integer.valueOf(this.f179880g), Integer.valueOf(nVar.f179880g)) && C46238a.m51546a(Integer.valueOf(this.f179881h), Integer.valueOf(nVar.f179881h)) && C46238a.m51546a(Integer.valueOf(this.f179882i), Integer.valueOf(nVar.f179882i)) && C46238a.m51546a(Integer.valueOf(this.f179883j), Integer.valueOf(nVar.f179883j)) && C46238a.m51546a(Integer.valueOf(this.f179884n), Integer.valueOf(nVar.f179884n));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f179877d);
            aVar.mo74318e(2, this.f179878e);
            aVar.mo74318e(3, this.f179879f);
            aVar.mo74318e(4, this.f179880g);
            aVar.mo74318e(5, this.f179881h);
            aVar.mo74318e(6, this.f179882i);
            aVar.mo74318e(7, this.f179883j);
            aVar.mo74318e(8, this.f179884n);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f179877d) + 0 + C52418a.m58678e(2, this.f179878e) + C52418a.m58678e(3, this.f179879f) + C52418a.m58678e(4, this.f179880g) + C52418a.m58678e(5, this.f179881h) + C52418a.m58678e(6, this.f179882i) + C52418a.m58678e(7, this.f179883j) + C52418a.m58678e(8, this.f179884n);
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
                C63401n nVar = objArr[1];
                int intValue = objArr[2].intValue();
                switch (intValue) {
                    case 1:
                        nVar.f179877d = aVar3.mo141629g(intValue);
                        return 0;
                    case 2:
                        nVar.f179878e = aVar3.mo141629g(intValue);
                        return 0;
                    case 3:
                        nVar.f179879f = aVar3.mo141629g(intValue);
                        return 0;
                    case 4:
                        nVar.f179880g = aVar3.mo141629g(intValue);
                        return 0;
                    case 5:
                        nVar.f179881h = aVar3.mo141629g(intValue);
                        return 0;
                    case 6:
                        nVar.f179882i = aVar3.mo141629g(intValue);
                        return 0;
                    case 7:
                        nVar.f179883j = aVar3.mo141629g(intValue);
                        return 0;
                    case 8:
                        nVar.f179884n = aVar3.mo141629g(intValue);
                        return 0;
                    default:
                        return -1;
                }
            }
        }
    }
}
