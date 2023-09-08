package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import x14.C102536a;
import z14.C53733a;

public class xb4 extends C47465a {

    /* renamed from: d */
    public long f144576d;

    /* renamed from: e */
    public String f144577e;

    /* renamed from: f */
    public hc4 f144578f;

    /* renamed from: g */
    public int f144579g;

    /* renamed from: h */
    public LinkedList<Integer> f144580h = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof xb4)) {
            return false;
        }
        xb4 xb4 = (xb4) aVar;
        return C46238a.m51546a(Long.valueOf(this.f144576d), Long.valueOf(xb4.f144576d)) && C46238a.m51546a(this.f144577e, xb4.f144577e) && C46238a.m51546a(this.f144578f, xb4.f144578f) && C46238a.m51546a(Integer.valueOf(this.f144579g), Integer.valueOf(xb4.f144579g)) && C46238a.m51546a(this.f144580h, xb4.f144580h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f144576d);
            String str = this.f144577e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            hc4 hc4 = this.f144578f;
            if (hc4 != null) {
                aVar.mo74322i(3, hc4.computeSize());
                this.f144578f.writeFields(aVar);
            }
            aVar.mo74318e(4, this.f144579g);
            aVar.mo74324k(5, 2, this.f144580h);
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f144576d) + 0;
            String str2 = this.f144577e;
            if (str2 != null) {
                h += C52418a.m58683j(2, str2);
            }
            hc4 hc42 = this.f144578f;
            if (hc42 != null) {
                h += C52418a.m58682i(3, hc42.computeSize());
            }
            return h + C52418a.m58678e(4, this.f144579g) + C52418a.m58684k(5, 2, this.f144580h);
        } else if (i == 2) {
            this.f144580h.clear();
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
            xb4 xb4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                xb4.f144576d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 2) {
                xb4.f144577e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    hc4 hc43 = new hc4();
                    if (bArr != null && bArr.length > 0) {
                        hc43.parseFrom(bArr);
                    }
                    xb4.f144578f = hc43;
                }
                return 0;
            } else if (intValue == 4) {
                xb4.f144579g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                byte[] bArr2 = aVar3.mo141626d(intValue).f257327a;
                C102536a aVar4 = new C102536a(bArr2, 0, bArr2.length);
                LinkedList<Integer> linkedList = new LinkedList<>();
                while (aVar4.f301908c < aVar4.f301907b) {
                    linkedList.add(Integer.valueOf(aVar4.mo142153f()));
                }
                xb4.f144580h = linkedList;
                return 0;
            }
        }
    }
}
