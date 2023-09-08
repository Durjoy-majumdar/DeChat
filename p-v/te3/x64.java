package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class x64 extends C101820nt3 {

    /* renamed from: d */
    public n64 f144490d;

    /* renamed from: e */
    public String f144491e;

    /* renamed from: f */
    public C51163rv3 f144492f;

    /* renamed from: g */
    public String f144493g;

    /* renamed from: h */
    public d74 f144494h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof x64)) {
            return false;
        }
        x64 x64 = (x64) aVar;
        return C46238a.m51546a(this.BaseRequest, x64.BaseRequest) && C46238a.m51546a(this.f144490d, x64.f144490d) && C46238a.m51546a(this.f144491e, x64.f144491e) && C46238a.m51546a(this.f144492f, x64.f144492f) && C46238a.m51546a(this.f144493g, x64.f144493g) && C46238a.m51546a(this.f144494h, x64.f144494h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f144490d != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                n64 n64 = this.f144490d;
                if (n64 != null) {
                    aVar.mo74322i(2, n64.computeSize());
                    this.f144490d.writeFields(aVar);
                }
                String str = this.f144491e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                C51163rv3 rv32 = this.f144492f;
                if (rv32 != null) {
                    aVar.mo74322i(4, rv32.computeSize());
                    this.f144492f.writeFields(aVar);
                }
                String str2 = this.f144493g;
                if (str2 != null) {
                    aVar.mo74323j(5, str2);
                }
                d74 d74 = this.f144494h;
                if (d74 != null) {
                    aVar.mo74322i(6, d74.computeSize());
                    this.f144494h.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: Action");
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            n64 n642 = this.f144490d;
            if (n642 != null) {
                i2 += C52418a.m58682i(2, n642.computeSize());
            }
            String str3 = this.f144491e;
            if (str3 != null) {
                i2 += C52418a.m58683j(3, str3);
            }
            C51163rv3 rv33 = this.f144492f;
            if (rv33 != null) {
                i2 += C52418a.m58682i(4, rv33.computeSize());
            }
            String str4 = this.f144493g;
            if (str4 != null) {
                i2 += C52418a.m58683j(5, str4);
            }
            d74 d742 = this.f144494h;
            return d742 != null ? i2 + C52418a.m58682i(6, d742.computeSize()) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f144490d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: Action");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            x64 x64 = objArr[1];
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
                        x64.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        n64 n643 = new n64();
                        if (bArr2 != null && bArr2.length > 0) {
                            n643.parseFrom(bArr2);
                        }
                        x64.f144490d = n643;
                    }
                    return 0;
                case 3:
                    x64.f144491e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C51163rv3 rv34 = new C51163rv3();
                        if (bArr3 != null && bArr3.length > 0) {
                            rv34.mo73356d(bArr3);
                        }
                        x64.f144492f = rv34;
                    }
                    return 0;
                case 5:
                    x64.f144493g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        d74 d743 = new d74();
                        if (bArr4 != null && bArr4.length > 0) {
                            d743.parseFrom(bArr4);
                        }
                        x64.f144494h = d743;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
