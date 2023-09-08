package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class ax4 extends C47465a {

    /* renamed from: d */
    public ew4 f130837d;

    /* renamed from: e */
    public int f130838e;

    /* renamed from: f */
    public int f130839f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ax4)) {
            return false;
        }
        ax4 ax4 = (ax4) aVar;
        return C46238a.m51546a(this.f130837d, ax4.f130837d) && C46238a.m51546a(Integer.valueOf(this.f130838e), Integer.valueOf(ax4.f130838e)) && C46238a.m51546a(Integer.valueOf(this.f130839f), Integer.valueOf(ax4.f130839f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            ew4 ew4 = this.f130837d;
            if (ew4 != null) {
                if (ew4 != null) {
                    aVar.mo74322i(1, ew4.computeSize());
                    this.f130837d.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f130838e);
                aVar.mo74318e(3, this.f130839f);
                return 0;
            }
            throw new C52419b("Not all required fields were included: base_response");
        } else if (i == 1) {
            ew4 ew42 = this.f130837d;
            if (ew42 != null) {
                i2 = 0 + C52418a.m58682i(1, ew42.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f130838e) + C52418a.m58678e(3, this.f130839f);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f130837d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: base_response");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            ax4 ax4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    ew4 ew43 = new ew4();
                    if (bArr != null && bArr.length > 0) {
                        ew43.parseFrom(bArr);
                    }
                    ax4.f130837d = ew43;
                }
                return 0;
            } else if (intValue == 2) {
                ax4.f130838e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                ax4.f130839f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
