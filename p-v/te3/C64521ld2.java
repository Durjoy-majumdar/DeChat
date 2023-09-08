package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ld2 */
public class C64521ld2 extends C101820nt3 {

    /* renamed from: d */
    public int f184076d;

    /* renamed from: e */
    public int f184077e;

    /* renamed from: f */
    public int f184078f;

    /* renamed from: g */
    public int f184079g;

    /* renamed from: h */
    public int f184080h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64521ld2)) {
            return false;
        }
        C64521ld2 ld22 = (C64521ld2) aVar;
        return C46238a.m51546a(this.BaseRequest, ld22.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f184076d), Integer.valueOf(ld22.f184076d)) && C46238a.m51546a(Integer.valueOf(this.f184077e), Integer.valueOf(ld22.f184077e)) && C46238a.m51546a(Integer.valueOf(this.f184078f), Integer.valueOf(ld22.f184078f)) && C46238a.m51546a(Integer.valueOf(this.f184079g), Integer.valueOf(ld22.f184079g)) && C46238a.m51546a(Integer.valueOf(this.f184080h), Integer.valueOf(ld22.f184080h));
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
            aVar.mo74318e(2, this.f184076d);
            aVar.mo74318e(3, this.f184077e);
            aVar.mo74318e(4, this.f184078f);
            aVar.mo74318e(5, this.f184079g);
            aVar.mo74318e(6, this.f184080h);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f184076d) + C52418a.m58678e(3, this.f184077e) + C52418a.m58678e(4, this.f184078f) + C52418a.m58678e(5, this.f184079g) + C52418a.m58678e(6, this.f184080h);
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
            C64521ld2 ld22 = objArr[1];
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
                        ld22.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    ld22.f184076d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    ld22.f184077e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    ld22.f184078f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    ld22.f184079g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    ld22.f184080h = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
