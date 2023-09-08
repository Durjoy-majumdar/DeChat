package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.q4 */
public class C50910q4 extends C101820nt3 {

    /* renamed from: d */
    public String f140120d;

    /* renamed from: e */
    public int f140121e;

    /* renamed from: f */
    public LinkedList<C49889is> f140122f = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50910q4)) {
            return false;
        }
        C50910q4 q4Var = (C50910q4) aVar;
        return C46238a.m51546a(this.BaseRequest, q4Var.BaseRequest) && C46238a.m51546a(this.f140120d, q4Var.f140120d) && C46238a.m51546a(Integer.valueOf(this.f140121e), Integer.valueOf(q4Var.f140121e)) && C46238a.m51546a(this.f140122f, q4Var.f140122f);
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
            String str = this.f140120d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f140121e);
            aVar.mo74320g(4, 8, this.f140122f);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str2 = this.f140120d;
            if (str2 != null) {
                i2 += C52418a.m58683j(2, str2);
            }
            return i2 + C52418a.m58678e(3, this.f140121e) + C52418a.m58680g(4, 8, this.f140122f);
        } else if (i == 2) {
            this.f140122f.clear();
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
            C50910q4 q4Var = objArr[1];
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
                    q4Var.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                q4Var.f140120d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                q4Var.f140121e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C49889is isVar = new C49889is();
                    if (bArr2 != null && bArr2.length > 0) {
                        isVar.parseFrom(bArr2);
                    }
                    q4Var.f140122f.add(isVar);
                }
                return 0;
            }
        }
    }
}
