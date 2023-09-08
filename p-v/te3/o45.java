package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class o45 extends C47465a {

    /* renamed from: d */
    public l45 f138958d;

    /* renamed from: e */
    public C89349b f138959e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof o45)) {
            return false;
        }
        o45 o45 = (o45) aVar;
        return C46238a.m51546a(this.f138958d, o45.f138958d) && C46238a.m51546a(this.f138959e, o45.f138959e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            l45 l45 = this.f138958d;
            if (l45 != null) {
                aVar.mo74322i(1, l45.computeSize());
                this.f138958d.writeFields(aVar);
            }
            C89349b bVar = this.f138959e;
            if (bVar != null) {
                aVar.mo74315b(2, bVar);
            }
            return 0;
        } else if (i == 1) {
            l45 l452 = this.f138958d;
            if (l452 != null) {
                i2 = 0 + C52418a.m58682i(1, l452.computeSize());
            }
            C89349b bVar2 = this.f138959e;
            return bVar2 != null ? i2 + C52418a.m58675b(2, bVar2) : i2;
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
            o45 o45 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    l45 l453 = new l45();
                    if (bArr != null && bArr.length > 0) {
                        l453.parseFrom(bArr);
                    }
                    o45.f138958d = l453;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                o45.f138959e = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}
