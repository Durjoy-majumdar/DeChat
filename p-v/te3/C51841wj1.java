package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.wj1 */
public class C51841wj1 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f144084d;

    /* renamed from: e */
    public int f144085e;

    /* renamed from: f */
    public C89349b f144086f;

    /* renamed from: g */
    public C89349b f144087g;

    /* renamed from: h */
    public C89349b f144088h;

    /* renamed from: i */
    public int f144089i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51841wj1)) {
            return false;
        }
        C51841wj1 wj12 = (C51841wj1) aVar;
        return C46238a.m51546a(this.BaseRequest, wj12.BaseRequest) && C46238a.m51546a(this.f144084d, wj12.f144084d) && C46238a.m51546a(Integer.valueOf(this.f144085e), Integer.valueOf(wj12.f144085e)) && C46238a.m51546a(this.f144086f, wj12.f144086f) && C46238a.m51546a(this.f144087g, wj12.f144087g) && C46238a.m51546a(this.f144088h, wj12.f144088h) && C46238a.m51546a(Integer.valueOf(this.f144089i), Integer.valueOf(wj12.f144089i));
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
            C49842ig0 ig02 = this.f144084d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f144084d.writeFields(aVar);
            }
            aVar.mo74318e(3, this.f144085e);
            C89349b bVar = this.f144086f;
            if (bVar != null) {
                aVar.mo74315b(4, bVar);
            }
            C89349b bVar2 = this.f144087g;
            if (bVar2 != null) {
                aVar.mo74315b(5, bVar2);
            }
            C89349b bVar3 = this.f144088h;
            if (bVar3 != null) {
                aVar.mo74315b(6, bVar3);
            }
            aVar.mo74318e(7, this.f144089i);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f144084d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            int e = i2 + C52418a.m58678e(3, this.f144085e);
            C89349b bVar4 = this.f144086f;
            if (bVar4 != null) {
                e += C52418a.m58675b(4, bVar4);
            }
            C89349b bVar5 = this.f144087g;
            if (bVar5 != null) {
                e += C52418a.m58675b(5, bVar5);
            }
            C89349b bVar6 = this.f144088h;
            if (bVar6 != null) {
                e += C52418a.m58675b(6, bVar6);
            }
            return e + C52418a.m58678e(7, this.f144089i);
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
            C51841wj1 wj12 = objArr[1];
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
                        wj12.BaseRequest = iaVar3;
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
                        wj12.f144084d = ig04;
                    }
                    return 0;
                case 3:
                    wj12.f144085e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    wj12.f144086f = aVar3.mo141626d(intValue);
                    return 0;
                case 5:
                    wj12.f144087g = aVar3.mo141626d(intValue);
                    return 0;
                case 6:
                    wj12.f144088h = aVar3.mo141626d(intValue);
                    return 0;
                case 7:
                    wj12.f144089i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
