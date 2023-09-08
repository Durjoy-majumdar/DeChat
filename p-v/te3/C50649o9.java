package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.o9 */
public class C50649o9 extends C47465a {

    /* renamed from: d */
    public int f139036d;

    /* renamed from: e */
    public C49238e53 f139037e;

    /* renamed from: f */
    public C49238e53 f139038f;

    /* renamed from: g */
    public C49238e53 f139039g;

    /* renamed from: h */
    public C49238e53 f139040h;

    /* renamed from: i */
    public int f139041i;

    /* renamed from: j */
    public int f139042j;

    /* renamed from: n */
    public int f139043n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50649o9)) {
            return false;
        }
        C50649o9 o9Var = (C50649o9) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f139036d), Integer.valueOf(o9Var.f139036d)) && C46238a.m51546a(this.f139037e, o9Var.f139037e) && C46238a.m51546a(this.f139038f, o9Var.f139038f) && C46238a.m51546a(this.f139039g, o9Var.f139039g) && C46238a.m51546a(this.f139040h, o9Var.f139040h) && C46238a.m51546a(Integer.valueOf(this.f139041i), Integer.valueOf(o9Var.f139041i)) && C46238a.m51546a(Integer.valueOf(this.f139042j), Integer.valueOf(o9Var.f139042j)) && C46238a.m51546a(Integer.valueOf(this.f139043n), Integer.valueOf(o9Var.f139043n));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f139036d);
            C49238e53 e532 = this.f139037e;
            if (e532 != null) {
                aVar.mo74322i(2, e532.computeSize());
                this.f139037e.writeFields(aVar);
            }
            C49238e53 e533 = this.f139038f;
            if (e533 != null) {
                aVar.mo74322i(3, e533.computeSize());
                this.f139038f.writeFields(aVar);
            }
            C49238e53 e534 = this.f139039g;
            if (e534 != null) {
                aVar.mo74322i(4, e534.computeSize());
                this.f139039g.writeFields(aVar);
            }
            C49238e53 e535 = this.f139040h;
            if (e535 != null) {
                aVar.mo74322i(11, e535.computeSize());
                this.f139040h.writeFields(aVar);
            }
            aVar.mo74318e(100, this.f139041i);
            aVar.mo74318e(101, this.f139042j);
            aVar.mo74318e(102, this.f139043n);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f139036d) + 0;
            C49238e53 e536 = this.f139037e;
            if (e536 != null) {
                e += C52418a.m58682i(2, e536.computeSize());
            }
            C49238e53 e537 = this.f139038f;
            if (e537 != null) {
                e += C52418a.m58682i(3, e537.computeSize());
            }
            C49238e53 e538 = this.f139039g;
            if (e538 != null) {
                e += C52418a.m58682i(4, e538.computeSize());
            }
            C49238e53 e539 = this.f139040h;
            if (e539 != null) {
                e += C52418a.m58682i(11, e539.computeSize());
            }
            return e + C52418a.m58678e(100, this.f139041i) + C52418a.m58678e(101, this.f139042j) + C52418a.m58678e(102, this.f139043n);
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
            C50649o9 o9Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                o9Var.f139036d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C49238e53 e5310 = new C49238e53();
                    if (bArr != null && bArr.length > 0) {
                        e5310.parseFrom(bArr);
                    }
                    o9Var.f139037e = e5310;
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    C49238e53 e5311 = new C49238e53();
                    if (bArr2 != null && bArr2.length > 0) {
                        e5311.parseFrom(bArr2);
                    }
                    o9Var.f139038f = e5311;
                }
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    byte[] bArr3 = j3.get(i4);
                    C49238e53 e5312 = new C49238e53();
                    if (bArr3 != null && bArr3.length > 0) {
                        e5312.parseFrom(bArr3);
                    }
                    o9Var.f139039g = e5312;
                }
                return 0;
            } else if (intValue != 11) {
                switch (intValue) {
                    case 100:
                        o9Var.f139041i = aVar3.mo141629g(intValue);
                        return 0;
                    case 101:
                        o9Var.f139042j = aVar3.mo141629g(intValue);
                        return 0;
                    case 102:
                        o9Var.f139043n = aVar3.mo141629g(intValue);
                        return 0;
                    default:
                        return -1;
                }
            } else {
                LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                int size4 = j4.size();
                for (int i5 = 0; i5 < size4; i5++) {
                    byte[] bArr4 = j4.get(i5);
                    C49238e53 e5313 = new C49238e53();
                    if (bArr4 != null && bArr4.length > 0) {
                        e5313.parseFrom(bArr4);
                    }
                    o9Var.f139040h = e5313;
                }
                return 0;
            }
        }
    }
}
