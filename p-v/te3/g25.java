package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class g25 extends C101820nt3 {

    /* renamed from: d */
    public String f133812d;

    /* renamed from: e */
    public String f133813e;

    /* renamed from: f */
    public int f133814f;

    /* renamed from: g */
    public int f133815g;

    /* renamed from: h */
    public String f133816h;

    /* renamed from: i */
    public String f133817i;

    /* renamed from: j */
    public String f133818j;

    /* renamed from: n */
    public String f133819n;

    /* renamed from: o */
    public int f133820o;

    /* renamed from: p */
    public String f133821p;

    /* renamed from: q */
    public String f133822q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof g25)) {
            return false;
        }
        g25 g25 = (g25) aVar;
        return C46238a.m51546a(this.BaseRequest, g25.BaseRequest) && C46238a.m51546a(this.f133812d, g25.f133812d) && C46238a.m51546a(this.f133813e, g25.f133813e) && C46238a.m51546a(Integer.valueOf(this.f133814f), Integer.valueOf(g25.f133814f)) && C46238a.m51546a(Integer.valueOf(this.f133815g), Integer.valueOf(g25.f133815g)) && C46238a.m51546a(this.f133816h, g25.f133816h) && C46238a.m51546a(this.f133817i, g25.f133817i) && C46238a.m51546a(this.f133818j, g25.f133818j) && C46238a.m51546a(this.f133819n, g25.f133819n) && C46238a.m51546a(Integer.valueOf(this.f133820o), Integer.valueOf(g25.f133820o)) && C46238a.m51546a(this.f133821p, g25.f133821p) && C46238a.m51546a(this.f133822q, g25.f133822q);
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
            String str = this.f133812d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f133813e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74318e(4, this.f133814f);
            aVar.mo74318e(5, this.f133815g);
            String str3 = this.f133816h;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            String str4 = this.f133817i;
            if (str4 != null) {
                aVar.mo74323j(7, str4);
            }
            String str5 = this.f133818j;
            if (str5 != null) {
                aVar.mo74323j(8, str5);
            }
            String str6 = this.f133819n;
            if (str6 != null) {
                aVar.mo74323j(9, str6);
            }
            aVar.mo74318e(10, this.f133820o);
            String str7 = this.f133821p;
            if (str7 != null) {
                aVar.mo74323j(11, str7);
            }
            String str8 = this.f133822q;
            if (str8 != null) {
                aVar.mo74323j(12, str8);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str9 = this.f133812d;
            if (str9 != null) {
                i2 += C52418a.m58683j(2, str9);
            }
            String str10 = this.f133813e;
            if (str10 != null) {
                i2 += C52418a.m58683j(3, str10);
            }
            int e = i2 + C52418a.m58678e(4, this.f133814f) + C52418a.m58678e(5, this.f133815g);
            String str11 = this.f133816h;
            if (str11 != null) {
                e += C52418a.m58683j(6, str11);
            }
            String str12 = this.f133817i;
            if (str12 != null) {
                e += C52418a.m58683j(7, str12);
            }
            String str13 = this.f133818j;
            if (str13 != null) {
                e += C52418a.m58683j(8, str13);
            }
            String str14 = this.f133819n;
            if (str14 != null) {
                e += C52418a.m58683j(9, str14);
            }
            int e2 = e + C52418a.m58678e(10, this.f133820o);
            String str15 = this.f133821p;
            if (str15 != null) {
                e2 += C52418a.m58683j(11, str15);
            }
            String str16 = this.f133822q;
            return str16 != null ? e2 + C52418a.m58683j(12, str16) : e2;
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
            g25 g25 = objArr[1];
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
                        g25.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    g25.f133812d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    g25.f133813e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    g25.f133814f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    g25.f133815g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    g25.f133816h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    g25.f133817i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    g25.f133818j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    g25.f133819n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    g25.f133820o = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    g25.f133821p = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    g25.f133822q = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
