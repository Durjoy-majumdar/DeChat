package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class um4 extends C101820nt3 {

    /* renamed from: d */
    public String f142945d;

    /* renamed from: e */
    public int f142946e;

    /* renamed from: f */
    public int f142947f;

    /* renamed from: g */
    public int f142948g;

    /* renamed from: h */
    public C51018qv3 f142949h;

    /* renamed from: i */
    public String f142950i;

    /* renamed from: j */
    public int f142951j;

    /* renamed from: n */
    public LinkedList<C51712vn> f142952n = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof um4)) {
            return false;
        }
        um4 um4 = (um4) aVar;
        return C46238a.m51546a(this.BaseRequest, um4.BaseRequest) && C46238a.m51546a(this.f142945d, um4.f142945d) && C46238a.m51546a(Integer.valueOf(this.f142946e), Integer.valueOf(um4.f142946e)) && C46238a.m51546a(Integer.valueOf(this.f142947f), Integer.valueOf(um4.f142947f)) && C46238a.m51546a(Integer.valueOf(this.f142948g), Integer.valueOf(um4.f142948g)) && C46238a.m51546a(this.f142949h, um4.f142949h) && C46238a.m51546a(this.f142950i, um4.f142950i) && C46238a.m51546a(Integer.valueOf(this.f142951j), Integer.valueOf(um4.f142951j)) && C46238a.m51546a(this.f142952n, um4.f142952n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f142949h != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                String str = this.f142945d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                aVar.mo74318e(3, this.f142946e);
                aVar.mo74318e(4, this.f142947f);
                aVar.mo74318e(5, this.f142948g);
                C51018qv3 qv32 = this.f142949h;
                if (qv32 != null) {
                    aVar.mo74322i(6, qv32.computeSize());
                    this.f142949h.writeFields(aVar);
                }
                String str2 = this.f142950i;
                if (str2 != null) {
                    aVar.mo74323j(7, str2);
                }
                aVar.mo74318e(8, this.f142951j);
                aVar.mo74320g(9, 8, this.f142952n);
                return 0;
            }
            throw new C52419b("Not all required fields were included: Data");
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str3 = this.f142945d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            int e = i2 + C52418a.m58678e(3, this.f142946e) + C52418a.m58678e(4, this.f142947f) + C52418a.m58678e(5, this.f142948g);
            C51018qv3 qv33 = this.f142949h;
            if (qv33 != null) {
                e += C52418a.m58682i(6, qv33.computeSize());
            }
            String str4 = this.f142950i;
            if (str4 != null) {
                e += C52418a.m58683j(7, str4);
            }
            return e + C52418a.m58678e(8, this.f142951j) + C52418a.m58680g(9, 8, this.f142952n);
        } else if (i == 2) {
            this.f142952n.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f142949h != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: Data");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            um4 um4 = objArr[1];
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
                        um4.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    um4.f142945d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    um4.f142946e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    um4.f142947f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    um4.f142948g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51018qv3 qv34 = new C51018qv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            qv34.mo73348f(bArr2);
                        }
                        um4.f142949h = qv34;
                    }
                    return 0;
                case 7:
                    um4.f142950i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    um4.f142951j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C51712vn vnVar = new C51712vn();
                        if (bArr3 != null && bArr3.length > 0) {
                            vnVar.parseFrom(bArr3);
                        }
                        um4.f142952n.add(vnVar);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
