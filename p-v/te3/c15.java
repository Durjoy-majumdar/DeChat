package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class c15 extends C47465a {

    /* renamed from: d */
    public boolean f131447d;

    /* renamed from: e */
    public LinkedList<a15> f131448e = new LinkedList<>();

    /* renamed from: f */
    public boolean f131449f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof c15)) {
            return false;
        }
        c15 c15 = (c15) aVar;
        return C46238a.m51546a(Boolean.valueOf(this.f131447d), Boolean.valueOf(c15.f131447d)) && C46238a.m51546a(this.f131448e, c15.f131448e) && C46238a.m51546a(Boolean.valueOf(this.f131449f), Boolean.valueOf(c15.f131449f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74314a(1, this.f131447d);
            aVar.mo74320g(2, 8, this.f131448e);
            aVar.mo74314a(3, this.f131449f);
            return 0;
        } else if (i == 1) {
            return C52418a.m58674a(1, this.f131447d) + 0 + C52418a.m58680g(2, 8, this.f131448e) + C52418a.m58674a(3, this.f131449f);
        } else {
            if (i == 2) {
                this.f131448e.clear();
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
                c15 c15 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    c15.f131447d = aVar3.mo141625c(intValue);
                    return 0;
                } else if (intValue == 2) {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        a15 a15 = new a15();
                        if (bArr != null && bArr.length > 0) {
                            a15.parseFrom(bArr);
                        }
                        c15.f131448e.add(a15);
                    }
                    return 0;
                } else if (intValue != 3) {
                    return -1;
                } else {
                    c15.f131449f = aVar3.mo141625c(intValue);
                    return 0;
                }
            }
        }
    }
}
