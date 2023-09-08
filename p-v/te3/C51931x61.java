package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.x61 */
public class C51931x61 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f144483d;

    /* renamed from: e */
    public C89349b f144484e;

    /* renamed from: f */
    public String f144485f;

    /* renamed from: g */
    public long f144486g;

    /* renamed from: h */
    public long f144487h;

    /* renamed from: i */
    public String f144488i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51931x61)) {
            return false;
        }
        C51931x61 x612 = (C51931x61) aVar;
        return C46238a.m51546a(this.BaseRequest, x612.BaseRequest) && C46238a.m51546a(this.f144483d, x612.f144483d) && C46238a.m51546a(this.f144484e, x612.f144484e) && C46238a.m51546a(this.f144485f, x612.f144485f) && C46238a.m51546a(Long.valueOf(this.f144486g), Long.valueOf(x612.f144486g)) && C46238a.m51546a(Long.valueOf(this.f144487h), Long.valueOf(x612.f144487h)) && C46238a.m51546a(this.f144488i, x612.f144488i);
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
            C49842ig0 ig02 = this.f144483d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f144483d.writeFields(aVar);
            }
            C89349b bVar = this.f144484e;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            String str = this.f144485f;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            aVar.mo74321h(5, this.f144486g);
            aVar.mo74321h(6, this.f144487h);
            String str2 = this.f144488i;
            if (str2 != null) {
                aVar.mo74323j(7, str2);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f144483d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            C89349b bVar2 = this.f144484e;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(3, bVar2);
            }
            String str3 = this.f144485f;
            if (str3 != null) {
                i2 += C52418a.m58683j(4, str3);
            }
            int h = i2 + C52418a.m58681h(5, this.f144486g) + C52418a.m58681h(6, this.f144487h);
            String str4 = this.f144488i;
            return str4 != null ? h + C52418a.m58683j(7, str4) : h;
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
            C51931x61 x612 = objArr[1];
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
                        x612.BaseRequest = iaVar3;
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
                        x612.f144483d = ig04;
                    }
                    return 0;
                case 3:
                    x612.f144484e = aVar3.mo141626d(intValue);
                    return 0;
                case 4:
                    x612.f144485f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    x612.f144486g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    x612.f144487h = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    x612.f144488i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
