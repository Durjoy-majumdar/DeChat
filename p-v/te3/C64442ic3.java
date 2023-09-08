package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ic3 */
public class C64442ic3 extends C101820nt3 {

    /* renamed from: d */
    public String f183669d;

    /* renamed from: e */
    public String f183670e;

    /* renamed from: f */
    public String f183671f;

    /* renamed from: g */
    public String f183672g;

    /* renamed from: h */
    public String f183673h;

    /* renamed from: i */
    public String f183674i;

    /* renamed from: j */
    public String f183675j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64442ic3)) {
            return false;
        }
        C64442ic3 ic32 = (C64442ic3) aVar;
        return C46238a.m51546a(this.BaseRequest, ic32.BaseRequest) && C46238a.m51546a(this.f183669d, ic32.f183669d) && C46238a.m51546a(this.f183670e, ic32.f183670e) && C46238a.m51546a(this.f183671f, ic32.f183671f) && C46238a.m51546a(this.f183672g, ic32.f183672g) && C46238a.m51546a(this.f183673h, ic32.f183673h) && C46238a.m51546a(this.f183674i, ic32.f183674i) && C46238a.m51546a(this.f183675j, ic32.f183675j);
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
            String str = this.f183669d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f183670e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f183671f;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f183672g;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f183673h;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            String str6 = this.f183674i;
            if (str6 != null) {
                aVar.mo74323j(7, str6);
            }
            String str7 = this.f183675j;
            if (str7 != null) {
                aVar.mo74323j(8, str7);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str8 = this.f183669d;
            if (str8 != null) {
                i2 += C52418a.m58683j(2, str8);
            }
            String str9 = this.f183670e;
            if (str9 != null) {
                i2 += C52418a.m58683j(3, str9);
            }
            String str10 = this.f183671f;
            if (str10 != null) {
                i2 += C52418a.m58683j(4, str10);
            }
            String str11 = this.f183672g;
            if (str11 != null) {
                i2 += C52418a.m58683j(5, str11);
            }
            String str12 = this.f183673h;
            if (str12 != null) {
                i2 += C52418a.m58683j(6, str12);
            }
            String str13 = this.f183674i;
            if (str13 != null) {
                i2 += C52418a.m58683j(7, str13);
            }
            String str14 = this.f183675j;
            return str14 != null ? i2 + C52418a.m58683j(8, str14) : i2;
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
            C64442ic3 ic32 = objArr[1];
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
                        ic32.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    ic32.f183669d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    ic32.f183670e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    ic32.f183671f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    ic32.f183672g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    ic32.f183673h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    ic32.f183674i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    ic32.f183675j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
