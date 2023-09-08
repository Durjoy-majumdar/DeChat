package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ch3 */
public class C64286ch3 extends C101820nt3 {

    /* renamed from: d */
    public String f182481d;

    /* renamed from: e */
    public String f182482e;

    /* renamed from: f */
    public String f182483f;

    /* renamed from: g */
    public int f182484g;

    /* renamed from: h */
    public String f182485h;

    /* renamed from: i */
    public int f182486i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64286ch3)) {
            return false;
        }
        C64286ch3 ch32 = (C64286ch3) aVar;
        return C46238a.m51546a(this.BaseRequest, ch32.BaseRequest) && C46238a.m51546a(this.f182481d, ch32.f182481d) && C46238a.m51546a(this.f182482e, ch32.f182482e) && C46238a.m51546a(this.f182483f, ch32.f182483f) && C46238a.m51546a(Integer.valueOf(this.f182484g), Integer.valueOf(ch32.f182484g)) && C46238a.m51546a(this.f182485h, ch32.f182485h) && C46238a.m51546a(Integer.valueOf(this.f182486i), Integer.valueOf(ch32.f182486i));
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
            String str = this.f182481d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f182482e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f182483f;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            aVar.mo74318e(5, this.f182484g);
            String str4 = this.f182485h;
            if (str4 != null) {
                aVar.mo74323j(7, str4);
            }
            aVar.mo74318e(8, this.f182486i);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str5 = this.f182481d;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f182482e;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            String str7 = this.f182483f;
            if (str7 != null) {
                i2 += C52418a.m58683j(4, str7);
            }
            int e = i2 + C52418a.m58678e(5, this.f182484g);
            String str8 = this.f182485h;
            if (str8 != null) {
                e += C52418a.m58683j(7, str8);
            }
            return e + C52418a.m58678e(8, this.f182486i);
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
            C64286ch3 ch32 = objArr[1];
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
                        ch32.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    ch32.f182481d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    ch32.f182482e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    ch32.f182483f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    ch32.f182484g = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    ch32.f182485h = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    ch32.f182486i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
