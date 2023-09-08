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

/* renamed from: py1.h1 */
public class C47591h1 extends C101820nt3 {

    /* renamed from: d */
    public String f127751d;

    /* renamed from: e */
    public String f127752e;

    /* renamed from: f */
    public C89349b f127753f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47591h1)) {
            return false;
        }
        C47591h1 h1Var = (C47591h1) aVar;
        return C46238a.m51546a(this.BaseRequest, h1Var.BaseRequest) && C46238a.m51546a(this.f127751d, h1Var.f127751d) && C46238a.m51546a(this.f127752e, h1Var.f127752e) && C46238a.m51546a(this.f127753f, h1Var.f127753f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f127751d == null) {
                throw new C52419b("Not all required fields were included: AppID");
            } else if (this.f127752e != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                String str = this.f127751d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                String str2 = this.f127752e;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                C89349b bVar = this.f127753f;
                if (bVar != null) {
                    aVar.mo74315b(4, bVar);
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
            String str3 = this.f127751d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            String str4 = this.f127752e;
            if (str4 != null) {
                i2 += C52418a.m58683j(3, str4);
            }
            C89349b bVar2 = this.f127753f;
            return bVar2 != null ? i2 + C52418a.m58675b(4, bVar2) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f127751d == null) {
                throw new C52419b("Not all required fields were included: AppID");
            } else if (this.f127752e != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: GroupID");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C47591h1 h1Var = objArr[1];
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
                    h1Var.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                h1Var.f127751d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                h1Var.f127752e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                h1Var.f127753f = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}
