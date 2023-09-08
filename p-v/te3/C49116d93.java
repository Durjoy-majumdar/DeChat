package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.d93 */
public class C49116d93 extends C47465a {

    /* renamed from: d */
    public zf4 f132198d;

    /* renamed from: e */
    public zf4 f132199e;

    /* renamed from: f */
    public de4 f132200f;

    /* renamed from: g */
    public boolean f132201g;

    /* renamed from: h */
    public boolean f132202h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49116d93)) {
            return false;
        }
        C49116d93 d932 = (C49116d93) aVar;
        return C46238a.m51546a(this.f132198d, d932.f132198d) && C46238a.m51546a(this.f132199e, d932.f132199e) && C46238a.m51546a(this.f132200f, d932.f132200f) && C46238a.m51546a(Boolean.valueOf(this.f132201g), Boolean.valueOf(d932.f132201g)) && C46238a.m51546a(Boolean.valueOf(this.f132202h), Boolean.valueOf(d932.f132202h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            zf4 zf4 = this.f132198d;
            if (zf4 != null) {
                aVar.mo74322i(1, zf4.computeSize());
                this.f132198d.writeFields(aVar);
            }
            zf4 zf42 = this.f132199e;
            if (zf42 != null) {
                aVar.mo74322i(2, zf42.computeSize());
                this.f132199e.writeFields(aVar);
            }
            de4 de4 = this.f132200f;
            if (de4 != null) {
                aVar.mo74322i(3, de4.computeSize());
                this.f132200f.writeFields(aVar);
            }
            aVar.mo74314a(4, this.f132201g);
            aVar.mo74314a(5, this.f132202h);
            return 0;
        } else if (i == 1) {
            zf4 zf43 = this.f132198d;
            if (zf43 != null) {
                i2 = 0 + C52418a.m58682i(1, zf43.computeSize());
            }
            zf4 zf44 = this.f132199e;
            if (zf44 != null) {
                i2 += C52418a.m58682i(2, zf44.computeSize());
            }
            de4 de42 = this.f132200f;
            if (de42 != null) {
                i2 += C52418a.m58682i(3, de42.computeSize());
            }
            return i2 + C52418a.m58674a(4, this.f132201g) + C52418a.m58674a(5, this.f132202h);
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
            C49116d93 d932 = objArr[1];
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
                    d932.f132198d = zf45;
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
                    d932.f132199e = zf46;
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    de4 de43 = new de4();
                    if (bArr3 != null && bArr3.length > 0) {
                        de43.parseFrom(bArr3);
                    }
                    d932.f132200f = de43;
                }
                return 0;
            } else if (intValue == 4) {
                d932.f132201g = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                d932.f132202h = aVar3.mo141625c(intValue);
                return 0;
            }
        }
    }
}
