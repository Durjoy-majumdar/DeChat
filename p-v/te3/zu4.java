package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class zu4 extends C101820nt3 {

    /* renamed from: d */
    public int f146232d;

    /* renamed from: e */
    public long f146233e;

    /* renamed from: f */
    public int f146234f;

    /* renamed from: g */
    public long f146235g;

    /* renamed from: h */
    public int f146236h;

    /* renamed from: i */
    public int f146237i;

    /* renamed from: j */
    public int f146238j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof zu4)) {
            return false;
        }
        zu4 zu4 = (zu4) aVar;
        return C46238a.m51546a(this.BaseRequest, zu4.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f146232d), Integer.valueOf(zu4.f146232d)) && C46238a.m51546a(Long.valueOf(this.f146233e), Long.valueOf(zu4.f146233e)) && C46238a.m51546a(Integer.valueOf(this.f146234f), Integer.valueOf(zu4.f146234f)) && C46238a.m51546a(Long.valueOf(this.f146235g), Long.valueOf(zu4.f146235g)) && C46238a.m51546a(Integer.valueOf(this.f146236h), Integer.valueOf(zu4.f146236h)) && C46238a.m51546a(Integer.valueOf(this.f146237i), Integer.valueOf(zu4.f146237i)) && C46238a.m51546a(Integer.valueOf(this.f146238j), Integer.valueOf(zu4.f146238j));
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
            aVar.mo74318e(2, this.f146232d);
            aVar.mo74321h(3, this.f146233e);
            aVar.mo74318e(4, this.f146234f);
            aVar.mo74321h(5, this.f146235g);
            aVar.mo74318e(6, this.f146236h);
            aVar.mo74318e(7, this.f146237i);
            aVar.mo74318e(8, this.f146238j);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f146232d) + C52418a.m58681h(3, this.f146233e) + C52418a.m58678e(4, this.f146234f) + C52418a.m58681h(5, this.f146235g) + C52418a.m58678e(6, this.f146236h) + C52418a.m58678e(7, this.f146237i) + C52418a.m58678e(8, this.f146238j);
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
            zu4 zu4 = objArr[1];
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
                        zu4.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    zu4.f146232d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    zu4.f146233e = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    zu4.f146234f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    zu4.f146235g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    zu4.f146236h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    zu4.f146237i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    zu4.f146238j = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
