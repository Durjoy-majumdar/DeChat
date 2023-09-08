package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ab0 */
public class C64229ab0 extends C101820nt3 {

    /* renamed from: d */
    public String f182058d;

    /* renamed from: e */
    public String f182059e;

    /* renamed from: f */
    public int f182060f;

    /* renamed from: g */
    public int f182061g;

    /* renamed from: h */
    public String f182062h;

    /* renamed from: i */
    public String f182063i;

    /* renamed from: j */
    public String f182064j;

    /* renamed from: n */
    public String f182065n;

    /* renamed from: o */
    public String f182066o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64229ab0)) {
            return false;
        }
        C64229ab0 ab02 = (C64229ab0) aVar;
        return C46238a.m51546a(this.BaseRequest, ab02.BaseRequest) && C46238a.m51546a(this.f182058d, ab02.f182058d) && C46238a.m51546a(this.f182059e, ab02.f182059e) && C46238a.m51546a(Integer.valueOf(this.f182060f), Integer.valueOf(ab02.f182060f)) && C46238a.m51546a(Integer.valueOf(this.f182061g), Integer.valueOf(ab02.f182061g)) && C46238a.m51546a(this.f182062h, ab02.f182062h) && C46238a.m51546a(this.f182063i, ab02.f182063i) && C46238a.m51546a(this.f182064j, ab02.f182064j) && C46238a.m51546a(this.f182065n, ab02.f182065n) && C46238a.m51546a(this.f182066o, ab02.f182066o);
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
            String str = this.f182058d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f182059e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74318e(4, this.f182060f);
            aVar.mo74318e(5, this.f182061g);
            String str3 = this.f182062h;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            String str4 = this.f182063i;
            if (str4 != null) {
                aVar.mo74323j(7, str4);
            }
            String str5 = this.f182064j;
            if (str5 != null) {
                aVar.mo74323j(8, str5);
            }
            String str6 = this.f182065n;
            if (str6 != null) {
                aVar.mo74323j(9, str6);
            }
            String str7 = this.f182066o;
            if (str7 != null) {
                aVar.mo74323j(10, str7);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str8 = this.f182058d;
            if (str8 != null) {
                i2 += C52418a.m58683j(2, str8);
            }
            String str9 = this.f182059e;
            if (str9 != null) {
                i2 += C52418a.m58683j(3, str9);
            }
            int e = i2 + C52418a.m58678e(4, this.f182060f) + C52418a.m58678e(5, this.f182061g);
            String str10 = this.f182062h;
            if (str10 != null) {
                e += C52418a.m58683j(6, str10);
            }
            String str11 = this.f182063i;
            if (str11 != null) {
                e += C52418a.m58683j(7, str11);
            }
            String str12 = this.f182064j;
            if (str12 != null) {
                e += C52418a.m58683j(8, str12);
            }
            String str13 = this.f182065n;
            if (str13 != null) {
                e += C52418a.m58683j(9, str13);
            }
            String str14 = this.f182066o;
            return str14 != null ? e + C52418a.m58683j(10, str14) : e;
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
            C64229ab0 ab02 = objArr[1];
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
                        ab02.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    ab02.f182058d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    ab02.f182059e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    ab02.f182060f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    ab02.f182061g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    ab02.f182062h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    ab02.f182063i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    ab02.f182064j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    ab02.f182065n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    ab02.f182066o = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
