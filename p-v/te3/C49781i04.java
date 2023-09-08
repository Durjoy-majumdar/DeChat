package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.i04 */
public class C49781i04 extends C101820nt3 {

    /* renamed from: d */
    public String f135009d;

    /* renamed from: e */
    public String f135010e;

    /* renamed from: f */
    public String f135011f;

    /* renamed from: g */
    public String f135012g;

    /* renamed from: h */
    public String f135013h;

    /* renamed from: i */
    public String f135014i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49781i04)) {
            return false;
        }
        C49781i04 i042 = (C49781i04) aVar;
        return C46238a.m51546a(this.BaseRequest, i042.BaseRequest) && C46238a.m51546a(this.f135009d, i042.f135009d) && C46238a.m51546a(this.f135010e, i042.f135010e) && C46238a.m51546a(this.f135011f, i042.f135011f) && C46238a.m51546a(this.f135012g, i042.f135012g) && C46238a.m51546a(this.f135013h, i042.f135013h) && C46238a.m51546a(this.f135014i, i042.f135014i);
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
            String str = this.f135009d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f135010e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f135011f;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            String str4 = this.f135012g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f135013h;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            String str6 = this.f135014i;
            if (str6 != null) {
                aVar.mo74323j(7, str6);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str7 = this.f135009d;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            String str8 = this.f135010e;
            if (str8 != null) {
                i2 += C52418a.m58683j(3, str8);
            }
            String str9 = this.f135011f;
            if (str9 != null) {
                i2 += C52418a.m58683j(5, str9);
            }
            String str10 = this.f135012g;
            if (str10 != null) {
                i2 += C52418a.m58683j(4, str10);
            }
            String str11 = this.f135013h;
            if (str11 != null) {
                i2 += C52418a.m58683j(6, str11);
            }
            String str12 = this.f135014i;
            return str12 != null ? i2 + C52418a.m58683j(7, str12) : i2;
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
            C49781i04 i042 = objArr[1];
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
                        i042.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    i042.f135009d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    i042.f135010e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    i042.f135012g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    i042.f135011f = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    i042.f135013h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    i042.f135014i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
