package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ds1 */
public class C64325ds1 extends C47465a {

    /* renamed from: d */
    public String f182844d;

    /* renamed from: e */
    public String f182845e;

    /* renamed from: f */
    public int f182846f;

    /* renamed from: g */
    public C89349b f182847g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64325ds1)) {
            return false;
        }
        C64325ds1 ds12 = (C64325ds1) aVar;
        return C46238a.m51546a(this.f182844d, ds12.f182844d) && C46238a.m51546a(this.f182845e, ds12.f182845e) && C46238a.m51546a(Integer.valueOf(this.f182846f), Integer.valueOf(ds12.f182846f)) && C46238a.m51546a(this.f182847g, ds12.f182847g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f182844d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f182845e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f182846f);
            C89349b bVar = this.f182847g;
            if (bVar != null) {
                aVar.mo74315b(4, bVar);
            }
            return 0;
        } else if (i == 1) {
            String str3 = this.f182844d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f182845e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            int e = i2 + C52418a.m58678e(3, this.f182846f);
            C89349b bVar2 = this.f182847g;
            return bVar2 != null ? e + C52418a.m58675b(4, bVar2) : e;
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
            C64325ds1 ds12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                ds12.f182844d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                ds12.f182845e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                ds12.f182846f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                ds12.f182847g = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}
