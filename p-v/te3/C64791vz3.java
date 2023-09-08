package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.vz3 */
public class C64791vz3 extends C101820nt3 {

    /* renamed from: d */
    public String f186025d;

    /* renamed from: e */
    public String f186026e;

    /* renamed from: f */
    public int f186027f;

    /* renamed from: g */
    public C64762uz3 f186028g;

    /* renamed from: h */
    public String f186029h;

    /* renamed from: i */
    public int f186030i;

    /* renamed from: j */
    public String f186031j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64791vz3)) {
            return false;
        }
        C64791vz3 vz32 = (C64791vz3) aVar;
        return C46238a.m51546a(this.BaseRequest, vz32.BaseRequest) && C46238a.m51546a(this.f186025d, vz32.f186025d) && C46238a.m51546a(this.f186026e, vz32.f186026e) && C46238a.m51546a(Integer.valueOf(this.f186027f), Integer.valueOf(vz32.f186027f)) && C46238a.m51546a(this.f186028g, vz32.f186028g) && C46238a.m51546a(this.f186029h, vz32.f186029h) && C46238a.m51546a(Integer.valueOf(this.f186030i), Integer.valueOf(vz32.f186030i)) && C46238a.m51546a(this.f186031j, vz32.f186031j);
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
            String str = this.f186025d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f186026e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74318e(4, this.f186027f);
            C64762uz3 uz32 = this.f186028g;
            if (uz32 != null) {
                aVar.mo74322i(5, uz32.computeSize());
                this.f186028g.writeFields(aVar);
            }
            String str3 = this.f186029h;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            aVar.mo74318e(7, this.f186030i);
            String str4 = this.f186031j;
            if (str4 != null) {
                aVar.mo74323j(8, str4);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str5 = this.f186025d;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f186026e;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            int e = i2 + C52418a.m58678e(4, this.f186027f);
            C64762uz3 uz33 = this.f186028g;
            if (uz33 != null) {
                e += C52418a.m58682i(5, uz33.computeSize());
            }
            String str7 = this.f186029h;
            if (str7 != null) {
                e += C52418a.m58683j(6, str7);
            }
            int e2 = e + C52418a.m58678e(7, this.f186030i);
            String str8 = this.f186031j;
            return str8 != null ? e2 + C52418a.m58683j(8, str8) : e2;
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
            C64791vz3 vz32 = objArr[1];
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
                        vz32.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    vz32.f186025d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    vz32.f186026e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    vz32.f186027f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C64762uz3 uz34 = new C64762uz3();
                        if (bArr2 != null && bArr2.length > 0) {
                            uz34.parseFrom(bArr2);
                        }
                        vz32.f186028g = uz34;
                    }
                    return 0;
                case 6:
                    vz32.f186029h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    vz32.f186030i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    vz32.f186031j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
