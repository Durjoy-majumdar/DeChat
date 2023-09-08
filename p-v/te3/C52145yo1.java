package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.yo1 */
public class C52145yo1 extends C47465a {

    /* renamed from: d */
    public long f145434d;

    /* renamed from: e */
    public C50882pv2 f145435e;

    /* renamed from: f */
    public String f145436f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52145yo1)) {
            return false;
        }
        C52145yo1 yo12 = (C52145yo1) aVar;
        return C46238a.m51546a(Long.valueOf(this.f145434d), Long.valueOf(yo12.f145434d)) && C46238a.m51546a(this.f145435e, yo12.f145435e) && C46238a.m51546a(this.f145436f, yo12.f145436f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f145434d);
            C50882pv2 pv22 = this.f145435e;
            if (pv22 != null) {
                aVar.mo74322i(2, pv22.computeSize());
                this.f145435e.writeFields(aVar);
            }
            String str = this.f145436f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f145434d) + 0;
            C50882pv2 pv23 = this.f145435e;
            if (pv23 != null) {
                h += C52418a.m58682i(2, pv23.computeSize());
            }
            String str2 = this.f145436f;
            return str2 != null ? h + C52418a.m58683j(3, str2) : h;
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
            C52145yo1 yo12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                yo12.f145434d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C50882pv2 pv24 = new C50882pv2();
                    if (bArr != null && bArr.length > 0) {
                        pv24.parseFrom(bArr);
                    }
                    yo12.f145435e = pv24;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                yo12.f145436f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
