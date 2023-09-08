package uc0;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: uc0.g */
public class C90638g extends C47465a {

    /* renamed from: d */
    public LinkedList<C111153e> f260401d = new LinkedList<>();

    /* renamed from: e */
    public double f260402e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C90638g)) {
            return false;
        }
        C90638g gVar = (C90638g) aVar;
        return C46238a.m51546a(this.f260401d, gVar.f260401d) && C46238a.m51546a(Double.valueOf(this.f260402e), Double.valueOf(gVar.f260402e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f260401d);
            aVar.mo74316c(2, this.f260402e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58680g(1, 8, this.f260401d) + 0 + C52418a.m58676c(2, this.f260402e);
        } else {
            if (i == 2) {
                this.f260401d.clear();
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
                C90638g gVar = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C111153e eVar = new C111153e();
                        if (bArr != null && bArr.length > 0) {
                            eVar.parseFrom(bArr);
                        }
                        gVar.f260401d.add(eVar);
                    }
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    gVar.f260402e = aVar3.mo141627e(intValue);
                    return 0;
                }
            }
        }
    }
}
