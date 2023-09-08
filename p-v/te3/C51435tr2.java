package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.tr2 */
public class C51435tr2 extends C47465a {

    /* renamed from: d */
    public C51018qv3 f142375d;

    /* renamed from: e */
    public int f142376e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51435tr2)) {
            return false;
        }
        C51435tr2 tr22 = (C51435tr2) aVar;
        return C46238a.m51546a(this.f142375d, tr22.f142375d) && C46238a.m51546a(Integer.valueOf(this.f142376e), Integer.valueOf(tr22.f142376e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C51018qv3 qv32 = this.f142375d;
            if (qv32 != null) {
                if (qv32 != null) {
                    aVar.mo74322i(1, qv32.computeSize());
                    this.f142375d.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f142376e);
                return 0;
            }
            throw new C52419b("Not all required fields were included: NotifyData");
        } else if (i == 1) {
            C51018qv3 qv33 = this.f142375d;
            if (qv33 != null) {
                i2 = 0 + C52418a.m58682i(1, qv33.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f142376e);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f142375d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: NotifyData");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C51435tr2 tr22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C51018qv3 qv34 = new C51018qv3();
                    if (bArr != null && bArr.length > 0) {
                        qv34.mo73348f(bArr);
                    }
                    tr22.f142375d = qv34;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                tr22.f142376e = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
