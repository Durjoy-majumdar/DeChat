package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.rl */
public class C51122rl extends C47465a {

    /* renamed from: d */
    public LinkedList<C51260sl> f140991d = new LinkedList<>();

    /* renamed from: e */
    public boolean f140992e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51122rl)) {
            return false;
        }
        C51122rl rlVar = (C51122rl) aVar;
        return C46238a.m51546a(this.f140991d, rlVar.f140991d) && C46238a.m51546a(Boolean.valueOf(this.f140992e), Boolean.valueOf(rlVar.f140992e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f140991d);
            aVar.mo74314a(2, this.f140992e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58680g(1, 8, this.f140991d) + 0 + C52418a.m58674a(2, this.f140992e);
        } else {
            if (i == 2) {
                this.f140991d.clear();
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
                C51122rl rlVar = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C51260sl slVar = new C51260sl();
                        if (bArr != null && bArr.length > 0) {
                            slVar.parseFrom(bArr);
                        }
                        rlVar.f140991d.add(slVar);
                    }
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    rlVar.f140992e = aVar3.mo141625c(intValue);
                    return 0;
                }
            }
        }
    }
}
