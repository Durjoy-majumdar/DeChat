package s71;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: s71.n */
public class C48254n extends C47465a {

    /* renamed from: d */
    public C48243c f129273d;

    /* renamed from: e */
    public int f129274e;

    /* renamed from: f */
    public int f129275f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48254n)) {
            return false;
        }
        C48254n nVar = (C48254n) aVar;
        return C46238a.m51546a(this.f129273d, nVar.f129273d) && C46238a.m51546a(Integer.valueOf(this.f129274e), Integer.valueOf(nVar.f129274e)) && C46238a.m51546a(Integer.valueOf(this.f129275f), Integer.valueOf(nVar.f129275f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C48243c cVar = this.f129273d;
            if (cVar != null) {
                if (cVar != null) {
                    aVar.mo74322i(1, cVar.computeSize());
                    this.f129273d.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f129274e);
                aVar.mo74318e(3, this.f129275f);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BasePush");
        } else if (i == 1) {
            C48243c cVar2 = this.f129273d;
            if (cVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, cVar2.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f129274e) + C52418a.m58678e(3, this.f129275f);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f129273d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: BasePush");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C48254n nVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C48243c cVar3 = new C48243c();
                    if (bArr != null && bArr.length > 0) {
                        cVar3.parseFrom(bArr);
                    }
                    nVar.f129273d = cVar3;
                }
                return 0;
            } else if (intValue == 2) {
                nVar.f129274e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                nVar.f129275f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
