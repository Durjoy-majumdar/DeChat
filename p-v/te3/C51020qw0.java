package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.qw0 */
public class C51020qw0 extends C47465a {

    /* renamed from: d */
    public int f140580d;

    /* renamed from: e */
    public int f140581e;

    /* renamed from: f */
    public C51946xa1 f140582f;

    /* renamed from: g */
    public C50555nj3 f140583g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51020qw0)) {
            return false;
        }
        C51020qw0 qw02 = (C51020qw0) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f140580d), Integer.valueOf(qw02.f140580d)) && C46238a.m51546a(Integer.valueOf(this.f140581e), Integer.valueOf(qw02.f140581e)) && C46238a.m51546a(this.f140582f, qw02.f140582f) && C46238a.m51546a(this.f140583g, qw02.f140583g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f140580d);
            aVar.mo74318e(2, this.f140581e);
            C51946xa1 xa12 = this.f140582f;
            if (xa12 != null) {
                aVar.mo74322i(3, xa12.computeSize());
                this.f140582f.writeFields(aVar);
            }
            C50555nj3 nj32 = this.f140583g;
            if (nj32 != null) {
                aVar.mo74322i(4, nj32.computeSize());
                this.f140583g.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f140580d) + 0 + C52418a.m58678e(2, this.f140581e);
            C51946xa1 xa13 = this.f140582f;
            if (xa13 != null) {
                e += C52418a.m58682i(3, xa13.computeSize());
            }
            C50555nj3 nj33 = this.f140583g;
            return nj33 != null ? e + C52418a.m58682i(4, nj33.computeSize()) : e;
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
            C51020qw0 qw02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                qw02.f140580d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                qw02.f140581e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C51946xa1 xa14 = new C51946xa1();
                    if (bArr != null && bArr.length > 0) {
                        xa14.parseFrom(bArr);
                    }
                    qw02.f140582f = xa14;
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    C50555nj3 nj34 = new C50555nj3();
                    if (bArr2 != null && bArr2.length > 0) {
                        nj34.parseFrom(bArr2);
                    }
                    qw02.f140583g = nj34;
                }
                return 0;
            }
        }
    }
}
