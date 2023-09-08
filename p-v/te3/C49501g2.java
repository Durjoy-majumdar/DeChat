package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.g2 */
public class C49501g2 extends C101820nt3 {

    /* renamed from: d */
    public String f133794d;

    /* renamed from: e */
    public String f133795e;

    /* renamed from: f */
    public LinkedList<C49364f2> f133796f = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49501g2)) {
            return false;
        }
        C49501g2 g2Var = (C49501g2) aVar;
        return C46238a.m51546a(this.BaseRequest, g2Var.BaseRequest) && C46238a.m51546a(this.f133794d, g2Var.f133794d) && C46238a.m51546a(this.f133795e, g2Var.f133795e) && C46238a.m51546a(this.f133796f, g2Var.f133796f);
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
            String str = this.f133794d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f133795e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74320g(4, 8, this.f133796f);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str3 = this.f133794d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            String str4 = this.f133795e;
            if (str4 != null) {
                i2 += C52418a.m58683j(3, str4);
            }
            return i2 + C52418a.m58680g(4, 8, this.f133796f);
        } else if (i == 2) {
            this.f133796f.clear();
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
            C49501g2 g2Var = objArr[1];
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
                    g2Var.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                g2Var.f133794d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                g2Var.f133795e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C49364f2 f2Var = new C49364f2();
                    if (bArr2 != null && bArr2.length > 0) {
                        f2Var.parseFrom(bArr2);
                    }
                    g2Var.f133796f.add(f2Var);
                }
                return 0;
            }
        }
    }
}
