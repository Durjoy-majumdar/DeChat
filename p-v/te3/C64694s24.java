package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.s24 */
public class C64694s24 extends C101820nt3 {

    /* renamed from: d */
    public String f185315d;

    /* renamed from: e */
    public String f185316e;

    /* renamed from: f */
    public String f185317f;

    /* renamed from: g */
    public String f185318g;

    /* renamed from: h */
    public String f185319h;

    /* renamed from: i */
    public int f185320i;

    /* renamed from: j */
    public int f185321j;

    /* renamed from: n */
    public int f185322n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64694s24)) {
            return false;
        }
        C64694s24 s242 = (C64694s24) aVar;
        return C46238a.m51546a(this.BaseRequest, s242.BaseRequest) && C46238a.m51546a(this.f185315d, s242.f185315d) && C46238a.m51546a(this.f185316e, s242.f185316e) && C46238a.m51546a(this.f185317f, s242.f185317f) && C46238a.m51546a(this.f185318g, s242.f185318g) && C46238a.m51546a(this.f185319h, s242.f185319h) && C46238a.m51546a(Integer.valueOf(this.f185320i), Integer.valueOf(s242.f185320i)) && C46238a.m51546a(Integer.valueOf(this.f185321j), Integer.valueOf(s242.f185321j)) && C46238a.m51546a(Integer.valueOf(this.f185322n), Integer.valueOf(s242.f185322n));
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
            String str = this.f185315d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f185316e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f185317f;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f185318g;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f185319h;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            aVar.mo74318e(7, this.f185320i);
            aVar.mo74318e(8, this.f185321j);
            aVar.mo74318e(9, this.f185322n);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str6 = this.f185315d;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            String str7 = this.f185316e;
            if (str7 != null) {
                i2 += C52418a.m58683j(3, str7);
            }
            String str8 = this.f185317f;
            if (str8 != null) {
                i2 += C52418a.m58683j(4, str8);
            }
            String str9 = this.f185318g;
            if (str9 != null) {
                i2 += C52418a.m58683j(5, str9);
            }
            String str10 = this.f185319h;
            if (str10 != null) {
                i2 += C52418a.m58683j(6, str10);
            }
            return i2 + C52418a.m58678e(7, this.f185320i) + C52418a.m58678e(8, this.f185321j) + C52418a.m58678e(9, this.f185322n);
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
            C64694s24 s242 = objArr[1];
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
                        s242.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    s242.f185315d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    s242.f185316e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    s242.f185317f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    s242.f185318g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    s242.f185319h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    s242.f185320i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    s242.f185321j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    s242.f185322n = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
