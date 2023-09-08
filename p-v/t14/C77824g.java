package t14;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: t14.g */
public class C77824g extends C47465a {

    /* renamed from: d */
    public String f226745d;

    /* renamed from: e */
    public String f226746e;

    /* renamed from: f */
    public int f226747f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77824g)) {
            return false;
        }
        C77824g gVar = (C77824g) aVar;
        return C46238a.m51546a(this.f226745d, gVar.f226745d) && C46238a.m51546a(this.f226746e, gVar.f226746e) && C46238a.m51546a(Integer.valueOf(this.f226747f), Integer.valueOf(gVar.f226747f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f226745d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f226746e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f226747f);
            return 0;
        } else if (i == 1) {
            String str3 = this.f226745d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f226746e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            return i2 + C52418a.m58678e(3, this.f226747f);
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
            C77824g gVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                gVar.f226745d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                gVar.f226746e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                gVar.f226747f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
