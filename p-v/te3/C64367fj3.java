package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.fj3 */
public class C64367fj3 extends C47465a {

    /* renamed from: d */
    public int f183141d;

    /* renamed from: e */
    public int f183142e;

    /* renamed from: f */
    public int f183143f;

    /* renamed from: g */
    public int f183144g;

    /* renamed from: h */
    public String f183145h;

    /* renamed from: i */
    public int f183146i;

    /* renamed from: j */
    public String f183147j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64367fj3)) {
            return false;
        }
        C64367fj3 fj32 = (C64367fj3) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f183141d), Integer.valueOf(fj32.f183141d)) && C46238a.m51546a(Integer.valueOf(this.f183142e), Integer.valueOf(fj32.f183142e)) && C46238a.m51546a(Integer.valueOf(this.f183143f), Integer.valueOf(fj32.f183143f)) && C46238a.m51546a(Integer.valueOf(this.f183144g), Integer.valueOf(fj32.f183144g)) && C46238a.m51546a(this.f183145h, fj32.f183145h) && C46238a.m51546a(Integer.valueOf(this.f183146i), Integer.valueOf(fj32.f183146i)) && C46238a.m51546a(this.f183147j, fj32.f183147j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f183141d);
            aVar.mo74318e(2, this.f183142e);
            aVar.mo74318e(3, this.f183143f);
            aVar.mo74318e(4, this.f183144g);
            String str = this.f183145h;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            aVar.mo74318e(6, this.f183146i);
            String str2 = this.f183147j;
            if (str2 != null) {
                aVar.mo74323j(7, str2);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f183141d) + 0 + C52418a.m58678e(2, this.f183142e) + C52418a.m58678e(3, this.f183143f) + C52418a.m58678e(4, this.f183144g);
            String str3 = this.f183145h;
            if (str3 != null) {
                e += C52418a.m58683j(5, str3);
            }
            int e2 = e + C52418a.m58678e(6, this.f183146i);
            String str4 = this.f183147j;
            return str4 != null ? e2 + C52418a.m58683j(7, str4) : e2;
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
            C64367fj3 fj32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    fj32.f183141d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    fj32.f183142e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    fj32.f183143f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    fj32.f183144g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    fj32.f183145h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    fj32.f183146i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    fj32.f183147j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
