package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.b91 */
public class C48823b91 extends C47465a {

    /* renamed from: d */
    public boolean f131012d;

    /* renamed from: e */
    public LinkedList<C64807wo2> f131013e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48823b91)) {
            return false;
        }
        C48823b91 b912 = (C48823b91) aVar;
        return C46238a.m51546a(Boolean.valueOf(this.f131012d), Boolean.valueOf(b912.f131012d)) && C46238a.m51546a(this.f131013e, b912.f131013e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74314a(1, this.f131012d);
            aVar.mo74320g(2, 8, this.f131013e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58674a(1, this.f131012d) + 0 + C52418a.m58680g(2, 8, this.f131013e);
        } else {
            if (i == 2) {
                this.f131013e.clear();
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
                C48823b91 b912 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    b912.f131012d = aVar3.mo141625c(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C64807wo2 wo22 = new C64807wo2();
                        if (bArr != null && bArr.length > 0) {
                            wo22.parseFrom(bArr);
                        }
                        b912.f131013e.add(wo22);
                    }
                    return 0;
                }
            }
        }
    }
}
