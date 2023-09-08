package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class p84 extends C101820nt3 {

    /* renamed from: d */
    public int f139640d;

    /* renamed from: e */
    public long f139641e;

    /* renamed from: f */
    public String f139642f;

    /* renamed from: g */
    public int f139643g;

    /* renamed from: h */
    public LinkedList<C51163rv3> f139644h = new LinkedList<>();

    /* renamed from: i */
    public int f139645i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof p84)) {
            return false;
        }
        p84 p84 = (p84) aVar;
        return C46238a.m51546a(this.BaseRequest, p84.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f139640d), Integer.valueOf(p84.f139640d)) && C46238a.m51546a(Long.valueOf(this.f139641e), Long.valueOf(p84.f139641e)) && C46238a.m51546a(this.f139642f, p84.f139642f) && C46238a.m51546a(Integer.valueOf(this.f139643g), Integer.valueOf(p84.f139643g)) && C46238a.m51546a(this.f139644h, p84.f139644h) && C46238a.m51546a(Integer.valueOf(this.f139645i), Integer.valueOf(p84.f139645i));
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
            aVar.mo74318e(2, this.f139640d);
            aVar.mo74321h(3, this.f139641e);
            String str = this.f139642f;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            aVar.mo74318e(5, this.f139643g);
            aVar.mo74320g(6, 8, this.f139644h);
            aVar.mo74318e(7, this.f139645i);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f139640d) + C52418a.m58681h(3, this.f139641e);
            String str2 = this.f139642f;
            if (str2 != null) {
                e += C52418a.m58683j(4, str2);
            }
            return e + C52418a.m58678e(5, this.f139643g) + C52418a.m58680g(6, 8, this.f139644h) + C52418a.m58678e(7, this.f139645i);
        } else if (i == 2) {
            this.f139644h.clear();
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
            p84 p84 = objArr[1];
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
                        p84.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    p84.f139640d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    p84.f139641e = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    p84.f139642f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    p84.f139643g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51163rv3 rv32 = new C51163rv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            rv32.mo73356d(bArr2);
                        }
                        p84.f139644h.add(rv32);
                    }
                    return 0;
                case 7:
                    p84.f139645i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
