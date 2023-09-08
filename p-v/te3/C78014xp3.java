package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.xp3 */
public class C78014xp3 extends C49335eu3 {

    /* renamed from: d */
    public int f228521d;

    /* renamed from: e */
    public String f228522e;

    /* renamed from: f */
    public boolean f228523f;

    /* renamed from: g */
    public boolean f228524g;

    /* renamed from: h */
    public int f228525h;

    /* renamed from: i */
    public String f228526i;

    /* renamed from: j */
    public String f228527j;

    /* renamed from: n */
    public int f228528n;

    /* renamed from: o */
    public String f228529o;

    /* renamed from: p */
    public String f228530p;

    /* renamed from: q */
    public String f228531q;

    /* renamed from: r */
    public String f228532r;

    /* renamed from: s */
    public C52159yr2 f228533s;

    /* renamed from: t */
    public String f228534t;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C78014xp3)) {
            return false;
        }
        C78014xp3 xp32 = (C78014xp3) aVar;
        return C46238a.m51546a(this.BaseResponse, xp32.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f228521d), Integer.valueOf(xp32.f228521d)) && C46238a.m51546a(this.f228522e, xp32.f228522e) && C46238a.m51546a(Boolean.valueOf(this.f228523f), Boolean.valueOf(xp32.f228523f)) && C46238a.m51546a(Boolean.valueOf(this.f228524g), Boolean.valueOf(xp32.f228524g)) && C46238a.m51546a(Integer.valueOf(this.f228525h), Integer.valueOf(xp32.f228525h)) && C46238a.m51546a(this.f228526i, xp32.f228526i) && C46238a.m51546a(this.f228527j, xp32.f228527j) && C46238a.m51546a(Integer.valueOf(this.f228528n), Integer.valueOf(xp32.f228528n)) && C46238a.m51546a(this.f228529o, xp32.f228529o) && C46238a.m51546a(this.f228530p, xp32.f228530p) && C46238a.m51546a(this.f228531q, xp32.f228531q) && C46238a.m51546a(this.f228532r, xp32.f228532r) && C46238a.m51546a(this.f228533s, xp32.f228533s) && C46238a.m51546a(this.f228534t, xp32.f228534t);
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
                aVar.mo74318e(2, this.f228521d);
                String str = this.f228522e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                aVar.mo74314a(4, this.f228523f);
                aVar.mo74314a(5, this.f228524g);
                aVar.mo74318e(6, this.f228525h);
                String str2 = this.f228526i;
                if (str2 != null) {
                    aVar.mo74323j(7, str2);
                }
                String str3 = this.f228527j;
                if (str3 != null) {
                    aVar.mo74323j(8, str3);
                }
                aVar.mo74318e(9, this.f228528n);
                String str4 = this.f228529o;
                if (str4 != null) {
                    aVar.mo74323j(10, str4);
                }
                String str5 = this.f228530p;
                if (str5 != null) {
                    aVar.mo74323j(11, str5);
                }
                String str6 = this.f228531q;
                if (str6 != null) {
                    aVar.mo74323j(12, str6);
                }
                String str7 = this.f228532r;
                if (str7 != null) {
                    aVar.mo74323j(13, str7);
                }
                C52159yr2 yr22 = this.f228533s;
                if (yr22 != null) {
                    aVar.mo74322i(99, yr22.computeSize());
                    this.f228533s.writeFields(aVar);
                }
                String str8 = this.f228534t;
                if (str8 != null) {
                    aVar.mo74323j(100, str8);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            int e = i3 + C52418a.m58678e(2, this.f228521d);
            String str9 = this.f228522e;
            if (str9 != null) {
                e += C52418a.m58683j(3, str9);
            }
            int a = e + C52418a.m58674a(4, this.f228523f) + C52418a.m58674a(5, this.f228524g) + C52418a.m58678e(6, this.f228525h);
            String str10 = this.f228526i;
            if (str10 != null) {
                a += C52418a.m58683j(7, str10);
            }
            String str11 = this.f228527j;
            if (str11 != null) {
                a += C52418a.m58683j(8, str11);
            }
            int e2 = a + C52418a.m58678e(9, this.f228528n);
            String str12 = this.f228529o;
            if (str12 != null) {
                e2 += C52418a.m58683j(10, str12);
            }
            String str13 = this.f228530p;
            if (str13 != null) {
                e2 += C52418a.m58683j(11, str13);
            }
            String str14 = this.f228531q;
            if (str14 != null) {
                e2 += C52418a.m58683j(12, str14);
            }
            String str15 = this.f228532r;
            if (str15 != null) {
                e2 += C52418a.m58683j(13, str15);
            }
            C52159yr2 yr23 = this.f228533s;
            if (yr23 != null) {
                e2 += C52418a.m58682i(99, yr23.computeSize());
            }
            String str16 = this.f228534t;
            return str16 != null ? e2 + C52418a.m58683j(100, str16) : e2;
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
            C78014xp3 xp32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 99) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i4 = 0; i4 < size; i4++) {
                    byte[] bArr = j.get(i4);
                    C52159yr2 yr24 = new C52159yr2();
                    if (bArr != null && bArr.length > 0) {
                        yr24.parseFrom(bArr);
                    }
                    xp32.f228533s = yr24;
                }
                return 0;
            } else if (intValue != 100) {
                switch (intValue) {
                    case 1:
                        LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                        int size2 = j2.size();
                        for (int i5 = 0; i5 < size2; i5++) {
                            byte[] bArr2 = j2.get(i5);
                            C49966ja jaVar3 = new C49966ja();
                            if (bArr2 != null && bArr2.length > 0) {
                                jaVar3.parseFrom(bArr2);
                            }
                            xp32.BaseResponse = jaVar3;
                        }
                        return 0;
                    case 2:
                        xp32.f228521d = aVar3.mo141629g(intValue);
                        return 0;
                    case 3:
                        xp32.f228522e = aVar3.mo141633k(intValue);
                        return 0;
                    case 4:
                        xp32.f228523f = aVar3.mo141625c(intValue);
                        return 0;
                    case 5:
                        xp32.f228524g = aVar3.mo141625c(intValue);
                        return 0;
                    case 6:
                        xp32.f228525h = aVar3.mo141629g(intValue);
                        return 0;
                    case 7:
                        xp32.f228526i = aVar3.mo141633k(intValue);
                        return 0;
                    case 8:
                        xp32.f228527j = aVar3.mo141633k(intValue);
                        return 0;
                    case 9:
                        xp32.f228528n = aVar3.mo141629g(intValue);
                        return 0;
                    case 10:
                        xp32.f228529o = aVar3.mo141633k(intValue);
                        return 0;
                    case 11:
                        xp32.f228530p = aVar3.mo141633k(intValue);
                        return 0;
                    case 12:
                        xp32.f228531q = aVar3.mo141633k(intValue);
                        return 0;
                    case 13:
                        xp32.f228532r = aVar3.mo141633k(intValue);
                        return 0;
                    default:
                        return -1;
                }
            } else {
                xp32.f228534t = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
