package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class dd4 extends C101820nt3 {

    /* renamed from: d */
    public String f182698d;

    /* renamed from: e */
    public x55 f182699e;

    /* renamed from: f */
    public y55 f182700f;

    /* renamed from: g */
    public z55 f182701g;

    /* renamed from: h */
    public d85 f182702h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof dd4)) {
            return false;
        }
        dd4 dd4 = (dd4) aVar;
        return C46238a.m51546a(this.BaseRequest, dd4.BaseRequest) && C46238a.m51546a(this.f182698d, dd4.f182698d) && C46238a.m51546a(this.f182699e, dd4.f182699e) && C46238a.m51546a(this.f182700f, dd4.f182700f) && C46238a.m51546a(this.f182701g, dd4.f182701g) && C46238a.m51546a(this.f182702h, dd4.f182702h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            String str = this.f182698d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            x55 x55 = this.f182699e;
            if (x55 != null) {
                aVar.mo74322i(3, x55.computeSize());
                this.f182699e.writeFields(aVar);
            }
            y55 y55 = this.f182700f;
            if (y55 != null) {
                aVar.mo74322i(6, y55.computeSize());
                this.f182700f.writeFields(aVar);
            }
            z55 z55 = this.f182701g;
            if (z55 != null) {
                aVar.mo74322i(7, z55.computeSize());
                this.f182701g.writeFields(aVar);
            }
            d85 d85 = this.f182702h;
            if (d85 != null) {
                aVar.mo74322i(8, d85.computeSize());
                this.f182702h.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str2 = this.f182698d;
            if (str2 != null) {
                i2 += C52418a.m58683j(2, str2);
            }
            x55 x552 = this.f182699e;
            if (x552 != null) {
                i2 += C52418a.m58682i(3, x552.computeSize());
            }
            y55 y552 = this.f182700f;
            if (y552 != null) {
                i2 += C52418a.m58682i(6, y552.computeSize());
            }
            z55 z552 = this.f182701g;
            if (z552 != null) {
                i2 += C52418a.m58682i(7, z552.computeSize());
            }
            d85 d852 = this.f182702h;
            return d852 != null ? i2 + C52418a.m58682i(8, d852.computeSize()) : i2;
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
            dd4 dd4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C90417ia iaVar3 = new C90417ia();
                    if (bArr != null && bArr.length > 0) {
                        iaVar3.parseFrom(bArr);
                    }
                    dd4.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                dd4.f182698d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    x55 x553 = new x55();
                    if (bArr2 != null && bArr2.length > 0) {
                        x553.parseFrom(bArr2);
                    }
                    dd4.f182699e = x553;
                }
                return 0;
            } else if (intValue == 6) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    y55 y553 = new y55();
                    if (bArr3 != null && bArr3.length > 0) {
                        y553.parseFrom(bArr3);
                    }
                    dd4.f182700f = y553;
                }
                return 0;
            } else if (intValue == 7) {
                LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                int size4 = j4.size();
                for (int i6 = 0; i6 < size4; i6++) {
                    byte[] bArr4 = j4.get(i6);
                    z55 z553 = new z55();
                    if (bArr4 != null && bArr4.length > 0) {
                        z553.parseFrom(bArr4);
                    }
                    dd4.f182701g = z553;
                }
                return 0;
            } else if (intValue != 8) {
                return -1;
            } else {
                LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                int size5 = j5.size();
                for (int i7 = 0; i7 < size5; i7++) {
                    byte[] bArr5 = j5.get(i7);
                    d85 d853 = new d85();
                    if (bArr5 != null && bArr5.length > 0) {
                        d853.parseFrom(bArr5);
                    }
                    dd4.f182702h = d853;
                }
                return 0;
            }
        }
    }
}
