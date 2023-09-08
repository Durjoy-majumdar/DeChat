package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class dq4 extends C101820nt3 {

    /* renamed from: d */
    public C51018qv3 f182824d;

    /* renamed from: e */
    public String f182825e;

    /* renamed from: f */
    public int f182826f;

    /* renamed from: g */
    public int f182827g;

    /* renamed from: h */
    public String f182828h;

    /* renamed from: i */
    public String f182829i;

    /* renamed from: j */
    public String f182830j;

    /* renamed from: n */
    public int f182831n;

    /* renamed from: o */
    public String f182832o;

    /* renamed from: p */
    public int f182833p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof dq4)) {
            return false;
        }
        dq4 dq4 = (dq4) aVar;
        return C46238a.m51546a(this.BaseRequest, dq4.BaseRequest) && C46238a.m51546a(this.f182824d, dq4.f182824d) && C46238a.m51546a(this.f182825e, dq4.f182825e) && C46238a.m51546a(Integer.valueOf(this.f182826f), Integer.valueOf(dq4.f182826f)) && C46238a.m51546a(Integer.valueOf(this.f182827g), Integer.valueOf(dq4.f182827g)) && C46238a.m51546a(this.f182828h, dq4.f182828h) && C46238a.m51546a(this.f182829i, dq4.f182829i) && C46238a.m51546a(this.f182830j, dq4.f182830j) && C46238a.m51546a(Integer.valueOf(this.f182831n), Integer.valueOf(dq4.f182831n)) && C46238a.m51546a(this.f182832o, dq4.f182832o) && C46238a.m51546a(Integer.valueOf(this.f182833p), Integer.valueOf(dq4.f182833p));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f182824d != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                C51018qv3 qv32 = this.f182824d;
                if (qv32 != null) {
                    aVar.mo74322i(2, qv32.computeSize());
                    this.f182824d.writeFields(aVar);
                }
                String str = this.f182825e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                aVar.mo74318e(4, this.f182826f);
                aVar.mo74318e(5, this.f182827g);
                String str2 = this.f182828h;
                if (str2 != null) {
                    aVar.mo74323j(6, str2);
                }
                String str3 = this.f182829i;
                if (str3 != null) {
                    aVar.mo74323j(7, str3);
                }
                String str4 = this.f182830j;
                if (str4 != null) {
                    aVar.mo74323j(8, str4);
                }
                aVar.mo74318e(9, this.f182831n);
                String str5 = this.f182832o;
                if (str5 != null) {
                    aVar.mo74323j(10, str5);
                }
                aVar.mo74318e(11, this.f182833p);
                return 0;
            }
            throw new C52419b("Not all required fields were included: Receipt");
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C51018qv3 qv33 = this.f182824d;
            if (qv33 != null) {
                i2 += C52418a.m58682i(2, qv33.computeSize());
            }
            String str6 = this.f182825e;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            int e = i2 + C52418a.m58678e(4, this.f182826f) + C52418a.m58678e(5, this.f182827g);
            String str7 = this.f182828h;
            if (str7 != null) {
                e += C52418a.m58683j(6, str7);
            }
            String str8 = this.f182829i;
            if (str8 != null) {
                e += C52418a.m58683j(7, str8);
            }
            String str9 = this.f182830j;
            if (str9 != null) {
                e += C52418a.m58683j(8, str9);
            }
            int e2 = e + C52418a.m58678e(9, this.f182831n);
            String str10 = this.f182832o;
            if (str10 != null) {
                e2 += C52418a.m58683j(10, str10);
            }
            return e2 + C52418a.m58678e(11, this.f182833p);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f182824d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: Receipt");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            dq4 dq4 = objArr[1];
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
                        dq4.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51018qv3 qv34 = new C51018qv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            qv34.mo73348f(bArr2);
                        }
                        dq4.f182824d = qv34;
                    }
                    return 0;
                case 3:
                    dq4.f182825e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    dq4.f182826f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    dq4.f182827g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    dq4.f182828h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    dq4.f182829i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    dq4.f182830j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    dq4.f182831n = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    dq4.f182832o = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    dq4.f182833p = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
