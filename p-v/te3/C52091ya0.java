package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ya0 */
public class C52091ya0 extends C101820nt3 {

    /* renamed from: d */
    public int f145203d;

    /* renamed from: e */
    public int f145204e;

    /* renamed from: f */
    public long f145205f;

    /* renamed from: g */
    public long f145206g;

    /* renamed from: h */
    public long f145207h;

    /* renamed from: i */
    public long f145208i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52091ya0)) {
            return false;
        }
        C52091ya0 ya02 = (C52091ya0) aVar;
        return C46238a.m51546a(this.BaseRequest, ya02.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f145203d), Integer.valueOf(ya02.f145203d)) && C46238a.m51546a(Integer.valueOf(this.f145204e), Integer.valueOf(ya02.f145204e)) && C46238a.m51546a(Long.valueOf(this.f145205f), Long.valueOf(ya02.f145205f)) && C46238a.m51546a(Long.valueOf(this.f145206g), Long.valueOf(ya02.f145206g)) && C46238a.m51546a(Long.valueOf(this.f145207h), Long.valueOf(ya02.f145207h)) && C46238a.m51546a(Long.valueOf(this.f145208i), Long.valueOf(ya02.f145208i));
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
            aVar.mo74318e(2, this.f145203d);
            aVar.mo74318e(3, this.f145204e);
            aVar.mo74321h(4, this.f145205f);
            aVar.mo74321h(5, this.f145206g);
            aVar.mo74321h(6, this.f145207h);
            aVar.mo74321h(7, this.f145208i);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f145203d) + C52418a.m58678e(3, this.f145204e) + C52418a.m58681h(4, this.f145205f) + C52418a.m58681h(5, this.f145206g) + C52418a.m58681h(6, this.f145207h) + C52418a.m58681h(7, this.f145208i);
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
            C52091ya0 ya02 = objArr[1];
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
                        ya02.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    ya02.f145203d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    ya02.f145204e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    ya02.f145205f = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    ya02.f145206g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    ya02.f145207h = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    ya02.f145208i = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
