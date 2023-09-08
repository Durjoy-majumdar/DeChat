package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.fq1 */
public class C64371fq1 extends C101820nt3 {

    /* renamed from: d */
    public String f183196d;

    /* renamed from: e */
    public String f183197e;

    /* renamed from: f */
    public String f183198f;

    /* renamed from: g */
    public String f183199g;

    /* renamed from: h */
    public String f183200h;

    /* renamed from: i */
    public String f183201i;

    /* renamed from: j */
    public int f183202j;

    /* renamed from: n */
    public int f183203n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64371fq1)) {
            return false;
        }
        C64371fq1 fq12 = (C64371fq1) aVar;
        return C46238a.m51546a(this.BaseRequest, fq12.BaseRequest) && C46238a.m51546a(this.f183196d, fq12.f183196d) && C46238a.m51546a(this.f183197e, fq12.f183197e) && C46238a.m51546a(this.f183198f, fq12.f183198f) && C46238a.m51546a(this.f183199g, fq12.f183199g) && C46238a.m51546a(this.f183200h, fq12.f183200h) && C46238a.m51546a(this.f183201i, fq12.f183201i) && C46238a.m51546a(Integer.valueOf(this.f183202j), Integer.valueOf(fq12.f183202j)) && C46238a.m51546a(Integer.valueOf(this.f183203n), Integer.valueOf(fq12.f183203n));
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
            String str = this.f183196d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f183197e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f183198f;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f183199g;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f183200h;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            String str6 = this.f183201i;
            if (str6 != null) {
                aVar.mo74323j(7, str6);
            }
            aVar.mo74318e(8, this.f183202j);
            aVar.mo74318e(9, this.f183203n);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str7 = this.f183196d;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            String str8 = this.f183197e;
            if (str8 != null) {
                i2 += C52418a.m58683j(3, str8);
            }
            String str9 = this.f183198f;
            if (str9 != null) {
                i2 += C52418a.m58683j(4, str9);
            }
            String str10 = this.f183199g;
            if (str10 != null) {
                i2 += C52418a.m58683j(5, str10);
            }
            String str11 = this.f183200h;
            if (str11 != null) {
                i2 += C52418a.m58683j(6, str11);
            }
            String str12 = this.f183201i;
            if (str12 != null) {
                i2 += C52418a.m58683j(7, str12);
            }
            return i2 + C52418a.m58678e(8, this.f183202j) + C52418a.m58678e(9, this.f183203n);
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
            C64371fq1 fq12 = objArr[1];
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
                        fq12.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    fq12.f183196d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    fq12.f183197e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    fq12.f183198f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    fq12.f183199g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    fq12.f183200h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    fq12.f183201i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    fq12.f183202j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    fq12.f183203n = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
