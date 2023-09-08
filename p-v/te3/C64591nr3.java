package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.nr3 */
public class C64591nr3 extends C47465a {

    /* renamed from: d */
    public String f184541d;

    /* renamed from: e */
    public String f184542e;

    /* renamed from: f */
    public int f184543f;

    /* renamed from: g */
    public int f184544g;

    /* renamed from: h */
    public int f184545h;

    /* renamed from: i */
    public int f184546i;

    /* renamed from: j */
    public int f184547j;

    /* renamed from: n */
    public int f184548n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64591nr3)) {
            return false;
        }
        C64591nr3 nr32 = (C64591nr3) aVar;
        return C46238a.m51546a(this.f184541d, nr32.f184541d) && C46238a.m51546a(this.f184542e, nr32.f184542e) && C46238a.m51546a(Integer.valueOf(this.f184543f), Integer.valueOf(nr32.f184543f)) && C46238a.m51546a(Integer.valueOf(this.f184544g), Integer.valueOf(nr32.f184544g)) && C46238a.m51546a(Integer.valueOf(this.f184545h), Integer.valueOf(nr32.f184545h)) && C46238a.m51546a(Integer.valueOf(this.f184546i), Integer.valueOf(nr32.f184546i)) && C46238a.m51546a(Integer.valueOf(this.f184547j), Integer.valueOf(nr32.f184547j)) && C46238a.m51546a(Integer.valueOf(this.f184548n), Integer.valueOf(nr32.f184548n));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f184541d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f184542e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f184543f);
            aVar.mo74318e(4, this.f184544g);
            aVar.mo74318e(5, this.f184545h);
            aVar.mo74318e(6, this.f184546i);
            aVar.mo74318e(7, this.f184547j);
            aVar.mo74318e(8, this.f184548n);
            return 0;
        } else if (i == 1) {
            String str3 = this.f184541d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f184542e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            return i2 + C52418a.m58678e(3, this.f184543f) + C52418a.m58678e(4, this.f184544g) + C52418a.m58678e(5, this.f184545h) + C52418a.m58678e(6, this.f184546i) + C52418a.m58678e(7, this.f184547j) + C52418a.m58678e(8, this.f184548n);
        } else if (i == 2) {
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
            C64591nr3 nr32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    nr32.f184541d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    nr32.f184542e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    nr32.f184543f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    nr32.f184544g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    nr32.f184545h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    nr32.f184546i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    nr32.f184547j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    nr32.f184548n = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
