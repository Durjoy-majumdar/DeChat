package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.dr1 */
public class C110960dr1 extends C47465a {

    /* renamed from: d */
    public LinkedList<C110970q14> f331954d = new LinkedList<>();

    /* renamed from: e */
    public C118429er1 f331955e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C110960dr1)) {
            return false;
        }
        C110960dr1 dr12 = (C110960dr1) aVar;
        return C46238a.m51546a(this.f331954d, dr12.f331954d) && C46238a.m51546a(this.f331955e, dr12.f331955e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f331954d);
            C118429er1 er12 = this.f331955e;
            if (er12 != null) {
                aVar.mo74322i(2, er12.computeSize());
                this.f331955e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 8, this.f331954d) + 0;
            C118429er1 er13 = this.f331955e;
            return er13 != null ? g + C52418a.m58682i(2, er13.computeSize()) : g;
        } else if (i == 2) {
            this.f331954d.clear();
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
            C110960dr1 dr12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C110970q14 q142 = new C110970q14();
                    if (bArr != null && bArr.length > 0) {
                        q142.parseFrom(bArr);
                    }
                    dr12.f331954d.add(q142);
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    C118429er1 er14 = new C118429er1();
                    if (bArr2 != null && bArr2.length > 0) {
                        er14.parseFrom(bArr2);
                    }
                    dr12.f331955e = er14;
                }
                return 0;
            }
        }
    }
}
