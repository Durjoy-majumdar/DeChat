package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class hq4 extends C101820nt3 {

    /* renamed from: d */
    public String f183535d;

    /* renamed from: e */
    public LinkedList<Integer> f183536e = new LinkedList<>();

    /* renamed from: f */
    public String f183537f;

    /* renamed from: g */
    public String f183538g;

    /* renamed from: h */
    public String f183539h;

    /* renamed from: i */
    public String f183540i;

    /* renamed from: j */
    public String f183541j;

    /* renamed from: n */
    public String f183542n;

    /* renamed from: o */
    public String f183543o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof hq4)) {
            return false;
        }
        hq4 hq4 = (hq4) aVar;
        return C46238a.m51546a(this.BaseRequest, hq4.BaseRequest) && C46238a.m51546a(this.f183535d, hq4.f183535d) && C46238a.m51546a(this.f183536e, hq4.f183536e) && C46238a.m51546a(this.f183537f, hq4.f183537f) && C46238a.m51546a(this.f183538g, hq4.f183538g) && C46238a.m51546a(this.f183539h, hq4.f183539h) && C46238a.m51546a(this.f183540i, hq4.f183540i) && C46238a.m51546a(this.f183541j, hq4.f183541j) && C46238a.m51546a(this.f183542n, hq4.f183542n) && C46238a.m51546a(this.f183543o, hq4.f183543o);
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
            String str = this.f183535d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74320g(3, 2, this.f183536e);
            String str2 = this.f183537f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f183538g;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            String str4 = this.f183539h;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            String str5 = this.f183540i;
            if (str5 != null) {
                aVar.mo74323j(7, str5);
            }
            String str6 = this.f183541j;
            if (str6 != null) {
                aVar.mo74323j(8, str6);
            }
            String str7 = this.f183542n;
            if (str7 != null) {
                aVar.mo74323j(9, str7);
            }
            String str8 = this.f183543o;
            if (str8 != null) {
                aVar.mo74323j(10, str8);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str9 = this.f183535d;
            if (str9 != null) {
                i2 += C52418a.m58683j(2, str9);
            }
            int g = i2 + C52418a.m58680g(3, 2, this.f183536e);
            String str10 = this.f183537f;
            if (str10 != null) {
                g += C52418a.m58683j(4, str10);
            }
            String str11 = this.f183538g;
            if (str11 != null) {
                g += C52418a.m58683j(5, str11);
            }
            String str12 = this.f183539h;
            if (str12 != null) {
                g += C52418a.m58683j(6, str12);
            }
            String str13 = this.f183540i;
            if (str13 != null) {
                g += C52418a.m58683j(7, str13);
            }
            String str14 = this.f183541j;
            if (str14 != null) {
                g += C52418a.m58683j(8, str14);
            }
            String str15 = this.f183542n;
            if (str15 != null) {
                g += C52418a.m58683j(9, str15);
            }
            String str16 = this.f183543o;
            return str16 != null ? g + C52418a.m58683j(10, str16) : g;
        } else if (i == 2) {
            this.f183536e.clear();
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
            hq4 hq4 = objArr[1];
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
                        hq4.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    hq4.f183535d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    hq4.f183536e.add(Integer.valueOf(aVar3.mo141629g(intValue)));
                    return 0;
                case 4:
                    hq4.f183537f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    hq4.f183538g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    hq4.f183539h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    hq4.f183540i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    hq4.f183541j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    hq4.f183542n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    hq4.f183543o = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
