package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.hz */
public class C64433hz extends C47465a {

    /* renamed from: d */
    public long f183568d;

    /* renamed from: e */
    public long f183569e;

    /* renamed from: f */
    public LinkedList<C64407gz> f183570f = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64433hz)) {
            return false;
        }
        C64433hz hzVar = (C64433hz) aVar;
        return C46238a.m51546a(Long.valueOf(this.f183568d), Long.valueOf(hzVar.f183568d)) && C46238a.m51546a(Long.valueOf(this.f183569e), Long.valueOf(hzVar.f183569e)) && C46238a.m51546a(this.f183570f, hzVar.f183570f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f183568d);
            aVar.mo74321h(2, this.f183569e);
            aVar.mo74320g(3, 8, this.f183570f);
            return 0;
        } else if (i == 1) {
            return C52418a.m58681h(1, this.f183568d) + 0 + C52418a.m58681h(2, this.f183569e) + C52418a.m58680g(3, 8, this.f183570f);
        } else {
            if (i == 2) {
                this.f183570f.clear();
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
                C64433hz hzVar = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    hzVar.f183568d = aVar3.mo141631i(intValue);
                    return 0;
                } else if (intValue == 2) {
                    hzVar.f183569e = aVar3.mo141631i(intValue);
                    return 0;
                } else if (intValue != 3) {
                    return -1;
                } else {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C64407gz gzVar = new C64407gz();
                        if (bArr != null && bArr.length > 0) {
                            gzVar.parseFrom(bArr);
                        }
                        hzVar.f183570f.add(gzVar);
                    }
                    return 0;
                }
            }
        }
    }
}
