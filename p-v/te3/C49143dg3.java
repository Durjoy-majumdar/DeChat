package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.dg3 */
public class C49143dg3 extends C47465a {

    /* renamed from: d */
    public String f132310d;

    /* renamed from: e */
    public C89349b f132311e;

    /* renamed from: f */
    public String f132312f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49143dg3)) {
            return false;
        }
        C49143dg3 dg32 = (C49143dg3) aVar;
        return C46238a.m51546a(this.f132310d, dg32.f132310d) && C46238a.m51546a(this.f132311e, dg32.f132311e) && C46238a.m51546a(this.f132312f, dg32.f132312f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f132310d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            C89349b bVar = this.f132311e;
            if (bVar != null) {
                aVar.mo74315b(2, bVar);
            }
            String str2 = this.f132312f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            return 0;
        } else if (i == 1) {
            String str3 = this.f132310d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            C89349b bVar2 = this.f132311e;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(2, bVar2);
            }
            String str4 = this.f132312f;
            return str4 != null ? i2 + C52418a.m58683j(3, str4) : i2;
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
            C49143dg3 dg32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                dg32.f132310d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                dg32.f132311e = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                dg32.f132312f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
