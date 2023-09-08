package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.mw */
public class C64564mw extends C47465a {

    /* renamed from: d */
    public C89349b f184397d;

    /* renamed from: e */
    public int f184398e;

    /* renamed from: f */
    public C89349b f184399f;

    /* renamed from: g */
    public long f184400g;

    /* renamed from: h */
    public int f184401h;

    /* renamed from: i */
    public int f184402i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64564mw)) {
            return false;
        }
        C64564mw mwVar = (C64564mw) aVar;
        return C46238a.m51546a(this.f184397d, mwVar.f184397d) && C46238a.m51546a(Integer.valueOf(this.f184398e), Integer.valueOf(mwVar.f184398e)) && C46238a.m51546a(this.f184399f, mwVar.f184399f) && C46238a.m51546a(Long.valueOf(this.f184400g), Long.valueOf(mwVar.f184400g)) && C46238a.m51546a(Integer.valueOf(this.f184401h), Integer.valueOf(mwVar.f184401h)) && C46238a.m51546a(Integer.valueOf(this.f184402i), Integer.valueOf(mwVar.f184402i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C89349b bVar = this.f184397d;
            if (bVar == null) {
                throw new C52419b("Not all required fields were included: version");
            } else if (this.f184399f != null) {
                if (bVar != null) {
                    aVar.mo74315b(1, bVar);
                }
                aVar.mo74318e(2, this.f184398e);
                C89349b bVar2 = this.f184399f;
                if (bVar2 != null) {
                    aVar.mo74315b(3, bVar2);
                }
                aVar.mo74321h(4, this.f184400g);
                aVar.mo74318e(5, this.f184401h);
                aVar.mo74318e(6, this.f184402i);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: clientcheckdata");
            }
        } else if (i == 1) {
            C89349b bVar3 = this.f184397d;
            if (bVar3 != null) {
                i2 = 0 + C52418a.m58675b(1, bVar3);
            }
            int e = i2 + C52418a.m58678e(2, this.f184398e);
            C89349b bVar4 = this.f184399f;
            if (bVar4 != null) {
                e += C52418a.m58675b(3, bVar4);
            }
            return e + C52418a.m58681h(4, this.f184400g) + C52418a.m58678e(5, this.f184401h) + C52418a.m58678e(6, this.f184402i);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f184397d == null) {
                throw new C52419b("Not all required fields were included: version");
            } else if (this.f184399f != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: clientcheckdata");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C64564mw mwVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    mwVar.f184397d = aVar3.mo141626d(intValue);
                    return 0;
                case 2:
                    mwVar.f184398e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    mwVar.f184399f = aVar3.mo141626d(intValue);
                    return 0;
                case 4:
                    mwVar.f184400g = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    mwVar.f184401h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    mwVar.f184402i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
