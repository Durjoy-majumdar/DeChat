package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ja1 */
public class C49968ja1 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f135965d;

    /* renamed from: e */
    public String f135966e;

    /* renamed from: f */
    public String f135967f;

    /* renamed from: g */
    public C89349b f135968g;

    /* renamed from: h */
    public C49704hh0 f135969h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49968ja1)) {
            return false;
        }
        C49968ja1 ja12 = (C49968ja1) aVar;
        return C46238a.m51546a(this.BaseRequest, ja12.BaseRequest) && C46238a.m51546a(this.f135965d, ja12.f135965d) && C46238a.m51546a(this.f135966e, ja12.f135966e) && C46238a.m51546a(this.f135967f, ja12.f135967f) && C46238a.m51546a(this.f135968g, ja12.f135968g) && C46238a.m51546a(this.f135969h, ja12.f135969h);
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
            C49842ig0 ig02 = this.f135965d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f135965d.writeFields(aVar);
            }
            String str = this.f135966e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f135967f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            C89349b bVar = this.f135968g;
            if (bVar != null) {
                aVar.mo74315b(5, bVar);
            }
            C49704hh0 hh02 = this.f135969h;
            if (hh02 != null) {
                aVar.mo74322i(6, hh02.computeSize());
                this.f135969h.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f135965d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            String str3 = this.f135966e;
            if (str3 != null) {
                i2 += C52418a.m58683j(3, str3);
            }
            String str4 = this.f135967f;
            if (str4 != null) {
                i2 += C52418a.m58683j(4, str4);
            }
            C89349b bVar2 = this.f135968g;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(5, bVar2);
            }
            C49704hh0 hh03 = this.f135969h;
            return hh03 != null ? i2 + C52418a.m58682i(6, hh03.computeSize()) : i2;
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
            C49968ja1 ja12 = objArr[1];
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
                        ja12.BaseRequest = iaVar3;
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
                        ja12.f135965d = ig04;
                    }
                    return 0;
                case 3:
                    ja12.f135966e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    ja12.f135967f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    ja12.f135968g = aVar3.mo141626d(intValue);
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
                        ja12.f135969h = hh04;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
