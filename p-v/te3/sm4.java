package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class sm4 extends C101820nt3 {

    /* renamed from: d */
    public String f299433d;

    /* renamed from: e */
    public int f299434e;

    /* renamed from: f */
    public String f299435f;

    /* renamed from: g */
    public String f299436g;

    /* renamed from: h */
    public int f299437h;

    /* renamed from: i */
    public int f299438i;

    /* renamed from: j */
    public int f299439j;

    /* renamed from: n */
    public C51018qv3 f299440n;

    /* renamed from: o */
    public int f299441o;

    /* renamed from: p */
    public String f299442p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof sm4)) {
            return false;
        }
        sm4 sm4 = (sm4) aVar;
        return C46238a.m51546a(this.BaseRequest, sm4.BaseRequest) && C46238a.m51546a(this.f299433d, sm4.f299433d) && C46238a.m51546a(Integer.valueOf(this.f299434e), Integer.valueOf(sm4.f299434e)) && C46238a.m51546a(this.f299435f, sm4.f299435f) && C46238a.m51546a(this.f299436g, sm4.f299436g) && C46238a.m51546a(Integer.valueOf(this.f299437h), Integer.valueOf(sm4.f299437h)) && C46238a.m51546a(Integer.valueOf(this.f299438i), Integer.valueOf(sm4.f299438i)) && C46238a.m51546a(Integer.valueOf(this.f299439j), Integer.valueOf(sm4.f299439j)) && C46238a.m51546a(this.f299440n, sm4.f299440n) && C46238a.m51546a(Integer.valueOf(this.f299441o), Integer.valueOf(sm4.f299441o)) && C46238a.m51546a(this.f299442p, sm4.f299442p);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f299440n != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                String str = this.f299433d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                aVar.mo74318e(3, this.f299434e);
                String str2 = this.f299435f;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                String str3 = this.f299436g;
                if (str3 != null) {
                    aVar.mo74323j(5, str3);
                }
                aVar.mo74318e(6, this.f299437h);
                aVar.mo74318e(7, this.f299438i);
                aVar.mo74318e(8, this.f299439j);
                C51018qv3 qv32 = this.f299440n;
                if (qv32 != null) {
                    aVar.mo74322i(9, qv32.computeSize());
                    this.f299440n.writeFields(aVar);
                }
                aVar.mo74318e(10, this.f299441o);
                String str4 = this.f299442p;
                if (str4 != null) {
                    aVar.mo74323j(11, str4);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: Data");
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str5 = this.f299433d;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            int e = i2 + C52418a.m58678e(3, this.f299434e);
            String str6 = this.f299435f;
            if (str6 != null) {
                e += C52418a.m58683j(4, str6);
            }
            String str7 = this.f299436g;
            if (str7 != null) {
                e += C52418a.m58683j(5, str7);
            }
            int e2 = e + C52418a.m58678e(6, this.f299437h) + C52418a.m58678e(7, this.f299438i) + C52418a.m58678e(8, this.f299439j);
            C51018qv3 qv33 = this.f299440n;
            if (qv33 != null) {
                e2 += C52418a.m58682i(9, qv33.computeSize());
            }
            int e3 = e2 + C52418a.m58678e(10, this.f299441o);
            String str8 = this.f299442p;
            return str8 != null ? e3 + C52418a.m58683j(11, str8) : e3;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f299440n != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: Data");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            sm4 sm4 = objArr[1];
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
                        sm4.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    sm4.f299433d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    sm4.f299434e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    sm4.f299435f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    sm4.f299436g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    sm4.f299437h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    sm4.f299438i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    sm4.f299439j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51018qv3 qv34 = new C51018qv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            qv34.mo73348f(bArr2);
                        }
                        sm4.f299440n = qv34;
                    }
                    return 0;
                case 10:
                    sm4.f299441o = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    sm4.f299442p = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
