package s71;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: s71.m */
public class C48253m extends C47465a {

    /* renamed from: d */
    public C48243c f129271d;

    /* renamed from: e */
    public int f129272e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48253m)) {
            return false;
        }
        C48253m mVar = (C48253m) aVar;
        return C46238a.m51546a(this.f129271d, mVar.f129271d) && C46238a.m51546a(Integer.valueOf(this.f129272e), Integer.valueOf(mVar.f129272e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C48243c cVar = this.f129271d;
            if (cVar != null) {
                if (cVar != null) {
                    aVar.mo74322i(1, cVar.computeSize());
                    this.f129271d.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f129272e);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BasePush");
        } else if (i == 1) {
            C48243c cVar2 = this.f129271d;
            if (cVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, cVar2.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f129272e);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f129271d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: BasePush");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C48253m mVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C48243c cVar3 = new C48243c();
                    if (bArr != null && bArr.length > 0) {
                        cVar3.parseFrom(bArr);
                    }
                    mVar.f129271d = cVar3;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                mVar.f129272e = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
