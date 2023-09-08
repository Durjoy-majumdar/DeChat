package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class s74 extends C47465a {

    /* renamed from: d */
    public long f141358d;

    /* renamed from: e */
    public int f141359e;

    /* renamed from: f */
    public C51018qv3 f141360f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof s74)) {
            return false;
        }
        s74 s74 = (s74) aVar;
        return C46238a.m51546a(Long.valueOf(this.f141358d), Long.valueOf(s74.f141358d)) && C46238a.m51546a(Integer.valueOf(this.f141359e), Integer.valueOf(s74.f141359e)) && C46238a.m51546a(this.f141360f, s74.f141360f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f141358d);
            aVar.mo74318e(2, this.f141359e);
            C51018qv3 qv32 = this.f141360f;
            if (qv32 != null) {
                aVar.mo74322i(3, qv32.computeSize());
                this.f141360f.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f141358d) + 0 + C52418a.m58678e(2, this.f141359e);
            C51018qv3 qv33 = this.f141360f;
            return qv33 != null ? h + C52418a.m58682i(3, qv33.computeSize()) : h;
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
            s74 s74 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                s74.f141358d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 2) {
                s74.f141359e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 3) {
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
                    s74.f141360f = qv34;
                }
                return 0;
            }
        }
    }
}
