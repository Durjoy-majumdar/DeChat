package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.v31 */
public class C51639v31 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f143280d;

    /* renamed from: e */
    public long f143281e;

    /* renamed from: f */
    public long f143282f;

    /* renamed from: g */
    public int f143283g;

    /* renamed from: h */
    public LinkedList<C50401mh0> f143284h = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51639v31)) {
            return false;
        }
        C51639v31 v312 = (C51639v31) aVar;
        return C46238a.m51546a(this.BaseRequest, v312.BaseRequest) && C46238a.m51546a(this.f143280d, v312.f143280d) && C46238a.m51546a(Long.valueOf(this.f143281e), Long.valueOf(v312.f143281e)) && C46238a.m51546a(Long.valueOf(this.f143282f), Long.valueOf(v312.f143282f)) && C46238a.m51546a(Integer.valueOf(this.f143283g), Integer.valueOf(v312.f143283g)) && C46238a.m51546a(this.f143284h, v312.f143284h);
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
            C49842ig0 ig02 = this.f143280d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f143280d.writeFields(aVar);
            }
            aVar.mo74321h(3, this.f143281e);
            aVar.mo74321h(4, this.f143282f);
            aVar.mo74318e(5, this.f143283g);
            aVar.mo74320g(6, 8, this.f143284h);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f143280d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            return i2 + C52418a.m58681h(3, this.f143281e) + C52418a.m58681h(4, this.f143282f) + C52418a.m58678e(5, this.f143283g) + C52418a.m58680g(6, 8, this.f143284h);
        } else if (i == 2) {
            this.f143284h.clear();
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
            C51639v31 v312 = objArr[1];
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
                        v312.BaseRequest = iaVar3;
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
                        v312.f143280d = ig04;
                    }
                    return 0;
                case 3:
                    v312.f143281e = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    v312.f143282f = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    v312.f143283g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C50401mh0 mh02 = new C50401mh0();
                        if (bArr3 != null && bArr3.length > 0) {
                            mh02.parseFrom(bArr3);
                        }
                        v312.f143284h.add(mh02);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
