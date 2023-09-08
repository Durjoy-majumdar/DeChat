package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class wj4 extends C49335eu3 {

    /* renamed from: d */
    public int f144095d;

    /* renamed from: e */
    public String f144096e;

    /* renamed from: f */
    public String f144097f;

    /* renamed from: g */
    public String f144098g;

    /* renamed from: h */
    public l44 f144099h;

    /* renamed from: i */
    public int f144100i;

    /* renamed from: j */
    public String f144101j;

    /* renamed from: n */
    public int f144102n;

    /* renamed from: o */
    public String f144103o;

    /* renamed from: p */
    public String f144104p;

    /* renamed from: q */
    public String f144105q;

    /* renamed from: r */
    public C89349b f144106r;

    /* renamed from: s */
    public int f144107s;

    /* renamed from: t */
    public String f144108t;

    /* renamed from: u */
    public C52319zw3 f144109u;

    /* renamed from: v */
    public String f144110v;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof wj4)) {
            return false;
        }
        wj4 wj4 = (wj4) aVar;
        return C46238a.m51546a(this.BaseResponse, wj4.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f144095d), Integer.valueOf(wj4.f144095d)) && C46238a.m51546a(this.f144096e, wj4.f144096e) && C46238a.m51546a(this.f144097f, wj4.f144097f) && C46238a.m51546a(this.f144098g, wj4.f144098g) && C46238a.m51546a(this.f144099h, wj4.f144099h) && C46238a.m51546a(Integer.valueOf(this.f144100i), Integer.valueOf(wj4.f144100i)) && C46238a.m51546a(this.f144101j, wj4.f144101j) && C46238a.m51546a(Integer.valueOf(this.f144102n), Integer.valueOf(wj4.f144102n)) && C46238a.m51546a(this.f144103o, wj4.f144103o) && C46238a.m51546a(this.f144104p, wj4.f144104p) && C46238a.m51546a(this.f144105q, wj4.f144105q) && C46238a.m51546a(this.f144106r, wj4.f144106r) && C46238a.m51546a(Integer.valueOf(this.f144107s), Integer.valueOf(wj4.f144107s)) && C46238a.m51546a(this.f144108t, wj4.f144108t) && C46238a.m51546a(this.f144109u, wj4.f144109u) && C46238a.m51546a(this.f144110v, wj4.f144110v);
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
                aVar.mo74318e(2, this.f144095d);
                String str = this.f144096e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                String str2 = this.f144097f;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                String str3 = this.f144098g;
                if (str3 != null) {
                    aVar.mo74323j(5, str3);
                }
                l44 l44 = this.f144099h;
                if (l44 != null) {
                    aVar.mo74322i(6, l44.computeSize());
                    this.f144099h.writeFields(aVar);
                }
                aVar.mo74318e(7, this.f144100i);
                String str4 = this.f144101j;
                if (str4 != null) {
                    aVar.mo74323j(8, str4);
                }
                aVar.mo74318e(9, this.f144102n);
                String str5 = this.f144103o;
                if (str5 != null) {
                    aVar.mo74323j(10, str5);
                }
                String str6 = this.f144104p;
                if (str6 != null) {
                    aVar.mo74323j(11, str6);
                }
                String str7 = this.f144105q;
                if (str7 != null) {
                    aVar.mo74323j(12, str7);
                }
                C89349b bVar = this.f144106r;
                if (bVar != null) {
                    aVar.mo74315b(13, bVar);
                }
                aVar.mo74318e(14, this.f144107s);
                String str8 = this.f144108t;
                if (str8 != null) {
                    aVar.mo74323j(15, str8);
                }
                C52319zw3 zw32 = this.f144109u;
                if (zw32 != null) {
                    aVar.mo74322i(16, zw32.computeSize());
                    this.f144109u.writeFields(aVar);
                }
                String str9 = this.f144110v;
                if (str9 != null) {
                    aVar.mo74323j(17, str9);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            int e = i3 + C52418a.m58678e(2, this.f144095d);
            String str10 = this.f144096e;
            if (str10 != null) {
                e += C52418a.m58683j(3, str10);
            }
            String str11 = this.f144097f;
            if (str11 != null) {
                e += C52418a.m58683j(4, str11);
            }
            String str12 = this.f144098g;
            if (str12 != null) {
                e += C52418a.m58683j(5, str12);
            }
            l44 l442 = this.f144099h;
            if (l442 != null) {
                e += C52418a.m58682i(6, l442.computeSize());
            }
            int e2 = e + C52418a.m58678e(7, this.f144100i);
            String str13 = this.f144101j;
            if (str13 != null) {
                e2 += C52418a.m58683j(8, str13);
            }
            int e3 = e2 + C52418a.m58678e(9, this.f144102n);
            String str14 = this.f144103o;
            if (str14 != null) {
                e3 += C52418a.m58683j(10, str14);
            }
            String str15 = this.f144104p;
            if (str15 != null) {
                e3 += C52418a.m58683j(11, str15);
            }
            String str16 = this.f144105q;
            if (str16 != null) {
                e3 += C52418a.m58683j(12, str16);
            }
            C89349b bVar2 = this.f144106r;
            if (bVar2 != null) {
                e3 += C52418a.m58675b(13, bVar2);
            }
            int e4 = e3 + C52418a.m58678e(14, this.f144107s);
            String str17 = this.f144108t;
            if (str17 != null) {
                e4 += C52418a.m58683j(15, str17);
            }
            C52319zw3 zw33 = this.f144109u;
            if (zw33 != null) {
                e4 += C52418a.m58682i(16, zw33.computeSize());
            }
            String str18 = this.f144110v;
            return str18 != null ? e4 + C52418a.m58683j(17, str18) : e4;
        } else if (i2 == 2) {
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
            wj4 wj4 = objArr[1];
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
                        wj4.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    wj4.f144095d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    wj4.f144096e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    wj4.f144097f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    wj4.f144098g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        l44 l443 = new l44();
                        if (bArr2 != null && bArr2.length > 0) {
                            l443.parseFrom(bArr2);
                        }
                        wj4.f144099h = l443;
                    }
                    return 0;
                case 7:
                    wj4.f144100i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    wj4.f144101j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    wj4.f144102n = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    wj4.f144103o = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    wj4.f144104p = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    wj4.f144105q = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    wj4.f144106r = aVar3.mo141626d(intValue);
                    return 0;
                case 14:
                    wj4.f144107s = aVar3.mo141629g(intValue);
                    return 0;
                case 15:
                    wj4.f144108t = aVar3.mo141633k(intValue);
                    return 0;
                case 16:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C52319zw3 zw34 = new C52319zw3();
                        if (bArr3 != null && bArr3.length > 0) {
                            zw34.parseFrom(bArr3);
                        }
                        wj4.f144109u = zw34;
                    }
                    return 0;
                case 17:
                    wj4.f144110v = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
