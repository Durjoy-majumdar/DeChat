package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.x62 */
public class C64823x62 extends C101820nt3 {

    /* renamed from: d */
    public String f186273d;

    /* renamed from: e */
    public String f186274e;

    /* renamed from: f */
    public String f186275f;

    /* renamed from: g */
    public String f186276g;

    /* renamed from: h */
    public String f186277h;

    /* renamed from: i */
    public String f186278i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64823x62)) {
            return false;
        }
        C64823x62 x622 = (C64823x62) aVar;
        return C46238a.m51546a(this.BaseRequest, x622.BaseRequest) && C46238a.m51546a(this.f186273d, x622.f186273d) && C46238a.m51546a(this.f186274e, x622.f186274e) && C46238a.m51546a(this.f186275f, x622.f186275f) && C46238a.m51546a(this.f186276g, x622.f186276g) && C46238a.m51546a(this.f186277h, x622.f186277h) && C46238a.m51546a(this.f186278i, x622.f186278i);
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
            String str = this.f186273d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f186274e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f186275f;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f186276g;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f186277h;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            String str6 = this.f186278i;
            if (str6 != null) {
                aVar.mo74323j(7, str6);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str7 = this.f186273d;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            String str8 = this.f186274e;
            if (str8 != null) {
                i2 += C52418a.m58683j(3, str8);
            }
            String str9 = this.f186275f;
            if (str9 != null) {
                i2 += C52418a.m58683j(4, str9);
            }
            String str10 = this.f186276g;
            if (str10 != null) {
                i2 += C52418a.m58683j(5, str10);
            }
            String str11 = this.f186277h;
            if (str11 != null) {
                i2 += C52418a.m58683j(6, str11);
            }
            String str12 = this.f186278i;
            return str12 != null ? i2 + C52418a.m58683j(7, str12) : i2;
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
            C64823x62 x622 = objArr[1];
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
                        x622.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    x622.f186273d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    x622.f186274e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    x622.f186275f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    x622.f186276g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    x622.f186277h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    x622.f186278i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
