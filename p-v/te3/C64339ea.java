package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ea */
public class C64339ea extends C47465a {

    /* renamed from: d */
    public int f182947d;

    /* renamed from: e */
    public C51018qv3 f182948e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64339ea)) {
            return false;
        }
        C64339ea eaVar = (C64339ea) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f182947d), Integer.valueOf(eaVar.f182947d)) && C46238a.m51546a(this.f182948e, eaVar.f182948e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f182947d);
            C51018qv3 qv32 = this.f182948e;
            if (qv32 != null) {
                aVar.mo74322i(2, qv32.computeSize());
                this.f182948e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f182947d) + 0;
            C51018qv3 qv33 = this.f182948e;
            return qv33 != null ? e + C52418a.m58682i(2, qv33.computeSize()) : e;
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
            C64339ea eaVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                eaVar.f182947d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C51018qv3 qv34 = new C51018qv3();
                    if (bArr != null && bArr.length > 0) {
                        qv34.mo73348f(bArr);
                    }
                    eaVar.f182948e = qv34;
                }
                return 0;
            }
        }
    }
}
