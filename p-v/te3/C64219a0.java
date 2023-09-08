package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.a0 */
public class C64219a0 extends C101820nt3 {

    /* renamed from: d */
    public int f182003d;

    /* renamed from: e */
    public int f182004e;

    /* renamed from: f */
    public int f182005f;

    /* renamed from: g */
    public String f182006g;

    /* renamed from: h */
    public int f182007h;

    /* renamed from: i */
    public int f182008i;

    /* renamed from: j */
    public String f182009j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64219a0)) {
            return false;
        }
        C64219a0 a0Var = (C64219a0) aVar;
        return C46238a.m51546a(this.BaseRequest, a0Var.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f182003d), Integer.valueOf(a0Var.f182003d)) && C46238a.m51546a(Integer.valueOf(this.f182004e), Integer.valueOf(a0Var.f182004e)) && C46238a.m51546a(Integer.valueOf(this.f182005f), Integer.valueOf(a0Var.f182005f)) && C46238a.m51546a(this.f182006g, a0Var.f182006g) && C46238a.m51546a(Integer.valueOf(this.f182007h), Integer.valueOf(a0Var.f182007h)) && C46238a.m51546a(Integer.valueOf(this.f182008i), Integer.valueOf(a0Var.f182008i)) && C46238a.m51546a(this.f182009j, a0Var.f182009j);
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
            aVar.mo74318e(2, this.f182003d);
            aVar.mo74318e(3, this.f182004e);
            aVar.mo74318e(4, this.f182005f);
            String str = this.f182006g;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            aVar.mo74318e(6, this.f182007h);
            aVar.mo74318e(7, this.f182008i);
            String str2 = this.f182009j;
            if (str2 != null) {
                aVar.mo74323j(8, str2);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f182003d) + C52418a.m58678e(3, this.f182004e) + C52418a.m58678e(4, this.f182005f);
            String str3 = this.f182006g;
            if (str3 != null) {
                e += C52418a.m58683j(5, str3);
            }
            int e2 = e + C52418a.m58678e(6, this.f182007h) + C52418a.m58678e(7, this.f182008i);
            String str4 = this.f182009j;
            return str4 != null ? e2 + C52418a.m58683j(8, str4) : e2;
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
            C64219a0 a0Var = objArr[1];
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
                        a0Var.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    a0Var.f182003d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    a0Var.f182004e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    a0Var.f182005f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    a0Var.f182006g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    a0Var.f182007h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    a0Var.f182008i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    a0Var.f182009j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
