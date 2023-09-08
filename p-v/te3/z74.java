package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class z74 extends C47465a {

    /* renamed from: d */
    public C50951qe3 f145743d;

    /* renamed from: e */
    public int f145744e;

    /* renamed from: f */
    public int f145745f;

    /* renamed from: g */
    public int f145746g;

    /* renamed from: h */
    public int f145747h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof z74)) {
            return false;
        }
        z74 z74 = (z74) aVar;
        return C46238a.m51546a(this.f145743d, z74.f145743d) && C46238a.m51546a(Integer.valueOf(this.f145744e), Integer.valueOf(z74.f145744e)) && C46238a.m51546a(Integer.valueOf(this.f145745f), Integer.valueOf(z74.f145745f)) && C46238a.m51546a(Integer.valueOf(this.f145746g), Integer.valueOf(z74.f145746g)) && C46238a.m51546a(Integer.valueOf(this.f145747h), Integer.valueOf(z74.f145747h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C50951qe3 qe32 = this.f145743d;
            if (qe32 != null) {
                aVar.mo74322i(1, qe32.computeSize());
                this.f145743d.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f145744e);
            aVar.mo74318e(3, this.f145745f);
            aVar.mo74318e(4, this.f145746g);
            aVar.mo74318e(5, this.f145747h);
            return 0;
        } else if (i == 1) {
            C50951qe3 qe33 = this.f145743d;
            if (qe33 != null) {
                i2 = 0 + C52418a.m58682i(1, qe33.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f145744e) + C52418a.m58678e(3, this.f145745f) + C52418a.m58678e(4, this.f145746g) + C52418a.m58678e(5, this.f145747h);
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
            z74 z74 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C50951qe3 qe34 = new C50951qe3();
                    if (bArr != null && bArr.length > 0) {
                        qe34.parseFrom(bArr);
                    }
                    z74.f145743d = qe34;
                }
                return 0;
            } else if (intValue == 2) {
                z74.f145744e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                z74.f145745f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                z74.f145746g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                z74.f145747h = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
