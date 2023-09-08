package py1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.m */
public class C47624m extends C47465a {

    /* renamed from: d */
    public LinkedList<C47596i> f127861d = new LinkedList<>();

    /* renamed from: e */
    public LinkedList<C47664r4> f127862e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47624m)) {
            return false;
        }
        C47624m mVar = (C47624m) aVar;
        return C46238a.m51546a(this.f127861d, mVar.f127861d) && C46238a.m51546a(this.f127862e, mVar.f127862e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f127861d);
            aVar.mo74320g(2, 8, this.f127862e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58680g(1, 8, this.f127861d) + 0 + C52418a.m58680g(2, 8, this.f127862e);
        } else {
            if (i == 2) {
                this.f127861d.clear();
                this.f127862e.clear();
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
                C47624m mVar = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C47596i iVar = new C47596i();
                        if (bArr != null && bArr.length > 0) {
                            iVar.parseFrom(bArr);
                        }
                        mVar.f127861d.add(iVar);
                    }
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        C47664r4 r4Var = new C47664r4();
                        if (bArr2 != null && bArr2.length > 0) {
                            r4Var.parseFrom(bArr2);
                        }
                        mVar.f127862e.add(r4Var);
                    }
                    return 0;
                }
            }
        }
    }
}
