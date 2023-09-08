package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.dj3 */
public class C64316dj3 extends C101820nt3 {

    /* renamed from: d */
    public String f182755d;

    /* renamed from: e */
    public int f182756e;

    /* renamed from: f */
    public long f182757f;

    /* renamed from: g */
    public long f182758g;

    /* renamed from: h */
    public int f182759h;

    /* renamed from: i */
    public long f182760i;

    /* renamed from: j */
    public int f182761j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64316dj3)) {
            return false;
        }
        C64316dj3 dj32 = (C64316dj3) aVar;
        return C46238a.m51546a(this.BaseRequest, dj32.BaseRequest) && C46238a.m51546a(this.f182755d, dj32.f182755d) && C46238a.m51546a(Integer.valueOf(this.f182756e), Integer.valueOf(dj32.f182756e)) && C46238a.m51546a(Long.valueOf(this.f182757f), Long.valueOf(dj32.f182757f)) && C46238a.m51546a(Long.valueOf(this.f182758g), Long.valueOf(dj32.f182758g)) && C46238a.m51546a(Integer.valueOf(this.f182759h), Integer.valueOf(dj32.f182759h)) && C46238a.m51546a(Long.valueOf(this.f182760i), Long.valueOf(dj32.f182760i)) && C46238a.m51546a(Integer.valueOf(this.f182761j), Integer.valueOf(dj32.f182761j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f182755d != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                String str = this.f182755d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                aVar.mo74318e(3, this.f182756e);
                aVar.mo74321h(4, this.f182757f);
                aVar.mo74321h(5, this.f182758g);
                aVar.mo74318e(6, this.f182759h);
                aVar.mo74321h(7, this.f182760i);
                aVar.mo74318e(8, this.f182761j);
                return 0;
            }
            throw new C52419b("Not all required fields were included: FromUsername");
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str2 = this.f182755d;
            if (str2 != null) {
                i2 += C52418a.m58683j(2, str2);
            }
            return i2 + C52418a.m58678e(3, this.f182756e) + C52418a.m58681h(4, this.f182757f) + C52418a.m58681h(5, this.f182758g) + C52418a.m58678e(6, this.f182759h) + C52418a.m58681h(7, this.f182760i) + C52418a.m58678e(8, this.f182761j);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f182755d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: FromUsername");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C64316dj3 dj32 = objArr[1];
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
                        dj32.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    dj32.f182755d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    dj32.f182756e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    dj32.f182757f = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    dj32.f182758g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    dj32.f182759h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    dj32.f182760i = aVar3.mo141631i(intValue);
                    return 0;
                case 8:
                    dj32.f182761j = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
