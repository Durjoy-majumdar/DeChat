package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.fa0 */
public class C64361fa0 extends C47465a {

    /* renamed from: d */
    public int f183095d;

    /* renamed from: e */
    public int f183096e;

    /* renamed from: f */
    public int f183097f;

    /* renamed from: g */
    public String f183098g;

    /* renamed from: h */
    public int f183099h;

    /* renamed from: i */
    public String f183100i;

    /* renamed from: j */
    public int f183101j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64361fa0)) {
            return false;
        }
        C64361fa0 fa02 = (C64361fa0) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f183095d), Integer.valueOf(fa02.f183095d)) && C46238a.m51546a(Integer.valueOf(this.f183096e), Integer.valueOf(fa02.f183096e)) && C46238a.m51546a(Integer.valueOf(this.f183097f), Integer.valueOf(fa02.f183097f)) && C46238a.m51546a(this.f183098g, fa02.f183098g) && C46238a.m51546a(Integer.valueOf(this.f183099h), Integer.valueOf(fa02.f183099h)) && C46238a.m51546a(this.f183100i, fa02.f183100i) && C46238a.m51546a(Integer.valueOf(this.f183101j), Integer.valueOf(fa02.f183101j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f183095d);
            aVar.mo74318e(2, this.f183096e);
            aVar.mo74318e(3, this.f183097f);
            String str = this.f183098g;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            aVar.mo74318e(5, this.f183099h);
            String str2 = this.f183100i;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            aVar.mo74318e(7, this.f183101j);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f183095d) + 0 + C52418a.m58678e(2, this.f183096e) + C52418a.m58678e(3, this.f183097f);
            String str3 = this.f183098g;
            if (str3 != null) {
                e += C52418a.m58683j(4, str3);
            }
            int e2 = e + C52418a.m58678e(5, this.f183099h);
            String str4 = this.f183100i;
            if (str4 != null) {
                e2 += C52418a.m58683j(6, str4);
            }
            return e2 + C52418a.m58678e(7, this.f183101j);
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
            C64361fa0 fa02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    fa02.f183095d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    fa02.f183096e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    fa02.f183097f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    fa02.f183098g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    fa02.f183099h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    fa02.f183100i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    fa02.f183101j = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
