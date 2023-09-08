package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.zd1 */
public class C52248zd1 extends C101820nt3 {

    /* renamed from: d */
    public String f145834d;

    /* renamed from: e */
    public C49842ig0 f145835e;

    /* renamed from: f */
    public String f145836f;

    /* renamed from: g */
    public C89349b f145837g;

    /* renamed from: h */
    public int f145838h;

    /* renamed from: i */
    public C49704hh0 f145839i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52248zd1)) {
            return false;
        }
        C52248zd1 zd12 = (C52248zd1) aVar;
        return C46238a.m51546a(this.BaseRequest, zd12.BaseRequest) && C46238a.m51546a(this.f145834d, zd12.f145834d) && C46238a.m51546a(this.f145835e, zd12.f145835e) && C46238a.m51546a(this.f145836f, zd12.f145836f) && C46238a.m51546a(this.f145837g, zd12.f145837g) && C46238a.m51546a(Integer.valueOf(this.f145838h), Integer.valueOf(zd12.f145838h)) && C46238a.m51546a(this.f145839i, zd12.f145839i);
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
            String str = this.f145834d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            C49842ig0 ig02 = this.f145835e;
            if (ig02 != null) {
                aVar.mo74322i(3, ig02.computeSize());
                this.f145835e.writeFields(aVar);
            }
            String str2 = this.f145836f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            C89349b bVar = this.f145837g;
            if (bVar != null) {
                aVar.mo74315b(5, bVar);
            }
            aVar.mo74318e(6, this.f145838h);
            C49704hh0 hh02 = this.f145839i;
            if (hh02 != null) {
                aVar.mo74322i(7, hh02.computeSize());
                this.f145839i.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str3 = this.f145834d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            C49842ig0 ig03 = this.f145835e;
            if (ig03 != null) {
                i2 += C52418a.m58682i(3, ig03.computeSize());
            }
            String str4 = this.f145836f;
            if (str4 != null) {
                i2 += C52418a.m58683j(4, str4);
            }
            C89349b bVar2 = this.f145837g;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(5, bVar2);
            }
            int e = i2 + C52418a.m58678e(6, this.f145838h);
            C49704hh0 hh03 = this.f145839i;
            return hh03 != null ? e + C52418a.m58682i(7, hh03.computeSize()) : e;
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
            C52248zd1 zd12 = objArr[1];
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
                        zd12.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    zd12.f145834d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C49842ig0 ig04 = new C49842ig0();
                        if (bArr2 != null && bArr2.length > 0) {
                            ig04.parseFrom(bArr2);
                        }
                        zd12.f145835e = ig04;
                    }
                    return 0;
                case 4:
                    zd12.f145836f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    zd12.f145837g = aVar3.mo141626d(intValue);
                    return 0;
                case 6:
                    zd12.f145838h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C49704hh0 hh04 = new C49704hh0();
                        if (bArr3 != null && bArr3.length > 0) {
                            hh04.parseFrom(bArr3);
                        }
                        zd12.f145839i = hh04;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
