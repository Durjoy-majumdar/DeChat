package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class k15 extends C47465a {

    /* renamed from: d */
    public long f136510d;

    /* renamed from: e */
    public C89349b f136511e;

    /* renamed from: f */
    public int f136512f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof k15)) {
            return false;
        }
        k15 k15 = (k15) aVar;
        return C46238a.m51546a(Long.valueOf(this.f136510d), Long.valueOf(k15.f136510d)) && C46238a.m51546a(this.f136511e, k15.f136511e) && C46238a.m51546a(Integer.valueOf(this.f136512f), Integer.valueOf(k15.f136512f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f136511e != null) {
                aVar.mo74321h(1, this.f136510d);
                C89349b bVar = this.f136511e;
                if (bVar != null) {
                    aVar.mo74315b(2, bVar);
                }
                aVar.mo74318e(3, this.f136512f);
                return 0;
            }
            throw new C52419b("Not all required fields were included: VoiceData");
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f136510d) + 0;
            C89349b bVar2 = this.f136511e;
            if (bVar2 != null) {
                h += C52418a.m58675b(2, bVar2);
            }
            return h + C52418a.m58678e(3, this.f136512f);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f136511e != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: VoiceData");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            k15 k15 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                k15.f136510d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 2) {
                k15.f136511e = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                k15.f136512f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
