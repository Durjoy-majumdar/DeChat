package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ur0 */
public class C51585ur0 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f143033d;

    /* renamed from: e */
    public C89349b f143034e;

    /* renamed from: f */
    public C52013xs0 f143035f;

    /* renamed from: g */
    public long f143036g;

    /* renamed from: h */
    public long f143037h;

    /* renamed from: i */
    public String f143038i;

    /* renamed from: j */
    public int f143039j;

    /* renamed from: n */
    public String f143040n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51585ur0)) {
            return false;
        }
        C51585ur0 ur02 = (C51585ur0) aVar;
        return C46238a.m51546a(this.BaseRequest, ur02.BaseRequest) && C46238a.m51546a(this.f143033d, ur02.f143033d) && C46238a.m51546a(this.f143034e, ur02.f143034e) && C46238a.m51546a(this.f143035f, ur02.f143035f) && C46238a.m51546a(Long.valueOf(this.f143036g), Long.valueOf(ur02.f143036g)) && C46238a.m51546a(Long.valueOf(this.f143037h), Long.valueOf(ur02.f143037h)) && C46238a.m51546a(this.f143038i, ur02.f143038i) && C46238a.m51546a(Integer.valueOf(this.f143039j), Integer.valueOf(ur02.f143039j)) && C46238a.m51546a(this.f143040n, ur02.f143040n);
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
            C49842ig0 ig02 = this.f143033d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f143033d.writeFields(aVar);
            }
            C89349b bVar = this.f143034e;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            C52013xs0 xs02 = this.f143035f;
            if (xs02 != null) {
                aVar.mo74322i(4, xs02.computeSize());
                this.f143035f.writeFields(aVar);
            }
            aVar.mo74321h(5, this.f143036g);
            aVar.mo74321h(6, this.f143037h);
            String str = this.f143038i;
            if (str != null) {
                aVar.mo74323j(7, str);
            }
            aVar.mo74318e(8, this.f143039j);
            String str2 = this.f143040n;
            if (str2 != null) {
                aVar.mo74323j(9, str2);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f143033d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            C89349b bVar2 = this.f143034e;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(3, bVar2);
            }
            C52013xs0 xs03 = this.f143035f;
            if (xs03 != null) {
                i2 += C52418a.m58682i(4, xs03.computeSize());
            }
            int h = i2 + C52418a.m58681h(5, this.f143036g) + C52418a.m58681h(6, this.f143037h);
            String str3 = this.f143038i;
            if (str3 != null) {
                h += C52418a.m58683j(7, str3);
            }
            int e = h + C52418a.m58678e(8, this.f143039j);
            String str4 = this.f143040n;
            return str4 != null ? e + C52418a.m58683j(9, str4) : e;
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
            C51585ur0 ur02 = objArr[1];
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
                        ur02.BaseRequest = iaVar3;
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
                        ur02.f143033d = ig04;
                    }
                    return 0;
                case 3:
                    ur02.f143034e = aVar3.mo141626d(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C52013xs0 xs04 = new C52013xs0();
                        if (bArr3 != null && bArr3.length > 0) {
                            xs04.parseFrom(bArr3);
                        }
                        ur02.f143035f = xs04;
                    }
                    return 0;
                case 5:
                    ur02.f143036g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    ur02.f143037h = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    ur02.f143038i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    ur02.f143039j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    ur02.f143040n = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
