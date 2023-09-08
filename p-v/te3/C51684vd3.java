package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.vd3 */
public class C51684vd3 extends C47465a {

    /* renamed from: d */
    public String f143442d;

    /* renamed from: e */
    public p35 f143443e;

    /* renamed from: f */
    public s35 f143444f;

    /* renamed from: g */
    public l35 f143445g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51684vd3)) {
            return false;
        }
        C51684vd3 vd32 = (C51684vd3) aVar;
        return C46238a.m51546a(this.f143442d, vd32.f143442d) && C46238a.m51546a(this.f143443e, vd32.f143443e) && C46238a.m51546a(this.f143444f, vd32.f143444f) && C46238a.m51546a(this.f143445g, vd32.f143445g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f143442d;
            if (str != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                p35 p35 = this.f143443e;
                if (p35 != null) {
                    aVar.mo74322i(2, p35.computeSize());
                    this.f143443e.writeFields(aVar);
                }
                s35 s35 = this.f143444f;
                if (s35 != null) {
                    aVar.mo74322i(3, s35.computeSize());
                    this.f143444f.writeFields(aVar);
                }
                l35 l35 = this.f143445g;
                if (l35 != null) {
                    aVar.mo74322i(4, l35.computeSize());
                    this.f143445g.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: PkgId");
        } else if (i == 1) {
            String str2 = this.f143442d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            p35 p352 = this.f143443e;
            if (p352 != null) {
                i2 += C52418a.m58682i(2, p352.computeSize());
            }
            s35 s352 = this.f143444f;
            if (s352 != null) {
                i2 += C52418a.m58682i(3, s352.computeSize());
            }
            l35 l352 = this.f143445g;
            return l352 != null ? i2 + C52418a.m58682i(4, l352.computeSize()) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f143442d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: PkgId");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C51684vd3 vd32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                vd32.f143442d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    p35 p353 = new p35();
                    if (bArr != null && bArr.length > 0) {
                        p353.parseFrom(bArr);
                    }
                    vd32.f143443e = p353;
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    s35 s353 = new s35();
                    if (bArr2 != null && bArr2.length > 0) {
                        s353.parseFrom(bArr2);
                    }
                    vd32.f143444f = s353;
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    l35 l353 = new l35();
                    if (bArr3 != null && bArr3.length > 0) {
                        l353.parseFrom(bArr3);
                    }
                    vd32.f143445g = l353;
                }
                return 0;
            }
        }
    }
}
