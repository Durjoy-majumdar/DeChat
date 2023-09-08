package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.oc0 */
public class C50660oc0 extends C47465a {

    /* renamed from: d */
    public long f139084d;

    /* renamed from: e */
    public long f139085e;

    /* renamed from: f */
    public LinkedList<jg4> f139086f = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50660oc0)) {
            return false;
        }
        C50660oc0 oc02 = (C50660oc0) aVar;
        return C46238a.m51546a(Long.valueOf(this.f139084d), Long.valueOf(oc02.f139084d)) && C46238a.m51546a(Long.valueOf(this.f139085e), Long.valueOf(oc02.f139085e)) && C46238a.m51546a(this.f139086f, oc02.f139086f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f139084d);
            aVar.mo74321h(2, this.f139085e);
            aVar.mo74320g(3, 8, this.f139086f);
            return 0;
        } else if (i == 1) {
            return C52418a.m58681h(1, this.f139084d) + 0 + C52418a.m58681h(2, this.f139085e) + C52418a.m58680g(3, 8, this.f139086f);
        } else {
            if (i == 2) {
                this.f139086f.clear();
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
                C50660oc0 oc02 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    oc02.f139084d = aVar3.mo141631i(intValue);
                    return 0;
                } else if (intValue == 2) {
                    oc02.f139085e = aVar3.mo141631i(intValue);
                    return 0;
                } else if (intValue != 3) {
                    return -1;
                } else {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        jg4 jg4 = new jg4();
                        if (bArr != null && bArr.length > 0) {
                            jg4.parseFrom(bArr);
                        }
                        oc02.f139086f.add(jg4);
                    }
                    return 0;
                }
            }
        }
    }
}
