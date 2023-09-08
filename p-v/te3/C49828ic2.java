package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ic2 */
public class C49828ic2 extends C49335eu3 {

    /* renamed from: d */
    public String f135206d;

    /* renamed from: e */
    public String f135207e;

    /* renamed from: f */
    public String f135208f;

    /* renamed from: g */
    public String f135209g;

    /* renamed from: h */
    public String f135210h;

    /* renamed from: i */
    public String f135211i;

    /* renamed from: j */
    public String f135212j;

    /* renamed from: n */
    public String f135213n;

    /* renamed from: o */
    public String f135214o;

    /* renamed from: p */
    public vx4 f135215p;

    /* renamed from: q */
    public String f135216q;

    /* renamed from: r */
    public String f135217r;

    /* renamed from: s */
    public String f135218s;

    /* renamed from: t */
    public String f135219t;

    /* renamed from: u */
    public String f135220u;

    /* renamed from: v */
    public int f135221v;

    /* renamed from: w */
    public LinkedList<px4> f135222w = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49828ic2)) {
            return false;
        }
        C49828ic2 ic22 = (C49828ic2) aVar;
        return C46238a.m51546a(this.BaseResponse, ic22.BaseResponse) && C46238a.m51546a(this.f135206d, ic22.f135206d) && C46238a.m51546a(this.f135207e, ic22.f135207e) && C46238a.m51546a(this.f135208f, ic22.f135208f) && C46238a.m51546a(this.f135209g, ic22.f135209g) && C46238a.m51546a(this.f135210h, ic22.f135210h) && C46238a.m51546a(this.f135211i, ic22.f135211i) && C46238a.m51546a(this.f135212j, ic22.f135212j) && C46238a.m51546a(this.f135213n, ic22.f135213n) && C46238a.m51546a(this.f135214o, ic22.f135214o) && C46238a.m51546a(this.f135215p, ic22.f135215p) && C46238a.m51546a(this.f135216q, ic22.f135216q) && C46238a.m51546a(this.f135217r, ic22.f135217r) && C46238a.m51546a(this.f135218s, ic22.f135218s) && C46238a.m51546a(this.f135219t, ic22.f135219t) && C46238a.m51546a(this.f135220u, ic22.f135220u) && C46238a.m51546a(Integer.valueOf(this.f135221v), Integer.valueOf(ic22.f135221v)) && C46238a.m51546a(this.f135222w, ic22.f135222w);
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
                String str = this.f135206d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                String str2 = this.f135207e;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                String str3 = this.f135208f;
                if (str3 != null) {
                    aVar.mo74323j(4, str3);
                }
                String str4 = this.f135209g;
                if (str4 != null) {
                    aVar.mo74323j(5, str4);
                }
                String str5 = this.f135210h;
                if (str5 != null) {
                    aVar.mo74323j(6, str5);
                }
                String str6 = this.f135211i;
                if (str6 != null) {
                    aVar.mo74323j(7, str6);
                }
                String str7 = this.f135212j;
                if (str7 != null) {
                    aVar.mo74323j(8, str7);
                }
                String str8 = this.f135213n;
                if (str8 != null) {
                    aVar.mo74323j(9, str8);
                }
                String str9 = this.f135214o;
                if (str9 != null) {
                    aVar.mo74323j(10, str9);
                }
                vx4 vx4 = this.f135215p;
                if (vx4 != null) {
                    aVar.mo74322i(11, vx4.computeSize());
                    this.f135215p.writeFields(aVar);
                }
                String str10 = this.f135216q;
                if (str10 != null) {
                    aVar.mo74323j(12, str10);
                }
                String str11 = this.f135217r;
                if (str11 != null) {
                    aVar.mo74323j(13, str11);
                }
                String str12 = this.f135218s;
                if (str12 != null) {
                    aVar.mo74323j(14, str12);
                }
                String str13 = this.f135219t;
                if (str13 != null) {
                    aVar.mo74323j(15, str13);
                }
                String str14 = this.f135220u;
                if (str14 != null) {
                    aVar.mo74323j(16, str14);
                }
                aVar.mo74318e(17, this.f135221v);
                aVar.mo74320g(18, 8, this.f135222w);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            String str15 = this.f135206d;
            if (str15 != null) {
                i3 += C52418a.m58683j(2, str15);
            }
            String str16 = this.f135207e;
            if (str16 != null) {
                i3 += C52418a.m58683j(3, str16);
            }
            String str17 = this.f135208f;
            if (str17 != null) {
                i3 += C52418a.m58683j(4, str17);
            }
            String str18 = this.f135209g;
            if (str18 != null) {
                i3 += C52418a.m58683j(5, str18);
            }
            String str19 = this.f135210h;
            if (str19 != null) {
                i3 += C52418a.m58683j(6, str19);
            }
            String str20 = this.f135211i;
            if (str20 != null) {
                i3 += C52418a.m58683j(7, str20);
            }
            String str21 = this.f135212j;
            if (str21 != null) {
                i3 += C52418a.m58683j(8, str21);
            }
            String str22 = this.f135213n;
            if (str22 != null) {
                i3 += C52418a.m58683j(9, str22);
            }
            String str23 = this.f135214o;
            if (str23 != null) {
                i3 += C52418a.m58683j(10, str23);
            }
            vx4 vx42 = this.f135215p;
            if (vx42 != null) {
                i3 += C52418a.m58682i(11, vx42.computeSize());
            }
            String str24 = this.f135216q;
            if (str24 != null) {
                i3 += C52418a.m58683j(12, str24);
            }
            String str25 = this.f135217r;
            if (str25 != null) {
                i3 += C52418a.m58683j(13, str25);
            }
            String str26 = this.f135218s;
            if (str26 != null) {
                i3 += C52418a.m58683j(14, str26);
            }
            String str27 = this.f135219t;
            if (str27 != null) {
                i3 += C52418a.m58683j(15, str27);
            }
            String str28 = this.f135220u;
            if (str28 != null) {
                i3 += C52418a.m58683j(16, str28);
            }
            return i3 + C52418a.m58678e(17, this.f135221v) + C52418a.m58680g(18, 8, this.f135222w);
        } else if (i2 == 2) {
            this.f135222w.clear();
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
            C49828ic2 ic22 = objArr[1];
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
                        ic22.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    ic22.f135206d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    ic22.f135207e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    ic22.f135208f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    ic22.f135209g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    ic22.f135210h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    ic22.f135211i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    ic22.f135212j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    ic22.f135213n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    ic22.f135214o = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        vx4 vx43 = new vx4();
                        if (bArr2 != null && bArr2.length > 0) {
                            vx43.parseFrom(bArr2);
                        }
                        ic22.f135215p = vx43;
                    }
                    return 0;
                case 12:
                    ic22.f135216q = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    ic22.f135217r = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    ic22.f135218s = aVar3.mo141633k(intValue);
                    return 0;
                case 15:
                    ic22.f135219t = aVar3.mo141633k(intValue);
                    return 0;
                case 16:
                    ic22.f135220u = aVar3.mo141633k(intValue);
                    return 0;
                case 17:
                    ic22.f135221v = aVar3.mo141629g(intValue);
                    return 0;
                case 18:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        px4 px4 = new px4();
                        if (bArr3 != null && bArr3.length > 0) {
                            px4.parseFrom(bArr3);
                        }
                        ic22.f135222w.add(px4);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
