package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.nw0 */
public class C50602nw0 extends C47465a {

    /* renamed from: d */
    public long f138804d;

    /* renamed from: e */
    public C51713vn0 f138805e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50602nw0)) {
            return false;
        }
        C50602nw0 nw02 = (C50602nw0) aVar;
        return C46238a.m51546a(Long.valueOf(this.f138804d), Long.valueOf(nw02.f138804d)) && C46238a.m51546a(this.f138805e, nw02.f138805e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f138804d);
            C51713vn0 vn02 = this.f138805e;
            if (vn02 != null) {
                aVar.mo74322i(2, vn02.computeSize());
                this.f138805e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f138804d) + 0;
            C51713vn0 vn03 = this.f138805e;
            return vn03 != null ? h + C52418a.m58682i(2, vn03.computeSize()) : h;
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
            C50602nw0 nw02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                nw02.f138804d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C51713vn0 vn04 = new C51713vn0();
                    if (bArr != null && bArr.length > 0) {
                        vn04.parseFrom(bArr);
                    }
                    nw02.f138805e = vn04;
                }
                return 0;
            }
        }
    }
}
