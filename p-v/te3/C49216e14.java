package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.e14 */
public class C49216e14 extends C47465a {

    /* renamed from: d */
    public C89349b f132621d;

    /* renamed from: e */
    public String f132622e;

    /* renamed from: f */
    public C89349b f132623f;

    /* renamed from: g */
    public C89349b f132624g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49216e14)) {
            return false;
        }
        C49216e14 e142 = (C49216e14) aVar;
        return C46238a.m51546a(this.f132621d, e142.f132621d) && C46238a.m51546a(this.f132622e, e142.f132622e) && C46238a.m51546a(this.f132623f, e142.f132623f) && C46238a.m51546a(this.f132624g, e142.f132624g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C89349b bVar = this.f132621d;
            if (bVar != null) {
                aVar.mo74315b(1, bVar);
            }
            String str = this.f132622e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            C89349b bVar2 = this.f132623f;
            if (bVar2 != null) {
                aVar.mo74315b(3, bVar2);
            }
            C89349b bVar3 = this.f132624g;
            if (bVar3 != null) {
                aVar.mo74315b(4, bVar3);
            }
            return 0;
        } else if (i == 1) {
            C89349b bVar4 = this.f132621d;
            if (bVar4 != null) {
                i2 = 0 + C52418a.m58675b(1, bVar4);
            }
            String str2 = this.f132622e;
            if (str2 != null) {
                i2 += C52418a.m58683j(2, str2);
            }
            C89349b bVar5 = this.f132623f;
            if (bVar5 != null) {
                i2 += C52418a.m58675b(3, bVar5);
            }
            C89349b bVar6 = this.f132624g;
            return bVar6 != null ? i2 + C52418a.m58675b(4, bVar6) : i2;
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
            C49216e14 e142 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                e142.f132621d = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue == 2) {
                e142.f132622e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                e142.f132623f = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                e142.f132624g = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}
