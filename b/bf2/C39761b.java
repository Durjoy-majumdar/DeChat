package bf2;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: bf2.b */
public class C39761b extends C47465a {

    /* renamed from: d */
    public String f106706d;

    /* renamed from: e */
    public LinkedList<C39766i> f106707e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C39761b)) {
            return false;
        }
        C39761b bVar = (C39761b) aVar;
        return C46238a.m51546a(this.f106706d, bVar.f106706d) && C46238a.m51546a(this.f106707e, bVar.f106707e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f106706d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74320g(2, 8, this.f106707e);
            return 0;
        } else if (i == 1) {
            String str2 = this.f106706d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58680g(2, 8, this.f106707e);
        } else if (i == 2) {
            this.f106707e.clear();
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
            C39761b bVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                bVar.f106706d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C39766i iVar = new C39766i();
                    if (bArr != null && bArr.length > 0) {
                        iVar.parseFrom(bArr);
                    }
                    bVar.f106707e.add(iVar);
                }
                return 0;
            }
        }
    }
}
