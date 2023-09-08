package py1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.h3 */
public class C47593h3 extends C47465a {

    /* renamed from: d */
    public C47589h f127755d;

    /* renamed from: e */
    public String f127756e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47593h3)) {
            return false;
        }
        C47593h3 h3Var = (C47593h3) aVar;
        return C46238a.m51546a(this.f127755d, h3Var.f127755d) && C46238a.m51546a(this.f127756e, h3Var.f127756e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C47589h hVar = this.f127755d;
            if (hVar == null) {
                throw new C52419b("Not all required fields were included: AppItem");
            } else if (this.f127756e != null) {
                if (hVar != null) {
                    aVar.mo74322i(1, hVar.computeSize());
                    this.f127755d.writeFields(aVar);
                }
                String str = this.f127756e;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: Rank");
            }
        } else if (i == 1) {
            C47589h hVar2 = this.f127755d;
            if (hVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, hVar2.computeSize());
            }
            String str2 = this.f127756e;
            return str2 != null ? i2 + C52418a.m58683j(2, str2) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f127755d == null) {
                throw new C52419b("Not all required fields were included: AppItem");
            } else if (this.f127756e != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: Rank");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C47593h3 h3Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C47589h hVar3 = new C47589h();
                    if (bArr != null && bArr.length > 0) {
                        hVar3.parseFrom(bArr);
                    }
                    h3Var.f127755d = hVar3;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                h3Var.f127756e = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
