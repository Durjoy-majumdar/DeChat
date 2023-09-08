package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.pu1 */
public class C50877pu1 extends C101820nt3 {

    /* renamed from: d */
    public int f139983d;

    /* renamed from: e */
    public String f139984e;

    /* renamed from: f */
    public String f139985f;

    /* renamed from: g */
    public int f139986g;

    /* renamed from: h */
    public String f139987h;

    /* renamed from: i */
    public int f139988i;

    /* renamed from: j */
    public int f139989j;

    /* renamed from: n */
    public String f139990n;

    /* renamed from: o */
    public String f139991o;

    /* renamed from: p */
    public String f139992p;

    /* renamed from: q */
    public int f139993q;

    /* renamed from: r */
    public String f139994r;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50877pu1)) {
            return false;
        }
        C50877pu1 pu12 = (C50877pu1) aVar;
        return C46238a.m51546a(this.BaseRequest, pu12.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f139983d), Integer.valueOf(pu12.f139983d)) && C46238a.m51546a(this.f139984e, pu12.f139984e) && C46238a.m51546a(this.f139985f, pu12.f139985f) && C46238a.m51546a(Integer.valueOf(this.f139986g), Integer.valueOf(pu12.f139986g)) && C46238a.m51546a(this.f139987h, pu12.f139987h) && C46238a.m51546a(Integer.valueOf(this.f139988i), Integer.valueOf(pu12.f139988i)) && C46238a.m51546a(Integer.valueOf(this.f139989j), Integer.valueOf(pu12.f139989j)) && C46238a.m51546a(this.f139990n, pu12.f139990n) && C46238a.m51546a(this.f139991o, pu12.f139991o) && C46238a.m51546a(this.f139992p, pu12.f139992p) && C46238a.m51546a(Integer.valueOf(this.f139993q), Integer.valueOf(pu12.f139993q)) && C46238a.m51546a(this.f139994r, pu12.f139994r);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            if (this.f139984e == null) {
                throw new C52419b("Not all required fields were included: appid");
            } else if (this.f139990n != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f139983d);
                String str = this.f139984e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                String str2 = this.f139985f;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                aVar.mo74318e(5, this.f139986g);
                String str3 = this.f139987h;
                if (str3 != null) {
                    aVar.mo74323j(6, str3);
                }
                aVar.mo74318e(7, this.f139988i);
                aVar.mo74318e(8, this.f139989j);
                String str4 = this.f139990n;
                if (str4 != null) {
                    aVar.mo74323j(9, str4);
                }
                String str5 = this.f139991o;
                if (str5 != null) {
                    aVar.mo74323j(10, str5);
                }
                String str6 = this.f139992p;
                if (str6 != null) {
                    aVar.mo74323j(11, str6);
                }
                aVar.mo74318e(12, this.f139993q);
                String str7 = this.f139994r;
                if (str7 != null) {
                    aVar.mo74323j(13, str7);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: busi_id");
            }
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i3 = C52418a.m58682i(1, iaVar2.computeSize()) + 0;
            }
            int e = i3 + C52418a.m58678e(2, this.f139983d);
            String str8 = this.f139984e;
            if (str8 != null) {
                e += C52418a.m58683j(3, str8);
            }
            String str9 = this.f139985f;
            if (str9 != null) {
                e += C52418a.m58683j(4, str9);
            }
            int e2 = e + C52418a.m58678e(5, this.f139986g);
            String str10 = this.f139987h;
            if (str10 != null) {
                e2 += C52418a.m58683j(6, str10);
            }
            int e3 = e2 + C52418a.m58678e(7, this.f139988i) + C52418a.m58678e(8, this.f139989j);
            String str11 = this.f139990n;
            if (str11 != null) {
                e3 += C52418a.m58683j(9, str11);
            }
            String str12 = this.f139991o;
            if (str12 != null) {
                e3 += C52418a.m58683j(10, str12);
            }
            String str13 = this.f139992p;
            if (str13 != null) {
                e3 += C52418a.m58683j(11, str13);
            }
            int e4 = e3 + C52418a.m58678e(12, this.f139993q);
            String str14 = this.f139994r;
            return str14 != null ? e4 + C52418a.m58683j(13, str14) : e4;
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f139984e == null) {
                throw new C52419b("Not all required fields were included: appid");
            } else if (this.f139990n != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: busi_id");
            }
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C50877pu1 pu12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C90417ia iaVar3 = new C90417ia();
                        if (bArr != null && bArr.length > 0) {
                            iaVar3.parseFrom(bArr);
                        }
                        pu12.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    pu12.f139983d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    pu12.f139984e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    pu12.f139985f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    pu12.f139986g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    pu12.f139987h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    pu12.f139988i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    pu12.f139989j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    pu12.f139990n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    pu12.f139991o = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    pu12.f139992p = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    pu12.f139993q = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    pu12.f139994r = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
