package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.us0 */
public class C51590us0 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f143061d;

    /* renamed from: e */
    public String f143062e;

    /* renamed from: f */
    public long f143063f;

    /* renamed from: g */
    public long f143064g;

    /* renamed from: h */
    public long f143065h;

    /* renamed from: i */
    public int f143066i;

    /* renamed from: j */
    public int f143067j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51590us0)) {
            return false;
        }
        C51590us0 us02 = (C51590us0) aVar;
        return C46238a.m51546a(this.BaseRequest, us02.BaseRequest) && C46238a.m51546a(this.f143061d, us02.f143061d) && C46238a.m51546a(this.f143062e, us02.f143062e) && C46238a.m51546a(Long.valueOf(this.f143063f), Long.valueOf(us02.f143063f)) && C46238a.m51546a(Long.valueOf(this.f143064g), Long.valueOf(us02.f143064g)) && C46238a.m51546a(Long.valueOf(this.f143065h), Long.valueOf(us02.f143065h)) && C46238a.m51546a(Integer.valueOf(this.f143066i), Integer.valueOf(us02.f143066i)) && C46238a.m51546a(Integer.valueOf(this.f143067j), Integer.valueOf(us02.f143067j));
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
            C49842ig0 ig02 = this.f143061d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f143061d.writeFields(aVar);
            }
            String str = this.f143062e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74321h(4, this.f143063f);
            aVar.mo74321h(5, this.f143064g);
            aVar.mo74321h(6, this.f143065h);
            aVar.mo74318e(7, this.f143066i);
            aVar.mo74318e(8, this.f143067j);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f143061d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            String str2 = this.f143062e;
            if (str2 != null) {
                i2 += C52418a.m58683j(3, str2);
            }
            return i2 + C52418a.m58681h(4, this.f143063f) + C52418a.m58681h(5, this.f143064g) + C52418a.m58681h(6, this.f143065h) + C52418a.m58678e(7, this.f143066i) + C52418a.m58678e(8, this.f143067j);
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
            C51590us0 us02 = objArr[1];
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
                        us02.BaseRequest = iaVar3;
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
                        us02.f143061d = ig04;
                    }
                    return 0;
                case 3:
                    us02.f143062e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    us02.f143063f = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    us02.f143064g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    us02.f143065h = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    us02.f143066i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    us02.f143067j = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
