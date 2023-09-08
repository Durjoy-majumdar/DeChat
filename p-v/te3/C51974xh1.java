package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.xh1 */
public class C51974xh1 extends C47465a {

    /* renamed from: d */
    public long f144649d;

    /* renamed from: e */
    public C64802wh1 f144650e;

    /* renamed from: f */
    public LinkedList<C52117yh1> f144651f = new LinkedList<>();

    /* renamed from: g */
    public LinkedList<C52175yv2> f144652g = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51974xh1)) {
            return false;
        }
        C51974xh1 xh12 = (C51974xh1) aVar;
        return C46238a.m51546a(Long.valueOf(this.f144649d), Long.valueOf(xh12.f144649d)) && C46238a.m51546a(this.f144650e, xh12.f144650e) && C46238a.m51546a(this.f144651f, xh12.f144651f) && C46238a.m51546a(this.f144652g, xh12.f144652g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f144649d);
            C64802wh1 wh12 = this.f144650e;
            if (wh12 != null) {
                aVar.mo74322i(2, wh12.computeSize());
                this.f144650e.writeFields(aVar);
            }
            aVar.mo74320g(3, 8, this.f144651f);
            aVar.mo74320g(4, 8, this.f144652g);
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f144649d) + 0;
            C64802wh1 wh13 = this.f144650e;
            if (wh13 != null) {
                h += C52418a.m58682i(2, wh13.computeSize());
            }
            return h + C52418a.m58680g(3, 8, this.f144651f) + C52418a.m58680g(4, 8, this.f144652g);
        } else if (i == 2) {
            this.f144651f.clear();
            this.f144652g.clear();
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
            C51974xh1 xh12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                xh12.f144649d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C64802wh1 wh14 = new C64802wh1();
                    if (bArr != null && bArr.length > 0) {
                        wh14.parseFrom(bArr);
                    }
                    xh12.f144650e = wh14;
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    C52117yh1 yh12 = new C52117yh1();
                    if (bArr2 != null && bArr2.length > 0) {
                        yh12.parseFrom(bArr2);
                    }
                    xh12.f144651f.add(yh12);
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    byte[] bArr3 = j3.get(i4);
                    C52175yv2 yv22 = new C52175yv2();
                    if (bArr3 != null && bArr3.length > 0) {
                        yv22.parseFrom(bArr3);
                    }
                    xh12.f144652g.add(yv22);
                }
                return 0;
            }
        }
    }
}
