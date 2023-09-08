package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.n63 */
public class C50503n63 extends C101820nt3 {

    /* renamed from: d */
    public String f138443d;

    /* renamed from: e */
    public String f138444e;

    /* renamed from: f */
    public int f138445f;

    /* renamed from: g */
    public String f138446g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50503n63)) {
            return false;
        }
        C50503n63 n632 = (C50503n63) aVar;
        return C46238a.m51546a(this.BaseRequest, n632.BaseRequest) && C46238a.m51546a(this.f138443d, n632.f138443d) && C46238a.m51546a(this.f138444e, n632.f138444e) && C46238a.m51546a(Integer.valueOf(this.f138445f), Integer.valueOf(n632.f138445f)) && C46238a.m51546a(this.f138446g, n632.f138446g);
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
            String str = this.f138443d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f138444e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74318e(4, this.f138445f);
            String str3 = this.f138446g;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str4 = this.f138443d;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            String str5 = this.f138444e;
            if (str5 != null) {
                i2 += C52418a.m58683j(3, str5);
            }
            int e = i2 + C52418a.m58678e(4, this.f138445f);
            String str6 = this.f138446g;
            return str6 != null ? e + C52418a.m58683j(5, str6) : e;
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
            C50503n63 n632 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C90417ia iaVar3 = new C90417ia();
                    if (bArr != null && bArr.length > 0) {
                        iaVar3.parseFrom(bArr);
                    }
                    n632.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                n632.f138443d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                n632.f138444e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                n632.f138445f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                n632.f138446g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
