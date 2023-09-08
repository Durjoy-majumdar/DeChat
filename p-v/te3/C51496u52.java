package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.u52 */
public class C51496u52 extends C101820nt3 {

    /* renamed from: d */
    public String f142600d;

    /* renamed from: e */
    public int f142601e;

    /* renamed from: f */
    public LinkedList<C51163rv3> f142602f = new LinkedList<>();

    /* renamed from: g */
    public String f142603g;

    /* renamed from: h */
    public int f142604h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51496u52)) {
            return false;
        }
        C51496u52 u522 = (C51496u52) aVar;
        return C46238a.m51546a(this.BaseRequest, u522.BaseRequest) && C46238a.m51546a(this.f142600d, u522.f142600d) && C46238a.m51546a(Integer.valueOf(this.f142601e), Integer.valueOf(u522.f142601e)) && C46238a.m51546a(this.f142602f, u522.f142602f) && C46238a.m51546a(this.f142603g, u522.f142603g) && C46238a.m51546a(Integer.valueOf(this.f142604h), Integer.valueOf(u522.f142604h));
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
            String str = this.f142600d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f142601e);
            aVar.mo74320g(4, 8, this.f142602f);
            String str2 = this.f142603g;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            aVar.mo74318e(6, this.f142604h);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str3 = this.f142600d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            int e = i2 + C52418a.m58678e(3, this.f142601e) + C52418a.m58680g(4, 8, this.f142602f);
            String str4 = this.f142603g;
            if (str4 != null) {
                e += C52418a.m58683j(5, str4);
            }
            return e + C52418a.m58678e(6, this.f142604h);
        } else if (i == 2) {
            this.f142602f.clear();
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
            C51496u52 u522 = objArr[1];
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
                        u522.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    u522.f142600d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    u522.f142601e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51163rv3 rv32 = new C51163rv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            rv32.mo73356d(bArr2);
                        }
                        u522.f142602f.add(rv32);
                    }
                    return 0;
                case 5:
                    u522.f142603g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    u522.f142604h = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
