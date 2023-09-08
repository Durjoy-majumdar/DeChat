package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class tu4 extends C47465a {

    /* renamed from: d */
    public int f142429d;

    /* renamed from: e */
    public int f142430e;

    /* renamed from: f */
    public int f142431f;

    /* renamed from: g */
    public C51018qv3 f142432g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof tu4)) {
            return false;
        }
        tu4 tu4 = (tu4) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f142429d), Integer.valueOf(tu4.f142429d)) && C46238a.m51546a(Integer.valueOf(this.f142430e), Integer.valueOf(tu4.f142430e)) && C46238a.m51546a(Integer.valueOf(this.f142431f), Integer.valueOf(tu4.f142431f)) && C46238a.m51546a(this.f142432g, tu4.f142432g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f142432g != null) {
                aVar.mo74318e(1, this.f142429d);
                aVar.mo74318e(2, this.f142430e);
                aVar.mo74318e(3, this.f142431f);
                C51018qv3 qv32 = this.f142432g;
                if (qv32 != null) {
                    aVar.mo74322i(4, qv32.computeSize());
                    this.f142432g.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: Buffer");
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f142429d) + 0 + C52418a.m58678e(2, this.f142430e) + C52418a.m58678e(3, this.f142431f);
            C51018qv3 qv33 = this.f142432g;
            return qv33 != null ? e + C52418a.m58682i(4, qv33.computeSize()) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f142432g != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: Buffer");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            tu4 tu4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                tu4.f142429d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                tu4.f142430e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                tu4.f142431f = aVar3.mo141629g(intValue);
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
                    tu4.f142432g = qv34;
                }
                return 0;
            }
        }
    }
}
