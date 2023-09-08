package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.kj3 */
public class C77960kj3 extends C101820nt3 {

    /* renamed from: d */
    public String f227745d;

    /* renamed from: e */
    public int f227746e;

    /* renamed from: f */
    public int f227747f;

    /* renamed from: g */
    public String f227748g;

    /* renamed from: h */
    public String f227749h;

    /* renamed from: i */
    public int f227750i;

    /* renamed from: j */
    public String f227751j;

    /* renamed from: n */
    public String f227752n;

    /* renamed from: o */
    public int f227753o;

    /* renamed from: p */
    public int f227754p;

    /* renamed from: q */
    public String f227755q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77960kj3)) {
            return false;
        }
        C77960kj3 kj32 = (C77960kj3) aVar;
        return C46238a.m51546a(this.BaseRequest, kj32.BaseRequest) && C46238a.m51546a(this.f227745d, kj32.f227745d) && C46238a.m51546a(Integer.valueOf(this.f227746e), Integer.valueOf(kj32.f227746e)) && C46238a.m51546a(Integer.valueOf(this.f227747f), Integer.valueOf(kj32.f227747f)) && C46238a.m51546a(this.f227748g, kj32.f227748g) && C46238a.m51546a(this.f227749h, kj32.f227749h) && C46238a.m51546a(Integer.valueOf(this.f227750i), Integer.valueOf(kj32.f227750i)) && C46238a.m51546a(this.f227751j, kj32.f227751j) && C46238a.m51546a(this.f227752n, kj32.f227752n) && C46238a.m51546a(Integer.valueOf(this.f227753o), Integer.valueOf(kj32.f227753o)) && C46238a.m51546a(Integer.valueOf(this.f227754p), Integer.valueOf(kj32.f227754p)) && C46238a.m51546a(this.f227755q, kj32.f227755q);
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
            String str = this.f227745d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f227746e);
            aVar.mo74318e(4, this.f227747f);
            String str2 = this.f227748g;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            String str3 = this.f227749h;
            if (str3 != null) {
                aVar.mo74323j(7, str3);
            }
            aVar.mo74318e(8, this.f227750i);
            String str4 = this.f227751j;
            if (str4 != null) {
                aVar.mo74323j(9, str4);
            }
            String str5 = this.f227752n;
            if (str5 != null) {
                aVar.mo74323j(10, str5);
            }
            aVar.mo74318e(11, this.f227753o);
            aVar.mo74318e(12, this.f227754p);
            String str6 = this.f227755q;
            if (str6 != null) {
                aVar.mo74323j(100, str6);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str7 = this.f227745d;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            int e = i2 + C52418a.m58678e(3, this.f227746e) + C52418a.m58678e(4, this.f227747f);
            String str8 = this.f227748g;
            if (str8 != null) {
                e += C52418a.m58683j(5, str8);
            }
            String str9 = this.f227749h;
            if (str9 != null) {
                e += C52418a.m58683j(7, str9);
            }
            int e2 = e + C52418a.m58678e(8, this.f227750i);
            String str10 = this.f227751j;
            if (str10 != null) {
                e2 += C52418a.m58683j(9, str10);
            }
            String str11 = this.f227752n;
            if (str11 != null) {
                e2 += C52418a.m58683j(10, str11);
            }
            int e3 = e2 + C52418a.m58678e(11, this.f227753o) + C52418a.m58678e(12, this.f227754p);
            String str12 = this.f227755q;
            return str12 != null ? e3 + C52418a.m58683j(100, str12) : e3;
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
            C77960kj3 kj32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C90417ia iaVar3 = new C90417ia();
                    if (bArr != null && bArr.length > 0) {
                        iaVar3.parseFrom(bArr);
                    }
                    kj32.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                kj32.f227745d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                kj32.f227746e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                kj32.f227747f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 5) {
                kj32.f227748g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 100) {
                switch (intValue) {
                    case 7:
                        kj32.f227749h = aVar3.mo141633k(intValue);
                        return 0;
                    case 8:
                        kj32.f227750i = aVar3.mo141629g(intValue);
                        return 0;
                    case 9:
                        kj32.f227751j = aVar3.mo141633k(intValue);
                        return 0;
                    case 10:
                        kj32.f227752n = aVar3.mo141633k(intValue);
                        return 0;
                    case 11:
                        kj32.f227753o = aVar3.mo141629g(intValue);
                        return 0;
                    case 12:
                        kj32.f227754p = aVar3.mo141629g(intValue);
                        return 0;
                    default:
                        return -1;
                }
            } else {
                kj32.f227755q = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
