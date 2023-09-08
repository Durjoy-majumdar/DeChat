package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class uq4 extends C101820nt3 {

    /* renamed from: d */
    public nt4 f185786d;

    /* renamed from: e */
    public int f185787e;

    /* renamed from: f */
    public int f185788f;

    /* renamed from: g */
    public String f185789g;

    /* renamed from: h */
    public C51018qv3 f185790h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof uq4)) {
            return false;
        }
        uq4 uq4 = (uq4) aVar;
        return C46238a.m51546a(this.BaseRequest, uq4.BaseRequest) && C46238a.m51546a(this.f185786d, uq4.f185786d) && C46238a.m51546a(Integer.valueOf(this.f185787e), Integer.valueOf(uq4.f185787e)) && C46238a.m51546a(Integer.valueOf(this.f185788f), Integer.valueOf(uq4.f185788f)) && C46238a.m51546a(this.f185789g, uq4.f185789g) && C46238a.m51546a(this.f185790h, uq4.f185790h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f185786d == null) {
                throw new C52419b("Not all required fields were included: Piece");
            } else if (this.f185790h != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                nt4 nt4 = this.f185786d;
                if (nt4 != null) {
                    aVar.mo74322i(2, nt4.computeSize());
                    this.f185786d.writeFields(aVar);
                }
                aVar.mo74318e(3, this.f185787e);
                aVar.mo74318e(4, this.f185788f);
                String str = this.f185789g;
                if (str != null) {
                    aVar.mo74323j(5, str);
                }
                C51018qv3 qv32 = this.f185790h;
                if (qv32 != null) {
                    aVar.mo74322i(6, qv32.computeSize());
                    this.f185790h.writeFields(aVar);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: RandomEncryKey");
            }
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            nt4 nt42 = this.f185786d;
            if (nt42 != null) {
                i2 += C52418a.m58682i(2, nt42.computeSize());
            }
            int e = i2 + C52418a.m58678e(3, this.f185787e) + C52418a.m58678e(4, this.f185788f);
            String str2 = this.f185789g;
            if (str2 != null) {
                e += C52418a.m58683j(5, str2);
            }
            C51018qv3 qv33 = this.f185790h;
            return qv33 != null ? e + C52418a.m58682i(6, qv33.computeSize()) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f185786d == null) {
                throw new C52419b("Not all required fields were included: Piece");
            } else if (this.f185790h != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: RandomEncryKey");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            uq4 uq4 = objArr[1];
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
                        uq4.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        nt4 nt43 = new nt4();
                        if (bArr2 != null && bArr2.length > 0) {
                            nt43.parseFrom(bArr2);
                        }
                        uq4.f185786d = nt43;
                    }
                    return 0;
                case 3:
                    uq4.f185787e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    uq4.f185788f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    uq4.f185789g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C51018qv3 qv34 = new C51018qv3();
                        if (bArr3 != null && bArr3.length > 0) {
                            qv34.mo73348f(bArr3);
                        }
                        uq4.f185790h = qv34;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
