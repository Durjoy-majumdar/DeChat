package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.pb0 */
public class C77976pb0 extends C49335eu3 {

    /* renamed from: d */
    public int f227991d;

    /* renamed from: e */
    public String f227992e;

    /* renamed from: f */
    public int f227993f;

    /* renamed from: g */
    public String f227994g;

    /* renamed from: h */
    public int f227995h;

    /* renamed from: i */
    public int f227996i;

    /* renamed from: j */
    public String f227997j;

    /* renamed from: n */
    public int f227998n;

    /* renamed from: o */
    public C64320dn3 f227999o;

    /* renamed from: p */
    public int f228000p;

    /* renamed from: q */
    public String f228001q;

    /* renamed from: r */
    public String f228002r;

    /* renamed from: s */
    public String f228003s;

    /* renamed from: t */
    public int f228004t;

    /* renamed from: u */
    public String f228005u;

    /* renamed from: v */
    public String f228006v;

    /* renamed from: w */
    public C49995ji2 f228007w;

    /* renamed from: x */
    public C89349b f228008x;

    /* renamed from: y */
    public C89349b f228009y;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77976pb0)) {
            return false;
        }
        C77976pb0 pb02 = (C77976pb0) aVar;
        return C46238a.m51546a(this.BaseResponse, pb02.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f227991d), Integer.valueOf(pb02.f227991d)) && C46238a.m51546a(this.f227992e, pb02.f227992e) && C46238a.m51546a(Integer.valueOf(this.f227993f), Integer.valueOf(pb02.f227993f)) && C46238a.m51546a(this.f227994g, pb02.f227994g) && C46238a.m51546a(Integer.valueOf(this.f227995h), Integer.valueOf(pb02.f227995h)) && C46238a.m51546a(Integer.valueOf(this.f227996i), Integer.valueOf(pb02.f227996i)) && C46238a.m51546a(this.f227997j, pb02.f227997j) && C46238a.m51546a(Integer.valueOf(this.f227998n), Integer.valueOf(pb02.f227998n)) && C46238a.m51546a(this.f227999o, pb02.f227999o) && C46238a.m51546a(Integer.valueOf(this.f228000p), Integer.valueOf(pb02.f228000p)) && C46238a.m51546a(this.f228001q, pb02.f228001q) && C46238a.m51546a(this.f228002r, pb02.f228002r) && C46238a.m51546a(this.f228003s, pb02.f228003s) && C46238a.m51546a(Integer.valueOf(this.f228004t), Integer.valueOf(pb02.f228004t)) && C46238a.m51546a(this.f228005u, pb02.f228005u) && C46238a.m51546a(this.f228006v, pb02.f228006v) && C46238a.m51546a(this.f228007w, pb02.f228007w) && C46238a.m51546a(this.f228008x, pb02.f228008x) && C46238a.m51546a(this.f228009y, pb02.f228009y);
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
                aVar.mo74318e(2, this.f227991d);
                String str = this.f227992e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                aVar.mo74318e(4, this.f227993f);
                String str2 = this.f227994g;
                if (str2 != null) {
                    aVar.mo74323j(5, str2);
                }
                aVar.mo74318e(6, this.f227995h);
                aVar.mo74318e(7, this.f227996i);
                String str3 = this.f227997j;
                if (str3 != null) {
                    aVar.mo74323j(8, str3);
                }
                aVar.mo74318e(9, this.f227998n);
                C64320dn3 dn32 = this.f227999o;
                if (dn32 != null) {
                    aVar.mo74322i(10, dn32.computeSize());
                    this.f227999o.writeFields(aVar);
                }
                aVar.mo74318e(11, this.f228000p);
                String str4 = this.f228001q;
                if (str4 != null) {
                    aVar.mo74323j(12, str4);
                }
                String str5 = this.f228002r;
                if (str5 != null) {
                    aVar.mo74323j(13, str5);
                }
                String str6 = this.f228003s;
                if (str6 != null) {
                    aVar.mo74323j(14, str6);
                }
                aVar.mo74318e(15, this.f228004t);
                String str7 = this.f228005u;
                if (str7 != null) {
                    aVar.mo74323j(16, str7);
                }
                String str8 = this.f228006v;
                if (str8 != null) {
                    aVar.mo74323j(17, str8);
                }
                C49995ji2 ji22 = this.f228007w;
                if (ji22 != null) {
                    aVar.mo74322i(18, ji22.computeSize());
                    this.f228007w.writeFields(aVar);
                }
                C89349b bVar = this.f228008x;
                if (bVar != null) {
                    aVar.mo74315b(19, bVar);
                }
                C89349b bVar2 = this.f228009y;
                if (bVar2 != null) {
                    aVar.mo74315b(20, bVar2);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            int e = i3 + C52418a.m58678e(2, this.f227991d);
            String str9 = this.f227992e;
            if (str9 != null) {
                e += C52418a.m58683j(3, str9);
            }
            int e2 = e + C52418a.m58678e(4, this.f227993f);
            String str10 = this.f227994g;
            if (str10 != null) {
                e2 += C52418a.m58683j(5, str10);
            }
            int e3 = e2 + C52418a.m58678e(6, this.f227995h) + C52418a.m58678e(7, this.f227996i);
            String str11 = this.f227997j;
            if (str11 != null) {
                e3 += C52418a.m58683j(8, str11);
            }
            int e4 = e3 + C52418a.m58678e(9, this.f227998n);
            C64320dn3 dn33 = this.f227999o;
            if (dn33 != null) {
                e4 += C52418a.m58682i(10, dn33.computeSize());
            }
            int e5 = e4 + C52418a.m58678e(11, this.f228000p);
            String str12 = this.f228001q;
            if (str12 != null) {
                e5 += C52418a.m58683j(12, str12);
            }
            String str13 = this.f228002r;
            if (str13 != null) {
                e5 += C52418a.m58683j(13, str13);
            }
            String str14 = this.f228003s;
            if (str14 != null) {
                e5 += C52418a.m58683j(14, str14);
            }
            int e6 = e5 + C52418a.m58678e(15, this.f228004t);
            String str15 = this.f228005u;
            if (str15 != null) {
                e6 += C52418a.m58683j(16, str15);
            }
            String str16 = this.f228006v;
            if (str16 != null) {
                e6 += C52418a.m58683j(17, str16);
            }
            C49995ji2 ji23 = this.f228007w;
            if (ji23 != null) {
                e6 += C52418a.m58682i(18, ji23.computeSize());
            }
            C89349b bVar3 = this.f228008x;
            if (bVar3 != null) {
                e6 += C52418a.m58675b(19, bVar3);
            }
            C89349b bVar4 = this.f228009y;
            return bVar4 != null ? e6 + C52418a.m58675b(20, bVar4) : e6;
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
            C77976pb0 pb02 = objArr[1];
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
                        pb02.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    pb02.f227991d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    pb02.f227992e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    pb02.f227993f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    pb02.f227994g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    pb02.f227995h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    pb02.f227996i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    pb02.f227997j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    pb02.f227998n = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C64320dn3 dn34 = new C64320dn3();
                        if (bArr2 != null && bArr2.length > 0) {
                            dn34.parseFrom(bArr2);
                        }
                        pb02.f227999o = dn34;
                    }
                    return 0;
                case 11:
                    pb02.f228000p = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    pb02.f228001q = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    pb02.f228002r = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    pb02.f228003s = aVar3.mo141633k(intValue);
                    return 0;
                case 15:
                    pb02.f228004t = aVar3.mo141629g(intValue);
                    return 0;
                case 16:
                    pb02.f228005u = aVar3.mo141633k(intValue);
                    return 0;
                case 17:
                    pb02.f228006v = aVar3.mo141633k(intValue);
                    return 0;
                case 18:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C49995ji2 ji24 = new C49995ji2();
                        if (bArr3 != null && bArr3.length > 0) {
                            ji24.parseFrom(bArr3);
                        }
                        pb02.f228007w = ji24;
                    }
                    return 0;
                case 19:
                    pb02.f228008x = aVar3.mo141626d(intValue);
                    return 0;
                case 20:
                    pb02.f228009y = aVar3.mo141626d(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
