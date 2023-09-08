package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.h42 */
public class C49657h42 extends C47465a {

    /* renamed from: d */
    public String f134440d;

    /* renamed from: e */
    public vt4 f134441e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49657h42)) {
            return false;
        }
        C49657h42 h422 = (C49657h42) aVar;
        return C46238a.m51546a(this.f134440d, h422.f134440d) && C46238a.m51546a(this.f134441e, h422.f134441e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f134440d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            vt4 vt4 = this.f134441e;
            if (vt4 != null) {
                aVar.mo74322i(2, vt4.computeSize());
                this.f134441e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str2 = this.f134440d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            vt4 vt42 = this.f134441e;
            return vt42 != null ? i2 + C52418a.m58682i(2, vt42.computeSize()) : i2;
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
            C49657h42 h422 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                h422.f134440d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    vt4 vt43 = new vt4();
                    if (bArr != null && bArr.length > 0) {
                        vt43.parseFrom(bArr);
                    }
                    h422.f134441e = vt43;
                }
                return 0;
            }
        }
    }
}
