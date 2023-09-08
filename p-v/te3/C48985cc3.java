package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.cc3 */
public class C48985cc3 extends C101820nt3 {

    /* renamed from: d */
    public String f131645d;

    /* renamed from: e */
    public String f131646e;

    /* renamed from: f */
    public String f131647f;

    /* renamed from: g */
    public String f131648g;

    /* renamed from: h */
    public String f131649h;

    /* renamed from: i */
    public String f131650i;

    /* renamed from: j */
    public String f131651j;

    /* renamed from: n */
    public String f131652n;

    /* renamed from: o */
    public int f131653o;

    /* renamed from: p */
    public String f131654p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48985cc3)) {
            return false;
        }
        C48985cc3 cc32 = (C48985cc3) aVar;
        return C46238a.m51546a(this.BaseRequest, cc32.BaseRequest) && C46238a.m51546a(this.f131645d, cc32.f131645d) && C46238a.m51546a(this.f131646e, cc32.f131646e) && C46238a.m51546a(this.f131647f, cc32.f131647f) && C46238a.m51546a(this.f131648g, cc32.f131648g) && C46238a.m51546a(this.f131649h, cc32.f131649h) && C46238a.m51546a(this.f131650i, cc32.f131650i) && C46238a.m51546a(this.f131651j, cc32.f131651j) && C46238a.m51546a(this.f131652n, cc32.f131652n) && C46238a.m51546a(Integer.valueOf(this.f131653o), Integer.valueOf(cc32.f131653o)) && C46238a.m51546a(this.f131654p, cc32.f131654p);
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
            String str = this.f131645d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f131646e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f131647f;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f131648g;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f131649h;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            String str6 = this.f131650i;
            if (str6 != null) {
                aVar.mo74323j(7, str6);
            }
            String str7 = this.f131651j;
            if (str7 != null) {
                aVar.mo74323j(8, str7);
            }
            String str8 = this.f131652n;
            if (str8 != null) {
                aVar.mo74323j(9, str8);
            }
            aVar.mo74318e(10, this.f131653o);
            String str9 = this.f131654p;
            if (str9 != null) {
                aVar.mo74323j(11, str9);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str10 = this.f131645d;
            if (str10 != null) {
                i2 += C52418a.m58683j(2, str10);
            }
            String str11 = this.f131646e;
            if (str11 != null) {
                i2 += C52418a.m58683j(3, str11);
            }
            String str12 = this.f131647f;
            if (str12 != null) {
                i2 += C52418a.m58683j(4, str12);
            }
            String str13 = this.f131648g;
            if (str13 != null) {
                i2 += C52418a.m58683j(5, str13);
            }
            String str14 = this.f131649h;
            if (str14 != null) {
                i2 += C52418a.m58683j(6, str14);
            }
            String str15 = this.f131650i;
            if (str15 != null) {
                i2 += C52418a.m58683j(7, str15);
            }
            String str16 = this.f131651j;
            if (str16 != null) {
                i2 += C52418a.m58683j(8, str16);
            }
            String str17 = this.f131652n;
            if (str17 != null) {
                i2 += C52418a.m58683j(9, str17);
            }
            int e = i2 + C52418a.m58678e(10, this.f131653o);
            String str18 = this.f131654p;
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
            C48985cc3 cc32 = objArr[1];
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
                        cc32.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    cc32.f131645d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    cc32.f131646e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    cc32.f131647f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    cc32.f131648g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    cc32.f131649h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    cc32.f131650i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    cc32.f131651j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    cc32.f131652n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    cc32.f131653o = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    cc32.f131654p = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
