package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.up */
public class C51578up extends C49335eu3 {

    /* renamed from: d */
    public int f142992d;

    /* renamed from: e */
    public String f142993e;

    /* renamed from: f */
    public boolean f142994f;

    /* renamed from: g */
    public String f142995g;

    /* renamed from: h */
    public String f142996h;

    /* renamed from: i */
    public String f142997i;

    /* renamed from: j */
    public int f142998j;

    /* renamed from: n */
    public String f142999n;

    /* renamed from: o */
    public String f143000o;

    /* renamed from: p */
    public LinkedList<Integer> f143001p = new LinkedList<>();

    /* renamed from: q */
    public String f143002q;

    /* renamed from: r */
    public String f143003r;

    /* renamed from: s */
    public int f143004s;

    /* renamed from: t */
    public int f143005t;

    /* renamed from: u */
    public C64320dn3 f143006u;

    /* renamed from: v */
    public C77933g43 f143007v;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51578up)) {
            return false;
        }
        C51578up upVar = (C51578up) aVar;
        return C46238a.m51546a(this.BaseResponse, upVar.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f142992d), Integer.valueOf(upVar.f142992d)) && C46238a.m51546a(this.f142993e, upVar.f142993e) && C46238a.m51546a(Boolean.valueOf(this.f142994f), Boolean.valueOf(upVar.f142994f)) && C46238a.m51546a(this.f142995g, upVar.f142995g) && C46238a.m51546a(this.f142996h, upVar.f142996h) && C46238a.m51546a(this.f142997i, upVar.f142997i) && C46238a.m51546a(Integer.valueOf(this.f142998j), Integer.valueOf(upVar.f142998j)) && C46238a.m51546a(this.f142999n, upVar.f142999n) && C46238a.m51546a(this.f143000o, upVar.f143000o) && C46238a.m51546a(this.f143001p, upVar.f143001p) && C46238a.m51546a(this.f143002q, upVar.f143002q) && C46238a.m51546a(this.f143003r, upVar.f143003r) && C46238a.m51546a(Integer.valueOf(this.f143004s), Integer.valueOf(upVar.f143004s)) && C46238a.m51546a(Integer.valueOf(this.f143005t), Integer.valueOf(upVar.f143005t)) && C46238a.m51546a(this.f143006u, upVar.f143006u) && C46238a.m51546a(this.f143007v, upVar.f143007v);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f142992d);
                String str = this.f142993e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                aVar.mo74314a(4, this.f142994f);
                String str2 = this.f142995g;
                if (str2 != null) {
                    aVar.mo74323j(5, str2);
                }
                String str3 = this.f142996h;
                if (str3 != null) {
                    aVar.mo74323j(6, str3);
                }
                String str4 = this.f142997i;
                if (str4 != null) {
                    aVar.mo74323j(7, str4);
                }
                aVar.mo74318e(8, this.f142998j);
                String str5 = this.f142999n;
                if (str5 != null) {
                    aVar.mo74323j(9, str5);
                }
                String str6 = this.f143000o;
                if (str6 != null) {
                    aVar.mo74323j(10, str6);
                }
                aVar.mo74320g(11, 2, this.f143001p);
                String str7 = this.f143002q;
                if (str7 != null) {
                    aVar.mo74323j(12, str7);
                }
                String str8 = this.f143003r;
                if (str8 != null) {
                    aVar.mo74323j(13, str8);
                }
                aVar.mo74318e(14, this.f143004s);
                aVar.mo74318e(15, this.f143005t);
                C64320dn3 dn32 = this.f143006u;
                if (dn32 != null) {
                    aVar.mo74322i(16, dn32.computeSize());
                    this.f143006u.writeFields(aVar);
                }
                C77933g43 g432 = this.f143007v;
                if (g432 != null) {
                    aVar.mo74322i(17, g432.computeSize());
                    this.f143007v.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            int e = i3 + C52418a.m58678e(2, this.f142992d);
            String str9 = this.f142993e;
            if (str9 != null) {
                e += C52418a.m58683j(3, str9);
            }
            int a = e + C52418a.m58674a(4, this.f142994f);
            String str10 = this.f142995g;
            if (str10 != null) {
                a += C52418a.m58683j(5, str10);
            }
            String str11 = this.f142996h;
            if (str11 != null) {
                a += C52418a.m58683j(6, str11);
            }
            String str12 = this.f142997i;
            if (str12 != null) {
                a += C52418a.m58683j(7, str12);
            }
            int e2 = a + C52418a.m58678e(8, this.f142998j);
            String str13 = this.f142999n;
            if (str13 != null) {
                e2 += C52418a.m58683j(9, str13);
            }
            String str14 = this.f143000o;
            if (str14 != null) {
                e2 += C52418a.m58683j(10, str14);
            }
            int g = e2 + C52418a.m58680g(11, 2, this.f143001p);
            String str15 = this.f143002q;
            if (str15 != null) {
                g += C52418a.m58683j(12, str15);
            }
            String str16 = this.f143003r;
            if (str16 != null) {
                g += C52418a.m58683j(13, str16);
            }
            int e3 = g + C52418a.m58678e(14, this.f143004s) + C52418a.m58678e(15, this.f143005t);
            C64320dn3 dn33 = this.f143006u;
            if (dn33 != null) {
                e3 += C52418a.m58682i(16, dn33.computeSize());
            }
            C77933g43 g433 = this.f143007v;
            return g433 != null ? e3 + C52418a.m58682i(17, g433.computeSize()) : e3;
        } else if (i2 == 2) {
            this.f143001p.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C51578up upVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C49966ja jaVar3 = new C49966ja();
                        if (bArr != null && bArr.length > 0) {
                            jaVar3.parseFrom(bArr);
                        }
                        upVar.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    upVar.f142992d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    upVar.f142993e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    upVar.f142994f = aVar3.mo141625c(intValue);
                    return 0;
                case 5:
                    upVar.f142995g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    upVar.f142996h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    upVar.f142997i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    upVar.f142998j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    upVar.f142999n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    upVar.f143000o = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    upVar.f143001p.add(Integer.valueOf(aVar3.mo141629g(intValue)));
                    return 0;
                case 12:
                    upVar.f143002q = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    upVar.f143003r = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    upVar.f143004s = aVar3.mo141629g(intValue);
                    return 0;
                case 15:
                    upVar.f143005t = aVar3.mo141629g(intValue);
                    return 0;
                case 16:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C64320dn3 dn34 = new C64320dn3();
                        if (bArr2 != null && bArr2.length > 0) {
                            dn34.parseFrom(bArr2);
                        }
                        upVar.f143006u = dn34;
                    }
                    return 0;
                case 17:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C77933g43 g434 = new C77933g43();
                        if (bArr3 != null && bArr3.length > 0) {
                            g434.parseFrom(bArr3);
                        }
                        upVar.f143007v = g434;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
