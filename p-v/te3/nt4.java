package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class nt4 extends C47465a {

    /* renamed from: d */
    public int f184553d;

    /* renamed from: e */
    public int f184554e;

    /* renamed from: f */
    public int f184555f;

    /* renamed from: g */
    public C51018qv3 f184556g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof nt4)) {
            return false;
        }
        nt4 nt4 = (nt4) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f184553d), Integer.valueOf(nt4.f184553d)) && C46238a.m51546a(Integer.valueOf(this.f184554e), Integer.valueOf(nt4.f184554e)) && C46238a.m51546a(Integer.valueOf(this.f184555f), Integer.valueOf(nt4.f184555f)) && C46238a.m51546a(this.f184556g, nt4.f184556g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f184556g != null) {
                aVar.mo74318e(1, this.f184553d);
                aVar.mo74318e(2, this.f184554e);
                aVar.mo74318e(3, this.f184555f);
                C51018qv3 qv32 = this.f184556g;
                if (qv32 != null) {
                    aVar.mo74322i(4, qv32.computeSize());
                    this.f184556g.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: PieceData");
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f184553d) + 0 + C52418a.m58678e(2, this.f184554e) + C52418a.m58678e(3, this.f184555f);
            C51018qv3 qv33 = this.f184556g;
            return qv33 != null ? e + C52418a.m58682i(4, qv33.computeSize()) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f184556g != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: PieceData");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            nt4 nt4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                nt4.f184553d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                nt4.f184554e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                nt4.f184555f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C51018qv3 qv34 = new C51018qv3();
                    if (bArr != null && bArr.length > 0) {
                        qv34.mo73348f(bArr);
                    }
                    nt4.f184556g = qv34;
                }
                return 0;
            }
        }
    }
}
