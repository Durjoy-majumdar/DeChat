package y43;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: y43.a */
public class C66497a extends C47465a {

    /* renamed from: d */
    public LinkedList<C66498c> f191293d = new LinkedList<>();

    /* renamed from: e */
    public C66503v f191294e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C66497a)) {
            return false;
        }
        C66497a aVar2 = (C66497a) aVar;
        return C46238a.m51546a(this.f191293d, aVar2.f191293d) && C46238a.m51546a(this.f191294e, aVar2.f191294e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f191293d);
            C66503v vVar = this.f191294e;
            if (vVar != null) {
                aVar.mo74322i(2, vVar.computeSize());
                this.f191294e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 8, this.f191293d) + 0;
            C66503v vVar2 = this.f191294e;
            return vVar2 != null ? g + C52418a.m58682i(2, vVar2.computeSize()) : g;
        } else if (i == 2) {
            this.f191293d.clear();
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
            C66497a aVar4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C66498c cVar = new C66498c();
                    if (bArr != null && bArr.length > 0) {
                        cVar.parseFrom(bArr);
                    }
                    aVar4.f191293d.add(cVar);
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    C66503v vVar3 = new C66503v();
                    if (bArr2 != null && bArr2.length > 0) {
                        vVar3.parseFrom(bArr2);
                    }
                    aVar4.f191294e = vVar3;
                }
                return 0;
            }
        }
    }
}
