package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.oo2 */
public class C50710oo2 extends C47465a {

    /* renamed from: d */
    public long f139283d;

    /* renamed from: e */
    public long f139284e;

    /* renamed from: f */
    public C51868wr1 f139285f;

    /* renamed from: g */
    public C51887ww2 f139286g;

    /* renamed from: h */
    public C49882ip2 f139287h;

    /* renamed from: i */
    public long f139288i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50710oo2)) {
            return false;
        }
        C50710oo2 oo22 = (C50710oo2) aVar;
        return C46238a.m51546a(Long.valueOf(this.f139283d), Long.valueOf(oo22.f139283d)) && C46238a.m51546a(Long.valueOf(this.f139284e), Long.valueOf(oo22.f139284e)) && C46238a.m51546a(this.f139285f, oo22.f139285f) && C46238a.m51546a(this.f139286g, oo22.f139286g) && C46238a.m51546a(this.f139287h, oo22.f139287h) && C46238a.m51546a(Long.valueOf(this.f139288i), Long.valueOf(oo22.f139288i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f139283d);
            aVar.mo74321h(2, this.f139284e);
            C51868wr1 wr12 = this.f139285f;
            if (wr12 != null) {
                aVar.mo74322i(3, wr12.computeSize());
                this.f139285f.writeFields(aVar);
            }
            C51887ww2 ww22 = this.f139286g;
            if (ww22 != null) {
                aVar.mo74322i(4, ww22.computeSize());
                this.f139286g.writeFields(aVar);
            }
            C49882ip2 ip22 = this.f139287h;
            if (ip22 != null) {
                aVar.mo74322i(5, ip22.computeSize());
                this.f139287h.writeFields(aVar);
            }
            aVar.mo74321h(6, this.f139288i);
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f139283d) + 0 + C52418a.m58681h(2, this.f139284e);
            C51868wr1 wr13 = this.f139285f;
            if (wr13 != null) {
                h += C52418a.m58682i(3, wr13.computeSize());
            }
            C51887ww2 ww23 = this.f139286g;
            if (ww23 != null) {
                h += C52418a.m58682i(4, ww23.computeSize());
            }
            C49882ip2 ip23 = this.f139287h;
            if (ip23 != null) {
                h += C52418a.m58682i(5, ip23.computeSize());
            }
            return h + C52418a.m58681h(6, this.f139288i);
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
            C50710oo2 oo22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    oo22.f139283d = aVar3.mo141631i(intValue);
                    return 0;
                case 2:
                    oo22.f139284e = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C51868wr1 wr14 = new C51868wr1();
                        if (bArr != null && bArr.length > 0) {
                            wr14.parseFrom(bArr);
                        }
                        oo22.f139285f = wr14;
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        C51887ww2 ww24 = new C51887ww2();
                        if (bArr2 != null && bArr2.length > 0) {
                            ww24.parseFrom(bArr2);
                        }
                        oo22.f139286g = ww24;
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        byte[] bArr3 = j3.get(i4);
                        C49882ip2 ip24 = new C49882ip2();
                        if (bArr3 != null && bArr3.length > 0) {
                            ip24.parseFrom(bArr3);
                        }
                        oo22.f139287h = ip24;
                    }
                    return 0;
                case 6:
                    oo22.f139288i = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
