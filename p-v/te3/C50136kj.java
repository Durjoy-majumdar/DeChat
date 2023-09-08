package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.kj */
public class C50136kj extends C47465a {

    /* renamed from: d */
    public int f136815d;

    /* renamed from: e */
    public int f136816e;

    /* renamed from: f */
    public C89349b f136817f;

    /* renamed from: g */
    public C89349b f136818g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50136kj)) {
            return false;
        }
        C50136kj kjVar = (C50136kj) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f136815d), Integer.valueOf(kjVar.f136815d)) && C46238a.m51546a(Integer.valueOf(this.f136816e), Integer.valueOf(kjVar.f136816e)) && C46238a.m51546a(this.f136817f, kjVar.f136817f) && C46238a.m51546a(this.f136818g, kjVar.f136818g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f136815d);
            aVar.mo74318e(2, this.f136816e);
            C89349b bVar = this.f136817f;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            C89349b bVar2 = this.f136818g;
            if (bVar2 != null) {
                aVar.mo74315b(4, bVar2);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f136815d) + 0 + C52418a.m58678e(2, this.f136816e);
            C89349b bVar3 = this.f136817f;
            if (bVar3 != null) {
                e += C52418a.m58675b(3, bVar3);
            }
            C89349b bVar4 = this.f136818g;
            return bVar4 != null ? e + C52418a.m58675b(4, bVar4) : e;
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
            C50136kj kjVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                kjVar.f136815d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                kjVar.f136816e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                kjVar.f136817f = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                kjVar.f136818g = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}
