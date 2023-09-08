package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.hz3 */
public class C49775hz3 extends C47465a {

    /* renamed from: d */
    public C89349b f134985d;

    /* renamed from: e */
    public C89349b f134986e;

    /* renamed from: f */
    public long f134987f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49775hz3)) {
            return false;
        }
        C49775hz3 hz32 = (C49775hz3) aVar;
        return C46238a.m51546a(this.f134985d, hz32.f134985d) && C46238a.m51546a(this.f134986e, hz32.f134986e) && C46238a.m51546a(Long.valueOf(this.f134987f), Long.valueOf(hz32.f134987f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C89349b bVar = this.f134985d;
            if (bVar != null) {
                if (bVar != null) {
                    aVar.mo74315b(1, bVar);
                }
                C89349b bVar2 = this.f134986e;
                if (bVar2 != null) {
                    aVar.mo74315b(2, bVar2);
                }
                aVar.mo74321h(3, this.f134987f);
                return 0;
            }
            throw new C52419b("Not all required fields were included: data");
        } else if (i == 1) {
            C89349b bVar3 = this.f134985d;
            if (bVar3 != null) {
                i2 = 0 + C52418a.m58675b(1, bVar3);
            }
            C89349b bVar4 = this.f134986e;
            if (bVar4 != null) {
                i2 += C52418a.m58675b(2, bVar4);
            }
            return i2 + C52418a.m58681h(3, this.f134987f);
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
            C49775hz3 hz32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                hz32.f134985d = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue == 2) {
                hz32.f134986e = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                hz32.f134987f = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }
}
