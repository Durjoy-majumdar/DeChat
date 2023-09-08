package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class yf4 extends C47465a {

    /* renamed from: d */
    public u35 f145261d;

    /* renamed from: e */
    public long f145262e;

    /* renamed from: f */
    public long f145263f;

    /* renamed from: g */
    public String f145264g;

    /* renamed from: h */
    public long f145265h;

    /* renamed from: i */
    public long f145266i;

    /* renamed from: j */
    public long f145267j;

    /* renamed from: n */
    public long f145268n;

    /* renamed from: o */
    public LinkedList<C89349b> f145269o = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof yf4)) {
            return false;
        }
        yf4 yf4 = (yf4) aVar;
        return C46238a.m51546a(this.f145261d, yf4.f145261d) && C46238a.m51546a(Long.valueOf(this.f145262e), Long.valueOf(yf4.f145262e)) && C46238a.m51546a(Long.valueOf(this.f145263f), Long.valueOf(yf4.f145263f)) && C46238a.m51546a(this.f145264g, yf4.f145264g) && C46238a.m51546a(Long.valueOf(this.f145265h), Long.valueOf(yf4.f145265h)) && C46238a.m51546a(Long.valueOf(this.f145266i), Long.valueOf(yf4.f145266i)) && C46238a.m51546a(Long.valueOf(this.f145267j), Long.valueOf(yf4.f145267j)) && C46238a.m51546a(Long.valueOf(this.f145268n), Long.valueOf(yf4.f145268n)) && C46238a.m51546a(this.f145269o, yf4.f145269o);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            u35 u35 = this.f145261d;
            if (u35 != null) {
                aVar.mo74322i(1, u35.computeSize());
                this.f145261d.writeFields(aVar);
            }
            aVar.mo74321h(2, this.f145262e);
            aVar.mo74321h(3, this.f145263f);
            String str = this.f145264g;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            aVar.mo74321h(5, this.f145265h);
            aVar.mo74321h(6, this.f145266i);
            aVar.mo74321h(7, this.f145267j);
            aVar.mo74321h(8, this.f145268n);
            aVar.mo74320g(9, 6, this.f145269o);
            return 0;
        } else if (i == 1) {
            u35 u352 = this.f145261d;
            if (u352 != null) {
                i2 = 0 + C52418a.m58682i(1, u352.computeSize());
            }
            int h = i2 + C52418a.m58681h(2, this.f145262e) + C52418a.m58681h(3, this.f145263f);
            String str2 = this.f145264g;
            if (str2 != null) {
                h += C52418a.m58683j(4, str2);
            }
            return h + C52418a.m58681h(5, this.f145265h) + C52418a.m58681h(6, this.f145266i) + C52418a.m58681h(7, this.f145267j) + C52418a.m58681h(8, this.f145268n) + C52418a.m58680g(9, 6, this.f145269o);
        } else if (i == 2) {
            this.f145269o.clear();
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
            yf4 yf4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        u35 u353 = new u35();
                        if (bArr != null && bArr.length > 0) {
                            u353.parseFrom(bArr);
                        }
                        yf4.f145261d = u353;
                    }
                    return 0;
                case 2:
                    yf4.f145262e = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    yf4.f145263f = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    yf4.f145264g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    yf4.f145265h = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    yf4.f145266i = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    yf4.f145267j = aVar3.mo141631i(intValue);
                    return 0;
                case 8:
                    yf4.f145268n = aVar3.mo141631i(intValue);
                    return 0;
                case 9:
                    yf4.f145269o.add(aVar3.mo141626d(intValue));
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
