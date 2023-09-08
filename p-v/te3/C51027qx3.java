package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.qx3 */
public class C51027qx3 extends C47465a {

    /* renamed from: d */
    public int f140598d;

    /* renamed from: e */
    public String f140599e;

    /* renamed from: f */
    public C51018qv3 f140600f;

    /* renamed from: g */
    public long f140601g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51027qx3)) {
            return false;
        }
        C51027qx3 qx32 = (C51027qx3) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f140598d), Integer.valueOf(qx32.f140598d)) && C46238a.m51546a(this.f140599e, qx32.f140599e) && C46238a.m51546a(this.f140600f, qx32.f140600f) && C46238a.m51546a(Long.valueOf(this.f140601g), Long.valueOf(qx32.f140601g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f140599e != null) {
                aVar.mo74318e(1, this.f140598d);
                String str = this.f140599e;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                C51018qv3 qv32 = this.f140600f;
                if (qv32 != null) {
                    aVar.mo74322i(3, qv32.computeSize());
                    this.f140600f.writeFields(aVar);
                }
                aVar.mo74321h(4, this.f140601g);
                return 0;
            }
            throw new C52419b("Not all required fields were included: KeyWord");
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f140598d) + 0;
            String str2 = this.f140599e;
            if (str2 != null) {
                e += C52418a.m58683j(2, str2);
            }
            C51018qv3 qv33 = this.f140600f;
            if (qv33 != null) {
                e += C52418a.m58682i(3, qv33.computeSize());
            }
            return e + C52418a.m58681h(4, this.f140601g);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f140599e != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: KeyWord");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C51027qx3 qx32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                qx32.f140598d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                qx32.f140599e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C51018qv3 qv34 = new C51018qv3();
                    if (bArr != null && bArr.length > 0) {
                        qv34.mo73348f(bArr);
                    }
                    qx32.f140600f = qv34;
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                qx32.f140601g = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }
}
