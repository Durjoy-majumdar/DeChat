package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ht0 */
public class C64429ht0 extends C47465a {

    /* renamed from: d */
    public String f183551d;

    /* renamed from: e */
    public C64756up2 f183552e;

    /* renamed from: f */
    public C89349b f183553f;

    /* renamed from: g */
    public String f183554g;

    /* renamed from: h */
    public int f183555h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64429ht0)) {
            return false;
        }
        C64429ht0 ht02 = (C64429ht0) aVar;
        return C46238a.m51546a(this.f183551d, ht02.f183551d) && C46238a.m51546a(this.f183552e, ht02.f183552e) && C46238a.m51546a(this.f183553f, ht02.f183553f) && C46238a.m51546a(this.f183554g, ht02.f183554g) && C46238a.m51546a(Integer.valueOf(this.f183555h), Integer.valueOf(ht02.f183555h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f183551d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            C64756up2 up22 = this.f183552e;
            if (up22 != null) {
                aVar.mo74322i(2, up22.computeSize());
                this.f183552e.writeFields(aVar);
            }
            C89349b bVar = this.f183553f;
            if (bVar != null) {
                aVar.mo74315b(51, bVar);
            }
            String str2 = this.f183554g;
            if (str2 != null) {
                aVar.mo74323j(101, str2);
            }
            aVar.mo74318e(102, this.f183555h);
            return 0;
        } else if (i == 1) {
            String str3 = this.f183551d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            C64756up2 up23 = this.f183552e;
            if (up23 != null) {
                i2 += C52418a.m58682i(2, up23.computeSize());
            }
            C89349b bVar2 = this.f183553f;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(51, bVar2);
            }
            String str4 = this.f183554g;
            if (str4 != null) {
                i2 += C52418a.m58683j(101, str4);
            }
            return i2 + C52418a.m58678e(102, this.f183555h);
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
            C64429ht0 ht02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                ht02.f183551d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C64756up2 up24 = new C64756up2();
                    if (bArr != null && bArr.length > 0) {
                        up24.parseFrom(bArr);
                    }
                    ht02.f183552e = up24;
                }
                return 0;
            } else if (intValue == 51) {
                ht02.f183553f = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue == 101) {
                ht02.f183554g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 102) {
                return -1;
            } else {
                ht02.f183555h = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
