package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.fg3 */
public class C77930fg3 extends C49335eu3 {

    /* renamed from: d */
    public String f227397d;

    /* renamed from: e */
    public String f227398e;

    /* renamed from: f */
    public int f227399f;

    /* renamed from: g */
    public String f227400g;

    /* renamed from: h */
    public String f227401h;

    /* renamed from: i */
    public String f227402i;

    /* renamed from: j */
    public boolean f227403j;

    /* renamed from: n */
    public String f227404n;

    /* renamed from: o */
    public String f227405o;

    /* renamed from: p */
    public String f227406p;

    /* renamed from: q */
    public String f227407q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77930fg3)) {
            return false;
        }
        C77930fg3 fg32 = (C77930fg3) aVar;
        return C46238a.m51546a(this.BaseResponse, fg32.BaseResponse) && C46238a.m51546a(this.f227397d, fg32.f227397d) && C46238a.m51546a(this.f227398e, fg32.f227398e) && C46238a.m51546a(Integer.valueOf(this.f227399f), Integer.valueOf(fg32.f227399f)) && C46238a.m51546a(this.f227400g, fg32.f227400g) && C46238a.m51546a(this.f227401h, fg32.f227401h) && C46238a.m51546a(this.f227402i, fg32.f227402i) && C46238a.m51546a(Boolean.valueOf(this.f227403j), Boolean.valueOf(fg32.f227403j)) && C46238a.m51546a(this.f227404n, fg32.f227404n) && C46238a.m51546a(this.f227405o, fg32.f227405o) && C46238a.m51546a(this.f227406p, fg32.f227406p) && C46238a.m51546a(this.f227407q, fg32.f227407q);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                aVar.mo74322i(1, jaVar.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            String str = this.f227397d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f227398e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74318e(4, this.f227399f);
            String str3 = this.f227400g;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            String str4 = this.f227401h;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            String str5 = this.f227402i;
            if (str5 != null) {
                aVar.mo74323j(7, str5);
            }
            aVar.mo74314a(8, this.f227403j);
            String str6 = this.f227404n;
            if (str6 != null) {
                aVar.mo74323j(9, str6);
            }
            String str7 = this.f227405o;
            if (str7 != null) {
                aVar.mo74323j(10, str7);
            }
            String str8 = this.f227406p;
            if (str8 != null) {
                aVar.mo74323j(11, str8);
            }
            String str9 = this.f227407q;
            if (str9 != null) {
                aVar.mo74323j(12, str9);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            String str10 = this.f227397d;
            if (str10 != null) {
                i2 += C52418a.m58683j(2, str10);
            }
            String str11 = this.f227398e;
            if (str11 != null) {
                i2 += C52418a.m58683j(3, str11);
            }
            int e = i2 + C52418a.m58678e(4, this.f227399f);
            String str12 = this.f227400g;
            if (str12 != null) {
                e += C52418a.m58683j(5, str12);
            }
            String str13 = this.f227401h;
            if (str13 != null) {
                e += C52418a.m58683j(6, str13);
            }
            String str14 = this.f227402i;
            if (str14 != null) {
                e += C52418a.m58683j(7, str14);
            }
            int a = e + C52418a.m58674a(8, this.f227403j);
            String str15 = this.f227404n;
            if (str15 != null) {
                a += C52418a.m58683j(9, str15);
            }
            String str16 = this.f227405o;
            if (str16 != null) {
                a += C52418a.m58683j(10, str16);
            }
            String str17 = this.f227406p;
            if (str17 != null) {
                a += C52418a.m58683j(11, str17);
            }
            String str18 = this.f227407q;
            return str18 != null ? a + C52418a.m58683j(12, str18) : a;
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
            C77930fg3 fg32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C49966ja jaVar3 = new C49966ja();
                        if (bArr != null && bArr.length > 0) {
                            jaVar3.parseFrom(bArr);
                        }
                        fg32.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    fg32.f227397d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    fg32.f227398e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    fg32.f227399f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    fg32.f227400g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    fg32.f227401h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    fg32.f227402i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    fg32.f227403j = aVar3.mo141625c(intValue);
                    return 0;
                case 9:
                    fg32.f227404n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    fg32.f227405o = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    fg32.f227406p = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    fg32.f227407q = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
