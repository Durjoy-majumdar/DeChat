package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class pj4 extends C101820nt3 {

    /* renamed from: d */
    public String f184819d;

    /* renamed from: e */
    public String f184820e;

    /* renamed from: f */
    public String f184821f;

    /* renamed from: g */
    public String f184822g;

    /* renamed from: h */
    public int f184823h;

    /* renamed from: i */
    public String f184824i;

    /* renamed from: j */
    public String f184825j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof pj4)) {
            return false;
        }
        pj4 pj4 = (pj4) aVar;
        return C46238a.m51546a(this.BaseRequest, pj4.BaseRequest) && C46238a.m51546a(this.f184819d, pj4.f184819d) && C46238a.m51546a(this.f184820e, pj4.f184820e) && C46238a.m51546a(this.f184821f, pj4.f184821f) && C46238a.m51546a(this.f184822g, pj4.f184822g) && C46238a.m51546a(Integer.valueOf(this.f184823h), Integer.valueOf(pj4.f184823h)) && C46238a.m51546a(this.f184824i, pj4.f184824i) && C46238a.m51546a(this.f184825j, pj4.f184825j);
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
            String str = this.f184819d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f184820e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f184821f;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f184822g;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            aVar.mo74318e(6, this.f184823h);
            String str5 = this.f184824i;
            if (str5 != null) {
                aVar.mo74323j(7, str5);
            }
            String str6 = this.f184825j;
            if (str6 != null) {
                aVar.mo74323j(8, str6);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str7 = this.f184819d;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            String str8 = this.f184820e;
            if (str8 != null) {
                i2 += C52418a.m58683j(3, str8);
            }
            String str9 = this.f184821f;
            if (str9 != null) {
                i2 += C52418a.m58683j(4, str9);
            }
            String str10 = this.f184822g;
            if (str10 != null) {
                i2 += C52418a.m58683j(5, str10);
            }
            int e = i2 + C52418a.m58678e(6, this.f184823h);
            String str11 = this.f184824i;
            if (str11 != null) {
                e += C52418a.m58683j(7, str11);
            }
            String str12 = this.f184825j;
            return str12 != null ? e + C52418a.m58683j(8, str12) : e;
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
            pj4 pj4 = objArr[1];
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
                        pj4.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    pj4.f184819d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    pj4.f184820e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    pj4.f184821f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    pj4.f184822g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    pj4.f184823h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    pj4.f184824i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    pj4.f184825j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
