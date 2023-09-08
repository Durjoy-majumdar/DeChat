package py1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import te3.C101820nt3;
import te3.C90417ia;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.s0 */
public class C47667s0 extends C101820nt3 {

    /* renamed from: d */
    public String f127989d;

    /* renamed from: e */
    public String f127990e;

    /* renamed from: f */
    public C89349b f127991f;

    /* renamed from: g */
    public C89349b f127992g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47667s0)) {
            return false;
        }
        C47667s0 s0Var = (C47667s0) aVar;
        return C46238a.m51546a(this.BaseRequest, s0Var.BaseRequest) && C46238a.m51546a(this.f127989d, s0Var.f127989d) && C46238a.m51546a(this.f127990e, s0Var.f127990e) && C46238a.m51546a(this.f127991f, s0Var.f127991f) && C46238a.m51546a(this.f127992g, s0Var.f127992g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f127989d == null) {
                throw new C52419b("Not all required fields were included: AppID");
            } else if (this.f127990e != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                String str = this.f127989d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                String str2 = this.f127990e;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                C89349b bVar = this.f127991f;
                if (bVar != null) {
                    aVar.mo74315b(4, bVar);
                }
                C89349b bVar2 = this.f127992g;
                if (bVar2 != null) {
                    aVar.mo74315b(5, bVar2);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: GroupID");
            }
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str3 = this.f127989d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            String str4 = this.f127990e;
            if (str4 != null) {
                i2 += C52418a.m58683j(3, str4);
            }
            C89349b bVar3 = this.f127991f;
            if (bVar3 != null) {
                i2 += C52418a.m58675b(4, bVar3);
            }
            C89349b bVar4 = this.f127992g;
            return bVar4 != null ? i2 + C52418a.m58675b(5, bVar4) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f127989d == null) {
                throw new C52419b("Not all required fields were included: AppID");
            } else if (this.f127990e != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: GroupID");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C47667s0 s0Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C90417ia iaVar3 = new C90417ia();
                    if (bArr != null && bArr.length > 0) {
                        iaVar3.parseFrom(bArr);
                    }
                    s0Var.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                s0Var.f127989d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                s0Var.f127990e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                s0Var.f127991f = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                s0Var.f127992g = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}
