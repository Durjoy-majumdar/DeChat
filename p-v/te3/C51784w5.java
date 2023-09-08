package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.w5 */
public class C51784w5 extends C101820nt3 {

    /* renamed from: d */
    public LinkedList<C51645v5> f143860d = new LinkedList<>();

    /* renamed from: e */
    public C51645v5 f143861e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51784w5)) {
            return false;
        }
        C51784w5 w5Var = (C51784w5) aVar;
        return C46238a.m51546a(this.BaseRequest, w5Var.BaseRequest) && C46238a.m51546a(this.f143860d, w5Var.f143860d) && C46238a.m51546a(this.f143861e, w5Var.f143861e);
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
            aVar.mo74320g(2, 8, this.f143860d);
            C51645v5 v5Var = this.f143861e;
            if (v5Var != null) {
                aVar.mo74322i(3, v5Var.computeSize());
                this.f143861e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f143860d);
            C51645v5 v5Var2 = this.f143861e;
            return v5Var2 != null ? g + C52418a.m58682i(3, v5Var2.computeSize()) : g;
        } else if (i == 2) {
            this.f143860d.clear();
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
            C51784w5 w5Var = objArr[1];
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
                    w5Var.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C51645v5 v5Var3 = new C51645v5();
                    if (bArr2 != null && bArr2.length > 0) {
                        v5Var3.parseFrom(bArr2);
                    }
                    w5Var.f143860d.add(v5Var3);
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C51645v5 v5Var4 = new C51645v5();
                    if (bArr3 != null && bArr3.length > 0) {
                        v5Var4.parseFrom(bArr3);
                    }
                    w5Var.f143861e = v5Var4;
                }
                return 0;
            }
        }
    }
}
