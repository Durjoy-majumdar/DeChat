package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.cq2 */
public class C64293cq2 extends C47465a {

    /* renamed from: d */
    public C64323dq2 f182554d;

    /* renamed from: e */
    public C52151yp2 f182555e;

    /* renamed from: f */
    public C64890zp2 f182556f;

    /* renamed from: g */
    public LinkedList<C64239aq2> f182557g = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64293cq2)) {
            return false;
        }
        C64293cq2 cq22 = (C64293cq2) aVar;
        return C46238a.m51546a(this.f182554d, cq22.f182554d) && C46238a.m51546a(this.f182555e, cq22.f182555e) && C46238a.m51546a(this.f182556f, cq22.f182556f) && C46238a.m51546a(this.f182557g, cq22.f182557g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C64323dq2 dq22 = this.f182554d;
            if (dq22 != null) {
                aVar.mo74322i(1, dq22.computeSize());
                this.f182554d.writeFields(aVar);
            }
            C52151yp2 yp22 = this.f182555e;
            if (yp22 != null) {
                aVar.mo74322i(2, yp22.computeSize());
                this.f182555e.writeFields(aVar);
            }
            C64890zp2 zp22 = this.f182556f;
            if (zp22 != null) {
                aVar.mo74322i(3, zp22.computeSize());
                this.f182556f.writeFields(aVar);
            }
            aVar.mo74320g(4, 8, this.f182557g);
            return 0;
        } else if (i == 1) {
            C64323dq2 dq23 = this.f182554d;
            if (dq23 != null) {
                i2 = 0 + C52418a.m58682i(1, dq23.computeSize());
            }
            C52151yp2 yp23 = this.f182555e;
            if (yp23 != null) {
                i2 += C52418a.m58682i(2, yp23.computeSize());
            }
            C64890zp2 zp23 = this.f182556f;
            if (zp23 != null) {
                i2 += C52418a.m58682i(3, zp23.computeSize());
            }
            return i2 + C52418a.m58680g(4, 8, this.f182557g);
        } else if (i == 2) {
            this.f182557g.clear();
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
            C64293cq2 cq22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C64323dq2 dq24 = new C64323dq2();
                    if (bArr != null && bArr.length > 0) {
                        dq24.parseFrom(bArr);
                    }
                    cq22.f182554d = dq24;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C52151yp2 yp24 = new C52151yp2();
                    if (bArr2 != null && bArr2.length > 0) {
                        yp24.parseFrom(bArr2);
                    }
                    cq22.f182555e = yp24;
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C64890zp2 zp24 = new C64890zp2();
                    if (bArr3 != null && bArr3.length > 0) {
                        zp24.parseFrom(bArr3);
                    }
                    cq22.f182556f = zp24;
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                int size4 = j4.size();
                for (int i6 = 0; i6 < size4; i6++) {
                    byte[] bArr4 = j4.get(i6);
                    C64239aq2 aq22 = new C64239aq2();
                    if (bArr4 != null && bArr4.length > 0) {
                        aq22.parseFrom(bArr4);
                    }
                    cq22.f182557g.add(aq22);
                }
                return 0;
            }
        }
    }
}
