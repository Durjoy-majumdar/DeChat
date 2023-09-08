package s71;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: s71.h */
public class C48248h extends C47465a {

    /* renamed from: d */
    public C48243c f129263d;

    /* renamed from: e */
    public C89349b f129264e;

    /* renamed from: f */
    public int f129265f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48248h)) {
            return false;
        }
        C48248h hVar = (C48248h) aVar;
        return C46238a.m51546a(this.f129263d, hVar.f129263d) && C46238a.m51546a(this.f129264e, hVar.f129264e) && C46238a.m51546a(Integer.valueOf(this.f129265f), Integer.valueOf(hVar.f129265f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C48243c cVar = this.f129263d;
            if (cVar == null) {
                throw new C52419b("Not all required fields were included: BasePush");
            } else if (this.f129264e != null) {
                if (cVar != null) {
                    aVar.mo74322i(1, cVar.computeSize());
                    this.f129263d.writeFields(aVar);
                }
                C89349b bVar = this.f129264e;
                if (bVar != null) {
                    aVar.mo74315b(2, bVar);
                }
                aVar.mo74318e(3, this.f129265f);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: Data");
            }
        } else if (i == 1) {
            C48243c cVar2 = this.f129263d;
            if (cVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, cVar2.computeSize());
            }
            C89349b bVar2 = this.f129264e;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(2, bVar2);
            }
            return i2 + C52418a.m58678e(3, this.f129265f);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f129263d == null) {
                throw new C52419b("Not all required fields were included: BasePush");
            } else if (this.f129264e != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: Data");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C48248h hVar = objArr[1];
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
                    hVar.f129263d = cVar3;
                }
                return 0;
            } else if (intValue == 2) {
                hVar.f129264e = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                hVar.f129265f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
