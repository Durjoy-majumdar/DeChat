package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class nj4 extends C101820nt3 {

    /* renamed from: d */
    public String f227885d;

    /* renamed from: e */
    public String f227886e;

    /* renamed from: f */
    public String f227887f;

    /* renamed from: g */
    public int f227888g;

    /* renamed from: h */
    public String f227889h;

    /* renamed from: i */
    public int f227890i;

    /* renamed from: j */
    public String f227891j;

    /* renamed from: n */
    public String f227892n;

    /* renamed from: o */
    public String f227893o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof nj4)) {
            return false;
        }
        nj4 nj4 = (nj4) aVar;
        return C46238a.m51546a(this.BaseRequest, nj4.BaseRequest) && C46238a.m51546a(this.f227885d, nj4.f227885d) && C46238a.m51546a(this.f227886e, nj4.f227886e) && C46238a.m51546a(this.f227887f, nj4.f227887f) && C46238a.m51546a(Integer.valueOf(this.f227888g), Integer.valueOf(nj4.f227888g)) && C46238a.m51546a(this.f227889h, nj4.f227889h) && C46238a.m51546a(Integer.valueOf(this.f227890i), Integer.valueOf(nj4.f227890i)) && C46238a.m51546a(this.f227891j, nj4.f227891j) && C46238a.m51546a(this.f227892n, nj4.f227892n) && C46238a.m51546a(this.f227893o, nj4.f227893o);
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
            String str = this.f227885d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f227886e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f227887f;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            aVar.mo74318e(5, this.f227888g);
            String str4 = this.f227889h;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            aVar.mo74318e(7, this.f227890i);
            String str5 = this.f227891j;
            if (str5 != null) {
                aVar.mo74323j(8, str5);
            }
            String str6 = this.f227892n;
            if (str6 != null) {
                aVar.mo74323j(9, str6);
            }
            String str7 = this.f227893o;
            if (str7 != null) {
                aVar.mo74323j(10, str7);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str8 = this.f227885d;
            if (str8 != null) {
                i2 += C52418a.m58683j(2, str8);
            }
            String str9 = this.f227886e;
            if (str9 != null) {
                i2 += C52418a.m58683j(3, str9);
            }
            String str10 = this.f227887f;
            if (str10 != null) {
                i2 += C52418a.m58683j(4, str10);
            }
            int e = i2 + C52418a.m58678e(5, this.f227888g);
            String str11 = this.f227889h;
            if (str11 != null) {
                e += C52418a.m58683j(6, str11);
            }
            int e2 = e + C52418a.m58678e(7, this.f227890i);
            String str12 = this.f227891j;
            if (str12 != null) {
                e2 += C52418a.m58683j(8, str12);
            }
            String str13 = this.f227892n;
            if (str13 != null) {
                e2 += C52418a.m58683j(9, str13);
            }
            String str14 = this.f227893o;
            return str14 != null ? e2 + C52418a.m58683j(10, str14) : e2;
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
            nj4 nj4 = objArr[1];
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
                        nj4.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    nj4.f227885d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    nj4.f227886e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    nj4.f227887f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    nj4.f227888g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    nj4.f227889h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    nj4.f227890i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    nj4.f227891j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    nj4.f227892n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    nj4.f227893o = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
