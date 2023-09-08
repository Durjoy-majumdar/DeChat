package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.on0 */
public class C50704on0 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f139262d;

    /* renamed from: e */
    public String f139263e;

    /* renamed from: f */
    public String f139264f;

    /* renamed from: g */
    public String f139265g;

    /* renamed from: h */
    public C64840xw0 f139266h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50704on0)) {
            return false;
        }
        C50704on0 on02 = (C50704on0) aVar;
        return C46238a.m51546a(this.BaseRequest, on02.BaseRequest) && C46238a.m51546a(this.f139262d, on02.f139262d) && C46238a.m51546a(this.f139263e, on02.f139263e) && C46238a.m51546a(this.f139264f, on02.f139264f) && C46238a.m51546a(this.f139265g, on02.f139265g) && C46238a.m51546a(this.f139266h, on02.f139266h);
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
            C49842ig0 ig02 = this.f139262d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f139262d.writeFields(aVar);
            }
            String str = this.f139263e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f139264f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f139265g;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            C64840xw0 xw02 = this.f139266h;
            if (xw02 != null) {
                aVar.mo74322i(6, xw02.computeSize());
                this.f139266h.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f139262d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            String str4 = this.f139263e;
            if (str4 != null) {
                i2 += C52418a.m58683j(3, str4);
            }
            String str5 = this.f139264f;
            if (str5 != null) {
                i2 += C52418a.m58683j(4, str5);
            }
            String str6 = this.f139265g;
            if (str6 != null) {
                i2 += C52418a.m58683j(5, str6);
            }
            C64840xw0 xw03 = this.f139266h;
            return xw03 != null ? i2 + C52418a.m58682i(6, xw03.computeSize()) : i2;
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
            C50704on0 on02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C90417ia iaVar3 = new C90417ia();
                        if (bArr != null && bArr.length > 0) {
                            iaVar3.parseFrom(bArr);
                        }
                        on02.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C49842ig0 ig04 = new C49842ig0();
                        if (bArr2 != null && bArr2.length > 0) {
                            ig04.parseFrom(bArr2);
                        }
                        on02.f139262d = ig04;
                    }
                    return 0;
                case 3:
                    on02.f139263e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    on02.f139264f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    on02.f139265g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C64840xw0 xw04 = new C64840xw0();
                        if (bArr3 != null && bArr3.length > 0) {
                            xw04.parseFrom(bArr3);
                        }
                        on02.f139266h = xw04;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
