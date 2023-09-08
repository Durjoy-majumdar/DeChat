package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.dw2 */
public class C64332dw2 extends C47465a {

    /* renamed from: d */
    public String f182896d;

    /* renamed from: e */
    public int f182897e;

    /* renamed from: f */
    public int f182898f;

    /* renamed from: g */
    public String f182899g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64332dw2)) {
            return false;
        }
        C64332dw2 dw22 = (C64332dw2) aVar;
        return C46238a.m51546a(this.f182896d, dw22.f182896d) && C46238a.m51546a(Integer.valueOf(this.f182897e), Integer.valueOf(dw22.f182897e)) && C46238a.m51546a(Integer.valueOf(this.f182898f), Integer.valueOf(dw22.f182898f)) && C46238a.m51546a(this.f182899g, dw22.f182899g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f182896d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f182897e);
            aVar.mo74318e(3, this.f182898f);
            String str2 = this.f182899g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            return 0;
        } else if (i == 1) {
            String str3 = this.f182896d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            int e = i2 + C52418a.m58678e(2, this.f182897e) + C52418a.m58678e(3, this.f182898f);
            String str4 = this.f182899g;
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
            C64332dw2 dw22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                dw22.f182896d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                dw22.f182897e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                dw22.f182898f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                dw22.f182899g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
