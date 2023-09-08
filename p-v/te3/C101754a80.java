package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.a80 */
public class C101754a80 extends C47465a {

    /* renamed from: d */
    public C52226z70 f297838d;

    /* renamed from: e */
    public String f297839e;

    /* renamed from: f */
    public String f297840f;

    /* renamed from: g */
    public int f297841g;

    /* renamed from: h */
    public String f297842h;

    /* renamed from: i */
    public int f297843i;

    /* renamed from: j */
    public String f297844j;

    /* renamed from: n */
    public String f297845n;

    /* renamed from: o */
    public String f297846o;

    /* renamed from: p */
    public String f297847p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101754a80)) {
            return false;
        }
        C101754a80 a802 = (C101754a80) aVar;
        return C46238a.m51546a(this.f297838d, a802.f297838d) && C46238a.m51546a(this.f297839e, a802.f297839e) && C46238a.m51546a(this.f297840f, a802.f297840f) && C46238a.m51546a(Integer.valueOf(this.f297841g), Integer.valueOf(a802.f297841g)) && C46238a.m51546a(this.f297842h, a802.f297842h) && C46238a.m51546a(Integer.valueOf(this.f297843i), Integer.valueOf(a802.f297843i)) && C46238a.m51546a(this.f297844j, a802.f297844j) && C46238a.m51546a(this.f297845n, a802.f297845n) && C46238a.m51546a(this.f297846o, a802.f297846o) && C46238a.m51546a(this.f297847p, a802.f297847p);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C52226z70 z702 = this.f297838d;
            if (z702 != null) {
                if (z702 != null) {
                    aVar.mo74322i(1, z702.computeSize());
                    this.f297838d.writeFields(aVar);
                }
                String str = this.f297839e;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                String str2 = this.f297840f;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                aVar.mo74318e(4, this.f297841g);
                String str3 = this.f297842h;
                if (str3 != null) {
                    aVar.mo74323j(5, str3);
                }
                aVar.mo74318e(6, this.f297843i);
                String str4 = this.f297844j;
                if (str4 != null) {
                    aVar.mo74323j(7, str4);
                }
                String str5 = this.f297845n;
                if (str5 != null) {
                    aVar.mo74323j(8, str5);
                }
                String str6 = this.f297846o;
                if (str6 != null) {
                    aVar.mo74323j(9, str6);
                }
                String str7 = this.f297847p;
                if (str7 != null) {
                    aVar.mo74323j(10, str7);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BannerImg");
        } else if (i == 1) {
            C52226z70 z703 = this.f297838d;
            if (z703 != null) {
                i2 = 0 + C52418a.m58682i(1, z703.computeSize());
            }
            String str8 = this.f297839e;
            if (str8 != null) {
                i2 += C52418a.m58683j(2, str8);
            }
            String str9 = this.f297840f;
            if (str9 != null) {
                i2 += C52418a.m58683j(3, str9);
            }
            int e = i2 + C52418a.m58678e(4, this.f297841g);
            String str10 = this.f297842h;
            if (str10 != null) {
                e += C52418a.m58683j(5, str10);
            }
            int e2 = e + C52418a.m58678e(6, this.f297843i);
            String str11 = this.f297844j;
            if (str11 != null) {
                e2 += C52418a.m58683j(7, str11);
            }
            String str12 = this.f297845n;
            if (str12 != null) {
                e2 += C52418a.m58683j(8, str12);
            }
            String str13 = this.f297846o;
            if (str13 != null) {
                e2 += C52418a.m58683j(9, str13);
            }
            String str14 = this.f297847p;
            return str14 != null ? e2 + C52418a.m58683j(10, str14) : e2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f297838d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: BannerImg");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C101754a80 a802 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C52226z70 z704 = new C52226z70();
                        if (bArr != null && bArr.length > 0) {
                            z704.parseFrom(bArr);
                        }
                        a802.f297838d = z704;
                    }
                    return 0;
                case 2:
                    a802.f297839e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    a802.f297840f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    a802.f297841g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    a802.f297842h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    a802.f297843i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    a802.f297844j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    a802.f297845n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    a802.f297846o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    a802.f297847p = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
