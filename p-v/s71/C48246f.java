package s71;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: s71.f */
public class C48246f extends C48249i {

    /* renamed from: e */
    public C89349b f129249e;

    /* renamed from: f */
    public C89349b f129250f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48246f)) {
            return false;
        }
        C48246f fVar = (C48246f) aVar;
        return C46238a.m51546a(this.f129266d, fVar.f129266d) && C46238a.m51546a(this.f129249e, fVar.f129249e) && C46238a.m51546a(this.f129250f, fVar.f129250f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C48244d dVar = this.f129266d;
            if (dVar != null) {
                aVar.mo74322i(1, dVar.computeSize());
                this.f129266d.writeFields(aVar);
            }
            C89349b bVar = this.f129249e;
            if (bVar != null) {
                aVar.mo74315b(2, bVar);
            }
            C89349b bVar2 = this.f129250f;
            if (bVar2 != null) {
                aVar.mo74315b(3, bVar2);
            }
            return 0;
        } else if (i == 1) {
            C48244d dVar2 = this.f129266d;
            if (dVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, dVar2.computeSize());
            }
            C89349b bVar3 = this.f129249e;
            if (bVar3 != null) {
                i2 += C52418a.m58675b(2, bVar3);
            }
            C89349b bVar4 = this.f129250f;
            return bVar4 != null ? i2 + C52418a.m58675b(3, bVar4) : i2;
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
            C48246f fVar = objArr[1];
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
                    fVar.f129266d = dVar3;
                }
                return 0;
            } else if (intValue == 2) {
                fVar.f129249e = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                fVar.f129250f = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}
