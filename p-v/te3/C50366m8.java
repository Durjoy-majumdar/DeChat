package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.m8 */
public class C50366m8 extends C47465a {

    /* renamed from: d */
    public C51018qv3 f137897d;

    /* renamed from: e */
    public C51018qv3 f137898e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50366m8)) {
            return false;
        }
        C50366m8 m8Var = (C50366m8) aVar;
        return C46238a.m51546a(this.f137897d, m8Var.f137897d) && C46238a.m51546a(this.f137898e, m8Var.f137898e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C51018qv3 qv32 = this.f137897d;
            if (qv32 == null) {
                throw new C52419b("Not all required fields were included: EncryptKey");
            } else if (this.f137898e != null) {
                if (qv32 != null) {
                    aVar.mo74322i(1, qv32.computeSize());
                    this.f137897d.writeFields(aVar);
                }
                C51018qv3 qv33 = this.f137898e;
                if (qv33 != null) {
                    aVar.mo74322i(2, qv33.computeSize());
                    this.f137898e.writeFields(aVar);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: Key");
            }
        } else if (i == 1) {
            C51018qv3 qv34 = this.f137897d;
            if (qv34 != null) {
                i2 = 0 + C52418a.m58682i(1, qv34.computeSize());
            }
            C51018qv3 qv35 = this.f137898e;
            return qv35 != null ? i2 + C52418a.m58682i(2, qv35.computeSize()) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f137897d == null) {
                throw new C52419b("Not all required fields were included: EncryptKey");
            } else if (this.f137898e != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: Key");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C50366m8 m8Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C51018qv3 qv36 = new C51018qv3();
                    if (bArr != null && bArr.length > 0) {
                        qv36.mo73348f(bArr);
                    }
                    m8Var.f137897d = qv36;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C51018qv3 qv37 = new C51018qv3();
                    if (bArr2 != null && bArr2.length > 0) {
                        qv37.mo73348f(bArr2);
                    }
                    m8Var.f137898e = qv37;
                }
                return 0;
            }
        }
    }
}
