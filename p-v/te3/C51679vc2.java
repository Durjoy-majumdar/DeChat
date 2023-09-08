package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.vc2 */
public class C51679vc2 extends C101820nt3 {

    /* renamed from: d */
    public C51018qv3 f143427d;

    /* renamed from: e */
    public String f143428e;

    /* renamed from: f */
    public int f143429f;

    /* renamed from: g */
    public String f143430g;

    /* renamed from: h */
    public C51018qv3 f143431h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51679vc2)) {
            return false;
        }
        C51679vc2 vc22 = (C51679vc2) aVar;
        return C46238a.m51546a(this.BaseRequest, vc22.BaseRequest) && C46238a.m51546a(this.f143427d, vc22.f143427d) && C46238a.m51546a(this.f143428e, vc22.f143428e) && C46238a.m51546a(Integer.valueOf(this.f143429f), Integer.valueOf(vc22.f143429f)) && C46238a.m51546a(this.f143430g, vc22.f143430g) && C46238a.m51546a(this.f143431h, vc22.f143431h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f143427d != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                C51018qv3 qv32 = this.f143427d;
                if (qv32 != null) {
                    aVar.mo74322i(2, qv32.computeSize());
                    this.f143427d.writeFields(aVar);
                }
                String str = this.f143428e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                aVar.mo74318e(4, this.f143429f);
                String str2 = this.f143430g;
                if (str2 != null) {
                    aVar.mo74323j(5, str2);
                }
                C51018qv3 qv33 = this.f143431h;
                if (qv33 != null) {
                    aVar.mo74322i(6, qv33.computeSize());
                    this.f143431h.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: A2Key");
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C51018qv3 qv34 = this.f143427d;
            if (qv34 != null) {
                i2 += C52418a.m58682i(2, qv34.computeSize());
            }
            String str3 = this.f143428e;
            if (str3 != null) {
                i2 += C52418a.m58683j(3, str3);
            }
            int e = i2 + C52418a.m58678e(4, this.f143429f);
            String str4 = this.f143430g;
            if (str4 != null) {
                e += C52418a.m58683j(5, str4);
            }
            C51018qv3 qv35 = this.f143431h;
            return qv35 != null ? e + C52418a.m58682i(6, qv35.computeSize()) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f143427d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: A2Key");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C51679vc2 vc22 = objArr[1];
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
                        vc22.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51018qv3 qv36 = new C51018qv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            qv36.mo73348f(bArr2);
                        }
                        vc22.f143427d = qv36;
                    }
                    return 0;
                case 3:
                    vc22.f143428e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    vc22.f143429f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    vc22.f143430g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C51018qv3 qv37 = new C51018qv3();
                        if (bArr3 != null && bArr3.length > 0) {
                            qv37.mo73348f(bArr3);
                        }
                        vc22.f143431h = qv37;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
