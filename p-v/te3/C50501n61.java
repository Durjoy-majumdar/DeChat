package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.n61 */
public class C50501n61 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f138433d;

    /* renamed from: e */
    public C89349b f138434e;

    /* renamed from: f */
    public long f138435f;

    /* renamed from: g */
    public long f138436g;

    /* renamed from: h */
    public String f138437h;

    /* renamed from: i */
    public String f138438i;

    /* renamed from: j */
    public int f138439j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50501n61)) {
            return false;
        }
        C50501n61 n612 = (C50501n61) aVar;
        return C46238a.m51546a(this.BaseRequest, n612.BaseRequest) && C46238a.m51546a(this.f138433d, n612.f138433d) && C46238a.m51546a(this.f138434e, n612.f138434e) && C46238a.m51546a(Long.valueOf(this.f138435f), Long.valueOf(n612.f138435f)) && C46238a.m51546a(Long.valueOf(this.f138436g), Long.valueOf(n612.f138436g)) && C46238a.m51546a(this.f138437h, n612.f138437h) && C46238a.m51546a(this.f138438i, n612.f138438i) && C46238a.m51546a(Integer.valueOf(this.f138439j), Integer.valueOf(n612.f138439j));
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
            C49842ig0 ig02 = this.f138433d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f138433d.writeFields(aVar);
            }
            C89349b bVar = this.f138434e;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            aVar.mo74321h(4, this.f138435f);
            aVar.mo74321h(5, this.f138436g);
            String str = this.f138437h;
            if (str != null) {
                aVar.mo74323j(6, str);
            }
            String str2 = this.f138438i;
            if (str2 != null) {
                aVar.mo74323j(7, str2);
            }
            aVar.mo74318e(8, this.f138439j);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f138433d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            C89349b bVar2 = this.f138434e;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(3, bVar2);
            }
            int h = i2 + C52418a.m58681h(4, this.f138435f) + C52418a.m58681h(5, this.f138436g);
            String str3 = this.f138437h;
            if (str3 != null) {
                h += C52418a.m58683j(6, str3);
            }
            String str4 = this.f138438i;
            if (str4 != null) {
                h += C52418a.m58683j(7, str4);
            }
            return h + C52418a.m58678e(8, this.f138439j);
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
            C50501n61 n612 = objArr[1];
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
                        n612.BaseRequest = iaVar3;
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
                        n612.f138433d = ig04;
                    }
                    return 0;
                case 3:
                    n612.f138434e = aVar3.mo141626d(intValue);
                    return 0;
                case 4:
                    n612.f138435f = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    n612.f138436g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    n612.f138437h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    n612.f138438i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    n612.f138439j = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
