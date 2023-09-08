package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ag2 */
public class C48709ag2 extends C47465a {

    /* renamed from: d */
    public int f130501d;

    /* renamed from: e */
    public LinkedList<C49780i03> f130502e = new LinkedList<>();

    /* renamed from: f */
    public int f130503f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48709ag2)) {
            return false;
        }
        C48709ag2 ag22 = (C48709ag2) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f130501d), Integer.valueOf(ag22.f130501d)) && C46238a.m51546a(this.f130502e, ag22.f130502e) && C46238a.m51546a(Integer.valueOf(this.f130503f), Integer.valueOf(ag22.f130503f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f130501d);
            aVar.mo74320g(2, 8, this.f130502e);
            aVar.mo74318e(3, this.f130503f);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f130501d) + 0 + C52418a.m58680g(2, 8, this.f130502e) + C52418a.m58678e(3, this.f130503f);
        } else {
            if (i == 2) {
                this.f130502e.clear();
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
                C48709ag2 ag22 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    ag22.f130501d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C49780i03 i032 = new C49780i03();
                        if (bArr != null && bArr.length > 0) {
                            i032.parseFrom(bArr);
                        }
                        ag22.f130502e.add(i032);
                    }
                    return 0;
                } else if (intValue != 3) {
                    return -1;
                } else {
                    ag22.f130503f = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
