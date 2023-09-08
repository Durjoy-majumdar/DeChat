package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.hd3 */
public class C49690hd3 extends C47465a {

    /* renamed from: d */
    public boolean f134573d;

    /* renamed from: e */
    public boolean f134574e;

    /* renamed from: f */
    public zf4 f134575f;

    /* renamed from: g */
    public LinkedList<C48741ao> f134576g = new LinkedList<>();

    /* renamed from: h */
    public LinkedList<C49794i33> f134577h = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49690hd3)) {
            return false;
        }
        C49690hd3 hd32 = (C49690hd3) aVar;
        return C46238a.m51546a(Boolean.valueOf(this.f134573d), Boolean.valueOf(hd32.f134573d)) && C46238a.m51546a(Boolean.valueOf(this.f134574e), Boolean.valueOf(hd32.f134574e)) && C46238a.m51546a(this.f134575f, hd32.f134575f) && C46238a.m51546a(this.f134576g, hd32.f134576g) && C46238a.m51546a(this.f134577h, hd32.f134577h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74314a(1, this.f134573d);
            aVar.mo74314a(2, this.f134574e);
            zf4 zf4 = this.f134575f;
            if (zf4 != null) {
                aVar.mo74322i(3, zf4.computeSize());
                this.f134575f.writeFields(aVar);
            }
            aVar.mo74320g(4, 8, this.f134576g);
            aVar.mo74320g(5, 8, this.f134577h);
            return 0;
        } else if (i == 1) {
            int a = C52418a.m58674a(1, this.f134573d) + 0 + C52418a.m58674a(2, this.f134574e);
            zf4 zf42 = this.f134575f;
            if (zf42 != null) {
                a += C52418a.m58682i(3, zf42.computeSize());
            }
            return a + C52418a.m58680g(4, 8, this.f134576g) + C52418a.m58680g(5, 8, this.f134577h);
        } else if (i == 2) {
            this.f134576g.clear();
            this.f134577h.clear();
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
            C49690hd3 hd32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                hd32.f134573d = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue == 2) {
                hd32.f134574e = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    zf4 zf43 = new zf4();
                    if (bArr != null && bArr.length > 0) {
                        zf43.parseFrom(bArr);
                    }
                    hd32.f134575f = zf43;
                }
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    C48741ao aoVar = new C48741ao();
                    if (bArr2 != null && bArr2.length > 0) {
                        aoVar.parseFrom(bArr2);
                    }
                    hd32.f134576g.add(aoVar);
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    byte[] bArr3 = j3.get(i4);
                    C49794i33 i332 = new C49794i33();
                    if (bArr3 != null && bArr3.length > 0) {
                        i332.parseFrom(bArr3);
                    }
                    hd32.f134577h.add(i332);
                }
                return 0;
            }
        }
    }
}
