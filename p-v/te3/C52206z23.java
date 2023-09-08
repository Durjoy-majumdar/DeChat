package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.z23 */
public class C52206z23 extends C47465a {

    /* renamed from: d */
    public zf4 f145657d;

    /* renamed from: e */
    public C48804b33 f145658e;

    /* renamed from: f */
    public C48661a33 f145659f;

    /* renamed from: g */
    public C48661a33 f145660g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52206z23)) {
            return false;
        }
        C52206z23 z232 = (C52206z23) aVar;
        return C46238a.m51546a(this.f145657d, z232.f145657d) && C46238a.m51546a(this.f145658e, z232.f145658e) && C46238a.m51546a(this.f145659f, z232.f145659f) && C46238a.m51546a(this.f145660g, z232.f145660g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            zf4 zf4 = this.f145657d;
            if (zf4 != null) {
                aVar.mo74322i(1, zf4.computeSize());
                this.f145657d.writeFields(aVar);
            }
            C48804b33 b332 = this.f145658e;
            if (b332 != null) {
                aVar.mo74322i(2, b332.computeSize());
                this.f145658e.writeFields(aVar);
            }
            C48661a33 a332 = this.f145659f;
            if (a332 != null) {
                aVar.mo74322i(3, a332.computeSize());
                this.f145659f.writeFields(aVar);
            }
            C48661a33 a333 = this.f145660g;
            if (a333 != null) {
                aVar.mo74322i(4, a333.computeSize());
                this.f145660g.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            zf4 zf42 = this.f145657d;
            if (zf42 != null) {
                i2 = 0 + C52418a.m58682i(1, zf42.computeSize());
            }
            C48804b33 b333 = this.f145658e;
            if (b333 != null) {
                i2 += C52418a.m58682i(2, b333.computeSize());
            }
            C48661a33 a334 = this.f145659f;
            if (a334 != null) {
                i2 += C52418a.m58682i(3, a334.computeSize());
            }
            C48661a33 a335 = this.f145660g;
            return a335 != null ? i2 + C52418a.m58682i(4, a335.computeSize()) : i2;
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
            C52206z23 z232 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    zf4 zf43 = new zf4();
                    if (bArr != null && bArr.length > 0) {
                        zf43.parseFrom(bArr);
                    }
                    z232.f145657d = zf43;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C48804b33 b334 = new C48804b33();
                    if (bArr2 != null && bArr2.length > 0) {
                        b334.parseFrom(bArr2);
                    }
                    z232.f145658e = b334;
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C48661a33 a336 = new C48661a33();
                    if (bArr3 != null && bArr3.length > 0) {
                        a336.parseFrom(bArr3);
                    }
                    z232.f145659f = a336;
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                int size4 = j4.size();
                for (int i6 = 0; i6 < size4; i6++) {
                    byte[] bArr4 = j4.get(i6);
                    C48661a33 a337 = new C48661a33();
                    if (bArr4 != null && bArr4.length > 0) {
                        a337.parseFrom(bArr4);
                    }
                    z232.f145660g = a337;
                }
                return 0;
            }
        }
    }
}
