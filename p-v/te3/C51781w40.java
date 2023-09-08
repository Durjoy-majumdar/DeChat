package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.w40 */
public class C51781w40 extends C47465a {

    /* renamed from: d */
    public zf4 f143848d;

    /* renamed from: e */
    public zf4 f143849e;

    /* renamed from: f */
    public C48730al f143850f;

    /* renamed from: g */
    public C48730al f143851g;

    /* renamed from: h */
    public String f143852h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51781w40)) {
            return false;
        }
        C51781w40 w402 = (C51781w40) aVar;
        return C46238a.m51546a(this.f143848d, w402.f143848d) && C46238a.m51546a(this.f143849e, w402.f143849e) && C46238a.m51546a(this.f143850f, w402.f143850f) && C46238a.m51546a(this.f143851g, w402.f143851g) && C46238a.m51546a(this.f143852h, w402.f143852h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            zf4 zf4 = this.f143848d;
            if (zf4 != null) {
                aVar.mo74322i(1, zf4.computeSize());
                this.f143848d.writeFields(aVar);
            }
            zf4 zf42 = this.f143849e;
            if (zf42 != null) {
                aVar.mo74322i(2, zf42.computeSize());
                this.f143849e.writeFields(aVar);
            }
            C48730al alVar = this.f143850f;
            if (alVar != null) {
                aVar.mo74322i(3, alVar.computeSize());
                this.f143850f.writeFields(aVar);
            }
            C48730al alVar2 = this.f143851g;
            if (alVar2 != null) {
                aVar.mo74322i(4, alVar2.computeSize());
                this.f143851g.writeFields(aVar);
            }
            String str = this.f143852h;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            return 0;
        } else if (i == 1) {
            zf4 zf43 = this.f143848d;
            if (zf43 != null) {
                i2 = 0 + C52418a.m58682i(1, zf43.computeSize());
            }
            zf4 zf44 = this.f143849e;
            if (zf44 != null) {
                i2 += C52418a.m58682i(2, zf44.computeSize());
            }
            C48730al alVar3 = this.f143850f;
            if (alVar3 != null) {
                i2 += C52418a.m58682i(3, alVar3.computeSize());
            }
            C48730al alVar4 = this.f143851g;
            if (alVar4 != null) {
                i2 += C52418a.m58682i(4, alVar4.computeSize());
            }
            String str2 = this.f143852h;
            return str2 != null ? i2 + C52418a.m58683j(5, str2) : i2;
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
            C51781w40 w402 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    zf4 zf45 = new zf4();
                    if (bArr != null && bArr.length > 0) {
                        zf45.parseFrom(bArr);
                    }
                    w402.f143848d = zf45;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    zf4 zf46 = new zf4();
                    if (bArr2 != null && bArr2.length > 0) {
                        zf46.parseFrom(bArr2);
                    }
                    w402.f143849e = zf46;
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C48730al alVar5 = new C48730al();
                    if (bArr3 != null && bArr3.length > 0) {
                        alVar5.parseFrom(bArr3);
                    }
                    w402.f143850f = alVar5;
                }
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                int size4 = j4.size();
                for (int i6 = 0; i6 < size4; i6++) {
                    byte[] bArr4 = j4.get(i6);
                    C48730al alVar6 = new C48730al();
                    if (bArr4 != null && bArr4.length > 0) {
                        alVar6.parseFrom(bArr4);
                    }
                    w402.f143851g = alVar6;
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                w402.f143852h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
