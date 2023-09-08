package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.sp2 */
public class C51280sp2 extends C47465a {

    /* renamed from: d */
    public C50767p11 f141663d;

    /* renamed from: e */
    public long f141664e;

    /* renamed from: f */
    public long f141665f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51280sp2)) {
            return false;
        }
        C51280sp2 sp22 = (C51280sp2) aVar;
        return C46238a.m51546a(this.f141663d, sp22.f141663d) && C46238a.m51546a(Long.valueOf(this.f141664e), Long.valueOf(sp22.f141664e)) && C46238a.m51546a(Long.valueOf(this.f141665f), Long.valueOf(sp22.f141665f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C50767p11 p112 = this.f141663d;
            if (p112 != null) {
                aVar.mo74322i(1, p112.computeSize());
                this.f141663d.writeFields(aVar);
            }
            aVar.mo74321h(2, this.f141664e);
            aVar.mo74321h(3, this.f141665f);
            return 0;
        } else if (i == 1) {
            C50767p11 p113 = this.f141663d;
            if (p113 != null) {
                i2 = 0 + C52418a.m58682i(1, p113.computeSize());
            }
            return i2 + C52418a.m58681h(2, this.f141664e) + C52418a.m58681h(3, this.f141665f);
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
            C51280sp2 sp22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C50767p11 p114 = new C50767p11();
                    if (bArr != null && bArr.length > 0) {
                        p114.parseFrom(bArr);
                    }
                    sp22.f141663d = p114;
                }
                return 0;
            } else if (intValue == 2) {
                sp22.f141664e = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                sp22.f141665f = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }
}
