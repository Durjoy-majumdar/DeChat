package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.wm */
public class C51850wm extends C101820nt3 {

    /* renamed from: d */
    public String f144128d;

    /* renamed from: e */
    public String f144129e;

    /* renamed from: f */
    public C77963l1 f144130f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51850wm)) {
            return false;
        }
        C51850wm wmVar = (C51850wm) aVar;
        return C46238a.m51546a(this.BaseRequest, wmVar.BaseRequest) && C46238a.m51546a(this.f144128d, wmVar.f144128d) && C46238a.m51546a(this.f144129e, wmVar.f144129e) && C46238a.m51546a(this.f144130f, wmVar.f144130f);
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
            String str = this.f144128d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f144129e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            C77963l1 l1Var = this.f144130f;
            if (l1Var != null) {
                aVar.mo74322i(4, l1Var.computeSize());
                this.f144130f.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str3 = this.f144128d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            String str4 = this.f144129e;
            if (str4 != null) {
                i2 += C52418a.m58683j(3, str4);
            }
            C77963l1 l1Var2 = this.f144130f;
            return l1Var2 != null ? i2 + C52418a.m58682i(4, l1Var2.computeSize()) : i2;
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
            C51850wm wmVar = objArr[1];
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
                    wmVar.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                wmVar.f144128d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                wmVar.f144129e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
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
                    wmVar.f144130f = l1Var3;
                }
                return 0;
            }
        }
    }
}
