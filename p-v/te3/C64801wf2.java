package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.wf2 */
public class C64801wf2 extends C47465a {

    /* renamed from: d */
    public String f186087d;

    /* renamed from: e */
    public C64749uf2 f186088e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64801wf2)) {
            return false;
        }
        C64801wf2 wf22 = (C64801wf2) aVar;
        return C46238a.m51546a(this.f186087d, wf22.f186087d) && C46238a.m51546a(this.f186088e, wf22.f186088e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f186087d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            C64749uf2 uf22 = this.f186088e;
            if (uf22 != null) {
                aVar.mo74322i(2, uf22.computeSize());
                this.f186088e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str2 = this.f186087d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            C64749uf2 uf23 = this.f186088e;
            return uf23 != null ? i2 + C52418a.m58682i(2, uf23.computeSize()) : i2;
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
            C64801wf2 wf22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                wf22.f186087d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C64749uf2 uf24 = new C64749uf2();
                    if (bArr != null && bArr.length > 0) {
                        uf24.parseFrom(bArr);
                    }
                    wf22.f186088e = uf24;
                }
                return 0;
            }
        }
    }
}
