package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.cz3 */
public class C64302cz3 extends C47465a {

    /* renamed from: d */
    public int f182616d;

    /* renamed from: e */
    public int f182617e;

    /* renamed from: f */
    public String f182618f;

    /* renamed from: g */
    public String f182619g;

    /* renamed from: h */
    public int f182620h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64302cz3)) {
            return false;
        }
        C64302cz3 cz32 = (C64302cz3) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f182616d), Integer.valueOf(cz32.f182616d)) && C46238a.m51546a(Integer.valueOf(this.f182617e), Integer.valueOf(cz32.f182617e)) && C46238a.m51546a(this.f182618f, cz32.f182618f) && C46238a.m51546a(this.f182619g, cz32.f182619g) && C46238a.m51546a(Integer.valueOf(this.f182620h), Integer.valueOf(cz32.f182620h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f182616d);
            aVar.mo74318e(2, this.f182617e);
            String str = this.f182618f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f182619g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            aVar.mo74318e(5, this.f182620h);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f182616d) + 0 + C52418a.m58678e(2, this.f182617e);
            String str3 = this.f182618f;
            if (str3 != null) {
                e += C52418a.m58683j(3, str3);
            }
            String str4 = this.f182619g;
            if (str4 != null) {
                e += C52418a.m58683j(4, str4);
            }
            return e + C52418a.m58678e(5, this.f182620h);
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
            C64302cz3 cz32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                cz32.f182616d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                cz32.f182617e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                cz32.f182618f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                cz32.f182619g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                cz32.f182620h = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
