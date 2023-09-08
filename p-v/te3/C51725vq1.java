package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.vq1 */
public class C51725vq1 extends C47465a {

    /* renamed from: d */
    public C51960xe f143623d;

    /* renamed from: e */
    public LinkedList<C52251ze> f143624e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51725vq1)) {
            return false;
        }
        C51725vq1 vq12 = (C51725vq1) aVar;
        return C46238a.m51546a(this.f143623d, vq12.f143623d) && C46238a.m51546a(this.f143624e, vq12.f143624e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C51960xe xeVar = this.f143623d;
            if (xeVar != null) {
                aVar.mo74322i(1, xeVar.computeSize());
                this.f143623d.writeFields(aVar);
            }
            aVar.mo74320g(2, 8, this.f143624e);
            return 0;
        } else if (i == 1) {
            C51960xe xeVar2 = this.f143623d;
            if (xeVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, xeVar2.computeSize());
            }
            return i2 + C52418a.m58680g(2, 8, this.f143624e);
        } else if (i == 2) {
            this.f143624e.clear();
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
            C51725vq1 vq12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C51960xe xeVar3 = new C51960xe();
                    if (bArr != null && bArr.length > 0) {
                        xeVar3.parseFrom(bArr);
                    }
                    vq12.f143623d = xeVar3;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C52251ze zeVar = new C52251ze();
                    if (bArr2 != null && bArr2.length > 0) {
                        zeVar.parseFrom(bArr2);
                    }
                    vq12.f143624e.add(zeVar);
                }
                return 0;
            }
        }
    }
}
