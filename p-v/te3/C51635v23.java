package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.v23 */
public class C51635v23 extends C47465a {

    /* renamed from: d */
    public String f143267d;

    /* renamed from: e */
    public String f143268e;

    /* renamed from: f */
    public int f143269f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51635v23)) {
            return false;
        }
        C51635v23 v232 = (C51635v23) aVar;
        return C46238a.m51546a(this.f143267d, v232.f143267d) && C46238a.m51546a(this.f143268e, v232.f143268e) && C46238a.m51546a(Integer.valueOf(this.f143269f), Integer.valueOf(v232.f143269f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f143267d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f143268e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f143269f);
            return 0;
        } else if (i == 1) {
            String str3 = this.f143267d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f143268e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            return i2 + C52418a.m58678e(3, this.f143269f);
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
            C51635v23 v232 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                v232.f143267d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                v232.f143268e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                v232.f143269f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
