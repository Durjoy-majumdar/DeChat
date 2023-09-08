package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.zr0 */
public class C52298zr0 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f146187d;

    /* renamed from: e */
    public long f146188e;

    /* renamed from: f */
    public long f146189f;

    /* renamed from: g */
    public int f146190g;

    /* renamed from: h */
    public String f146191h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52298zr0)) {
            return false;
        }
        C52298zr0 zr02 = (C52298zr0) aVar;
        return C46238a.m51546a(this.BaseRequest, zr02.BaseRequest) && C46238a.m51546a(this.f146187d, zr02.f146187d) && C46238a.m51546a(Long.valueOf(this.f146188e), Long.valueOf(zr02.f146188e)) && C46238a.m51546a(Long.valueOf(this.f146189f), Long.valueOf(zr02.f146189f)) && C46238a.m51546a(Integer.valueOf(this.f146190g), Integer.valueOf(zr02.f146190g)) && C46238a.m51546a(this.f146191h, zr02.f146191h);
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
            C49842ig0 ig02 = this.f146187d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f146187d.writeFields(aVar);
            }
            aVar.mo74321h(3, this.f146188e);
            aVar.mo74321h(4, this.f146189f);
            aVar.mo74318e(5, this.f146190g);
            String str = this.f146191h;
            if (str != null) {
                aVar.mo74323j(6, str);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f146187d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            int h = i2 + C52418a.m58681h(3, this.f146188e) + C52418a.m58681h(4, this.f146189f) + C52418a.m58678e(5, this.f146190g);
            String str2 = this.f146191h;
            return str2 != null ? h + C52418a.m58683j(6, str2) : h;
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
            C52298zr0 zr02 = objArr[1];
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
                        zr02.BaseRequest = iaVar3;
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
                        zr02.f146187d = ig04;
                    }
                    return 0;
                case 3:
                    zr02.f146188e = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    zr02.f146189f = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    zr02.f146190g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    zr02.f146191h = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
