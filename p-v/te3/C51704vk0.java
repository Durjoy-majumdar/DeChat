package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.vk0 */
public class C51704vk0 extends C101820nt3 {

    /* renamed from: d */
    public String f143536d;

    /* renamed from: e */
    public String f143537e;

    /* renamed from: f */
    public String f143538f;

    /* renamed from: g */
    public String f143539g;

    /* renamed from: h */
    public String f143540h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51704vk0)) {
            return false;
        }
        C51704vk0 vk02 = (C51704vk0) aVar;
        return C46238a.m51546a(this.f143536d, vk02.f143536d) && C46238a.m51546a(this.f143537e, vk02.f143537e) && C46238a.m51546a(this.f143538f, vk02.f143538f) && C46238a.m51546a(this.f143539g, vk02.f143539g) && C46238a.m51546a(this.f143540h, vk02.f143540h) && C46238a.m51546a(this.BaseRequest, vk02.BaseRequest);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f143536d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f143537e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f143538f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f143539g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f143540h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(6, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str6 = this.f143536d;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            String str7 = this.f143537e;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            String str8 = this.f143538f;
            if (str8 != null) {
                i2 += C52418a.m58683j(3, str8);
            }
            String str9 = this.f143539g;
            if (str9 != null) {
                i2 += C52418a.m58683j(4, str9);
            }
            String str10 = this.f143540h;
            if (str10 != null) {
                i2 += C52418a.m58683j(5, str10);
            }
            C90417ia iaVar2 = this.BaseRequest;
            return iaVar2 != null ? i2 + C52418a.m58682i(6, iaVar2.computeSize()) : i2;
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
            C51704vk0 vk02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    vk02.f143536d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    vk02.f143537e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    vk02.f143538f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    vk02.f143539g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    vk02.f143540h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C90417ia iaVar3 = new C90417ia();
                        if (bArr != null && bArr.length > 0) {
                            iaVar3.parseFrom(bArr);
                        }
                        vk02.BaseRequest = iaVar3;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
