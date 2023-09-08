package bf2;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: bf2.f */
public class C39763f extends C47465a {

    /* renamed from: d */
    public C39767j f106709d;

    /* renamed from: e */
    public String f106710e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C39763f)) {
            return false;
        }
        C39763f fVar = (C39763f) aVar;
        return C46238a.m51546a(this.f106709d, fVar.f106709d) && C46238a.m51546a(this.f106710e, fVar.f106710e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C39767j jVar = this.f106709d;
            if (jVar != null) {
                aVar.mo74322i(1, jVar.computeSize());
                this.f106709d.writeFields(aVar);
            }
            String str = this.f106710e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            return 0;
        } else if (i == 1) {
            C39767j jVar2 = this.f106709d;
            if (jVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jVar2.computeSize());
            }
            String str2 = this.f106710e;
            return str2 != null ? i2 + C52418a.m58683j(2, str2) : i2;
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
            C39763f fVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C39767j jVar3 = new C39767j();
                    if (bArr != null && bArr.length > 0) {
                        jVar3.parseFrom(bArr);
                    }
                    fVar.f106709d = jVar3;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                fVar.f106710e = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
