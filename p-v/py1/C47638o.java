package py1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.o */
public class C47638o extends C47465a {

    /* renamed from: d */
    public C47666s f127895d;

    public boolean compareContent(C47465a aVar) {
        return aVar != null && (aVar instanceof C47638o) && C46238a.m51546a(this.f127895d, ((C47638o) aVar).f127895d);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            C47666s sVar = this.f127895d;
            if (sVar != null) {
                aVar.mo74322i(13, sVar.computeSize());
                this.f127895d.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C47666s sVar2 = this.f127895d;
            if (sVar2 != null) {
                return 0 + C52418a.m58682i(13, sVar2.computeSize());
            }
            return 0;
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
            C47638o oVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue != 13) {
                return -1;
            }
            LinkedList<byte[]> j = aVar3.mo141632j(intValue);
            int size = j.size();
            for (int i2 = 0; i2 < size; i2++) {
                byte[] bArr = j.get(i2);
                C47666s sVar3 = new C47666s();
                if (bArr != null && bArr.length > 0) {
                    sVar3.parseFrom(bArr);
                }
                oVar.f127895d = sVar3;
            }
            return 0;
        }
    }
}
