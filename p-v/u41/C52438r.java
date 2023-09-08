package u41;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C101820nt3;
import te3.C90417ia;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: u41.r */
public class C52438r extends C101820nt3 {

    /* renamed from: d */
    public String f146542d;

    /* renamed from: e */
    public C52442v f146543e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52438r)) {
            return false;
        }
        C52438r rVar = (C52438r) aVar;
        return C46238a.m51546a(this.BaseRequest, rVar.BaseRequest) && C46238a.m51546a(this.f146542d, rVar.f146542d) && C46238a.m51546a(this.f146543e, rVar.f146543e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f146542d != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                String str = this.f146542d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                C52442v vVar = this.f146543e;
                if (vVar != null) {
                    aVar.mo74322i(3, vVar.computeSize());
                    this.f146543e.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: search_key");
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str2 = this.f146542d;
            if (str2 != null) {
                i2 += C52418a.m58683j(2, str2);
            }
            C52442v vVar2 = this.f146543e;
            return vVar2 != null ? i2 + C52418a.m58682i(3, vVar2.computeSize()) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f146542d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: search_key");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C52438r rVar = objArr[1];
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
                    rVar.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                rVar.f146542d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C52442v vVar3 = new C52442v();
                    if (bArr2 != null && bArr2.length > 0) {
                        vVar3.parseFrom(bArr2);
                    }
                    rVar.f146543e = vVar3;
                }
                return 0;
            }
        }
    }
}
