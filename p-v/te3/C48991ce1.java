package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ce1 */
public class C48991ce1 extends C47465a {

    /* renamed from: d */
    public String f131674d;

    /* renamed from: e */
    public int f131675e;

    /* renamed from: f */
    public int f131676f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48991ce1)) {
            return false;
        }
        C48991ce1 ce12 = (C48991ce1) aVar;
        return C46238a.m51546a(this.f131674d, ce12.f131674d) && C46238a.m51546a(Integer.valueOf(this.f131675e), Integer.valueOf(ce12.f131675e)) && C46238a.m51546a(Integer.valueOf(this.f131676f), Integer.valueOf(ce12.f131676f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f131674d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f131675e);
            aVar.mo74318e(3, this.f131676f);
            return 0;
        } else if (i == 1) {
            String str2 = this.f131674d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58678e(2, this.f131675e) + C52418a.m58678e(3, this.f131676f);
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
            C48991ce1 ce12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                ce12.f131674d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                ce12.f131675e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                ce12.f131676f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
