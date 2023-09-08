package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.mo3 */
public class C64560mo3 extends C47465a {

    /* renamed from: d */
    public long f184365d;

    /* renamed from: e */
    public C64716sw f184366e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64560mo3)) {
            return false;
        }
        C64560mo3 mo32 = (C64560mo3) aVar;
        return C46238a.m51546a(Long.valueOf(this.f184365d), Long.valueOf(mo32.f184365d)) && C46238a.m51546a(this.f184366e, mo32.f184366e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f184365d);
            C64716sw swVar = this.f184366e;
            if (swVar != null) {
                aVar.mo74322i(2, swVar.computeSize());
                this.f184366e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f184365d) + 0;
            C64716sw swVar2 = this.f184366e;
            return swVar2 != null ? h + C52418a.m58682i(2, swVar2.computeSize()) : h;
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
            C64560mo3 mo32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                mo32.f184365d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C64716sw swVar3 = new C64716sw();
                    if (bArr != null && bArr.length > 0) {
                        swVar3.parseFrom(bArr);
                    }
                    mo32.f184366e = swVar3;
                }
                return 0;
            }
        }
    }
}
