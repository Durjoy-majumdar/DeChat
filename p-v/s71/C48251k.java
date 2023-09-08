package s71;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: s71.k */
public class C48251k extends C48249i {

    /* renamed from: e */
    public C89349b f129268e;

    /* renamed from: f */
    public int f129269f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48251k)) {
            return false;
        }
        C48251k kVar = (C48251k) aVar;
        return C46238a.m51546a(this.f129266d, kVar.f129266d) && C46238a.m51546a(this.f129268e, kVar.f129268e) && C46238a.m51546a(Integer.valueOf(this.f129269f), Integer.valueOf(kVar.f129269f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f129268e != null) {
                C48244d dVar = this.f129266d;
                if (dVar != null) {
                    aVar.mo74322i(1, dVar.computeSize());
                    this.f129266d.writeFields(aVar);
                }
                C89349b bVar = this.f129268e;
                if (bVar != null) {
                    aVar.mo74315b(2, bVar);
                }
                aVar.mo74318e(3, this.f129269f);
                return 0;
            }
            throw new C52419b("Not all required fields were included: Data");
        } else if (i == 1) {
            C48244d dVar2 = this.f129266d;
            if (dVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, dVar2.computeSize());
            }
            C89349b bVar2 = this.f129268e;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(2, bVar2);
            }
            return i2 + C52418a.m58678e(3, this.f129269f);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f129268e != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: Data");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C48251k kVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C48244d dVar3 = new C48244d();
                    if (bArr != null && bArr.length > 0) {
                        dVar3.parseFrom(bArr);
                    }
                    kVar.f129266d = dVar3;
                }
                return 0;
            } else if (intValue == 2) {
                kVar.f129268e = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                kVar.f129269f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
