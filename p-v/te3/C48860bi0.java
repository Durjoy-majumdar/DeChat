package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.bi0 */
public class C48860bi0 extends C47465a {

    /* renamed from: d */
    public String f131128d;

    /* renamed from: e */
    public C89349b f131129e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48860bi0)) {
            return false;
        }
        C48860bi0 bi02 = (C48860bi0) aVar;
        return C46238a.m51546a(this.f131128d, bi02.f131128d) && C46238a.m51546a(this.f131129e, bi02.f131129e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f131128d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            C89349b bVar = this.f131129e;
            if (bVar != null) {
                aVar.mo74315b(2, bVar);
            }
            return 0;
        } else if (i == 1) {
            String str2 = this.f131128d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            C89349b bVar2 = this.f131129e;
            return bVar2 != null ? i2 + C52418a.m58675b(2, bVar2) : i2;
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
            C48860bi0 bi02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                bi02.f131128d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                bi02.f131129e = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}
