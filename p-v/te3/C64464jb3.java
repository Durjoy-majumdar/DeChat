package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.jb3 */
public class C64464jb3 extends C47465a {

    /* renamed from: d */
    public long f183777d;

    /* renamed from: e */
    public C77946ib3 f183778e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64464jb3)) {
            return false;
        }
        C64464jb3 jb32 = (C64464jb3) aVar;
        return C46238a.m51546a(Long.valueOf(this.f183777d), Long.valueOf(jb32.f183777d)) && C46238a.m51546a(this.f183778e, jb32.f183778e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f183777d);
            C77946ib3 ib32 = this.f183778e;
            if (ib32 != null) {
                aVar.mo74322i(2, ib32.computeSize());
                this.f183778e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f183777d) + 0;
            C77946ib3 ib33 = this.f183778e;
            return ib33 != null ? h + C52418a.m58682i(2, ib33.computeSize()) : h;
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
            C64464jb3 jb32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                jb32.f183777d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C77946ib3 ib34 = new C77946ib3();
                    if (bArr != null && bArr.length > 0) {
                        ib34.parseFrom(bArr);
                    }
                    jb32.f183778e = ib34;
                }
                return 0;
            }
        }
    }
}
