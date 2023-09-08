package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class oj4 extends C49335eu3 {

    /* renamed from: d */
    public int f227920d;

    /* renamed from: e */
    public String f227921e;

    /* renamed from: f */
    public int f227922f;

    /* renamed from: g */
    public C48754ar3 f227923g;

    /* renamed from: h */
    public int f227924h;

    /* renamed from: i */
    public C48754ar3 f227925i;

    /* renamed from: j */
    public C64692rv f227926j;

    /* renamed from: n */
    public C52296zq3 f227927n;

    /* renamed from: o */
    public String f227928o;

    /* renamed from: p */
    public String f227929p;

    /* renamed from: q */
    public String f227930q;

    /* renamed from: r */
    public String f227931r;

    /* renamed from: s */
    public String f227932s;

    /* renamed from: t */
    public String f227933t;

    /* renamed from: u */
    public String f227934u;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof oj4)) {
            return false;
        }
        oj4 oj4 = (oj4) aVar;
        return C46238a.m51546a(this.BaseResponse, oj4.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f227920d), Integer.valueOf(oj4.f227920d)) && C46238a.m51546a(this.f227921e, oj4.f227921e) && C46238a.m51546a(Integer.valueOf(this.f227922f), Integer.valueOf(oj4.f227922f)) && C46238a.m51546a(this.f227923g, oj4.f227923g) && C46238a.m51546a(Integer.valueOf(this.f227924h), Integer.valueOf(oj4.f227924h)) && C46238a.m51546a(this.f227925i, oj4.f227925i) && C46238a.m51546a(this.f227926j, oj4.f227926j) && C46238a.m51546a(this.f227927n, oj4.f227927n) && C46238a.m51546a(this.f227928o, oj4.f227928o) && C46238a.m51546a(this.f227929p, oj4.f227929p) && C46238a.m51546a(this.f227930q, oj4.f227930q) && C46238a.m51546a(this.f227931r, oj4.f227931r) && C46238a.m51546a(this.f227932s, oj4.f227932s) && C46238a.m51546a(this.f227933t, oj4.f227933t) && C46238a.m51546a(this.f227934u, oj4.f227934u);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                aVar.mo74322i(1, jaVar.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f227920d);
            String str = this.f227921e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74318e(4, this.f227922f);
            C48754ar3 ar32 = this.f227923g;
            if (ar32 != null) {
                aVar.mo74322i(5, ar32.computeSize());
                this.f227923g.writeFields(aVar);
            }
            aVar.mo74318e(6, this.f227924h);
            C48754ar3 ar33 = this.f227925i;
            if (ar33 != null) {
                aVar.mo74322i(7, ar33.computeSize());
                this.f227925i.writeFields(aVar);
            }
            C64692rv rvVar = this.f227926j;
            if (rvVar != null) {
                aVar.mo74322i(8, rvVar.computeSize());
                this.f227926j.writeFields(aVar);
            }
            C52296zq3 zq32 = this.f227927n;
            if (zq32 != null) {
                aVar.mo74322i(9, zq32.computeSize());
                this.f227927n.writeFields(aVar);
            }
            String str2 = this.f227928o;
            if (str2 != null) {
                aVar.mo74323j(10, str2);
            }
            String str3 = this.f227929p;
            if (str3 != null) {
                aVar.mo74323j(11, str3);
            }
            String str4 = this.f227930q;
            if (str4 != null) {
                aVar.mo74323j(12, str4);
            }
            String str5 = this.f227931r;
            if (str5 != null) {
                aVar.mo74323j(13, str5);
            }
            String str6 = this.f227932s;
            if (str6 != null) {
                aVar.mo74323j(14, str6);
            }
            String str7 = this.f227933t;
            if (str7 != null) {
                aVar.mo74323j(15, str7);
            }
            String str8 = this.f227934u;
            if (str8 != null) {
                aVar.mo74323j(16, str8);
            }
            return 0;
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            int e = i3 + C52418a.m58678e(2, this.f227920d);
            String str9 = this.f227921e;
            if (str9 != null) {
                e += C52418a.m58683j(3, str9);
            }
            int e2 = e + C52418a.m58678e(4, this.f227922f);
            C48754ar3 ar34 = this.f227923g;
            if (ar34 != null) {
                e2 += C52418a.m58682i(5, ar34.computeSize());
            }
            int e3 = e2 + C52418a.m58678e(6, this.f227924h);
            C48754ar3 ar35 = this.f227925i;
            if (ar35 != null) {
                e3 += C52418a.m58682i(7, ar35.computeSize());
            }
            C64692rv rvVar2 = this.f227926j;
            if (rvVar2 != null) {
                e3 += C52418a.m58682i(8, rvVar2.computeSize());
            }
            C52296zq3 zq33 = this.f227927n;
            if (zq33 != null) {
                e3 += C52418a.m58682i(9, zq33.computeSize());
            }
            String str10 = this.f227928o;
            if (str10 != null) {
                e3 += C52418a.m58683j(10, str10);
            }
            String str11 = this.f227929p;
            if (str11 != null) {
                e3 += C52418a.m58683j(11, str11);
            }
            String str12 = this.f227930q;
            if (str12 != null) {
                e3 += C52418a.m58683j(12, str12);
            }
            String str13 = this.f227931r;
            if (str13 != null) {
                e3 += C52418a.m58683j(13, str13);
            }
            String str14 = this.f227932s;
            if (str14 != null) {
                e3 += C52418a.m58683j(14, str14);
            }
            String str15 = this.f227933t;
            if (str15 != null) {
                e3 += C52418a.m58683j(15, str15);
            }
            String str16 = this.f227934u;
            return str16 != null ? e3 + C52418a.m58683j(16, str16) : e3;
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            oj4 oj4 = objArr[1];
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
                        oj4.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    oj4.f227920d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    oj4.f227921e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    oj4.f227922f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C48754ar3 ar36 = new C48754ar3();
                        if (bArr2 != null && bArr2.length > 0) {
                            ar36.parseFrom(bArr2);
                        }
                        oj4.f227923g = ar36;
                    }
                    return 0;
                case 6:
                    oj4.f227924h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C48754ar3 ar37 = new C48754ar3();
                        if (bArr3 != null && bArr3.length > 0) {
                            ar37.parseFrom(bArr3);
                        }
                        oj4.f227925i = ar37;
                    }
                    return 0;
                case 8:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C64692rv rvVar3 = new C64692rv();
                        if (bArr4 != null && bArr4.length > 0) {
                            rvVar3.parseFrom(bArr4);
                        }
                        oj4.f227926j = rvVar3;
                    }
                    return 0;
                case 9:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C52296zq3 zq34 = new C52296zq3();
                        if (bArr5 != null && bArr5.length > 0) {
                            zq34.parseFrom(bArr5);
                        }
                        oj4.f227927n = zq34;
                    }
                    return 0;
                case 10:
                    oj4.f227928o = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    oj4.f227929p = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    oj4.f227930q = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    oj4.f227931r = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    oj4.f227932s = aVar3.mo141633k(intValue);
                    return 0;
                case 15:
                    oj4.f227933t = aVar3.mo141633k(intValue);
                    return 0;
                case 16:
                    oj4.f227934u = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
