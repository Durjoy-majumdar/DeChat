package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.f63 */
public class C64358f63 extends C47465a {

    /* renamed from: d */
    public int f183080d;

    /* renamed from: e */
    public String f183081e;

    /* renamed from: f */
    public int f183082f;

    /* renamed from: g */
    public int f183083g;

    /* renamed from: h */
    public String f183084h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64358f63)) {
            return false;
        }
        C64358f63 f632 = (C64358f63) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f183080d), Integer.valueOf(f632.f183080d)) && C46238a.m51546a(this.f183081e, f632.f183081e) && C46238a.m51546a(Integer.valueOf(this.f183082f), Integer.valueOf(f632.f183082f)) && C46238a.m51546a(Integer.valueOf(this.f183083g), Integer.valueOf(f632.f183083g)) && C46238a.m51546a(this.f183084h, f632.f183084h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f183080d);
            String str = this.f183081e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74318e(4, this.f183082f);
            aVar.mo74318e(5, this.f183083g);
            String str2 = this.f183084h;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f183080d) + 0;
            String str3 = this.f183081e;
            if (str3 != null) {
                e += C52418a.m58683j(3, str3);
            }
            int e2 = e + C52418a.m58678e(4, this.f183082f) + C52418a.m58678e(5, this.f183083g);
            String str4 = this.f183084h;
            return str4 != null ? e2 + C52418a.m58683j(6, str4) : e2;
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
            C64358f63 f632 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                f632.f183080d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                f632.f183081e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                f632.f183082f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 5) {
                f632.f183083g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 6) {
                return -1;
            } else {
                f632.f183084h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
