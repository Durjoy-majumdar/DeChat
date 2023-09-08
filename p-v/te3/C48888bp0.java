package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.bp0 */
public class C48888bp0 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f131240d;

    /* renamed from: e */
    public C89349b f131241e;

    /* renamed from: f */
    public float f131242f;

    /* renamed from: g */
    public float f131243g;

    /* renamed from: h */
    public C49704hh0 f131244h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48888bp0)) {
            return false;
        }
        C48888bp0 bp02 = (C48888bp0) aVar;
        return C46238a.m51546a(this.BaseRequest, bp02.BaseRequest) && C46238a.m51546a(this.f131240d, bp02.f131240d) && C46238a.m51546a(this.f131241e, bp02.f131241e) && C46238a.m51546a(Float.valueOf(this.f131242f), Float.valueOf(bp02.f131242f)) && C46238a.m51546a(Float.valueOf(this.f131243g), Float.valueOf(bp02.f131243g)) && C46238a.m51546a(this.f131244h, bp02.f131244h);
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
            C49842ig0 ig02 = this.f131240d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f131240d.writeFields(aVar);
            }
            C89349b bVar = this.f131241e;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            aVar.mo74317d(4, this.f131242f);
            aVar.mo74317d(5, this.f131243g);
            C49704hh0 hh02 = this.f131244h;
            if (hh02 != null) {
                aVar.mo74322i(6, hh02.computeSize());
                this.f131244h.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f131240d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            C89349b bVar2 = this.f131241e;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(3, bVar2);
            }
            int d = i2 + C52418a.m58677d(4, this.f131242f) + C52418a.m58677d(5, this.f131243g);
            C49704hh0 hh03 = this.f131244h;
            return hh03 != null ? d + C52418a.m58682i(6, hh03.computeSize()) : d;
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
            C48888bp0 bp02 = objArr[1];
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
                        bp02.BaseRequest = iaVar3;
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
                        bp02.f131240d = ig04;
                    }
                    return 0;
                case 3:
                    bp02.f131241e = aVar3.mo141626d(intValue);
                    return 0;
                case 4:
                    bp02.f131242f = aVar3.mo141628f(intValue);
                    return 0;
                case 5:
                    bp02.f131243g = aVar3.mo141628f(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C49704hh0 hh04 = new C49704hh0();
                        if (bArr3 != null && bArr3.length > 0) {
                            hh04.parseFrom(bArr3);
                        }
                        bp02.f131244h = hh04;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
