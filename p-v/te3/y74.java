package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class y74 extends C47465a {

    /* renamed from: d */
    public int f145159d;

    /* renamed from: e */
    public r94 f145160e;

    /* renamed from: f */
    public C51708vl3 f145161f;

    /* renamed from: g */
    public C50488n30 f145162g;

    /* renamed from: h */
    public C51972xg3 f145163h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof y74)) {
            return false;
        }
        y74 y74 = (y74) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f145159d), Integer.valueOf(y74.f145159d)) && C46238a.m51546a(this.f145160e, y74.f145160e) && C46238a.m51546a(this.f145161f, y74.f145161f) && C46238a.m51546a(this.f145162g, y74.f145162g) && C46238a.m51546a(this.f145163h, y74.f145163h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f145159d);
            r94 r94 = this.f145160e;
            if (r94 != null) {
                aVar.mo74322i(2, r94.computeSize());
                this.f145160e.writeFields(aVar);
            }
            C51708vl3 vl32 = this.f145161f;
            if (vl32 != null) {
                aVar.mo74322i(3, vl32.computeSize());
                this.f145161f.writeFields(aVar);
            }
            C50488n30 n302 = this.f145162g;
            if (n302 != null) {
                aVar.mo74322i(4, n302.computeSize());
                this.f145162g.writeFields(aVar);
            }
            C51972xg3 xg32 = this.f145163h;
            if (xg32 != null) {
                aVar.mo74322i(5, xg32.computeSize());
                this.f145163h.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f145159d) + 0;
            r94 r942 = this.f145160e;
            if (r942 != null) {
                e += C52418a.m58682i(2, r942.computeSize());
            }
            C51708vl3 vl33 = this.f145161f;
            if (vl33 != null) {
                e += C52418a.m58682i(3, vl33.computeSize());
            }
            C50488n30 n303 = this.f145162g;
            if (n303 != null) {
                e += C52418a.m58682i(4, n303.computeSize());
            }
            C51972xg3 xg33 = this.f145163h;
            return xg33 != null ? e + C52418a.m58682i(5, xg33.computeSize()) : e;
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
            y74 y74 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                y74.f145159d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    r94 r943 = new r94();
                    if (bArr != null && bArr.length > 0) {
                        r943.parseFrom(bArr);
                    }
                    y74.f145160e = r943;
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    C51708vl3 vl34 = new C51708vl3();
                    if (bArr2 != null && bArr2.length > 0) {
                        vl34.parseFrom(bArr2);
                    }
                    y74.f145161f = vl34;
                }
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    byte[] bArr3 = j3.get(i4);
                    C50488n30 n304 = new C50488n30();
                    if (bArr3 != null && bArr3.length > 0) {
                        n304.parseFrom(bArr3);
                    }
                    y74.f145162g = n304;
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                int size4 = j4.size();
                for (int i5 = 0; i5 < size4; i5++) {
                    byte[] bArr4 = j4.get(i5);
                    C51972xg3 xg34 = new C51972xg3();
                    if (bArr4 != null && bArr4.length > 0) {
                        xg34.parseFrom(bArr4);
                    }
                    y74.f145163h = xg34;
                }
                return 0;
            }
        }
    }
}
