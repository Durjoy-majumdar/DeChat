package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.mn2 */
public class C101814mn2 extends C47465a {

    /* renamed from: d */
    public String f298862d;

    /* renamed from: e */
    public C64529ln2 f298863e;

    /* renamed from: f */
    public String f298864f;

    /* renamed from: g */
    public C49978jd3 f298865g;

    /* renamed from: h */
    public C64613on2 f298866h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101814mn2)) {
            return false;
        }
        C101814mn2 mn22 = (C101814mn2) aVar;
        return C46238a.m51546a(this.f298862d, mn22.f298862d) && C46238a.m51546a(this.f298863e, mn22.f298863e) && C46238a.m51546a(this.f298864f, mn22.f298864f) && C46238a.m51546a(this.f298865g, mn22.f298865g) && C46238a.m51546a(this.f298866h, mn22.f298866h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f298862d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            C64529ln2 ln22 = this.f298863e;
            if (ln22 != null) {
                aVar.mo74322i(2, ln22.computeSize());
                this.f298863e.writeFields(aVar);
            }
            String str2 = this.f298864f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            C49978jd3 jd32 = this.f298865g;
            if (jd32 != null) {
                aVar.mo74322i(4, jd32.computeSize());
                this.f298865g.writeFields(aVar);
            }
            C64613on2 on22 = this.f298866h;
            if (on22 != null) {
                aVar.mo74322i(5, on22.computeSize());
                this.f298866h.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str3 = this.f298862d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            C64529ln2 ln23 = this.f298863e;
            if (ln23 != null) {
                i2 += C52418a.m58682i(2, ln23.computeSize());
            }
            String str4 = this.f298864f;
            if (str4 != null) {
                i2 += C52418a.m58683j(3, str4);
            }
            C49978jd3 jd33 = this.f298865g;
            if (jd33 != null) {
                i2 += C52418a.m58682i(4, jd33.computeSize());
            }
            C64613on2 on23 = this.f298866h;
            return on23 != null ? i2 + C52418a.m58682i(5, on23.computeSize()) : i2;
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
            C101814mn2 mn22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                mn22.f298862d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C64529ln2 ln24 = new C64529ln2();
                    if (bArr != null && bArr.length > 0) {
                        ln24.parseFrom(bArr);
                    }
                    mn22.f298863e = ln24;
                }
                return 0;
            } else if (intValue == 3) {
                mn22.f298864f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C49978jd3 jd34 = new C49978jd3();
                    if (bArr2 != null && bArr2.length > 0) {
                        jd34.parseFrom(bArr2);
                    }
                    mn22.f298865g = jd34;
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C64613on2 on24 = new C64613on2();
                    if (bArr3 != null && bArr3.length > 0) {
                        on24.parseFrom(bArr3);
                    }
                    mn22.f298866h = on24;
                }
                return 0;
            }
        }
    }
}
