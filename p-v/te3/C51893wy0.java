package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.wy0 */
public class C51893wy0 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f144351d;

    /* renamed from: e */
    public int f144352e;

    /* renamed from: f */
    public int f144353f;

    /* renamed from: g */
    public long f144354g;

    /* renamed from: h */
    public long f144355h;

    /* renamed from: i */
    public String f144356i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51893wy0)) {
            return false;
        }
        C51893wy0 wy02 = (C51893wy0) aVar;
        return C46238a.m51546a(this.BaseRequest, wy02.BaseRequest) && C46238a.m51546a(this.f144351d, wy02.f144351d) && C46238a.m51546a(Integer.valueOf(this.f144352e), Integer.valueOf(wy02.f144352e)) && C46238a.m51546a(Integer.valueOf(this.f144353f), Integer.valueOf(wy02.f144353f)) && C46238a.m51546a(Long.valueOf(this.f144354g), Long.valueOf(wy02.f144354g)) && C46238a.m51546a(Long.valueOf(this.f144355h), Long.valueOf(wy02.f144355h)) && C46238a.m51546a(this.f144356i, wy02.f144356i);
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
            C49842ig0 ig02 = this.f144351d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f144351d.writeFields(aVar);
            }
            aVar.mo74318e(3, this.f144352e);
            aVar.mo74318e(4, this.f144353f);
            aVar.mo74321h(5, this.f144354g);
            aVar.mo74321h(6, this.f144355h);
            String str = this.f144356i;
            if (str != null) {
                aVar.mo74323j(7, str);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f144351d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            int e = i2 + C52418a.m58678e(3, this.f144352e) + C52418a.m58678e(4, this.f144353f) + C52418a.m58681h(5, this.f144354g) + C52418a.m58681h(6, this.f144355h);
            String str2 = this.f144356i;
            return str2 != null ? e + C52418a.m58683j(7, str2) : e;
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
            C51893wy0 wy02 = objArr[1];
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
                        wy02.BaseRequest = iaVar3;
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
                        wy02.f144351d = ig04;
                    }
                    return 0;
                case 3:
                    wy02.f144352e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    wy02.f144353f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    wy02.f144354g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    wy02.f144355h = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    wy02.f144356i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
