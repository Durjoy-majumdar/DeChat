package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.vg1 */
public class C51692vg1 extends C47465a {

    /* renamed from: d */
    public z74 f143476d;

    /* renamed from: e */
    public String f143477e;

    /* renamed from: f */
    public String f143478f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51692vg1)) {
            return false;
        }
        C51692vg1 vg12 = (C51692vg1) aVar;
        return C46238a.m51546a(this.f143476d, vg12.f143476d) && C46238a.m51546a(this.f143477e, vg12.f143477e) && C46238a.m51546a(this.f143478f, vg12.f143478f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            z74 z74 = this.f143476d;
            if (z74 != null) {
                aVar.mo74322i(1, z74.computeSize());
                this.f143476d.writeFields(aVar);
            }
            String str = this.f143477e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f143478f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            return 0;
        } else if (i == 1) {
            z74 z742 = this.f143476d;
            if (z742 != null) {
                i2 = 0 + C52418a.m58682i(1, z742.computeSize());
            }
            String str3 = this.f143477e;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            String str4 = this.f143478f;
            return str4 != null ? i2 + C52418a.m58683j(3, str4) : i2;
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
            C51692vg1 vg12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    z74 z743 = new z74();
                    if (bArr != null && bArr.length > 0) {
                        z743.parseFrom(bArr);
                    }
                    vg12.f143476d = z743;
                }
                return 0;
            } else if (intValue == 2) {
                vg12.f143477e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                vg12.f143478f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
