package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class of4 extends C47465a {

    /* renamed from: d */
    public int f139147d;

    /* renamed from: e */
    public C51018qv3 f139148e;

    /* renamed from: f */
    public int f139149f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof of4)) {
            return false;
        }
        of4 of4 = (of4) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f139147d), Integer.valueOf(of4.f139147d)) && C46238a.m51546a(this.f139148e, of4.f139148e) && C46238a.m51546a(Integer.valueOf(this.f139149f), Integer.valueOf(of4.f139149f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f139147d);
            C51018qv3 qv32 = this.f139148e;
            if (qv32 != null) {
                aVar.mo74322i(2, qv32.computeSize());
                this.f139148e.writeFields(aVar);
            }
            aVar.mo74318e(3, this.f139149f);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f139147d) + 0;
            C51018qv3 qv33 = this.f139148e;
            if (qv33 != null) {
                e += C52418a.m58682i(2, qv33.computeSize());
            }
            return e + C52418a.m58678e(3, this.f139149f);
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
            of4 of4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                of4.f139147d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C51018qv3 qv34 = new C51018qv3();
                    if (bArr != null && bArr.length > 0) {
                        qv34.mo73348f(bArr);
                    }
                    of4.f139148e = qv34;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                of4.f139149f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
