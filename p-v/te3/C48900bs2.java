package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.bs2 */
public class C48900bs2 extends C47465a {

    /* renamed from: d */
    public LinkedList<C49044cs2> f131285d = new LinkedList<>();

    /* renamed from: e */
    public wr4 f131286e;

    /* renamed from: f */
    public long f131287f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48900bs2)) {
            return false;
        }
        C48900bs2 bs22 = (C48900bs2) aVar;
        return C46238a.m51546a(this.f131285d, bs22.f131285d) && C46238a.m51546a(this.f131286e, bs22.f131286e) && C46238a.m51546a(Long.valueOf(this.f131287f), Long.valueOf(bs22.f131287f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f131286e != null) {
                aVar.mo74320g(1, 8, this.f131285d);
                wr4 wr4 = this.f131286e;
                if (wr4 != null) {
                    aVar.mo74322i(2, wr4.computeSize());
                    this.f131286e.writeFields(aVar);
                }
                aVar.mo74321h(3, this.f131287f);
                return 0;
            }
            throw new C52419b("Not all required fields were included: matrix");
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 8, this.f131285d) + 0;
            wr4 wr42 = this.f131286e;
            if (wr42 != null) {
                g += C52418a.m58682i(2, wr42.computeSize());
            }
            return g + C52418a.m58681h(3, this.f131287f);
        } else if (i == 2) {
            this.f131285d.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f131286e != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: matrix");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C48900bs2 bs22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C49044cs2 cs22 = new C49044cs2();
                    if (bArr != null && bArr.length > 0) {
                        cs22.parseFrom(bArr);
                    }
                    bs22.f131285d.add(cs22);
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    wr4 wr43 = new wr4();
                    if (bArr2 != null && bArr2.length > 0) {
                        wr43.parseFrom(bArr2);
                    }
                    bs22.f131286e = wr43;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                bs22.f131287f = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }
}
