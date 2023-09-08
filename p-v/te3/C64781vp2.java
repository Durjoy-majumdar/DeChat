package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.vp2 */
public class C64781vp2 extends C47465a {

    /* renamed from: d */
    public C64785vw2 f185966d;

    /* renamed from: e */
    public LinkedList<C64785vw2> f185967e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64781vp2)) {
            return false;
        }
        C64781vp2 vp22 = (C64781vp2) aVar;
        return C46238a.m51546a(this.f185966d, vp22.f185966d) && C46238a.m51546a(this.f185967e, vp22.f185967e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C64785vw2 vw22 = this.f185966d;
            if (vw22 != null) {
                aVar.mo74322i(1, vw22.computeSize());
                this.f185966d.writeFields(aVar);
            }
            aVar.mo74320g(2, 8, this.f185967e);
            return 0;
        } else if (i == 1) {
            C64785vw2 vw23 = this.f185966d;
            if (vw23 != null) {
                i2 = 0 + C52418a.m58682i(1, vw23.computeSize());
            }
            return i2 + C52418a.m58680g(2, 8, this.f185967e);
        } else if (i == 2) {
            this.f185967e.clear();
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
            C64781vp2 vp22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C64785vw2 vw24 = new C64785vw2();
                    if (bArr != null && bArr.length > 0) {
                        vw24.parseFrom(bArr);
                    }
                    vp22.f185966d = vw24;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C64785vw2 vw25 = new C64785vw2();
                    if (bArr2 != null && bArr2.length > 0) {
                        vw25.parseFrom(bArr2);
                    }
                    vp22.f185967e.add(vw25);
                }
                return 0;
            }
        }
    }
}
