package uc0;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: uc0.l */
public class C65320l extends C47465a {

    /* renamed from: d */
    public int f187994d;

    /* renamed from: e */
    public int f187995e;

    /* renamed from: f */
    public double f187996f;

    /* renamed from: g */
    public String f187997g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C65320l)) {
            return false;
        }
        C65320l lVar = (C65320l) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f187994d), Integer.valueOf(lVar.f187994d)) && C46238a.m51546a(Integer.valueOf(this.f187995e), Integer.valueOf(lVar.f187995e)) && C46238a.m51546a(Double.valueOf(this.f187996f), Double.valueOf(lVar.f187996f)) && C46238a.m51546a(this.f187997g, lVar.f187997g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f187994d);
            aVar.mo74318e(2, this.f187995e);
            aVar.mo74316c(3, this.f187996f);
            String str = this.f187997g;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f187994d) + 0 + C52418a.m58678e(2, this.f187995e) + C52418a.m58676c(3, this.f187996f);
            String str2 = this.f187997g;
            return str2 != null ? e + C52418a.m58683j(4, str2) : e;
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
            C65320l lVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                lVar.f187994d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                lVar.f187995e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                lVar.f187996f = aVar3.mo141627e(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                lVar.f187997g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
