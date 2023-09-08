package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.g63 */
public class C64386g63 extends C47465a {

    /* renamed from: d */
    public int f183276d;

    /* renamed from: e */
    public String f183277e;

    /* renamed from: f */
    public int f183278f;

    /* renamed from: g */
    public int f183279g;

    /* renamed from: h */
    public String f183280h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64386g63)) {
            return false;
        }
        C64386g63 g632 = (C64386g63) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f183276d), Integer.valueOf(g632.f183276d)) && C46238a.m51546a(this.f183277e, g632.f183277e) && C46238a.m51546a(Integer.valueOf(this.f183278f), Integer.valueOf(g632.f183278f)) && C46238a.m51546a(Integer.valueOf(this.f183279g), Integer.valueOf(g632.f183279g)) && C46238a.m51546a(this.f183280h, g632.f183280h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f183276d);
            String str = this.f183277e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74318e(4, this.f183278f);
            aVar.mo74318e(5, this.f183279g);
            String str2 = this.f183280h;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f183276d) + 0;
            String str3 = this.f183277e;
            if (str3 != null) {
                e += C52418a.m58683j(3, str3);
            }
            int e2 = e + C52418a.m58678e(4, this.f183278f) + C52418a.m58678e(5, this.f183279g);
            String str4 = this.f183280h;
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
            C64386g63 g632 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                g632.f183276d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                g632.f183277e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                g632.f183278f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 5) {
                g632.f183279g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 6) {
                return -1;
            } else {
                g632.f183280h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
