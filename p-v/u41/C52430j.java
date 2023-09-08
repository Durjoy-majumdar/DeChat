package u41;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: u41.j */
public class C52430j extends C47465a {

    /* renamed from: d */
    public C52425e f146522d;

    /* renamed from: e */
    public String f146523e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52430j)) {
            return false;
        }
        C52430j jVar = (C52430j) aVar;
        return C46238a.m51546a(this.f146522d, jVar.f146522d) && C46238a.m51546a(this.f146523e, jVar.f146523e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C52425e eVar = this.f146522d;
            if (eVar != null) {
                if (eVar != null) {
                    aVar.mo74322i(1, eVar.computeSize());
                    this.f146522d.writeFields(aVar);
                }
                String str = this.f146523e;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: app_info");
        } else if (i == 1) {
            C52425e eVar2 = this.f146522d;
            if (eVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, eVar2.computeSize());
            }
            String str2 = this.f146523e;
            return str2 != null ? i2 + C52418a.m58683j(2, str2) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f146522d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: app_info");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C52430j jVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C52425e eVar3 = new C52425e();
                    if (bArr != null && bArr.length > 0) {
                        eVar3.parseFrom(bArr);
                    }
                    jVar.f146522d = eVar3;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                jVar.f146523e = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
