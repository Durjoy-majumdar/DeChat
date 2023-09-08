package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.cv1 */
public class C90405cv1 extends C101820nt3 {

    /* renamed from: d */
    public String f259444d;

    /* renamed from: e */
    public int f259445e;

    /* renamed from: f */
    public String f259446f;

    /* renamed from: g */
    public String f259447g;

    /* renamed from: h */
    public int f259448h;

    /* renamed from: i */
    public String f259449i;

    /* renamed from: j */
    public String f259450j;

    /* renamed from: n */
    public String f259451n;

    /* renamed from: o */
    public C89349b f259452o;

    /* renamed from: p */
    public int f259453p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C90405cv1)) {
            return false;
        }
        C90405cv1 cv12 = (C90405cv1) aVar;
        return C46238a.m51546a(this.BaseRequest, cv12.BaseRequest) && C46238a.m51546a(this.f259444d, cv12.f259444d) && C46238a.m51546a(Integer.valueOf(this.f259445e), Integer.valueOf(cv12.f259445e)) && C46238a.m51546a(this.f259446f, cv12.f259446f) && C46238a.m51546a(this.f259447g, cv12.f259447g) && C46238a.m51546a(Integer.valueOf(this.f259448h), Integer.valueOf(cv12.f259448h)) && C46238a.m51546a(this.f259449i, cv12.f259449i) && C46238a.m51546a(this.f259450j, cv12.f259450j) && C46238a.m51546a(this.f259451n, cv12.f259451n) && C46238a.m51546a(this.f259452o, cv12.f259452o) && C46238a.m51546a(Integer.valueOf(this.f259453p), Integer.valueOf(cv12.f259453p));
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
            String str = this.f259444d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f259445e);
            String str2 = this.f259446f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f259447g;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            aVar.mo74318e(6, this.f259448h);
            String str4 = this.f259449i;
            if (str4 != null) {
                aVar.mo74323j(7, str4);
            }
            String str5 = this.f259450j;
            if (str5 != null) {
                aVar.mo74323j(8, str5);
            }
            String str6 = this.f259451n;
            if (str6 != null) {
                aVar.mo74323j(9, str6);
            }
            C89349b bVar = this.f259452o;
            if (bVar != null) {
                aVar.mo74315b(10, bVar);
            }
            aVar.mo74318e(11, this.f259453p);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str7 = this.f259444d;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            int e = i2 + C52418a.m58678e(3, this.f259445e);
            String str8 = this.f259446f;
            if (str8 != null) {
                e += C52418a.m58683j(4, str8);
            }
            String str9 = this.f259447g;
            if (str9 != null) {
                e += C52418a.m58683j(5, str9);
            }
            int e2 = e + C52418a.m58678e(6, this.f259448h);
            String str10 = this.f259449i;
            if (str10 != null) {
                e2 += C52418a.m58683j(7, str10);
            }
            String str11 = this.f259450j;
            if (str11 != null) {
                e2 += C52418a.m58683j(8, str11);
            }
            String str12 = this.f259451n;
            if (str12 != null) {
                e2 += C52418a.m58683j(9, str12);
            }
            C89349b bVar2 = this.f259452o;
            if (bVar2 != null) {
                e2 += C52418a.m58675b(10, bVar2);
            }
            return e2 + C52418a.m58678e(11, this.f259453p);
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
            C90405cv1 cv12 = objArr[1];
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
                        cv12.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    cv12.f259444d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    cv12.f259445e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    cv12.f259446f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    cv12.f259447g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    cv12.f259448h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    cv12.f259449i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    cv12.f259450j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    cv12.f259451n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    cv12.f259452o = aVar3.mo141626d(intValue);
                    return 0;
                case 11:
                    cv12.f259453p = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
