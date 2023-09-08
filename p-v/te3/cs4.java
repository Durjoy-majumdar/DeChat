package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class cs4 extends C47465a {

    /* renamed from: d */
    public long f131932d;

    /* renamed from: e */
    public C64645q23 f131933e;

    /* renamed from: f */
    public LinkedList<yf4> f131934f = new LinkedList<>();

    /* renamed from: g */
    public LinkedList<C50504n70> f131935g = new LinkedList<>();

    /* renamed from: h */
    public LinkedList<C49053cv2> f131936h = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof cs4)) {
            return false;
        }
        cs4 cs4 = (cs4) aVar;
        return C46238a.m51546a(Long.valueOf(this.f131932d), Long.valueOf(cs4.f131932d)) && C46238a.m51546a(this.f131933e, cs4.f131933e) && C46238a.m51546a(this.f131934f, cs4.f131934f) && C46238a.m51546a(this.f131935g, cs4.f131935g) && C46238a.m51546a(this.f131936h, cs4.f131936h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f131932d);
            C64645q23 q232 = this.f131933e;
            if (q232 != null) {
                aVar.mo74322i(2, q232.computeSize());
                this.f131933e.writeFields(aVar);
            }
            aVar.mo74320g(3, 8, this.f131934f);
            aVar.mo74320g(4, 8, this.f131935g);
            aVar.mo74320g(5, 8, this.f131936h);
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f131932d) + 0;
            C64645q23 q233 = this.f131933e;
            if (q233 != null) {
                h += C52418a.m58682i(2, q233.computeSize());
            }
            return h + C52418a.m58680g(3, 8, this.f131934f) + C52418a.m58680g(4, 8, this.f131935g) + C52418a.m58680g(5, 8, this.f131936h);
        } else if (i == 2) {
            this.f131934f.clear();
            this.f131935g.clear();
            this.f131936h.clear();
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
            cs4 cs4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                cs4.f131932d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C64645q23 q234 = new C64645q23();
                    if (bArr != null && bArr.length > 0) {
                        q234.parseFrom(bArr);
                    }
                    cs4.f131933e = q234;
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    yf4 yf4 = new yf4();
                    if (bArr2 != null && bArr2.length > 0) {
                        yf4.parseFrom(bArr2);
                    }
                    cs4.f131934f.add(yf4);
                }
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    byte[] bArr3 = j3.get(i4);
                    C50504n70 n702 = new C50504n70();
                    if (bArr3 != null && bArr3.length > 0) {
                        n702.parseFrom(bArr3);
                    }
                    cs4.f131935g.add(n702);
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                int size4 = j4.size();
                for (int i5 = 0; i5 < size4; i5++) {
                    byte[] bArr4 = j4.get(i5);
                    C49053cv2 cv22 = new C49053cv2();
                    if (bArr4 != null && bArr4.length > 0) {
                        cv22.parseFrom(bArr4);
                    }
                    cs4.f131936h.add(cv22);
                }
                return 0;
            }
        }
    }
}
