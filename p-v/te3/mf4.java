package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class mf4 extends C47465a {

    /* renamed from: d */
    public boolean f354134d = false;

    /* renamed from: e */
    public LinkedList<C118467t1> f354135e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof mf4)) {
            return false;
        }
        mf4 mf4 = (mf4) aVar;
        return C46238a.m51546a(Boolean.valueOf(this.f354134d), Boolean.valueOf(mf4.f354134d)) && C46238a.m51546a(this.f354135e, mf4.f354135e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74314a(1, this.f354134d);
            aVar.mo74320g(2, 8, this.f354135e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58674a(1, this.f354134d) + 0 + C52418a.m58680g(2, 8, this.f354135e);
        } else {
            if (i == 2) {
                this.f354135e.clear();
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
                mf4 mf4 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    mf4.f354134d = aVar3.mo141625c(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C118467t1 t1Var = new C118467t1();
                        if (bArr != null && bArr.length > 0) {
                            t1Var.parseFrom(bArr);
                        }
                        mf4.f354135e.add(t1Var);
                    }
                    return 0;
                }
            }
        }
    }
}
