package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.fp */
public class C77931fp extends C101820nt3 {

    /* renamed from: d */
    public int f227408d;

    /* renamed from: e */
    public String f227409e;

    /* renamed from: f */
    public String f227410f;

    /* renamed from: g */
    public String f227411g;

    /* renamed from: h */
    public String f227412h;

    /* renamed from: i */
    public String f227413i;

    /* renamed from: j */
    public String f227414j;

    /* renamed from: n */
    public String f227415n;

    /* renamed from: o */
    public String f227416o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77931fp)) {
            return false;
        }
        C77931fp fpVar = (C77931fp) aVar;
        return C46238a.m51546a(this.BaseRequest, fpVar.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f227408d), Integer.valueOf(fpVar.f227408d)) && C46238a.m51546a(this.f227409e, fpVar.f227409e) && C46238a.m51546a(this.f227410f, fpVar.f227410f) && C46238a.m51546a(this.f227411g, fpVar.f227411g) && C46238a.m51546a(this.f227412h, fpVar.f227412h) && C46238a.m51546a(this.f227413i, fpVar.f227413i) && C46238a.m51546a(this.f227414j, fpVar.f227414j) && C46238a.m51546a(this.f227415n, fpVar.f227415n) && C46238a.m51546a(this.f227416o, fpVar.f227416o);
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
            aVar.mo74318e(2, this.f227408d);
            String str = this.f227409e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f227410f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f227411g;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            String str4 = this.f227412h;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            String str5 = this.f227413i;
            if (str5 != null) {
                aVar.mo74323j(7, str5);
            }
            String str6 = this.f227414j;
            if (str6 != null) {
                aVar.mo74323j(8, str6);
            }
            String str7 = this.f227415n;
            if (str7 != null) {
                aVar.mo74323j(9, str7);
            }
            String str8 = this.f227416o;
            if (str8 != null) {
                aVar.mo74323j(10, str8);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f227408d);
            String str9 = this.f227409e;
            if (str9 != null) {
                e += C52418a.m58683j(3, str9);
            }
            String str10 = this.f227410f;
            if (str10 != null) {
                e += C52418a.m58683j(4, str10);
            }
            String str11 = this.f227411g;
            if (str11 != null) {
                e += C52418a.m58683j(5, str11);
            }
            String str12 = this.f227412h;
            if (str12 != null) {
                e += C52418a.m58683j(6, str12);
            }
            String str13 = this.f227413i;
            if (str13 != null) {
                e += C52418a.m58683j(7, str13);
            }
            String str14 = this.f227414j;
            if (str14 != null) {
                e += C52418a.m58683j(8, str14);
            }
            String str15 = this.f227415n;
            if (str15 != null) {
                e += C52418a.m58683j(9, str15);
            }
            String str16 = this.f227416o;
            return str16 != null ? e + C52418a.m58683j(10, str16) : e;
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
            C77931fp fpVar = objArr[1];
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
                        fpVar.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    fpVar.f227408d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    fpVar.f227409e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    fpVar.f227410f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    fpVar.f227411g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    fpVar.f227412h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    fpVar.f227413i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    fpVar.f227414j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    fpVar.f227415n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    fpVar.f227416o = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
