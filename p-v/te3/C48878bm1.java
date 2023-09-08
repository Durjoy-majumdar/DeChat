package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.bm1 */
public class C48878bm1 extends C47465a {

    /* renamed from: d */
    public int f131199d;

    /* renamed from: e */
    public C64586nn1 f131200e;

    /* renamed from: f */
    public int f131201f;

    /* renamed from: g */
    public long f131202g;

    /* renamed from: h */
    public String f131203h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48878bm1)) {
            return false;
        }
        C48878bm1 bm12 = (C48878bm1) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f131199d), Integer.valueOf(bm12.f131199d)) && C46238a.m51546a(this.f131200e, bm12.f131200e) && C46238a.m51546a(Integer.valueOf(this.f131201f), Integer.valueOf(bm12.f131201f)) && C46238a.m51546a(Long.valueOf(this.f131202g), Long.valueOf(bm12.f131202g)) && C46238a.m51546a(this.f131203h, bm12.f131203h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f131199d);
            C64586nn1 nn12 = this.f131200e;
            if (nn12 != null) {
                aVar.mo74322i(2, nn12.computeSize());
                this.f131200e.writeFields(aVar);
            }
            aVar.mo74318e(3, this.f131201f);
            aVar.mo74321h(4, this.f131202g);
            String str = this.f131203h;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f131199d) + 0;
            C64586nn1 nn13 = this.f131200e;
            if (nn13 != null) {
                e += C52418a.m58682i(2, nn13.computeSize());
            }
            int e2 = e + C52418a.m58678e(3, this.f131201f) + C52418a.m58681h(4, this.f131202g);
            String str2 = this.f131203h;
            return str2 != null ? e2 + C52418a.m58683j(5, str2) : e2;
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
            C48878bm1 bm12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                bm12.f131199d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C64586nn1 nn14 = new C64586nn1();
                    if (bArr != null && bArr.length > 0) {
                        nn14.parseFrom(bArr);
                    }
                    bm12.f131200e = nn14;
                }
                return 0;
            } else if (intValue == 3) {
                bm12.f131201f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                bm12.f131202g = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                bm12.f131203h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
