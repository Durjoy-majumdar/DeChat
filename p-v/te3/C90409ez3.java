package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ez3 */
public class C90409ez3 extends C101820nt3 {

    /* renamed from: d */
    public String f259501d;

    /* renamed from: e */
    public String f259502e;

    /* renamed from: f */
    public String f259503f;

    /* renamed from: g */
    public String f259504g;

    /* renamed from: h */
    public int f259505h;

    /* renamed from: i */
    public int f259506i;

    /* renamed from: j */
    public String f259507j;

    /* renamed from: n */
    public int f259508n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C90409ez3)) {
            return false;
        }
        C90409ez3 ez32 = (C90409ez3) aVar;
        return C46238a.m51546a(this.BaseRequest, ez32.BaseRequest) && C46238a.m51546a(this.f259501d, ez32.f259501d) && C46238a.m51546a(this.f259502e, ez32.f259502e) && C46238a.m51546a(this.f259503f, ez32.f259503f) && C46238a.m51546a(this.f259504g, ez32.f259504g) && C46238a.m51546a(Integer.valueOf(this.f259505h), Integer.valueOf(ez32.f259505h)) && C46238a.m51546a(Integer.valueOf(this.f259506i), Integer.valueOf(ez32.f259506i)) && C46238a.m51546a(this.f259507j, ez32.f259507j) && C46238a.m51546a(Integer.valueOf(this.f259508n), Integer.valueOf(ez32.f259508n));
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
            String str = this.f259501d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f259502e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f259503f;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f259504g;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            aVar.mo74318e(6, this.f259505h);
            aVar.mo74318e(7, this.f259506i);
            String str5 = this.f259507j;
            if (str5 != null) {
                aVar.mo74323j(8, str5);
            }
            aVar.mo74318e(9, this.f259508n);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str6 = this.f259501d;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            String str7 = this.f259502e;
            if (str7 != null) {
                i2 += C52418a.m58683j(3, str7);
            }
            String str8 = this.f259503f;
            if (str8 != null) {
                i2 += C52418a.m58683j(4, str8);
            }
            String str9 = this.f259504g;
            if (str9 != null) {
                i2 += C52418a.m58683j(5, str9);
            }
            int e = i2 + C52418a.m58678e(6, this.f259505h) + C52418a.m58678e(7, this.f259506i);
            String str10 = this.f259507j;
            if (str10 != null) {
                e += C52418a.m58683j(8, str10);
            }
            return e + C52418a.m58678e(9, this.f259508n);
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
            C90409ez3 ez32 = objArr[1];
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
                        ez32.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    ez32.f259501d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    ez32.f259502e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    ez32.f259503f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    ez32.f259504g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    ez32.f259505h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    ez32.f259506i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    ez32.f259507j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    ez32.f259508n = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
