package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.jt1 */
public class C50035jt1 extends C47465a {

    /* renamed from: d */
    public long f136315d;

    /* renamed from: e */
    public long f136316e;

    /* renamed from: f */
    public long f136317f;

    /* renamed from: g */
    public LinkedList<C48912bv2> f136318g = new LinkedList<>();

    /* renamed from: h */
    public C49080d14 f136319h;

    /* renamed from: i */
    public long f136320i = 10;

    /* renamed from: j */
    public long f136321j = 0;

    /* renamed from: n */
    public boolean f136322n = false;

    /* renamed from: o */
    public long f136323o = 0;

    /* renamed from: p */
    public long f136324p = 0;

    /* renamed from: q */
    public long f136325q = 0;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50035jt1)) {
            return false;
        }
        C50035jt1 jt12 = (C50035jt1) aVar;
        return C46238a.m51546a(Long.valueOf(this.f136315d), Long.valueOf(jt12.f136315d)) && C46238a.m51546a(Long.valueOf(this.f136316e), Long.valueOf(jt12.f136316e)) && C46238a.m51546a(Long.valueOf(this.f136317f), Long.valueOf(jt12.f136317f)) && C46238a.m51546a(this.f136318g, jt12.f136318g) && C46238a.m51546a(this.f136319h, jt12.f136319h) && C46238a.m51546a(Long.valueOf(this.f136320i), Long.valueOf(jt12.f136320i)) && C46238a.m51546a(Long.valueOf(this.f136321j), Long.valueOf(jt12.f136321j)) && C46238a.m51546a(Boolean.valueOf(this.f136322n), Boolean.valueOf(jt12.f136322n)) && C46238a.m51546a(Long.valueOf(this.f136323o), Long.valueOf(jt12.f136323o)) && C46238a.m51546a(Long.valueOf(this.f136324p), Long.valueOf(jt12.f136324p)) && C46238a.m51546a(Long.valueOf(this.f136325q), Long.valueOf(jt12.f136325q));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f136315d);
            aVar.mo74321h(2, this.f136316e);
            aVar.mo74321h(3, this.f136317f);
            aVar.mo74320g(4, 8, this.f136318g);
            C49080d14 d142 = this.f136319h;
            if (d142 != null) {
                aVar.mo74322i(5, d142.computeSize());
                this.f136319h.writeFields(aVar);
            }
            aVar.mo74321h(6, this.f136320i);
            aVar.mo74321h(7, this.f136321j);
            aVar.mo74314a(8, this.f136322n);
            aVar.mo74321h(9, this.f136323o);
            aVar.mo74321h(10, this.f136324p);
            aVar.mo74321h(11, this.f136325q);
            return 0;
        } else if (i2 == 1) {
            int h = C52418a.m58681h(1, this.f136315d) + 0 + C52418a.m58681h(2, this.f136316e) + C52418a.m58681h(3, this.f136317f) + C52418a.m58680g(4, 8, this.f136318g);
            C49080d14 d143 = this.f136319h;
            if (d143 != null) {
                h += C52418a.m58682i(5, d143.computeSize());
            }
            return h + C52418a.m58681h(6, this.f136320i) + C52418a.m58681h(7, this.f136321j) + C52418a.m58674a(8, this.f136322n) + C52418a.m58681h(9, this.f136323o) + C52418a.m58681h(10, this.f136324p) + C52418a.m58681h(11, this.f136325q);
        } else if (i2 == 2) {
            this.f136318g.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C50035jt1 jt12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    jt12.f136315d = aVar3.mo141631i(intValue);
                    return 0;
                case 2:
                    jt12.f136316e = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    jt12.f136317f = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C48912bv2 bv22 = new C48912bv2();
                        if (bArr != null && bArr.length > 0) {
                            bv22.parseFrom(bArr);
                        }
                        jt12.f136318g.add(bv22);
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C49080d14 d144 = new C49080d14();
                        if (bArr2 != null && bArr2.length > 0) {
                            d144.parseFrom(bArr2);
                        }
                        jt12.f136319h = d144;
                    }
                    return 0;
                case 6:
                    jt12.f136320i = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    jt12.f136321j = aVar3.mo141631i(intValue);
                    return 0;
                case 8:
                    jt12.f136322n = aVar3.mo141625c(intValue);
                    return 0;
                case 9:
                    jt12.f136323o = aVar3.mo141631i(intValue);
                    return 0;
                case 10:
                    jt12.f136324p = aVar3.mo141631i(intValue);
                    return 0;
                case 11:
                    jt12.f136325q = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
