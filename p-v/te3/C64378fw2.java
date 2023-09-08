package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.fw2 */
public class C64378fw2 extends C47465a {

    /* renamed from: d */
    public String f183241d;

    /* renamed from: e */
    public String f183242e;

    /* renamed from: f */
    public String f183243f;

    /* renamed from: g */
    public String f183244g;

    /* renamed from: h */
    public String f183245h;

    /* renamed from: i */
    public int f183246i;

    /* renamed from: j */
    public LinkedList<C64350ew2> f183247j = new LinkedList<>();

    /* renamed from: n */
    public String f183248n;

    /* renamed from: o */
    public String f183249o;

    /* renamed from: p */
    public String f183250p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64378fw2)) {
            return false;
        }
        C64378fw2 fw22 = (C64378fw2) aVar;
        return C46238a.m51546a(this.f183241d, fw22.f183241d) && C46238a.m51546a(this.f183242e, fw22.f183242e) && C46238a.m51546a(this.f183243f, fw22.f183243f) && C46238a.m51546a(this.f183244g, fw22.f183244g) && C46238a.m51546a(this.f183245h, fw22.f183245h) && C46238a.m51546a(Integer.valueOf(this.f183246i), Integer.valueOf(fw22.f183246i)) && C46238a.m51546a(this.f183247j, fw22.f183247j) && C46238a.m51546a(this.f183248n, fw22.f183248n) && C46238a.m51546a(this.f183249o, fw22.f183249o) && C46238a.m51546a(this.f183250p, fw22.f183250p);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f183241d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f183242e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f183243f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f183244g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f183245h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            aVar.mo74318e(6, this.f183246i);
            aVar.mo74320g(7, 8, this.f183247j);
            String str6 = this.f183248n;
            if (str6 != null) {
                aVar.mo74323j(8, str6);
            }
            String str7 = this.f183249o;
            if (str7 != null) {
                aVar.mo74323j(9, str7);
            }
            String str8 = this.f183250p;
            if (str8 != null) {
                aVar.mo74323j(10, str8);
            }
            return 0;
        } else if (i == 1) {
            String str9 = this.f183241d;
            if (str9 != null) {
                i2 = 0 + C52418a.m58683j(1, str9);
            }
            String str10 = this.f183242e;
            if (str10 != null) {
                i2 += C52418a.m58683j(2, str10);
            }
            String str11 = this.f183243f;
            if (str11 != null) {
                i2 += C52418a.m58683j(3, str11);
            }
            String str12 = this.f183244g;
            if (str12 != null) {
                i2 += C52418a.m58683j(4, str12);
            }
            String str13 = this.f183245h;
            if (str13 != null) {
                i2 += C52418a.m58683j(5, str13);
            }
            int e = i2 + C52418a.m58678e(6, this.f183246i) + C52418a.m58680g(7, 8, this.f183247j);
            String str14 = this.f183248n;
            if (str14 != null) {
                e += C52418a.m58683j(8, str14);
            }
            String str15 = this.f183249o;
            if (str15 != null) {
                e += C52418a.m58683j(9, str15);
            }
            String str16 = this.f183250p;
            return str16 != null ? e + C52418a.m58683j(10, str16) : e;
        } else if (i == 2) {
            this.f183247j.clear();
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
            C64378fw2 fw22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    fw22.f183241d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    fw22.f183242e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    fw22.f183243f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    fw22.f183244g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    fw22.f183245h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    fw22.f183246i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C64350ew2 ew22 = new C64350ew2();
                        if (bArr != null && bArr.length > 0) {
                            ew22.parseFrom(bArr);
                        }
                        fw22.f183247j.add(ew22);
                    }
                    return 0;
                case 8:
                    fw22.f183248n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    fw22.f183249o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    fw22.f183250p = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
