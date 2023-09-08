package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.af2 */
public class C110955af2 extends C47465a {

    /* renamed from: d */
    public int f331874d;

    /* renamed from: e */
    public C89349b f331875e;

    /* renamed from: f */
    public C89349b f331876f;

    /* renamed from: g */
    public C89349b f331877g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C110955af2)) {
            return false;
        }
        C110955af2 af22 = (C110955af2) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f331874d), Integer.valueOf(af22.f331874d)) && C46238a.m51546a(this.f331875e, af22.f331875e) && C46238a.m51546a(this.f331876f, af22.f331876f) && C46238a.m51546a(this.f331877g, af22.f331877g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f331875e == null) {
                throw new C52419b("Not all required fields were included: SPSBuf");
            } else if (this.f331876f != null) {
                aVar.mo74318e(1, this.f331874d);
                C89349b bVar = this.f331875e;
                if (bVar != null) {
                    aVar.mo74315b(2, bVar);
                }
                C89349b bVar2 = this.f331876f;
                if (bVar2 != null) {
                    aVar.mo74315b(3, bVar2);
                }
                C89349b bVar3 = this.f331877g;
                if (bVar3 != null) {
                    aVar.mo74315b(4, bVar3);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: PPSBuf");
            }
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f331874d) + 0;
            C89349b bVar4 = this.f331875e;
            if (bVar4 != null) {
                e += C52418a.m58675b(2, bVar4);
            }
            C89349b bVar5 = this.f331876f;
            if (bVar5 != null) {
                e += C52418a.m58675b(3, bVar5);
            }
            C89349b bVar6 = this.f331877g;
            return bVar6 != null ? e + C52418a.m58675b(4, bVar6) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f331875e == null) {
                throw new C52419b("Not all required fields were included: SPSBuf");
            } else if (this.f331876f != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: PPSBuf");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C110955af2 af22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                af22.f331874d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                af22.f331875e = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue == 3) {
                af22.f331876f = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                af22.f331877g = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}
