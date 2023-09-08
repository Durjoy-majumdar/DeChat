package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class nu4 extends C101820nt3 {

    /* renamed from: d */
    public long f138783d;

    /* renamed from: e */
    public long f138784e;

    /* renamed from: f */
    public long f138785f;

    /* renamed from: g */
    public int f138786g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof nu4)) {
            return false;
        }
        nu4 nu4 = (nu4) aVar;
        return C46238a.m51546a(this.BaseRequest, nu4.BaseRequest) && C46238a.m51546a(Long.valueOf(this.f138783d), Long.valueOf(nu4.f138783d)) && C46238a.m51546a(Long.valueOf(this.f138784e), Long.valueOf(nu4.f138784e)) && C46238a.m51546a(Long.valueOf(this.f138785f), Long.valueOf(nu4.f138785f)) && C46238a.m51546a(Integer.valueOf(this.f138786g), Integer.valueOf(nu4.f138786g));
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
            aVar.mo74321h(2, this.f138783d);
            aVar.mo74321h(3, this.f138784e);
            aVar.mo74321h(4, this.f138785f);
            aVar.mo74318e(5, this.f138786g);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            return i2 + C52418a.m58681h(2, this.f138783d) + C52418a.m58681h(3, this.f138784e) + C52418a.m58681h(4, this.f138785f) + C52418a.m58678e(5, this.f138786g);
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
            nu4 nu4 = objArr[1];
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
                    nu4.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                nu4.f138783d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 3) {
                nu4.f138784e = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 4) {
                nu4.f138785f = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                nu4.f138786g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
