package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.pm */
public class C64630pm extends C47465a {

    /* renamed from: d */
    public int f184860d;

    /* renamed from: e */
    public int f184861e;

    /* renamed from: f */
    public String f184862f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64630pm)) {
            return false;
        }
        C64630pm pmVar = (C64630pm) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f184860d), Integer.valueOf(pmVar.f184860d)) && C46238a.m51546a(Integer.valueOf(this.f184861e), Integer.valueOf(pmVar.f184861e)) && C46238a.m51546a(this.f184862f, pmVar.f184862f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f184860d);
            aVar.mo74318e(2, this.f184861e);
            String str = this.f184862f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f184860d) + 0 + C52418a.m58678e(2, this.f184861e);
            String str2 = this.f184862f;
            return str2 != null ? e + C52418a.m58683j(3, str2) : e;
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
            C64630pm pmVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                pmVar.f184860d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                pmVar.f184861e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                pmVar.f184862f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
