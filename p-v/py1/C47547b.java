package py1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.b */
public class C47547b extends C47465a {

    /* renamed from: d */
    public C47638o f127583d;

    public boolean compareContent(C47465a aVar) {
        return aVar != null && (aVar instanceof C47547b) && C46238a.m51546a(this.f127583d, ((C47547b) aVar).f127583d);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            C47638o oVar = this.f127583d;
            if (oVar != null) {
                aVar.mo74322i(2, oVar.computeSize());
                this.f127583d.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C47638o oVar2 = this.f127583d;
            if (oVar2 != null) {
                return 0 + C52418a.m58682i(2, oVar2.computeSize());
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
            C47547b bVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue != 2) {
                return -1;
            }
            LinkedList<byte[]> j = aVar3.mo141632j(intValue);
            int size = j.size();
            for (int i2 = 0; i2 < size; i2++) {
                byte[] bArr = j.get(i2);
                C47638o oVar3 = new C47638o();
                if (bArr != null && bArr.length > 0) {
                    oVar3.parseFrom(bArr);
                }
                bVar.f127583d = oVar3;
            }
            return 0;
        }
    }
}
