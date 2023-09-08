package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.n83 */
public class C50510n83 extends C101820nt3 {

    /* renamed from: d */
    public String f138479d;

    /* renamed from: e */
    public String f138480e;

    /* renamed from: f */
    public String f138481f;

    /* renamed from: g */
    public String f138482g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50510n83)) {
            return false;
        }
        C50510n83 n832 = (C50510n83) aVar;
        return C46238a.m51546a(this.BaseRequest, n832.BaseRequest) && C46238a.m51546a(this.f138479d, n832.f138479d) && C46238a.m51546a(this.f138480e, n832.f138480e) && C46238a.m51546a(this.f138481f, n832.f138481f) && C46238a.m51546a(this.f138482g, n832.f138482g);
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
            String str = this.f138479d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f138480e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f138481f;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f138482g;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str5 = this.f138479d;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f138480e;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            String str7 = this.f138481f;
            if (str7 != null) {
                i2 += C52418a.m58683j(4, str7);
            }
            String str8 = this.f138482g;
            return str8 != null ? i2 + C52418a.m58683j(5, str8) : i2;
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
            C50510n83 n832 = objArr[1];
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
                    n832.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                n832.f138479d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                n832.f138480e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                n832.f138481f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                n832.f138482g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
