package p821rk;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: rk.o */
public class C48042o extends C47465a {

    /* renamed from: d */
    public C48044q f128882d;

    public boolean compareContent(C47465a aVar) {
        return aVar != null && (aVar instanceof C48042o) && C46238a.m51546a(this.f128882d, ((C48042o) aVar).f128882d);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            C48044q qVar = this.f128882d;
            if (qVar != null) {
                aVar.mo74322i(1, qVar.computeSize());
                this.f128882d.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C48044q qVar2 = this.f128882d;
            if (qVar2 != null) {
                return 0 + C52418a.m58682i(1, qVar2.computeSize());
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
            C48042o oVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue != 1) {
                return -1;
            }
            LinkedList<byte[]> j = aVar3.mo141632j(intValue);
            int size = j.size();
            for (int i2 = 0; i2 < size; i2++) {
                byte[] bArr = j.get(i2);
                C48044q qVar3 = new C48044q();
                if (bArr != null && bArr.length > 0) {
                    qVar3.parseFrom(bArr);
                }
                oVar.f128882d = qVar3;
            }
            return 0;
        }
    }
}
