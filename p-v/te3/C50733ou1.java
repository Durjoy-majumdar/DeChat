package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ou1 */
public class C50733ou1 extends C47465a {

    /* renamed from: d */
    public C50386md3 f139366d;

    /* renamed from: e */
    public LinkedList<C50386md3> f139367e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50733ou1)) {
            return false;
        }
        C50733ou1 ou12 = (C50733ou1) aVar;
        return C46238a.m51546a(this.f139366d, ou12.f139366d) && C46238a.m51546a(this.f139367e, ou12.f139367e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C50386md3 md32 = this.f139366d;
            if (md32 != null) {
                aVar.mo74322i(1, md32.computeSize());
                this.f139366d.writeFields(aVar);
            }
            aVar.mo74320g(2, 8, this.f139367e);
            return 0;
        } else if (i == 1) {
            C50386md3 md33 = this.f139366d;
            if (md33 != null) {
                i2 = 0 + C52418a.m58682i(1, md33.computeSize());
            }
            return i2 + C52418a.m58680g(2, 8, this.f139367e);
        } else if (i == 2) {
            this.f139367e.clear();
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
            C50733ou1 ou12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C50386md3 md34 = new C50386md3();
                    if (bArr != null && bArr.length > 0) {
                        md34.parseFrom(bArr);
                    }
                    ou12.f139366d = md34;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C50386md3 md35 = new C50386md3();
                    if (bArr2 != null && bArr2.length > 0) {
                        md35.parseFrom(bArr2);
                    }
                    ou12.f139367e.add(md35);
                }
                return 0;
            }
        }
    }
}
