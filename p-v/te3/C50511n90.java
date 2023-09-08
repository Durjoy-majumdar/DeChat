package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.n90 */
public class C50511n90 extends C101820nt3 {

    /* renamed from: d */
    public String f138491d;

    /* renamed from: e */
    public String f138492e;

    /* renamed from: f */
    public int f138493f;

    /* renamed from: g */
    public C77963l1 f138494g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50511n90)) {
            return false;
        }
        C50511n90 n902 = (C50511n90) aVar;
        return C46238a.m51546a(this.BaseRequest, n902.BaseRequest) && C46238a.m51546a(this.f138491d, n902.f138491d) && C46238a.m51546a(this.f138492e, n902.f138492e) && C46238a.m51546a(Integer.valueOf(this.f138493f), Integer.valueOf(n902.f138493f)) && C46238a.m51546a(this.f138494g, n902.f138494g);
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
            String str = this.f138491d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f138492e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74318e(4, this.f138493f);
            C77963l1 l1Var = this.f138494g;
            if (l1Var != null) {
                aVar.mo74322i(5, l1Var.computeSize());
                this.f138494g.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str3 = this.f138491d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            String str4 = this.f138492e;
            if (str4 != null) {
                i2 += C52418a.m58683j(3, str4);
            }
            int e = i2 + C52418a.m58678e(4, this.f138493f);
            C77963l1 l1Var2 = this.f138494g;
            return l1Var2 != null ? e + C52418a.m58682i(5, l1Var2.computeSize()) : e;
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
            C50511n90 n902 = objArr[1];
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
                    n902.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                n902.f138491d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                n902.f138492e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                n902.f138493f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C77963l1 l1Var3 = new C77963l1();
                    if (bArr2 != null && bArr2.length > 0) {
                        l1Var3.parseFrom(bArr2);
                    }
                    n902.f138494g = l1Var3;
                }
                return 0;
            }
        }
    }
}
