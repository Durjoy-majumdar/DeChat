package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.uk3 */
public class C64752uk3 extends C101820nt3 {

    /* renamed from: d */
    public String f185751d;

    /* renamed from: e */
    public String f185752e;

    /* renamed from: f */
    public int f185753f;

    /* renamed from: g */
    public int f185754g;

    /* renamed from: h */
    public String f185755h;

    /* renamed from: i */
    public int f185756i;

    /* renamed from: j */
    public int f185757j;

    /* renamed from: n */
    public String f185758n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64752uk3)) {
            return false;
        }
        C64752uk3 uk32 = (C64752uk3) aVar;
        return C46238a.m51546a(this.BaseRequest, uk32.BaseRequest) && C46238a.m51546a(this.f185751d, uk32.f185751d) && C46238a.m51546a(this.f185752e, uk32.f185752e) && C46238a.m51546a(Integer.valueOf(this.f185753f), Integer.valueOf(uk32.f185753f)) && C46238a.m51546a(Integer.valueOf(this.f185754g), Integer.valueOf(uk32.f185754g)) && C46238a.m51546a(this.f185755h, uk32.f185755h) && C46238a.m51546a(Integer.valueOf(this.f185756i), Integer.valueOf(uk32.f185756i)) && C46238a.m51546a(Integer.valueOf(this.f185757j), Integer.valueOf(uk32.f185757j)) && C46238a.m51546a(this.f185758n, uk32.f185758n);
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
            String str = this.f185751d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f185752e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74318e(4, this.f185753f);
            aVar.mo74318e(5, this.f185754g);
            String str3 = this.f185755h;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            aVar.mo74318e(7, this.f185756i);
            aVar.mo74318e(8, this.f185757j);
            String str4 = this.f185758n;
            if (str4 != null) {
                aVar.mo74323j(100, str4);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str5 = this.f185751d;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f185752e;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            int e = i2 + C52418a.m58678e(4, this.f185753f) + C52418a.m58678e(5, this.f185754g);
            String str7 = this.f185755h;
            if (str7 != null) {
                e += C52418a.m58683j(6, str7);
            }
            int e2 = e + C52418a.m58678e(7, this.f185756i) + C52418a.m58678e(8, this.f185757j);
            String str8 = this.f185758n;
            return str8 != null ? e2 + C52418a.m58683j(100, str8) : e2;
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
            C64752uk3 uk32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue != 100) {
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
                            uk32.BaseRequest = iaVar3;
                        }
                        return 0;
                    case 2:
                        uk32.f185751d = aVar3.mo141633k(intValue);
                        return 0;
                    case 3:
                        uk32.f185752e = aVar3.mo141633k(intValue);
                        return 0;
                    case 4:
                        uk32.f185753f = aVar3.mo141629g(intValue);
                        return 0;
                    case 5:
                        uk32.f185754g = aVar3.mo141629g(intValue);
                        return 0;
                    case 6:
                        uk32.f185755h = aVar3.mo141633k(intValue);
                        return 0;
                    case 7:
                        uk32.f185756i = aVar3.mo141629g(intValue);
                        return 0;
                    case 8:
                        uk32.f185757j = aVar3.mo141629g(intValue);
                        return 0;
                    default:
                        return -1;
                }
            } else {
                uk32.f185758n = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
