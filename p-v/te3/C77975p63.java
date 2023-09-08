package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.p63 */
public class C77975p63 extends C101820nt3 {

    /* renamed from: d */
    public String f227980d;

    /* renamed from: e */
    public String f227981e;

    /* renamed from: f */
    public String f227982f;

    /* renamed from: g */
    public String f227983g;

    /* renamed from: h */
    public String f227984h;

    /* renamed from: i */
    public String f227985i;

    /* renamed from: j */
    public int f227986j;

    /* renamed from: n */
    public int f227987n;

    /* renamed from: o */
    public boolean f227988o;

    /* renamed from: p */
    public int f227989p;

    /* renamed from: q */
    public String f227990q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77975p63)) {
            return false;
        }
        C77975p63 p632 = (C77975p63) aVar;
        return C46238a.m51546a(this.BaseRequest, p632.BaseRequest) && C46238a.m51546a(this.f227980d, p632.f227980d) && C46238a.m51546a(this.f227981e, p632.f227981e) && C46238a.m51546a(this.f227982f, p632.f227982f) && C46238a.m51546a(this.f227983g, p632.f227983g) && C46238a.m51546a(this.f227984h, p632.f227984h) && C46238a.m51546a(this.f227985i, p632.f227985i) && C46238a.m51546a(Integer.valueOf(this.f227986j), Integer.valueOf(p632.f227986j)) && C46238a.m51546a(Integer.valueOf(this.f227987n), Integer.valueOf(p632.f227987n)) && C46238a.m51546a(Boolean.valueOf(this.f227988o), Boolean.valueOf(p632.f227988o)) && C46238a.m51546a(Integer.valueOf(this.f227989p), Integer.valueOf(p632.f227989p)) && C46238a.m51546a(this.f227990q, p632.f227990q);
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
            String str = this.f227980d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f227981e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f227982f;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f227983g;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f227984h;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            String str6 = this.f227985i;
            if (str6 != null) {
                aVar.mo74323j(7, str6);
            }
            aVar.mo74318e(8, this.f227986j);
            aVar.mo74318e(9, this.f227987n);
            aVar.mo74314a(10, this.f227988o);
            aVar.mo74318e(11, this.f227989p);
            String str7 = this.f227990q;
            if (str7 != null) {
                aVar.mo74323j(12, str7);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str8 = this.f227980d;
            if (str8 != null) {
                i2 += C52418a.m58683j(2, str8);
            }
            String str9 = this.f227981e;
            if (str9 != null) {
                i2 += C52418a.m58683j(3, str9);
            }
            String str10 = this.f227982f;
            if (str10 != null) {
                i2 += C52418a.m58683j(4, str10);
            }
            String str11 = this.f227983g;
            if (str11 != null) {
                i2 += C52418a.m58683j(5, str11);
            }
            String str12 = this.f227984h;
            if (str12 != null) {
                i2 += C52418a.m58683j(6, str12);
            }
            String str13 = this.f227985i;
            if (str13 != null) {
                i2 += C52418a.m58683j(7, str13);
            }
            int e = i2 + C52418a.m58678e(8, this.f227986j) + C52418a.m58678e(9, this.f227987n) + C52418a.m58674a(10, this.f227988o) + C52418a.m58678e(11, this.f227989p);
            String str14 = this.f227990q;
            return str14 != null ? e + C52418a.m58683j(12, str14) : e;
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
            C77975p63 p632 = objArr[1];
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
                        p632.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    p632.f227980d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    p632.f227981e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    p632.f227982f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    p632.f227983g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    p632.f227984h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    p632.f227985i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    p632.f227986j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    p632.f227987n = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    p632.f227988o = aVar3.mo141625c(intValue);
                    return 0;
                case 11:
                    p632.f227989p = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    p632.f227990q = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
