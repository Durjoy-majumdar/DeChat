package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.br1 */
public class C64266br1 extends C47465a {

    /* renamed from: d */
    public int f182324d;

    /* renamed from: e */
    public int f182325e;

    /* renamed from: f */
    public C51018qv3 f182326f;

    /* renamed from: g */
    public int f182327g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64266br1)) {
            return false;
        }
        C64266br1 br12 = (C64266br1) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f182324d), Integer.valueOf(br12.f182324d)) && C46238a.m51546a(Integer.valueOf(this.f182325e), Integer.valueOf(br12.f182325e)) && C46238a.m51546a(this.f182326f, br12.f182326f) && C46238a.m51546a(Integer.valueOf(this.f182327g), Integer.valueOf(br12.f182327g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f182324d);
            aVar.mo74318e(2, this.f182325e);
            C51018qv3 qv32 = this.f182326f;
            if (qv32 != null) {
                aVar.mo74322i(3, qv32.computeSize());
                this.f182326f.writeFields(aVar);
            }
            aVar.mo74318e(4, this.f182327g);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f182324d) + 0 + C52418a.m58678e(2, this.f182325e);
            C51018qv3 qv33 = this.f182326f;
            if (qv33 != null) {
                e += C52418a.m58682i(3, qv33.computeSize());
            }
            return e + C52418a.m58678e(4, this.f182327g);
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
            C64266br1 br12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                br12.f182324d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                br12.f182325e = aVar3.mo141629g(intValue);
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
                    br12.f182326f = qv34;
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                br12.f182327g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
