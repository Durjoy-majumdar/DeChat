package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.vz0 */
public class C64790vz0 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f186018d;

    /* renamed from: e */
    public String f186019e;

    /* renamed from: f */
    public String f186020f;

    /* renamed from: g */
    public C89349b f186021g;

    /* renamed from: h */
    public long f186022h;

    /* renamed from: i */
    public long f186023i;

    /* renamed from: j */
    public LinkedList<C64308d82> f186024j = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64790vz0)) {
            return false;
        }
        C64790vz0 vz02 = (C64790vz0) aVar;
        return C46238a.m51546a(this.BaseRequest, vz02.BaseRequest) && C46238a.m51546a(this.f186018d, vz02.f186018d) && C46238a.m51546a(this.f186019e, vz02.f186019e) && C46238a.m51546a(this.f186020f, vz02.f186020f) && C46238a.m51546a(this.f186021g, vz02.f186021g) && C46238a.m51546a(Long.valueOf(this.f186022h), Long.valueOf(vz02.f186022h)) && C46238a.m51546a(Long.valueOf(this.f186023i), Long.valueOf(vz02.f186023i)) && C46238a.m51546a(this.f186024j, vz02.f186024j);
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
            C49842ig0 ig02 = this.f186018d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f186018d.writeFields(aVar);
            }
            String str = this.f186019e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f186020f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            C89349b bVar = this.f186021g;
            if (bVar != null) {
                aVar.mo74315b(5, bVar);
            }
            aVar.mo74321h(6, this.f186022h);
            aVar.mo74321h(7, this.f186023i);
            aVar.mo74320g(8, 8, this.f186024j);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f186018d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            String str3 = this.f186019e;
            if (str3 != null) {
                i2 += C52418a.m58683j(3, str3);
            }
            String str4 = this.f186020f;
            if (str4 != null) {
                i2 += C52418a.m58683j(4, str4);
            }
            C89349b bVar2 = this.f186021g;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(5, bVar2);
            }
            return i2 + C52418a.m58681h(6, this.f186022h) + C52418a.m58681h(7, this.f186023i) + C52418a.m58680g(8, 8, this.f186024j);
        } else if (i == 2) {
            this.f186024j.clear();
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
            C64790vz0 vz02 = objArr[1];
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
                        vz02.BaseRequest = iaVar3;
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
                        vz02.f186018d = ig04;
                    }
                    return 0;
                case 3:
                    vz02.f186019e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    vz02.f186020f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    vz02.f186021g = aVar3.mo141626d(intValue);
                    return 0;
                case 6:
                    vz02.f186022h = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    vz02.f186023i = aVar3.mo141631i(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C64308d82 d822 = new C64308d82();
                        if (bArr3 != null && bArr3.length > 0) {
                            d822.parseFrom(bArr3);
                        }
                        vz02.f186024j.add(d822);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
