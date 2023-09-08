package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class bf4 extends C101820nt3 {

    /* renamed from: d */
    public int f131086d;

    /* renamed from: e */
    public long f131087e;

    /* renamed from: f */
    public int f131088f;

    /* renamed from: g */
    public int f131089g;

    /* renamed from: h */
    public int f131090h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof bf4)) {
            return false;
        }
        bf4 bf4 = (bf4) aVar;
        return C46238a.m51546a(this.BaseRequest, bf4.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f131086d), Integer.valueOf(bf4.f131086d)) && C46238a.m51546a(Long.valueOf(this.f131087e), Long.valueOf(bf4.f131087e)) && C46238a.m51546a(Integer.valueOf(this.f131088f), Integer.valueOf(bf4.f131088f)) && C46238a.m51546a(Integer.valueOf(this.f131089g), Integer.valueOf(bf4.f131089g)) && C46238a.m51546a(Integer.valueOf(this.f131090h), Integer.valueOf(bf4.f131090h));
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
            aVar.mo74318e(2, this.f131086d);
            aVar.mo74321h(3, this.f131087e);
            aVar.mo74318e(4, this.f131088f);
            aVar.mo74318e(5, this.f131089g);
            aVar.mo74318e(6, this.f131090h);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f131086d) + C52418a.m58681h(3, this.f131087e) + C52418a.m58678e(4, this.f131088f) + C52418a.m58678e(5, this.f131089g) + C52418a.m58678e(6, this.f131090h);
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
            bf4 bf4 = objArr[1];
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
                        bf4.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    bf4.f131086d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    bf4.f131087e = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    bf4.f131088f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    bf4.f131089g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    bf4.f131090h = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
