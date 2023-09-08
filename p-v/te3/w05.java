package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class w05 extends C47465a {

    /* renamed from: d */
    public long f143802d;

    /* renamed from: e */
    public long f143803e;

    /* renamed from: f */
    public String f143804f;

    /* renamed from: g */
    public LinkedList<x05> f143805g = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof w05)) {
            return false;
        }
        w05 w05 = (w05) aVar;
        return C46238a.m51546a(Long.valueOf(this.f143802d), Long.valueOf(w05.f143802d)) && C46238a.m51546a(Long.valueOf(this.f143803e), Long.valueOf(w05.f143803e)) && C46238a.m51546a(this.f143804f, w05.f143804f) && C46238a.m51546a(this.f143805g, w05.f143805g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f143804f != null) {
                aVar.mo74321h(1, this.f143802d);
                aVar.mo74321h(2, this.f143803e);
                String str = this.f143804f;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                aVar.mo74320g(4, 8, this.f143805g);
                return 0;
            }
            throw new C52419b("Not all required fields were included: TotalMsg");
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f143802d) + 0 + C52418a.m58681h(2, this.f143803e);
            String str2 = this.f143804f;
            if (str2 != null) {
                h += C52418a.m58683j(3, str2);
            }
            return h + C52418a.m58680g(4, 8, this.f143805g);
        } else if (i == 2) {
            this.f143805g.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f143804f != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: TotalMsg");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            w05 w05 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                w05.f143802d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 2) {
                w05.f143803e = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 3) {
                w05.f143804f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    x05 x05 = new x05();
                    if (bArr != null && bArr.length > 0) {
                        x05.parseFrom(bArr);
                    }
                    w05.f143805g.add(x05);
                }
                return 0;
            }
        }
    }
}
