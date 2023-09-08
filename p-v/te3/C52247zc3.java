package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.zc3 */
public class C52247zc3 extends C101820nt3 {

    /* renamed from: d */
    public String f145823d;

    /* renamed from: e */
    public String f145824e;

    /* renamed from: f */
    public String f145825f;

    /* renamed from: g */
    public String f145826g;

    /* renamed from: h */
    public String f145827h;

    /* renamed from: i */
    public String f145828i;

    /* renamed from: j */
    public String f145829j;

    /* renamed from: n */
    public String f145830n;

    /* renamed from: o */
    public int f145831o;

    /* renamed from: p */
    public String f145832p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52247zc3)) {
            return false;
        }
        C52247zc3 zc32 = (C52247zc3) aVar;
        return C46238a.m51546a(this.BaseRequest, zc32.BaseRequest) && C46238a.m51546a(this.f145823d, zc32.f145823d) && C46238a.m51546a(this.f145824e, zc32.f145824e) && C46238a.m51546a(this.f145825f, zc32.f145825f) && C46238a.m51546a(this.f145826g, zc32.f145826g) && C46238a.m51546a(this.f145827h, zc32.f145827h) && C46238a.m51546a(this.f145828i, zc32.f145828i) && C46238a.m51546a(this.f145829j, zc32.f145829j) && C46238a.m51546a(this.f145830n, zc32.f145830n) && C46238a.m51546a(Integer.valueOf(this.f145831o), Integer.valueOf(zc32.f145831o)) && C46238a.m51546a(this.f145832p, zc32.f145832p);
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
            String str = this.f145823d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f145824e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f145825f;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f145826g;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f145827h;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            String str6 = this.f145828i;
            if (str6 != null) {
                aVar.mo74323j(7, str6);
            }
            String str7 = this.f145829j;
            if (str7 != null) {
                aVar.mo74323j(8, str7);
            }
            String str8 = this.f145830n;
            if (str8 != null) {
                aVar.mo74323j(9, str8);
            }
            aVar.mo74318e(10, this.f145831o);
            String str9 = this.f145832p;
            if (str9 != null) {
                aVar.mo74323j(11, str9);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str10 = this.f145823d;
            if (str10 != null) {
                i2 += C52418a.m58683j(2, str10);
            }
            String str11 = this.f145824e;
            if (str11 != null) {
                i2 += C52418a.m58683j(3, str11);
            }
            String str12 = this.f145825f;
            if (str12 != null) {
                i2 += C52418a.m58683j(4, str12);
            }
            String str13 = this.f145826g;
            if (str13 != null) {
                i2 += C52418a.m58683j(5, str13);
            }
            String str14 = this.f145827h;
            if (str14 != null) {
                i2 += C52418a.m58683j(6, str14);
            }
            String str15 = this.f145828i;
            if (str15 != null) {
                i2 += C52418a.m58683j(7, str15);
            }
            String str16 = this.f145829j;
            if (str16 != null) {
                i2 += C52418a.m58683j(8, str16);
            }
            String str17 = this.f145830n;
            if (str17 != null) {
                i2 += C52418a.m58683j(9, str17);
            }
            int e = i2 + C52418a.m58678e(10, this.f145831o);
            String str18 = this.f145832p;
            return str18 != null ? e + C52418a.m58683j(11, str18) : e;
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
            C52247zc3 zc32 = objArr[1];
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
                        zc32.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    zc32.f145823d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    zc32.f145824e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    zc32.f145825f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    zc32.f145826g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    zc32.f145827h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    zc32.f145828i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    zc32.f145829j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    zc32.f145830n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    zc32.f145831o = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    zc32.f145832p = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
