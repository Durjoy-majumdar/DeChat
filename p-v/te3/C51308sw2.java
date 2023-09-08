package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.sw2 */
public class C51308sw2 extends C49335eu3 {

    /* renamed from: d */
    public int f141790d;

    /* renamed from: e */
    public String f141791e;

    /* renamed from: f */
    public String f141792f;

    /* renamed from: g */
    public String f141793g;

    /* renamed from: h */
    public String f141794h;

    /* renamed from: i */
    public String f141795i;

    /* renamed from: j */
    public String f141796j;

    /* renamed from: n */
    public String f141797n;

    /* renamed from: o */
    public C49995ji2 f141798o;

    /* renamed from: p */
    public int f141799p;

    /* renamed from: q */
    public long f141800q;

    /* renamed from: r */
    public String f141801r;

    /* renamed from: s */
    public boolean f141802s;

    /* renamed from: t */
    public String f141803t;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51308sw2)) {
            return false;
        }
        C51308sw2 sw22 = (C51308sw2) aVar;
        return C46238a.m51546a(this.BaseResponse, sw22.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f141790d), Integer.valueOf(sw22.f141790d)) && C46238a.m51546a(this.f141791e, sw22.f141791e) && C46238a.m51546a(this.f141792f, sw22.f141792f) && C46238a.m51546a(this.f141793g, sw22.f141793g) && C46238a.m51546a(this.f141794h, sw22.f141794h) && C46238a.m51546a(this.f141795i, sw22.f141795i) && C46238a.m51546a(this.f141796j, sw22.f141796j) && C46238a.m51546a(this.f141797n, sw22.f141797n) && C46238a.m51546a(this.f141798o, sw22.f141798o) && C46238a.m51546a(Integer.valueOf(this.f141799p), Integer.valueOf(sw22.f141799p)) && C46238a.m51546a(Long.valueOf(this.f141800q), Long.valueOf(sw22.f141800q)) && C46238a.m51546a(this.f141801r, sw22.f141801r) && C46238a.m51546a(Boolean.valueOf(this.f141802s), Boolean.valueOf(sw22.f141802s)) && C46238a.m51546a(this.f141803t, sw22.f141803t);
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
                aVar.mo74318e(2, this.f141790d);
                String str = this.f141791e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                String str2 = this.f141792f;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                String str3 = this.f141793g;
                if (str3 != null) {
                    aVar.mo74323j(5, str3);
                }
                String str4 = this.f141794h;
                if (str4 != null) {
                    aVar.mo74323j(6, str4);
                }
                String str5 = this.f141795i;
                if (str5 != null) {
                    aVar.mo74323j(7, str5);
                }
                String str6 = this.f141796j;
                if (str6 != null) {
                    aVar.mo74323j(8, str6);
                }
                String str7 = this.f141797n;
                if (str7 != null) {
                    aVar.mo74323j(9, str7);
                }
                C49995ji2 ji22 = this.f141798o;
                if (ji22 != null) {
                    aVar.mo74322i(10, ji22.computeSize());
                    this.f141798o.writeFields(aVar);
                }
                aVar.mo74318e(11, this.f141799p);
                aVar.mo74321h(12, this.f141800q);
                String str8 = this.f141801r;
                if (str8 != null) {
                    aVar.mo74323j(13, str8);
                }
                aVar.mo74314a(14, this.f141802s);
                String str9 = this.f141803t;
                if (str9 != null) {
                    aVar.mo74323j(15, str9);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            int e = i3 + C52418a.m58678e(2, this.f141790d);
            String str10 = this.f141791e;
            if (str10 != null) {
                e += C52418a.m58683j(3, str10);
            }
            String str11 = this.f141792f;
            if (str11 != null) {
                e += C52418a.m58683j(4, str11);
            }
            String str12 = this.f141793g;
            if (str12 != null) {
                e += C52418a.m58683j(5, str12);
            }
            String str13 = this.f141794h;
            if (str13 != null) {
                e += C52418a.m58683j(6, str13);
            }
            String str14 = this.f141795i;
            if (str14 != null) {
                e += C52418a.m58683j(7, str14);
            }
            String str15 = this.f141796j;
            if (str15 != null) {
                e += C52418a.m58683j(8, str15);
            }
            String str16 = this.f141797n;
            if (str16 != null) {
                e += C52418a.m58683j(9, str16);
            }
            C49995ji2 ji23 = this.f141798o;
            if (ji23 != null) {
                e += C52418a.m58682i(10, ji23.computeSize());
            }
            int e2 = e + C52418a.m58678e(11, this.f141799p) + C52418a.m58681h(12, this.f141800q);
            String str17 = this.f141801r;
            if (str17 != null) {
                e2 += C52418a.m58683j(13, str17);
            }
            int a = e2 + C52418a.m58674a(14, this.f141802s);
            String str18 = this.f141803t;
            return str18 != null ? a + C52418a.m58683j(15, str18) : a;
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
            C51308sw2 sw22 = objArr[1];
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
                        sw22.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    sw22.f141790d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    sw22.f141791e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    sw22.f141792f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    sw22.f141793g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    sw22.f141794h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    sw22.f141795i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    sw22.f141796j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    sw22.f141797n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C49995ji2 ji24 = new C49995ji2();
                        if (bArr2 != null && bArr2.length > 0) {
                            ji24.parseFrom(bArr2);
                        }
                        sw22.f141798o = ji24;
                    }
                    return 0;
                case 11:
                    sw22.f141799p = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    sw22.f141800q = aVar3.mo141631i(intValue);
                    return 0;
                case 13:
                    sw22.f141801r = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    sw22.f141802s = aVar3.mo141625c(intValue);
                    return 0;
                case 15:
                    sw22.f141803t = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
