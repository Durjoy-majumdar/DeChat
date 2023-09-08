package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class b05 extends C47465a {

    /* renamed from: d */
    public int f130875d;

    /* renamed from: e */
    public int f130876e;

    /* renamed from: f */
    public String f130877f;

    /* renamed from: g */
    public String f130878g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof b05)) {
            return false;
        }
        b05 b05 = (b05) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f130875d), Integer.valueOf(b05.f130875d)) && C46238a.m51546a(Integer.valueOf(this.f130876e), Integer.valueOf(b05.f130876e)) && C46238a.m51546a(this.f130877f, b05.f130877f) && C46238a.m51546a(this.f130878g, b05.f130878g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f130875d);
            aVar.mo74318e(2, this.f130876e);
            String str = this.f130877f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f130878g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f130875d) + 0 + C52418a.m58678e(2, this.f130876e);
            String str3 = this.f130877f;
            if (str3 != null) {
                e += C52418a.m58683j(3, str3);
            }
            String str4 = this.f130878g;
            return str4 != null ? e + C52418a.m58683j(4, str4) : e;
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
            b05 b05 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                b05.f130875d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                b05.f130876e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                b05.f130877f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                b05.f130878g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
