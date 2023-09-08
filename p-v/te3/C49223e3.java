package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.e3 */
public class C49223e3 extends C101820nt3 {

    /* renamed from: d */
    public String f132653d;

    /* renamed from: e */
    public int f132654e;

    /* renamed from: f */
    public int f132655f;

    /* renamed from: g */
    public String f132656g;

    /* renamed from: h */
    public String f132657h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49223e3)) {
            return false;
        }
        C49223e3 e3Var = (C49223e3) aVar;
        return C46238a.m51546a(this.BaseRequest, e3Var.BaseRequest) && C46238a.m51546a(this.f132653d, e3Var.f132653d) && C46238a.m51546a(Integer.valueOf(this.f132654e), Integer.valueOf(e3Var.f132654e)) && C46238a.m51546a(Integer.valueOf(this.f132655f), Integer.valueOf(e3Var.f132655f)) && C46238a.m51546a(this.f132656g, e3Var.f132656g) && C46238a.m51546a(this.f132657h, e3Var.f132657h);
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
            String str = this.f132653d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f132654e);
            aVar.mo74318e(4, this.f132655f);
            String str2 = this.f132656g;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            String str3 = this.f132657h;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str4 = this.f132653d;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            int e = i2 + C52418a.m58678e(3, this.f132654e) + C52418a.m58678e(4, this.f132655f);
            String str5 = this.f132656g;
            if (str5 != null) {
                e += C52418a.m58683j(5, str5);
            }
            String str6 = this.f132657h;
            return str6 != null ? e + C52418a.m58683j(6, str6) : e;
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
            C49223e3 e3Var = objArr[1];
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
                        e3Var.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    e3Var.f132653d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    e3Var.f132654e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    e3Var.f132655f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    e3Var.f132656g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    e3Var.f132657h = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
