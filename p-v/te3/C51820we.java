package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.we */
public class C51820we extends C47465a {

    /* renamed from: d */
    public String f143975d;

    /* renamed from: e */
    public int f143976e;

    /* renamed from: f */
    public String f143977f;

    /* renamed from: g */
    public int f143978g;

    /* renamed from: h */
    public int f143979h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51820we)) {
            return false;
        }
        C51820we weVar = (C51820we) aVar;
        return C46238a.m51546a(this.f143975d, weVar.f143975d) && C46238a.m51546a(Integer.valueOf(this.f143976e), Integer.valueOf(weVar.f143976e)) && C46238a.m51546a(this.f143977f, weVar.f143977f) && C46238a.m51546a(Integer.valueOf(this.f143978g), Integer.valueOf(weVar.f143978g)) && C46238a.m51546a(Integer.valueOf(this.f143979h), Integer.valueOf(weVar.f143979h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f143975d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f143976e);
            String str2 = this.f143977f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74318e(4, this.f143978g);
            aVar.mo74318e(5, this.f143979h);
            return 0;
        } else if (i == 1) {
            String str3 = this.f143975d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            int e = i2 + C52418a.m58678e(2, this.f143976e);
            String str4 = this.f143977f;
            if (str4 != null) {
                e += C52418a.m58683j(3, str4);
            }
            return e + C52418a.m58678e(4, this.f143978g) + C52418a.m58678e(5, this.f143979h);
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
            C51820we weVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                weVar.f143975d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                weVar.f143976e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                weVar.f143977f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                weVar.f143978g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                weVar.f143979h = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
