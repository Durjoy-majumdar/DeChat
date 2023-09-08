package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.xj2 */
public class C51983xj2 extends C101820nt3 {

    /* renamed from: d */
    public String f144702d;

    /* renamed from: e */
    public String f144703e;

    /* renamed from: f */
    public String f144704f;

    /* renamed from: g */
    public String f144705g;

    /* renamed from: h */
    public String f144706h;

    /* renamed from: i */
    public String f144707i;

    /* renamed from: j */
    public String f144708j;

    /* renamed from: n */
    public C89349b f144709n;

    /* renamed from: o */
    public String f144710o;

    /* renamed from: p */
    public int f144711p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51983xj2)) {
            return false;
        }
        C51983xj2 xj22 = (C51983xj2) aVar;
        return C46238a.m51546a(this.BaseRequest, xj22.BaseRequest) && C46238a.m51546a(this.f144702d, xj22.f144702d) && C46238a.m51546a(this.f144703e, xj22.f144703e) && C46238a.m51546a(this.f144704f, xj22.f144704f) && C46238a.m51546a(this.f144705g, xj22.f144705g) && C46238a.m51546a(this.f144706h, xj22.f144706h) && C46238a.m51546a(this.f144707i, xj22.f144707i) && C46238a.m51546a(this.f144708j, xj22.f144708j) && C46238a.m51546a(this.f144709n, xj22.f144709n) && C46238a.m51546a(this.f144710o, xj22.f144710o) && C46238a.m51546a(Integer.valueOf(this.f144711p), Integer.valueOf(xj22.f144711p));
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
            String str = this.f144702d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f144703e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f144704f;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f144705g;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f144706h;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            String str6 = this.f144707i;
            if (str6 != null) {
                aVar.mo74323j(7, str6);
            }
            String str7 = this.f144708j;
            if (str7 != null) {
                aVar.mo74323j(8, str7);
            }
            C89349b bVar = this.f144709n;
            if (bVar != null) {
                aVar.mo74315b(9, bVar);
            }
            String str8 = this.f144710o;
            if (str8 != null) {
                aVar.mo74323j(10, str8);
            }
            aVar.mo74318e(12, this.f144711p);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str9 = this.f144702d;
            if (str9 != null) {
                i2 += C52418a.m58683j(2, str9);
            }
            String str10 = this.f144703e;
            if (str10 != null) {
                i2 += C52418a.m58683j(3, str10);
            }
            String str11 = this.f144704f;
            if (str11 != null) {
                i2 += C52418a.m58683j(4, str11);
            }
            String str12 = this.f144705g;
            if (str12 != null) {
                i2 += C52418a.m58683j(5, str12);
            }
            String str13 = this.f144706h;
            if (str13 != null) {
                i2 += C52418a.m58683j(6, str13);
            }
            String str14 = this.f144707i;
            if (str14 != null) {
                i2 += C52418a.m58683j(7, str14);
            }
            String str15 = this.f144708j;
            if (str15 != null) {
                i2 += C52418a.m58683j(8, str15);
            }
            C89349b bVar2 = this.f144709n;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(9, bVar2);
            }
            String str16 = this.f144710o;
            if (str16 != null) {
                i2 += C52418a.m58683j(10, str16);
            }
            return i2 + C52418a.m58678e(12, this.f144711p);
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
            C51983xj2 xj22 = objArr[1];
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
                        xj22.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    xj22.f144702d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    xj22.f144703e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    xj22.f144704f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    xj22.f144705g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    xj22.f144706h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    xj22.f144707i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    xj22.f144708j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    xj22.f144709n = aVar3.mo141626d(intValue);
                    return 0;
                case 10:
                    xj22.f144710o = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    xj22.f144711p = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
