package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.vw */
public class C51748vw extends C47465a {

    /* renamed from: d */
    public String f143738d;

    /* renamed from: e */
    public String f143739e;

    /* renamed from: f */
    public int f143740f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51748vw)) {
            return false;
        }
        C51748vw vwVar = (C51748vw) aVar;
        return C46238a.m51546a(this.f143738d, vwVar.f143738d) && C46238a.m51546a(this.f143739e, vwVar.f143739e) && C46238a.m51546a(Integer.valueOf(this.f143740f), Integer.valueOf(vwVar.f143740f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f143738d;
            if (str != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                String str2 = this.f143739e;
                if (str2 != null) {
                    aVar.mo74323j(2, str2);
                }
                aVar.mo74318e(3, this.f143740f);
                return 0;
            }
            throw new C52419b("Not all required fields were included: PkgId");
        } else if (i == 1) {
            String str3 = this.f143738d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f143739e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            return i2 + C52418a.m58678e(3, this.f143740f);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f143738d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: PkgId");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C51748vw vwVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                vwVar.f143738d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                vwVar.f143739e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                vwVar.f143740f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
